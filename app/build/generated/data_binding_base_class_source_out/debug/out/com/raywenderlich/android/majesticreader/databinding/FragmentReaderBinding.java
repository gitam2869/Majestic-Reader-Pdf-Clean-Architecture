// Generated by view binder compiler. Do not edit!
package com.raywenderlich.android.majesticreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.chrisbanes.photoview.PhotoView;
import com.raywenderlich.android.majesticreader.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentReaderBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final RecyclerView bookmarksRecyclerView;

  @NonNull
  public final LinearLayout bottomSheet;

  @NonNull
  public final PhotoView ivPage;

  @NonNull
  public final TextView pagesTextView;

  @NonNull
  public final TextView tabBookmark;

  @NonNull
  public final TextView tabLibrary;

  @NonNull
  public final TextView tabNextPage;

  @NonNull
  public final TextView tabPreviousPage;

  private FragmentReaderBinding(@NonNull CoordinatorLayout rootView,
      @NonNull RecyclerView bookmarksRecyclerView, @NonNull LinearLayout bottomSheet,
      @NonNull PhotoView ivPage, @NonNull TextView pagesTextView, @NonNull TextView tabBookmark,
      @NonNull TextView tabLibrary, @NonNull TextView tabNextPage,
      @NonNull TextView tabPreviousPage) {
    this.rootView = rootView;
    this.bookmarksRecyclerView = bookmarksRecyclerView;
    this.bottomSheet = bottomSheet;
    this.ivPage = ivPage;
    this.pagesTextView = pagesTextView;
    this.tabBookmark = tabBookmark;
    this.tabLibrary = tabLibrary;
    this.tabNextPage = tabNextPage;
    this.tabPreviousPage = tabPreviousPage;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentReaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentReaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_reader, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentReaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookmarksRecyclerView;
      RecyclerView bookmarksRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (bookmarksRecyclerView == null) {
        break missingId;
      }

      id = R.id.bottomSheet;
      LinearLayout bottomSheet = ViewBindings.findChildViewById(rootView, id);
      if (bottomSheet == null) {
        break missingId;
      }

      id = R.id.iv_page;
      PhotoView ivPage = ViewBindings.findChildViewById(rootView, id);
      if (ivPage == null) {
        break missingId;
      }

      id = R.id.pagesTextView;
      TextView pagesTextView = ViewBindings.findChildViewById(rootView, id);
      if (pagesTextView == null) {
        break missingId;
      }

      id = R.id.tabBookmark;
      TextView tabBookmark = ViewBindings.findChildViewById(rootView, id);
      if (tabBookmark == null) {
        break missingId;
      }

      id = R.id.tabLibrary;
      TextView tabLibrary = ViewBindings.findChildViewById(rootView, id);
      if (tabLibrary == null) {
        break missingId;
      }

      id = R.id.tabNextPage;
      TextView tabNextPage = ViewBindings.findChildViewById(rootView, id);
      if (tabNextPage == null) {
        break missingId;
      }

      id = R.id.tabPreviousPage;
      TextView tabPreviousPage = ViewBindings.findChildViewById(rootView, id);
      if (tabPreviousPage == null) {
        break missingId;
      }

      return new FragmentReaderBinding((CoordinatorLayout) rootView, bookmarksRecyclerView,
          bottomSheet, ivPage, pagesTextView, tabBookmark, tabLibrary, tabNextPage,
          tabPreviousPage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
