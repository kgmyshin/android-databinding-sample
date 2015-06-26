package kgmyshin.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import kgmyshin.databindingsample.databinding.ActivityTasksBinding;

/**
 * Created by kgmyshin on 15/06/25.
 */
public class TasksActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTasksBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_tasks);
        binding.setTasks(TaskRepository.getInstance().findAll());
        binding.taskList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TaskActivity.start(TasksActivity.this, position + 1);
            }
        });
    }
}
