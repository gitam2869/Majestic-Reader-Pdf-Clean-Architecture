package com.raywenderlich.android.majesticreader.presentation.reader;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B)\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/raywenderlich/android/majesticreader/presentation/reader/BookmarksAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/raywenderlich/android/majesticreader/presentation/reader/BookmarksAdapter$ViewHolder;", "bookmarks", "", "Lcom/raywenderlich/android/majesticreader/domain/Bookmark;", "itemClickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "newBookmarks", "", "ViewHolder", "app_debug"})
public final class BookmarksAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.raywenderlich.android.majesticreader.presentation.reader.BookmarksAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.raywenderlich.android.majesticreader.domain.Bookmark> bookmarks = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.raywenderlich.android.majesticreader.domain.Bookmark, kotlin.Unit> itemClickListener = null;
    
    public BookmarksAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.raywenderlich.android.majesticreader.domain.Bookmark> bookmarks, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.raywenderlich.android.majesticreader.domain.Bookmark, kotlin.Unit> itemClickListener) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.raywenderlich.android.majesticreader.presentation.reader.BookmarksAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.raywenderlich.android.majesticreader.presentation.reader.BookmarksAdapter.ViewHolder holder, int position) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    java.util.List<com.raywenderlich.android.majesticreader.domain.Bookmark> newBookmarks) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/raywenderlich/android/majesticreader/presentation/reader/BookmarksAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "binding", "Lcom/raywenderlich/android/majesticreader/databinding/ItemBookmarkBinding;", "getBinding", "()Lcom/raywenderlich/android/majesticreader/databinding/ItemBookmarkBinding;", "setBinding", "(Lcom/raywenderlich/android/majesticreader/databinding/ItemBookmarkBinding;)V", "titleTextView", "Landroid/widget/TextView;", "getTitleTextView", "()Landroid/widget/TextView;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.raywenderlich.android.majesticreader.databinding.ItemBookmarkBinding binding;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView titleTextView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.raywenderlich.android.majesticreader.databinding.ItemBookmarkBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull
        com.raywenderlich.android.majesticreader.databinding.ItemBookmarkBinding p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTitleTextView() {
            return null;
        }
    }
}