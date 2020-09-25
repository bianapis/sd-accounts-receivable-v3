package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceAnalysis
 */
public class CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceAnalysis   {
  private String accountsReceivableProcedureInstanceAnalysisData = null;

  private String accountsReceivableProcedureInstanceAnalysisReportType = null;

  private Object accountsReceivableProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return accountsReceivableProcedureInstanceAnalysisData
  **/

  public String getAccountsReceivableProcedureInstanceAnalysisData() {
    return accountsReceivableProcedureInstanceAnalysisData;
  }

  public void setAccountsReceivableProcedureInstanceAnalysisData(String accountsReceivableProcedureInstanceAnalysisData) {
    this.accountsReceivableProcedureInstanceAnalysisData = accountsReceivableProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return accountsReceivableProcedureInstanceAnalysisReportType
  **/

  public String getAccountsReceivableProcedureInstanceAnalysisReportType() {
    return accountsReceivableProcedureInstanceAnalysisReportType;
  }

  public void setAccountsReceivableProcedureInstanceAnalysisReportType(String accountsReceivableProcedureInstanceAnalysisReportType) {
    this.accountsReceivableProcedureInstanceAnalysisReportType = accountsReceivableProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return accountsReceivableProcedureInstanceAnalysisReport
  **/

  public Object getAccountsReceivableProcedureInstanceAnalysisReport() {
    return accountsReceivableProcedureInstanceAnalysisReport;
  }

  public void setAccountsReceivableProcedureInstanceAnalysisReport(Object accountsReceivableProcedureInstanceAnalysisReport) {
    this.accountsReceivableProcedureInstanceAnalysisReport = accountsReceivableProcedureInstanceAnalysisReport;
  }


}

