<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
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
			<div class="app-login-box">
				<br> <br>
				<div class="app-login-box-title">
					<div class="subtitle" style="font-size: 30px">Financial
						Intelligence</div>
				</div>
				<div class="app-login-box-user">
					<img src="admin/image/no-image.png" alt="John Doe">
				</div>
				<div class="app-login-box-title">
					<div class="subtitle">Sign in to your account</div>
				</div>
				<div class="app-login-box-container">
					<form action="j_spring_security_check" method="post">
						<div class="form-group">
							<input type="text" class="form-control"
								data-validation="required" placeholder="Email Address"
								name="username" />
						</div>
						<div class="form-group">
							<input type="password" class="form-control"
								data-validation="required" name="password"
								placeholder="Password" />
						</div>
						<div class="form-group">
							<div class="row">
								<div class="col-md-6 col-xs-6">
									<div class="app-checkbox">
										<label><input type="checkbox" name="app-checkbox-1"
											value="0"> Remember me</label>
									</div>
								</div>
								<div class="col-md-6 col-xs-6">
									<button class="btn btn-success btn-block">Sign In</button>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<!-- END APP CONTAINER -->
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
	<script type="text/javascript"
		src="admin/js/jquery.form-validator.min.js"></script>
	<!-- END IMPORTANT SCRIPTS -->
	<!-- APP SCRIPTS -->
	<script type="text/javascript" src="admin/js/app.js"></script>
	<script type="text/javascript" src="admin/js/app_plugins.js"></script>
	<!--<script type="text/javascript" src="admin/js/app_demo.js"></script>-->
	<!-- END APP SCRIPTS -->
</body>
</html>