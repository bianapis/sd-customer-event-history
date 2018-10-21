/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerEventHistoryApiService {

	RelationshipRecordResponse recordRelationships(String crReferenceId, String bqReferenceId, RelationshipBase request);
	
	FraudRecordResponse recordFrauds(String crReferenceId, String bqReferenceId, FraudBase request);
	
	LifeRecordResponse recordLives(String crReferenceId, String bqReferenceId, LifeBase request);
	
	ProductServiceRecordResponse recordProductServices(String crReferenceId, String bqReferenceId, ProductServiceBase request);
	
	SalesRecordResponse recordSales(String crReferenceId, String bqReferenceId, SalesBase request);
	
	ServicingRecordResponse recordServicings(String crReferenceId, String bqReferenceId, ServicingBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	EventLogBaseWithID retrieve(String crReferenceId);
	
	FraudBaseWithIdAndStatus retrieveFrauds(String crReferenceId, String bqReferenceId);
	
	LifeBaseWithIdAndStatus retrieveLives(String crReferenceId, String bqReferenceId);
	
	ProductServiceBaseWithIdAndStatus retrieveProductServices(String crReferenceId, String bqReferenceId);
	
	RelationshipBaseWithIdAndStatus retrieveRelationships(String crReferenceId, String bqReferenceId);
	
	SalesBaseWithIdAndStatus retrieveSales(String crReferenceId, String bqReferenceId);
	
	ServicingBaseWithIdAndStatus retrieveServicings(String crReferenceId, String bqReferenceId);
	
	EventLogBaseWithID update(String crReferenceId, EventLogBase request);
	
}
