// Generated by view binder compiler. Do not edit!
package com.fajar.movieapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fajar.movieapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ImageView ivMovieImage;

  @NonNull
  public final ProgressBar pbHomeList;

  @NonNull
  public final TextView titleOfficialWeb;

  @NonNull
  public final TextView titleOverview;

  @NonNull
  public final TextView tvError;

  @NonNull
  public final TextView tvGenreLangRelease;

  @NonNull
  public final TextView tvMovieTitle;

  @NonNull
  public final TextView tvOfficialWeb;

  @NonNull
  public final TextView tvOverview;

  @NonNull
  public final TextView tvRating;

  @NonNull
  public final TextView tvTagline;

  private FragmentDetailBinding(@NonNull ScrollView rootView,
      @NonNull ConstraintLayout constraintLayout, @NonNull ImageView ivMovieImage,
      @NonNull ProgressBar pbHomeList, @NonNull TextView titleOfficialWeb,
      @NonNull TextView titleOverview, @NonNull TextView tvError,
      @NonNull TextView tvGenreLangRelease, @NonNull TextView tvMovieTitle,
      @NonNull TextView tvOfficialWeb, @NonNull TextView tvOverview, @NonNull TextView tvRating,
      @NonNull TextView tvTagline) {
    this.rootView = rootView;
    this.constraintLayout = constraintLayout;
    this.ivMovieImage = ivMovieImage;
    this.pbHomeList = pbHomeList;
    this.titleOfficialWeb = titleOfficialWeb;
    this.titleOverview = titleOverview;
    this.tvError = tvError;
    this.tvGenreLangRelease = tvGenreLangRelease;
    this.tvMovieTitle = tvMovieTitle;
    this.tvOfficialWeb = tvOfficialWeb;
    this.tvOverview = tvOverview;
    this.tvRating = tvRating;
    this.tvTagline = tvTagline;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraint_layout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.iv_movie_image;
      ImageView ivMovieImage = ViewBindings.findChildViewById(rootView, id);
      if (ivMovieImage == null) {
        break missingId;
      }

      id = R.id.pb_home_list;
      ProgressBar pbHomeList = ViewBindings.findChildViewById(rootView, id);
      if (pbHomeList == null) {
        break missingId;
      }

      id = R.id.title_official_web;
      TextView titleOfficialWeb = ViewBindings.findChildViewById(rootView, id);
      if (titleOfficialWeb == null) {
        break missingId;
      }

      id = R.id.title_overview;
      TextView titleOverview = ViewBindings.findChildViewById(rootView, id);
      if (titleOverview == null) {
        break missingId;
      }

      id = R.id.tv_error;
      TextView tvError = ViewBindings.findChildViewById(rootView, id);
      if (tvError == null) {
        break missingId;
      }

      id = R.id.tv_genre_lang_release;
      TextView tvGenreLangRelease = ViewBindings.findChildViewById(rootView, id);
      if (tvGenreLangRelease == null) {
        break missingId;
      }

      id = R.id.tv_movie_title;
      TextView tvMovieTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvMovieTitle == null) {
        break missingId;
      }

      id = R.id.tv_official_web;
      TextView tvOfficialWeb = ViewBindings.findChildViewById(rootView, id);
      if (tvOfficialWeb == null) {
        break missingId;
      }

      id = R.id.tv_overview;
      TextView tvOverview = ViewBindings.findChildViewById(rootView, id);
      if (tvOverview == null) {
        break missingId;
      }

      id = R.id.tv_rating;
      TextView tvRating = ViewBindings.findChildViewById(rootView, id);
      if (tvRating == null) {
        break missingId;
      }

      id = R.id.tv_tagline;
      TextView tvTagline = ViewBindings.findChildViewById(rootView, id);
      if (tvTagline == null) {
        break missingId;
      }

      return new FragmentDetailBinding((ScrollView) rootView, constraintLayout, ivMovieImage,
          pbHomeList, titleOfficialWeb, titleOverview, tvError, tvGenreLangRelease, tvMovieTitle,
          tvOfficialWeb, tvOverview, tvRating, tvTagline);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
