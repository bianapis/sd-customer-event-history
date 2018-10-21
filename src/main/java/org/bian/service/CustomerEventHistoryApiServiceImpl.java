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
public class CustomerEventHistoryApiServiceImpl implements CustomerEventHistoryApiService {

	public RelationshipRecordResponse recordRelationships(String crReferenceId, String bqReferenceId, RelationshipBase request){
		return JsonReader.read("record-RelationshipRecordResponse.json",new TypeReference<RelationshipRecordResponse>(){});
	}
	
	public FraudRecordResponse recordFrauds(String crReferenceId, String bqReferenceId, FraudBase request){
		return JsonReader.read("record-FraudRecordResponse.json",new TypeReference<FraudRecordResponse>(){});
	}
	
	public LifeRecordResponse recordLives(String crReferenceId, String bqReferenceId, LifeBase request){
		return JsonReader.read("record-LifeRecordResponse.json",new TypeReference<LifeRecordResponse>(){});
	}
	
	public ProductServiceRecordResponse recordProductServices(String crReferenceId, String bqReferenceId, ProductServiceBase request){
		return JsonReader.read("record-ProductServiceRecordResponse.json",new TypeReference<ProductServiceRecordResponse>(){});
	}
	
	public SalesRecordResponse recordSales(String crReferenceId, String bqReferenceId, SalesBase request){
		return JsonReader.read("record-SalesRecordResponse.json",new TypeReference<SalesRecordResponse>(){});
	}
	
	public ServicingRecordResponse recordServicings(String crReferenceId, String bqReferenceId, ServicingBase request){
		return JsonReader.read("record-ServicingRecordResponse.json",new TypeReference<ServicingRecordResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public EventLogBaseWithID retrieve(String crReferenceId){
		return JsonReader.read("retrieve-EventLogBaseWithID.json",new TypeReference<EventLogBaseWithID>(){});
	}
	
	public FraudBaseWithIdAndStatus retrieveFrauds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudBaseWithIdAndStatus.json",new TypeReference<FraudBaseWithIdAndStatus>(){});
	}
	
	public LifeBaseWithIdAndStatus retrieveLives(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-LifeBaseWithIdAndStatus.json",new TypeReference<LifeBaseWithIdAndStatus>(){});
	}
	
	public ProductServiceBaseWithIdAndStatus retrieveProductServices(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductServiceBaseWithIdAndStatus.json",new TypeReference<ProductServiceBaseWithIdAndStatus>(){});
	}
	
	public RelationshipBaseWithIdAndStatus retrieveRelationships(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RelationshipBaseWithIdAndStatus.json",new TypeReference<RelationshipBaseWithIdAndStatus>(){});
	}
	
	public SalesBaseWithIdAndStatus retrieveSales(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SalesBaseWithIdAndStatus.json",new TypeReference<SalesBaseWithIdAndStatus>(){});
	}
	
	public ServicingBaseWithIdAndStatus retrieveServicings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ServicingBaseWithIdAndStatus.json",new TypeReference<ServicingBaseWithIdAndStatus>(){});
	}
	
	public EventLogBaseWithID update(String crReferenceId, EventLogBase request){
		return JsonReader.read("update-EventLogBaseWithID.json",new TypeReference<EventLogBaseWithID>(){});
	}
	
}
