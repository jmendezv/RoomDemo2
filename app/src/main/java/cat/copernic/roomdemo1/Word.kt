package cat.copernic.roomdemo1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
data class Word constructor(
    //@PrimaryKey(autoGenerate = true)
    @PrimaryKey()
    @ColumnInfo(name = "word")
    val word: String)
