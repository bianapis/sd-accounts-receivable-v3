package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReceivablesEvaluationRetrieveInputModelReceivablesEvaluationInstanceAnalysis
 */
public class BQReceivablesEvaluationRetrieveInputModelReceivablesEvaluationInstanceAnalysis   {
  private String receivablesEvaluationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return receivablesEvaluationInstanceAnalysisReference
  **/

  public String getReceivablesEvaluationInstanceAnalysisReference() {
    return receivablesEvaluationInstanceAnalysisReference;
  }

  public void setReceivablesEvaluationInstanceAnalysisReference(String receivablesEvaluationInstanceAnalysisReference) {
    this.receivablesEvaluationInstanceAnalysisReference = receivablesEvaluationInstanceAnalysisReference;
  }


}

