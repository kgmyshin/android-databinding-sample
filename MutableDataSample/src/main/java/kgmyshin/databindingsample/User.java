package kgmyshin.databindingsample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import kgmyshin.databindingsample.BR;

/**
 * Created by kgmyshin on 15/06/29.
 */
public class User extends BaseObservable {
    private String firstName;
    private String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

}
