package kgmyshin.databindingsample;

import android.databinding.BindingAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by kgmyshin on 15/06/25.
 */
public class DataBidnignSampleBidner {

    @BindingAdapter("items")
    public static void setItems(ListView listView, List<Task> tasks) {
        TasksAdapter adapter = new TasksAdapter(listView.getContext());
        adapter.addAll(tasks);
        listView.setAdapter(adapter);
    }

}
