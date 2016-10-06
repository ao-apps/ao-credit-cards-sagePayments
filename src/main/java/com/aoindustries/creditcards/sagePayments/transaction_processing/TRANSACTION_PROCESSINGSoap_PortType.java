/**
 * TRANSACTION_PROCESSINGSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.creditcards.sagePayments.transaction_processing;

public interface TRANSACTION_PROCESSINGSoap_PortType extends java.rmi.Remote {
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_SALEResponseBANKCARD_SALEResult BANKCARD_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_NAME, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_CARDNUMBER, java.lang.String c_EXP, java.lang.String c_CVV, java.lang.String t_CUSTOMER_NUMBER, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_CREDIT_OR_REFUNDResponseBANKCARD_CREDIT_OR_REFUNDResult BANKCARD_CREDIT_OR_REFUND(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_NAME, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_CARDNUMBER, java.lang.String c_EXP, java.lang.String c_CVV, java.lang.String t_CUSTOMER_NUMBER, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_AUTHONLYResponseBANKCARD_AUTHONLYResult BANKCARD_AUTHONLY(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_NAME, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_CARDNUMBER, java.lang.String c_EXP, java.lang.String c_CVV, java.lang.String t_CUSTOMER_NUMBER, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_CREDITResponseBANKCARD_CREDITResult BANKCARD_CREDIT(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String t_REFERENCE) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_FORCEResponseBANKCARD_FORCEResult BANKCARD_FORCE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_NAME, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_CARDNUMBER, java.lang.String c_EXP, java.lang.String c_CVV, java.lang.String t_CUSTOMER_NUMBER, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_AUTH, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_VOIDResponseBANKCARD_VOIDResult BANKCARD_VOID(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_REFERENCE) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_PRIOR_AUTH_SALEResponseBANKCARD_PRIOR_AUTH_SALEResult BANKCARD_PRIOR_AUTH_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_AUTH, java.lang.String t_REFERENCE) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VIRTUAL_CHECK_PPD_SALEResponseVIRTUAL_CHECK_PPD_SALEResult VIRTUAL_CHECK_PPD_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_ORIGINATOR_ID, java.lang.String c_FIRST_NAME, java.lang.String c_MIDDLE_INITIAL, java.lang.String c_LAST_NAME, java.lang.String c_SUFFIX, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_RTE, java.lang.String c_ACCT, java.lang.String c_ACCT_TYPE, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VIRTUAL_CHECK_PPD_CREDITResponseVIRTUAL_CHECK_PPD_CREDITResult VIRTUAL_CHECK_PPD_CREDIT(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_ORIGINATOR_ID, java.lang.String c_FIRST_NAME, java.lang.String c_MIDDLE_INITIAL, java.lang.String c_LAST_NAME, java.lang.String c_SUFFIX, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_RTE, java.lang.String c_ACCT, java.lang.String c_ACCT_TYPE, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VIRTUAL_CHECK_CCD_SALEResponseVIRTUAL_CHECK_CCD_SALEResult VIRTUAL_CHECK_CCD_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_ORIGINATOR_ID, java.lang.String c_EIN, java.lang.String c_FIRST_NAME, java.lang.String c_MIDDLE_INITIAL, java.lang.String c_LAST_NAME, java.lang.String c_SUFFIX, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_RTE, java.lang.String c_ACCT, java.lang.String c_ACCT_TYPE, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VIRTUAL_CHECK_CREDIT_BY_REFERENCEResponseVIRTUAL_CHECK_CREDIT_BY_REFERENCEResult VIRTUAL_CHECK_CREDIT_BY_REFERENCE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String t_REFERENCE) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VIRTUAL_CHECK_CCD_CREDITResponseVIRTUAL_CHECK_CCD_CREDITResult VIRTUAL_CHECK_CCD_CREDIT(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_ORIGINATOR_ID, java.lang.String c_EIN, java.lang.String c_FIRST_NAME, java.lang.String c_MIDDLE_INITIAL, java.lang.String c_LAST_NAME, java.lang.String c_SUFFIX, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_RTE, java.lang.String c_ACCT, java.lang.String c_ACCT_TYPE, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VIRTUAL_CHECK_WEB_SALEResponseVIRTUAL_CHECK_WEB_SALEResult VIRTUAL_CHECK_WEB_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_ORIGINATOR_ID, java.lang.String c_FIRST_NAME, java.lang.String c_MIDDLE_INITIAL, java.lang.String c_LAST_NAME, java.lang.String c_SUFFIX, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_RTE, java.lang.String c_ACCT, java.lang.String c_ACCT_TYPE, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY, java.lang.String c_SSN, java.lang.String c_DL_STATE_CODE, java.lang.String c_DL_NUMBER, java.lang.String c_DOB) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VIRTUAL_CHECK_VOIDResponseVIRTUAL_CHECK_VOIDResult VIRTUAL_CHECK_VOID(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_REFERENCE) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VIRTUAL_CHECK_RCK_SALEResponseVIRTUAL_CHECK_RCK_SALEResult VIRTUAL_CHECK_RCK_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_ORIGINATOR_ID, java.lang.String c_FIRST_NAME, java.lang.String c_MIDDLE_INITIAL, java.lang.String c_LAST_NAME, java.lang.String c_SUFFIX, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_RTE, java.lang.String c_ACCT, java.lang.String c_ACCT_TYPE, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VIRTUAL_CHECK_ARC_SALEResponseVIRTUAL_CHECK_ARC_SALEResult VIRTUAL_CHECK_ARC_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_ORIGINATOR_ID, java.lang.String c_FIRST_NAME, java.lang.String c_MIDDLE_INITIAL, java.lang.String c_LAST_NAME, java.lang.String c_SUFFIX, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_RTE, java.lang.String c_ACCT, java.lang.String c_ACCT_TYPE, java.lang.String c_CHECK_NUMBER, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VIRTUAL_CHECK_TEL_SALEResponseVIRTUAL_CHECK_TEL_SALEResult VIRTUAL_CHECK_TEL_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_ORIGINATOR_ID, java.lang.String c_FIRST_NAME, java.lang.String c_MIDDLE_INITIAL, java.lang.String c_LAST_NAME, java.lang.String c_SUFFIX, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_RTE, java.lang.String c_ACCT, java.lang.String c_ACCT_TYPE, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RETAIL_SWIPED_SALEResponseBANKCARD_RETAIL_SWIPED_SALEResult BANKCARD_RETAIL_SWIPED_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String t_TRACKDATA) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RETAIL_SWIPED_AUTHONLYResponseBANKCARD_RETAIL_SWIPED_AUTHONLYResult BANKCARD_RETAIL_SWIPED_AUTHONLY(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String t_TRACKDATA) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RETAIL_SWIPED_CREDITResponseBANKCARD_RETAIL_SWIPED_CREDITResult BANKCARD_RETAIL_SWIPED_CREDIT(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String t_TRACKDATA) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RETAIL_KEYED_SALEResponseBANKCARD_RETAIL_KEYED_SALEResult BANKCARD_RETAIL_KEYED_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String c_CARDNUMBER, java.lang.String c_EXP) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RETAIL_KEYED_SALE_WITH_AVSResponseBANKCARD_RETAIL_KEYED_SALE_WITH_AVSResult BANKCARD_RETAIL_KEYED_SALE_WITH_AVS(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String c_CARDNUMBER, java.lang.String c_EXP, java.lang.String c_ADDRESS, java.lang.String c_ZIP) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVS(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String c_CARDNUMBER, java.lang.String c_EXP, java.lang.String c_ADDRESS, java.lang.String c_ZIP) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RETAIL_KEYED_AUTHONLYResponseBANKCARD_RETAIL_KEYED_AUTHONLYResult BANKCARD_RETAIL_KEYED_AUTHONLY(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String c_CARDNUMBER, java.lang.String c_EXP) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RETAIL_KEYED_FORCEResponseBANKCARD_RETAIL_KEYED_FORCEResult BANKCARD_RETAIL_KEYED_FORCE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String c_CARDNUMBER, java.lang.String c_EXP, java.lang.String t_AUTH) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RETAIL_KEYED_CREDITResponseBANKCARD_RETAIL_KEYED_CREDITResult BANKCARD_RETAIL_KEYED_CREDIT(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String t_AMT, java.lang.String c_CARDNUMBER, java.lang.String c_EXP) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RECURRING_SALEResponseBANKCARD_RECURRING_SALEResult BANKCARD_RECURRING_SALE(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_NAME, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_CARDNUMBER, java.lang.String c_EXP, java.lang.String c_CVV, java.lang.String t_CUSTOMER_NUMBER, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.BANKCARD_RECURRING_AUTHONLYResponseBANKCARD_RECURRING_AUTHONLYResult BANKCARD_RECURRING_AUTHONLY(java.lang.String m_ID, java.lang.String m_KEY, java.lang.String c_NAME, java.lang.String c_ADDRESS, java.lang.String c_CITY, java.lang.String c_STATE, java.lang.String c_ZIP, java.lang.String c_COUNTRY, java.lang.String c_EMAIL, java.lang.String c_CARDNUMBER, java.lang.String c_EXP, java.lang.String c_CVV, java.lang.String t_CUSTOMER_NUMBER, java.lang.String t_AMT, java.lang.String t_SHIPPING, java.lang.String t_TAX, java.lang.String t_ORDERNUM, java.lang.String c_TELEPHONE, java.lang.String c_FAX, java.lang.String c_SHIP_NAME, java.lang.String c_SHIP_ADDRESS, java.lang.String c_SHIP_CITY, java.lang.String c_SHIP_STATE, java.lang.String c_SHIP_ZIP, java.lang.String c_SHIP_COUNTRY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VERIFY_BANKCARD_SERVICEResponseVERIFY_BANKCARD_SERVICEResult VERIFY_BANKCARD_SERVICE(java.lang.String m_ID, java.lang.String m_KEY) throws java.rmi.RemoteException;
    public com.aoindustries.creditcards.sagePayments.transaction_processing.VERIFY_EFT_SERVICEResponseVERIFY_EFT_SERVICEResult VERIFY_EFT_SERVICE(java.lang.String m_ID, java.lang.String m_KEY) throws java.rmi.RemoteException;
}
