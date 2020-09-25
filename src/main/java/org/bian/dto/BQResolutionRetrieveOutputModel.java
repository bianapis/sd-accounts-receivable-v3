package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQResolutionRetrieveOutputModelResolutionInstanceAnalysis;
import org.bian.dto.BQResolutionRetrieveOutputModelResolutionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQResolutionRetrieveOutputModel
 */
public class BQResolutionRetrieveOutputModel   {
  private String resolutionRetrieveActionTaskReference = null;

  private Object resolutionRetrieveActionTaskRecord = null;

  private String resolutionRetrieveActionResponse = null;

  private BQResolutionRetrieveOutputModelResolutionInstanceReport resolutionInstanceReport = null;

  private BQResolutionRetrieveOutputModelResolutionInstanceAnalysis resolutionInstanceAnalysis = null;

  private String receivablesEvaluationPreconditions = null;

  private String receivablesEvaluationBusinessUnitEmployeeReference = null;

  private String receivablesEvaluationWorkSchedule = null;

  private String receivablesEvaluationPostconditions = null;

  private String receivablesEvaluationReceivablesEvaluationServiceType = null;

  private String receivablesEvaluationReceivablesEvaluationServiceDescription = null;

  private String receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs = null;

  private String receivablesEvaluationReceivablesEvaluationServiceWorkProduct = null;

  private String receivablesEvaluationReceivablesEvaluationServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Resolution instance retrieve service call 
   * @return resolutionRetrieveActionTaskReference
  **/

  public String getResolutionRetrieveActionTaskReference() {
    return resolutionRetrieveActionTaskReference;
  }

  public void setResolutionRetrieveActionTaskReference(String resolutionRetrieveActionTaskReference) {
    this.resolutionRetrieveActionTaskReference = resolutionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return resolutionRetrieveActionTaskRecord
  **/

  public Object getResolutionRetrieveActionTaskRecord() {
    return resolutionRetrieveActionTaskRecord;
  }

  public void setResolutionRetrieveActionTaskRecord(Object resolutionRetrieveActionTaskRecord) {
    this.resolutionRetrieveActionTaskRecord = resolutionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return resolutionRetrieveActionResponse
  **/

  public String getResolutionRetrieveActionResponse() {
    return resolutionRetrieveActionResponse;
  }

  public void setResolutionRetrieveActionResponse(String resolutionRetrieveActionResponse) {
    this.resolutionRetrieveActionResponse = resolutionRetrieveActionResponse;
  }


  /**
   * Get resolutionInstanceReport
   * @return resolutionInstanceReport
  **/

  public BQResolutionRetrieveOutputModelResolutionInstanceReport getResolutionInstanceReport() {
    return resolutionInstanceReport;
  }

  public void setResolutionInstanceReport(BQResolutionRetrieveOutputModelResolutionInstanceReport resolutionInstanceReport) {
    this.resolutionInstanceReport = resolutionInstanceReport;
  }


  /**
   * Get resolutionInstanceAnalysis
   * @return resolutionInstanceAnalysis
  **/

  public BQResolutionRetrieveOutputModelResolutionInstanceAnalysis getResolutionInstanceAnalysis() {
    return resolutionInstanceAnalysis;
  }

  public void setResolutionInstanceAnalysis(BQResolutionRetrieveOutputModelResolutionInstanceAnalysis resolutionInstanceAnalysis) {
    this.resolutionInstanceAnalysis = resolutionInstanceAnalysis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return receivablesEvaluationPreconditions
  **/

  public String getReceivablesEvaluationPreconditions() {
    return receivablesEvaluationPreconditions;
  }

  public void setReceivablesEvaluationPreconditions(String receivablesEvaluationPreconditions) {
    this.receivablesEvaluationPreconditions = receivablesEvaluationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return receivablesEvaluationBusinessUnitEmployeeReference
  **/

  public String getReceivablesEvaluationBusinessUnitEmployeeReference() {
    return receivablesEvaluationBusinessUnitEmployeeReference;
  }

  public void setReceivablesEvaluationBusinessUnitEmployeeReference(String receivablesEvaluationBusinessUnitEmployeeReference) {
    this.receivablesEvaluationBusinessUnitEmployeeReference = receivablesEvaluationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return receivablesEvaluationWorkSchedule
  **/

  public String getReceivablesEvaluationWorkSchedule() {
    return receivablesEvaluationWorkSchedule;
  }

  public void setReceivablesEvaluationWorkSchedule(String receivablesEvaluationWorkSchedule) {
    this.receivablesEvaluationWorkSchedule = receivablesEvaluationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return receivablesEvaluationPostconditions
  **/

  public String getReceivablesEvaluationPostconditions() {
    return receivablesEvaluationPostconditions;
  }

  public void setReceivablesEvaluationPostconditions(String receivablesEvaluationPostconditions) {
    this.receivablesEvaluationPostconditions = receivablesEvaluationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return receivablesEvaluationReceivablesEvaluationServiceType
  **/

  public String getReceivablesEvaluationReceivablesEvaluationServiceType() {
    return receivablesEvaluationReceivablesEvaluationServiceType;
  }

  public void setReceivablesEvaluationReceivablesEvaluationServiceType(String receivablesEvaluationReceivablesEvaluationServiceType) {
    this.receivablesEvaluationReceivablesEvaluationServiceType = receivablesEvaluationReceivablesEvaluationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return receivablesEvaluationReceivablesEvaluationServiceDescription
  **/

  public String getReceivablesEvaluationReceivablesEvaluationServiceDescription() {
    return receivablesEvaluationReceivablesEvaluationServiceDescription;
  }

  public void setReceivablesEvaluationReceivablesEvaluationServiceDescription(String receivablesEvaluationReceivablesEvaluationServiceDescription) {
    this.receivablesEvaluationReceivablesEvaluationServiceDescription = receivablesEvaluationReceivablesEvaluationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs
  **/

  public String getReceivablesEvaluationReceivablesEvaluationServiceInputsandOuputs() {
    return receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs;
  }

  public void setReceivablesEvaluationReceivablesEvaluationServiceInputsandOuputs(String receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs) {
    this.receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs = receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return receivablesEvaluationReceivablesEvaluationServiceWorkProduct
  **/

  public String getReceivablesEvaluationReceivablesEvaluationServiceWorkProduct() {
    return receivablesEvaluationReceivablesEvaluationServiceWorkProduct;
  }

  public void setReceivablesEvaluationReceivablesEvaluationServiceWorkProduct(String receivablesEvaluationReceivablesEvaluationServiceWorkProduct) {
    this.receivablesEvaluationReceivablesEvaluationServiceWorkProduct = receivablesEvaluationReceivablesEvaluationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return receivablesEvaluationReceivablesEvaluationServiceName
  **/

  public String getReceivablesEvaluationReceivablesEvaluationServiceName() {
    return receivablesEvaluationReceivablesEvaluationServiceName;
  }

  public void setReceivablesEvaluationReceivablesEvaluationServiceName(String receivablesEvaluationReceivablesEvaluationServiceName) {
    this.receivablesEvaluationReceivablesEvaluationServiceName = receivablesEvaluationReceivablesEvaluationServiceName;
  }


}

