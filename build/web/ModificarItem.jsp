<%-- 
    Document   : index
    Created on : 17 nov. 2021, 20:41:16
    Author     : villa
--%>

<%@page import="Logica.Items"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="container">
            <div id="main" class="card card-body">
                <h1>Modify item</h1>
                <form action="SvModificar" method="get">
                    <% HttpSession misession = request.getSession();
                        Items item = (Items) misession.getAttribute("item");
                    %>
                    <div class="input-group mb-3"> 
                        <div class="form-check">
                            <%boolean finished = item.isItemFinish();%>
                            <%if (finished) {
                                
                            %><td class="col col-lg-2"><input class="form-check-input" type="checkbox"  name="chkItem" checked="1" /></td>
                                <%} else {%>
                            <td class="col col-lg-2"><input class="form-check-input" type="checkbox"  name="chkItem" /></td>
                                <%}%>
                            <label class="form-check-label" for="chkItem">
                                Task finished
                            </label>
                        </div>
                        <input class="form-control mx-sm-3" type="text" placeholder="Description" name="description" value="<%=item.getDescription()%>"> 
                        <input type="hidden" name="id" value="<%=item.getId_items()%>">
                        <button class="btn btn-success" type="submit">Modify</button>
                    </div>
                    <br>
                </form>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
