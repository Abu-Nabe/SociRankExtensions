const date = new Date();

const currentMonth = (date.getMonth() + 1).toString().padStart(2, '0'); // Convert to string and pad with zero if needed
const currentDay = date.getDate().toString().padStart(2, '0'); // Convert to string and pad with zero if needed

export const customDate = currentMonth + currentDay; // Combine the strings

