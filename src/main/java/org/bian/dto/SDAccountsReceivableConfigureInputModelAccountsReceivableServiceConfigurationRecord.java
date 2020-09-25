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
 * SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecord
 */
public class SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecord   {
  private String accountsReceivableServiceConfigurationSettingReference = null;

  private String accountsReceivableServiceConfigurationSettingType = null;

  private SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup accountsReceivableServiceConfigurationSetup = null;

  private SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceSubscription accountsReceivableServiceSubscription = null;

  private SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement accountsReceivableServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return accountsReceivableServiceConfigurationSettingType
  **/

  public String getAccountsReceivableServiceConfigurationSettingType() {
    return accountsReceivableServiceConfigurationSettingType;
  }

  public void setAccountsReceivableServiceConfigurationSettingType(String accountsReceivableServiceConfigurationSettingType) {
    this.accountsReceivableServiceConfigurationSettingType = accountsReceivableServiceConfigurationSettingType;
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


}

