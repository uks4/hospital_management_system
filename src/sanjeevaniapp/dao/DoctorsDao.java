
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.DoctorPojo;
import sanjeevaniapp.pojo.EmpPojo;

public class DoctorsDao {
public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update doctors set DOCTOR_NAME=? where DOCTOR_NAME=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
public static boolean addDoctor(DoctorPojo doc)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into doctors values(?,?,?,?,?,?,?)");
     ps.setString(1,doc.getDoctorId());
     ps.setString(2, doc.getDoctorName());
     ps.setString(3,doc.getEmailId());
     ps.setString(4, doc.getContactNo());
     ps.setString(5, doc.getQualification());
     ps.setString(7, doc.getSpecialist());
     ps.setString(6, doc.getGender());
     return ps.executeUpdate()==1;
}
public static String getNewDocId()throws  SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(DOCTOR_ID) from doctors");
   rs.next();
   int docId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       docId=Integer.parseInt(num)+1;
    }
   return "DOC"+docId;
} 
public static List<String> getAllDoctorId()throws SQLException
{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select DOCTOR_ID from doctors");
    List<String>doctorList=new ArrayList<>();
    while(rs.next())
    {
        doctorList.add(rs.getString(1));
    }
    return doctorList;
}
public static boolean deleteDoctorById(String docId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select DOCTOR_NAME from doctors where DOCTOR_ID=?");
     ps.setString(1, docId);
     ResultSet rs=ps.executeQuery();
     rs.next();
     String docName=rs.getString(1);
     UserDao.deleteUserByName(docName);
     ps=conn.prepareStatement("Delete from doctors where DOCTOR_ID=?");
     ps.setString(1, docId);
     return ps.executeUpdate()==1;
}
public static List<DoctorPojo> getAllDoctorDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from doctors order by DOCTOR_ID");
    List<DoctorPojo>docList=new ArrayList<>();
    while(rs.next()){
    DoctorPojo doc=new DoctorPojo();
    doc.setDoctorName(rs.getString("DOCTOR_NAME"));
    doc.setContactNo(rs.getString("CONTACT_NO"));
    doc.setDoctorId(rs.getString("DOCTOR_NAME"));
    doc.setEmailId(rs.getString("EMAIL_ID"));
    doc.setQualification(rs.getString("QUALIFIATION"));
    doc.setGender(rs.getString("GENDER"));
    doc.setSpecialist(rs.getString("SPECIALIST"));
    docList.add(doc);
    
    
    }
    return docList;
} 

}
