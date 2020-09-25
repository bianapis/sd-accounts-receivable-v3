package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBQCustomerNegotiationRetrieveOutputModelBQCustomerNegotiationInstanceReport
 */
public class BQBQCustomerNegotiationRetrieveOutputModelBQCustomerNegotiationInstanceReport   {
  private Object bQCustomerNegotiationInstanceReportRecord = null;

  private String bQCustomerNegotiationInstanceReportType = null;

  private String bQCustomerNegotiationInstanceReportParameters = null;

  private Object bQCustomerNegotiationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return bQCustomerNegotiationInstanceReportRecord
  **/

  public Object getBQCustomerNegotiationInstanceReportRecord() {
    return bQCustomerNegotiationInstanceReportRecord;
  }

  public void setBQCustomerNegotiationInstanceReportRecord(Object bQCustomerNegotiationInstanceReportRecord) {
    this.bQCustomerNegotiationInstanceReportRecord = bQCustomerNegotiationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return bQCustomerNegotiationInstanceReportType
  **/

  public String getBQCustomerNegotiationInstanceReportType() {
    return bQCustomerNegotiationInstanceReportType;
  }

  public void setBQCustomerNegotiationInstanceReportType(String bQCustomerNegotiationInstanceReportType) {
    this.bQCustomerNegotiationInstanceReportType = bQCustomerNegotiationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return bQCustomerNegotiationInstanceReportParameters
  **/

  public String getBQCustomerNegotiationInstanceReportParameters() {
    return bQCustomerNegotiationInstanceReportParameters;
  }

  public void setBQCustomerNegotiationInstanceReportParameters(String bQCustomerNegotiationInstanceReportParameters) {
    this.bQCustomerNegotiationInstanceReportParameters = bQCustomerNegotiationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return bQCustomerNegotiationInstanceReport
  **/

  public Object getBQCustomerNegotiationInstanceReport() {
    return bQCustomerNegotiationInstanceReport;
  }

  public void setBQCustomerNegotiationInstanceReport(Object bQCustomerNegotiationInstanceReport) {
    this.bQCustomerNegotiationInstanceReport = bQCustomerNegotiationInstanceReport;
  }


}

