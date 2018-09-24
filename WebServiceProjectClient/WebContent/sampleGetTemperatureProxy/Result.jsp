<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Результат</TITLE>
</HEAD>
<BODY>
<H1>Результат</H1>

<jsp:useBean id="sampleGetTemperatureProxyid" scope="session" class="web.service.GetTemperatureProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleGetTemperatureProxyid.setEndpoint(request.getParameter("endpoint"));
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
        String name_0id=  request.getParameter("name5");
            java.lang.String name_0idTemp = null;
        if(!name_0id.equals("")){
         name_0idTemp  = name_0id;
        }
        java.lang.String getTemperature2mtemp = sampleGetTemperatureProxyid.getTemperature(name_0idTemp);
if(getTemperature2mtemp == null){
%>
<%=getTemperature2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getTemperature2mtemp));
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
Ожидание запроса.
<%
}
%>
</BODY>
</HTML>