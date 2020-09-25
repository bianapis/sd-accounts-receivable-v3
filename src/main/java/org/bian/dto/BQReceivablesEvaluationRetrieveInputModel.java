package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReceivablesEvaluationRetrieveInputModelReceivablesEvaluationInstanceAnalysis;
import org.bian.dto.BQReceivablesEvaluationRetrieveInputModelReceivablesEvaluationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReceivablesEvaluationRetrieveInputModel
 */
public class BQReceivablesEvaluationRetrieveInputModel   {
  private Object receivablesEvaluationRetrieveActionTaskRecord = null;

  private String receivablesEvaluationRetrieveActionRequest = null;

  private BQReceivablesEvaluationRetrieveInputModelReceivablesEvaluationInstanceReport receivablesEvaluationInstanceReport = null;

  private BQReceivablesEvaluationRetrieveInputModelReceivablesEvaluationInstanceAnalysis receivablesEvaluationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return receivablesEvaluationRetrieveActionRequest
  **/

  public String getReceivablesEvaluationRetrieveActionRequest() {
    return receivablesEvaluationRetrieveActionRequest;
  }

  public void setReceivablesEvaluationRetrieveActionRequest(String receivablesEvaluationRetrieveActionRequest) {
    this.receivablesEvaluationRetrieveActionRequest = receivablesEvaluationRetrieveActionRequest;
  }


  /**
   * Get receivablesEvaluationInstanceReport
   * @return receivablesEvaluationInstanceReport
  **/

  public BQReceivablesEvaluationRetrieveInputModelReceivablesEvaluationInstanceReport getReceivablesEvaluationInstanceReport() {
    return receivablesEvaluationInstanceReport;
  }

  public void setReceivablesEvaluationInstanceReport(BQReceivablesEvaluationRetrieveInputModelReceivablesEvaluationInstanceReport receivablesEvaluationInstanceReport) {
    this.receivablesEvaluationInstanceReport = receivablesEvaluationInstanceReport;
  }


  /**
   * Get receivablesEvaluationInstanceAnalysis
   * @return receivablesEvaluationInstanceAnalysis
  **/

  public BQReceivablesEvaluationRetrieveInputModelReceivablesEvaluationInstanceAnalysis getReceivablesEvaluationInstanceAnalysis() {
    return receivablesEvaluationInstanceAnalysis;
  }

  public void setReceivablesEvaluationInstanceAnalysis(BQReceivablesEvaluationRetrieveInputModelReceivablesEvaluationInstanceAnalysis receivablesEvaluationInstanceAnalysis) {
    this.receivablesEvaluationInstanceAnalysis = receivablesEvaluationInstanceAnalysis;
  }


}

