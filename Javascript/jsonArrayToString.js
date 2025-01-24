export function parseAndFilter(jsonString) {
    try {
      // Parse the JSON string into an array
      const array = JSON.parse(jsonString);
  
      // Filter out empty strings
      return array.filter(item => item.trim() !== "");
    } catch (error) {
      console.error("Invalid JSON string:", error);
      return []; // Return an empty array if there's an error
    }
  }