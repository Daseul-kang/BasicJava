package chapter20;

import chapter07.Driver;
import oracle.jdbc.OracleDriver;
//////////////////////////////////////////// 외워
import java.sql.*;

public class JDBCProgramming {
    public static void main(String[] args) throws Exception {
        // 1. 드라이버 등록
        Class.forName("oracle.jdbc.OracleDriver"); //리플렉션
        // DriverManager.registerDriver(new OracleDriver()); 윗줄 코드랑 같은 얘기

        // 2. DBMS 접속정보를 가지고 접속
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.34:1521:xe", "java", "oracle21c");

        // 3. sql을 작성할 worksheet 생성 (create(Statement) == worksheet)
        Statement statement = connection.createStatement();

        // 4. 쿼리 작성
        String sql = "select * from employees";

        // 5. 쿼리 실행
        ResultSet resultSet = statement.executeQuery(sql);

        // 6. 결과 가져오기
        while (resultSet.next()) {
            int employeeId = resultSet.getInt("employee_id");
            String empName = resultSet.getString("emp_name");
            String phoneNumber = resultSet.getString("phone_number");
            Date hireDate = resultSet.getDate("hire_date");
            int salary = resultSet.getInt("salary");
            System.out.printf("%d\t%s\t%s\t%s\t%d\n", employeeId, empName, phoneNumber, hireDate, salary);
        }

        // 7. 자원 종료
        resultSet.close();
        statement.close();
        connection.close();
    }
}

// 나중에는 달라지는 부분만 따로 작성하고 나머지는 공통으로 작성
// 횡단 관심사 AOP 기술
// MVC 패턴을 만든다 CRUD
