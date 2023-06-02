package com.raywenderlich.android.majesticreader.framework.db;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/db/BookmarkDao;", "", "addBookmark", "", "bookmark", "Lcom/raywenderlich/android/majesticreader/framework/db/BookmarkEntity;", "(Lcom/raywenderlich/android/majesticreader/framework/db/BookmarkEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBookmarks", "", "documentUri", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeBookmark", "app_debug"})
@androidx.room.Dao
public abstract interface BookmarkDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addBookmark(@org.jetbrains.annotations.NotNull
    com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity bookmark, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM bookmark WHERE documentUri = :documentUri")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getBookmarks(@org.jetbrains.annotations.NotNull
    java.lang.String documentUri, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity>> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object removeBookmark(@org.jetbrains.annotations.NotNull
    com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity bookmark, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}