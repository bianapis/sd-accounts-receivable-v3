package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecord;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedService
 */
public class SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedService   {
  private String accountsReceivableServiceReference = null;

  private SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecord accountsReceivableServiceRecord = null;


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

  public SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecord getAccountsReceivableServiceRecord() {
    return accountsReceivableServiceRecord;
  }

  public void setAccountsReceivableServiceRecord(SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecord accountsReceivableServiceRecord) {
    this.accountsReceivableServiceRecord = accountsReceivableServiceRecord;
  }


}

