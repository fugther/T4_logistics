package com.qf.entity;

/**
 * projectName: logistics
 * author: GSL
 * time: 2020/10/7 15:38
 * description:
 */
public class CustomerInfo {
    private String customer_code;
    private String customer;
    private String phone;
    private String fax;
    private String address;
    private String postCode;
    private String linkman;
    private String linkmanMobile;
    private String customerType;
    private String enterpriseProperty;
    private String enterpriseSize;
    private String email;

    public String getCustomer_code() {
        return customer_code;
    }

    public void setCustomer_code(String customer_code) {
        this.customer_code = customer_code;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getEnterpriseProperty() {
        return enterpriseProperty;
    }

    public void setEnterpriseProperty(String enterpriseProperty) {
        this.enterpriseProperty = enterpriseProperty;
    }

    public String getEnterpriseSize() {
        return enterpriseSize;
    }

    public void setEnterpriseSize(String enterpriseSize) {
        this.enterpriseSize = enterpriseSize;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "customer_code='" + customer_code + '\'' +
                ", customer='" + customer + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", address='" + address + '\'' +
                ", postCode='" + postCode + '\'' +
                ", linkman='" + linkman + '\'' +
                ", linkmanMobile='" + linkmanMobile + '\'' +
                ", customerType='" + customerType + '\'' +
                ", enterpriseProperty='" + enterpriseProperty + '\'' +
                ", enterpriseSize='" + enterpriseSize + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public CustomerInfo(String customer_code, String customer, String phone, String fax, String address, String postCode, String linkman, String linkmanMobile, String customerType, String enterpriseProperty, String enterpriseSize, String email) {
        this.customer_code = customer_code;
        this.customer = customer;
        this.phone = phone;
        this.fax = fax;
        this.address = address;
        this.postCode = postCode;
        this.linkman = linkman;
        this.linkmanMobile = linkmanMobile;
        this.customerType = customerType;
        this.enterpriseProperty = enterpriseProperty;
        this.enterpriseSize = enterpriseSize;
        this.email = email;
    }

    public CustomerInfo() {
    }
}
