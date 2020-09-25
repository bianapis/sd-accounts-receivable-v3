package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceAnalysis;
import org.bian.dto.CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRAccountsReceivableProcedureRetrieveInputModel
 */
public class CRAccountsReceivableProcedureRetrieveInputModel   {
  private Object accountsReceivableProcedureRetrieveActionTaskRecord = null;

  private String accountsReceivableProcedureRetrieveActionRequest = null;

  private CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceReportRecord accountsReceivableProcedureInstanceReportRecord = null;

  private CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceAnalysis accountsReceivableProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountsReceivableProcedureRetrieveActionTaskRecord
  **/

  public Object getAccountsReceivableProcedureRetrieveActionTaskRecord() {
    return accountsReceivableProcedureRetrieveActionTaskRecord;
  }

  public void setAccountsReceivableProcedureRetrieveActionTaskRecord(Object accountsReceivableProcedureRetrieveActionTaskRecord) {
    this.accountsReceivableProcedureRetrieveActionTaskRecord = accountsReceivableProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return accountsReceivableProcedureRetrieveActionRequest
  **/

  public String getAccountsReceivableProcedureRetrieveActionRequest() {
    return accountsReceivableProcedureRetrieveActionRequest;
  }

  public void setAccountsReceivableProcedureRetrieveActionRequest(String accountsReceivableProcedureRetrieveActionRequest) {
    this.accountsReceivableProcedureRetrieveActionRequest = accountsReceivableProcedureRetrieveActionRequest;
  }


  /**
   * Get accountsReceivableProcedureInstanceReportRecord
   * @return accountsReceivableProcedureInstanceReportRecord
  **/

  public CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceReportRecord getAccountsReceivableProcedureInstanceReportRecord() {
    return accountsReceivableProcedureInstanceReportRecord;
  }

  public void setAccountsReceivableProcedureInstanceReportRecord(CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceReportRecord accountsReceivableProcedureInstanceReportRecord) {
    this.accountsReceivableProcedureInstanceReportRecord = accountsReceivableProcedureInstanceReportRecord;
  }


  /**
   * Get accountsReceivableProcedureInstanceAnalysis
   * @return accountsReceivableProcedureInstanceAnalysis
  **/

  public CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceAnalysis getAccountsReceivableProcedureInstanceAnalysis() {
    return accountsReceivableProcedureInstanceAnalysis;
  }

  public void setAccountsReceivableProcedureInstanceAnalysis(CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceAnalysis accountsReceivableProcedureInstanceAnalysis) {
    this.accountsReceivableProcedureInstanceAnalysis = accountsReceivableProcedureInstanceAnalysis;
  }


}

