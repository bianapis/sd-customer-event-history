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
import org.bian.annotation.functionalpattern.Track;

@BianRestController
public class CustomerEventHistoryApiController {

	@Autowired
	CustomerEventHistoryApiService service;
	
	@BQ("relationships")
	@Track.Record
	public BianResponse<RelationshipRecordResponse> recordRelationships(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<RelationshipBase> bianRequest) {
		return BianResponse.forSuccess(service.recordRelationships(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("frauds")
	@Track.Record
	public BianResponse<FraudRecordResponse> recordFrauds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<FraudBase> bianRequest) {
		return BianResponse.forSuccess(service.recordFrauds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("lives")
	@Track.Record
	public BianResponse<LifeRecordResponse> recordLives(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<LifeBase> bianRequest) {
		return BianResponse.forSuccess(service.recordLives(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("product-services")
	@Track.Record
	public BianResponse<ProductServiceRecordResponse> recordProductServices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ProductServiceBase> bianRequest) {
		return BianResponse.forSuccess(service.recordProductServices(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sales")
	@Track.Record
	public BianResponse<SalesRecordResponse> recordSales(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<SalesBase> bianRequest) {
		return BianResponse.forSuccess(service.recordSales(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicings")
	@Track.Record
	public BianResponse<ServicingRecordResponse> recordServicings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ServicingBase> bianRequest) {
		return BianResponse.forSuccess(service.recordServicings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Track.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Track.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Track.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Track.Retrieve
	public BianResponse<EventLogBaseWithID> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("frauds")
	@Track.Retrieve
	public BianResponse<FraudBaseWithIdAndStatus> retrieveFrauds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFrauds(crReferenceId, bqReferenceId));
	}
	
	@BQ("lives")
	@Track.Retrieve
	public BianResponse<LifeBaseWithIdAndStatus> retrieveLives(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLives(crReferenceId, bqReferenceId));
	}
	
	@BQ("product-services")
	@Track.Retrieve
	public BianResponse<ProductServiceBaseWithIdAndStatus> retrieveProductServices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductServices(crReferenceId, bqReferenceId));
	}
	
	@BQ("relationships")
	@Track.Retrieve
	public BianResponse<RelationshipBaseWithIdAndStatus> retrieveRelationships(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRelationships(crReferenceId, bqReferenceId));
	}
	
	@BQ("sales")
	@Track.Retrieve
	public BianResponse<SalesBaseWithIdAndStatus> retrieveSales(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSales(crReferenceId, bqReferenceId));
	}
	
	@BQ("servicings")
	@Track.Retrieve
	public BianResponse<ServicingBaseWithIdAndStatus> retrieveServicings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicings(crReferenceId, bqReferenceId));
	}
	
	@Track.Update
	public BianResponse<EventLogBaseWithID> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<EventLogBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
