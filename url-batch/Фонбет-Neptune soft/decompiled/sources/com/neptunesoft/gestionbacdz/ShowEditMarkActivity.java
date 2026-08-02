package com.neptunesoft.gestionbacdz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.neptunesoft.gestionbacdz.classobjects.Mark;
import com.neptunesoft.gestionbacdz.database.DataBaseMarks;
import java.util.Locale;

/* loaded from: classes.dex */
public class ShowEditMarkActivity extends AppCompatActivity {
    static Mark mark;
    Button btnEditSave;
    boolean edit = false;
    EditText editTextArticle;
    EditText editTextAssumption;
    EditText editTextBehavior;
    EditText editTextFactor;
    EditText editTextTest;
    ImageView imageViewShowEditMark;
    TextView txtTitle;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_edit_mark);
        this.txtTitle = (TextView) findViewById(R.id.txtTitle);
        this.imageViewShowEditMark = (ImageView) findViewById(R.id.imageViewShowEditMark);
        this.editTextArticle = (EditText) findViewById(R.id.editTextArticle);
        this.editTextFactor = (EditText) findViewById(R.id.editTextFactor);
        this.editTextBehavior = (EditText) findViewById(R.id.editTextBehavior);
        this.editTextAssumption = (EditText) findViewById(R.id.editTextAssumption);
        this.editTextTest = (EditText) findViewById(R.id.editTextTest);
        this.btnEditSave = (Button) findViewById(R.id.btnEditSave);
        String article = mark.getArticle();
        article.hashCode();
        switch (article) {
            case "رياضيات":
                this.txtTitle.setText("مادة الرياضيات");
                break;
            case "ت.بدنية":
                this.txtTitle.setText("مادة التربية البدنية");
                break;
            case "ع.فيزيائية":
                this.txtTitle.setText("مادة العلوم الفيزيائية");
                break;
            case "ل.عربية":
                this.txtTitle.setText("مادة اللغة العربية");
                break;
            case "ل.أمازيغية":
                this.txtTitle.setText("مادة اللغة الأمازيغية");
                break;
            case "ع.إسلامية":
                this.txtTitle.setText("مادة العلوم الإسلامية");
                break;
            case "إجتماعيات":
                this.txtTitle.setText("مادة الإجتماعيات");
                break;
            case "ل.إنجليزية":
                this.txtTitle.setText("مادة اللغة الإنجليزية");
                break;
            case "فلسفة":
                this.txtTitle.setText("مادة الفلسفة");
                break;
            case "ل.فرنسية":
                this.txtTitle.setText("مادة اللغة الفرنسية");
                break;
            default:
                this.txtTitle.setText("مادة العلوم الطبيعية");
                break;
        }
        this.editTextArticle.setText(mark.getArticle());
        this.editTextFactor.setText(Integer.toString(mark.getFactor()));
        this.editTextBehavior.setText(Double.toString(mark.getBehavior()));
        this.editTextAssumption.setText(Double.toString(mark.getAssumption()));
        this.editTextTest.setText(Double.toString(mark.getTest()));
        refreshUI();
        this.btnEditSave.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.ShowEditMarkActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShowEditMarkActivity.this.m730x44ba3a61(view);
            }
        });
        this.editTextTest.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.neptunesoft.gestionbacdz.ShowEditMarkActivity$$ExternalSyntheticLambda1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ShowEditMarkActivity.this.m731x88455822(textView, i, keyEvent);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-ShowEditMarkActivity, reason: not valid java name */
    /* synthetic */ void m730x44ba3a61(View view) {
        if (!this.edit) {
            this.edit = true;
            this.editTextBehavior.setEnabled(true);
            this.editTextAssumption.setEnabled(true);
            this.editTextTest.setEnabled(true);
            this.btnEditSave.setText("حفظ");
            EditText editText = this.editTextBehavior;
            editText.requestFocus(editText.getText().toString().length());
            show_keyboard(this);
            return;
        }
        if (this.editTextBehavior.getText().toString().equals("")) {
            Toast.makeText(this, "قم بإدخال علامة التقويم قبل حفظ التعديل", 0).show();
            EditText editText2 = this.editTextBehavior;
            editText2.requestFocus(editText2.getText().toString().length());
            show_keyboard(this);
            return;
        }
        try {
            float parseFloat = Float.parseFloat(String.format(Locale.ENGLISH, "%.02f", Float.valueOf(Float.parseFloat(this.editTextBehavior.getText().toString()))));
            if (parseFloat > 20.0f || parseFloat < 0.0f) {
                Toast.makeText(this, "قيمة التقويم محصورة بين 0 و 20 !.", 0).show();
                EditText editText3 = this.editTextBehavior;
                editText3.requestFocus(editText3.getText().toString().length());
                show_keyboard(this);
            } else if (this.editTextAssumption.getText().toString().equals("")) {
                Toast.makeText(this, "قم بإدخال علامة الفرض الأول + الفرض الثاني قبل حفظ التعديل", 0).show();
                EditText editText4 = this.editTextAssumption;
                editText4.requestFocus(editText4.getText().toString().length());
                show_keyboard(this);
            } else {
                try {
                    float parseFloat2 = Float.parseFloat(String.format(Locale.ENGLISH, "%.02f", Float.valueOf(Float.parseFloat(this.editTextAssumption.getText().toString()))));
                    if (parseFloat2 > 20.0f || parseFloat2 < 0.0f) {
                        Toast.makeText(this, "قيمة الفرض الأول + الفرض الثاني محصورة بين 0 و 20 !.", 0).show();
                        EditText editText5 = this.editTextAssumption;
                        editText5.requestFocus(editText5.getText().toString().length());
                        show_keyboard(this);
                    } else if (this.editTextTest.getText().toString().equals("")) {
                        Toast.makeText(this, "قم بإدخال علامة الإختبار قبل حفظ التعديل", 0).show();
                        EditText editText6 = this.editTextTest;
                        editText6.requestFocus(editText6.getText().toString().length());
                        show_keyboard(this);
                    } else {
                        try {
                            float parseFloat3 = Float.parseFloat(String.format(Locale.ENGLISH, "%.02f", Float.valueOf(Float.parseFloat(this.editTextTest.getText().toString()))));
                            if (parseFloat3 > 20.0f || parseFloat3 < 0.0f) {
                                Toast.makeText(this, "قيمة الإختبار محصورة بين 0 و 20 !.", 0).show();
                                EditText editText7 = this.editTextTest;
                                editText7.requestFocus(editText7.getText().toString().length());
                                show_keyboard(this);
                            } else {
                                new DataBaseMarks(this, SplashScreen.darkmode).updateMark(new Mark(mark.getId_mark(), null, parseFloat, parseFloat2, parseFloat3, -1, -1, SplashScreen.darkmode));
                                Toast.makeText(this, "تمت عملية حفظ التعديل بنجاح", 0).show();
                                ListMarksActivity.refreshRecycleView(this);
                                finish();
                            }
                        } catch (Exception unused) {
                            Toast.makeText(this, "قيمة الإختبار التي أدخلتها غير صحيحة !.", 0).show();
                            EditText editText8 = this.editTextTest;
                            editText8.requestFocus(editText8.getText().toString().length());
                            show_keyboard(this);
                        }
                    }
                } catch (Exception unused2) {
                    Toast.makeText(this, "قيمة الفرض الأول + الفرض الثاني التي أدخلتها غير صحيحة !.", 0).show();
                    EditText editText9 = this.editTextAssumption;
                    editText9.requestFocus(editText9.getText().toString().length());
                    show_keyboard(this);
                }
            }
        } catch (Exception unused3) {
            Toast.makeText(this, "قيمة التقويم التي أدخلتها غير صحيحة !.", 0).show();
            EditText editText10 = this.editTextBehavior;
            editText10.requestFocus(editText10.getText().toString().length());
            show_keyboard(this);
        }
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-gestionbacdz-ShowEditMarkActivity, reason: not valid java name */
    /* synthetic */ boolean m731x88455822(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.btnEditSave.callOnClick();
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.edit) {
            super.onBackPressed();
            return;
        }
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.ShowEditMarkActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ShowEditMarkActivity.this.m728xab9bac2a(create, dialogInterface);
            }
        });
        create.setMessage("هل تريد تجاهل عملية التعديل ؟.");
        create.setButton(-1, "تجاهل", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.ShowEditMarkActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ShowEditMarkActivity.this.m729xef26c9eb(dialogInterface, i);
            }
        });
        create.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.ShowEditMarkActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$onBackPressed$2$com-neptunesoft-gestionbacdz-ShowEditMarkActivity, reason: not valid java name */
    /* synthetic */ void m728xab9bac2a(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$onBackPressed$3$com-neptunesoft-gestionbacdz-ShowEditMarkActivity, reason: not valid java name */
    /* synthetic */ void m729xef26c9eb(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        super.onBackPressed();
        finish();
    }

    void refreshUI() {
        this.editTextArticle.setElevation(10.0f);
        this.editTextAssumption.setElevation(10.0f);
        this.editTextBehavior.setElevation(10.0f);
        this.editTextFactor.setElevation(10.0f);
        this.editTextTest.setElevation(10.0f);
        if (SplashScreen.darkmode) {
            this.imageViewShowEditMark.setImageResource(R.drawable.ic_showeditmarks_dark);
            this.editTextArticle.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editTextAssumption.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editTextBehavior.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editTextFactor.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editTextTest.setBackgroundResource(R.drawable.background_edittext_dark);
            return;
        }
        this.imageViewShowEditMark.setImageResource(R.drawable.ic_showeditmarks);
        this.editTextArticle.setBackgroundResource(R.drawable.background_edittext);
        this.editTextAssumption.setBackgroundResource(R.drawable.background_edittext);
        this.editTextBehavior.setBackgroundResource(R.drawable.background_edittext);
        this.editTextFactor.setBackgroundResource(R.drawable.background_edittext);
        this.editTextTest.setBackgroundResource(R.drawable.background_edittext);
    }

    public static void show_keyboard(Activity activity) {
        ((InputMethodManager) activity.getSystemService("input_method")).toggleSoftInput(0, 1);
    }
}
