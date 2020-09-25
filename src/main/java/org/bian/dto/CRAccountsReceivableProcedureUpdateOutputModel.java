package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountsReceivableProcedureUpdateOutputModel
 */
public class CRAccountsReceivableProcedureUpdateOutputModel   {
  private String accountsReceivableProcedureParameterType = null;

  private String accountsReceivableProcedureSelectedOption = null;

  private String accountsReceivableProcedureRequest = null;

  private String accountsReceivableProcedureSchedule = null;

  private String accountsReceivableProcedureStatus = null;

  private String accountsReceivableProcedureUpdateActionTaskReference = null;

  private Object accountsReceivableProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Accounts Receivable Procedure 
   * @return accountsReceivableProcedureParameterType
  **/

  public String getAccountsReceivableProcedureParameterType() {
    return accountsReceivableProcedureParameterType;
  }

  public void setAccountsReceivableProcedureParameterType(String accountsReceivableProcedureParameterType) {
    this.accountsReceivableProcedureParameterType = accountsReceivableProcedureParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Accounts Receivable Procedure 
   * @return accountsReceivableProcedureSelectedOption
  **/

  public String getAccountsReceivableProcedureSelectedOption() {
    return accountsReceivableProcedureSelectedOption;
  }

  public void setAccountsReceivableProcedureSelectedOption(String accountsReceivableProcedureSelectedOption) {
    this.accountsReceivableProcedureSelectedOption = accountsReceivableProcedureSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to process AccountsReceivable 
   * @return accountsReceivableProcedureRequest
  **/

  public String getAccountsReceivableProcedureRequest() {
    return accountsReceivableProcedureRequest;
  }

  public void setAccountsReceivableProcedureRequest(String accountsReceivableProcedureRequest) {
    this.accountsReceivableProcedureRequest = accountsReceivableProcedureRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to process AccountsReceivable 
   * @return accountsReceivableProcedureSchedule
  **/

  public String getAccountsReceivableProcedureSchedule() {
    return accountsReceivableProcedureSchedule;
  }

  public void setAccountsReceivableProcedureSchedule(String accountsReceivableProcedureSchedule) {
    this.accountsReceivableProcedureSchedule = accountsReceivableProcedureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Accounts Receivable Procedure 
   * @return accountsReceivableProcedureStatus
  **/

  public String getAccountsReceivableProcedureStatus() {
    return accountsReceivableProcedureStatus;
  }

  public void setAccountsReceivableProcedureStatus(String accountsReceivableProcedureStatus) {
    this.accountsReceivableProcedureStatus = accountsReceivableProcedureStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return accountsReceivableProcedureUpdateActionTaskReference
  **/

  public String getAccountsReceivableProcedureUpdateActionTaskReference() {
    return accountsReceivableProcedureUpdateActionTaskReference;
  }

  public void setAccountsReceivableProcedureUpdateActionTaskReference(String accountsReceivableProcedureUpdateActionTaskReference) {
    this.accountsReceivableProcedureUpdateActionTaskReference = accountsReceivableProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountsReceivableProcedureUpdateActionTaskRecord
  **/

  public Object getAccountsReceivableProcedureUpdateActionTaskRecord() {
    return accountsReceivableProcedureUpdateActionTaskRecord;
  }

  public void setAccountsReceivableProcedureUpdateActionTaskRecord(Object accountsReceivableProcedureUpdateActionTaskRecord) {
    this.accountsReceivableProcedureUpdateActionTaskRecord = accountsReceivableProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

