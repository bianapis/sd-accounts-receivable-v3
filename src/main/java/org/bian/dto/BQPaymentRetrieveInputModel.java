package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentRetrieveInputModelPaymentInstanceAnalysis;
import org.bian.dto.BQPaymentRetrieveInputModelPaymentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentRetrieveInputModel
 */
public class BQPaymentRetrieveInputModel   {
  private String customerNegotiationPreconditions = null;

  private String customerNegotiationBusinessUnitEmployeeReference = null;

  private String customerNegotiationWorkSchedule = null;

  private String paymentNegotation = null;

  private String customerNegotiationPostconditions = null;

  private String customerNegotiationPaymentNegotationServiceType = null;

  private String customerNegotiationPaymentNegotationServiceDescription = null;

  private String customerNegotiationPaymentNegotationServiceInputsandOuputs = null;

  private String customerNegotiationPaymentNegotationServiceWorkProduct = null;

  private Object paymentRetrieveActionTaskRecord = null;

  private String paymentRetrieveActionRequest = null;

  private BQPaymentRetrieveInputModelPaymentInstanceReport paymentInstanceReport = null;

  private BQPaymentRetrieveInputModelPaymentInstanceAnalysis paymentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return customerNegotiationPreconditions
  **/

  public String getCustomerNegotiationPreconditions() {
    return customerNegotiationPreconditions;
  }

  public void setCustomerNegotiationPreconditions(String customerNegotiationPreconditions) {
    this.customerNegotiationPreconditions = customerNegotiationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return customerNegotiationBusinessUnitEmployeeReference
  **/

  public String getCustomerNegotiationBusinessUnitEmployeeReference() {
    return customerNegotiationBusinessUnitEmployeeReference;
  }

  public void setCustomerNegotiationBusinessUnitEmployeeReference(String customerNegotiationBusinessUnitEmployeeReference) {
    this.customerNegotiationBusinessUnitEmployeeReference = customerNegotiationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return customerNegotiationWorkSchedule
  **/

  public String getCustomerNegotiationWorkSchedule() {
    return customerNegotiationWorkSchedule;
  }

  public void setCustomerNegotiationWorkSchedule(String customerNegotiationWorkSchedule) {
    this.customerNegotiationWorkSchedule = customerNegotiationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Accounts Receivable Procedure specific Business Service 
   * @return paymentNegotation
  **/

  public String getPaymentNegotation() {
    return paymentNegotation;
  }

  public void setPaymentNegotation(String paymentNegotation) {
    this.paymentNegotation = paymentNegotation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return customerNegotiationPostconditions
  **/

  public String getCustomerNegotiationPostconditions() {
    return customerNegotiationPostconditions;
  }

  public void setCustomerNegotiationPostconditions(String customerNegotiationPostconditions) {
    this.customerNegotiationPostconditions = customerNegotiationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return customerNegotiationPaymentNegotationServiceType
  **/

  public String getCustomerNegotiationPaymentNegotationServiceType() {
    return customerNegotiationPaymentNegotationServiceType;
  }

  public void setCustomerNegotiationPaymentNegotationServiceType(String customerNegotiationPaymentNegotationServiceType) {
    this.customerNegotiationPaymentNegotationServiceType = customerNegotiationPaymentNegotationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return customerNegotiationPaymentNegotationServiceDescription
  **/

  public String getCustomerNegotiationPaymentNegotationServiceDescription() {
    return customerNegotiationPaymentNegotationServiceDescription;
  }

  public void setCustomerNegotiationPaymentNegotationServiceDescription(String customerNegotiationPaymentNegotationServiceDescription) {
    this.customerNegotiationPaymentNegotationServiceDescription = customerNegotiationPaymentNegotationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return customerNegotiationPaymentNegotationServiceInputsandOuputs
  **/

  public String getCustomerNegotiationPaymentNegotationServiceInputsandOuputs() {
    return customerNegotiationPaymentNegotationServiceInputsandOuputs;
  }

  public void setCustomerNegotiationPaymentNegotationServiceInputsandOuputs(String customerNegotiationPaymentNegotationServiceInputsandOuputs) {
    this.customerNegotiationPaymentNegotationServiceInputsandOuputs = customerNegotiationPaymentNegotationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return customerNegotiationPaymentNegotationServiceWorkProduct
  **/

  public String getCustomerNegotiationPaymentNegotationServiceWorkProduct() {
    return customerNegotiationPaymentNegotationServiceWorkProduct;
  }

  public void setCustomerNegotiationPaymentNegotationServiceWorkProduct(String customerNegotiationPaymentNegotationServiceWorkProduct) {
    this.customerNegotiationPaymentNegotationServiceWorkProduct = customerNegotiationPaymentNegotationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentRetrieveActionTaskRecord
  **/

  public Object getPaymentRetrieveActionTaskRecord() {
    return paymentRetrieveActionTaskRecord;
  }

  public void setPaymentRetrieveActionTaskRecord(Object paymentRetrieveActionTaskRecord) {
    this.paymentRetrieveActionTaskRecord = paymentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentRetrieveActionRequest
  **/

  public String getPaymentRetrieveActionRequest() {
    return paymentRetrieveActionRequest;
  }

  public void setPaymentRetrieveActionRequest(String paymentRetrieveActionRequest) {
    this.paymentRetrieveActionRequest = paymentRetrieveActionRequest;
  }


  /**
   * Get paymentInstanceReport
   * @return paymentInstanceReport
  **/

  public BQPaymentRetrieveInputModelPaymentInstanceReport getPaymentInstanceReport() {
    return paymentInstanceReport;
  }

  public void setPaymentInstanceReport(BQPaymentRetrieveInputModelPaymentInstanceReport paymentInstanceReport) {
    this.paymentInstanceReport = paymentInstanceReport;
  }


  /**
   * Get paymentInstanceAnalysis
   * @return paymentInstanceAnalysis
  **/

  public BQPaymentRetrieveInputModelPaymentInstanceAnalysis getPaymentInstanceAnalysis() {
    return paymentInstanceAnalysis;
  }

  public void setPaymentInstanceAnalysis(BQPaymentRetrieveInputModelPaymentInstanceAnalysis paymentInstanceAnalysis) {
    this.paymentInstanceAnalysis = paymentInstanceAnalysis;
  }


}

