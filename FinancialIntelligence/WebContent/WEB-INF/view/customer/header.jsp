<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="app-header app-header-design-default">
		<ul class="app-header-buttons">
			<li class="visible-mobile"><a href="#"
				class="btn btn-link btn-icon"
				data-sidebar-toggle=".app-sidebar.dir-left"><span
					class="icon-menu"></span></a></li>
			<li class="hidden-mobile"><a href="#"
				class="btn btn-link btn-icon"
				data-sidebar-minimize=".app-sidebar.dir-left"><span
					class="icon-menu"></span></a></li>
		</ul>
		<form class="app-header-search" action="" method="post">
			<input type="text" name="keyword" placeholder="Search">
		</form>
		<ul class="app-header-buttons pull-right">
			<li><div
					class="contact contact-rounded contact-bordered contact-lg contact-ps-controls hidden-xs">
					<img src="admin/image/user_1.JPG" alt="Mit Shah">
					<div class="contact-container">
						<a href="#">Mit shah</a> <span>Administrator</span>
					</div>
					<div class="contact-controls">
						<div class="dropdown">
							<button type="button" class="btn btn-default btn-icon"
								data-toggle="dropdown">
								<span class="icon-layers"></span>
							</button>
							<ul class="dropdown-menu dropdown-left">
								<li><a href="pages-profile-social.jsp"><span
										class="icon-users"></span> Account</a></li>
								<li><a href="pages-messages-chat.jsp"><span
										class="icon-envelope"></span> Messages</a></li>
								<li><a href="pages-profile-card.jsp"><span
										class="icon-users"></span> Contacts</a></li>
								<li class="divider"></li>
								<li><a href="pages-email-inbox.jsp"><span
										class="icon-envelope"></span> E-mail <span
										class="label label-danger pull-right">19/2,399</span></a></li>
							</ul>
						</div>
					</div>
				</div></li>
			<li><div class="dropdown">
					<button class="btn btn-default btn-icon btn-informer"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
						<span class="icon-alarm"></span>
					</button>
					<ul
						class="dropdown-menu dropdown-form dropdown-left dropdown-form-wide">
						<li class="padding-0"><div
								class="app-heading title-only app-heading-bordered-bottom">
								<div class="icon">
									<span class="icon-text-align-left"></span>
								</div>
								<div class="title">
									<h2>Notifications</h2>
								</div>
								<div class="heading-elements">
									<a href="#" class="btn btn-default btn-icon"><span
										class="icon-sync"></span></a>
								</div>
							</div>
							<div class="app-timeline scroll app-timeline-simple text-sm"
								style="height: 240px">
								<div class="app-timeline-item">
									<div class="dot dot-primary"></div>
									<div class="content">
										<div class="title margin-bottom-0">
											<a href="#">Jessie Franklin</a> uploaded new file <strong>844_jswork.pdf</strong>
										</div>
									</div>
								</div>
								<div class="app-timeline-item">
									<div class="dot dot-warning"></div>
									<div class="content">
										<div class="title margin-bottom-0">
											<a href="#">Taylor Watson</a> changed work status <strong>PSD
												Dashboard</strong>
										</div>
									</div>
								</div>
								<div class="app-timeline-item">
									<div class="dot dot-success"></div>
									<div class="content">
										<div class="title margin-bottom-0">
											<a href="#">Dmitry Ivaniuk</a> approved project <strong>Boooya</strong>
										</div>
									</div>
								</div>
								<div class="app-timeline-item">
									<div class="dot dot-success"></div>
									<div class="content">
										<div class="title margin-bottom-0">
											<a href="#">Boris Shaw</a> finished work on <strong>Boooya</strong>
										</div>
									</div>
								</div>
								<div class="app-timeline-item">
									<div class="dot dot-danger"></div>
									<div class="content">
										<div class="title margin-bottom-0">
											<a href="#">Jasmine Voyer</a> declined order <strong>Project
												155</strong>
										</div>
									</div>
								</div>
							</div></li>
						<li class="padding-top-0"><button
								class="btn btn-block btn-link">Preview All</button></li>
					</ul>
				</div></li>
			<li><a href="j_spring_security_logout" class="btn btn-default btn-icon"><span
					class="icon-power-switch"></span></a></li>
		</ul>
	</div>
</body>
</html>