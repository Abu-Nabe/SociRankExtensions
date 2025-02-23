import { useState, useEffect } from "react";

const useIsDesktop = (breakpoint = 1024) => {
  const [isDesktop, setIsDesktop] = useState(window.innerWidth >= breakpoint);

  useEffect(() => {
    const handleResize = () => {
      setIsDesktop(window.innerWidth >= breakpoint);
    };

    window.addEventListener("resize", handleResize);
    return () => window.removeEventListener("resize", handleResize);
  }, [breakpoint]);

  return isDesktop;
};

export default useIsDesktop;


// usage
import useIsDesktop from "./useIsDesktop";

const MyComponent = () => {
  const isDesktop = useIsDesktop();

  return (
    <div>
      {isDesktop ? <p>Desktop Mode</p> : <p>Mobile Mode</p>}
    </div>
  );
};
