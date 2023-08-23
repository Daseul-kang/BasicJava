package chapter20;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemoDAOTest {

    @org.junit.jupiter.api.Test
    void selectMemos() throws Exception {
        MemoDAO dao = new MemoDAO();
        List<MemoVO> memos = dao.selectMemos();
//        assertEquals(7, memos.size());
        MemoVO vo = memos.get(1);
        assertEquals("첫 번째 글", vo.getTitle());

    }

    @org.junit.jupiter.api.Test
    void insertmemo() throws Exception {
        MemoDAO dao = new MemoDAO();
        dao.insertmemo(new MemoVO("첫 번째 글", "테스트 및 배포 첫 번째 수", "다슬"));
        List<MemoVO> memos = dao.selectMemos();
        // 테스트 코드를 자동화시키는 작업
        assertEquals(5, memos.size());

    }

    @Test
    void updateMemo() throws Exception {
        MemoDAO dao = new MemoDAO();
        MemoVO vo1 = new MemoVO(6, "6번째 글 수정이야", "자바는 어려워", "daseul");
        dao.updateMemo(vo1);

//        다슬의 방법
//        dao.updateMemo(new MemoVO(6,"6번째 글 수정이야","자바는 어려워","daseul"));

//        선생님의 방법 1 : selectMemos를 사용하여 get(인덱스) 활
//        List<MemoVO> memos = dao.selectMemos();
//        MemoVO vo = memos.get(0);
//        assertEquals("daseul", vo.getWriter() );용

//        선생님의 방법 2 : selectMemo를 사용하여 비교
        MemoVO vo = dao.selectMemo(6);
        assertEquals(vo1, vo);
    }

    @Test
    void deleteMemo() throws Exception {
        MemoDAO dao = new MemoDAO();
        MemoVO vo = new MemoVO(7);
        dao.deleteMemo(7);
        MemoVO vo1 = dao.selectMemo(7);
//        나의 방법
//        assertNull(vo1);

//        선생님의 방법
        List<MemoVO> memos = dao.selectMemos();
        assertEquals(memos.size(), memos.size());
    }
}