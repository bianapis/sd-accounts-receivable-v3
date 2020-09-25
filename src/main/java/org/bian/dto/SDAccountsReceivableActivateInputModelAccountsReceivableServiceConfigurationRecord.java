package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecord
 */
public class SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecord   {
  private String accountsReceivableServiceConfigurationSettingReference = null;

  private String accountsReceivableServiceConfigurationSettingType = null;

  private SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup accountsReceivableServiceConfigurationSetup = null;


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

  public SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup getAccountsReceivableServiceConfigurationSetup() {
    return accountsReceivableServiceConfigurationSetup;
  }

  public void setAccountsReceivableServiceConfigurationSetup(SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup accountsReceivableServiceConfigurationSetup) {
    this.accountsReceivableServiceConfigurationSetup = accountsReceivableServiceConfigurationSetup;
  }


}

