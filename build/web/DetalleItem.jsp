<%-- 
    Document   : DetalleItem
    Created on : 17 nov. 2021, 20:49:59
    Author     : villa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Folders</title>
    </head>
    <body>
        <h1>Folder</h1>
        
        <h2>Ingreso los siguientes items</h2>
       <input type="text" value= <%= session.getAttribute("description") %>>  </input>
       <p><button>Save</button> <button>Cancel</button> </p>
    </body>
</html>
