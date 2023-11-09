import { v4 as uuidv4 } from 'uuid';

// Function to generate UUID
export const generateUUID = () => {
  const uuid = uuidv4();
  return uuid;
};
