/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class AccountsReceivableApiController {

	@Autowired
	AccountsReceivableApiService service;
	
	@Process.Activate
	public BianResponse<SDAccountsReceivableActivateOutputModel> activate(@RequestBody BianRequest<SDAccountsReceivableActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDAccountsReceivableConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDAccountsReceivableConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRAccountsReceivableProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAccountsReceivableProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("bqcustomernegotiation")
	@Process.Exchange
	public BianResponse<BQBQCustomerNegotiationExchangeOutputModel> exchangeBqcustomernegotiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBQCustomerNegotiationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeBqcustomernegotiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("receivablesevaluation")
	@Process.Exchange
	public BianResponse<BQReceivablesEvaluationExchangeOutputModel> exchangeReceivablesevaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReceivablesEvaluationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeReceivablesevaluation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Exchange
	public BianResponse<CRAccountsReceivableProcedureExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAccountsReceivableProcedureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Execute
	public BianResponse<CRAccountsReceivableProcedureExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAccountsReceivableProcedureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDAccountsReceivableFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDAccountsReceivableFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRAccountsReceivableProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRAccountsReceivableProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("customernegotiation")
	@Process.Initiate
	public BianResponse<BQCustomerNegotiationInitiateOutputModel> initiateCustomernegotiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCustomerNegotiationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCustomernegotiation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment")
	@Process.Initiate
	public BianResponse<BQPaymentInitiateOutputModel> initiatePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPaymentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiatePayment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("receivablesevaluation")
	@Process.Initiate
	public BianResponse<BQReceivablesEvaluationInitiateOutputModel> initiateReceivablesevaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQReceivablesEvaluationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateReceivablesevaluation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("resolution")
	@Process.Initiate
	public BianResponse<BQResolutionInitiateOutputModel> initiateResolution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQResolutionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateResolution(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("bqcustomernegotiation")
	@Process.Request
	public BianResponse<BQBQCustomerNegotiationRequestOutputModel> requestBqcustomernegotiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBQCustomerNegotiationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestBqcustomernegotiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Request
	public BianResponse<CRAccountsReceivableProcedureRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAccountsReceivableProcedureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRAccountsReceivableProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("bqcustomernegotiation")
	@Process.Retrieve
	public BianResponse<BQBQCustomerNegotiationRetrieveOutputModel> retrieveBqcustomernegotiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBqcustomernegotiation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("payment")
	@Process.Retrieve
	public BianResponse<BQPaymentRetrieveOutputModel> retrievePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("receivablesevaluation")
	@Process.Retrieve
	public BianResponse<BQReceivablesEvaluationRetrieveOutputModel> retrieveReceivablesevaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReceivablesevaluation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("resolution")
	@Process.Retrieve
	public BianResponse<BQResolutionRetrieveOutputModel> retrieveResolution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveResolution(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDAccountsReceivableRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRAccountsReceivableProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAccountsReceivableProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("bqcustomernegotiation")
	@Process.Update
	public BianResponse<BQBQCustomerNegotiationUpdateOutputModel> updateBqcustomernegotiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBQCustomerNegotiationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBqcustomernegotiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment")
	@Process.Update
	public BianResponse<BQPaymentUpdateOutputModel> updatePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("receivablesevaluation")
	@Process.Update
	public BianResponse<BQReceivablesEvaluationUpdateOutputModel> updateReceivablesevaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReceivablesEvaluationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateReceivablesevaluation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("resolution")
	@Process.Update
	public BianResponse<BQResolutionUpdateOutputModel> updateResolution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQResolutionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateResolution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
