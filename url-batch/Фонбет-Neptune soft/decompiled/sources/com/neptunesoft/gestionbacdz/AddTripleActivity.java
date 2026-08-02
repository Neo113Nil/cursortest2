package com.neptunesoft.gestionbacdz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.neptunesoft.gestionbacdz.classobjects.Mark;
import com.neptunesoft.gestionbacdz.classobjects.Triple;
import com.neptunesoft.gestionbacdz.database.DataBaseMarks;

/* loaded from: classes.dex */
public class AddTripleActivity extends AppCompatActivity {
    Button btnSave;
    CheckBox checkboxAmazight;
    CheckBox checkboxSport;
    DataBaseMarks dataBaseMarks = new DataBaseMarks(this, SplashScreen.darkmode);
    EditText editTextFullName;
    ImageView imageViewAddTriple;
    Spinner spinnerTriple;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_triple);
        this.spinnerTriple = (Spinner) findViewById(R.id.spinnerTriple);
        this.imageViewAddTriple = (ImageView) findViewById(R.id.imageViewAddTriple);
        this.editTextFullName = (EditText) findViewById(R.id.editTextFullName);
        this.checkboxSport = (CheckBox) findViewById(R.id.checkboxSport);
        this.checkboxAmazight = (CheckBox) findViewById(R.id.checkboxAmazight);
        this.btnSave = (Button) findViewById(R.id.btnSave);
        refreshUI();
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, R.array.triple, R.layout.text_spinner_centre);
        createFromResource.setDropDownViewResource(R.layout.text_spinner_centre);
        this.spinnerTriple.setAdapter((SpinnerAdapter) createFromResource);
        this.spinnerTriple.setGravity(17);
        this.spinnerTriple.setSelection(createFromResource.getPosition("الأول"));
        this.btnSave.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AddTripleActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddTripleActivity.this.m512lambda$onCreate$0$comneptunesoftgestionbacdzAddTripleActivity(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-AddTripleActivity, reason: not valid java name */
    /* synthetic */ void m512lambda$onCreate$0$comneptunesoftgestionbacdzAddTripleActivity(View view) {
        if (this.editTextFullName.getText().toString().equals("")) {
            Toast.makeText(this, "قم بكتابة الإسم الكامل قبل حفظ المعلومات", 0).show();
            EditText editText = this.editTextFullName;
            editText.requestFocus(editText.getText().toString().length());
            show_keyboard(this);
            return;
        }
        if (this.dataBaseMarks.checkTripleFullName(this.spinnerTriple.getSelectedItemPosition() + 1, this.editTextFullName.getText().toString())) {
            Toast.makeText(this, "عذرا لقد قمت بإضافة نفس الثلاثي إلى نفس الشخص مسبقا, قم بإدخال إسم جديد أو إختر ثلاثي آخر.", 0).show();
            return;
        }
        if (!this.dataBaseMarks.insertTriple(new Triple(-1, this.spinnerTriple.getSelectedItemPosition() + 1, this.editTextFullName.getText().toString(), this.checkboxSport.isChecked(), this.checkboxAmazight.isChecked()))) {
            Toast.makeText(this, "هنالك خطأ ما !.", 0).show();
            return;
        }
        try {
            Triple lastTriple = this.dataBaseMarks.getLastTriple();
            this.dataBaseMarks.insertMark(new Mark(-1, "التسيير المحاسبي و المالي", 0.0d, 0.0d, 0.0d, 6, lastTriple.getId_triple(), SplashScreen.darkmode));
            this.dataBaseMarks.insertMark(new Mark(-1, "الإقتصاد و المناجمنت", 0.0d, 0.0d, 0.0d, 5, lastTriple.getId_triple(), SplashScreen.darkmode));
            this.dataBaseMarks.insertMark(new Mark(-1, "رياضيات", 0.0d, 0.0d, 0.0d, 5, lastTriple.getId_triple(), SplashScreen.darkmode));
            this.dataBaseMarks.insertMark(new Mark(-1, "إجتماعيات", 0.0d, 0.0d, 0.0d, 4, lastTriple.getId_triple(), SplashScreen.darkmode));
            this.dataBaseMarks.insertMark(new Mark(-1, "ل.عربية", 0.0d, 0.0d, 0.0d, 3, lastTriple.getId_triple(), SplashScreen.darkmode));
            this.dataBaseMarks.insertMark(new Mark(-1, "القانون", 0.0d, 0.0d, 0.0d, 2, lastTriple.getId_triple(), SplashScreen.darkmode));
            this.dataBaseMarks.insertMark(new Mark(-1, "ع.إسلامية", 0.0d, 0.0d, 0.0d, 2, lastTriple.getId_triple(), SplashScreen.darkmode));
            this.dataBaseMarks.insertMark(new Mark(-1, "فلسفة", 0.0d, 0.0d, 0.0d, 2, lastTriple.getId_triple(), SplashScreen.darkmode));
            this.dataBaseMarks.insertMark(new Mark(-1, "ل.إنجليزية", 0.0d, 0.0d, 0.0d, 2, lastTriple.getId_triple(), SplashScreen.darkmode));
            this.dataBaseMarks.insertMark(new Mark(-1, "ل.فرنسية", 0.0d, 0.0d, 0.0d, 2, lastTriple.getId_triple(), SplashScreen.darkmode));
            if (lastTriple.isAmazight()) {
                this.dataBaseMarks.insertMark(new Mark(-1, "ل.أمازيغية", 0.0d, 0.0d, 0.0d, 2, lastTriple.getId_triple(), SplashScreen.darkmode));
            }
            if (lastTriple.isSport()) {
                this.dataBaseMarks.insertMark(new Mark(-1, "ت.بدنية", 0.0d, 0.0d, 0.0d, 1, lastTriple.getId_triple(), SplashScreen.darkmode));
            }
            Toast.makeText(this, "تمت عملية الإضافة بنجاح", 0).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "حدث خطأ ما أثناء إضافة المواد إلى قاعدة البيانات !.", 0).show();
        }
        finish();
        AvgActivity.refreshRecycleView(this);
    }

    public static void show_keyboard(Activity activity) {
        ((InputMethodManager) activity.getSystemService("input_method")).toggleSoftInput(0, 1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.editTextFullName.getText().toString().equals("") && !this.checkboxAmazight.isChecked() && this.checkboxSport.isChecked() && this.spinnerTriple.getSelectedItemPosition() == 0) {
            super.onBackPressed();
            return;
        }
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.AddTripleActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AddTripleActivity.this.m510xc72ff928(create, dialogInterface);
            }
        });
        create.setMessage("عند غلق هذه الواجهة سيتم مسح جميع المعلومات التي قمت بإدخالها, هل تريد تجاهل هذه العملية ؟.");
        create.setButton(-1, "تجاهل", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AddTripleActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AddTripleActivity.this.m511xfa9b07(dialogInterface, i);
            }
        });
        create.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AddTripleActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$onBackPressed$1$com-neptunesoft-gestionbacdz-AddTripleActivity, reason: not valid java name */
    /* synthetic */ void m510xc72ff928(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$onBackPressed$2$com-neptunesoft-gestionbacdz-AddTripleActivity, reason: not valid java name */
    /* synthetic */ void m511xfa9b07(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        super.onBackPressed();
        finish();
    }

    void refreshUI() {
        this.editTextFullName.setElevation(10.0f);
        this.spinnerTriple.setElevation(10.0f);
        if (SplashScreen.darkmode) {
            this.imageViewAddTriple.setImageResource(R.drawable.ic_add_triple_dark);
            this.editTextFullName.setBackgroundResource(R.drawable.background_edittext_dark);
            this.spinnerTriple.setBackgroundResource(R.drawable.background_edittext_dark);
        } else {
            this.imageViewAddTriple.setImageResource(R.drawable.ic_add_triple);
            this.editTextFullName.setBackgroundResource(R.drawable.background_edittext);
            this.spinnerTriple.setBackgroundResource(R.drawable.background_edittext);
        }
    }
}
