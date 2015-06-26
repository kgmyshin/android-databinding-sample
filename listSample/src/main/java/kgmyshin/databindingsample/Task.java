package kgmyshin.databindingsample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import kgmyshin.databindingsample.BR;

/**
 * Created by kgmyshin on 15/06/25.
 */
public class Task extends BaseObservable {

    private int id;
    private String body;

    public Task(int id, String body) {
        this.id = id;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Bindable
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
        notifyPropertyChanged(BR.body);
    }
}
