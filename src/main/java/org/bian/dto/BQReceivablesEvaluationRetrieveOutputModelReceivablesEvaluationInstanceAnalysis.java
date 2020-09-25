package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceAnalysis
 */
public class BQReceivablesEvaluationRetrieveOutputModelReceivablesEvaluationInstanceAnalysis   {
  private Object receivablesEvaluationInstanceAnalysisRecord = null;

  private String receivablesEvaluationInstanceAnalysisReportType = null;

  private String receivablesEvaluationInstanceAnalysisParameters = null;

  private Object receivablesEvaluationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return receivablesEvaluationInstanceAnalysisRecord
  **/

  public Object getReceivablesEvaluationInstanceAnalysisRecord() {
    return receivablesEvaluationInstanceAnalysisRecord;
  }

  public void setReceivablesEvaluationInstanceAnalysisRecord(Object receivablesEvaluationInstanceAnalysisRecord) {
    this.receivablesEvaluationInstanceAnalysisRecord = receivablesEvaluationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return receivablesEvaluationInstanceAnalysisReportType
  **/

  public String getReceivablesEvaluationInstanceAnalysisReportType() {
    return receivablesEvaluationInstanceAnalysisReportType;
  }

  public void setReceivablesEvaluationInstanceAnalysisReportType(String receivablesEvaluationInstanceAnalysisReportType) {
    this.receivablesEvaluationInstanceAnalysisReportType = receivablesEvaluationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return receivablesEvaluationInstanceAnalysisParameters
  **/

  public String getReceivablesEvaluationInstanceAnalysisParameters() {
    return receivablesEvaluationInstanceAnalysisParameters;
  }

  public void setReceivablesEvaluationInstanceAnalysisParameters(String receivablesEvaluationInstanceAnalysisParameters) {
    this.receivablesEvaluationInstanceAnalysisParameters = receivablesEvaluationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return receivablesEvaluationInstanceAnalysisReport
  **/

  public Object getReceivablesEvaluationInstanceAnalysisReport() {
    return receivablesEvaluationInstanceAnalysisReport;
  }

  public void setReceivablesEvaluationInstanceAnalysisReport(Object receivablesEvaluationInstanceAnalysisReport) {
    this.receivablesEvaluationInstanceAnalysisReport = receivablesEvaluationInstanceAnalysisReport;
  }


}

