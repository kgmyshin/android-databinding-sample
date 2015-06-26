package kgmyshin.databindingsample;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import kgmyshin.databindingsample.databinding.ActivityTaskBinding;

/**
 * Created by kgmyshin on 15/06/25.
 */
public class TaskActivity extends AppCompatActivity {

    private static final String INTENT_EXTRA_ID = "id";
    private Task task;

    public static void start(Context context, int id) {
        Intent intent = new Intent(context, TaskActivity.class);
        intent.putExtra(INTENT_EXTRA_ID, id);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityTaskBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_task);
        task = TaskRepository.getInstance().findById(getIntent().getIntExtra(INTENT_EXTRA_ID, -1));
        binding.setTask(task);
        binding.saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task.setBody(binding.bodyFiled.getText().toString());
                finish();
            }
        });
    }
}
