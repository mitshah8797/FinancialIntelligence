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
						<h1>Loan Types</h1>
						<p>View various loans here!</p>
					</div>
				</div>
				<div class="app-heading-container app-heading-bordered bottom">
					<ul class="breadcrumb">
						<li><a href="index.jsp">Dashboard</a></li>
						<li><a href="index.jsp">Manage Loan Type</a></li>
						<li class="active">View Types</li>
					</ul>
				</div>
				<!-- END PAGE HEADING -->
				<!-- START PAGE CONTAINER -->
				<div class="container">
					<div class="block block-condensed">
						<!-- START HEADING -->
						<div class="app-heading app-heading-small">
							<div class="title">
								<h5>Loan Types</h5>
							</div>
						</div>
						<!-- END HEADING -->
						<div class="block-content">
							<table
								class="table table-striped table-bordered datatable-extended">
								<thead>
									<tr>
										<th>Type Id</th>
										<th>Name</th>
										<th>Description</th>
										<th>Document Details</th>
										<th>Interest Rate</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${data}" var="v">
										<tr>
											<td><c:out value="${v.loanTypeId}"></c:out></td>
											<td><c:out value="${v.loanTypeName }"></c:out></td>
											<td><c:out value="${v.loanTypeDescription }"></c:out></td>
											<td><c:out value="${v.loanTypeDocumentDetails }"></c:out></td>
											<td><c:out value="${v.loanTypeInterest }"></c:out></td>
											<td><form action="editLoanType.htm" method="post">
													<input type="hidden" value="${v.loanTypeId }" name="loanTypeId">
													<input type="hidden" value="${v.loanTypeName }" name="loanTypeName">
													<input type="hidden" value="${v.loanTypeDescription }"
														name="loanTypeDescription">
														<input type="hidden" value="${v.loanTypeDocumentDetails }" name="loanTypeDocumentDetails">
														<input type="hidden" value="${v.loanTypeInterest }" name="loanTypeInterest">
													<button class="btn btn-default" type="submit">
														Edit</button>
												</form>
												<form action="deleteLoanType.htm" method="POST">
													<input type="hidden" value="${v.loanTypeId }" name="loanTypeId">
													<button class="btn btn-default">Delete</button>
												</form></td>
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