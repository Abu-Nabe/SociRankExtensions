function calculateFees(amount) {
  // Convert the amount string to a number
  const amountNumber = parseFloat(amount);

  // Check if the input is valid
  if (isNaN(amountNumber) || amountNumber <= 0) {
    return "Invalid amount. Please enter a valid number.";
  }

  // Calculate 5% fees
  const tax = (amountNumber * 5) / 100;

  // Calculate the final amount after fees
  const finalAmount = amountNumber - tax;

  // Return the formatted string
  return `5% Fees. You will receive $${finalAmount.toFixed(2)}`;
}
