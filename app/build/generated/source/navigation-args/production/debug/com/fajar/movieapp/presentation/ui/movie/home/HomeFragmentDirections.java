package com.fajar.movieapp.presentation.ui.movie.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.fajar.movieapp.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionHomeFragmentToDetailFragment actionHomeFragmentToDetailFragment(int id) {
    return new ActionHomeFragmentToDetailFragment(id);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment);
  }

  public static class ActionHomeFragmentToDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToDetailFragment(int id) {
      this.arguments.put("id", id);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToDetailFragment setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("id")) {
        int id = (int) arguments.get("id");
        __result.putInt("id", id);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_detailFragment;
    }

    @SuppressWarnings("unchecked")
    public int getId() {
      return (int) arguments.get("id");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToDetailFragment that = (ActionHomeFragmentToDetailFragment) object;
      if (arguments.containsKey("id") != that.arguments.containsKey("id")) {
        return false;
      }
      if (getId() != that.getId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToDetailFragment(actionId=" + getActionId() + "){"
          + "id=" + getId()
          + "}";
    }
  }
}
