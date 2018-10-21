package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SalesBaseWithIdAndStatus
 */
public class SalesBaseWithIdAndStatus   {
  private String customerEventLogReference = null;

  private String customerSalesEventReference = null;

  private String customerSalesEventType = null;

  private String employeeUnitReference = null;

  private String productServiceType = null;

  private String leadOpportunityReference = null;

  private Object customerSalesEventRecord = null;

  private String commissionAgreementReference = null;

  private String dateTimeLocation = null;

  private String customerSalesEventResult = null;


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
   * @return customerSalesEventReference
  **/

  public String getCustomerSalesEventReference() {
    return customerSalesEventReference;
  }

  public void setCustomerSalesEventReference(String customerSalesEventReference) {
    this.customerSalesEventReference = customerSalesEventReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerSalesEventType
  **/

  public String getCustomerSalesEventType() {
    return customerSalesEventType;
  }

  public void setCustomerSalesEventType(String customerSalesEventType) {
    this.customerSalesEventType = customerSalesEventType;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return leadOpportunityReference
  **/

  public String getLeadOpportunityReference() {
    return leadOpportunityReference;
  }

  public void setLeadOpportunityReference(String leadOpportunityReference) {
    this.leadOpportunityReference = leadOpportunityReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerSalesEventRecord
  **/

  public Object getCustomerSalesEventRecord() {
    return customerSalesEventRecord;
  }

  public void setCustomerSalesEventRecord(Object customerSalesEventRecord) {
    this.customerSalesEventRecord = customerSalesEventRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return commissionAgreementReference
  **/

  public String getCommissionAgreementReference() {
    return commissionAgreementReference;
  }

  public void setCommissionAgreementReference(String commissionAgreementReference) {
    this.commissionAgreementReference = commissionAgreementReference;
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


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerSalesEventResult
  **/

  public String getCustomerSalesEventResult() {
    return customerSalesEventResult;
  }

  public void setCustomerSalesEventResult(String customerSalesEventResult) {
    this.customerSalesEventResult = customerSalesEventResult;
  }


}

