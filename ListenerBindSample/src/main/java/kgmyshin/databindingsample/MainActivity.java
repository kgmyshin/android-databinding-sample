package kgmyshin.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import kgmyshin.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener showToastListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);
    }

    public View.OnClickListener getShowToastListener() {
        return showToastListener;
    }

}
