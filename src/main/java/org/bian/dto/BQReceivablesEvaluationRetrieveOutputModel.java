package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceAnalysis;
import org.bian.dto.BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReceivablesEvaluationRetrieveOutputModel
 */
public class BQReceivablesEvaluationRetrieveOutputModel   {
  private String customerNegotiationPreconditions = null;

  private String customerNegotiationBusinessUnitEmployeeReference = null;

  private String customerNegotiationWorkSchedule = null;

  private String paymentNegotation = null;

  private String customerNegotiationPostconditions = null;

  private String customerNegotiationPaymentNegotationServiceType = null;

  private String customerNegotiationPaymentNegotationServiceDescription = null;

  private String customerNegotiationPaymentNegotationServiceInputsandOuputs = null;

  private String customerNegotiationPaymentNegotationServiceWorkProduct = null;

  private String receivablesEvaluationRetrieveActionTaskReference = null;

  private Object receivablesEvaluationRetrieveActionTaskRecord = null;

  private String receivablesEvaluationRetrieveActionResponse = null;

  private BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceReport receivablesEvaluationInstanceReport = null;

  private BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceAnalysis receivablesEvaluationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Receivables Evaluation instance retrieve service call 
   * @return receivablesEvaluationRetrieveActionTaskReference
  **/

  public String getReceivablesEvaluationRetrieveActionTaskReference() {
    return receivablesEvaluationRetrieveActionTaskReference;
  }

  public void setReceivablesEvaluationRetrieveActionTaskReference(String receivablesEvaluationRetrieveActionTaskReference) {
    this.receivablesEvaluationRetrieveActionTaskReference = receivablesEvaluationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return receivablesEvaluationRetrieveActionTaskRecord
  **/

  public Object getReceivablesEvaluationRetrieveActionTaskRecord() {
    return receivablesEvaluationRetrieveActionTaskRecord;
  }

  public void setReceivablesEvaluationRetrieveActionTaskRecord(Object receivablesEvaluationRetrieveActionTaskRecord) {
    this.receivablesEvaluationRetrieveActionTaskRecord = receivablesEvaluationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return receivablesEvaluationRetrieveActionResponse
  **/

  public String getReceivablesEvaluationRetrieveActionResponse() {
    return receivablesEvaluationRetrieveActionResponse;
  }

  public void setReceivablesEvaluationRetrieveActionResponse(String receivablesEvaluationRetrieveActionResponse) {
    this.receivablesEvaluationRetrieveActionResponse = receivablesEvaluationRetrieveActionResponse;
  }


  /**
   * Get receivablesEvaluationInstanceReport
   * @return receivablesEvaluationInstanceReport
  **/

  public BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceReport getReceivablesEvaluationInstanceReport() {
    return receivablesEvaluationInstanceReport;
  }

  public void setReceivablesEvaluationInstanceReport(BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceReport receivablesEvaluationInstanceReport) {
    this.receivablesEvaluationInstanceReport = receivablesEvaluationInstanceReport;
  }


  /**
   * Get receivablesEvaluationInstanceAnalysis
   * @return receivablesEvaluationInstanceAnalysis
  **/

  public BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceAnalysis getReceivablesEvaluationInstanceAnalysis() {
    return receivablesEvaluationInstanceAnalysis;
  }

  public void setReceivablesEvaluationInstanceAnalysis(BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceAnalysis receivablesEvaluationInstanceAnalysis) {
    this.receivablesEvaluationInstanceAnalysis = receivablesEvaluationInstanceAnalysis;
  }


}

