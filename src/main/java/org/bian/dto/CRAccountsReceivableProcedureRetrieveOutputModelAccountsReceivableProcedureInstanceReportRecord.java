package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceReportRecord
 */
public class CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceReportRecord   {
  private String accountsReceivableProcedureInstanceReportData = null;

  private String accountsReceivableProcedureInstanceReportType = null;

  private Object accountsReceivableProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return accountsReceivableProcedureInstanceReportData
  **/

  public String getAccountsReceivableProcedureInstanceReportData() {
    return accountsReceivableProcedureInstanceReportData;
  }

  public void setAccountsReceivableProcedureInstanceReportData(String accountsReceivableProcedureInstanceReportData) {
    this.accountsReceivableProcedureInstanceReportData = accountsReceivableProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return accountsReceivableProcedureInstanceReportType
  **/

  public String getAccountsReceivableProcedureInstanceReportType() {
    return accountsReceivableProcedureInstanceReportType;
  }

  public void setAccountsReceivableProcedureInstanceReportType(String accountsReceivableProcedureInstanceReportType) {
    this.accountsReceivableProcedureInstanceReportType = accountsReceivableProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return accountsReceivableProcedureInstanceReport
  **/

  public Object getAccountsReceivableProcedureInstanceReport() {
    return accountsReceivableProcedureInstanceReport;
  }

  public void setAccountsReceivableProcedureInstanceReport(Object accountsReceivableProcedureInstanceReport) {
    this.accountsReceivableProcedureInstanceReport = accountsReceivableProcedureInstanceReport;
  }


}

