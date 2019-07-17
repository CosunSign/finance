package com.cosun.finance.service;

import com.cosun.finance.bean.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IFinanceServ {

    List<Salary> translateExcelToBean(MultipartFile file1) throws Exception;

    List<SalaryDataOutPut> querySalaryDataOutPutByCondition(Employee employee) throws Exception;

    int querySalaryDataOutPutByConditionCount(Employee employee) throws Exception;

    void saveAllSalaryData(List<Salary> salaryList) throws Exception;

    List<HistorySalary> getHistorySalaryRecordByNameAndEmpNo(Salary salary) throws Exception;

    void addSalaryByBean(Salary salary) throws Exception;

    void deleteEmpSalaryByBatch(Employee employee) throws Exception;

    void deleteEmpHoursByBatch(Employee employee) throws Exception;

    List<EmpHours> translateExcelToBeanEmpHours(MultipartFile file1, String yearMonth) throws Exception;

    void saveAllEmpHours(List<EmpHours> empHoursList, String yearMonth) throws Exception;

    List<EmpHours> findAllEmpHours(Employee employee) throws Exception;

    List<FinanceImportData> findAllFinanceImportData(Employee employee) throws Exception;

    void deleteFinanceImportDataById(Integer id) throws Exception;

    void updateFinanceImportDataByBean(FinanceImportData financeImportData) throws Exception;

    List<SalaryDataOutPut> computeSalaryData(String yearMonth) throws Exception;

    void saveSalaryDataOutPutsList(List<SalaryDataOutPut> salaryDataOutPutList, String yearMonth) throws Exception;

    void addFinanceImportDataByBean(FinanceImportData financeImportData) throws Exception;

    List<FinanceImportData> queryFinanceImportDataByCondition(Employee employee) throws Exception;

    int queryFinanceImportDataByConditionCount(Employee employee) throws Exception;

    int findAllFinanceImportDataCount() throws Exception;

    List<SalaryDataOutPut> findAllSalaryDataOutPut(Employee employee) throws Exception;

    int findAllSalaryDataOutPutCount() throws Exception;

    void deleteFinanceImportDataByBatch(Employee employee) throws Exception;

    void updateEmpHoursByBean(EmpHours empHours) throws Exception;

    int findAllEmpHoursHours() throws Exception;

    FinanceSetUpData findFinanceSetUpData() throws Exception;

    void saveFinanceSetUp(FinanceSetUpData financeSetUpData) throws Exception;

    void addEmpHoursByBean(EmpHours empHours) throws Exception;

    int checkEmpNoandYearMonthIsExsit(EmpHours empHours) throws Exception;

    int checkFIEmpNoandYearMonthIsExsit(EmpHours empHours) throws Exception;


    int checkFinanceImportNoandYearMonthIsExsit(EmpHours empHours) throws Exception;

    List<EmpHours> queryEmployeeHoursByCondition(Employee employee) throws Exception;

    Salary getEmployeeBySalaryId(Integer salaryId) throws Exception;

    int checkEmployNoAndNameIsExsit(String empNo,String name) throws Exception;

    Salary getEmployeeBySalaryId2(Integer salaryId) throws Exception;

    int queryEmployeeHoursByConditionCount(Employee employee) throws Exception;

    List<EmpHours> getEmpHoursByNameAndYearMonth(String name,String yearMonth) throws Exception;

    void deleteEmployeeHoursByEmpno(Integer id) throws Exception;

    EmpHours getEmpHoursByEmpNo(Integer id) throws Exception;

    FinanceImportData getFinanceImportDataById(Integer id) throws Exception;

    void saveAllFinanceImportData(List<FinanceImportData> financeImportDataList, String yearMonth) throws Exception;

    List<FinanceImportData> translateExcelToBeanFinanceImportData(MultipartFile file1, String yearMonth) throws Exception;

    List<Dept> findAllDeptAll() throws Exception;

    List<Dept> findAllDeptAll2() throws Exception;

    void updateSalaryByBean(Salary salary) throws Exception;

//    List<Salary> getSalarybyId() throws Exception;

    int checkEmployNoIsExsit(String empNo) throws Exception;

    List<Employee> findAllEmployeeAll() throws Exception;

    Salary getSalaryByEmpNo(String empNo,String name) throws Exception;

    List<Employee> findAllEmployeeFinance(Employee employee) throws Exception;

    List<Salary> findAllEmployeeFinanceA(Employee employee) throws Exception;

    int findAllEmployeeCount() throws Exception;

    void deleteEmployeeSalaryByEmpno(Integer id) throws Exception;

    List<Salary> queryEmployeeSalaryByCondition(Employee employee) throws Exception;

    int queryEmployeeSalaryByConditionCount(Employee employee) throws Exception;
}
