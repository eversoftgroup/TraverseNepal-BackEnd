<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<tags:header/>

<h1>
	Welcome home!  
</h1>

<br/>

<h3>Available Endpoints:</h3>
<table class="table table-striped table-bordered" border=2>
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col" colspan="2">Endpoint</th>
      <th scope="col">Request Method</th>
      <th scope="col" colspan="2">Request Params</th>
      <th scope="col" colspan="2">Request Body</th>
      
      <th scope="col" colspan="2">Returns</th>
    </tr>
  </thead>
  <tbody>
    <tr>
    	<td rowspan="5">1</td>
      <td rowspan="5">/user</td>
      <td>/get</td>
      <td>GET</td>
      <td>id: int</td>
      <td>User Id</td>
      <td>-</td>
       <td>-</td>
        <td>response: JSON</td>
         <td>User details</td>
    </tr>
    
    <tr>
      <td>/getall</td>
      <td>GET</td>
      <td></td>
      <td></td>
      <td></td>
       <td></td>
        <td>application/JSON array</td>
         <td>All users</td>
    </tr>
    
    <tr>
      <td>/add</td>
      <td>POST</td>
      <td></td>
      <td></td>
      <td>application/JSON</td>
       <td>User Object</td>
        <td>boolean</td>
         <td>add success/failure</td>
    </tr>
    
    <tr>
      <td>/update</td>
      <td>POST</td>
      <td>id</td>
      <td>User ID</td>
      <td>application/JSON</td>
       <td>User Object</td>
        <td>boolean</td>
         <td>update success / failure</td>
    </tr>
    <tr>
      <td>/delete</td>
      <td>get</td>
      <td>id</td>
      <td>UserID</td>
      <td></td>
       <td></td>
        <td>boolean</td>
         <td>delete success/failure</td>
    </tr>
    
    <!--  <tr>
    <td>2</td>
      <td>/itinerary</td>
      <td>/getall, /create, /update, /delete</td>
    </tr>
   
  </tbody>
</table>


<br/>
<h3>API methods:</h3>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Operation</th>
      <th scope="col">API method</th>
      <th scope="col">Request Method</th>
      <th scope="col">Request Body</th>
      <th scope="col">Params</th>
      <th scope="col">Returns</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
    <td>Add New Entry</td>
      <td>/add</td>
      <td>POST</td>
      <td>JSON Entry</td>
      <td>-</td>
      <td>boolean</td>
    </tr>
    <tr>
      <td>Update Entry</td>
      <td>/update</td>
      <td>POST</td>
      <td>JSON Entry</td>
      <td>id</td>
      <td>boolean</td>
    </tr>
    <tr>
      <td>Get By ID</td>
      <td>/get</td>
      <td>GET</td>
      <td>-</td>
      <td>id</td>
      <td>application/JSON</td>
    </tr>
    <tr>
      <td>Get ALl</td>
      <td>/getall</td>
      <td>GET</td>
      <td>-</td>
      <td>-</td>
      <td>application/JSON</td>
    </tr>
    
    <tr>
      <td>Delete</td>
      <td>/delete</td>
      <td>GET</td>
      <td>-</td>
      <td>id</td>
      <td>boolean</td>
    </tr> -->
  </tbody>
</table>


<<tags:footer></tags:footer>
