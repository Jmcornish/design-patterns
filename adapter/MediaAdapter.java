package adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;  
/**
 * @Author Jadon Cornish
 */
public class MediaAdapter implements Media {
    private LittleMedia littleMedia;
    /**
     *  constructor for Media Adapter that sets the private variable
     * @param littleMedia
     */
    MediaAdapter(LittleMedia littleMedia) {
        this.littleMedia = littleMedia;
    }
    /**
     * @return returns the title through little media
     */
    public String getTitle() {
        return littleMedia.getTitle();
    }
    /**
     * @return returns an author comprised of the first and last name
     */
    public Author getAuthor() {
        String[] userName = littleMedia.getAuthor().split(" ");
        String firstName = userName[0];
        String lastName = userName[1];
        return new Author(firstName, lastName);
    }
    /**
     * @return returns the description of the book
     */
    public String getDescription() {
        return littleMedia.getDescription();
    }
    /**
     * calls addReview from littleMedia to add a review after
     * combining first and Last names
     */
    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        String userName = firstName + " " + lastName;
        int ratingNew = (int) Math.round(rating);
        littleMedia.addReview(userName, date, ratingNew, comment);
    }
    /**
     * @return returns an Arraylist of revies after converting
     * the strings into the datatype required for reviews.
     */
    public ArrayList<Review> getReviews() {
        ArrayList<Review> reviews = new ArrayList<Review>();
        for ( int i = 0; i< littleMedia.getReviews().size(); i++) {
            String[] split = littleMedia.getReviews().get(i).split(" stars - ");
            int rating = Integer.parseInt(split[0]);
            String[] split2 = split[1].split(" by ");
            String comment = split2[0];
            String[] split3 = split2[1].split(" - ");
            String[] userName = split3[0].split(" ");
            String firstName = userName[0];
            String lastName = userName[1];
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
            try {  
                Date date = formatter.parse(split3[1]);   
                reviews.add(new Review(firstName, lastName, date, rating, comment));
            } catch (ParseException e) {e.printStackTrace();}  
        }  
        return reviews;
    }
}
