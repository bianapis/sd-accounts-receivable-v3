package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedService;
import org.bian.dto.SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableRetrieveOutputModel
 */
public class SDAccountsReceivableRetrieveOutputModel   {
  private String accountsReceivableRetrieveActionTaskReference = null;

  private Object accountsReceivableRetrieveActionTaskRecord = null;

  private String accountsReceivableRetrieveActionResponse = null;

  private SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecord accountsReceivableRetrieveActionRecord = null;

  private SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedService accountsReceivableOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return accountsReceivableRetrieveActionTaskReference
  **/

  public String getAccountsReceivableRetrieveActionTaskReference() {
    return accountsReceivableRetrieveActionTaskReference;
  }

  public void setAccountsReceivableRetrieveActionTaskReference(String accountsReceivableRetrieveActionTaskReference) {
    this.accountsReceivableRetrieveActionTaskReference = accountsReceivableRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountsReceivableRetrieveActionTaskRecord
  **/

  public Object getAccountsReceivableRetrieveActionTaskRecord() {
    return accountsReceivableRetrieveActionTaskRecord;
  }

  public void setAccountsReceivableRetrieveActionTaskRecord(Object accountsReceivableRetrieveActionTaskRecord) {
    this.accountsReceivableRetrieveActionTaskRecord = accountsReceivableRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return accountsReceivableRetrieveActionResponse
  **/

  public String getAccountsReceivableRetrieveActionResponse() {
    return accountsReceivableRetrieveActionResponse;
  }

  public void setAccountsReceivableRetrieveActionResponse(String accountsReceivableRetrieveActionResponse) {
    this.accountsReceivableRetrieveActionResponse = accountsReceivableRetrieveActionResponse;
  }


  /**
   * Get accountsReceivableRetrieveActionRecord
   * @return accountsReceivableRetrieveActionRecord
  **/

  public SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecord getAccountsReceivableRetrieveActionRecord() {
    return accountsReceivableRetrieveActionRecord;
  }

  public void setAccountsReceivableRetrieveActionRecord(SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecord accountsReceivableRetrieveActionRecord) {
    this.accountsReceivableRetrieveActionRecord = accountsReceivableRetrieveActionRecord;
  }


  /**
   * Get accountsReceivableOfferedService
   * @return accountsReceivableOfferedService
  **/

  public SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedService getAccountsReceivableOfferedService() {
    return accountsReceivableOfferedService;
  }

  public void setAccountsReceivableOfferedService(SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedService accountsReceivableOfferedService) {
    this.accountsReceivableOfferedService = accountsReceivableOfferedService;
  }


}

