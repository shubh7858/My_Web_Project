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