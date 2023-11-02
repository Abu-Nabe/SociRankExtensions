export function handleButtons(event, hoveredIndex, listArray, setIsOpen, setHoveredIndex, goProfile, textRef) {
       if (event.key === "ArrowDown" && hoveredIndex < listArray.length - 1) {
        setHoveredIndex(hoveredIndex + 1);
        scrollAndFocus(hoveredIndex, textRef);
        event.preventDefault();
      } else if (event.key === "ArrowUp" && hoveredIndex > 0) {
        setHoveredIndex(hoveredIndex - 1);
        scrollAndFocus(hoveredIndex, textRef);
      } else if (event.key === "Enter" && hoveredIndex !== -1) {
        goProfile(listArray[hoveredIndex].username);
      } else if (event.key === "Escape") {
        setIsOpen(false)
      }
}
  
  const scrollAndFocus = (hoveredIndex, textRef) => {
    if (hoveredIndex !== -1) {
      const element = textRef.current;
      const elements = element.querySelectorAll(".fullWidthTable");
      elements[hoveredIndex].focus();
    }
  };