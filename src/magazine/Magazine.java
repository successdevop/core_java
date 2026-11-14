package magazine;

import java.util.Objects;

public class Magazine{
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    public Magazine(String title, String publisher, int issueNumber, int publicationYear){
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }

    public Magazine(Magazine source){
        this.title = source.title;
        this.publisher = source.publisher;
        this.issueNumber = source.issueNumber;
        this.publicationYear = source.publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.isBlank()){
            throw new IllegalArgumentException("Title cannot be null or blank.");
        }
        this.title = title;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if(issueNumber <= 0){
            throw new IllegalArgumentException("Issue number must be grater than zero.");
        }
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if(publisher == null || publisher.isBlank()){
            throw new IllegalArgumentException("Publisher cannot be null or blank.");
        }
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if(publicationYear <= 0){
            throw new IllegalArgumentException("Publication year must be grater than zero.");
        }
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return issueNumber == magazine.issueNumber && publicationYear == magazine.publicationYear && Objects.equals(title, magazine.title) && Objects.equals(publisher, magazine.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publisher, issueNumber, publicationYear);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", issueNumber=" + issueNumber +
                ", publicationYear=" + publicationYear +
                '}';
    }
}