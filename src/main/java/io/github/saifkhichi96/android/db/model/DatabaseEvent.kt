package io.github.saifkhichi96.android.db.model

import com.google.firebase.database.DatabaseError

sealed class DatabaseEvent<T> {
    data class Created<T>(val item: T) : DatabaseEvent<T>()
    data class Changed<T>(val item: T) : DatabaseEvent<T>()
    data class Deleted<T>(val item: T) : DatabaseEvent<T>()
    data class Cancelled<T>(val error: DatabaseError) : DatabaseEvent<T>()
}