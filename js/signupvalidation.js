function Submit(){
 var emailRegex = /^[A-Za-z0-9._]*\@[A-Za-z]*\.[A-Za-z]{2,5}$/;
 var fname = document.form.Name.value,
  femail = document.form.Email.value,
  fpassword = document.form.Password.value;
  fconfirmpassword = document.form.ConfirmPassword.value;
   
 if( fname == "" )
   {
     document.form.Name.focus() ;
  document.getElementById("errorBox").innerHTML = "enter the first name";
     return false;
   }
    
   if (femail == "" )
 {
  document.form.Email.focus();
  document.getElementById("errorBox").innerHTML = "enter the email";
  return false;
  }else if(!emailRegex.test(femail)){
  document.form.Email.focus();
  document.getElementById("errorBox").innerHTML = "enter the valid email";
  return false;
  }
   
     
 if(fpassword == "")
  {
   document.form.Password.focus();
   document.getElementById("errorBox").innerHTML = "enter the password";
   return false;
  }
   
   if (fconfirmpassword == "" )
 {
  document.form.ConfirmPassword.focus();
  document.getElementById("errorBox").innerHTML = "Re-enter the Password";
  return false;
 }
  if(fconfirmpassword !=  fpassword){
   document.form.Password.focus();
   document.getElementById("errorBox").innerHTML = "Passwords are not matching, re-enter again";
   return false;
   }

  if(fname != '' &&  femail != '' && fpassword != '' && fconfirmpassword != ''){
   document.getElementById("errorBox").innerHTML = "form submitted successfully";
   }
     
}