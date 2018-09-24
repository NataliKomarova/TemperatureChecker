package web.service;

public class GetTemperatureProxy implements web.service.GetTemperature {
  private String _endpoint = null;
  private web.service.GetTemperature getTemperature = null;
  
  public GetTemperatureProxy() {
    _initGetTemperatureProxy();
  }
  
  public GetTemperatureProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetTemperatureProxy();
  }
  
  private void _initGetTemperatureProxy() {
    try {
      getTemperature = (new web.service.GetTemperatureServiceLocator()).getGetTemperature();
      if (getTemperature != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getTemperature)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getTemperature)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getTemperature != null)
      ((javax.xml.rpc.Stub)getTemperature)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.service.GetTemperature getGetTemperature() {
    if (getTemperature == null)
      _initGetTemperatureProxy();
    return getTemperature;
  }
  
  public java.lang.String getTemperature(java.lang.String name) throws java.rmi.RemoteException{
    if (getTemperature == null)
      _initGetTemperatureProxy();
    return getTemperature.getTemperature(name);
  }
  
  
}