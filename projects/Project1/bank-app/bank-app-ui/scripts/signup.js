let signup = document.getElementById("submit");
let firstName = document.getElementById("firstName");
let lastName = document.getElementById("lastName");
let email = document.getElementById("email");
let password = document.getElementById("password");
let error = document.getElementById("error");
error.style.display = "none";
signup.addEventListener("click", function () {
    console.log("clicked");
    if (firstName.value == "") {
        let firstNameError = document.getElementById("firstNameError");
        firstNameError.innerText = "First name is required";
        let valid = false;
    }
    if (valid) {
        let customer = {
            firstName: firstName.value,
            lastName: lastName.value,
            email : email.value,
            password: password.value 
        };

        var options = {
            method
        }
    }

});

firstName.addEventListener("keyup", function () {
    //console.log(firstName.value);
    if (firstName.value != "" && firstName.value.length > 20) {
        let firstNameError = document.getElementById("firstNameError");
        firstNameError.innerText = "First Name cannot exceed 20 characters";
        valid = false;
    }
    if (firstName.value != "" && firstName.value.length <l= 20) {
        
        firstNameError.innerText = "";
        valid = faslse;

    }
    if (firstName.value != "") {
        let pattern = /^[AZa-z]+$/;
        if(!firstName.value.match(pattern)) {
            firstNameError.innerText = "Number Not Allowed";
        }
       
        valid = false;
    }
    
});
