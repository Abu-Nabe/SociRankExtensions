export function generateGuestUsername() {
    return "guest" + Math.floor(Math.random() * 900000 + 100000) + String.fromCharCode(Math.floor(Math.random() * 26) + 97);
}
  
  
