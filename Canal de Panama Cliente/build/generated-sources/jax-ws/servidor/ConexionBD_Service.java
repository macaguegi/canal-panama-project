
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
@WebServiceClient(name = "conexionBD", targetNamespace = "http://Servidor/", wsdlLocation = "http://localhost:8083/CanalPanamaServer/conexionBD?WSDL")
public class ConexionBD_Service
    extends Service
{

    private final static URL CONEXIONBD_WSDL_LOCATION;
    private final static WebServiceException CONEXIONBD_EXCEPTION;
    private final static QName CONEXIONBD_QNAME = new QName("http://Servidor/", "conexionBD");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8083/CanalPanamaServer/conexionBD?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONEXIONBD_WSDL_LOCATION = url;
        CONEXIONBD_EXCEPTION = e;
    }

    public ConexionBD_Service() {
        super(__getWsdlLocation(), CONEXIONBD_QNAME);
    }

    public ConexionBD_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONEXIONBD_QNAME, features);
    }

    public ConexionBD_Service(URL wsdlLocation) {
        super(wsdlLocation, CONEXIONBD_QNAME);
    }

    public ConexionBD_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONEXIONBD_QNAME, features);
    }

    public ConexionBD_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConexionBD_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConexionBD
     */
    @WebEndpoint(name = "conexionBDPort")
    public ConexionBD getConexionBDPort() {
        return super.getPort(new QName("http://Servidor/", "conexionBDPort"), ConexionBD.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConexionBD
     */
    @WebEndpoint(name = "conexionBDPort")
    public ConexionBD getConexionBDPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servidor/", "conexionBDPort"), ConexionBD.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONEXIONBD_EXCEPTION!= null) {
            throw CONEXIONBD_EXCEPTION;
        }
        return CONEXIONBD_WSDL_LOCATION;
    }

}
