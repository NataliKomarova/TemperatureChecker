<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Результат</TITLE>
</HEAD>
<BODY>
<H1>Результат</H1>

<jsp:useBean id="sampleSetTemperatureProxyid" scope="session" class="web.service.SetTemperatureProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSetTemperatureProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        String fname_0id=  request.getParameter("fname5");
            java.lang.String fname_0idTemp = null;
        if(!fname_0id.equals("")){
         fname_0idTemp  = fname_0id;
        }
        java.lang.String changeTemperature2mtemp = sampleSetTemperatureProxyid.changeTemperature(fname_0idTemp);
if(changeTemperature2mtemp == null){
%>
<%=changeTemperature2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(changeTemperature2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>

<%
}
%>
</BODY>
</HTML>