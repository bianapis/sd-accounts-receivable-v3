package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableFeedbackInputModelAccountsReceivableFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableFeedbackInputModel
 */
public class SDAccountsReceivableFeedbackInputModel   {
  private Object accountsReceivableFeedbackActionTaskRecord = null;

  private SDAccountsReceivableFeedbackInputModelAccountsReceivableFeedbackActionRecord accountsReceivableFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return accountsReceivableFeedbackActionTaskRecord
  **/

  public Object getAccountsReceivableFeedbackActionTaskRecord() {
    return accountsReceivableFeedbackActionTaskRecord;
  }

  public void setAccountsReceivableFeedbackActionTaskRecord(Object accountsReceivableFeedbackActionTaskRecord) {
    this.accountsReceivableFeedbackActionTaskRecord = accountsReceivableFeedbackActionTaskRecord;
  }


  /**
   * Get accountsReceivableFeedbackActionRecord
   * @return accountsReceivableFeedbackActionRecord
  **/

  public SDAccountsReceivableFeedbackInputModelAccountsReceivableFeedbackActionRecord getAccountsReceivableFeedbackActionRecord() {
    return accountsReceivableFeedbackActionRecord;
  }

  public void setAccountsReceivableFeedbackActionRecord(SDAccountsReceivableFeedbackInputModelAccountsReceivableFeedbackActionRecord accountsReceivableFeedbackActionRecord) {
    this.accountsReceivableFeedbackActionRecord = accountsReceivableFeedbackActionRecord;
  }


}

