package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement;
import org.bian.dto.SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup;
import org.bian.dto.SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableConfigureOutputModelAccountsReceivableServiceConfigurationRecord
 */
public class SDAccountsReceivableConfigureOutputModelAccountsReceivableServiceConfigurationRecord   {
  private String accountsReceivableServiceConfigurationSettingDescription = null;

  private SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup accountsReceivableServiceConfigurationSetup = null;

  private SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription accountsReceivableServiceSubscription = null;

  private SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement accountsReceivableServiceAgreement = null;

  private String accountsReceivableServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return accountsReceivableServiceConfigurationSettingDescription
  **/

  public String getAccountsReceivableServiceConfigurationSettingDescription() {
    return accountsReceivableServiceConfigurationSettingDescription;
  }

  public void setAccountsReceivableServiceConfigurationSettingDescription(String accountsReceivableServiceConfigurationSettingDescription) {
    this.accountsReceivableServiceConfigurationSettingDescription = accountsReceivableServiceConfigurationSettingDescription;
  }


  /**
   * Get accountsReceivableServiceConfigurationSetup
   * @return accountsReceivableServiceConfigurationSetup
  **/

  public SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup getAccountsReceivableServiceConfigurationSetup() {
    return accountsReceivableServiceConfigurationSetup;
  }

  public void setAccountsReceivableServiceConfigurationSetup(SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup accountsReceivableServiceConfigurationSetup) {
    this.accountsReceivableServiceConfigurationSetup = accountsReceivableServiceConfigurationSetup;
  }


  /**
   * Get accountsReceivableServiceSubscription
   * @return accountsReceivableServiceSubscription
  **/

  public SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription getAccountsReceivableServiceSubscription() {
    return accountsReceivableServiceSubscription;
  }

  public void setAccountsReceivableServiceSubscription(SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription accountsReceivableServiceSubscription) {
    this.accountsReceivableServiceSubscription = accountsReceivableServiceSubscription;
  }


  /**
   * Get accountsReceivableServiceAgreement
   * @return accountsReceivableServiceAgreement
  **/

  public SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement getAccountsReceivableServiceAgreement() {
    return accountsReceivableServiceAgreement;
  }

  public void setAccountsReceivableServiceAgreement(SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement accountsReceivableServiceAgreement) {
    this.accountsReceivableServiceAgreement = accountsReceivableServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return accountsReceivableServiceStatus
  **/

  public String getAccountsReceivableServiceStatus() {
    return accountsReceivableServiceStatus;
  }

  public void setAccountsReceivableServiceStatus(String accountsReceivableServiceStatus) {
    this.accountsReceivableServiceStatus = accountsReceivableServiceStatus;
  }


}

