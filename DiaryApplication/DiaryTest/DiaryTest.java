import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary = new Diary("userName", "password");
    @Test
    public void testForDiary(){
        assertNotNull(diary);
    }
    @Test
    public void testForDiaryLockedByDefault(){
        assertTrue(diary.isLocked());
    }
    @Test
    public void lockedDiaryCanBeUnlocked(){
        assertTrue(diary.isLocked());
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
    }

    @Test
    public void lockedDiaryCannotBeUnlockedWithWrongPasswordTest(){
        assertTrue(diary.isLocked());
        diary.unlockWith("wrong password");
        assertTrue(diary.isLocked());
    }

    @Test
    public void unlockDiaryCanBeLockedTest(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    public void unlockDiaryCanCreateGistTest(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.addGist("Title", "Body");
        assertEquals(1, diary.countGists());
    }

    @Test
    public void createGist_findGistBytitleReturnCreatedGistTest(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.addGist("Title", "Body");
        Gist gist = diary.findGistByTitle("Title");
        assertEquals("Body", gist.getBody());
    }

    @Test
    public void testThatEntriesExist(){

    }
}
