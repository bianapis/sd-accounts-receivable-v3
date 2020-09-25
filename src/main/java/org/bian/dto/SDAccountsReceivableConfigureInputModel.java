package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableConfigureInputModel
 */
public class SDAccountsReceivableConfigureInputModel   {
  private Object accountsReceivableConfigurationActionTaskRecord = null;

  private String accountsReceivableServicingSessionReference = null;

  private String accountsReceivableServiceReference = null;

  private SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecord accountsReceivableServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return accountsReceivableServicingSessionReference
  **/

  public String getAccountsReceivableServicingSessionReference() {
    return accountsReceivableServicingSessionReference;
  }

  public void setAccountsReceivableServicingSessionReference(String accountsReceivableServicingSessionReference) {
    this.accountsReceivableServicingSessionReference = accountsReceivableServicingSessionReference;
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

  public SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecord getAccountsReceivableServiceConfigurationRecord() {
    return accountsReceivableServiceConfigurationRecord;
  }

  public void setAccountsReceivableServiceConfigurationRecord(SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecord accountsReceivableServiceConfigurationRecord) {
    this.accountsReceivableServiceConfigurationRecord = accountsReceivableServiceConfigurationRecord;
  }


}

