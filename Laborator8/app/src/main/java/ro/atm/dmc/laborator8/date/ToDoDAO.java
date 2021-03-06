package ro.atm.dmc.laborator8.date;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ToDoDAO {

    @Insert()
    public void insert(ToDo toDo);

    @Update()
    public void update(ToDo todo);

    @Delete()
    public void delete(ToDo toDo);

    @Query("DELETE FROM ToDo")
    public void deleteAll();

    @Query("SELECT * FROM ToDo")
    public List<ToDo> selectAll();

    @Query("SELECT * FROM ToDo ORDER BY prioritate DESC")
    public List<ToDo> selectAllDupaPrioritate();

    @Query("SELECT * FROM ToDo ORDER BY text ASC")
    public List<ToDo> selectAllDupaText();

    @Query("SELECT COUNT(id) FROM ToDo WHERE prioritate = :prioritate ")
    public int countToDo(int prioritate);

}
