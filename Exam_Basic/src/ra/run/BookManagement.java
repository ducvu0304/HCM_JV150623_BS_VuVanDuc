package ra.run;

import ra.bussiness.IBook;
import ra.bussinessImp.Book;
import ra.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        boolean isLoop = true;
        boolean isExist = false;
        int bookId = 0;
        List<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (isLoop) {
            System.out.println("**************** MENU ***************\n" +
                    "1. Nhập số sách và nhập thông tin sách [15 điểm]\n" +
                    "2. Hiển thị thông tin các sách [15 điểm]\n" +
                    "3. Sắp xếp sách theo lợi nhuận giảm dần [15 điểm]\n" +
                    "4. Xóa sách theo mã sách [10 điểm]\n" +
                    "5. Tìm kiếm sách theo tên sách [10 điểm]\n" +
                    "6. Thay đổi trạng thái của sách theo mã sách [10 điểm]\n" +
                    "7. Thoát [05 điểm");

            System.out.println("Xin mời chọn chức năng:");
            int choice = ScannerUtils.inputInt(scanner);

            switch (choice){
                case 1:
                    System.out.println("Xin mời nhập số lượng sách:");
                    int number = ScannerUtils.inputInt(scanner);

                    for (int i = 0; i < number; i++) {
                        Book book =  new Book();
                        book.inputData(scanner);
                        bookList.add(book);
                    }
                    System.out.println("Nhập thông tin sách thành công");
                    break;
                case 2:
                    if (!bookList.isEmpty()) {
                        for (Book book : bookList) {
                            book.displayData();
                        }
                    }else {
                        System.out.println("Danh sách rỗng");
                    }

                    break;
                case 3:
                    if(!bookList.isEmpty()) {
                        Collections.sort(bookList);
                        System.out.println("Sách được sắp xếp theo lợi nhuận giảm dần thành công!");
                    }else {
                        System.out.println("Danh sách rỗng");
                    }

                    break;
                case 4:
                    if(!bookList.isEmpty()) {
                        System.out.println("Xin mời nhập mã sách:");
                        bookId =  ScannerUtils.inputInt(scanner);
                        isExist = false;

                        for (int i = 0; i < bookList.size(); i++) {
                            if(bookList.get(i).getBookId() == bookId) {
                                bookList.remove(i);
                                isExist = true;
                                System.out.printf("Đã xóa sách có id \"%d\" thành công%n", bookId);
                                break;
                            }
                        }

                        if(!isExist) {
                            System.out.printf("Sách có mã sách \"%d\" không có trong danh sách.%n", bookId);
                        }
                    }else {
                        System.out.println("Danh sách rỗng");
                    }

                    break;
                case 5:
                    if(!bookList.isEmpty()) {
                        isExist = false;
                        System.out.println("Xin mời nhập tên sách");
                        String bookName = ScannerUtils.inputString(scanner).toLowerCase();

                        for (int i = 0; i < bookList.size() ; i++) {
                            if(bookList.get(i).getBookName().toLowerCase().contains(bookName)) {
                                bookList.get(i).displayData();
                                isExist = true;
                                break;
                            }
                        }

                        if(!isExist) {
                            System.out.printf("Sách có \"%s\" không có trong danh sách.%n", bookName);
                        }
                    }else {
                        System.out.println("Danh sách rỗng");
                    }

                    break;
                case 6:
                    if(!bookList.isEmpty()) {
                        System.out.println("Xin mời nhập mã sách");
                        bookId =  ScannerUtils.inputInt(scanner);
                        isExist = false;

                        for (int i = 0; i < bookList.size(); i++) {
                            if(bookList.get(i).getBookId() == bookId) {
                                bookList.get(i).setBookStatus(!bookList.get(i).isBookStatus());
                                isExist = true;
                                System.out.printf("Sách có id \"%d\" cập nhật trạng thái thành công%n", bookId);
                                break;
                            }

                            if(!isExist) {
                                System.out.printf("Sách có mã sách \"%d\" không có trong danh sách.%n", bookId);
                            }
                        }
                    }else {
                        System.out.println("Danh sách rỗng");
                    }

                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.printf("Tính năng số \"%d\" không có trong menu %n", choice);
            }
        }
    }
}
