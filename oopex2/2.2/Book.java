public class Book {
    private String name;
    private Author[] authors; // Thay đổi thành mảng Author
    private double price;
    private int qty;

    // Constructor cho Book với nhiều tác giả
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Constructor cho Book không có qty
    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 0); // Mặc định qty là 0
    }

    // Các phương thức getter
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Phương thức toString
    @Override
    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        for (Author author : authors) {
            authorsStr.append(author.toString()).append(", ");
        }
        // Xóa dấu phẩy và khoảng trắng cuối cùng
        if (authorsStr.length() > 0) {
            authorsStr.setLength(authorsStr.length() - 2);
        }
        return "Book[name=" + name + ",authors={" + authorsStr + "},price=" + price + ",qty=" + qty + "]";
    }
}

