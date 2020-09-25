package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordAccountsReceivableActivityAnalysis;
import org.bian.dto.SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordAccountsReceivablePerformanceAnalysis;
import org.bian.dto.SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecord
 */
public class SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecord   {
  private SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordAccountsReceivableActivityAnalysis accountsReceivableActivityAnalysis = null;

  private SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordAccountsReceivablePerformanceAnalysis accountsReceivablePerformanceAnalysis = null;

  private SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get accountsReceivableActivityAnalysis
   * @return accountsReceivableActivityAnalysis
  **/

  public SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordAccountsReceivableActivityAnalysis getAccountsReceivableActivityAnalysis() {
    return accountsReceivableActivityAnalysis;
  }

  public void setAccountsReceivableActivityAnalysis(SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordAccountsReceivableActivityAnalysis accountsReceivableActivityAnalysis) {
    this.accountsReceivableActivityAnalysis = accountsReceivableActivityAnalysis;
  }


  /**
   * Get accountsReceivablePerformanceAnalysis
   * @return accountsReceivablePerformanceAnalysis
  **/

  public SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordAccountsReceivablePerformanceAnalysis getAccountsReceivablePerformanceAnalysis() {
    return accountsReceivablePerformanceAnalysis;
  }

  public void setAccountsReceivablePerformanceAnalysis(SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordAccountsReceivablePerformanceAnalysis accountsReceivablePerformanceAnalysis) {
    this.accountsReceivablePerformanceAnalysis = accountsReceivablePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDAccountsReceivableRetrieveOutputModelAccountsReceivableRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

