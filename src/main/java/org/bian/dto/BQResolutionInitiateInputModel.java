package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionInitiateInputModel
 */
public class BQResolutionInitiateInputModel   {
  private String accountsReceivableProcedureInstanceReference = null;

  private Object resolutionInitiateActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Accounts Receivable Procedure instance 
   * @return accountsReceivableProcedureInstanceReference
  **/

  public String getAccountsReceivableProcedureInstanceReference() {
    return accountsReceivableProcedureInstanceReference;
  }

  public void setAccountsReceivableProcedureInstanceReference(String accountsReceivableProcedureInstanceReference) {
    this.accountsReceivableProcedureInstanceReference = accountsReceivableProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return resolutionInitiateActionRecord
  **/

  public Object getResolutionInitiateActionRecord() {
    return resolutionInitiateActionRecord;
  }

  public void setResolutionInitiateActionRecord(Object resolutionInitiateActionRecord) {
    this.resolutionInitiateActionRecord = resolutionInitiateActionRecord;
  }


}

