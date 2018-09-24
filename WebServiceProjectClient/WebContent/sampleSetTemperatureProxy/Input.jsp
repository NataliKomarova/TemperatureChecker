<%@page contentType="text/html;charset=UTF-8"%>
<HTML>
<HEAD>
<TITLE>Обновление температуры</TITLE>
</HEAD>
<BODY>
<H1>Обновление температуры</H1>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) {
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">Начать обновление?(да/нет):</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="fname5" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Ввод">
<INPUT TYPE="RESET" VALUE="Очистить">
</FORM>

<%
}
if (valid) {
%>
Выберите действие.
<%
}
%>

</BODY>
</HTML>
