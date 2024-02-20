/** @format */

export function convertPriceToStripe(priceWithSymbol) {
  // Remove $ symbol
  const priceWithoutSymbol = priceWithSymbol.replace("$", "");
  // Convert dollars to cents
  const stripePrice = parseFloat(priceWithoutSymbol) * 100;
  // Return the result
  return stripePrice;
}

// Example usage:
// const priceInCents = convertPriceToCents('$5');