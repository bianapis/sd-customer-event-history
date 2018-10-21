package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudBase
 */
public class FraudBase   {
  private String customerFraudCaseEventType = null;

  private String customerContactDialogueRecordReference = null;

  private String accessedProductService = null;

  private String employeeUnitReference = null;

  private String fraudCaseReference = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerFraudCaseEventType
  **/

  public String getCustomerFraudCaseEventType() {
    return customerFraudCaseEventType;
  }

  public void setCustomerFraudCaseEventType(String customerFraudCaseEventType) {
    this.customerFraudCaseEventType = customerFraudCaseEventType;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return fraudCaseReference
  **/

  public String getFraudCaseReference() {
    return fraudCaseReference;
  }

  public void setFraudCaseReference(String fraudCaseReference) {
    this.fraudCaseReference = fraudCaseReference;
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

