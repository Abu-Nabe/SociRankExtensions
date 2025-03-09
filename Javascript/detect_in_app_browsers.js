const isInAppBrowser = () => {
  const userAgent = navigator.userAgent || navigator.vendor || window.opera;

  return /FBAN|FBAV|Instagram|TikTok|Snapchat/i.test(userAgent);
};

const redirectToExternalBrowser = () => {
  const url = window.location.href; 

  if (navigator.userAgent.includes("iPhone") || navigator.userAgent.includes("iPad")) {
    // Open in Safari
    window.location.href = `safari-web://${url}`;
  } else if (navigator.userAgent.includes("Android")) {
    // Open in Chrome
    window.location.href = `intent://${url.replace("https://", "").replace("http://", "")}#Intent;scheme=https;package=com.android.chrome;end;`;
  }
};

import { useEffect } from "react";

const RedirectComponent = () => {
  useEffect(() => {
    if (isInAppBrowser()) {
      redirectToExternalBrowser();
    }
  }, []);

  return (
    <div>
      <p>Redirecting you to an external browser...</p>
      <p>If not redirected, <a href={window.location.href}>click here</a>.</p>
    </div>
  );
};

export default RedirectComponent;

How It Works
1. Detects if the app is opened in Instagram/TikTok in-app browser.
2. Redirects to Safari (iOS) or Chrome (Android).
3. If redirection fails, shows a link to manually open in a browser.

