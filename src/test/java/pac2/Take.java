package pac2;

import org.checkerframework.framework.qual.NoQualifierParameter;

public class Take {

    public static void main(String[] args) {


        String path="C:\\Users\\pgupta\\Downloads\\testdata.xlsx";
        NALExcelXLSReader reader=new NALExcelXLSReader(path);


        String cell = reader.getCellData("register", "firstname", 2);
        System.out.println(cell);



int r=reader.getRowCount("register");
        System.out.println(r);







    }
}
