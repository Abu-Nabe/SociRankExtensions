const selectFile = () => {
         // Create an invisible file input element
    const fileInput = document.createElement("input");
    fileInput.type = "file";
    fileInput.accept = ".pdf,.doc,.docx,.odt,.rtf";

    // Handle file selection
    fileInput.addEventListener("change", (e) => {
      const selectedFile = e.target.files[0];
      if (selectedFile) {
        // You can now handle the selected file as needed.
        setResumeLabel(selectedFile.name)
        
        console.log("Selected file:", selectedFile);
      }
    });

    // Trigger the file input dialog
    fileInput.click();
  };
