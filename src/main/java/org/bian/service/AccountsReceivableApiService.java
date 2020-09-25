/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AccountsReceivableApiService {

	SDAccountsReceivableActivateOutputModel activate(SDAccountsReceivableActivateInputModel request);
	
	SDAccountsReceivableConfigureOutputModel configure(String sdReferenceId, SDAccountsReceivableConfigureInputModel request);
	
	CRAccountsReceivableProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRAccountsReceivableProcedureControlInputModel request);
	
	BQBQCustomerNegotiationExchangeOutputModel exchangeBqcustomernegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBQCustomerNegotiationExchangeInputModel request);
	
	BQReceivablesEvaluationExchangeOutputModel exchangeReceivablesevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReceivablesEvaluationExchangeInputModel request);
	
	CRAccountsReceivableProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRAccountsReceivableProcedureExchangeInputModel request);
	
	CRAccountsReceivableProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRAccountsReceivableProcedureExecuteInputModel request);
	
	SDAccountsReceivableFeedbackOutputModel feedback(String sdReferenceId, SDAccountsReceivableFeedbackInputModel request);
	
	CRAccountsReceivableProcedureInitiateOutputModel initiate(String sdReferenceId, CRAccountsReceivableProcedureInitiateInputModel request);
	
	BQCustomerNegotiationInitiateOutputModel initiateCustomernegotiation(String sdReferenceId, String crReferenceId, BQCustomerNegotiationInitiateInputModel request);
	
	BQPaymentInitiateOutputModel initiatePayment(String sdReferenceId, String crReferenceId, BQPaymentInitiateInputModel request);
	
	BQReceivablesEvaluationInitiateOutputModel initiateReceivablesevaluation(String sdReferenceId, String crReferenceId, BQReceivablesEvaluationInitiateInputModel request);
	
	BQResolutionInitiateOutputModel initiateResolution(String sdReferenceId, String crReferenceId, BQResolutionInitiateInputModel request);
	
	BQBQCustomerNegotiationRequestOutputModel requestBqcustomernegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBQCustomerNegotiationRequestInputModel request);
	
	CRAccountsReceivableProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRAccountsReceivableProcedureRequestInputModel request);
	
	CRAccountsReceivableProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQBQCustomerNegotiationRetrieveOutputModel retrieveBqcustomernegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentRetrieveOutputModel retrievePayment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReceivablesEvaluationRetrieveOutputModel retrieveReceivablesevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQResolutionRetrieveOutputModel retrieveResolution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDAccountsReceivableRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRAccountsReceivableProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRAccountsReceivableProcedureUpdateInputModel request);
	
	BQBQCustomerNegotiationUpdateOutputModel updateBqcustomernegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBQCustomerNegotiationUpdateInputModel request);
	
	BQPaymentUpdateOutputModel updatePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentUpdateInputModel request);
	
	BQReceivablesEvaluationUpdateOutputModel updateReceivablesevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReceivablesEvaluationUpdateInputModel request);
	
	BQResolutionUpdateOutputModel updateResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionUpdateInputModel request);
	
}
