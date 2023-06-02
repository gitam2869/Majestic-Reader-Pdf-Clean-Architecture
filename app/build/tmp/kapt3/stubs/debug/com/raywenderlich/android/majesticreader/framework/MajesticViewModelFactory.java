package com.raywenderlich.android.majesticreader.framework;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u000f\u001a\u0002H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/MajesticViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "dependencies", "Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "getDependencies", "()Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "setDependencies", "(Lcom/raywenderlich/android/majesticreader/framework/Interactors;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "inject", "", "app_debug"})
public final class MajesticViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    public static android.app.Application application;
    public static com.raywenderlich.android.majesticreader.framework.Interactors dependencies;
    @org.jetbrains.annotations.NotNull
    public static final com.raywenderlich.android.majesticreader.framework.MajesticViewModelFactory INSTANCE = null;
    
    private MajesticViewModelFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Application getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raywenderlich.android.majesticreader.framework.Interactors getDependencies() {
        return null;
    }
    
    public final void setDependencies(@org.jetbrains.annotations.NotNull
    com.raywenderlich.android.majesticreader.framework.Interactors p0) {
    }
    
    public final void inject(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.raywenderlich.android.majesticreader.framework.Interactors dependencies) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
    java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.viewmodel.CreationExtras extras) {
        return null;
    }
}