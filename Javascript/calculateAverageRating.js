function calculateAverageRating(ratings) {
    // Step 1: Sum the ratings
    const totalRatings = ratings.reduce((sum, rating) => sum + rating, 0);
  
    // Step 2: Count the number of ratings
    const numberOfRatings = ratings.length;
  
    // Step 3: Calculate the average
    const averageRating = totalRatings / numberOfRatings;
  
    // Round to one decimal place (optional)
    const averageRounded = Math.round(averageRating * 10) / 10;
  
    return `${averageRounded} ★`;
  }
  