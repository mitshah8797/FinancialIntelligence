<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div
		class="app-sidebar app-navigation app-navigation-fixed scroll app-navigation-style-default app-navigation-open-hover dir-left"
		data-type="close-other">
		<a href="index.jsp"></a>
		<nav>
			<ul>
				<li class="title">MENU</li>
				<li><a href="index.htm"><span class="nav-icon-hexa">Db</span>
						Dashboard</a></li>
				<li><a href="#"><span class="nav-icon-hexa">Cm</span>Manage
						Complaints</a>
					<ul>
						<li><a href="loadAddComplaint.htm"><span
								class="nav-icon-hexa">Ac</span> Add Complaint</a></li>
						<li><a href="loadComplaintViewCustomer.htm"><span
								class="nav-icon-hexa">Vc</span> View Compaints</a></li>
					</ul></li>
				<li><a href="#"><span class="nav-icon-hexa">Fb</span>Manage
						Feedbacks</a>
					<ul>
						<li><a href="loadAddFeedback.htm"><span
								class="nav-icon-hexa">Af</span> Add Feedback</a></li>
						<li><a href="loadFeedbackViewCustomer.htm"><span
								class="nav-icon-hexa">Vc</span> View Feedbacks</a></li>
					</ul></li>
				<li><a href="loadAddDoc.htm"><span class="nav-icon-hexa">Ud</span>
						Upload Documents</a></li>
			</ul>
		</nav>
	</div>
</body>
</html>