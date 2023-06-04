package com.raywenderlich.android.majesticreader.framework;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/InMemoryOpenDocumentDataSource;", "Lcom/raywenderlich/android/majesticreader/data/OpenDocumentDataSource;", "()V", "document", "Lcom/raywenderlich/android/majesticreader/domain/Document;", "getOpenDocument", "setOpenDocument", "", "app_debug"})
public final class InMemoryOpenDocumentDataSource implements com.raywenderlich.android.majesticreader.data.OpenDocumentDataSource {
    @org.jetbrains.annotations.NotNull
    private com.raywenderlich.android.majesticreader.domain.Document document;
    
    public InMemoryOpenDocumentDataSource() {
        super();
    }
    
    @java.lang.Override
    public void setOpenDocument(@org.jetbrains.annotations.NotNull
    com.raywenderlich.android.majesticreader.domain.Document document) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.raywenderlich.android.majesticreader.domain.Document getOpenDocument() {
        return null;
    }
}