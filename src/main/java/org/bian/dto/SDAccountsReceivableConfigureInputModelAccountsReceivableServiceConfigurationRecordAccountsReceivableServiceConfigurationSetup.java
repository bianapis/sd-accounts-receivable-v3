package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup
 */
public class SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup   {
  private String accountsReceivableServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return accountsReceivableServiceConfigurationParameter
  **/

  public String getAccountsReceivableServiceConfigurationParameter() {
    return accountsReceivableServiceConfigurationParameter;
  }

  public void setAccountsReceivableServiceConfigurationParameter(String accountsReceivableServiceConfigurationParameter) {
    this.accountsReceivableServiceConfigurationParameter = accountsReceivableServiceConfigurationParameter;
  }


}

