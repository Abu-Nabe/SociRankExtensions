const getExchangeRate = async (fromCurrency, toCurrency) => {
  const apiKey = "YOUR_API_KEY"; // Get your own API key from ExchangeRate-API
  const url = `https://v6.exchangerate-api.com/v6/${apiKey}/latest/${fromCurrency}`;

  try {
    const response = await fetch(url);
    const data = await response.json();
    return data.conversion_rates[toCurrency];
  } catch (error) {
    console.error('Error fetching exchange rate:', error);
    return null;
  }
};
