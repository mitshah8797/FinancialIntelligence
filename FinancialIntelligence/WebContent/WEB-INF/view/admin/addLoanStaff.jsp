<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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
				<!-- END APP HEADER  -->
				<!-- START PAGE HEADING -->
				<div class="app-heading app-heading-bordered app-heading-page">
					<div class="title">
						<h2>Manage Loan Staff</h2>
						<p>Manag staff and thier roles in the Bank!</p>
					</div>
				</div>
				<div class="app-heading-container app-heading-bordered bottom">
					<ul class="breadcrumb">
						<li><a href="index.jsp">Dashboard</a></li>
						<li><a href="index.jsp">Manage Loan Staff</a></li>
						<li class="active">Add Staff</li>
					</ul>
				</div>
				<!-- END PAGE HEADING -->
				<!-- START PAGE CONTAINER -->
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<div class="block">
								<div class="app-heading app-heading-small">
									<div class="title">
										<h2>Add Loan Staff</h2>
										<p>Add required details!</p>
									</div>
								</div>
								<f:form action="insertLoanStaff.htm" method="POST"
									modelAttribute="data">
									<div class="form-group">
										<label>First Name</label>
										<f:input class="form-control" data-validation="required"
											placeholder="First Name" path="loanStaffFirstName" />
										<f:hidden path="loanStaffId" />
									</div>
									<div class="form-group">
										<label>Last Name</label>
										<f:input class="form-control" data-validation="required"
											placeholder="Last Name" path="loanStaffLastName" />
									</div>
									<div class="form-group">
										<label>Description</label>
										<f:input class="form-control" data-validation="required"
											placehlolder="Description" path="loanStaffDescription" />
									</div>
									<label>Designation</label>
									<div class="btn-group bootstrap-select bs-select">
										<div class="dropdown-menu open" role="combobox"
											style="max-height: 359px; overflow: hidden; min-height: 137px;">
											<ul class="dropdown-menu inner" aria-expanded="false"
												role="listbox"
												style="max-height: 347px; overflow-y: auto; min-height: 125px;">
											</ul>
										</div>
										<f:select class="bs-select" tabindex="-98" path="post.postId">
										<f:option value=""></f:option>
											<c:forEach items="${list }" var="v">
												<f:option value="${v.postId }"> ${v.postName } </f:option>
											</c:forEach>
										</f:select>
									</div>
									<div class="form-group margin-top-20">
										<button class="btn btn-default" type="submit">Add</button>
									</div>
								</f:form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- END APP CONTENT -->
		</div>
		<!-- END APP CONTAINER -->
		<!-- START APP FOOTER -->
		<!-- END APP FOOTER -->
		<!-- APP OVERLAY -->
		<div class="app-overlay"></div>
		<!-- END APP OVERLAY -->
	</div>
	<!-- END APP WRAPPER -->
	<div class="modal fade" id="modal-thanks" tabindex="-1" role="dialog">
		<div class="modal-dialog modal-sm" role="document">
			<button type="button" class="close" data-dismiss="modal"
				aria-label="Close">
				<span aria-hidden="true" class="icon-cross"></span>
			</button>
			<div class="modal-content">
				<div class="modal-body">
					<p class="text-center margin-bottom-20">
						<img src="admin/image/smile.png" alt="Thank you"
							style="width: 100px">
					</p>
					<h3 id="modal-thanks-heading"
						class="text-uppercase text-bold text-lg heading-line-below heading-line-below-short text-center"></h3>
					<p class="text-muted text-center margin-bottom-10">Thank you so
						much for likes</p>
					<p class="text-muted text-center">
						We will do our best to make<br>Boooya template perfect
					</p>
					<p class="text-center">
						<button class="btn btn-success btn-clean" data-dismiss="modal">Continue</button>
					</p>
				</div>
			</div>
		</div>
	</div>
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
	<script type="text/javascript"
		src="admin/js/jquery.form-validator.min.js"></script>
	<script type="text/javascript" src="admin/js/bootstrap-select.js"></script>
	<!-- END THIS PAGE SCRIPTS -->
	<!-- APP SCRIPTS -->
	<script type="text/javascript" src="admin/js/app.js"></script>
	<script type="text/javascript" src="admin/js/app_plugins.js"></script>
	<!-- END APP SCRIPTS -->
	<script type="text/javascript">
		$.validate({
			modules : 'date,file,location',
			onValidate : function() {

				delayBeforeFire(function() {
					app.spy();
				}, 100);

			}
		});
	</script>
</body>
</html>