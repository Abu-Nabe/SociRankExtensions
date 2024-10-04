 const cartListData = () => {
    const count = cartArray.filter(item => item.selected === true).length;
    setSelectedItemsCount(count); // Set the state outside the object

    const totalPrice = cartArray
      .filter(item => item.selected === true) // Filter selected items
      .reduce((acc, item) => acc + item.itemPrice * item.itemQuantity, 0); // Sum up itemPrice * itemQuantity
  
    setTotalPrice(totalPrice);  // Set the total price state
};
