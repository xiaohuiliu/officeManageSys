<%@page import="java.util.List"%>
<%@page import="com.leo.util.PageUtil"%>
<%@page import="com.leo.util.Page"%>
<%@page import="com.leo.bean.Message"%>
<%@page import="com.leo.dao.MessageDAO"%>
<%@page import="com.leo.dao.MessageDAOFactory"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=gb2312"
	pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>��ҵ�ճ��������ϵͳ--��ҳ</title>
</head>
<body>
	<div id="topexplain">��ҵ�ճ��������ϵͳ��Ϊ��ҵ�ڲ�ͨ���ṩ����ķ���</div>
	>
	<div id="topmenu">
		<img src="images/banner.jpg" width="970" height="147">
	</div>
	<div id="bookmenu">
		<div class="jsmenu" id="jsmenu">
			<ul>
				<li class="active"><a href="index.jsp" urn="#default_Info"
					rel="conmenu">��ҳ</a></li>
				<li class="normal"><a urn="jsmenu1" rel="conmenu"
					href="GetMessageList">��Ϣ�б�</a></li>
				<li class="normal"><a urn="jsmenu2" rel="conmenu"
					href="publishNewMsg.jsp">��������Ϣ</a></li>
				<li class="normal"><a urn="jsmenu3" rel="conmenu"
					href="StatusRecognise.jsp">���ʶ��</a></li>
			</ul>
		</div>
		<div id="conmenu"></div>
	</div>

	<div id="indexfirst">
		<div id="thenew">
			<div class="tit">
				<h1>������Ϣ</h1>
			</div>
			<div class="STYLE1" id="therecom">
				<%
					MessageDAO messageDAO = MessageDAOFactory.getMessageDAOInstance();
					Page pageX = PageUtil.createPage(6, messageDAO.findAllCount(), 1);
					List<Message> messages = messageDAO.findAllMessage(pageX);
					for (Message message : messages) {
				%>
				<p>
					<a href="GetMessage?messageID=<%=message.getMessageID()%>"><%=message.getMessageTitle()%></a>
					<span class="STYLE2"><%=message.getPublishTime()%></span>
				</p>
				<p>&nbsp;</p>
				<%
					}
				%>
			</div>
		</div>
		<div id="menunay">
			<div class="tit">
				<h1>Ա����Ϣ</h1>
			</div>
			<div id="employee">
				<c:choose>
					<c:when test="${empty sessionScope.employee}">
						û�н������ʶ�����Ƚ������ʶ��!
					</c:when>						
					<c:otherwise>
						<ul>
							<li>Ա����ţ�${employee.employeeID}</li>
							<li>Ա��������${employee.employeeName}</li>
							<li>Ա���Ա�${employee.employeeSex ? "��" : "Ů"}</li>
							<li></li>
						</ul>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
</body>
</html>