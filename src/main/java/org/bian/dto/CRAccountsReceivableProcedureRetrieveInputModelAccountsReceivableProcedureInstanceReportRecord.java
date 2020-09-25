package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceReportRecord
 */
public class CRAccountsReceivableProcedureRetrieveInputModelAccountsReceivableProcedureInstanceReportRecord   {
  private String accountsReceivableProcedureInstanceReportReference = null;

  private String accountsReceivableProcedureInstanceReportType = null;

  private String accountsReceivableProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return accountsReceivableProcedureInstanceReportReference
  **/

  public String getAccountsReceivableProcedureInstanceReportReference() {
    return accountsReceivableProcedureInstanceReportReference;
  }

  public void setAccountsReceivableProcedureInstanceReportReference(String accountsReceivableProcedureInstanceReportReference) {
    this.accountsReceivableProcedureInstanceReportReference = accountsReceivableProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return accountsReceivableProcedureInstanceReportType
  **/

  public String getAccountsReceivableProcedureInstanceReportType() {
    return accountsReceivableProcedureInstanceReportType;
  }

  public void setAccountsReceivableProcedureInstanceReportType(String accountsReceivableProcedureInstanceReportType) {
    this.accountsReceivableProcedureInstanceReportType = accountsReceivableProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return accountsReceivableProcedureInstanceReportParameters
  **/

  public String getAccountsReceivableProcedureInstanceReportParameters() {
    return accountsReceivableProcedureInstanceReportParameters;
  }

  public void setAccountsReceivableProcedureInstanceReportParameters(String accountsReceivableProcedureInstanceReportParameters) {
    this.accountsReceivableProcedureInstanceReportParameters = accountsReceivableProcedureInstanceReportParameters;
  }


}

