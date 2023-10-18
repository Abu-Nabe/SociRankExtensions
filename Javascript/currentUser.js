const authenticationData = JSON.parse(localStorage.getItem('currentUser'));
export const userAuthenticated = authenticationData && authenticationData.username;
