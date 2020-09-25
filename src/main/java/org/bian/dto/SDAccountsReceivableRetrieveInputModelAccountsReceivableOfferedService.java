package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableRetrieveInputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecord;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableRetrieveInputModelAccountsReceivableOfferedService
 */
public class SDAccountsReceivableRetrieveInputModelAccountsReceivableOfferedService   {
  private String accountsReceivableServiceReference = null;

  private SDAccountsReceivableRetrieveInputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecord accountsReceivableServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return accountsReceivableServiceReference
  **/

  public String getAccountsReceivableServiceReference() {
    return accountsReceivableServiceReference;
  }

  public void setAccountsReceivableServiceReference(String accountsReceivableServiceReference) {
    this.accountsReceivableServiceReference = accountsReceivableServiceReference;
  }


  /**
   * Get accountsReceivableServiceRecord
   * @return accountsReceivableServiceRecord
  **/

  public SDAccountsReceivableRetrieveInputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecord getAccountsReceivableServiceRecord() {
    return accountsReceivableServiceRecord;
  }

  public void setAccountsReceivableServiceRecord(SDAccountsReceivableRetrieveInputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecord accountsReceivableServiceRecord) {
    this.accountsReceivableServiceRecord = accountsReceivableServiceRecord;
  }


}

