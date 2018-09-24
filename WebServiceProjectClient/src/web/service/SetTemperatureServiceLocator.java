/**
 * SetTemperatureServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package web.service;

public class SetTemperatureServiceLocator extends org.apache.axis.client.Service implements web.service.SetTemperatureService {

    public SetTemperatureServiceLocator() {
    }


    public SetTemperatureServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SetTemperatureServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SetTemperature
    private java.lang.String SetTemperature_address = "http://localhost:8080/WebServiceProject/services/SetTemperature";

    public java.lang.String getSetTemperatureAddress() {
        return SetTemperature_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SetTemperatureWSDDServiceName = "SetTemperature";

    public java.lang.String getSetTemperatureWSDDServiceName() {
        return SetTemperatureWSDDServiceName;
    }

    public void setSetTemperatureWSDDServiceName(java.lang.String name) {
        SetTemperatureWSDDServiceName = name;
    }

    public web.service.SetTemperature getSetTemperature() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SetTemperature_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSetTemperature(endpoint);
    }

    public web.service.SetTemperature getSetTemperature(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            web.service.SetTemperatureSoapBindingStub _stub = new web.service.SetTemperatureSoapBindingStub(portAddress, this);
            _stub.setPortName(getSetTemperatureWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSetTemperatureEndpointAddress(java.lang.String address) {
        SetTemperature_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (web.service.SetTemperature.class.isAssignableFrom(serviceEndpointInterface)) {
                web.service.SetTemperatureSoapBindingStub _stub = new web.service.SetTemperatureSoapBindingStub(new java.net.URL(SetTemperature_address), this);
                _stub.setPortName(getSetTemperatureWSDDServiceName());
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
        if ("SetTemperature".equals(inputPortName)) {
            return getSetTemperature();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.web", "SetTemperatureService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.web", "SetTemperature"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SetTemperature".equals(portName)) {
            setSetTemperatureEndpointAddress(address);
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
