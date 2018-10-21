package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RelationshipBase
 */
public class RelationshipBase   {
  private String customerRelationshipEventType = null;

  private String employeeUnitReference = null;

  private Object customerRelationshipEventRecord = null;

  private String customerRelationshipEventAction = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipEventType
  **/

  public String getCustomerRelationshipEventType() {
    return customerRelationshipEventType;
  }

  public void setCustomerRelationshipEventType(String customerRelationshipEventType) {
    this.customerRelationshipEventType = customerRelationshipEventType;
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
   * @return customerRelationshipEventRecord
  **/

  public Object getCustomerRelationshipEventRecord() {
    return customerRelationshipEventRecord;
  }

  public void setCustomerRelationshipEventRecord(Object customerRelationshipEventRecord) {
    this.customerRelationshipEventRecord = customerRelationshipEventRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipEventAction
  **/

  public String getCustomerRelationshipEventAction() {
    return customerRelationshipEventAction;
  }

  public void setCustomerRelationshipEventAction(String customerRelationshipEventAction) {
    this.customerRelationshipEventAction = customerRelationshipEventAction;
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

