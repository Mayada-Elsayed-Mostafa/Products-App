package com.example.productsappwithmvvm.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.productsappwithmvvm.data.models.Product


@Dao
interface ProductDao {

    @Query("SELECT * FROM producttable")
    fun getFavoriteProducts(): List<Product>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertProduct(product: Product): Long

    @Delete
    suspend fun deleteProduct(product: Product): Int

}