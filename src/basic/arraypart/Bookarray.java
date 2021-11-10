package basic.arraypart;

public class Bookarray {
    public static void main(String[] args) {
        Book library[] = new Book[5];
        Book library2[] = new Book[5];
        library[0] = new Book("토지","박경리");
        library[1] = new Book("태백산맥","조정래");
        library[2] = new Book("데미안","헤르만 헤세");
        library[3] = new Book("어떻게 살 것인가","유시민");
        library[4] = new Book("어린왕자","생텍쥐페리");

        System.out.println("library");
        for(int i=0; i< library.length; i++){
            library[i].showBookInfo();
        }

        System.arraycopy(library,0,library2, 0,5);
        System.out.println("library2");
        for (int i=0; i< library2.length; i++){
            library2[i].showBookInfo();
        }
    }
}
