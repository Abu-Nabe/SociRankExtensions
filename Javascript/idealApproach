// both does the same things just one is more readable and easily maintained

function unidealApproach() {
  if (colorsDataArray.length > 0) {
    setColorSelected(colorsDataArray[0]);
  }
  if (materialsDataArray.length > 0) {
    setMaterialSelected(materialsDataArray[0]);
  }
  if (modelsDataArray.length > 0) {
    setModelSelected(modelsDataArray[0]);
  }

  if (othersDataArray.length > 0) {
     setOtherSelected(othersDataArray[0]); 
  }
}

function idealApproach() {
  const getFirstOrDefault = (array, defaultValue) => (array.length > 0 ? array[0] : defaultValue);
  
  setColorSelected(getFirstOrDefault(colorsDataArray, null));
  setMaterialSelected(getFirstOrDefault(materialsDataArray, null));
  setModelSelected(getFirstOrDefault(modelsDataArray, []));
  setOtherSelected(getFirstOrDefault(othersDataArray, []));
}

Benefits of the idealApproach - 

Readability:
The logic is concise and expressed in a single line per operation.
Eliminates repetitive if statements, making the code easier to scan and understand.

Maintainability:
Adding or modifying conditions requires less effort since each assignment is self-contained.
Reduces the chance of errors when updating logic across multiple similar conditions.

Scalability:
Easier to extend if new arrays or conditions are introduced in the future. You can simply add new lines without altering the structure.

Cleaner Debugging:
Each assignment explicitly states the condition and the fallback, which is easier to debug than stepping through multiple if blocks.

Performance (Slight Edge):
Using a ternary operator directly avoids the overhead of multiple if statements. While negligible in this context, it scales better when there are many conditions.

Consistency Across Assignments:
Handles potential undefined or null cases (othersDataArray[0] || [] for fallback).
Establishes a uniform style for array-based state handling.

