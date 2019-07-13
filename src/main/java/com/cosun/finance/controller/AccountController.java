package com.cosun.finance.controller;

import com.cosun.finance.bean.DownloadView;
import com.cosun.finance.bean.UserInfo;
import com.cosun.finance.service.IUserInfoServ;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/account")
public class AccountController {
    /**
     * @author:homey Wong
     * @date:2018.12.19
     */


    @Autowired
    private IUserInfoServ userInfoServ;

    private static final String INDEX = "index";
    private static Logger logger = LogManager.getLogger(AccountController.class);

    @ResponseBody
    @RequestMapping(value = "/tologin")
    public ModelAndView toLoginPage(HttpServletRequest request) throws Exception {
        try {
            HttpSession session = request.getSession();
            ModelAndView mav = new ModelAndView(INDEX);
            DownloadView downloadView = new DownloadView();
            downloadView.setFlag("true");
            mav.addObject("view", downloadView);
            return mav;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
            throw e;
        }
    }


    @ResponseBody
    @RequestMapping(value = "/login")
    public ModelAndView login(@ModelAttribute(value = "view") DownloadView view, HttpSession session) throws
            Exception {
        ModelAndView mav;
        try {
            UserInfo userInfo = userInfoServ.findUserByUserNameandPassword(view.getUserName(), view.getPassword());
            if (userInfo != null && userInfo.getUserName() != null && userInfo.getState() == 1) {
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                userInfoServ.updateUserInfoLoginTime(userInfo.getuId(), df.format(new Date()).toString());
                session.setAttribute("account", userInfo);
                view.setFullName(userInfo.getFullName());
                session.setAttribute("view", view);
                mav = new ModelAndView("mainindex");
                session.setAttribute("username", userInfo.getUserName());
                session.setAttribute("password", userInfo.getUserPwd());
                mav.addObject("view", view);
                mav.addObject("userInfo", userInfo);
                mav.addObject("showflaga", 0);
                return mav;
            } else if (userInfo != null && userInfo.getState() != 1) {
                mav = new ModelAndView(INDEX);
                view.setUserName(userInfo.getUserName());
                view.setFlag(userInfo.getState().toString());
                mav.addObject("view", view);
                mav.addObject("userInfo", userInfo);
                return mav;
            }
            mav = new ModelAndView(INDEX);
            view.setUserName(null);
            view.setPassword(null);
            view.setFlag("false");
            mav.addObject("userInfo", userInfo);
            mav.addObject("view", view);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
            throw e;
        }
        return mav;

    }


    @GetMapping("/logout")
    public ModelAndView logout(HttpSession session) throws Exception {
        ModelAndView view = new ModelAndView(INDEX);
        try {
            // 移除session
            session.removeAttribute("account");
            DownloadView downloadView = new DownloadView();
            downloadView.setFlag("true");
            view.addObject("view", downloadView);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
            throw e;
        }
        return view;
    }

    @GetMapping("/toMainPage")
    public ModelAndView toMainPage(HttpSession session) throws Exception {
        try {
            ModelAndView view = new ModelAndView("mainindex");
            DownloadView v = new DownloadView();
            UserInfo userInfo = (UserInfo) session.getAttribute("account");
            v.setFullName(userInfo.getFullName());
            view.addObject("showflaga", 0);
            if (userInfo == null) {
                view = new ModelAndView(INDEX);
            }
            view.addObject("view", v);
            view.addObject("menuList", null);
            view.addObject("userInfo", userInfo);
            return view;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
            throw e;
        }

    }


}
