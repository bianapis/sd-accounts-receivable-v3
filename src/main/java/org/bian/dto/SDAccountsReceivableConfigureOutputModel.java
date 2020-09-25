package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableConfigureOutputModelAccountsReceivableServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableConfigureOutputModel
 */
public class SDAccountsReceivableConfigureOutputModel   {
  private String accountsReceivableConfigurationActionTaskReference = null;

  private Object accountsReceivableConfigurationActionTaskRecord = null;

  private SDAccountsReceivableConfigureOutputModelAccountsReceivableServiceConfigurationRecord accountsReceivableServiceConfigurationRecord = null;

  private String accountsReceivableServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return accountsReceivableConfigurationActionTaskReference
  **/

  public String getAccountsReceivableConfigurationActionTaskReference() {
    return accountsReceivableConfigurationActionTaskReference;
  }

  public void setAccountsReceivableConfigurationActionTaskReference(String accountsReceivableConfigurationActionTaskReference) {
    this.accountsReceivableConfigurationActionTaskReference = accountsReceivableConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return accountsReceivableConfigurationActionTaskRecord
  **/

  public Object getAccountsReceivableConfigurationActionTaskRecord() {
    return accountsReceivableConfigurationActionTaskRecord;
  }

  public void setAccountsReceivableConfigurationActionTaskRecord(Object accountsReceivableConfigurationActionTaskRecord) {
    this.accountsReceivableConfigurationActionTaskRecord = accountsReceivableConfigurationActionTaskRecord;
  }


  /**
   * Get accountsReceivableServiceConfigurationRecord
   * @return accountsReceivableServiceConfigurationRecord
  **/

  public SDAccountsReceivableConfigureOutputModelAccountsReceivableServiceConfigurationRecord getAccountsReceivableServiceConfigurationRecord() {
    return accountsReceivableServiceConfigurationRecord;
  }

  public void setAccountsReceivableServiceConfigurationRecord(SDAccountsReceivableConfigureOutputModelAccountsReceivableServiceConfigurationRecord accountsReceivableServiceConfigurationRecord) {
    this.accountsReceivableServiceConfigurationRecord = accountsReceivableServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return accountsReceivableServicingSessionStatus
  **/

  public String getAccountsReceivableServicingSessionStatus() {
    return accountsReceivableServicingSessionStatus;
  }

  public void setAccountsReceivableServicingSessionStatus(String accountsReceivableServicingSessionStatus) {
    this.accountsReceivableServicingSessionStatus = accountsReceivableServicingSessionStatus;
  }


}

