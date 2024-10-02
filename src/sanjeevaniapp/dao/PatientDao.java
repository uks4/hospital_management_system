
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
import sanjeevaniapp.pojo.PatientPojo;


public class PatientDao {
  public static String getNewPatientId()throws  SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(PATIENT_ID) from patients");
   rs.next();
   int patId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       patId=Integer.parseInt(num)+1;
    }
   return "PAT"+patId;
} 
  public static boolean addPatient(PatientPojo pat)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into patients values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
     ps.setString(1,pat.getPatientId());
     ps.setString(2, pat.getFirstName());
     ps.setString(3,pat.getLastName());
     ps.setInt(4, pat.getAge());
     ps.setString(5, pat.getGender());
     ps.setString(6, pat.getMarriedStatus());
     ps.setString(7, pat.getAddress());
     ps.setString(8,pat.getCity());
     ps.setString(9, pat.getMno());
     ps.setDate(10, pat.getDate());
     ps.setInt(11, pat.getOtp());
     ps.setString(12,pat.getOpd());
     ps.setString(13, pat.getDoctorId());
     ps.setString(14, pat.getAptStatus());
     return ps.executeUpdate()==1;
}
  public static List<PatientPojo> getAllPatientDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from patients order by PATIENT_ID");
    List<PatientPojo>patList=new ArrayList<>();
    while(rs.next()){
    PatientPojo pat=new PatientPojo();
    pat.setPatientId(rs.getString("PATIENT_ID"));
    pat.setFirstName(rs.getString("FIRST_NAME"));
    pat.setLastName(rs.getString("LAST_NAME"));
    pat.setAge(rs.getInt("AGE"));
    pat.setGender(rs.getString("GENDER"));
    pat.setMarriedStatus(rs.getString("M_STATUS"));
    pat.setAddress(rs.getString("ADDRESS"));
    pat.setCity(rs.getString("CITY"));
    pat.setMno(rs.getString("MOBILE_NO"));
    pat.setDate(rs.getDate("P_DATE"));
    pat.setOpd(rs.getString("OPD"));
    pat.setAptStatus(rs.getString("STATUS"));
    pat.setDoctorId(rs.getString("DOCTOR_ID"));
    patList.add(pat);   
    
    }
    return patList;
} 
  public static List<PatientPojo> getAllPatientsByDoctorId(String doctorId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from patients where DOCTOR_ID=? and STATUS='REQUEST' order by PATIENT_ID");
    ps.setString(1,doctorId);
    ResultSet rs=ps.executeQuery();
    List<PatientPojo>patList=new ArrayList<>();
    while(rs.next()){
    PatientPojo pat=new PatientPojo();
    pat.setPatientId(rs.getString("PATIENT_ID"));
    pat.setFirstName(rs.getString("FIRST_NAME")+" "+rs.getString("LAST_NAME"));
    pat.setDate(rs.getDate("P_DATE"));
    pat.setOpd(rs.getString("OPD"));
    patList.add(pat);   
    
    }
    return patList;
} 
  public static boolean updateStatus(String patientId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update patients set STATUS='CONFIRM' where PATIENT_ID=?" );
     ps.setString(1, patientId);
     return ps.executeUpdate()==1;
     
     
 }
}
