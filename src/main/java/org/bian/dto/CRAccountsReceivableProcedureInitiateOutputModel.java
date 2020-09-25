package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountsReceivableProcedureInitiateOutputModel
 */
public class CRAccountsReceivableProcedureInitiateOutputModel   {
  private String accountsReceivableProcedureInstanceReference = null;

  private String accountsReceivableProcedureInitiateActionReference = null;

  private Object accountsReceivableProcedureInitiateActionRecord = null;

  private String accountsReceivableProcedureInstanceStatus = null;

  private String accountsReceivableProcedureParameterType = null;

  private String accountsReceivableProcedureSelectedOption = null;

  private String accountsReceivableProcedureRequest = null;

  private String accountsReceivableProcedureSchedule = null;

  private String accountsReceivableProcedureStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Accounts Receivable Procedure instance 
   * @return accountsReceivableProcedureInstanceReference
  **/

  public String getAccountsReceivableProcedureInstanceReference() {
    return accountsReceivableProcedureInstanceReference;
  }

  public void setAccountsReceivableProcedureInstanceReference(String accountsReceivableProcedureInstanceReference) {
    this.accountsReceivableProcedureInstanceReference = accountsReceivableProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return accountsReceivableProcedureInitiateActionReference
  **/

  public String getAccountsReceivableProcedureInitiateActionReference() {
    return accountsReceivableProcedureInitiateActionReference;
  }

  public void setAccountsReceivableProcedureInitiateActionReference(String accountsReceivableProcedureInitiateActionReference) {
    this.accountsReceivableProcedureInitiateActionReference = accountsReceivableProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return accountsReceivableProcedureInitiateActionRecord
  **/

  public Object getAccountsReceivableProcedureInitiateActionRecord() {
    return accountsReceivableProcedureInitiateActionRecord;
  }

  public void setAccountsReceivableProcedureInitiateActionRecord(Object accountsReceivableProcedureInitiateActionRecord) {
    this.accountsReceivableProcedureInitiateActionRecord = accountsReceivableProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Accounts Receivable Procedure instance (e.g. initialised, pending, active) 
   * @return accountsReceivableProcedureInstanceStatus
  **/

  public String getAccountsReceivableProcedureInstanceStatus() {
    return accountsReceivableProcedureInstanceStatus;
  }

  public void setAccountsReceivableProcedureInstanceStatus(String accountsReceivableProcedureInstanceStatus) {
    this.accountsReceivableProcedureInstanceStatus = accountsReceivableProcedureInstanceStatus;
  }


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


}

