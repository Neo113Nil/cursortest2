package com.neptunesoft.gestionbacdz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.work.WorkRequest;
import com.neptunesoft.gestionbacdz.classobjects.Question;
import com.neptunesoft.gestionbacdz.database.QuizDbHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* loaded from: classes.dex */
public class QuizQuestionsActivity extends AppCompatActivity {
    private static final String KEY_ANSWERED = "keyAnswered";
    private static final String KEY_MILLIS_LEFT = "keymillisleft";
    private static final String KEY_QUESTION_COUNT = "keyscorecount";
    private static final String KEY_QUESTION_LIST = "keyquestionlist";
    private static final String KEY_SCORE = "keyscore";
    private static final long countDown = 30000;
    static boolean history;
    static int unit;
    AlertDialog alertDialog_close;
    private boolean answered;
    private ColorStateList colorStateListRadioButton;
    private ColorStateList colorStateListRadioButtonDefault;
    private CountDownTimer countDownTimer;
    private Question currentQuestion;
    LinearLayout lytOption1;
    LinearLayout lytOption2;
    LinearLayout lytOption3;
    LinearLayout lytOption4;
    Button nextQuiz;
    private ArrayList<Question> questionList;
    RadioButton radioOption1;
    RadioButton radioOption2;
    RadioButton radioOption3;
    RadioButton radioOption4;
    private int score;
    private long timeLeft;
    TextView txtIndexQst;
    TextView txtQst;
    TextView txtScore;
    TextView txtTime;
    TextView txtTitle;
    private int questionCounter = 0;
    private int questionCounterTotal = 10;
    Toast toast = null;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String str;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);
        this.txtTitle = (TextView) findViewById(R.id.txtTitle);
        this.txtScore = (TextView) findViewById(R.id.txtScore);
        this.txtIndexQst = (TextView) findViewById(R.id.txtIndexQst);
        this.txtTime = (TextView) findViewById(R.id.txtTime);
        this.txtQst = (TextView) findViewById(R.id.txtQst);
        this.radioOption1 = (RadioButton) findViewById(R.id.radioOption1);
        this.radioOption2 = (RadioButton) findViewById(R.id.radioOption2);
        this.radioOption3 = (RadioButton) findViewById(R.id.radioOption3);
        this.radioOption4 = (RadioButton) findViewById(R.id.radioOption4);
        this.lytOption1 = (LinearLayout) findViewById(R.id.lytOption1);
        this.lytOption2 = (LinearLayout) findViewById(R.id.lytOption2);
        this.lytOption3 = (LinearLayout) findViewById(R.id.lytOption3);
        this.lytOption4 = (LinearLayout) findViewById(R.id.lytOption4);
        this.nextQuiz = (Button) findViewById(R.id.nextQuiz);
        this.colorStateListRadioButton = this.radioOption1.getTextColors();
        this.colorStateListRadioButtonDefault = this.txtTime.getTextColors();
        if (history) {
            int i = unit;
            if (i == 1) {
                this.txtTitle.setText("تواريخ الوحدة 1");
            } else if (i == 2) {
                this.txtTitle.setText("تواريخ الوحدة 2");
            } else {
                this.txtTitle.setText("تواريخ الوحدة 3");
            }
        } else {
            int i2 = unit;
            if (i2 == 1) {
                this.txtTitle.setText("شخصيات الوحدة 1");
            } else if (i2 == 2) {
                this.txtTitle.setText("شخصيات الوحدة 2");
            } else {
                this.txtTitle.setText("شخصيات الوحدة 3");
            }
        }
        this.radioOption1.setChecked(false);
        this.radioOption2.setChecked(false);
        this.radioOption3.setChecked(false);
        this.radioOption4.setChecked(false);
        this.radioOption1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                QuizQuestionsActivity.this.m717x5b962049(compoundButton, z);
            }
        });
        this.radioOption2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                QuizQuestionsActivity.this.m718x896ebaa8(compoundButton, z);
            }
        });
        this.radioOption3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda9
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                QuizQuestionsActivity.this.m719xb7475507(compoundButton, z);
            }
        });
        this.radioOption4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda10
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                QuizQuestionsActivity.this.m720xe51fef66(compoundButton, z);
            }
        });
        this.lytOption1.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuizQuestionsActivity.this.m721x12f889c5(view);
            }
        });
        this.lytOption2.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuizQuestionsActivity.this.m722x40d12424(view);
            }
        });
        this.lytOption3.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuizQuestionsActivity.this.m723x6ea9be83(view);
            }
        });
        this.lytOption4.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuizQuestionsActivity.this.m724x9c8258e2(view);
            }
        });
        this.nextQuiz.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuizQuestionsActivity.this.m725xca5af341(view);
            }
        });
        if (savedInstanceState == null) {
            QuizDbHelper quizDbHelper = new QuizDbHelper(this);
            if (history) {
                str = "history";
            } else {
                str = "mujahid";
            }
            ArrayList<Question> allQuestion = quizDbHelper.getAllQuestion(unit, str);
            this.questionList = allQuestion;
            Collections.shuffle(allQuestion);
            showNextQuestion();
            return;
        }
        ArrayList<Question> parcelableArrayList = savedInstanceState.getParcelableArrayList(KEY_QUESTION_LIST);
        this.questionList = parcelableArrayList;
        if (parcelableArrayList == null) {
            finish();
        }
        this.questionCounterTotal = 10;
        int i3 = savedInstanceState.getInt(KEY_QUESTION_COUNT);
        this.questionCounter = i3;
        this.currentQuestion = this.questionList.get(i3 - 1);
        this.score = savedInstanceState.getInt(KEY_SCORE);
        this.timeLeft = savedInstanceState.getInt(KEY_MILLIS_LEFT);
        boolean z = savedInstanceState.getBoolean(KEY_ANSWERED);
        this.answered = z;
        if (!z) {
            startCountDown();
        } else {
            updateCountDownText();
            showSolution();
        }
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m717x5b962049(CompoundButton compoundButton, boolean z) {
        boolean isChecked = this.radioOption1.isChecked();
        if (!this.radioOption1.isChecked() || this.answered) {
            if (isChecked) {
                this.radioOption1.setChecked(false);
            }
        } else {
            this.radioOption2.setChecked(false);
            this.radioOption3.setChecked(false);
            this.radioOption4.setChecked(false);
        }
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m718x896ebaa8(CompoundButton compoundButton, boolean z) {
        boolean isChecked = this.radioOption2.isChecked();
        if (!this.radioOption2.isChecked() || this.answered) {
            if (isChecked) {
                this.radioOption2.setChecked(false);
            }
        } else {
            this.radioOption1.setChecked(false);
            this.radioOption3.setChecked(false);
            this.radioOption4.setChecked(false);
        }
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m719xb7475507(CompoundButton compoundButton, boolean z) {
        boolean isChecked = this.radioOption3.isChecked();
        if (!this.radioOption3.isChecked() || this.answered) {
            if (isChecked) {
                this.radioOption3.setChecked(false);
            }
        } else {
            this.radioOption1.setChecked(false);
            this.radioOption2.setChecked(false);
            this.radioOption4.setChecked(false);
        }
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m720xe51fef66(CompoundButton compoundButton, boolean z) {
        boolean isChecked = this.radioOption4.isChecked();
        if (!this.radioOption4.isChecked() || this.answered) {
            if (isChecked) {
                this.radioOption4.setChecked(false);
            }
        } else {
            this.radioOption1.setChecked(false);
            this.radioOption2.setChecked(false);
            this.radioOption3.setChecked(false);
        }
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m721x12f889c5(View view) {
        this.radioOption1.setChecked(true);
    }

    /* renamed from: lambda$onCreate$5$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m722x40d12424(View view) {
        this.radioOption2.setChecked(true);
    }

    /* renamed from: lambda$onCreate$6$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m723x6ea9be83(View view) {
        this.radioOption3.setChecked(true);
    }

    /* renamed from: lambda$onCreate$7$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m724x9c8258e2(View view) {
        this.radioOption4.setChecked(true);
    }

    /* renamed from: lambda$onCreate$8$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m725xca5af341(View view) {
        if (!this.answered) {
            if (this.radioOption1.isChecked() || this.radioOption2.isChecked() || this.radioOption3.isChecked() || this.radioOption4.isChecked()) {
                checkAnsewer();
                return;
            }
            Toast toast = this.toast;
            if (toast != null) {
                toast.cancel();
            }
            Toast makeText = Toast.makeText(this, "قم بتحديد الإجابة !.", 0);
            this.toast = makeText;
            makeText.show();
            return;
        }
        showNextQuestion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAnsewer() {
        int i;
        this.answered = true;
        this.countDownTimer.cancel();
        if (this.radioOption1.isChecked()) {
            i = 1;
        } else if (this.radioOption2.isChecked()) {
            i = 2;
        } else {
            i = this.radioOption3.isChecked() ? 3 : 4;
        }
        if (i == this.currentQuestion.getAnsewer()) {
            this.score++;
            this.txtScore.setText("مجموع النقاط : " + this.score);
        }
        showSolution();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006f, code lost:
    
        if (r8.radioOption4.isChecked() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r8.radioOption3.isChecked() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        if (r8.radioOption2.isChecked() != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showSolution() {
        String charSequence;
        String str;
        this.radioOption1.setTextColor(Color.parseColor("#FF3E41"));
        this.radioOption2.setTextColor(Color.parseColor("#FF3E41"));
        this.radioOption3.setTextColor(Color.parseColor("#FF3E41"));
        this.radioOption4.setTextColor(Color.parseColor("#FF3E41"));
        int ansewer = this.currentQuestion.getAnsewer();
        int i = 2;
        if (ansewer != 2) {
            i = 3;
            if (ansewer != 3) {
                i = 4;
                if (ansewer == 4) {
                    this.radioOption4.setTextColor(Color.parseColor("#06D6A0"));
                    charSequence = this.radioOption4.getText().toString();
                } else {
                    this.radioOption1.setTextColor(Color.parseColor("#06D6A0"));
                    charSequence = this.radioOption1.getText().toString();
                    if (this.radioOption1.isChecked()) {
                        i = 1;
                    }
                    i = 0;
                }
            } else {
                this.radioOption3.setTextColor(Color.parseColor("#06D6A0"));
                charSequence = this.radioOption3.getText().toString();
            }
        } else {
            this.radioOption2.setTextColor(Color.parseColor("#06D6A0"));
            charSequence = this.radioOption2.getText().toString();
        }
        if (this.questionCounter < this.questionCounterTotal) {
            this.nextQuiz.setText("التالي");
        } else {
            this.nextQuiz.setText("رجوع");
            this.questionCounter++;
            final AlertDialog create = new AlertDialog.Builder(this).create();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    QuizQuestionsActivity.this.m727x4519cf25(create, dialogInterface);
                }
            });
            String str2 = "مجموع النقاط المتحصل عليها : " + this.score + " من 10\n";
            switch (this.score) {
                case 3:
                case 4:
                    str = str2 + "بإمكانك تحقيق نتيجة أفضل عن طريق الإجتهاد.";
                    break;
                case 5:
                case 6:
                    str = str2 + "متوسط على العموم, يمكنك الحصول على نتيجة أفضل.";
                    break;
                case 7:
                case 8:
                    str = str2 + "جيد, تذكر أن هذا الإختبار لا يكفي لتقييم حفظك في مادة التاريخ.";
                    break;
                case 9:
                    str = str2 + "جيد جدا, تذكر أن هذا الإختبار لا يكفي لتقييم حفظك في مادة التاريخ.";
                    break;
                case 10:
                    str = str2 + "ممتاز, تذكر أن هذا الإختبار لا يكفي لتقييم حفظك في مادة التاريخ.";
                    break;
                default:
                    str = str2 + "عليك بالإهتمام أكثر في مادة التاريخ.";
                    break;
            }
            create.setMessage(str);
            create.setButton(-2, "غلق", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    QuizQuestionsActivity.this.m726xcfa64c3d(dialogInterface, i2);
                }
            });
            create.show();
        }
        Toast toast = this.toast;
        if (toast != null) {
            toast.cancel();
        }
        if (this.radioOption1.isChecked() || this.radioOption2.isChecked() || this.radioOption3.isChecked() || this.radioOption4.isChecked()) {
            if (this.currentQuestion.getAnsewer() == i) {
                this.toast = Toast.makeText(this, "إجابتك صحيحة", 0);
            } else {
                this.toast = Toast.makeText(this, "للأسف إجابتك خاطئة, الإجابة الصحيحة هي : " + charSequence, 1);
            }
        } else {
            this.toast = Toast.makeText(this, "للأسف أنت لم تجب على السؤال, الإجابة هي : " + charSequence, 1);
        }
        this.toast.show();
    }

    /* renamed from: lambda$showSolution$9$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m727x4519cf25(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$showSolution$10$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m726xcfa64c3d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        super.onBackPressed();
        finishQuiz();
    }

    private void showNextQuestion() {
        this.radioOption1.setTextColor(this.colorStateListRadioButton);
        this.radioOption2.setTextColor(this.colorStateListRadioButton);
        this.radioOption3.setTextColor(this.colorStateListRadioButton);
        this.radioOption4.setTextColor(this.colorStateListRadioButton);
        this.radioOption1.setChecked(false);
        this.radioOption2.setChecked(false);
        this.radioOption3.setChecked(false);
        this.radioOption4.setChecked(false);
        int i = this.questionCounter;
        if (i < this.questionCounterTotal) {
            Question question = this.questionList.get(i);
            this.currentQuestion = question;
            this.txtQst.setText(question.getQuestion());
            this.radioOption1.setText(this.currentQuestion.getOption1());
            this.radioOption2.setText(this.currentQuestion.getOption2());
            this.radioOption3.setText(this.currentQuestion.getOption3());
            this.radioOption4.setText(this.currentQuestion.getOption4());
            this.questionCounter++;
            this.txtIndexQst.setText("السؤال " + this.questionCounter + " من " + this.questionCounterTotal);
            this.answered = false;
            this.nextQuiz.setText("تحقق");
            this.timeLeft = 30000L;
            startCountDown();
            return;
        }
        finishQuiz();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.neptunesoft.gestionbacdz.QuizQuestionsActivity$1] */
    private void startCountDown() {
        this.countDownTimer = new CountDownTimer(this.timeLeft, 1000L) { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity.1
            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                QuizQuestionsActivity.this.timeLeft = millisUntilFinished;
                QuizQuestionsActivity.this.updateCountDownText();
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                QuizQuestionsActivity.this.timeLeft = 0L;
                QuizQuestionsActivity.this.updateCountDownText();
                QuizQuestionsActivity.this.checkAnsewer();
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCountDownText() {
        AlertDialog alertDialog;
        long j = this.timeLeft;
        this.txtTime.setText(String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(((int) (j / 1000)) / 60), Integer.valueOf(((int) (j / 1000)) % 60)));
        if (this.timeLeft < WorkRequest.MIN_BACKOFF_MILLIS) {
            this.txtTime.setTextColor(Color.parseColor("#FF3E41"));
            if (this.timeLeft == 0 && (alertDialog = this.alertDialog_close) != null && alertDialog.isShowing()) {
                this.alertDialog_close.dismiss();
                return;
            }
            return;
        }
        this.txtTime.setTextColor(this.colorStateListRadioButtonDefault);
    }

    private void finishQuiz() {
        Toast toast = this.toast;
        if (toast != null) {
            toast.cancel();
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.questionCounter <= this.questionCounterTotal) {
            AlertDialog create = new AlertDialog.Builder(this).create();
            this.alertDialog_close = create;
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    QuizQuestionsActivity.this.m715xc773b808(dialogInterface);
                }
            });
            this.alertDialog_close.setMessage("هل تريد إنهاء هذا الإختبار ؟.");
            this.alertDialog_close.setButton(-1, "إنهاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    QuizQuestionsActivity.this.m716xf54c5267(dialogInterface, i);
                }
            });
            this.alertDialog_close.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizQuestionsActivity$$ExternalSyntheticLambda6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            this.alertDialog_close.show();
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: lambda$onBackPressed$11$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m715xc773b808(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.alertDialog_close.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.alertDialog_close.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$onBackPressed$12$com-neptunesoft-gestionbacdz-QuizQuestionsActivity, reason: not valid java name */
    /* synthetic */ void m716xf54c5267(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        super.onBackPressed();
        finishQuiz();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_SCORE, this.score);
        outState.putInt(KEY_QUESTION_COUNT, this.questionCounter);
        outState.putLong(KEY_MILLIS_LEFT, this.timeLeft);
        outState.putBoolean(KEY_ANSWERED, this.answered);
        outState.putParcelableArrayList(KEY_QUESTION_LIST, this.questionList);
    }
}
