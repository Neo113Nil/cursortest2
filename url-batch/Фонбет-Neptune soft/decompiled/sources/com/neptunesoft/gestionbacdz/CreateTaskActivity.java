package com.neptunesoft.gestionbacdz;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.neptunesoft.gestionbacdz.broadcast.ReminderBroadcast;
import com.neptunesoft.gestionbacdz.database.DataBaseTasks;
import com.neptunesoft.gestionbacdz.entities.Task;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class CreateTaskActivity extends AppCompatActivity {
    private Task alreadyAvailableTask;
    Calendar calendar;
    CheckBox checkbox;
    private AlertDialog dialogDeleteTask;
    private EditText edittextTask;
    Handler handler = new Handler();
    Runnable hideLayoutMiscellaneous = new Runnable() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity.1
        @Override // java.lang.Runnable
        public void run() {
            CreateTaskActivity.this.hideLayoutMiscellaneous();
            CreateTaskActivity.this.handler.removeCallbacks(CreateTaskActivity.this.hideLayoutMiscellaneous);
        }
    };
    ImageView imgReminder;
    ImageView imgback;
    ImageView imgsave;
    LinearLayout lytReminder;
    String reminder_date;
    private TextView textDateTimeReminder;
    private TextView textvdatetime;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);
        this.edittextTask = (EditText) findViewById(R.id.edittextTask);
        this.textvdatetime = (TextView) findViewById(R.id.textvdatetime);
        this.textDateTimeReminder = (TextView) findViewById(R.id.textDateTimeReminder);
        this.lytReminder = (LinearLayout) findViewById(R.id.lytReminder);
        this.imgback = (ImageView) findViewById(R.id.imgback);
        this.imgsave = (ImageView) findViewById(R.id.imgsave);
        this.imgReminder = (ImageView) findViewById(R.id.imgReminder);
        this.checkbox = (CheckBox) findViewById(R.id.checkbox);
        this.reminder_date = "";
        if (getIntent().getBooleanExtra("isViewOrUpdate", false)) {
            Task task = (Task) getIntent().getSerializableExtra("task");
            this.alreadyAvailableTask = task;
            if (task.getDate_time_reminder() != null && !this.alreadyAvailableTask.getDate_time_reminder().trim().isEmpty()) {
                this.reminder_date = this.alreadyAvailableTask.getDate_time_reminder();
            }
            setViewOrUpdateTask();
        }
        refreshUI();
        this.textvdatetime.setText(new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm a", Locale.getDefault()).format(new Date()));
        this.imgback.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateTaskActivity.this.m562x7215b36e(view);
            }
        });
        this.imgsave.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateTaskActivity.this.m563x719f4d6f(view);
            }
        });
        initMiscellaneous();
        this.edittextTask.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CreateTaskActivity.this.m564x7128e770(view, z);
            }
        });
        this.edittextTask.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateTaskActivity.this.m565x70b28171(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m562x7215b36e(View view) {
        hideLayoutMiscellaneous();
        super.onBackPressed();
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m563x719f4d6f(View view) {
        hideLayoutMiscellaneous();
        saveTask();
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m564x7128e770(View view, boolean z) {
        this.handler.postDelayed(this.hideLayoutMiscellaneous, 100L);
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m565x70b28171(View view) {
        this.handler.postDelayed(this.hideLayoutMiscellaneous, 100L);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [com.neptunesoft.gestionbacdz.CreateTaskActivity$1saveTaskTask] */
    private void saveTask() {
        if (this.edittextTask.getText().toString().trim().isEmpty() && this.edittextTask.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "لا يمكنك حفظ هذه المهمة و هي فارغة !.", 1).show();
            return;
        }
        final Task task = new Task();
        task.setTask(this.edittextTask.getText().toString());
        task.setChecked(false);
        task.setDate_time_created(this.textvdatetime.getText().toString());
        if (!this.reminder_date.equals("")) {
            task.setDate_time_reminder(this.reminder_date);
        }
        Task task2 = this.alreadyAvailableTask;
        if (task2 != null) {
            task.setId_task(task2.getId_task());
            task.setChecked(this.alreadyAvailableTask.isChecked());
        }
        new AsyncTask<Void, Void, Void>() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity.1saveTaskTask
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voids) {
                DataBaseTasks.getDataBase(CreateTaskActivity.this.getApplicationContext()).taskDao().insertTask(task);
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference failed for: r3v2, types: [com.neptunesoft.gestionbacdz.CreateTaskActivity$1GetTaskTask] */
            @Override // android.os.AsyncTask
            public void onPostExecute(Void aVoid) {
                super.onPostExecute((C1saveTaskTask) aVoid);
                CreateTaskActivity.this.setResult(-1, new Intent());
                final CreateTaskActivity createTaskActivity = CreateTaskActivity.this;
                final Task task3 = task;
                new AsyncTask<Void, Void, Task>() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity.1GetTaskTask
                    static final /* synthetic */ boolean $assertionsDisabled = false;

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public Task doInBackground(Void... voids) {
                        if (CreateTaskActivity.this.alreadyAvailableTask == null) {
                            return DataBaseTasks.getDataBase(CreateTaskActivity.this.getApplicationContext()).taskDao().getLastTast();
                        }
                        return task3;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onPostExecute(Task task4) {
                        PendingIntent broadcast;
                        super.onPostExecute((C1GetTaskTask) task4);
                        if (task4.getDate_time_reminder() != null && CreateTaskActivity.this.calendar != null) {
                            CreateTaskActivity.this.createNotificationChannel();
                            Intent intent = new Intent(CreateTaskActivity.this, (Class<?>) ReminderBroadcast.class);
                            if (Build.VERSION.SDK_INT >= 31) {
                                broadcast = PendingIntent.getBroadcast(CreateTaskActivity.this, 1, intent, 33554432);
                            } else {
                                broadcast = PendingIntent.getBroadcast(CreateTaskActivity.this, 1, intent, 0);
                            }
                            AlarmManager alarmManager = (AlarmManager) CreateTaskActivity.this.getSystemService(NotificationCompat.CATEGORY_ALARM);
                            if (CreateTaskActivity.this.calendar.getTimeInMillis() > System.currentTimeMillis() && !CreateTaskActivity.this.reminder_date.equals("")) {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                                Date date = new Date();
                                try {
                                    date = simpleDateFormat.parse(CreateTaskActivity.this.reminder_date);
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }
                                alarmManager.setExact(0, date.getTime(), broadcast);
                            }
                        }
                        CreateTaskActivity.this.finish();
                    }
                }.execute(new Void[0]);
            }
        }.execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createNotificationChannel() {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel m = HomeActivity$$ExternalSyntheticApiModelOutline0.m("com.neptunesoft.gestionbacdz.broadcast", "com.neptunesoft.gestionbacdz.broadcast", 3);
            m.setDescription("Channel to remind you of the tasks of the baccalaureate Management and economics.");
            systemService = getSystemService(NotificationManager.class);
            ((NotificationManager) systemService).createNotificationChannel(m);
        }
    }

    private void initMiscellaneous() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutMiscellaneousTask);
        final BottomSheetBehavior from = BottomSheetBehavior.from(linearLayout);
        linearLayout.findViewById(R.id.textMiscellaneous).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateTaskActivity.lambda$initMiscellaneous$4(BottomSheetBehavior.this, view);
            }
        });
        if (this.alreadyAvailableTask != null) {
            linearLayout.findViewById(R.id.layoutDeleteTask).setVisibility(0);
            linearLayout.findViewById(R.id.layoutDeleteTask).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda13
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateTaskActivity.this.m559x4ddd2e5c(from, view);
                }
            });
            if (this.alreadyAvailableTask.getDate_time_reminder() != null && !this.alreadyAvailableTask.getDate_time_reminder().trim().isEmpty()) {
                linearLayout.findViewById(R.id.layoutRemoveReminder).setVisibility(0);
            }
        }
        linearLayout.findViewById(R.id.layoutAddReminder).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateTaskActivity.this.m560x4d66c85d(from, view);
            }
        });
        linearLayout.findViewById(R.id.layoutRemoveReminder).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateTaskActivity.this.m561x4cf0625e(from, view);
            }
        });
    }

    static /* synthetic */ void lambda$initMiscellaneous$4(BottomSheetBehavior bottomSheetBehavior, View view) {
        if (bottomSheetBehavior.getState() != 3) {
            bottomSheetBehavior.setState(3);
        } else {
            bottomSheetBehavior.setState(4);
        }
    }

    /* renamed from: lambda$initMiscellaneous$5$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m559x4ddd2e5c(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.setState(4);
        showDeleteTaskDialog();
    }

    /* renamed from: lambda$initMiscellaneous$6$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m560x4d66c85d(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.setState(4);
        showDateTimePicker();
    }

    /* renamed from: lambda$initMiscellaneous$7$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m561x4cf0625e(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.setState(4);
        removeReminder();
    }

    private void removeReminder() {
        ((LinearLayout) findViewById(R.id.layoutMiscellaneousTask)).findViewById(R.id.layoutRemoveReminder).setVisibility(8);
        this.lytReminder.setVisibility(8);
        this.reminder_date = "";
        Task task = this.alreadyAvailableTask;
        if (task == null || task.getDate_time_reminder() == null || this.alreadyAvailableTask.getDate_time_reminder().trim().isEmpty()) {
            return;
        }
        this.alreadyAvailableTask.setDate_time_reminder(null);
    }

    private void showDateTimePicker() {
        this.calendar = Calendar.getInstance();
        new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda11
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                CreateTaskActivity.this.m567xe4679922(datePicker, i, i2, i3);
            }
        }, this.calendar.get(1), this.calendar.get(2), this.calendar.get(5)).show();
    }

    /* renamed from: lambda$showDateTimePicker$9$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m567xe4679922(DatePicker datePicker, int i, int i2, int i3) {
        this.calendar.set(1, i);
        this.calendar.set(2, i2);
        this.calendar.set(5, i3);
        new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda10
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i4, int i5) {
                CreateTaskActivity.this.m566xe4ddff21(timePicker, i4, i5);
            }
        }, this.calendar.get(11), this.calendar.get(12), false).show();
    }

    /* renamed from: lambda$showDateTimePicker$8$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m566xe4ddff21(TimePicker timePicker, int i, int i2) {
        Date date;
        this.calendar.set(12, i2);
        this.calendar.set(11, i);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String format = simpleDateFormat.format(this.calendar.getTime());
        try {
            date = simpleDateFormat.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        this.reminder_date = format;
        if (new Date().after(date)) {
            showLayoutReminder(format);
            Toast.makeText(this, "التاريخ الذي أدخلته غير صالح !.", 0).show();
        } else {
            showLayoutReminder(format);
        }
    }

    private void showLayoutReminder(String dateReminder) {
        Date date;
        if (this.lytReminder.getVisibility() == 8) {
            this.lytReminder.setVisibility(0);
        }
        ((LinearLayout) findViewById(R.id.layoutMiscellaneousTask)).findViewById(R.id.layoutRemoveReminder).setVisibility(0);
        this.textDateTimeReminder.setText(dateReminder);
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dateReminder);
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        if (!new Date().after(date)) {
            if (SplashScreen.darkmode) {
                this.textDateTimeReminder.setTextColor(Color.parseColor("#FFFFFF"));
                this.imgReminder.setImageResource(R.drawable.ic_task_reminder_dark);
                return;
            } else {
                this.textDateTimeReminder.setTextColor(Color.parseColor("#2F3655"));
                this.imgReminder.setImageResource(R.drawable.ic_task_reminder);
                return;
            }
        }
        this.textDateTimeReminder.setTextColor(Color.parseColor("#FF3E41"));
        this.imgReminder.setImageResource(R.drawable.ic_task_reminder_red);
    }

    void hideLayoutMiscellaneous() {
        BottomSheetBehavior.from((LinearLayout) findViewById(R.id.layoutMiscellaneousTask)).setState(4);
    }

    void refreshUI() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutMiscellaneousTask);
        ImageView imageView = (ImageView) findViewById(R.id.miscellaneousReminder);
        ImageView imageView2 = (ImageView) findViewById(R.id.miscellaneousRemoveReminder);
        ImageView imageView3 = (ImageView) findViewById(R.id.imgReminder);
        Date date = null;
        if (SplashScreen.darkmode) {
            imageView3.setImageResource(R.drawable.ic_task_reminder_dark);
            this.imgback.setImageResource(R.drawable.ic_back_dark);
            this.imgsave.setImageResource(R.drawable.ic_done_dark);
            this.imgsave.setBackgroundResource(R.drawable.background_done_button_dark);
            linearLayout.setBackgroundResource(R.drawable.backgroundmiscellaneous_dark);
            imageView.setImageResource(R.drawable.ic_task_reminder_dark);
            imageView2.setImageResource(R.drawable.ic_cancel_dark);
            Task task = this.alreadyAvailableTask;
            if (task == null || task.getDate_time_reminder() == null || this.alreadyAvailableTask.getDate_time_reminder().trim().isEmpty()) {
                return;
            }
            try {
                date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(this.alreadyAvailableTask.getDate_time_reminder());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (!new Date().after(date)) {
                this.textDateTimeReminder.setTextColor(Color.parseColor("#FFFFFF"));
                imageView3.setImageResource(R.drawable.ic_task_reminder_dark);
                return;
            } else {
                this.textDateTimeReminder.setTextColor(Color.parseColor("#FF3E41"));
                imageView3.setImageResource(R.drawable.ic_task_reminder_red);
                return;
            }
        }
        imageView3.setImageResource(R.drawable.ic_task_reminder);
        this.imgback.setImageResource(R.drawable.ic_back);
        this.imgsave.setImageResource(R.drawable.ic_done);
        this.imgsave.setBackgroundResource(R.drawable.background_done_button);
        linearLayout.setBackgroundResource(R.drawable.backgroundmiscellaneous);
        imageView.setImageResource(R.drawable.ic_task_reminder);
        imageView2.setImageResource(R.drawable.ic_cancel);
        Task task2 = this.alreadyAvailableTask;
        if (task2 == null || task2.getDate_time_reminder() == null || this.alreadyAvailableTask.getDate_time_reminder().trim().isEmpty()) {
            return;
        }
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(this.alreadyAvailableTask.getDate_time_reminder());
        } catch (ParseException e2) {
            e2.printStackTrace();
        }
        if (!new Date().after(date)) {
            this.textDateTimeReminder.setTextColor(Color.parseColor("#2F3655"));
            imageView3.setImageResource(R.drawable.ic_task_reminder);
        } else {
            this.textDateTimeReminder.setTextColor(Color.parseColor("#FF3E41"));
            imageView3.setImageResource(R.drawable.ic_task_reminder_red);
        }
    }

    private void setViewOrUpdateTask() {
        this.edittextTask.setText(this.alreadyAvailableTask.getTask());
        this.textvdatetime.setText(this.alreadyAvailableTask.getDate_time_created());
        if (this.alreadyAvailableTask.isChecked()) {
            this.checkbox.setChecked(true);
            EditText editText = this.edittextTask;
            editText.setPaintFlags(editText.getPaintFlags() | 16);
        }
        if (this.alreadyAvailableTask.getDate_time_reminder() == null || this.alreadyAvailableTask.getDate_time_reminder().trim().isEmpty()) {
            return;
        }
        this.textDateTimeReminder.setText(this.alreadyAvailableTask.getDate_time_reminder());
        this.lytReminder.setVisibility(0);
    }

    private void showDeleteTaskDialog() {
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialogDeleteTask = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda16
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CreateTaskActivity.this.m568x3da411db(dialogInterface);
            }
        });
        this.dialogDeleteTask.setMessage("هل تريد حذف هذه المهمة ؟.");
        this.dialogDeleteTask.setButton(-1, "حذف", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateTaskActivity.this.m569x3d2dabdc(dialogInterface, i);
            }
        });
        this.dialogDeleteTask.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialogDeleteTask.show();
    }

    /* renamed from: lambda$showDeleteTaskDialog$10$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m568x3da411db(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialogDeleteTask.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.dialogDeleteTask.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.neptunesoft.gestionbacdz.CreateTaskActivity$1DeleteTaskTask] */
    /* renamed from: lambda$showDeleteTaskDialog$11$com-neptunesoft-gestionbacdz-CreateTaskActivity, reason: not valid java name */
    /* synthetic */ void m569x3d2dabdc(DialogInterface dialogInterface, int i) {
        this.dialogDeleteTask.dismiss();
        new AsyncTask<Void, Void, Void>() { // from class: com.neptunesoft.gestionbacdz.CreateTaskActivity.1DeleteTaskTask
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voids) {
                DataBaseTasks.getDataBase(CreateTaskActivity.this.getApplicationContext()).taskDao().deleteTask(CreateTaskActivity.this.alreadyAvailableTask);
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(Void aVoid) {
                super.onPostExecute((C1DeleteTaskTask) aVoid);
                Intent intent = new Intent();
                intent.putExtra("isTaskDeleted", true);
                CreateTaskActivity.this.setResult(-1, intent);
                CreateTaskActivity.this.finish();
            }
        }.execute(new Void[0]);
    }
}
