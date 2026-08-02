package com.neptunesoft.gestionbacdz;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.neptunesoft.gestionbacdz.classobjects.Feedback;

/* loaded from: classes.dex */
public class FeedbackActivity extends AppCompatActivity {
    static boolean from_home;
    private AlertDialog alertDialog_close;
    private AlertDialog alertDialog_feedback_failure;
    private AlertDialog alertDialog_feedback_success;
    private AlertDialog alertDialog_no_connection;
    Button btn_send_feedback;
    EditText editText_email;
    EditText editText_feedback;
    EditText editText_name;
    EditText editText_phone;
    boolean failed;
    ImageView imageViewfeedback;
    private ProgressDialog progressDialog_send_feedback;
    RadioButton radio_complaint;
    RadioButton radio_opinion;
    private DatabaseReference ref;
    Handler handler = new Handler();
    int count_time_wait = 0;
    Runnable time_wait_out = new Runnable() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity.1
        @Override // java.lang.Runnable
        public void run() {
            if (FeedbackActivity.this.count_time_wait < 25) {
                FeedbackActivity.this.count_time_wait++;
                FeedbackActivity.this.handler.postDelayed(FeedbackActivity.this.time_wait_out, 1000L);
            } else {
                if (FeedbackActivity.this.test_connection()) {
                    FeedbackActivity.this.feedback_failure();
                } else {
                    FeedbackActivity.this.no_connection();
                }
                FeedbackActivity.this.count_time_wait = 0;
                FeedbackActivity.this.getWindow().clearFlags(128);
                FeedbackActivity.this.handler.removeCallbacks(FeedbackActivity.this.time_wait_out);
            }
        }
    };

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        this.imageViewfeedback = (ImageView) findViewById(R.id.imageViewfeedback);
        this.editText_name = (EditText) findViewById(R.id.editText_name);
        this.editText_email = (EditText) findViewById(R.id.editText_email);
        this.editText_phone = (EditText) findViewById(R.id.editText_phone);
        this.editText_feedback = (EditText) findViewById(R.id.editText_feedback);
        this.radio_opinion = (RadioButton) findViewById(R.id.radio_opinion);
        this.radio_complaint = (RadioButton) findViewById(R.id.radio_complaint);
        this.btn_send_feedback = (Button) findViewById(R.id.btn_send_feedback);
        refreshUI();
        this.editText_name.setText((CharSequence) null);
        this.editText_email.setText((CharSequence) null);
        this.editText_phone.setText((CharSequence) null);
        this.editText_feedback.setText((CharSequence) null);
        this.radio_opinion.setChecked(true);
        this.radio_complaint.setChecked(false);
        this.ref = FirebaseDatabase.getInstance().getReference().child("feedback");
        this.radio_opinion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FeedbackActivity.this.m601lambda$onCreate$0$comneptunesoftgestionbacdzFeedbackActivity(compoundButton, z);
            }
        });
        this.radio_complaint.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FeedbackActivity.this.m602lambda$onCreate$1$comneptunesoftgestionbacdzFeedbackActivity(compoundButton, z);
            }
        });
        this.btn_send_feedback.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackActivity.this.m605lambda$onCreate$4$comneptunesoftgestionbacdzFeedbackActivity(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m601lambda$onCreate$0$comneptunesoftgestionbacdzFeedbackActivity(CompoundButton compoundButton, boolean z) {
        if (this.radio_opinion.isChecked()) {
            this.radio_complaint.setChecked(false);
        }
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m602lambda$onCreate$1$comneptunesoftgestionbacdzFeedbackActivity(CompoundButton compoundButton, boolean z) {
        if (this.radio_complaint.isChecked()) {
            this.radio_opinion.setChecked(false);
        }
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m605lambda$onCreate$4$comneptunesoftgestionbacdzFeedbackActivity(View view) {
        String str;
        if (test_connection()) {
            if (!this.editText_name.getText().toString().equals("")) {
                if (!this.editText_email.getText().toString().equals("")) {
                    if (Patterns.EMAIL_ADDRESS.matcher(this.editText_email.getText().toString()).matches()) {
                        if (!this.editText_phone.getText().toString().equals("")) {
                            if (Patterns.PHONE.matcher(this.editText_phone.getText().toString()).matches()) {
                                if (!this.editText_feedback.getText().toString().equals("")) {
                                    hide_keyboard(this);
                                    dialog_wait();
                                    str = this.radio_opinion.isChecked() ? "Opinion" : "Complaint";
                                    Feedback feedback = new Feedback();
                                    feedback.setName(this.editText_name.getText().toString());
                                    feedback.setEmail(this.editText_email.getText().toString());
                                    feedback.setPhone(this.editText_phone.getText().toString());
                                    feedback.setType(str);
                                    feedback.setFeedback(this.editText_feedback.getText().toString());
                                    this.failed = false;
                                    this.ref.child("Bac gestion apps").push().setValue(feedback).addOnSuccessListener(new OnSuccessListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda14
                                        @Override // com.google.android.gms.tasks.OnSuccessListener
                                        public final void onSuccess(Object obj) {
                                            FeedbackActivity.this.m603lambda$onCreate$2$comneptunesoftgestionbacdzFeedbackActivity((Void) obj);
                                        }
                                    });
                                    return;
                                }
                                Toast.makeText(this, "قم بكتابة رسالة الـ feedback قبل الإرسال", 0).show();
                                EditText editText = this.editText_feedback;
                                editText.requestFocus(editText.getText().toString().length());
                                show_keyboard(this);
                                return;
                            }
                            Toast.makeText(this, "رقم الهاتف الذي أدخلته خاطئ", 0).show();
                            EditText editText2 = this.editText_phone;
                            editText2.requestFocus(editText2.getText().toString().length());
                            show_keyboard(this);
                            return;
                        }
                        if (!this.editText_feedback.getText().toString().equals("")) {
                            hide_keyboard(this);
                            dialog_wait();
                            str = this.radio_opinion.isChecked() ? "Opinion" : "Complaint";
                            Feedback feedback2 = new Feedback();
                            feedback2.setName(this.editText_name.getText().toString());
                            feedback2.setEmail(this.editText_email.getText().toString());
                            feedback2.setPhone(this.editText_phone.getText().toString());
                            feedback2.setType(str);
                            feedback2.setFeedback(this.editText_feedback.getText().toString());
                            this.failed = false;
                            this.ref.child("Bac gestion apps").push().setValue(feedback2).addOnSuccessListener(new OnSuccessListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda15
                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    FeedbackActivity.this.m604lambda$onCreate$3$comneptunesoftgestionbacdzFeedbackActivity((Void) obj);
                                }
                            });
                            return;
                        }
                        Toast.makeText(this, "قم بكتابة رسالة الـ feedback قبل الإرسال", 0).show();
                        EditText editText3 = this.editText_feedback;
                        editText3.requestFocus(editText3.getText().toString().length());
                        show_keyboard(this);
                        return;
                    }
                    Toast.makeText(this, "عنوان الإيمايل الذي أدخلته خاطئ", 0).show();
                    EditText editText4 = this.editText_email;
                    editText4.requestFocus(editText4.getText().toString().length());
                    show_keyboard(this);
                    return;
                }
                Toast.makeText(this, "قم بكتابة الإيمايل قبل إرسال الـ feedback", 0).show();
                EditText editText5 = this.editText_email;
                editText5.requestFocus(editText5.getText().toString().length());
                show_keyboard(this);
                return;
            }
            Toast.makeText(this, "قم بكتابة الإسم واللقب قبل إرسال الـ feedback", 0).show();
            EditText editText6 = this.editText_name;
            editText6.requestFocus(editText6.getText().toString().length());
            show_keyboard(this);
            return;
        }
        no_connection();
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m603lambda$onCreate$2$comneptunesoftgestionbacdzFeedbackActivity(Void r3) {
        if (this.failed) {
            return;
        }
        try {
            feedback_success(this.radio_opinion.isChecked());
            this.editText_name.setText("");
            this.editText_email.setText("");
            this.editText_phone.setText("");
            this.radio_opinion.setChecked(true);
            this.editText_feedback.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m604lambda$onCreate$3$comneptunesoftgestionbacdzFeedbackActivity(Void r3) {
        if (this.failed) {
            return;
        }
        try {
            feedback_success(this.radio_opinion.isChecked());
            this.editText_name.setText("");
            this.editText_email.setText("");
            this.editText_phone.setText("");
            this.radio_opinion.setChecked(true);
            this.editText_feedback.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean test_connection() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void no_connection() {
        close_dialog();
        hide_keyboard(this);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.alertDialog_no_connection = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                FeedbackActivity.this.m597x296edd1e(dialogInterface);
            }
        });
        this.alertDialog_no_connection.setMessage("لا يوجد إتصال بالشبكة");
        this.alertDialog_no_connection.setButton(-1, "المحاول مرة أخرى", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FeedbackActivity.this.m598x9ee9035f(dialogInterface, i);
            }
        });
        this.alertDialog_no_connection.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.alertDialog_no_connection.show();
    }

    /* renamed from: lambda$no_connection$5$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m597x296edd1e(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.alertDialog_no_connection.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.alertDialog_no_connection.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$no_connection$6$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m598x9ee9035f(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (test_connection()) {
            ((Button) findViewById(R.id.btn_send_feedback)).callOnClick();
        } else {
            no_connection();
        }
    }

    private void feedback_success(boolean opinion) {
        this.handler.removeCallbacks(this.time_wait_out);
        close_dialog();
        hide_keyboard(this);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.alertDialog_feedback_success = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                FeedbackActivity.this.m595xc18db468(dialogInterface);
            }
        });
        this.alertDialog_feedback_success.setCancelable(false);
        if (opinion) {
            this.alertDialog_feedback_success.setMessage("تم إرسال الـ feedback بنجاج, نشكرك على مساعدتنا على تحسين محتوى التطبيق");
        } else {
            this.alertDialog_feedback_success.setMessage("تم إرسال الـ feedback بنجاج, نحن نعتذر عن أي مشكلة واجهتك مع التطبيق ترقب الجديد في التحديثات القادمة إن شاء الله");
        }
        if (from_home) {
            this.alertDialog_feedback_success.setButton(-1, "الصفحة الرئيسية", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    FeedbackActivity.this.m596x3707daa9(dialogInterface, i);
                }
            });
        } else {
            this.alertDialog_feedback_success.setButton(-1, "حول التطبيق", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    FeedbackActivity.this.m594xe872aa8b(dialogInterface, i);
                }
            });
        }
        this.alertDialog_feedback_success.show();
    }

    /* renamed from: lambda$feedback_success$8$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m595xc18db468(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.alertDialog_feedback_success.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$feedback_success$9$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m596x3707daa9(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    /* renamed from: lambda$feedback_success$10$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m594xe872aa8b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void feedback_failure() {
        close_dialog();
        hide_keyboard(this);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.alertDialog_feedback_failure = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                FeedbackActivity.this.m592xa009a25(dialogInterface);
            }
        });
        this.alertDialog_feedback_failure.setMessage("تعذر إرسال الـ feedback , حاول مرة أخرى أو تحقق من إتصالك بشبكة");
        this.alertDialog_feedback_failure.setButton(-1, "غلق", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FeedbackActivity.this.m593x7f7ac066(dialogInterface, i);
            }
        });
        this.alertDialog_feedback_failure.show();
    }

    /* renamed from: lambda$feedback_failure$11$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m592xa009a25(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.alertDialog_feedback_failure.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$feedback_failure$12$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m593x7f7ac066(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    public void close_dialog() {
        AlertDialog alertDialog = this.alertDialog_feedback_success;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.alertDialog_feedback_success.dismiss();
        }
        AlertDialog alertDialog2 = this.alertDialog_no_connection;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.alertDialog_no_connection.dismiss();
        }
        AlertDialog alertDialog3 = this.alertDialog_feedback_failure;
        if (alertDialog3 != null && alertDialog3.isShowing()) {
            this.alertDialog_feedback_failure.dismiss();
        }
        ProgressDialog progressDialog = this.progressDialog_send_feedback;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.progressDialog_send_feedback.dismiss();
        }
        AlertDialog alertDialog4 = this.alertDialog_close;
        if (alertDialog4 == null || !alertDialog4.isShowing()) {
            return;
        }
        this.alertDialog_close.dismiss();
    }

    private void dialog_wait() {
        close_dialog();
        hide_keyboard(this);
        this.handler.postDelayed(this.time_wait_out, 1000L);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.progressDialog_send_feedback = progressDialog;
        progressDialog.setCancelable(false);
        this.progressDialog_send_feedback.show();
        this.progressDialog_send_feedback.setContentView(R.layout.progressdialogfeedback);
    }

    public static void hide_keyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static void show_keyboard(Activity activity) {
        ((InputMethodManager) activity.getSystemService("input_method")).toggleSoftInput(0, 1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.editText_name.getText().toString().equals("") && this.editText_email.getText().toString().equals("") && this.editText_phone.getText().toString().equals("") && this.editText_feedback.getText().toString().equals("")) {
            super.onBackPressed();
            this.failed = true;
            return;
        }
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.alertDialog_close = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda11
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                FeedbackActivity.this.m599xdae83735(dialogInterface);
            }
        });
        this.alertDialog_close.setMessage("عند غلق هذه الواجهة سيتم مسح جميع المعلومات التي قمت بإدخالها, هل تريد تجاهل عملية إرسال الـ feedback ؟.");
        this.alertDialog_close.setButton(-1, "تجاهل", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda12
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FeedbackActivity.this.m600x50625d76(dialogInterface, i);
            }
        });
        this.alertDialog_close.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.FeedbackActivity$$ExternalSyntheticLambda13
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.alertDialog_close.show();
    }

    /* renamed from: lambda$onBackPressed$13$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m599xdae83735(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.alertDialog_close.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.alertDialog_close.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$onBackPressed$14$com-neptunesoft-gestionbacdz-FeedbackActivity, reason: not valid java name */
    /* synthetic */ void m600x50625d76(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        super.onBackPressed();
        this.failed = true;
        finish();
    }

    void refreshUI() {
        this.editText_phone.setElevation(10.0f);
        this.editText_name.setElevation(10.0f);
        this.editText_feedback.setElevation(10.0f);
        this.editText_email.setElevation(10.0f);
        if (SplashScreen.darkmode) {
            this.imageViewfeedback.setImageResource(R.drawable.ic_feedback_dark);
            this.editText_name.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editText_email.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editText_phone.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editText_feedback.setBackgroundResource(R.drawable.background_edittext_dark);
            return;
        }
        this.imageViewfeedback.setImageResource(R.drawable.ic_feedback);
        this.editText_name.setBackgroundResource(R.drawable.background_edittext);
        this.editText_email.setBackgroundResource(R.drawable.background_edittext);
        this.editText_phone.setBackgroundResource(R.drawable.background_edittext);
        this.editText_feedback.setBackgroundResource(R.drawable.background_edittext);
    }
}
