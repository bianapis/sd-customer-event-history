package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * LifeBaseWithIdAndStatus
 */
public class LifeBaseWithIdAndStatus   {
  private String customerEventLogReference = null;

  private String customerLifeEventReference = null;

  private String customerLifeEventType = null;

  private String customerContactReference = null;

  private String employeeUnitReference = null;

  private Object customerLifeEventRecord = null;

  private String customerLifeEventVerificationStatus = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerEventLogReference
  **/

  public String getCustomerEventLogReference() {
    return customerEventLogReference;
  }

  public void setCustomerEventLogReference(String customerEventLogReference) {
    this.customerEventLogReference = customerEventLogReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerLifeEventReference
  **/

  public String getCustomerLifeEventReference() {
    return customerLifeEventReference;
  }

  public void setCustomerLifeEventReference(String customerLifeEventReference) {
    this.customerLifeEventReference = customerLifeEventReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerLifeEventType
  **/

  public String getCustomerLifeEventType() {
    return customerLifeEventType;
  }

  public void setCustomerLifeEventType(String customerLifeEventType) {
    this.customerLifeEventType = customerLifeEventType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerContactReference
  **/

  public String getCustomerContactReference() {
    return customerContactReference;
  }

  public void setCustomerContactReference(String customerContactReference) {
    this.customerContactReference = customerContactReference;
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
   * @return customerLifeEventRecord
  **/

  public Object getCustomerLifeEventRecord() {
    return customerLifeEventRecord;
  }

  public void setCustomerLifeEventRecord(Object customerLifeEventRecord) {
    this.customerLifeEventRecord = customerLifeEventRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerLifeEventVerificationStatus
  **/

  public String getCustomerLifeEventVerificationStatus() {
    return customerLifeEventVerificationStatus;
  }

  public void setCustomerLifeEventVerificationStatus(String customerLifeEventVerificationStatus) {
    this.customerLifeEventVerificationStatus = customerLifeEventVerificationStatus;
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

