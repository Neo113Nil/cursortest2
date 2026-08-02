package com.neptunesoft.gestionbacdz.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.neptunesoft.gestionbacdz.R;
import com.neptunesoft.gestionbacdz.database.DataBaseTasks;
import com.neptunesoft.gestionbacdz.entities.Task;
import com.neptunesoft.gestionbacdz.services.RestartAlarmsService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class ReminderBroadcast extends BroadcastReceiver {
    private List<Task> taskListReminded;

    /* JADX WARN: Type inference failed for: r3v6, types: [com.neptunesoft.gestionbacdz.broadcast.ReminderBroadcast$1GetTaskTask] */
    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            try {
                context.startService(new Intent(context, (Class<?>) RestartAlarmsService.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.taskListReminded = new ArrayList();
        new AsyncTask<Void, Void, List<Task>>() { // from class: com.neptunesoft.gestionbacdz.broadcast.ReminderBroadcast.1GetTaskTask
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public List<Task> doInBackground(Void... voids) {
                return DataBaseTasks.getDataBase(context).taskDao().getAllTasksReminder();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(List<Task> tasks) {
                super.onPostExecute((C1GetTaskTask) tasks);
                ReminderBroadcast.this.taskListReminded.clear();
                ReminderBroadcast.this.taskListReminded.addAll(tasks);
                ReminderBroadcast.this.showNotification(context);
            }
        }.execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.neptunesoft.gestionbacdz.broadcast.ReminderBroadcast$1saveTaskTask] */
    public void showNotification(final Context context) {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        for (int i = 0; i < this.taskListReminded.size(); i++) {
            if (this.taskListReminded.get(i).getDate_time_reminder().equals(format)) {
                final Task task = this.taskListReminded.get(i);
                task.setReminded(true);
                show(context, task);
                new AsyncTask<Void, Void, Void>() { // from class: com.neptunesoft.gestionbacdz.broadcast.ReminderBroadcast.1saveTaskTask
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public Void doInBackground(Void... voids) {
                        DataBaseTasks.getDataBase(context).taskDao().insertTask(task);
                        return null;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onPostExecute(Void aVoid) {
                        super.onPostExecute((C1saveTaskTask) aVoid);
                    }
                }.execute(new Void[0]);
            }
        }
    }

    private void show(Context context, Task task) {
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        String str = task.getTask() + " | الموعد : " + task.getDate_time_reminder();
        NotificationManagerCompat.from(context).notify(task.getId_task(), new NotificationCompat.Builder(context, "com.neptunesoft.gestionbacdz.broadcast").setSmallIcon(R.drawable.ic_task_reminder_24).setContentTitle("المهام").setStyle(new NotificationCompat.BigTextStyle().bigText(str)).setContentText(str).setWhen(System.currentTimeMillis()).setSound(defaultUri).setPriority(0).setVibrate(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400}).build());
    }
}
