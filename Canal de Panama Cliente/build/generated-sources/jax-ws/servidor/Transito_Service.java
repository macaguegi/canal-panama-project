
package servidor;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Transito", targetNamespace = "http://Servidor/", wsdlLocation = "http://localhost:8083/CanalPanamaServer/Transito?WSDL")
public class Transito_Service
    extends Service
{

    private final static URL TRANSITO_WSDL_LOCATION;
    private final static WebServiceException TRANSITO_EXCEPTION;
    private final static QName TRANSITO_QNAME = new QName("http://Servidor/", "Transito");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8083/CanalPanamaServer/Transito?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSITO_WSDL_LOCATION = url;
        TRANSITO_EXCEPTION = e;
    }

    public Transito_Service() {
        super(__getWsdlLocation(), TRANSITO_QNAME);
    }

    public Transito_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSITO_QNAME, features);
    }

    public Transito_Service(URL wsdlLocation) {
        super(wsdlLocation, TRANSITO_QNAME);
    }

    public Transito_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSITO_QNAME, features);
    }

    public Transito_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Transito_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Transito
     */
    @WebEndpoint(name = "TransitoPort")
    public Transito getTransitoPort() {
        return super.getPort(new QName("http://Servidor/", "TransitoPort"), Transito.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Transito
     */
    @WebEndpoint(name = "TransitoPort")
    public Transito getTransitoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servidor/", "TransitoPort"), Transito.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSITO_EXCEPTION!= null) {
            throw TRANSITO_EXCEPTION;
        }
        return TRANSITO_WSDL_LOCATION;
    }

}
