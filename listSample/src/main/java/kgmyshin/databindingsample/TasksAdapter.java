package kgmyshin.databindingsample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import kgmyshin.databindingsample.databinding.ListItemBinding;

/**
 * Created by kgmyshin on 15/06/26.
 */
public class TasksAdapter extends ArrayAdapter<Task> {

    public TasksAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            ListItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.list_item, parent, false);
            convertView = binding.getRoot();
        }
        ListItemBinding binding = DataBindingUtil.getBinding(convertView);
        binding.setTask(getItem(position));
        return convertView;
    }
}
