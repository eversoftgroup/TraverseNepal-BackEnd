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
        <td>application/JSON</td>
         <td>User details</td>
    </tr>
    
    <tr>
      <td>/getall</td>
      <td>GET</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON array</td>
         <td>All users</td>
    </tr>
    
    <tr>
      <td>/add</td>
      <td>POST</td>
      <td>-</td>
      <td>-</td>
      <td>user: application/JSON</td>
       <td>User Object</td>
        <td>boolean</td>
         <td>add success/failure</td>
    </tr>
    
    <tr>
      <td>/update</td>
      <td>POST</td>
      <td>id: int</td>
      <td>User ID</td>
      <td>user: application/JSON</td>
       <td>User Object</td>
        <td>boolean</td>
         <td>update success / failure</td>
    </tr>
    <tr>
      <td>/delete</td>
      <td>GET</td>
      <td>id: int</td>
      <td>UserID</td>
      <td>-</td>
       <td>-</td>
        <td>boolean</td>
         <td>delete success/failure</td>
    </tr>
    
    <tr>
    	<td rowspan="5">2</td>
      <td rowspan="5">/itinerary</td>
      <td>/get</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Itinerary ID</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON</td>
         <td>Itinerary details</td>
    </tr>
    
    <tr>
      <td>/getall</td>
      <td>GET</td>
      <td>id: int</td>
      <td>User ID</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON array</td>
         <td>Itinerary List of the selected User</td>
    </tr>
    
    <tr>
      <td>/add</td>
      <td>POST</td>
      <td>-</td>
      <td>-</td>
      <td>itinerary: application/JSON</td>
       <td>Itinerary Object</td>
        <td>boolean</td>
         <td>add success/failure</td>
    </tr>
    
    <tr>
      <td>/update</td>
      <td>POST</td>
      <td>id: int</td>
      <td>Itinerary ID</td>
      <td>itinerary: application/JSON</td>
       <td>Itinerary Object</td>
        <td>boolean</td>
         <td>update success / failure</td>
    </tr>
    <tr>
      <td>/delete</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Itinerary ID</td>
      <td>-</td>
       <td>-</td>
        <td>boolean</td>
         <td>delete success/failure</td>
    </tr>
    
     <tr>
    	<td rowspan="5">3</td>
      <td rowspan="5">/forum/answer</td>
      <td>/getall</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Question ID</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON array</td>
         <td>All answers to selected Question</td>
    </tr>

   
  </tbody>
</table>