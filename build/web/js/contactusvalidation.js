function Submit(){
 var emailRegex = /^[A-Za-z0-9._]*\@[A-Za-z]*\.[A-Za-z]{2,5}$/;
 var fname = document.form.name.value,
  femail = document.form.email.value,
  fsub = document.form.subject.value;
  fmessage = document.form.message.value;
   
 if( fname == "" )
   {
     document.form.name.focus() ;
  document.getElementById("errorBox").innerHTML = "enter the name";
     return false;
   }
    
   if (femail == "" )
 {
  document.form.email.focus();
  document.getElementById("errorBox").innerHTML = "enter the email";
  return false;
  }else if(!emailRegex.test(femail)){
  document.form.email.focus();
  document.getElementById("errorBox").innerHTML = "enter the valid email";
  return false;
  }
   
     
 if(fsub == "")
  {
   document.form.subject.focus();
   document.getElementById("errorBox").innerHTML = "enter the subject";
   return false;
  }
   
   if (fmessage == "" )
 {
  document.form.message.focus();
  document.getElementById("errorBox").innerHTML = "enter the message";
  return false;
 }

  if(fname != '' &&  femail != '' && fsub != '' && fmessage != ''){
   document.getElementById("errorBox").innerHTML = "form submitted successfully";
   }
     
}