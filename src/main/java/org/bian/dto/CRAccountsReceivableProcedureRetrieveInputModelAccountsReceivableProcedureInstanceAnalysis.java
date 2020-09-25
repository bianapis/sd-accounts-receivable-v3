package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceAnalysis
 */
public class CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceAnalysis   {
  private String accountsReceivableProcedureInstanceAnalysisReference = null;

  private String accountsReceivableProcedureInstanceAnalysisReportType = null;

  private String accountsReceivableProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return accountsReceivableProcedureInstanceAnalysisReference
  **/

  public String getAccountsReceivableProcedureInstanceAnalysisReference() {
    return accountsReceivableProcedureInstanceAnalysisReference;
  }

  public void setAccountsReceivableProcedureInstanceAnalysisReference(String accountsReceivableProcedureInstanceAnalysisReference) {
    this.accountsReceivableProcedureInstanceAnalysisReference = accountsReceivableProcedureInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return accountsReceivableProcedureInstanceAnalysisReportType
  **/

  public String getAccountsReceivableProcedureInstanceAnalysisReportType() {
    return accountsReceivableProcedureInstanceAnalysisReportType;
  }

  public void setAccountsReceivableProcedureInstanceAnalysisReportType(String accountsReceivableProcedureInstanceAnalysisReportType) {
    this.accountsReceivableProcedureInstanceAnalysisReportType = accountsReceivableProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return accountsReceivableProcedureInstanceAnalysisParameters
  **/

  public String getAccountsReceivableProcedureInstanceAnalysisParameters() {
    return accountsReceivableProcedureInstanceAnalysisParameters;
  }

  public void setAccountsReceivableProcedureInstanceAnalysisParameters(String accountsReceivableProcedureInstanceAnalysisParameters) {
    this.accountsReceivableProcedureInstanceAnalysisParameters = accountsReceivableProcedureInstanceAnalysisParameters;
  }


}

