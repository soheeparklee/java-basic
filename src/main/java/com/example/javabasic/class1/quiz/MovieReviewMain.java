package com.example.javabasic.class1.quiz;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "titanic";
        movieReview1.review = "very fun";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "about time";
        movieReview2.review = "very love";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("title: "+ movieReview.title + " review: " + movieReview.review);
        }


    }
}
