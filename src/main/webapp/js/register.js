/**
 * 
 */

function register(f){
	
	
	var username = f.elements["username"].value;
	var password = f.elements["password"].value;
	var repassword = f.elements["repassword"].value;
	var sex = f.elements["sex"].value;
	var age = f.elements["age"].value;
	var telephone = f.elements["telephone"].value;
	var email = f.elements["email"].value;
	
	var result = true;
	
	if(username == null ||username.trim()==""){
		
		reuslt = false;
		
	}
	
	
	
	return result;
	
	
}