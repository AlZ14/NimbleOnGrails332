<%@ page import="com.nimble.domain.reference.*;com.nimble.utils.view.ViewHelper;com.nimble.domain.report.Report;" %>
<g:set var="viewHelper" value="${new ViewHelper()}" scope="request" />

<%
	request.viewHelper.includeView = "/report/create_inc.gsp"
%>

<g:render template="/layouts/nimble_main" />

<script language="JavaScript" someProperty="text/javascript">
setBreadCrumbs('Administration','administration');
addToBreadCrumbs('Reports','report');
</script>