import CryptoJS from "crypto-js";

export const encryptData = (data, secretKey) => {
  return CryptoJS.AES.encrypt(JSON.stringify(data), secretKey).toString();
};

export const decryptData = (encryptedData, secretKey) => {
   const bytes = CryptoJS.AES.decrypt(encryptedData, secretKey);
  return JSON.parse(bytes.toString(CryptoJS.enc.Utf8));
};
  
  