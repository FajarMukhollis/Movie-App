package com.fajar.movieapp.presentation.ui.user.register;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.fajar.movieapp.R;

public class RegisterFragmentDirections {
  private RegisterFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionRegisterFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_registerFragment_to_loginFragment);
  }
}
