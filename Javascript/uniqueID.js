function generateUniqueId() {
    const timestamp = Date.now().toString();
    const random1 = Math.floor(Math.random() * 1000000).toString().padStart(7, "0");
    const random2 = Math.floor(Math.random() * 1000000).toString().padStart(7, "0");
  
    return `${timestamp}-${random1}-${random2}`;
  }
  
export const uniqueId = generateUniqueId();