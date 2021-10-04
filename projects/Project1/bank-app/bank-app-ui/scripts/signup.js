let signup = document.getElementById("submit");
let firstName = document.getElementById("firstName");
let lastName = document.getElementById("lastName");
let email = document.getElementById("email");
let password = document.getElementById("password");
let firstNameError = document.getElementById("error");

firstNameError.style.display = "none";
let valid = true;
signup.addEventListener("click", function () {
    console.log("clicked");
    if (firstName.value == "") {
        let firstNameError = document.getElementById("firstNameError");
        firstNameError.innerText = "First name is required";
        let valid = false;
    }
    addCustomer();
});
    
        async function addCustomer(){
            if (valid) {
            let customer = {
                firstName: firstName.value,
                lastName: lastName.value,
                email : email.value,
                password: password.value 
            };
    
            var options = {
                method: 'POST',
                headers: { "Content-Type": "application/json"},
                body: JSON.stringify(customer)
            };
            try {
                let response = await fetch("http://localhost:8080/bank-app-rest/customers", options);
                //let data = await response.json();
                console.log("after getting data");
        
                console.log("after clearing form");
        
            } catch (err) {
            }    
        }
        
    }




firstName.addEventListener("keyup", function () {
    //console.log(firstName.value);
    if (firstName.value != "" && firstName.value.length > 20) {
        let firstNameError = document.getElementById("firstNameError");
        firstNameError.style.display = "block";
        firstNameError.innerText = "First Name cannot exceed 20 characters";
        valid = false;
    }
    if (firstName.value != "" && firstName.value.length <= 20) {
        
        firstNameError.innerText = "";
        valid = true;

    }
    if (firstName.value != "") {
        let pattern = /^[A-Za-z]+$/;
        if(!firstName.value.match(pattern)) {
            firstNameError.style.display = "block";
            firstNameError.innerText = "Number Not Allowed";
        }
       
        valid = false;
    }
    
});
