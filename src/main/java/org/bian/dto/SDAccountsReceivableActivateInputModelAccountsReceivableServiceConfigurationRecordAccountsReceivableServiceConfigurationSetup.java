package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup
 */
public class SDAccountsReceivableActivateInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceConfigurationSetup   {
  private String accountsReceivableServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return accountsReceivableServiceConfigurationParameter
  **/

  public String getAccountsReceivableServiceConfigurationParameter() {
    return accountsReceivableServiceConfigurationParameter;
  }

  public void setAccountsReceivableServiceConfigurationParameter(String accountsReceivableServiceConfigurationParameter) {
    this.accountsReceivableServiceConfigurationParameter = accountsReceivableServiceConfigurationParameter;
  }


}

