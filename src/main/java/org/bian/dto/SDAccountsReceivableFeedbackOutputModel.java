package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableFeedbackOutputModelAccountsReceivableFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableFeedbackOutputModel
 */
public class SDAccountsReceivableFeedbackOutputModel   {
  private String accountsReceivableFeedbackActionTaskReference = null;

  private Object accountsReceivableFeedbackActionTaskRecord = null;

  private SDAccountsReceivableFeedbackOutputModelAccountsReceivableFeedbackActionRecord accountsReceivableFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return accountsReceivableFeedbackActionTaskReference
  **/

  public String getAccountsReceivableFeedbackActionTaskReference() {
    return accountsReceivableFeedbackActionTaskReference;
  }

  public void setAccountsReceivableFeedbackActionTaskReference(String accountsReceivableFeedbackActionTaskReference) {
    this.accountsReceivableFeedbackActionTaskReference = accountsReceivableFeedbackActionTaskReference;
  }


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

  public SDAccountsReceivableFeedbackOutputModelAccountsReceivableFeedbackActionRecord getAccountsReceivableFeedbackActionRecord() {
    return accountsReceivableFeedbackActionRecord;
  }

  public void setAccountsReceivableFeedbackActionRecord(SDAccountsReceivableFeedbackOutputModelAccountsReceivableFeedbackActionRecord accountsReceivableFeedbackActionRecord) {
    this.accountsReceivableFeedbackActionRecord = accountsReceivableFeedbackActionRecord;
  }


}

