export function generateRandomKey(length) {
    const charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+[]{}|;:,.<>?";
    let key = "";
  
    for (let i = 0; i < length; i++) {
      const randomIndex = Math.floor(Math.random() * charset.length);
      key += charset.charAt(randomIndex);
    }
  
    return key;
  }
  
  // Example usage to generate a random key of length 16
  const randomKey = generateRandomKey(12);
  console.log(randomKey);
  