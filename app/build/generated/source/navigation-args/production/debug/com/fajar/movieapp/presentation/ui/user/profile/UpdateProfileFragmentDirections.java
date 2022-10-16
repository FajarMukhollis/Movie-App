package com.fajar.movieapp.presentation.ui.user.profile;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.fajar.movieapp.R;

public class UpdateProfileFragmentDirections {
  private UpdateProfileFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionUpdateProfileFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_updateProfileFragment_to_profileFragment);
  }
}
