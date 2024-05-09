export const openAudio = () => {
    return new Promise((resolve, reject) => {
      const input = document.createElement("input");
      input.type = "file";
      input.accept = "audio/*,video/mp4";
      input.onchange = (event) => {
        const files = event.target.files;
        if (files.length > 0) {
          // Resolve the promise with the File object representing the selected audio file
          resolve(files[0]);
        } else {
          // Reject the promise if no file is selected
          reject(new Error("No file selected"));
        }
      };
      input.click();
    });
  };
  