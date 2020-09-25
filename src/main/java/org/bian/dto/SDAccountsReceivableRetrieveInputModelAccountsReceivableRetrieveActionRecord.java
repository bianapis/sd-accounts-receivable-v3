package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordAccountsReceivableActivityAnalysis;
import org.bian.dto.SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordAccountsReceivablePerformanceAnalysis;
import org.bian.dto.SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecord
 */
public class SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecord   {
  private SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordAccountsReceivableActivityAnalysis accountsReceivableActivityAnalysis = null;

  private SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordAccountsReceivablePerformanceAnalysis accountsReceivablePerformanceAnalysis = null;

  private SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get accountsReceivableActivityAnalysis
   * @return accountsReceivableActivityAnalysis
  **/

  public SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordAccountsReceivableActivityAnalysis getAccountsReceivableActivityAnalysis() {
    return accountsReceivableActivityAnalysis;
  }

  public void setAccountsReceivableActivityAnalysis(SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordAccountsReceivableActivityAnalysis accountsReceivableActivityAnalysis) {
    this.accountsReceivableActivityAnalysis = accountsReceivableActivityAnalysis;
  }


  /**
   * Get accountsReceivablePerformanceAnalysis
   * @return accountsReceivablePerformanceAnalysis
  **/

  public SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordAccountsReceivablePerformanceAnalysis getAccountsReceivablePerformanceAnalysis() {
    return accountsReceivablePerformanceAnalysis;
  }

  public void setAccountsReceivablePerformanceAnalysis(SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordAccountsReceivablePerformanceAnalysis accountsReceivablePerformanceAnalysis) {
    this.accountsReceivablePerformanceAnalysis = accountsReceivablePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDAccountsReceivableRetrieveInputModelAccountsReceivableRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

