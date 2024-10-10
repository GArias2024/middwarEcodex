
package com.ecodex.middleware.wsdlautogen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ecodex.middleware.wsdlautogen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OnJobComplete_QNAME = new QName("http://wsclient.callback/job01", "onJobComplete");
    private final static QName _OnJobCompleteResponse_QNAME = new QName("http://wsclient.callback/job01", "onJobCompleteResponse");
    private final static QName _ProcessCallback_QNAME = new QName("http://wsclient.callback/job01", "processCallback");
    private final static QName _ProcessCallbackResponse_QNAME = new QName("http://wsclient.callback/job01", "processCallbackResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ecodex.middleware.wsdlautogen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OnJobComplete }
     * 
     */
    public OnJobComplete createOnJobComplete() {
        return new OnJobComplete();
    }

    /**
     * Create an instance of {@link OnJobCompleteResponse }
     * 
     */
    public OnJobCompleteResponse createOnJobCompleteResponse() {
        return new OnJobCompleteResponse();
    }

    /**
     * Create an instance of {@link ProcessCallback }
     * 
     */
    public ProcessCallback createProcessCallback() {
        return new ProcessCallback();
    }

    /**
     * Create an instance of {@link ProcessCallbackResponse }
     * 
     */
    public ProcessCallbackResponse createProcessCallbackResponse() {
        return new ProcessCallbackResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnJobComplete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnJobComplete }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsclient.callback/job01", name = "onJobComplete")
    public JAXBElement<OnJobComplete> createOnJobComplete(OnJobComplete value) {
        return new JAXBElement<OnJobComplete>(_OnJobComplete_QNAME, OnJobComplete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnJobCompleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnJobCompleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsclient.callback/job01", name = "onJobCompleteResponse")
    public JAXBElement<OnJobCompleteResponse> createOnJobCompleteResponse(OnJobCompleteResponse value) {
        return new JAXBElement<OnJobCompleteResponse>(_OnJobCompleteResponse_QNAME, OnJobCompleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCallback }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessCallback }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsclient.callback/job01", name = "processCallback")
    public JAXBElement<ProcessCallback> createProcessCallback(ProcessCallback value) {
        return new JAXBElement<ProcessCallback>(_ProcessCallback_QNAME, ProcessCallback.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCallbackResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessCallbackResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsclient.callback/job01", name = "processCallbackResponse")
    public JAXBElement<ProcessCallbackResponse> createProcessCallbackResponse(ProcessCallbackResponse value) {
        return new JAXBElement<ProcessCallbackResponse>(_ProcessCallbackResponse_QNAME, ProcessCallbackResponse.class, null, value);
    }

}
