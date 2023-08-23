package chapter20;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemoDAO {

    // 전체 조회
    public List<MemoVO> selectMemos() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.34:1521:xe", "java", "oracle21c");
        // 워크시트 생성
        Statement statement = connection.createStatement();
        StringBuilder builder = new StringBuilder();
        builder.append("select ");
        builder.append("    no, ");
        builder.append("    title, ");
        builder.append("    content, ");
        builder.append("    writer, ");
        builder.append("    register_date, ");
        builder.append("    modify_date ");
        builder.append("from ");
        builder.append("    MEMO ");
        String sql = builder.toString();
        ResultSet resultSet = statement.executeQuery(sql);
        List<MemoVO> memos = new ArrayList<>();
        while (resultSet.next()) {
            int no = resultSet.getInt("no");
            String title = resultSet.getString("title");
            String content = resultSet.getString("content");
            String writer = resultSet.getString("writer");
            Date registerDate = resultSet.getDate("register_date");
            Date modifyDate = resultSet.getDate("modify_date");
            memos.add(new MemoVO(no, title, content, writer, registerDate, modifyDate));
        }
        resultSet.close();
        statement.close();
        connection.close();
        return memos;
    }

    // 상세 조회
    public MemoVO selectMemo(int selectNo) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.34:1521:xe", "java", "oracle21c");

        StringBuilder builder = new StringBuilder();
        builder.append("select ");
        builder.append("    no, ");
        builder.append("    title, ");
        builder.append("    content, ");
        builder.append("    writer, ");
        builder.append("    register_date, ");
        builder.append("    modify_date ");
        builder.append("from ");
        builder.append("    MEMO ");
        builder.append("where ");
        builder.append("    NO = ? ");
        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, selectNo);
        ResultSet resultSet = statement.executeQuery();

        MemoVO memo = null;
        if (resultSet.next()) {
            int no = resultSet.getInt("no");
            String title = resultSet.getString("title");
            String content = resultSet.getString("content");
            String writer = resultSet.getString("writer");
            Date registerDate = resultSet.getDate("register_date");
            Date modifyDate = resultSet.getDate("modify_date");
            memo = new MemoVO(no, title, content, writer, registerDate, modifyDate);
        }
        resultSet.close();
        statement.close();
        connection.close();
        return memo;
    }

    public int insertmemo(MemoVO vo) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.34:1521:xe", "java", "oracle21c");
        // 워크시트를 만들고, 데이터를 저장하는 다른 방법(createStatememt 방법 말고)
        // prepareStatement: 쿼리의 형태를 먼저 만들고, 데이터를 나중에 넣는 방법
        StringBuilder builder = new StringBuilder();
        builder.append("");
        builder.append("insert into ");
        builder.append("    MEMO ");
        builder.append("    ( ");
        builder.append("        TITLE, ");
        builder.append("        CONTENT, ");
        builder.append("        WRITER ");
        builder.append("    ) ");
        builder.append("values ");
        builder.append("    ( ");
        builder.append("        ?, ");
        builder.append("        ?, ");
        builder.append("        ? ");
        builder.append("    ) ");
        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, vo.getTitle());
        statement.setString(2, vo.getContent());
        statement.setString(3, vo.getWriter());
        // select => executeQuery()를 호출
        // insert, update, delete => executeUpdate()를 호출해야 됨
        // 리턴값은 실행 결과 몇 개의 행이 성공했는지 알려준다.
        int excutedInsert = statement.executeUpdate();

        statement.close();
        connection.close();
        return excutedInsert;
    }

    public int updateMemo(MemoVO vo) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.34:1521:xe", "java", "oracle21c");
        // 워크시트를 만들고, 데이터를 저장하는 다른 방법(createStatememt 방법 말고)
        // prepareStatement: 쿼리의 형태를 먼저 만들고, 데이터를 나중에 넣는 방법
        StringBuilder builder = new StringBuilder();
        builder.append("update");
        builder.append("    MEMO ");
        builder.append("set ");
        builder.append("    TITLE = ? , ");
        builder.append("    CONTENT = ? , ");
        builder.append("    WRITER = ? , ");
        builder.append("    MODIFY_DATE = sysdate ");
        builder.append("where ");
        builder.append("    NO = ? ");
        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, vo.getTitle());
        statement.setString(2, vo.getContent());
        statement.setString(3, vo.getWriter());
        statement.setInt(4, vo.getNo());
        // select => executeQuery()를 호출
        // insert, update, delete => executeUpdate()를 호출해야 됨
        // 리턴값은 실행 결과 몇 개의 행이 성공했는지 알려준다.
        int executedUpdate = statement.executeUpdate();

        statement.close();
        connection.close();
        return executedUpdate;
    }

    public int deleteMemo(int deleteNo) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.34:1521:xe", "java", "oracle21c");
        // 워크시트를 만들고, 데이터를 저장하는 다른 방법(createStatememt 방법 말고)
        // prepareStatement: 쿼리의 형태를 먼저 만들고, 데이터를 나중에 넣는 방법
        StringBuilder builder = new StringBuilder();
        builder.append("    delete from ");
        builder.append("    MEMO ");
        builder.append("    where ");
        builder.append("    NO = ?  ");

        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, deleteNo);

//         select => executeQuery()를 호출
//         insert, update, delete => executeUpdate()를 호출해야 됨
//         리턴값은 실행 결과 몇 개의 행이 성공했는지 알려준다.
        int executedDelete = statement.executeUpdate();

        statement.close();
        connection.close();
        return executedDelete;
    }
}
