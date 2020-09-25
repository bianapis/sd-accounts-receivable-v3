package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableActivateOutputModel
 */
public class SDAccountsReceivableActivateOutputModel   {
  private String accountsReceivableActivationActionTaskReference = null;

  private Object accountsReceivableActivationActionTaskRecord = null;

  private String accountsReceivableServicingSessionReference = null;

  private Object accountsReceivableServicingSessionRecord = null;

  private SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecord accountsReceivableServiceConfigurationRecord = null;

  private String accountsReceivableServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return accountsReceivableActivationActionTaskReference
  **/

  public String getAccountsReceivableActivationActionTaskReference() {
    return accountsReceivableActivationActionTaskReference;
  }

  public void setAccountsReceivableActivationActionTaskReference(String accountsReceivableActivationActionTaskReference) {
    this.accountsReceivableActivationActionTaskReference = accountsReceivableActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return accountsReceivableServicingSessionRecord
  **/

  public Object getAccountsReceivableServicingSessionRecord() {
    return accountsReceivableServicingSessionRecord;
  }

  public void setAccountsReceivableServicingSessionRecord(Object accountsReceivableServicingSessionRecord) {
    this.accountsReceivableServicingSessionRecord = accountsReceivableServicingSessionRecord;
  }


  /**
   * Get accountsReceivableServiceConfigurationRecord
   * @return accountsReceivableServiceConfigurationRecord
  **/

  public SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecord getAccountsReceivableServiceConfigurationRecord() {
    return accountsReceivableServiceConfigurationRecord;
  }

  public void setAccountsReceivableServiceConfigurationRecord(SDAccountsReceivableActivateOutputModelAccountsReceivableServiceConfigurationRecord accountsReceivableServiceConfigurationRecord) {
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

