package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductServiceBase
 */
public class ProductServiceBase   {
  private String productInstanceReference = null;

  private String productActionEventType = null;

  private String productActionEventDescription = null;

  private String productActionEventResult = null;

  private String employeeUnitReference = null;

  private Object customerProductServiceEventRecord = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productActionEventType
  **/

  public String getProductActionEventType() {
    return productActionEventType;
  }

  public void setProductActionEventType(String productActionEventType) {
    this.productActionEventType = productActionEventType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productActionEventDescription
  **/

  public String getProductActionEventDescription() {
    return productActionEventDescription;
  }

  public void setProductActionEventDescription(String productActionEventDescription) {
    this.productActionEventDescription = productActionEventDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productActionEventResult
  **/

  public String getProductActionEventResult() {
    return productActionEventResult;
  }

  public void setProductActionEventResult(String productActionEventResult) {
    this.productActionEventResult = productActionEventResult;
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
   * @return customerProductServiceEventRecord
  **/

  public Object getCustomerProductServiceEventRecord() {
    return customerProductServiceEventRecord;
  }

  public void setCustomerProductServiceEventRecord(Object customerProductServiceEventRecord) {
    this.customerProductServiceEventRecord = customerProductServiceEventRecord;
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

