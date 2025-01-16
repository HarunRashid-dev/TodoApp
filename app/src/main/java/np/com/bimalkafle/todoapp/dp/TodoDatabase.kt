package np.com.bimalkafle.todoapp.dp

import androidx.room.Database
import androidx.room.RoomDatabase
import np.com.bimalkafle.todoapp.Todo

@Database(entities = [Todo::class], version = 1)
abstract class TodoDatabase : RoomDatabase(){

    companion object{
        const val NAME = "Todo_DB"
    }

    abstract fun getTodoDao() : TodoDao

}
