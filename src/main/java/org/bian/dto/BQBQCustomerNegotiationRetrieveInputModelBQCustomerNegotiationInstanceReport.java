package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceReport
 */
public class BQBQCustomerNegotiationRetrieveInputModelBQCustomerNegotiationInstanceReport   {
  private String bQCustomerNegotiationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return bQCustomerNegotiationInstanceReportReference
  **/

  public String getBQCustomerNegotiationInstanceReportReference() {
    return bQCustomerNegotiationInstanceReportReference;
  }

  public void setBQCustomerNegotiationInstanceReportReference(String bQCustomerNegotiationInstanceReportReference) {
    this.bQCustomerNegotiationInstanceReportReference = bQCustomerNegotiationInstanceReportReference;
  }


}

