package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement
 */
public class SDAccountsReceivableConfigureInputModelAccountsReceivableServiceConfigurationRecordAccountsReceivableServiceAgreement   {
  private String accountsReceivableServiceAgreementReference = null;

  private String accountsReceivableServiceUserReference = null;

  private String accountsReceivableServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return accountsReceivableServiceAgreementReference
  **/

  public String getAccountsReceivableServiceAgreementReference() {
    return accountsReceivableServiceAgreementReference;
  }

  public void setAccountsReceivableServiceAgreementReference(String accountsReceivableServiceAgreementReference) {
    this.accountsReceivableServiceAgreementReference = accountsReceivableServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return accountsReceivableServiceUserReference
  **/

  public String getAccountsReceivableServiceUserReference() {
    return accountsReceivableServiceUserReference;
  }

  public void setAccountsReceivableServiceUserReference(String accountsReceivableServiceUserReference) {
    this.accountsReceivableServiceUserReference = accountsReceivableServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return accountsReceivableServiceAgreementTermsandConditions
  **/

  public String getAccountsReceivableServiceAgreementTermsandConditions() {
    return accountsReceivableServiceAgreementTermsandConditions;
  }

  public void setAccountsReceivableServiceAgreementTermsandConditions(String accountsReceivableServiceAgreementTermsandConditions) {
    this.accountsReceivableServiceAgreementTermsandConditions = accountsReceivableServiceAgreementTermsandConditions;
  }


}

