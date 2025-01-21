package pac2;

public class Take11 {

    public static void main(String[] args) {


        String path="C:\\Users\\pgupta\\Downloads\\testdata.xlsx";
        NALExcelXLSReader reader=new NALExcelXLSReader(path);


        String cell = reader.getCellData("register", "firstname", 2);
        System.out.println(cell);



int r=reader.getRowCount("register");
        System.out.println(r);

        //*******
        //*******





    }
}
