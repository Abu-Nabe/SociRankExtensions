export const validateEmail = (email) => {
    if(email.trim() == ""){
        return false;
    }
    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    return emailPattern.test(email);
};

export const validateUsername = (username) => {
    var value = username.replace(/ /g, "_").trim()
    if(value == "" || value == "_"){
        return false;
    }else if (value.length >= 24) {
        return false
    }

    const usernamePattern = /^[a-zA-Z0-9 _]*$/;
    return usernamePattern.test(value);
};