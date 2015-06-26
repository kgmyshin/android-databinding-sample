package kgmyshin.databindingsample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kgmyshin on 15/06/26.
 */
public class TaskRepository {

    private static TaskRepository repository = new TaskRepository();

    private ArrayList<Task> tasks = new ArrayList<>();

    public static TaskRepository getInstance() {
        return repository;
    }

    private TaskRepository() {
        init();
    }

    private void init() {
        tasks.add(new Task(1, "ゴミ捨て"));
        tasks.add(new Task(2, "風呂掃除"));
        tasks.add(new Task(3, "誕生日プレゼント買う"));
        tasks.add(new Task(4, "SHIROBAKO見る"));
        tasks.add(new Task(5, "お店の予約をする"));
        tasks.add(new Task(6, "SHIROBAKO見る"));
        tasks.add(new Task(7, "ブログ書く"));
        tasks.add(new Task(8, "旅行の計画立てる"));
        tasks.add(new Task(9, "スライド作る"));
        tasks.add(new Task(10, "勉強会の会場を抑える"));
        tasks.add(new Task(11, "SHIROBAKO見る"));
        tasks.add(new Task(12, "マーボーナス食べる"));
        tasks.add(new Task(13, "お好み焼き食べる"));
        tasks.add(new Task(14, "ラノベ買いに行く"));
        tasks.add(new Task(15, "技術書買う"));
        tasks.add(new Task(16, "伝勇伝見る"));
        tasks.add(new Task(17, "適当なタイミングでバルスってつぶやく"));
    }

    public List<Task> findAll() {
        return tasks;
    }

    public Task findById(int id) {
        Task target = null;
        for (Task task : tasks) {
            if (task.getId() == id) {
                target = task;
            }
        }
        return target;
    }

}
