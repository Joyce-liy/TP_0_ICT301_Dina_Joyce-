
public class Book{
    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
    public void printtoscreen() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
    }
    public void saveToDatabase() {
      
        System.out.println("Sauvegarde du livre: " + title+" en base de données.");
    }
    public void emprunter(String lecteur) {
       
        System.out.println("Emprunt du livre: " + title + "  par " + lecteur );
    }

}
 class Main {
    public static void main(String[] args) {
        Book book = new Book("Les principes solid", "Etudiants de M1-Gl", "Revision des principes SOLID");
        book.printtoscreen();
        book.saveToDatabase();
        book.emprunter("Marcial");
    }
}