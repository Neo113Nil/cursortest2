package com.neptunesoft.qrbarcodescanner;

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
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes2.dex */
public class Feedback_Activity extends AppCompatActivity {
    static EditText editText_email;
    static EditText editText_phone;
    static boolean from_home;
    static String nmbr_phone;
    private AlertDialog alertDialog_feedback_failure;
    private AlertDialog alertDialog_feedback_success;
    private AlertDialog alertDialog_no_connection;
    boolean failed;
    private ProgressDialog progressDialog_send_feedback;
    private DatabaseReference ref;
    Handler handler = new Handler();
    int count_time_wait = 0;
    Runnable time_wait_out = new Runnable() { // from class: com.neptunesoft.qrbarcodescanner.Feedback_Activity.1
        @Override // java.lang.Runnable
        public void run() {
            if (Feedback_Activity.this.count_time_wait < 25) {
                Feedback_Activity.this.count_time_wait++;
                Feedback_Activity.this.handler.postDelayed(Feedback_Activity.this.time_wait_out, 1000L);
            } else {
                if (Feedback_Activity.this.test_connection()) {
                    Feedback_Activity.this.feedback_failure();
                } else {
                    Feedback_Activity.this.no_connection();
                }
                Feedback_Activity.this.count_time_wait = 0;
                Feedback_Activity.this.getWindow().clearFlags(128);
                Feedback_Activity.this.handler.removeCallbacks(Feedback_Activity.this.time_wait_out);
            }
        }
    };

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.feedback_activity);
        final RadioButton radioButton = (RadioButton) findViewById(R.id.radio_opinion);
        final RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_complaint);
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        this.ref = FirebaseDatabase.getInstance().getReference().child("feedback");
        Button button = (Button) findViewById(R.id.btn_send_feedback);
        editText_phone = (EditText) findViewById(R.id.editText_phone);
        final EditText editText = (EditText) findViewById(R.id.editText_name);
        final EditText editText2 = (EditText) findViewById(R.id.editText_feedback);
        editText_email = (EditText) findViewById(R.id.editText_email);
        String str = nmbr_phone;
        if (str != null && !str.equals("")) {
            editText_phone.setText(nmbr_phone);
            editText_phone.setEnabled(false);
        } else {
            editText_phone.setText((CharSequence) null);
            editText_phone.setEnabled(true);
        }
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.qrbarcodescanner.Feedback_Activity$$ExternalSyntheticLambda6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Feedback_Activity.lambda$onCreate$0(radioButton, radioButton2, compoundButton, z);
            }
        });
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.qrbarcodescanner.Feedback_Activity$$ExternalSyntheticLambda7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Feedback_Activity.lambda$onCreate$1(radioButton2, radioButton, compoundButton, z);
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Feedback_Activity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Feedback_Activity.this.m141x975b1b76(editText, editText2, radioButton, view);
            }
        });
    }

    static /* synthetic */ void lambda$onCreate$0(RadioButton radioButton, RadioButton radioButton2, CompoundButton compoundButton, boolean z) {
        if (radioButton.isChecked()) {
            radioButton2.setChecked(false);
        }
    }

    static /* synthetic */ void lambda$onCreate$1(RadioButton radioButton, RadioButton radioButton2, CompoundButton compoundButton, boolean z) {
        if (radioButton.isChecked()) {
            radioButton2.setChecked(false);
        }
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-qrbarcodescanner-Feedback_Activity, reason: not valid java name */
    /* synthetic */ void m141x975b1b76(final EditText editText, final EditText editText2, final RadioButton radioButton, View view) {
        if (test_connection()) {
            if (!editText.getText().toString().equals("")) {
                if (!editText_email.getText().toString().equals("")) {
                    if (Patterns.EMAIL_ADDRESS.matcher(editText_email.getText().toString()).matches()) {
                        if (!editText_phone.getText().toString().equals("")) {
                            if (Patterns.PHONE.matcher(editText_phone.getText().toString()).matches()) {
                                if (!editText2.getText().toString().equals("")) {
                                    hide_keyboard(this);
                                    dialog_wait();
                                    String str = radioButton.isChecked() ? "Opinion" : "Complaint";
                                    Feedback feedback = new Feedback();
                                    feedback.setName(editText.getText().toString());
                                    feedback.setEmail(editText_email.getText().toString());
                                    if (editText_phone.isEnabled()) {
                                        feedback.setPhone("may be real : " + editText_phone.getText().toString());
                                    } else {
                                        feedback.setPhone("real : " + editText_phone.getText().toString());
                                    }
                                    feedback.setType(str);
                                    feedback.setFeedback(editText2.getText().toString());
                                    this.failed = false;
                                    this.ref.child("QR & Bar Code Scanner apps").push().setValue(feedback).addOnSuccessListener(new OnSuccessListener() { // from class: com.neptunesoft.qrbarcodescanner.Feedback_Activity$$ExternalSyntheticLambda8
                                        @Override // com.google.android.gms.tasks.OnSuccessListener
                                        public final void onSuccess(Object obj) {
                                            Feedback_Activity.this.m140x69828117(radioButton, editText, editText2, (Void) obj);
                                        }
                                    });
                                    return;
                                }
                                Toast.makeText(this, "Write the feedback message before sending", 0).show();
                                editText2.requestFocus(editText2.getText().toString().length());
                                show_keyboard(this);
                                return;
                            }
                            Toast.makeText(this, "The phone number you entered is wrong", 0).show();
                            EditText editText3 = editText_phone;
                            editText3.requestFocus(editText3.getText().toString().length());
                            show_keyboard(this);
                            return;
                        }
                        Toast.makeText(this, "Write down the phone number before sending feedback", 0).show();
                        editText_phone.setText((CharSequence) null);
                        editText_phone.setEnabled(true);
                        EditText editText4 = editText_phone;
                        editText4.requestFocus(editText4.getText().toString().length());
                        show_keyboard(this);
                        return;
                    }
                    Toast.makeText(this, "The email address you entered is wrong", 0).show();
                    EditText editText5 = editText_email;
                    editText5.requestFocus(editText5.getText().toString().length());
                    show_keyboard(this);
                    return;
                }
                Toast.makeText(this, "Write an email before sending feedback", 0).show();
                EditText editText6 = editText_email;
                editText6.requestFocus(editText6.getText().toString().length());
                show_keyboard(this);
                return;
            }
            Toast.makeText(this, "Write your name before sending feedback", 0).show();
            editText.requestFocus(editText.getText().toString().length());
            show_keyboard(this);
            return;
        }
        no_connection();
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-qrbarcodescanner-Feedback_Activity, reason: not valid java name */
    /* synthetic */ void m140x69828117(RadioButton radioButton, EditText editText, EditText editText2, Void r4) {
        if (this.failed) {
            return;
        }
        feedback_success(radioButton.isChecked());
        editText.setText("");
        editText_email.setText("");
        if (editText_phone.isEnabled()) {
            editText_phone.setText("");
        }
        radioButton.setChecked(true);
        editText2.setText("");
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
        create.setMessage("There is no network connection");
        this.alertDialog_no_connection.setButton(-1, "Try again", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Feedback_Activity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Feedback_Activity.this.m139x99f9222e(dialogInterface, i);
            }
        });
        this.alertDialog_no_connection.setButton(-2, "Cancel", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Feedback_Activity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.alertDialog_no_connection.show();
    }

    /* renamed from: lambda$no_connection$4$com-neptunesoft-qrbarcodescanner-Feedback_Activity, reason: not valid java name */
    /* synthetic */ void m139x99f9222e(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (test_connection()) {
            ((Button) findViewById(R.id.btn_send_feedback)).callOnClick();
        } else {
            no_connection();
        }
    }

    private void feedback_success(boolean z) {
        this.handler.removeCallbacks(this.time_wait_out);
        close_dialog();
        hide_keyboard(this);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.alertDialog_feedback_success = create;
        create.setCancelable(false);
        if (z) {
            this.alertDialog_feedback_success.setMessage("The feedback was successfully submitted. We thank you for helping us improve the application content");
        } else {
            this.alertDialog_feedback_success.setMessage("The feedback was successfully sent. We apologize for any problem you encountered with the application. Keep an eye out for new updates, God willing.");
        }
        if (from_home) {
            this.alertDialog_feedback_success.setButton(-1, "Home page", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Feedback_Activity$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Feedback_Activity.this.m137x96f6aec5(dialogInterface, i);
                }
            });
        } else {
            this.alertDialog_feedback_success.setButton(-1, "About", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Feedback_Activity$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Feedback_Activity.this.m138xc4cf4924(dialogInterface, i);
                }
            });
        }
        this.alertDialog_feedback_success.show();
    }

    /* renamed from: lambda$feedback_success$6$com-neptunesoft-qrbarcodescanner-Feedback_Activity, reason: not valid java name */
    /* synthetic */ void m137x96f6aec5(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    /* renamed from: lambda$feedback_success$7$com-neptunesoft-qrbarcodescanner-Feedback_Activity, reason: not valid java name */
    /* synthetic */ void m138xc4cf4924(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void feedback_failure() {
        close_dialog();
        hide_keyboard(this);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.alertDialog_feedback_failure = create;
        create.setMessage("The feedback could not be sent, try again, or check your network connection");
        this.alertDialog_feedback_failure.setButton(-1, "Close", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Feedback_Activity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Feedback_Activity.this.m136x7295585c(dialogInterface, i);
            }
        });
        this.alertDialog_feedback_failure.show();
    }

    /* renamed from: lambda$feedback_failure$8$com-neptunesoft-qrbarcodescanner-Feedback_Activity, reason: not valid java name */
    /* synthetic */ void m136x7295585c(DialogInterface dialogInterface, int i) {
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
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.progressDialog_send_feedback.dismiss();
    }

    private void dialog_wait() {
        close_dialog();
        hide_keyboard(this);
        this.handler.postDelayed(this.time_wait_out, 1000L);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.progressDialog_send_feedback = progressDialog;
        progressDialog.setCancelable(false);
        this.progressDialog_send_feedback.show();
        this.progressDialog_send_feedback.setContentView(R.layout.layout_pdialog);
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
        super.onBackPressed();
        this.failed = true;
    }
}
