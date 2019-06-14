<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<tags:header/>

<h1>
	Welcome home!  
</h1>

<br/>

<p>API syntax:</p>

<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Operation</th>
      <th scope="col">endpoint</th>
      <th scope="col">Request Method</th>
      <th scope="col">Request Body</th>
      <th scope="col">Params</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
    <td>Add New Entry</td>
      <td>/add</td>
      <td>POST</td>
      <td>JSON Entry</td>
      <td>-</td>
    </tr>
    <tr>
      <td>Update Entry</td>
      <td>/update</td>
      <td>POST</td>
      <td>JSON Entry</td>
      <td>id</td>
    </tr>
    <tr>
      <td>Get By ID</td>
      <td>/get</td>
      <td>GET</td>
      <td>-</td>
      <td>id</td>
    </tr>
    <tr>
      <td>Get ALl</td>
      <td>/getall</td>
      <td>GET</td>
      <td>-</td>
      <td>-</td>
    </tr>
    
    <tr>
      <td>Delete</td>
      <td>/delete</td>
      <td>GET</td>
      <td>-</td>
      <td>id</td>
    </tr>
  </tbody>
</table>


<<tags:footer></tags:footer>
