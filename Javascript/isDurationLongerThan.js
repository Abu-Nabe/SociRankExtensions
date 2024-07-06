export function isDurationLongerThanTenMinutes(durationString) {
    const parts = durationString.split(':');
    let totalMinutes = 0;
  
    if (parts.length === 2) {
      // Format MM:SS
      const minutes = parseInt(parts[0], 10);
      const seconds = parseInt(parts[1], 10);
      totalMinutes = minutes + seconds / 60;
    } else if (parts.length === 3) {
      // Format HH:MM:SS
      const hours = parseInt(parts[0], 10);
      const minutes = parseInt(parts[1], 10);
      const seconds = parseInt(parts[2], 10);
      totalMinutes = hours * 60 + minutes + seconds / 60;
    }
  
    return totalMinutes > 10;
  }