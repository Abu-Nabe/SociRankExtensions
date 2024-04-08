/** @format */
export const openGallery = () => {
  return new Promise((resolve, reject) => {
    const input = document.createElement("input");
    input.type = "file";
    input.accept = "image/*";
    input.onchange = (event) => {
      const files = event.target.files;
      if (files.length > 0) {
        const reader = new FileReader();
        reader.readAsDataURL(files[0]);
        reader.onload = () => {
          const imageDataUrl = reader.result;
          // Resolve the promise with the image data URL
          resolve(imageDataUrl);
        };
        reader.onerror = (error) => {
          // Reject the promise if there's an error reading the file
          reject(error);
        };
      }
    };
    input.click();
  });
};
