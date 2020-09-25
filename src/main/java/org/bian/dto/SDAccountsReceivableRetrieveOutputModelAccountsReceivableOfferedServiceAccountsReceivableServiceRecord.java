package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecordAccountsReceivableServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecord
 */
public class SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecord   {
  private String accountsReceivableServiceType = null;

  private String accountsReceivableServiceVersion = null;

  private String accountsReceivableServiceDescription = null;

  private SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecordAccountsReceivableServicePoliciesandGuidelines accountsReceivableServicePoliciesandGuidelines = null;

  private String accountsReceivableServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return accountsReceivableServiceType
  **/

  public String getAccountsReceivableServiceType() {
    return accountsReceivableServiceType;
  }

  public void setAccountsReceivableServiceType(String accountsReceivableServiceType) {
    this.accountsReceivableServiceType = accountsReceivableServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return accountsReceivableServiceVersion
  **/

  public String getAccountsReceivableServiceVersion() {
    return accountsReceivableServiceVersion;
  }

  public void setAccountsReceivableServiceVersion(String accountsReceivableServiceVersion) {
    this.accountsReceivableServiceVersion = accountsReceivableServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return accountsReceivableServiceDescription
  **/

  public String getAccountsReceivableServiceDescription() {
    return accountsReceivableServiceDescription;
  }

  public void setAccountsReceivableServiceDescription(String accountsReceivableServiceDescription) {
    this.accountsReceivableServiceDescription = accountsReceivableServiceDescription;
  }


  /**
   * Get accountsReceivableServicePoliciesandGuidelines
   * @return accountsReceivableServicePoliciesandGuidelines
  **/

  public SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecordAccountsReceivableServicePoliciesandGuidelines getAccountsReceivableServicePoliciesandGuidelines() {
    return accountsReceivableServicePoliciesandGuidelines;
  }

  public void setAccountsReceivableServicePoliciesandGuidelines(SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecordAccountsReceivableServicePoliciesandGuidelines accountsReceivableServicePoliciesandGuidelines) {
    this.accountsReceivableServicePoliciesandGuidelines = accountsReceivableServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return accountsReceivableServiceSchedule
  **/

  public String getAccountsReceivableServiceSchedule() {
    return accountsReceivableServiceSchedule;
  }

  public void setAccountsReceivableServiceSchedule(String accountsReceivableServiceSchedule) {
    this.accountsReceivableServiceSchedule = accountsReceivableServiceSchedule;
  }


}

