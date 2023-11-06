export const checkPhoneNumber = (value) => {
    // Use a regular expression to match only allowed characters
    const phoneNumberPattern = /^[0-9+]+$/;
  
    // Test if the value matches the pattern
    return phoneNumberPattern.test(value);
  };
  