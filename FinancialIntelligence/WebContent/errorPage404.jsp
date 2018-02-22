<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<div class="app" style="height: 100%">
		<!-- START APP CONTAINER -->
		<div class="app-container app-error-container">
			<div class="app-error">
				<div class="app-error-code">404</div>
				<div class="app-error-message">Woooops... something has gone
					terribly wrong here</div>
				<div class="app-error-button">
					<a href="index.jsp"
						class="btn btn-primary btn-lg btn-shadowed btn-rounded">Back
						to home</a>
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
	<!-- END IMPORTANT SCRIPTS -->
	<!-- APP SCRIPTS -->
	<script type="text/javascript" src="admin/js/app.js"></script>
	<script type="text/javascript" src="admin/js/app_plugins.js"></script>
	<!-- END APP SCRIPTS -->
</body>
</html>