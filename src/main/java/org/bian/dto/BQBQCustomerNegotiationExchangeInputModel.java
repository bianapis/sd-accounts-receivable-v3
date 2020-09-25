package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountsReceivableProcedureExchangeInputModelAccountsReceivableProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQBQCustomerNegotiationExchangeInputModel
 */
public class BQBQCustomerNegotiationExchangeInputModel   {
  private String accountsReceivableProcedureInstanceReference = null;

  private String bQCustomerNegotiationInstanceReference = null;

  private Object bQCustomerNegotiationExchangeActionTaskRecord = null;

  private CRAccountsReceivableProcedureExchangeInputModelAccountsReceivableProcedureExchangeActionRequest bQCustomerNegotiationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the BQ Customer Negotiation instance 
   * @return bQCustomerNegotiationInstanceReference
  **/

  public String getBQCustomerNegotiationInstanceReference() {
    return bQCustomerNegotiationInstanceReference;
  }

  public void setBQCustomerNegotiationInstanceReference(String bQCustomerNegotiationInstanceReference) {
    this.bQCustomerNegotiationInstanceReference = bQCustomerNegotiationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return bQCustomerNegotiationExchangeActionTaskRecord
  **/

  public Object getBQCustomerNegotiationExchangeActionTaskRecord() {
    return bQCustomerNegotiationExchangeActionTaskRecord;
  }

  public void setBQCustomerNegotiationExchangeActionTaskRecord(Object bQCustomerNegotiationExchangeActionTaskRecord) {
    this.bQCustomerNegotiationExchangeActionTaskRecord = bQCustomerNegotiationExchangeActionTaskRecord;
  }


  /**
   * Get bQCustomerNegotiationExchangeActionRequest
   * @return bQCustomerNegotiationExchangeActionRequest
  **/

  public CRAccountsReceivableProcedureExchangeInputModelAccountsReceivableProcedureExchangeActionRequest getBQCustomerNegotiationExchangeActionRequest() {
    return bQCustomerNegotiationExchangeActionRequest;
  }

  public void setBQCustomerNegotiationExchangeActionRequest(CRAccountsReceivableProcedureExchangeInputModelAccountsReceivableProcedureExchangeActionRequest bQCustomerNegotiationExchangeActionRequest) {
    this.bQCustomerNegotiationExchangeActionRequest = bQCustomerNegotiationExchangeActionRequest;
  }


}

