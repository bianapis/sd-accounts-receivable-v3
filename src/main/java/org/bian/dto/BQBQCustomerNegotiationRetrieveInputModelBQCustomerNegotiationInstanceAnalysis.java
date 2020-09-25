package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceAnalysis
 */
public class BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceAnalysis   {
  private String bQCustomerNegotiationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return bQCustomerNegotiationInstanceAnalysisReference
  **/

  public String getBQCustomerNegotiationInstanceAnalysisReference() {
    return bQCustomerNegotiationInstanceAnalysisReference;
  }

  public void setBQCustomerNegotiationInstanceAnalysisReference(String bQCustomerNegotiationInstanceAnalysisReference) {
    this.bQCustomerNegotiationInstanceAnalysisReference = bQCustomerNegotiationInstanceAnalysisReference;
  }


}

