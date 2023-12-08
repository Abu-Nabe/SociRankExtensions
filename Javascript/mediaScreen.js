// MediaScreen.js
import { useEffect, useState } from "react";

export let isMediaScreen = false;
export let setMediaScreen = () => {};

export const useMediaScreen = () => {
  [isMediaScreen, setMediaScreen] = useState(false);

  useEffect(() => {
    const handleResize = () => {
      setMediaScreen(window.innerWidth < 1100);
    };

    // Initial check
    handleResize();

    // Event listener for window resize
    window.addEventListener("resize", handleResize);

    // Cleanup the event listener on component unmount
    return () => {
      window.removeEventListener("resize", handleResize);
    };
  }, []);

  return [isMediaScreen, setMediaScreen];
};
