package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBQCustomerNegotiationRetrieveOutputModelBQCustomerNegotiationInstanceAnalysis
 */
public class BQBQCustomerNegotiationRetrieveOutputModelBQCustomerNegotiationInstanceAnalysis   {
  private Object bQCustomerNegotiationInstanceAnalysisRecord = null;

  private String bQCustomerNegotiationInstanceAnalysisReportType = null;

  private String bQCustomerNegotiationInstanceAnalysisParameters = null;

  private Object bQCustomerNegotiationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return bQCustomerNegotiationInstanceAnalysisRecord
  **/

  public Object getBQCustomerNegotiationInstanceAnalysisRecord() {
    return bQCustomerNegotiationInstanceAnalysisRecord;
  }

  public void setBQCustomerNegotiationInstanceAnalysisRecord(Object bQCustomerNegotiationInstanceAnalysisRecord) {
    this.bQCustomerNegotiationInstanceAnalysisRecord = bQCustomerNegotiationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return bQCustomerNegotiationInstanceAnalysisReportType
  **/

  public String getBQCustomerNegotiationInstanceAnalysisReportType() {
    return bQCustomerNegotiationInstanceAnalysisReportType;
  }

  public void setBQCustomerNegotiationInstanceAnalysisReportType(String bQCustomerNegotiationInstanceAnalysisReportType) {
    this.bQCustomerNegotiationInstanceAnalysisReportType = bQCustomerNegotiationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return bQCustomerNegotiationInstanceAnalysisParameters
  **/

  public String getBQCustomerNegotiationInstanceAnalysisParameters() {
    return bQCustomerNegotiationInstanceAnalysisParameters;
  }

  public void setBQCustomerNegotiationInstanceAnalysisParameters(String bQCustomerNegotiationInstanceAnalysisParameters) {
    this.bQCustomerNegotiationInstanceAnalysisParameters = bQCustomerNegotiationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return bQCustomerNegotiationInstanceAnalysisReport
  **/

  public Object getBQCustomerNegotiationInstanceAnalysisReport() {
    return bQCustomerNegotiationInstanceAnalysisReport;
  }

  public void setBQCustomerNegotiationInstanceAnalysisReport(Object bQCustomerNegotiationInstanceAnalysisReport) {
    this.bQCustomerNegotiationInstanceAnalysisReport = bQCustomerNegotiationInstanceAnalysisReport;
  }


}

