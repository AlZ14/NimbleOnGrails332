<%@ page import="com.nimble.domain.reference.*;com.nimble.utils.view.ViewHelper;com.nimble.domain.artifact.*; com.nimble.controller.artifact.*;" %>
<g:set var="viewHelper" value="${new ViewHelper()}" scope="request" />

<% 
//request.viewHelper.projectId = params.id
request.viewHelper.includeParams=[project_id:params.project_id,artifactView:params.artifactView] 
request.viewHelper.projectType = params.projectType
%>

<%
					println(g.include(view:'/artifact/list_landing.gsp', params:params))
%>