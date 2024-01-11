export const convertPrice = (priceInt) => {
    // Check if the price is greater than or equal to 1000
    if (priceInt >= 1000) {
      // Use Intl.NumberFormat to format the number with commas
      return new Intl.NumberFormat().format(priceInt);
    }
  
    // If the price is less than 1000, return it as is
    return priceInt.toString();
  };
  