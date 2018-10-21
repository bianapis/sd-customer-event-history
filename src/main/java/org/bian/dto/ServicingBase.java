package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ServicingBase
 */
public class ServicingBase   {
  private String customerServicingEventType = null;

  private String customerContactDialogueRecordReference = null;

  private String accessedProductService = null;

  private String channelDeviceType = null;

  private String contactPurpose = null;

  private String contactResult = null;

  private String employeeUnitReference = null;

  private Object customerServicingEventRecord = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerServicingEventType
  **/

  public String getCustomerServicingEventType() {
    return customerServicingEventType;
  }

  public void setCustomerServicingEventType(String customerServicingEventType) {
    this.customerServicingEventType = customerServicingEventType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerContactDialogueRecordReference
  **/

  public String getCustomerContactDialogueRecordReference() {
    return customerContactDialogueRecordReference;
  }

  public void setCustomerContactDialogueRecordReference(String customerContactDialogueRecordReference) {
    this.customerContactDialogueRecordReference = customerContactDialogueRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return accessedProductService
  **/

  public String getAccessedProductService() {
    return accessedProductService;
  }

  public void setAccessedProductService(String accessedProductService) {
    this.accessedProductService = accessedProductService;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelDeviceType
  **/

  public String getChannelDeviceType() {
    return channelDeviceType;
  }

  public void setChannelDeviceType(String channelDeviceType) {
    this.channelDeviceType = channelDeviceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactPurpose
  **/

  public String getContactPurpose() {
    return contactPurpose;
  }

  public void setContactPurpose(String contactPurpose) {
    this.contactPurpose = contactPurpose;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactResult
  **/

  public String getContactResult() {
    return contactResult;
  }

  public void setContactResult(String contactResult) {
    this.contactResult = contactResult;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeUnitReference
  **/

  public String getEmployeeUnitReference() {
    return employeeUnitReference;
  }

  public void setEmployeeUnitReference(String employeeUnitReference) {
    this.employeeUnitReference = employeeUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerServicingEventRecord
  **/

  public Object getCustomerServicingEventRecord() {
    return customerServicingEventRecord;
  }

  public void setCustomerServicingEventRecord(Object customerServicingEventRecord) {
    this.customerServicingEventRecord = customerServicingEventRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return dateTimeLocation
  **/

  public String getDateTimeLocation() {
    return dateTimeLocation;
  }

  public void setDateTimeLocation(String dateTimeLocation) {
    this.dateTimeLocation = dateTimeLocation;
  }


}

