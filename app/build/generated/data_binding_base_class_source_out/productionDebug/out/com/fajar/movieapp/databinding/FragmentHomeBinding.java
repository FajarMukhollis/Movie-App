// Generated by view binder compiler. Do not edit!
package com.fajar.movieapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fajar.movieapp.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar pbHomeList;

  @NonNull
  public final RecyclerView rvHomeList;

  @NonNull
  public final MaterialToolbar toolbarHome;

  @NonNull
  public final TextView tvError;

  @NonNull
  public final TextView tvUsername;

  @NonNull
  public final TextView tvWelcome;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ProgressBar pbHomeList,
      @NonNull RecyclerView rvHomeList, @NonNull MaterialToolbar toolbarHome,
      @NonNull TextView tvError, @NonNull TextView tvUsername, @NonNull TextView tvWelcome) {
    this.rootView = rootView;
    this.pbHomeList = pbHomeList;
    this.rvHomeList = rvHomeList;
    this.toolbarHome = toolbarHome;
    this.tvError = tvError;
    this.tvUsername = tvUsername;
    this.tvWelcome = tvWelcome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pb_home_list;
      ProgressBar pbHomeList = ViewBindings.findChildViewById(rootView, id);
      if (pbHomeList == null) {
        break missingId;
      }

      id = R.id.rv_home_list;
      RecyclerView rvHomeList = ViewBindings.findChildViewById(rootView, id);
      if (rvHomeList == null) {
        break missingId;
      }

      id = R.id.toolbar_home;
      MaterialToolbar toolbarHome = ViewBindings.findChildViewById(rootView, id);
      if (toolbarHome == null) {
        break missingId;
      }

      id = R.id.tv_error;
      TextView tvError = ViewBindings.findChildViewById(rootView, id);
      if (tvError == null) {
        break missingId;
      }

      id = R.id.tv_username;
      TextView tvUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvUsername == null) {
        break missingId;
      }

      id = R.id.tv_welcome;
      TextView tvWelcome = ViewBindings.findChildViewById(rootView, id);
      if (tvWelcome == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, pbHomeList, rvHomeList,
          toolbarHome, tvError, tvUsername, tvWelcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}