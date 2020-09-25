package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceAnalysis;
import org.bian.dto.BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBQCustomerNegotiationRetrieveInputModel
 */
public class BQBQCustomerNegotiationRetrieveInputModel   {
  private Object bQCustomerNegotiationRetrieveActionTaskRecord = null;

  private String bQCustomerNegotiationRetrieveActionRequest = null;

  private BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceReport bQCustomerNegotiationInstanceReport = null;

  private BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceAnalysis bQCustomerNegotiationInstanceAnalysis = null;

  private String paymentPreconditions = null;

  private String paymentBusinessUnitEmployeeReference = null;

  private String paymentWorkSchedule = null;

  private String businessService = null;

  private String paymentPostconditions = null;

  private String paymentServiceType = null;

  private String paymentServiceDescription = null;

  private String paymentServiceInputsandOuputs = null;

  private String paymentServiceWorkProduct = null;

  private String paymentServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return bQCustomerNegotiationRetrieveActionTaskRecord
  **/

  public Object getBQCustomerNegotiationRetrieveActionTaskRecord() {
    return bQCustomerNegotiationRetrieveActionTaskRecord;
  }

  public void setBQCustomerNegotiationRetrieveActionTaskRecord(Object bQCustomerNegotiationRetrieveActionTaskRecord) {
    this.bQCustomerNegotiationRetrieveActionTaskRecord = bQCustomerNegotiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return bQCustomerNegotiationRetrieveActionRequest
  **/

  public String getBQCustomerNegotiationRetrieveActionRequest() {
    return bQCustomerNegotiationRetrieveActionRequest;
  }

  public void setBQCustomerNegotiationRetrieveActionRequest(String bQCustomerNegotiationRetrieveActionRequest) {
    this.bQCustomerNegotiationRetrieveActionRequest = bQCustomerNegotiationRetrieveActionRequest;
  }


  /**
   * Get bQCustomerNegotiationInstanceReport
   * @return bQCustomerNegotiationInstanceReport
  **/

  public BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceReport getBQCustomerNegotiationInstanceReport() {
    return bQCustomerNegotiationInstanceReport;
  }

  public void setBQCustomerNegotiationInstanceReport(BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceReport bQCustomerNegotiationInstanceReport) {
    this.bQCustomerNegotiationInstanceReport = bQCustomerNegotiationInstanceReport;
  }


  /**
   * Get bQCustomerNegotiationInstanceAnalysis
   * @return bQCustomerNegotiationInstanceAnalysis
  **/

  public BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceAnalysis getBQCustomerNegotiationInstanceAnalysis() {
    return bQCustomerNegotiationInstanceAnalysis;
  }

  public void setBQCustomerNegotiationInstanceAnalysis(BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceAnalysis bQCustomerNegotiationInstanceAnalysis) {
    this.bQCustomerNegotiationInstanceAnalysis = bQCustomerNegotiationInstanceAnalysis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return paymentPreconditions
  **/

  public String getPaymentPreconditions() {
    return paymentPreconditions;
  }

  public void setPaymentPreconditions(String paymentPreconditions) {
    this.paymentPreconditions = paymentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return paymentBusinessUnitEmployeeReference
  **/

  public String getPaymentBusinessUnitEmployeeReference() {
    return paymentBusinessUnitEmployeeReference;
  }

  public void setPaymentBusinessUnitEmployeeReference(String paymentBusinessUnitEmployeeReference) {
    this.paymentBusinessUnitEmployeeReference = paymentBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return paymentWorkSchedule
  **/

  public String getPaymentWorkSchedule() {
    return paymentWorkSchedule;
  }

  public void setPaymentWorkSchedule(String paymentWorkSchedule) {
    this.paymentWorkSchedule = paymentWorkSchedule;
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
   * @return paymentPostconditions
  **/

  public String getPaymentPostconditions() {
    return paymentPostconditions;
  }

  public void setPaymentPostconditions(String paymentPostconditions) {
    this.paymentPostconditions = paymentPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return paymentServiceType
  **/

  public String getPaymentServiceType() {
    return paymentServiceType;
  }

  public void setPaymentServiceType(String paymentServiceType) {
    this.paymentServiceType = paymentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return paymentServiceDescription
  **/

  public String getPaymentServiceDescription() {
    return paymentServiceDescription;
  }

  public void setPaymentServiceDescription(String paymentServiceDescription) {
    this.paymentServiceDescription = paymentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return paymentServiceInputsandOuputs
  **/

  public String getPaymentServiceInputsandOuputs() {
    return paymentServiceInputsandOuputs;
  }

  public void setPaymentServiceInputsandOuputs(String paymentServiceInputsandOuputs) {
    this.paymentServiceInputsandOuputs = paymentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return paymentServiceWorkProduct
  **/

  public String getPaymentServiceWorkProduct() {
    return paymentServiceWorkProduct;
  }

  public void setPaymentServiceWorkProduct(String paymentServiceWorkProduct) {
    this.paymentServiceWorkProduct = paymentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return paymentServiceName
  **/

  public String getPaymentServiceName() {
    return paymentServiceName;
  }

  public void setPaymentServiceName(String paymentServiceName) {
    this.paymentServiceName = paymentServiceName;
  }


}

