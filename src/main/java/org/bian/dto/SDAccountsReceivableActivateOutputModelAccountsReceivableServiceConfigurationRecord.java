package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup;
import org.bian.dto.SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement;
import org.bian.dto.SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecord
 */
public class SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecord   {
  private String accountsReceivableServiceConfigurationSettingReference = null;

  private String accountsReceivableServiceConfigurationSettingDescription = null;

  private SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup accountsReceivableServiceConfigurationSetup = null;

  private SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription accountsReceivableServiceSubscription = null;

  private SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement accountsReceivableServiceAgreement = null;

  private String accountsReceivableServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return accountsReceivableServiceConfigurationSettingReference
  **/

  public String getAccountsReceivableServiceConfigurationSettingReference() {
    return accountsReceivableServiceConfigurationSettingReference;
  }

  public void setAccountsReceivableServiceConfigurationSettingReference(String accountsReceivableServiceConfigurationSettingReference) {
    this.accountsReceivableServiceConfigurationSettingReference = accountsReceivableServiceConfigurationSettingReference;
  }


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

  public SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup getAccountsReceivableServiceConfigurationSetup() {
    return accountsReceivableServiceConfigurationSetup;
  }

  public void setAccountsReceivableServiceConfigurationSetup(SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup accountsReceivableServiceConfigurationSetup) {
    this.accountsReceivableServiceConfigurationSetup = accountsReceivableServiceConfigurationSetup;
  }


  /**
   * Get accountsReceivableServiceSubscription
   * @return accountsReceivableServiceSubscription
  **/

  public SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription getAccountsReceivableServiceSubscription() {
    return accountsReceivableServiceSubscription;
  }

  public void setAccountsReceivableServiceSubscription(SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription accountsReceivableServiceSubscription) {
    this.accountsReceivableServiceSubscription = accountsReceivableServiceSubscription;
  }


  /**
   * Get accountsReceivableServiceAgreement
   * @return accountsReceivableServiceAgreement
  **/

  public SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement getAccountsReceivableServiceAgreement() {
    return accountsReceivableServiceAgreement;
  }

  public void setAccountsReceivableServiceAgreement(SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement accountsReceivableServiceAgreement) {
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

