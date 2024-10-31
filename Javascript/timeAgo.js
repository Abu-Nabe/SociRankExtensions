export const timeAgo = (timestamp) => {
  const now = Date.now();
  const secondsAgo = Math.floor((now - timestamp) / 1000);
  let interval = Math.floor(secondsAgo / 31536000); // 1 year in seconds

  if (interval >= 1) {
    return `${interval} year${interval > 1 ? "s" : ""} ago`;
  }
  interval = Math.floor(secondsAgo / 2592000); // 1 month in seconds
  if (interval >= 1) {
    return `${interval} month${interval > 1 ? "s" : ""} ago`;
  }
  interval = Math.floor(secondsAgo / 604800); // 1 week in seconds
  if (interval >= 1) {
    return `${interval} week${interval > 1 ? "s" : ""} ago`;
  }
  interval = Math.floor(secondsAgo / 86400); // 1 day in seconds
  if (interval >= 1) {
    return `${interval} day${interval > 1 ? "s" : ""} ago`;
  }
  interval = Math.floor(secondsAgo / 3600); // 1 hour in seconds
  if (interval >= 1) {
    return `${interval} hour${interval > 1 ? "s" : ""} ago`;
  }
  interval = Math.floor(secondsAgo / 60); // 1 minute in seconds
  if (interval >= 1) {
    return `${interval} minute${interval > 1 ? "s" : ""} ago`;
  }
  return "Just now";
};
