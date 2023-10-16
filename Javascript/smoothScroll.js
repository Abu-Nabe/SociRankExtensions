export const scrollToNextItem = (containerID, gridName, gridIndex, currentIndex) => {
  const gridContainer = document.getElementById(containerID);
  const gridItems = gridContainer.getElementsByClassName(gridName);

  if (gridItems.length > 0) {
    const nextIndex = (gridIndex + 1) % gridItems.length;
    const itemWidth = gridItems[nextIndex].offsetWidth;
    const scrollAmount = (nextIndex - gridIndex) * itemWidth;
    const scrollDuration = 500; // Adjust the duration as desired

    smoothScroll(gridContainer, scrollAmount, scrollDuration);
  }
};

export const scrollToPrevItem = (containerID, gridName, gridIndex, currentIndex) => {
  const gridContainer = document.getElementById(containerID);
  const gridItems = gridContainer.getElementsByClassName(gridName);

  if (gridItems.length > 0) {
    const prevIndex =
      (currentIndex - 1 + gridItems.length) % gridItems.length;
    const itemWidth = gridItems[prevIndex].offsetWidth;
    const scrollAmount = (prevIndex - currentIndex) * itemWidth;
    const scrollDuration = 500; // Adjust the duration as desired

    smoothScroll(gridContainer, scrollAmount, scrollDuration);
  }
};


const smoothScroll = (element, scrollAmount, duration) => {
    const start = element.scrollLeft;
    const startTime = performance.now();
  
    const animateScroll = (timestamp) => {
      const elapsed = timestamp - startTime;
      const progress = Math.min(elapsed / duration, 1);
      const scrollDistance = scrollAmount * progress;
      element.scrollLeft = start + scrollDistance;
  
      if (progress < 1) {
        requestAnimationFrame(animateScroll);
      }
    };
  
    requestAnimationFrame(animateScroll);
  };
  