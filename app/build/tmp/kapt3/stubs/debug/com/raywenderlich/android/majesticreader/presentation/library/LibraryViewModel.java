package com.raywenderlich.android.majesticreader.presentation.library;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/raywenderlich/android/majesticreader/presentation/library/LibraryViewModel;", "Lcom/raywenderlich/android/majesticreader/framework/MajesticViewModel;", "application", "Landroid/app/Application;", "interactors", "Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "(Landroid/app/Application;Lcom/raywenderlich/android/majesticreader/framework/Interactors;)V", "TAG", "", "documents", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/raywenderlich/android/majesticreader/domain/Document;", "getDocuments", "()Landroidx/lifecycle/MutableLiveData;", "addDocument", "", "uri", "Landroid/net/Uri;", "loadDocuments", "setOpenDocument", "document", "app_debug"})
public final class LibraryViewModel extends com.raywenderlich.android.majesticreader.framework.MajesticViewModel {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = "LibraryViewModel";
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.raywenderlich.android.majesticreader.domain.Document>> documents = null;
    
    public LibraryViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.raywenderlich.android.majesticreader.framework.Interactors interactors) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.raywenderlich.android.majesticreader.domain.Document>> getDocuments() {
        return null;
    }
    
    public final void loadDocuments() {
    }
    
    public final void addDocument(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
    
    public final void setOpenDocument(@org.jetbrains.annotations.NotNull
    com.raywenderlich.android.majesticreader.domain.Document document) {
    }
}