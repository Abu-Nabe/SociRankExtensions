export function formatDate(timestamp) {
    const date = new Date(timestamp); // Convert milliseconds to a Date object
  
    // Format date to dd/MM/yyyy
    const formattedDate = new Intl.DateTimeFormat('en-GB', {
      day: '2-digit',
      month: '2-digit',
      year: 'numeric',
    }).format(date);
  
    return formattedDate;
}