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
      <td>id: int <br> key: String</td>
      <td>User Id <br> API Key</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON</td>
         <td>User details</td>
    </tr>
    
    <tr>
      <td>/getall</td>
      <td>GET</td>
      <td>key: String</td>
      <td>API Key</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON array</td>
         <td>All users</td>
    </tr>
    
    <tr>
      <td>/add</td>
      <td>POST</td>
      <td>key: String</td>
      <td>API Key</td>
      <td>user: application/JSON</td>
       <td>User Object</td>
        <td>boolean</td>
         <td>add success/failure</td>
    </tr>
    
    <tr>
      <td>/update</td>
      <td>POST</td>
      <td>id: int <br> key: String</td>
      <td>User ID <br> API Key</td>
      <td>user: application/JSON</td>
       <td>User Object</td>
        <td>boolean</td>
         <td>update success / failure</td>
    </tr>
    <tr>
      <td>/delete</td>
      <td>GET</td>
      <td>id: int <br> key: String</td>
      <td>UserID <br> API Key</td>
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
      <td>id: int <br> key: String</td>
      <td>Itinerary ID <br> API Key</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON</td>
         <td>Itinerary details</td>
    </tr>
    
    <tr>
      <td>/getall</td>
      <td>GET</td>
      <td>id: int <br> key: String</td>
      <td>User ID <br> API Key</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON array</td>
         <td>Itinerary List of the selected User</td>
    </tr>
    
    <tr>
      <td>/add</td>
      <td>POST</td>
      <td>key: String</td>
      <td> API Key</td>
      <td>itinerary: application/JSON</td>
       <td>Itinerary Object</td>
        <td>boolean</td>
         <td>add success/failure</td>
    </tr>
    
    <tr>
      <td>/update</td>
      <td>POST</td>
      <td>id: int <br> key: String</td>
      <td>Itinerary ID <br> API Key</td>
      <td>itinerary: application/JSON</td>
       <td>Itinerary Object</td>
        <td>boolean</td>
         <td>update success / failure</td>
    </tr>
    <tr>
      <td>/delete</td>
      <td>GET</td>
      <td>id: int <br> key: String</td>
      <td>Itinerary ID <br> API Key</td>
      <td>-</td>
       <td>-</td>
        <td>boolean</td>
         <td>delete success/failure</td>
    </tr>
    
    <!-- No KEY BELOW THIS -->
    <tr>
    	<td rowspan="5">3</td>
      <td rowspan="5">/forum/question</td>
      <td>/get</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Question ID</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON</td>
         <td>Question details</td>
    </tr>
    
    <tr>
      <td>/getall</td>
      <td>GET</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON array</td>
         <td>Question List in Database</td>
    </tr>
    
    <tr>
      <td>/add</td>
      <td>POST</td>
      <td>-</td>
      <td>-</td>
      <td>question: application/JSON</td>
       <td>Question Object</td>
        <td>boolean</td>
         <td>add success/failure</td>
    </tr>
    
    <tr>
      <td>/update</td>
      <td>POST</td>
      <td>id: int</td>
      <td>Question ID</td>
      <td>question: application/JSON</td>
       <td>Question Object</td>
        <td>boolean</td>
         <td>update success / failure</td>
    </tr>
    <tr>
      <td>/delete</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Question ID</td>
      <td>-</td>
       <td>-</td>
        <td>boolean</td>
         <td>delete success/failure</td>
    </tr>
    
     <tr>
    	<td rowspan="5">4</td>
      <td rowspan="5">/forum/answer</td>
      <td>/get</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Answer ID</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON</td>
         <td>Answer details</td>
    </tr>
    
    <tr>
      <td>/getall</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Question ID</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON array</td>
         <td>Answers of selected Question</td>
    </tr>
    
    <tr>
      <td>/add</td>
      <td>POST</td>
      <td>-</td>
      <td>-</td>
      <td>answer: application/JSON</td>
       <td>Answer Object</td>
        <td>boolean</td>
         <td>add success/failure</td>
    </tr>
    
    <tr>
      <td>/update</td>
      <td>POST</td>
      <td>id: int</td>
      <td>Answer ID</td>
      <td>answer: application/JSON</td>
       <td>Answer Object</td>
        <td>boolean</td>
         <td>update success / failure</td>
    </tr>
    <tr>
      <td>/delete</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Answer ID</td>
      <td>-</td>
       <td>-</td>
        <td>boolean</td>
         <td>delete success/failure</td>
    </tr>
   
    <tr>
    	<td rowspan="5">5</td>
      <td rowspan="5">/forum/comment</td>
      <td>/get</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Comment ID</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON</td>
         <td>Comment Detail</td>
    </tr>
    
    <tr>
      <td>/getall</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Answer ID</td>
      <td>-</td>
       <td>-</td>
        <td>application/JSON array</td>
         <td>Comments to selected answer</td>
    </tr>
    
    <tr>
      <td>/add</td>
      <td>POST</td>
      <td>-</td>
      <td>-</td>
      <td>comment: application/JSON</td>
       <td>Comment Object</td>
        <td>boolean</td>
         <td>add success/failure</td>
    </tr>
    
    <tr>
      <td>/update</td>
      <td>POST</td>
      <td>id: int</td>
      <td>Comment ID</td>
      <td>comment: application/JSON</td>
       <td>Comment Object</td>
        <td>boolean</td>
         <td>update success / failure</td>
    </tr>
    <tr>
      <td>/delete</td>
      <td>GET</td>
      <td>id: int</td>
      <td>Comment ID</td>
      <td>-</td>
       <td>-</td>
        <td>boolean</td>
         <td>delete success/failure</td>
    </tr>
   
    <tr>
    	<td rowspan="5">6</td>
      <td rowspan="5">/auth</td>
      <td>/login</td>
      <td>POST</td>
      <td>
      	username: String <br>
      	passwordHash: String
      </td>
      <td>PasswordHash is SHA-256 Hash of the password</td>
      <td>-</td>
       <td>-</td>
        <td>apiKey: String</td>
         <td>The key to be used for generating all requests</td>
    </tr>
    
   
  </tbody>
</table>