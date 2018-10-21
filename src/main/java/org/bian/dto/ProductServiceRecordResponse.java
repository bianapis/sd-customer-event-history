package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductServiceRecordResponse
 */
public class ProductServiceRecordResponse   {
  private String recordingRecordReference = null;

  private String customerProductServiceEventResult = null;


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
   * @return customerProductServiceEventResult
  **/

  public String getCustomerProductServiceEventResult() {
    return customerProductServiceEventResult;
  }

  public void setCustomerProductServiceEventResult(String customerProductServiceEventResult) {
    this.customerProductServiceEventResult = customerProductServiceEventResult;
  }


}

