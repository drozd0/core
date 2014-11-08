<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div>
    <tiles:insertAttribute name="header"/>
</div>
<span>
    <div>
        <tiles:insertAttribute name="menu"/>
    </div>
    <div>
        <tiles:insertAttribute name="content"/>
    </div>
</span>
<div>
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>
