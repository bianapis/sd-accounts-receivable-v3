package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerNegotiationInitiateInputModel
 */
public class BQCustomerNegotiationInitiateInputModel   {
  private String accountsReceivableProcedureInstanceReference = null;

  private Object customerNegotiationInitiateActionRecord = null;

  private String resolutionPreconditions = null;

  private String resolutionBusinessUnitEmployeeReference = null;

  private String resolutionWorkSchedule = null;

  private String businessService = null;

  private String resolutionPostconditions = null;

  private String resolutionServiceType = null;

  private String resolutionServiceDescription = null;

  private String resolutionServiceInputsandOuputs = null;

  private String resolutionServiceWorkProduct = null;

  private String resolutionServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Accounts Receivable Procedure instance 
   * @return accountsReceivableProcedureInstanceReference
  **/

  public String getAccountsReceivableProcedureInstanceReference() {
    return accountsReceivableProcedureInstanceReference;
  }

  public void setAccountsReceivableProcedureInstanceReference(String accountsReceivableProcedureInstanceReference) {
    this.accountsReceivableProcedureInstanceReference = accountsReceivableProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerNegotiationInitiateActionRecord
  **/

  public Object getCustomerNegotiationInitiateActionRecord() {
    return customerNegotiationInitiateActionRecord;
  }

  public void setCustomerNegotiationInitiateActionRecord(Object customerNegotiationInitiateActionRecord) {
    this.customerNegotiationInitiateActionRecord = customerNegotiationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return resolutionPreconditions
  **/

  public String getResolutionPreconditions() {
    return resolutionPreconditions;
  }

  public void setResolutionPreconditions(String resolutionPreconditions) {
    this.resolutionPreconditions = resolutionPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return resolutionBusinessUnitEmployeeReference
  **/

  public String getResolutionBusinessUnitEmployeeReference() {
    return resolutionBusinessUnitEmployeeReference;
  }

  public void setResolutionBusinessUnitEmployeeReference(String resolutionBusinessUnitEmployeeReference) {
    this.resolutionBusinessUnitEmployeeReference = resolutionBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return resolutionWorkSchedule
  **/

  public String getResolutionWorkSchedule() {
    return resolutionWorkSchedule;
  }

  public void setResolutionWorkSchedule(String resolutionWorkSchedule) {
    this.resolutionWorkSchedule = resolutionWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Accounts Receivable Procedure specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return resolutionPostconditions
  **/

  public String getResolutionPostconditions() {
    return resolutionPostconditions;
  }

  public void setResolutionPostconditions(String resolutionPostconditions) {
    this.resolutionPostconditions = resolutionPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return resolutionServiceType
  **/

  public String getResolutionServiceType() {
    return resolutionServiceType;
  }

  public void setResolutionServiceType(String resolutionServiceType) {
    this.resolutionServiceType = resolutionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return resolutionServiceDescription
  **/

  public String getResolutionServiceDescription() {
    return resolutionServiceDescription;
  }

  public void setResolutionServiceDescription(String resolutionServiceDescription) {
    this.resolutionServiceDescription = resolutionServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return resolutionServiceInputsandOuputs
  **/

  public String getResolutionServiceInputsandOuputs() {
    return resolutionServiceInputsandOuputs;
  }

  public void setResolutionServiceInputsandOuputs(String resolutionServiceInputsandOuputs) {
    this.resolutionServiceInputsandOuputs = resolutionServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return resolutionServiceWorkProduct
  **/

  public String getResolutionServiceWorkProduct() {
    return resolutionServiceWorkProduct;
  }

  public void setResolutionServiceWorkProduct(String resolutionServiceWorkProduct) {
    this.resolutionServiceWorkProduct = resolutionServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return resolutionServiceName
  **/

  public String getResolutionServiceName() {
    return resolutionServiceName;
  }

  public void setResolutionServiceName(String resolutionServiceName) {
    this.resolutionServiceName = resolutionServiceName;
  }


}

