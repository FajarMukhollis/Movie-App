package com.fajar.movieapp.presentation.ui.user.profile;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.fajar.movieapp.R;

public class ProfileFragmentDirections {
  private ProfileFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionProfileFragmentToUpdateProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_profileFragment_to_updateProfileFragment);
  }
}
