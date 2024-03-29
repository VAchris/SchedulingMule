package test.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-19T15:02:16.206-08:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "StockQuoteSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface StockQuoteSoap {

    /**
     * Get Stock quote for a company Symbol
     */
    @WebResult(name = "GetQuoteResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "GetQuote", targetNamespace = "http://www.webserviceX.NET/", className = "test.webservice.GetQuote")
    @WebMethod(operationName = "GetQuote", action = "http://www.webserviceX.NET/GetQuote")
    @ResponseWrapper(localName = "GetQuoteResponse", targetNamespace = "http://www.webserviceX.NET/", className = "test.webservice.GetQuoteResponse")
    public java.lang.String getQuote(
        @WebParam(name = "symbol", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String symbol
    );
}
