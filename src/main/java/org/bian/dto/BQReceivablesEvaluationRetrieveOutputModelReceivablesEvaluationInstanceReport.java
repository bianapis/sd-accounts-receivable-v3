package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceReport
 */
public class BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceReport   {
  private Object receivablesEvaluationInstanceReportRecord = null;

  private String receivablesEvaluationInstanceReportType = null;

  private String receivablesEvaluationInstanceReportParameters = null;

  private Object receivablesEvaluationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return receivablesEvaluationInstanceReportRecord
  **/

  public Object getReceivablesEvaluationInstanceReportRecord() {
    return receivablesEvaluationInstanceReportRecord;
  }

  public void setReceivablesEvaluationInstanceReportRecord(Object receivablesEvaluationInstanceReportRecord) {
    this.receivablesEvaluationInstanceReportRecord = receivablesEvaluationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return receivablesEvaluationInstanceReportType
  **/

  public String getReceivablesEvaluationInstanceReportType() {
    return receivablesEvaluationInstanceReportType;
  }

  public void setReceivablesEvaluationInstanceReportType(String receivablesEvaluationInstanceReportType) {
    this.receivablesEvaluationInstanceReportType = receivablesEvaluationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return receivablesEvaluationInstanceReportParameters
  **/

  public String getReceivablesEvaluationInstanceReportParameters() {
    return receivablesEvaluationInstanceReportParameters;
  }

  public void setReceivablesEvaluationInstanceReportParameters(String receivablesEvaluationInstanceReportParameters) {
    this.receivablesEvaluationInstanceReportParameters = receivablesEvaluationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return receivablesEvaluationInstanceReport
  **/

  public Object getReceivablesEvaluationInstanceReport() {
    return receivablesEvaluationInstanceReport;
  }

  public void setReceivablesEvaluationInstanceReport(Object receivablesEvaluationInstanceReport) {
    this.receivablesEvaluationInstanceReport = receivablesEvaluationInstanceReport;
  }


}

