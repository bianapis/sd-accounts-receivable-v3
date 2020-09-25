package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecordAccountsReceivableServicePoliciesandGuidelines
 */
public class SDAccountsReceivableRetrieveOutputModelAccountsReceivableOfferedServiceAccountsReceivableServiceRecordAccountsReceivableServicePoliciesandGuidelines   {
  private String accountsReceivableServiceEligibility = null;

  private String accountsReceivableServiceIntendedUses = null;

  private String accountsReceivableServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return accountsReceivableServiceEligibility
  **/

  public String getAccountsReceivableServiceEligibility() {
    return accountsReceivableServiceEligibility;
  }

  public void setAccountsReceivableServiceEligibility(String accountsReceivableServiceEligibility) {
    this.accountsReceivableServiceEligibility = accountsReceivableServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return accountsReceivableServiceIntendedUses
  **/

  public String getAccountsReceivableServiceIntendedUses() {
    return accountsReceivableServiceIntendedUses;
  }

  public void setAccountsReceivableServiceIntendedUses(String accountsReceivableServiceIntendedUses) {
    this.accountsReceivableServiceIntendedUses = accountsReceivableServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return accountsReceivableServicePricingandTerms
  **/

  public String getAccountsReceivableServicePricingandTerms() {
    return accountsReceivableServicePricingandTerms;
  }

  public void setAccountsReceivableServicePricingandTerms(String accountsReceivableServicePricingandTerms) {
    this.accountsReceivableServicePricingandTerms = accountsReceivableServicePricingandTerms;
  }


}

