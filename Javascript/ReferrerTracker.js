import { useEffect } from "react";

const ReferrerTracker = () => {
  useEffect(() => {
    const referrer = document.referrer;

    if (referrer) {
      console.log("User came from:", referrer);

      let source = "Other";
      if (referrer.includes("facebook.com")) source = "Facebook";
      else if (referrer.includes("twitter.com")) source = "Twitter";
      else if (referrer.includes("instagram.com")) source = "Instagram";
      else if (referrer.includes("google.com")) source = "Google";

      console.log(`Detected source: ${source}`);
    } else {
      console.log("User accessed directly or referrer not available.");
    }
  }, []);

  return null; // This component only runs tracking logic
};

export default ReferrerTracker;
