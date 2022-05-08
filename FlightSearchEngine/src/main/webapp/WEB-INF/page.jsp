<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>La page</title>
	<link rel="stylesheet" type="text/css" href="page.css" />
</head>
<body>
	<header>
		<h1 id="titre">Réperetoire des vols d'avion</h1>
		<!--  
			<img id="banner" alt="banner" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgqjoEOcZL8mASnPSqvVyKa0m_O0Z8MvHzjg&usqp=CAU">
		-->
	</header>
	<div id="contenu">
	<form method="post" action="page">
	<!--
		<label>Ville de départ<input name="vDep" type="text"/></label>
		<label>Ville d'arrivée<input name="vArr" type="text"/></label>
	 -->
		<label>Ville de départ
			<select name="vDep">
				<option selected="selected" value="${vDepCourant}">${vDepCourant}</option>
				<c:if test="${vDepCourant != 'All'}">
					<option value="All">All</option>
				 </c:if>
				<c:forEach var="ville" items="${villes}">
						<option value="${ville}">${ville}</option>
				</c:forEach>
			</select>
		</label>
		<label>Ville d'arrivée
			<select name="vArr">
				<option selected="selected" value="${vArrCourant}">${vArrCourant}</option>
				<c:if test="${vArrCourant != 'All'}">
					<option value="All">All</option>
				 </c:if>
				<c:forEach var="ville" items="${villes}">
						<option value="${ville}">${ville}</option>
				</c:forEach>
			</select>
		</label>
	 
		<button id="submit" type="submit">Rechercher</button>
	</form>
	
	
	<div id="listvols">
		<c:if test="${ empty vols }">
			<p><c:out value="Aucun vol ne correspond à votre recherche 😕"></c:out></p>
		</c:if>
		<c:forEach var="vol" items="${vols }">
			<div id="vol">
				<h3><c:out value="${ vol.company }"/></h3>
				<ul id="vol-details">
					<li>Départ: <c:out value="${ vol.villeDep }"/></li>
					<li>Arrivée: <c:out value="${ vol.villeArr }"/></li>
					<li>Heure de départ: <c:out value="${ vol.dateDep }"/></li>
					<li>Heure d'arrivé: <c:out value="${ vol.dateArr}"/></li>
					<li>Tarif: <c:out value="${ vol.price }"/></li>
				</ul>
			</div>
		</c:forEach>
	</div>
	</div>
</body>
</html>