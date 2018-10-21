package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RelationshipRecordResponse
 */
public class RelationshipRecordResponse   {
  private String recordingRecordReference = null;

  private String customerRelationshipEventResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return recordingRecordReference
  **/

  public String getRecordingRecordReference() {
    return recordingRecordReference;
  }

  public void setRecordingRecordReference(String recordingRecordReference) {
    this.recordingRecordReference = recordingRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipEventResult
  **/

  public String getCustomerRelationshipEventResult() {
    return customerRelationshipEventResult;
  }

  public void setCustomerRelationshipEventResult(String customerRelationshipEventResult) {
    this.customerRelationshipEventResult = customerRelationshipEventResult;
  }


}

