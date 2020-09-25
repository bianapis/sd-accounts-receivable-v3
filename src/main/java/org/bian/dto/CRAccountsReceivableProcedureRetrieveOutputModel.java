package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceAnalysis;
import org.bian.dto.CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRAccountsReceivableProcedureRetrieveOutputModel
 */
public class CRAccountsReceivableProcedureRetrieveOutputModel   {
  private String accountsReceivableProcedureParameterType = null;

  private String accountsReceivableProcedureSelectedOption = null;

  private String accountsReceivableProcedureRequest = null;

  private String accountsReceivableProcedureSchedule = null;

  private String accountsReceivableProcedureStatus = null;

  private String accountsReceivableProcedureReference = null;

  private String accountsReceivableProcedureBusinessUnitReference = null;

  private String accountsReceivableProcedureServiceProviderReference = null;

  private String accountsReceivableProcedureFinancialFacilityReference = null;

  private String accountsReceivableProcedureEmployeeReference = null;

  private String accountsReceivableProcedureCustomerReference = null;

  private String accountsReceivableProcedureType = null;

  private String accountsReceivableProcedureServiceProviderSchedule = null;

  private String accountsReceivableProcedureServiceType = null;

  private String accountsReceivableProcedureProductandServiceType = null;

  private String accountsReceivableProcedureProductandServiceInstance = null;

  private String accountsReceivableProcedureTransactionType = null;

  private String accountsReceivableProcedureFinancialTransactionArrangement = null;

  private String accountsReceivableProcedureCustomerAgreementReference = null;

  private String accountsReceivableProcedureRetrieveActionTaskReference = null;

  private Object accountsReceivableProcedureRetrieveActionTaskRecord = null;

  private String accountsReceivableProcedureRetrieveActionResponse = null;

  private CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceReportRecord accountsReceivableProcedureInstanceReportRecord = null;

  private CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceAnalysis accountsReceivableProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Accounts Receivable Procedure 
   * @return accountsReceivableProcedureParameterType
  **/

  public String getAccountsReceivableProcedureParameterType() {
    return accountsReceivableProcedureParameterType;
  }

  public void setAccountsReceivableProcedureParameterType(String accountsReceivableProcedureParameterType) {
    this.accountsReceivableProcedureParameterType = accountsReceivableProcedureParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Accounts Receivable Procedure 
   * @return accountsReceivableProcedureSelectedOption
  **/

  public String getAccountsReceivableProcedureSelectedOption() {
    return accountsReceivableProcedureSelectedOption;
  }

  public void setAccountsReceivableProcedureSelectedOption(String accountsReceivableProcedureSelectedOption) {
    this.accountsReceivableProcedureSelectedOption = accountsReceivableProcedureSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to process AccountsReceivable 
   * @return accountsReceivableProcedureRequest
  **/

  public String getAccountsReceivableProcedureRequest() {
    return accountsReceivableProcedureRequest;
  }

  public void setAccountsReceivableProcedureRequest(String accountsReceivableProcedureRequest) {
    this.accountsReceivableProcedureRequest = accountsReceivableProcedureRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to process AccountsReceivable 
   * @return accountsReceivableProcedureSchedule
  **/

  public String getAccountsReceivableProcedureSchedule() {
    return accountsReceivableProcedureSchedule;
  }

  public void setAccountsReceivableProcedureSchedule(String accountsReceivableProcedureSchedule) {
    this.accountsReceivableProcedureSchedule = accountsReceivableProcedureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Accounts Receivable Procedure 
   * @return accountsReceivableProcedureStatus
  **/

  public String getAccountsReceivableProcedureStatus() {
    return accountsReceivableProcedureStatus;
  }

  public void setAccountsReceivableProcedureStatus(String accountsReceivableProcedureStatus) {
    this.accountsReceivableProcedureStatus = accountsReceivableProcedureStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is involved in Accounts Receivable Procedure 
   * @return accountsReceivableProcedureReference
  **/

  public String getAccountsReceivableProcedureReference() {
    return accountsReceivableProcedureReference;
  }

  public void setAccountsReceivableProcedureReference(String accountsReceivableProcedureReference) {
    this.accountsReceivableProcedureReference = accountsReceivableProcedureReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit which is involved in Accounts Receivable Procedure 
   * @return accountsReceivableProcedureBusinessUnitReference
  **/

  public String getAccountsReceivableProcedureBusinessUnitReference() {
    return accountsReceivableProcedureBusinessUnitReference;
  }

  public void setAccountsReceivableProcedureBusinessUnitReference(String accountsReceivableProcedureBusinessUnitReference) {
    this.accountsReceivableProcedureBusinessUnitReference = accountsReceivableProcedureBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is the service provider of Accounts Receivable Procedure 
   * @return accountsReceivableProcedureServiceProviderReference
  **/

  public String getAccountsReceivableProcedureServiceProviderReference() {
    return accountsReceivableProcedureServiceProviderReference;
  }

  public void setAccountsReceivableProcedureServiceProviderReference(String accountsReceivableProcedureServiceProviderReference) {
    this.accountsReceivableProcedureServiceProviderReference = accountsReceivableProcedureServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Facility related to Accounts Receivable Procedure  
   * @return accountsReceivableProcedureFinancialFacilityReference
  **/

  public String getAccountsReceivableProcedureFinancialFacilityReference() {
    return accountsReceivableProcedureFinancialFacilityReference;
  }

  public void setAccountsReceivableProcedureFinancialFacilityReference(String accountsReceivableProcedureFinancialFacilityReference) {
    this.accountsReceivableProcedureFinancialFacilityReference = accountsReceivableProcedureFinancialFacilityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee who is involved in Accounts Receivable Procedure 
   * @return accountsReceivableProcedureEmployeeReference
  **/

  public String getAccountsReceivableProcedureEmployeeReference() {
    return accountsReceivableProcedureEmployeeReference;
  }

  public void setAccountsReceivableProcedureEmployeeReference(String accountsReceivableProcedureEmployeeReference) {
    this.accountsReceivableProcedureEmployeeReference = accountsReceivableProcedureEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer who is involved in Accounts Receivable Procedure 
   * @return accountsReceivableProcedureCustomerReference
  **/

  public String getAccountsReceivableProcedureCustomerReference() {
    return accountsReceivableProcedureCustomerReference;
  }

  public void setAccountsReceivableProcedureCustomerReference(String accountsReceivableProcedureCustomerReference) {
    this.accountsReceivableProcedureCustomerReference = accountsReceivableProcedureCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of process undertaken within Accounts Receivable Procedure 
   * @return accountsReceivableProcedureType
  **/

  public String getAccountsReceivableProcedureType() {
    return accountsReceivableProcedureType;
  }

  public void setAccountsReceivableProcedureType(String accountsReceivableProcedureType) {
    this.accountsReceivableProcedureType = accountsReceivableProcedureType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule according to which the service provider will process the Accounts Receivable Procedure 
   * @return accountsReceivableProcedureServiceProviderSchedule
  **/

  public String getAccountsReceivableProcedureServiceProviderSchedule() {
    return accountsReceivableProcedureServiceProviderSchedule;
  }

  public void setAccountsReceivableProcedureServiceProviderSchedule(String accountsReceivableProcedureServiceProviderSchedule) {
    this.accountsReceivableProcedureServiceProviderSchedule = accountsReceivableProcedureServiceProviderSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of services in Accounts Receivable Procedure  
   * @return accountsReceivableProcedureServiceType
  **/

  public String getAccountsReceivableProcedureServiceType() {
    return accountsReceivableProcedureServiceType;
  }

  public void setAccountsReceivableProcedureServiceType(String accountsReceivableProcedureServiceType) {
    this.accountsReceivableProcedureServiceType = accountsReceivableProcedureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of products/services related to Accounts Receivable Procedure  
   * @return accountsReceivableProcedureProductandServiceType
  **/

  public String getAccountsReceivableProcedureProductandServiceType() {
    return accountsReceivableProcedureProductandServiceType;
  }

  public void setAccountsReceivableProcedureProductandServiceType(String accountsReceivableProcedureProductandServiceType) {
    this.accountsReceivableProcedureProductandServiceType = accountsReceivableProcedureProductandServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the product or service that is related to Accounts Receivable Procedure 
   * @return accountsReceivableProcedureProductandServiceInstance
  **/

  public String getAccountsReceivableProcedureProductandServiceInstance() {
    return accountsReceivableProcedureProductandServiceInstance;
  }

  public void setAccountsReceivableProcedureProductandServiceInstance(String accountsReceivableProcedureProductandServiceInstance) {
    this.accountsReceivableProcedureProductandServiceInstance = accountsReceivableProcedureProductandServiceInstance;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of transactions in Accounts Receivable Procedure  
   * @return accountsReceivableProcedureTransactionType
  **/

  public String getAccountsReceivableProcedureTransactionType() {
    return accountsReceivableProcedureTransactionType;
  }

  public void setAccountsReceivableProcedureTransactionType(String accountsReceivableProcedureTransactionType) {
    this.accountsReceivableProcedureTransactionType = accountsReceivableProcedureTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the Financial Transaction Arrangement that is related to Accounts Receivable Procedure  
   * @return accountsReceivableProcedureFinancialTransactionArrangement
  **/

  public String getAccountsReceivableProcedureFinancialTransactionArrangement() {
    return accountsReceivableProcedureFinancialTransactionArrangement;
  }

  public void setAccountsReceivableProcedureFinancialTransactionArrangement(String accountsReceivableProcedureFinancialTransactionArrangement) {
    this.accountsReceivableProcedureFinancialTransactionArrangement = accountsReceivableProcedureFinancialTransactionArrangement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Agreement that is related to Accounts Receivable Procedure  
   * @return accountsReceivableProcedureCustomerAgreementReference
  **/

  public String getAccountsReceivableProcedureCustomerAgreementReference() {
    return accountsReceivableProcedureCustomerAgreementReference;
  }

  public void setAccountsReceivableProcedureCustomerAgreementReference(String accountsReceivableProcedureCustomerAgreementReference) {
    this.accountsReceivableProcedureCustomerAgreementReference = accountsReceivableProcedureCustomerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Accounts Receivable Procedure instance retrieve service call 
   * @return accountsReceivableProcedureRetrieveActionTaskReference
  **/

  public String getAccountsReceivableProcedureRetrieveActionTaskReference() {
    return accountsReceivableProcedureRetrieveActionTaskReference;
  }

  public void setAccountsReceivableProcedureRetrieveActionTaskReference(String accountsReceivableProcedureRetrieveActionTaskReference) {
    this.accountsReceivableProcedureRetrieveActionTaskReference = accountsReceivableProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountsReceivableProcedureRetrieveActionTaskRecord
  **/

  public Object getAccountsReceivableProcedureRetrieveActionTaskRecord() {
    return accountsReceivableProcedureRetrieveActionTaskRecord;
  }

  public void setAccountsReceivableProcedureRetrieveActionTaskRecord(Object accountsReceivableProcedureRetrieveActionTaskRecord) {
    this.accountsReceivableProcedureRetrieveActionTaskRecord = accountsReceivableProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return accountsReceivableProcedureRetrieveActionResponse
  **/

  public String getAccountsReceivableProcedureRetrieveActionResponse() {
    return accountsReceivableProcedureRetrieveActionResponse;
  }

  public void setAccountsReceivableProcedureRetrieveActionResponse(String accountsReceivableProcedureRetrieveActionResponse) {
    this.accountsReceivableProcedureRetrieveActionResponse = accountsReceivableProcedureRetrieveActionResponse;
  }


  /**
   * Get accountsReceivableProcedureInstanceReportRecord
   * @return accountsReceivableProcedureInstanceReportRecord
  **/

  public CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceReportRecord getAccountsReceivableProcedureInstanceReportRecord() {
    return accountsReceivableProcedureInstanceReportRecord;
  }

  public void setAccountsReceivableProcedureInstanceReportRecord(CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceReportRecord accountsReceivableProcedureInstanceReportRecord) {
    this.accountsReceivableProcedureInstanceReportRecord = accountsReceivableProcedureInstanceReportRecord;
  }


  /**
   * Get accountsReceivableProcedureInstanceAnalysis
   * @return accountsReceivableProcedureInstanceAnalysis
  **/

  public CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceAnalysis getAccountsReceivableProcedureInstanceAnalysis() {
    return accountsReceivableProcedureInstanceAnalysis;
  }

  public void setAccountsReceivableProcedureInstanceAnalysis(CRAccountsReceivableProcedureRetrieveOutputModelAccountsReceivableProcedureInstanceAnalysis accountsReceivableProcedureInstanceAnalysis) {
    this.accountsReceivableProcedureInstanceAnalysis = accountsReceivableProcedureInstanceAnalysis;
  }


}

