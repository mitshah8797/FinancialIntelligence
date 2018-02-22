<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title><%=application.getInitParameter("title")%></title>
<!-- META SECTION -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="shortcut icon" href="favicon.ico" type="admin/image/x-icon">
<link rel="icon" href="favicon.ico" type="admin/image/x-icon">
<!-- END META SECTION -->
<!-- CSS INCLUDE -->
<link rel="stylesheet" href="admin/css/styles.css">
<!-- EOF CSS INCLUDE -->
</head>
<body>
	<!-- APP WRAPPER -->
	<div class="app">
		<!-- START APP CONTAINER -->
		<div class="app-container">
			<!-- START SIDEBAR -->
			<%@include file="sidebar.jsp"%>
			<!-- END SIDEBAR -->
			<!-- START APP CONTENT -->
			<div class="app-content app-sidebar-left">
				<!-- START APP HEADER -->
				<%@include file="header.jsp"%>
				<!-- START PAGE HEADING -->
				<div class="app-heading app-heading-bordered app-heading-page">
					<div class="title">
						<h1>View Feedbacks</h1>
						<p>View various feedbacks here!</p>
					</div>
				</div>
				<div class="app-heading-container app-heading-bordered bottom">
					<ul class="breadcrumb">
						<li><a href="index.jsp">Dashboard</a></li>
						<li><a href="index.jsp">Manage Feedback</a></li>
						<li class="active">Feedback</li>
					</ul>
				</div>
				<!-- END PAGE HEADING -->
				<!-- START PAGE CONTAINER -->
				<div class="container">
					<div class="block block-condensed">
						<!-- START HEADING -->
						<div class="app-heading app-heading-small">
							<div class="title">
								<h5>View Feedbacks</h5>
							</div>
						</div>
						<!-- END HEADING -->
						<div class="block-content">
							<table
								class="table table-striped table-bordered datatable-extended">
								<thead>
									<tr>
										<th>Feedback Id</th>
										<th>Feedback</th>
										<th>User Mail</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${data}" var="v">
										<tr>
											<td><c:out value="${v.feedbackId}"></c:out></td>
											<td><c:out value="${v.feedbackDescription }"></c:out></td>
											<td><c:out value="${v.user.emailId }"></c:out></td>
											<!--<td><form action="editFeedback.htm" method="post">
													<input type="hidden" value="${v.feedbackId }" name="feedbackId">
													<input type="hidden" value="${v.feedbackDescription }"
														name="feedbackDesc">
													<input type="hidden" value="${v.user.loginId }" name="userId">
													<button class="btn btn-default" type="submit">
														Edit</button>
												</form>
												<form action="deleteFeedback.htm" method="POST">
													<input type="hidden" value="${v.feedbackId }" name="feedbackId">
													<button class="btn btn-default">Delete</button>
												</form></td>-->
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<!-- END PAGE CONTAINER -->
			</div>
			<!-- END APP CONTENT -->
		</div>
		<!-- END APP CONTAINER -->
		<!-- APP OVERLAY -->
		<div class="app-overlay"></div>
		<!-- END APP OVERLAY -->
	</div>
	<!-- END APP WRAPPER -->
	<!-- IMPORTANT SCRIPTS -->
	<script type="text/javascript" src="admin/js/jquery.min.js"></script>
	<script type="text/javascript" src="admin/js/jquery-migrate.min.js"></script>
	<script type="text/javascript" src="admin/js/jquery-ui.min.js"></script>
	<script type="text/javascript" src="admin/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="admin/js/moment.min.js"></script>
	<script type="text/javascript"
		src="admin/js/jquery.mCustomScrollbar.min.js"></script>
	<!-- END IMPORTANT SCRIPTS -->
	<!-- THIS PAGE SCRIPTS -->
	<script type="text/javascript" src="admin/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="admin/js/dataTables.bootstrap.min.js"></script>
	<!-- END THIS PAGE SCRIPTS -->
	<!-- APP SCRIPTS -->
	<script type="text/javascript" src="admin/js/app.js"></script>
	<script type="text/javascript" src="admin/js/app_plugins.js"></script>
	<!-- END APP SCRIPTS -->
</body>
</html>