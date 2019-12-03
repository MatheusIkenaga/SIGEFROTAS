package jinuclass;
           

import java.io.File; 

import jxl.Workbook; 
import jxl.write.*; 

public class Write_to_excel_file_directly {

        public static void main(String[] args) throws InterruptedException {

        	WritableWorkbook wworkbook;
            try {
           	wworkbook = Workbook.createWorkbook(new File("C:\\Users\\MIRITPC\\Desktop\\test\\excel\\write_to_excel_test.xls"));
          			
				  
			   
				  WritableSheet wsheet = wworkbook.createSheet("First Sheet", 0);
				 Label label = new Label(0, 2, "A label record");
				  wsheet.addCell(label);
		          int i=0;
				 
		           
		           int j=1;
				 
					
					
		           i=0;
					 label = new Label(i++, j, j+"");
					  wsheet.addCell(label);
					 label = new Label(i++, j, "11");
					  wsheet.addCell(label);
					  label = new Label(i++, j, "12");
					  wsheet.addCell(label);
					  label = new Label(i++, j, "13");
					  wsheet.addCell(label);
					 j++;
			 
					
					 
					 
					 i=0;
					 label = new Label(i++, j, j+"");
					  wsheet.addCell(label);
					 label = new Label(i++, j, "21");
					  wsheet.addCell(label);
					  label = new Label(i++, j,"22");
					  wsheet.addCell(label);
					  label = new Label(i++, j, "33");
					  wsheet.addCell(label);
					 j++;
			 
				
				
            
            wworkbook.write();
            wworkbook.close();
            System.out.println("fineshed");
            
            
            
            
            
            } catch (Exception e) {
            System.out.println(e);
			}
        }

      
        
        
}
