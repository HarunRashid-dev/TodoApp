package np.com.bimalkafle.todoapp.dp

import androidx.room.TypeConverter
import java.util.Date

class Converters {

    // Convert Date to Long (timestamp)
    @TypeConverter
    fun fromDate(date: Date): Long {
        return date.time // Convert Date to timestamp (Long)
    }

    // Convert Long (timestamp) to Date
    @TypeConverter
    fun toDate(time: Long): Date {
        return Date(time) // Convert timestamp (Long) back to Date
    }
}
