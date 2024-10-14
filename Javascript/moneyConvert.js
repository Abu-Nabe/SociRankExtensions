export function formatMoney(value) {
    // Ensure the input is a number
    let num = parseFloat(value);
  
    if (isNaN(num)) return '0';
  
    // Define formatting based on the size of the number
    if (num >= 1000000) {
      return Math.floor(num / 1000000) + 'm'; // Millions
    } else if (num >= 1000) {
      return Math.floor(num / 1000) + 'k'; // Thousands
    } else {
      return num.toString(); // Less than 1000, return as is
    }
  }