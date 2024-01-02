const showPassword = () => {
    var pass = document.getElementById("password");
    var eye1 = document.getElementById("eye1");
    var eye2 = document.getElementById("eye2");

    if(pass.type === 'password'){
        pass.type = 'text'; 
        eye1.style.display = 'none';
        eye2.style.display = 'block';
    }

    else   {
        pass.type = 'password'; 
        eye1.style.display = 'block';
        eye2.style.display = 'none';
    }


};


const showRePassword = () => {
    var pass = document.getElementById("re-password");
    var eye3 = document.getElementById("eye3");
    var eye4 = document.getElementById("eye4");

    if(pass.type === 'password'){
        pass.type = 'text'; 
        eye3.style.display = 'none';
        eye4.style.display = 'block';
    }

    else   {
        pass.type = 'password'; 
        eye3.style.display = 'block';
        eye4.style.display = 'none';
    }


};

const showToast = (type, message) => {
    debugger;
    var toast = document.getElementById('toast');
    toast.classList.add('show');
    toast.style.display = "block";
    
    if(type === "success"){
        toast.style.backgroundColor = "#07bc0c";
    }else if(type === "error"){
        toast.style.backgroundColor = "#e74c3c";
    }else if(type === "warning"){
        toast.style.backgroundColor = "#f1c40f";
    }
    toast.innerHTML = `${message}`;

    setTimeout(function() {
        toast.style.display = "none";
        toast.classList.remove('show');
    }, 3000);
};


const reqFieldsValidation = () => {
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    var repassword = document.getElementById("re-password").value;
    if(name === '' || email === '' || password === '' || repassword === ''){
        showToast("error", "Please fill all the required fileds");
    }else{
        return true;
    }
};
