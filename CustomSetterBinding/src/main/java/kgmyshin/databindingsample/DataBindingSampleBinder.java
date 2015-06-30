package kgmyshin.databindingsample;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * Created by kgmyshin on 15/06/30.
 */
public class DataBindingSampleBinder {

    @BindingAdapter("capText")
    public static void setCapText(TextView view, String text) {
        view.setText(text.toUpperCase());
    }

}
