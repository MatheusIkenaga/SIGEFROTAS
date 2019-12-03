package jinuclass;
           

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 

import jxl.Workbook; 
import jxl.write.*; 

public class Write_to_excel_file_from_my_sql_database {

        public static void main(String[] args) throws InterruptedException {

        	WritableWorkbook wworkbook;
            try {
           	wworkbook = Workbook.createWorkbook(new File("C:\\Users\\MIRITPC\\Desktop\\test\\excel\\absent_details_JAN.xls"));
          			
				DBConnection_HR obj_DBConnection_LMC=new DBConnection_HR();
				Connection connection=obj_DBConnection_LMC.getConnection();
				PreparedStatement ps=null;
				
				ResultSet rs=null;
				 
			 
	 			String query="select * from attendence_table where date like '%oct-2015%'";
			
		 			 
				
				ps=connection.prepareStatement(query);
				System.out.println(ps);
				rs=ps.executeQuery();
				 WritableSheet wsheet = wworkbook.createSheet("First Sheet", 0);
				 Label label = new Label(0, 2, "A label record");
				  wsheet.addCell(label);
		          int i=0;
				 
		           
		           int j=1;
				while(rs.next()){
					
					i=0;
					
					 label = new Label(i++, j, j+"");
					  wsheet.addCell(label);
					 label = new Label(i++, j, rs.getString("employee_name"));
					  wsheet.addCell(label);
					  label = new Label(i++, j, rs.getString("date"));
					  wsheet.addCell(label);
					  label = new Label(i++, j, rs.getString("branch"));
					  wsheet.addCell(label);
					  
					  
					  
					 
					j++;
				}
				
				
				
            
            wworkbook.write();
            wworkbook.close();
            System.out.println("fineshed");
            
            
            
            
            
            } catch (Exception e) {
            System.out.println(e);
			}
        }

      
        
        
}
