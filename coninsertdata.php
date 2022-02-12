<?php
include 'conaman.php';

if($_SERVER['REQUEST_METHOD']=='POST'){






 $username = $_POST['username'];
 $password = $_POST['password'];
 

 $CheckSQL = "SELECT * FROM table1 WHERE Username='$username'";
 
 $check = mysqli_fetch_array(mysqli_query($con,$CheckSQL));
 
 if(isset($check)){

 echo 'Email Already Exist';

 }
else{ 
$Sql_Query = "INSERT INTO table1(Username,Password) values ('$username','$password')";

 if(mysqli_query($con,$Sql_Query))
{
 echo 'Registration Successfully';
}
else
{
 echo 'Something went wrong';
 }
 }
}
 
?>