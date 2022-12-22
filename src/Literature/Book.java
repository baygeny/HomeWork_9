package Literature;

public class Book {
    private Title title;
    private Author author;
    private Content content;

    public Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void Show() {
        System.out.print("Title: "); title.Show();
        System.out.print("Author: "); author.Show();
        System.out.print("Content: "); content.Show();
    }

    public static void main(String[] args) {
       Book book = new Book(
            new Title("On west front without changes"),
            new Author("E. M. Remark"),
            new Content("Chapter I.....p.3\n         Chapter II....p.134\n         Chapter III...p.243")
        );
        book.Show();
    }
}