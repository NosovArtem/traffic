<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Nosov</title>
    <script type="text/javascript" src="resources/bower_components/jquery/dist/jquery.min.js"></script>
    <script type="text/javascript" src="resources/bower_components/moment/min/moment.min.js"></script>
    <script type="text/javascript" src="resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script type="text/javascript"
            src="resources/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>
    <link rel="stylesheet" href="resources/bower_components/bootstrap/dist/css/bootstrap.min.css"/>
    <link rel="stylesheet"
          href="resources/bower_components/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css"/>
    <script src="resources/bower_components/moment/locale/it.js"></script>

    <title>UserTraffic Page</title>
</head>

<body>

<a href="../../index.jsp">Back to main menu</a>
<br/>
<br/>

<div class="container">
    <div class="row">
        <div class='col-md-2'>
            <div class="form-group">
                <label for="s">Select user from list:</label>
                <select class="form-control" id="s">
                    <c:if test="${!empty listUsers}">
                        <c:forEach items="${listUsers}" var="user">
                            <option>${user.email}</option>
                        </c:forEach>
                    </c:if>
                </select>
            </div>
        </div>
        <div class='col-md-4'>
            <div class="form-group">
                <label for="datetimepicker-start">Start :</label>
                <div class='input-group date' id='datetimepicker-start'>
                    <input type='text' class="form-control"/>
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
            </div>
        </div>
        <div class='col-md-4'>
            <div class="form-group">
                <label for="datetimepicker-end">End :</label>
                <div class='input-group date' id='datetimepicker-end'>
                    <input type='text' class="form-control"/>
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
            </div>
        </div>
        <div class='col-md-2'>
            <div class="form-group">
                <label for="sel1">Select list:</label>
                <select class="form-control" id="sel1">
                    <option>uplink</option>
                    <option>downlink</option>
                </select>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">

    $(function () {

        $('#datetimepicker-start').datetimepicker({
            format: "dddd, MMMM Do YYYY, h:mm:ss a"
        });
        $('#datetimepicker-end').datetimepicker({
            format: "dddd, MMMM Do YYYY, h:mm:ss a",
            useCurrent: false //Important! See issue #1075
        });
        $("#datetimepicker-start").on("dp.change", function (e) {
            $('#datetimepicker-end').data("DateTimePicker").minDate(e.date);
        });
        $("#datetimepickerend").on("dp.change", function (e) {
            $('#datetimepicker-start').data("DateTimePicker").maxDate(e.date);
        });
    });
</script>

</body>

</html>