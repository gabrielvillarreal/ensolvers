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
        <title>List To-Do</title>
    </head>
    <body>
        <div class="container">
            <div id="main" class="card card-body">
                <div class="clard card-body">
                    <h2 class="title">Task To Do</h2>
                </div>
                <form action="SvItem" method="POST" id="addForm" class="form-inline">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" name="chkItem" value="true" id="chkItem">
                        <label class="form-check-label" for="chkItem">
                            Task finished
                        </label>
                    </div>
                    <div class="form-group mx-sm-3">
                        <input type="text" name="description" class="form-control-lg" placeholder="Write a new task to do" id="item">
                    </div>
                    <input type="submit" class="btn btn-success " value="Add Task">
                </form>
                <h2> </h2>
                <table class="table table-hover ">
                    <thead class="thead-dark" >
                        <tr >
                            <th scope="col">Task finished</th>
                            <th scope="col">Task description</th>
                            <th scope="col">Delete</th>
                            <th scope="col">Modify</th>
                        </tr>
                    </thead>
                    <tbody  >
                        <% 
                            List <Items> listaItems = (List) request.getSession().getAttribute("listaItems");
                            for (Items it : listaItems) {
                        %> 
                        <tr>
                            <%String nombreComp = it.getDescription(); %>
                            <%boolean finished = it.isItemFinish();%>
                            <%int id = it.getId_items();%>
                            <%if (finished) {
                            %><td class="col col-lg-2"><input class="" type="checkbox" name="myTextEditBox" checked="1" disabled /></td>
                                <%} else {%>
                            <td class="col col-lg-2"><input class="" type="checkbox" name="myTextEditBox"  disabled /></td>
                                <%}%>
                            <td class="col"><%=nombreComp%></td>
                            <td class="col-md-auto">
                                <form name="frmBorrarItem" action="SvEliminar" method="POST" style="display:inline">
                                    <input type="hidden" name="id" value="<%=id%>" >
                                    <button type="submit" class="btn btn-danger " data-title="Delete" style="display:inline">Delete</button>
                                </form>
                            </td>
                            <td class="col-md-auto">
                                <form name="frmModificarItem" action="SvModificar" method="POST" style="display:inline">
                                    <input type="hidden" name="id" value="<%=id%>" >
                                    <button type="submit" class="btn btn-primary " data-title="Edit" style="display:inline">Modify</button>
                                </form>
                            </td>
                        </tr>
                    </tbody>       
                    <%}%>
                </table>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
