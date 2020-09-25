/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class AccountsReceivableApiServiceImpl implements AccountsReceivableApiService {

	public SDAccountsReceivableActivateOutputModel activate(SDAccountsReceivableActivateInputModel request){
		return JsonReader.read("activate-SDAccountsReceivableActivateOutputModel.json",new TypeReference<SDAccountsReceivableActivateOutputModel>(){});
	}
	
	public SDAccountsReceivableConfigureOutputModel configure(String sdReferenceId, SDAccountsReceivableConfigureInputModel request){
		return JsonReader.read("configure-SDAccountsReceivableConfigureOutputModel.json",new TypeReference<SDAccountsReceivableConfigureOutputModel>(){});
	}
	
	public CRAccountsReceivableProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRAccountsReceivableProcedureControlInputModel request){
		return JsonReader.read("control-CRAccountsReceivableProcedureControlOutputModel.json",new TypeReference<CRAccountsReceivableProcedureControlOutputModel>(){});
	}
	
	public BQBQCustomerNegotiationExchangeOutputModel exchangeBqcustomernegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBQCustomerNegotiationExchangeInputModel request){
		return JsonReader.read("exchange-BQBQCustomerNegotiationExchangeOutputModel.json",new TypeReference<BQBQCustomerNegotiationExchangeOutputModel>(){});
	}
	
	public BQReceivablesEvaluationExchangeOutputModel exchangeReceivablesevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReceivablesEvaluationExchangeInputModel request){
		return JsonReader.read("exchange-BQReceivablesEvaluationExchangeOutputModel.json",new TypeReference<BQReceivablesEvaluationExchangeOutputModel>(){});
	}
	
	public CRAccountsReceivableProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRAccountsReceivableProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRAccountsReceivableProcedureExchangeOutputModel.json",new TypeReference<CRAccountsReceivableProcedureExchangeOutputModel>(){});
	}
	
	public CRAccountsReceivableProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRAccountsReceivableProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRAccountsReceivableProcedureExecuteOutputModel.json",new TypeReference<CRAccountsReceivableProcedureExecuteOutputModel>(){});
	}
	
	public SDAccountsReceivableFeedbackOutputModel feedback(String sdReferenceId, SDAccountsReceivableFeedbackInputModel request){
		return JsonReader.read("feedback-SDAccountsReceivableFeedbackOutputModel.json",new TypeReference<SDAccountsReceivableFeedbackOutputModel>(){});
	}
	
	public CRAccountsReceivableProcedureInitiateOutputModel initiate(String sdReferenceId, CRAccountsReceivableProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRAccountsReceivableProcedureInitiateOutputModel.json",new TypeReference<CRAccountsReceivableProcedureInitiateOutputModel>(){});
	}
	
	public BQCustomerNegotiationInitiateOutputModel initiateCustomernegotiation(String sdReferenceId, String crReferenceId, BQCustomerNegotiationInitiateInputModel request){
		return JsonReader.read("initiate-BQCustomerNegotiationInitiateOutputModel.json",new TypeReference<BQCustomerNegotiationInitiateOutputModel>(){});
	}
	
	public BQPaymentInitiateOutputModel initiatePayment(String sdReferenceId, String crReferenceId, BQPaymentInitiateInputModel request){
		return JsonReader.read("initiate-BQPaymentInitiateOutputModel.json",new TypeReference<BQPaymentInitiateOutputModel>(){});
	}
	
	public BQReceivablesEvaluationInitiateOutputModel initiateReceivablesevaluation(String sdReferenceId, String crReferenceId, BQReceivablesEvaluationInitiateInputModel request){
		return JsonReader.read("initiate-BQReceivablesEvaluationInitiateOutputModel.json",new TypeReference<BQReceivablesEvaluationInitiateOutputModel>(){});
	}
	
	public BQResolutionInitiateOutputModel initiateResolution(String sdReferenceId, String crReferenceId, BQResolutionInitiateInputModel request){
		return JsonReader.read("initiate-BQResolutionInitiateOutputModel.json",new TypeReference<BQResolutionInitiateOutputModel>(){});
	}
	
	public BQBQCustomerNegotiationRequestOutputModel requestBqcustomernegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBQCustomerNegotiationRequestInputModel request){
		return JsonReader.read("request-BQBQCustomerNegotiationRequestOutputModel.json",new TypeReference<BQBQCustomerNegotiationRequestOutputModel>(){});
	}
	
	public CRAccountsReceivableProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRAccountsReceivableProcedureRequestInputModel request){
		return JsonReader.read("request-CRAccountsReceivableProcedureRequestOutputModel.json",new TypeReference<CRAccountsReceivableProcedureRequestOutputModel>(){});
	}
	
	public CRAccountsReceivableProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRAccountsReceivableProcedureRetrieveOutputModel.json",new TypeReference<CRAccountsReceivableProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQBQCustomerNegotiationRetrieveOutputModel retrieveBqcustomernegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBQCustomerNegotiationRetrieveOutputModel.json",new TypeReference<BQBQCustomerNegotiationRetrieveOutputModel>(){});
	}
	
	public BQPaymentRetrieveOutputModel retrievePayment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentRetrieveOutputModel.json",new TypeReference<BQPaymentRetrieveOutputModel>(){});
	}
	
	public BQReceivablesEvaluationRetrieveOutputModel retrieveReceivablesevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReceivablesEvaluationRetrieveOutputModel.json",new TypeReference<BQReceivablesEvaluationRetrieveOutputModel>(){});
	}
	
	public BQResolutionRetrieveOutputModel retrieveResolution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQResolutionRetrieveOutputModel.json",new TypeReference<BQResolutionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDAccountsReceivableRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDAccountsReceivableRetrieveOutputModel.json",new TypeReference<SDAccountsReceivableRetrieveOutputModel>(){});
	}
	
	public CRAccountsReceivableProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRAccountsReceivableProcedureUpdateInputModel request){
		return JsonReader.read("update-CRAccountsReceivableProcedureUpdateOutputModel.json",new TypeReference<CRAccountsReceivableProcedureUpdateOutputModel>(){});
	}
	
	public BQBQCustomerNegotiationUpdateOutputModel updateBqcustomernegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBQCustomerNegotiationUpdateInputModel request){
		return JsonReader.read("update-BQBQCustomerNegotiationUpdateOutputModel.json",new TypeReference<BQBQCustomerNegotiationUpdateOutputModel>(){});
	}
	
	public BQPaymentUpdateOutputModel updatePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentUpdateInputModel request){
		return JsonReader.read("update-BQPaymentUpdateOutputModel.json",new TypeReference<BQPaymentUpdateOutputModel>(){});
	}
	
	public BQReceivablesEvaluationUpdateOutputModel updateReceivablesevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReceivablesEvaluationUpdateInputModel request){
		return JsonReader.read("update-BQReceivablesEvaluationUpdateOutputModel.json",new TypeReference<BQReceivablesEvaluationUpdateOutputModel>(){});
	}
	
	public BQResolutionUpdateOutputModel updateResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionUpdateInputModel request){
		return JsonReader.read("update-BQResolutionUpdateOutputModel.json",new TypeReference<BQResolutionUpdateOutputModel>(){});
	}
	
}
