package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableActivateInputModel
 */
public class SDAccountsReceivableActivateInputModel   {
  private Object accountsReceivableActivationActionTaskRecord = null;

  private String accountsReceivableCenterReference = null;

  private String accountsReceivableServiceReference = null;

  private SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecord accountsReceivableServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return accountsReceivableActivationActionTaskRecord
  **/

  public Object getAccountsReceivableActivationActionTaskRecord() {
    return accountsReceivableActivationActionTaskRecord;
  }

  public void setAccountsReceivableActivationActionTaskRecord(Object accountsReceivableActivationActionTaskRecord) {
    this.accountsReceivableActivationActionTaskRecord = accountsReceivableActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return accountsReceivableCenterReference
  **/

  public String getAccountsReceivableCenterReference() {
    return accountsReceivableCenterReference;
  }

  public void setAccountsReceivableCenterReference(String accountsReceivableCenterReference) {
    this.accountsReceivableCenterReference = accountsReceivableCenterReference;
  }


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
   * Get accountsReceivableServiceConfigurationRecord
   * @return accountsReceivableServiceConfigurationRecord
  **/

  public SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecord getAccountsReceivableServiceConfigurationRecord() {
    return accountsReceivableServiceConfigurationRecord;
  }

  public void setAccountsReceivableServiceConfigurationRecord(SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecord accountsReceivableServiceConfigurationRecord) {
    this.accountsReceivableServiceConfigurationRecord = accountsReceivableServiceConfigurationRecord;
  }


}

