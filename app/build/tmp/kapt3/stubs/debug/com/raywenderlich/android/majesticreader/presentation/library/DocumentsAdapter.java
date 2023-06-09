package com.raywenderlich.android.majesticreader.presentation.library;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0014\u0010\u0017\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019R\u000e\u0010\f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/raywenderlich/android/majesticreader/presentation/library/DocumentsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/raywenderlich/android/majesticreader/presentation/library/DocumentsAdapter$ViewHolder;", "documents", "", "Lcom/raywenderlich/android/majesticreader/domain/Document;", "glide", "Lcom/bumptech/glide/RequestManager;", "itemClickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lcom/bumptech/glide/RequestManager;Lkotlin/jvm/functions/Function1;)V", "TAG", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "newDocuments", "", "ViewHolder", "app_debug"})
public final class DocumentsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.raywenderlich.android.majesticreader.presentation.library.DocumentsAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.raywenderlich.android.majesticreader.domain.Document> documents = null;
    @org.jetbrains.annotations.NotNull
    private final com.bumptech.glide.RequestManager glide = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.raywenderlich.android.majesticreader.domain.Document, kotlin.Unit> itemClickListener = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = "DocumentsAdapter";
    
    public DocumentsAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.raywenderlich.android.majesticreader.domain.Document> documents, @org.jetbrains.annotations.NotNull
    com.bumptech.glide.RequestManager glide, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.raywenderlich.android.majesticreader.domain.Document, kotlin.Unit> itemClickListener) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.raywenderlich.android.majesticreader.presentation.library.DocumentsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.raywenderlich.android.majesticreader.presentation.library.DocumentsAdapter.ViewHolder holder, int position) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    java.util.List<com.raywenderlich.android.majesticreader.domain.Document> newDocuments) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/raywenderlich/android/majesticreader/presentation/library/DocumentsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "binding", "Lcom/raywenderlich/android/majesticreader/databinding/ItemDocumentBinding;", "getBinding", "()Lcom/raywenderlich/android/majesticreader/databinding/ItemDocumentBinding;", "setBinding", "(Lcom/raywenderlich/android/majesticreader/databinding/ItemDocumentBinding;)V", "previewImageView", "Landroid/widget/ImageView;", "getPreviewImageView", "()Landroid/widget/ImageView;", "sizeTextView", "Landroid/widget/TextView;", "getSizeTextView", "()Landroid/widget/TextView;", "titleTextView", "getTitleTextView", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.raywenderlich.android.majesticreader.databinding.ItemDocumentBinding binding;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView previewImageView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView titleTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView sizeTextView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.raywenderlich.android.majesticreader.databinding.ItemDocumentBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull
        com.raywenderlich.android.majesticreader.databinding.ItemDocumentBinding p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getPreviewImageView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTitleTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getSizeTextView() {
            return null;
        }
    }
}