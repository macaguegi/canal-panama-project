
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
@WebServiceClient(name = "Puja", targetNamespace = "http://Servidor/", wsdlLocation = "http://localhost:8083/CanalPanamaServer/Puja?WSDL")
public class Puja_Service
    extends Service
{

    private final static URL PUJA_WSDL_LOCATION;
    private final static WebServiceException PUJA_EXCEPTION;
    private final static QName PUJA_QNAME = new QName("http://Servidor/", "Puja");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8083/CanalPanamaServer/Puja?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PUJA_WSDL_LOCATION = url;
        PUJA_EXCEPTION = e;
    }

    public Puja_Service() {
        super(__getWsdlLocation(), PUJA_QNAME);
    }

    public Puja_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PUJA_QNAME, features);
    }

    public Puja_Service(URL wsdlLocation) {
        super(wsdlLocation, PUJA_QNAME);
    }

    public Puja_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PUJA_QNAME, features);
    }

    public Puja_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Puja_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Puja
     */
    @WebEndpoint(name = "PujaPort")
    public Puja getPujaPort() {
        return super.getPort(new QName("http://Servidor/", "PujaPort"), Puja.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Puja
     */
    @WebEndpoint(name = "PujaPort")
    public Puja getPujaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servidor/", "PujaPort"), Puja.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PUJA_EXCEPTION!= null) {
            throw PUJA_EXCEPTION;
        }
        return PUJA_WSDL_LOCATION;
    }

}
