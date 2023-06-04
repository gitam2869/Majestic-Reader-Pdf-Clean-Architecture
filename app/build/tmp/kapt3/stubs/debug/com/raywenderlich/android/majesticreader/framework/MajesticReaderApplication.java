package com.raywenderlich.android.majesticreader.framework;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/MajesticReaderApplication;", "Landroid/app/Application;", "()V", "bookmarkRepository", "Lcom/raywenderlich/android/majesticreader/data/BookmarkRepository;", "getBookmarkRepository", "()Lcom/raywenderlich/android/majesticreader/data/BookmarkRepository;", "bookmarkRepository$delegate", "Lkotlin/Lazy;", "documentRepository", "Lcom/raywenderlich/android/majesticreader/data/DocumentRepository;", "getDocumentRepository", "()Lcom/raywenderlich/android/majesticreader/data/DocumentRepository;", "documentRepository$delegate", "onCreate", "", "app_debug"})
public final class MajesticReaderApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy bookmarkRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy documentRepository$delegate = null;
    
    public MajesticReaderApplication() {
        super();
    }
    
    private final com.raywenderlich.android.majesticreader.data.BookmarkRepository getBookmarkRepository() {
        return null;
    }
    
    private final com.raywenderlich.android.majesticreader.data.DocumentRepository getDocumentRepository() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
}