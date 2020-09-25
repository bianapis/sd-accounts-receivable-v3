package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription
 */
public class SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription   {
  private String accountsReceivableServiceSubscriberReference = null;

  private String accountsReceivableServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return accountsReceivableServiceSubscriberReference
  **/

  public String getAccountsReceivableServiceSubscriberReference() {
    return accountsReceivableServiceSubscriberReference;
  }

  public void setAccountsReceivableServiceSubscriberReference(String accountsReceivableServiceSubscriberReference) {
    this.accountsReceivableServiceSubscriberReference = accountsReceivableServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return accountsReceivableServiceSubscriberAccessProfile
  **/

  public String getAccountsReceivableServiceSubscriberAccessProfile() {
    return accountsReceivableServiceSubscriberAccessProfile;
  }

  public void setAccountsReceivableServiceSubscriberAccessProfile(String accountsReceivableServiceSubscriberAccessProfile) {
    this.accountsReceivableServiceSubscriberAccessProfile = accountsReceivableServiceSubscriberAccessProfile;
  }


}

