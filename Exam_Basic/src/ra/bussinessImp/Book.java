package ra.bussinessImp;

import ra.bussiness.IBook;
import ra.utils.ScannerUtils;

import java.util.Scanner;

public class Book implements IBook, Comparable<Book> {
    static int  id = 1;
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;

    /**Constructor*/
    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, float importPrice, float exportPrice, float interest, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

    /** Getter && Setter*/
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    /**Input data*/
    @Override
    public void inputData(Scanner scanner) {
        System.out.println("*** Xin mời nhập thông tin sách ***");

        /**Book id*/
        this.bookId = id++;

        /**Book name*/
        do {
            System.out.println("Nhập tên sách");
            this.bookName =  ScannerUtils.inputString(scanner);

            if(this.bookName.isEmpty()) {
                System.out.println("Tên sách không được để trống");
            }
        }while (this.bookName.isEmpty());

        /**Title*/
        do {
            System.out.println("Nhập tiêu đề sách");
            this.title =  ScannerUtils.inputString(scanner);

            if(this.title.isEmpty()) {
                System.out.println("Tên tiêu đề không được để trống");
            }
        }while (this.title.isEmpty());

        /**Number of pages*/
        do {
            System.out.println("Nhập số trang sách");
            this.numberOfPages =  ScannerUtils.inputInt(scanner);

            if(this.numberOfPages <= 0) {
                System.out.println("Số trang sách phải lớn hơn 0.");
            }
        }while (this.numberOfPages <= 0);

        /**Import price*/
        do {
            System.out.println("Nhập giá nhập");
            this.importPrice =  ScannerUtils.inputFloat(scanner);

            if(this.importPrice <= 0) {
                System.out.println("Giá nhập phải lớn hơn 0.");
            }
        }while (this.importPrice <= 0);

        /**Export price*/
        do {
            System.out.println("Nhập giá xuất");
            this.exportPrice =  ScannerUtils.inputFloat(scanner);

            if(this.exportPrice <= 0) {
                System.out.println("Giá nhập phải lớn hơn 0.");
            }
        }while (this.exportPrice <= 0);


        boolean isLoop = true;

        /**Book status*/
        do {
            System.out.println("Xin mời chọn trạng thái sách (1. Đang bán - 2. Hết hàng.): ");
            int choice =  ScannerUtils.inputInt(scanner);

            switch (choice) {
                case 1:
                    this.bookStatus = true;
                    isLoop = false;
                    break;
                case 2:
                    this.bookStatus = false;
                    isLoop = false;
                    break;
                default:
                    System.out.printf("Không có lựa chọn \"%d\"%n", choice);
            }

            if(!isLoop ) {
              break;
            }
        }while (isLoop);

        this.interest = this.exportPrice - importPrice;
    }

    /**Display data*/
    @Override
    public void displayData() {

        String status = this.bookStatus ? "Đang bán" : "Hết hàng";

        System.out.printf("**** Thông tin sách \"%s\" *****%n", this.bookName);
        System.out.printf("Mã sách: %d - Tên sách: %s %n" +
                          "Title: %s - Số trang sách: %d %n" +
                          "Giá nhập: %.3f - Giá xuất: %.3f - Lợi nhuận: %.3f %n" +
                          "Trạng thái sách %s %n",
                          this.bookId, this.bookName,
                          this.title, this.numberOfPages,
                          this.importPrice, this.exportPrice, this.interest,
                          status);
    }


    @Override
    public int compareTo(Book otherBook) {
      if(this.interest > otherBook.getInterest()) {
          return -1;
      }else if(this.interest < otherBook.getInterest()){
          return 1;
      }

      return 0;

    }
}
