<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.io.FileInputStream"%>
<%@page import="jxl.Workbook"%>
<%@page import="jxl.Sheet"%> <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



			
				<table border="" width="100%">
						<tr>
								<td>
											#
								</td>
								<td>
											col 1
								</td>
								
								<td>
											col 2
								</td>
								<td>
											col 3
								</td>
						</tr>

 
						<%
						try{
					 		
			 	 	
					   String FilePath = "C:\\Users\\MIRITPC\\Desktop\\test\\excel\\test.xls";
						  //  String FilePath = Common_Things.document_upload_path+"/"+name;
							
						FileInputStream fs = new FileInputStream(FilePath);
					Workbook wb = Workbook.getWorkbook(fs);
			  
					// TO get the access to the sheet
					Sheet sh = wb.getSheet("Sheet1");

					// To get the number of rows present in sheet
					int totalNoOfRows = sh.getRows();

					// To get the number of columns present in sheet
					int totalNoOfCols = sh.getColumns();
			 
					for (int row = 0; row < 8000; row++) {
						 
							
					%>
					<tr>
								 
					<%
						for (int col = 0; col < totalNoOfCols; col++) {
							//out.println(sh.getCell(col, row).getContents()+ "-----------" );
					%>
					
								
							<%
									if(col==0){
						 	%>
								<td>
											<%=sh.getCell(col, row).getContents() %>
								</td>
							<%			 
									}
							%>  

							<%
									if(col==1){
						 	%>
								<td>
											<%=sh.getCell(col, row).getContents() %>
								</td>
							<%			 
									}
							%>  
							<%
									if(col==2){
						 	%>
								<td>
											<%=sh.getCell(col, row).getContents() %>
								</td>
							<%			 
									}
							%>  

							<%
									if(col==3){
						 	%>
								<td>
											<%=sh.getCell(col, row).getContents() %>
								</td>
							<%			 
									}
							%>  

						 	
								
						
					
					<%	
							
						
					
						}
					%>
					</tr>
					<%
					 
					}
					}catch (Exception e) {
						System.out.println(e);
					}
						
						%>

				</table>
</body>
</html>