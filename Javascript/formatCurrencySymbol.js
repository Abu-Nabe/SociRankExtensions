export const formatAmountWithSymbol = (amount) => {
  const symbol = localStorage.getItem("symbol"); // Custom symbol stored
  const currencyCode = localStorage.getItem("currencyCode");

  if (currencyCode) {
    const formattedAmount = new Intl.NumberFormat("en-US", {
      style: "currency",
      currency: currencyCode,
      currencyDisplay: "symbol", // Forces symbol instead of code
    }).format(amount);

    return formattedAmount.replace(currencyCode, symbol);
  } 
};
