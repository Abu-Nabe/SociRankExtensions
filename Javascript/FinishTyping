// Extension that only searches when user is done typing

const handleKeyDown = () => {
    // Clear the timeout if there's any
    if (typingTimeout) {
      clearTimeout(typingTimeout);
    }
  };
  
  const handleKeyUp = (e) => {
    // Set a timeout to trigger the search after typing has stopped
    clearTimeout(typingTimeout);
    setTypingTimeout(setTimeout(() => {

    }, 200)); // Adjust the delay as needed (e.g., 1000 milliseconds = 1 second)
  };
