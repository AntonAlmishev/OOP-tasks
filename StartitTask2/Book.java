package MetodsAndArrays.StartitTask2;

public class Book {

        private String title;
        private String author;
        private String ISBN;
        private int pages;
        private String publisher;
        private double price;
        public static int countBooks = 0;

    public Book(String title,String author,String ISBN,int pages,String publisher,double price) {

        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.pages=pages;
        this.publisher=publisher;
        this.price=price;
        countBooks++;

    }

    public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            pages = pages;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

    @Override
    public String toString() {
        return "Book\n{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", pages=" + pages +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';

    }
}

