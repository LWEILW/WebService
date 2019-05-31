/**
 * BokeDeeServiceWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class BokeDeeServiceWSServiceLocator extends org.apache.axis.client.Service implements mypackage.BokeDeeServiceWSService {

    public BokeDeeServiceWSServiceLocator() {
    }


    public BokeDeeServiceWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BokeDeeServiceWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for deeSpService
    private java.lang.String deeSpService_address = "http://10.1.20.41:48000/BokeDee/services/deeSpService";

    public java.lang.String getdeeSpServiceAddress() {
        return deeSpService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String deeSpServiceWSDDServiceName = "deeSpService";

    public java.lang.String getdeeSpServiceWSDDServiceName() {
        return deeSpServiceWSDDServiceName;
    }

    public void setdeeSpServiceWSDDServiceName(java.lang.String name) {
        deeSpServiceWSDDServiceName = name;
    }

    public mypackage.BokeDeeServiceWS getdeeSpService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(deeSpService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getdeeSpService(endpoint);
    }

    public mypackage.BokeDeeServiceWS getdeeSpService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.DeeSpServiceSoapBindingStub _stub = new mypackage.DeeSpServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getdeeSpServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setdeeSpServiceEndpointAddress(java.lang.String address) {
        deeSpService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.BokeDeeServiceWS.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.DeeSpServiceSoapBindingStub _stub = new mypackage.DeeSpServiceSoapBindingStub(new java.net.URL(deeSpService_address), this);
                _stub.setPortName(getdeeSpServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("deeSpService".equals(inputPortName)) {
            return getdeeSpService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bokesoft.com/dee/service/", "BokeDeeServiceWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bokesoft.com/dee/service/", "deeSpService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("deeSpService".equals(portName)) {
            setdeeSpServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
