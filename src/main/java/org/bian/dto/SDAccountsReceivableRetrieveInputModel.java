package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableRetrieveInputModelAccountsReceivableOfferedService;
import org.bian.dto.SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableRetrieveInputModel
 */
public class SDAccountsReceivableRetrieveInputModel   {
  private Object accountsReceivableRetrieveActionTaskRecord = null;

  private String accountsReceivableRetrieveActionRequest = null;

  private SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecord accountsReceivableRetrieveActionRecord = null;

  private SDAccountsReceivableRetrieveInputModelAccountsReceivableOfferedService accountsReceivableOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return accountsReceivableRetrieveActionRequest
  **/

  public String getAccountsReceivableRetrieveActionRequest() {
    return accountsReceivableRetrieveActionRequest;
  }

  public void setAccountsReceivableRetrieveActionRequest(String accountsReceivableRetrieveActionRequest) {
    this.accountsReceivableRetrieveActionRequest = accountsReceivableRetrieveActionRequest;
  }


  /**
   * Get accountsReceivableRetrieveActionRecord
   * @return accountsReceivableRetrieveActionRecord
  **/

  public SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecord getAccountsReceivableRetrieveActionRecord() {
    return accountsReceivableRetrieveActionRecord;
  }

  public void setAccountsReceivableRetrieveActionRecord(SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecord accountsReceivableRetrieveActionRecord) {
    this.accountsReceivableRetrieveActionRecord = accountsReceivableRetrieveActionRecord;
  }


  /**
   * Get accountsReceivableOfferedService
   * @return accountsReceivableOfferedService
  **/

  public SDAccountsReceivableRetrieveInputModelAccountsReceivableOfferedService getAccountsReceivableOfferedService() {
    return accountsReceivableOfferedService;
  }

  public void setAccountsReceivableOfferedService(SDAccountsReceivableRetrieveInputModelAccountsReceivableOfferedService accountsReceivableOfferedService) {
    this.accountsReceivableOfferedService = accountsReceivableOfferedService;
  }


}

