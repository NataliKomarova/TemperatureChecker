package web.service;

public class SetTemperatureProxy implements web.service.SetTemperature {
  private String _endpoint = null;
  private web.service.SetTemperature setTemperature = null;
  
  public SetTemperatureProxy() {
    _initSetTemperatureProxy();
  }
  
  public SetTemperatureProxy(String endpoint) {
    _endpoint = endpoint;
    _initSetTemperatureProxy();
  }
  
  private void _initSetTemperatureProxy() {
    try {
      setTemperature = (new web.service.SetTemperatureServiceLocator()).getSetTemperature();
      if (setTemperature != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)setTemperature)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)setTemperature)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (setTemperature != null)
      ((javax.xml.rpc.Stub)setTemperature)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.service.SetTemperature getSetTemperature() {
    if (setTemperature == null)
      _initSetTemperatureProxy();
    return setTemperature;
  }
  
  public java.lang.String changeTemperature(java.lang.String fname) throws java.rmi.RemoteException{
    if (setTemperature == null)
      _initSetTemperatureProxy();
    return setTemperature.changeTemperature(fname);
  }
  
  
}