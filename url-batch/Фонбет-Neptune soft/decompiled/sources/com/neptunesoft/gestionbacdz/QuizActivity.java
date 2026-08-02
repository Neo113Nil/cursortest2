package com.neptunesoft.gestionbacdz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.neptunesoft.gestionbacdz.adapter.QuizAdapter;
import com.neptunesoft.gestionbacdz.classobjects.Quiz;
import com.neptunesoft.gestionbacdz.listeners.QuizListener;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class QuizActivity extends AppCompatActivity implements QuizListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    AlertDialog dialogChoiceQuiz;
    InterstitialAd mInterstitialAd;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.neptunesoft.gestionbacdz.QuizActivity$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                QuizActivity.this.m711lambda$onCreate$0$comneptunesoftgestionbacdzQuizActivity(initializationStatus);
            }
        });
        loadAdMobInterstitialAds();
        setContentView(R.layout.activity_quiz);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Quiz("شخصيات"));
        arrayList.add(new Quiz("تواريخ"));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.quizRecyclerView);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        QuizAdapter quizAdapter = new QuizAdapter(arrayList, this, this);
        recyclerView.setAdapter(quizAdapter);
        quizAdapter.notifyDataSetChanged();
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-QuizActivity, reason: not valid java name */
    /* synthetic */ void m711lambda$onCreate$0$comneptunesoftgestionbacdzQuizActivity(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
        loadAdMobInterstitialAds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdMobInterstitialAds() {
        InterstitialAd.load(this, getString(R.string.Interstitial_Quiz_UnitId), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.neptunesoft.gestionbacdz.QuizActivity.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                QuizActivity.this.mInterstitialAd = interstitialAd;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                QuizActivity.this.mInterstitialAd = null;
            }
        });
    }

    public void showInterstitialAds(final Intent intent) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this);
            this.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.neptunesoft.gestionbacdz.QuizActivity.2
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    QuizActivity.this.mInterstitialAd = null;
                    QuizActivity.this.loadAdMobInterstitialAds();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    QuizActivity.this.startActivity(intent);
                }
            });
        } else {
            startActivity(intent);
            loadAdMobInterstitialAds();
        }
    }

    @Override // com.neptunesoft.gestionbacdz.listeners.QuizListener
    public void onQuizClick(final Quiz quiz, int position) {
        this.dialogChoiceQuiz = new AlertDialog.Builder(this).create();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = LayoutInflater.from(this).inflate(R.layout.layout_choice_quiz, (ViewGroup) findViewById(R.id.layoutChoiceQuiz));
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.dialogChoiceQuiz = create;
        create.setMessage("إختر الوحدة");
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.lytUnit1);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.lytUnit2);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R.id.lytUnit3);
        final RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.radioUnit1);
        final RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.radioUnit2);
        final RadioButton radioButton3 = (RadioButton) inflate.findViewById(R.id.radioUnit3);
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.gestionbacdz.QuizActivity$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                QuizActivity.lambda$onQuizClick$1(radioButton, radioButton2, radioButton3, compoundButton, z);
            }
        });
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.gestionbacdz.QuizActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                QuizActivity.lambda$onQuizClick$2(radioButton2, radioButton, radioButton3, compoundButton, z);
            }
        });
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.gestionbacdz.QuizActivity$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                QuizActivity.lambda$onQuizClick$3(radioButton3, radioButton, radioButton2, compoundButton, z);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                radioButton.setChecked(true);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                radioButton2.setChecked(true);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                radioButton3.setChecked(true);
            }
        });
        this.dialogChoiceQuiz.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.QuizActivity$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                QuizActivity.this.m712lambda$onQuizClick$7$comneptunesoftgestionbacdzQuizActivity(dialogInterface);
            }
        });
        this.dialogChoiceQuiz.setButton(-1, "إبدأ", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                QuizActivity.this.m713lambda$onQuizClick$8$comneptunesoftgestionbacdzQuizActivity(quiz, radioButton, radioButton2, dialogInterface, i);
            }
        });
        this.dialogChoiceQuiz.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.QuizActivity$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                QuizActivity.this.m714lambda$onQuizClick$9$comneptunesoftgestionbacdzQuizActivity(dialogInterface, i);
            }
        });
        this.dialogChoiceQuiz.show();
    }

    static /* synthetic */ void lambda$onQuizClick$1(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (radioButton.isChecked()) {
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    static /* synthetic */ void lambda$onQuizClick$2(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (radioButton.isChecked()) {
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    static /* synthetic */ void lambda$onQuizClick$3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (radioButton.isChecked()) {
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* renamed from: lambda$onQuizClick$7$com-neptunesoft-gestionbacdz-QuizActivity, reason: not valid java name */
    /* synthetic */ void m712lambda$onQuizClick$7$comneptunesoftgestionbacdzQuizActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialogChoiceQuiz.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.dialogChoiceQuiz.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$onQuizClick$8$com-neptunesoft-gestionbacdz-QuizActivity, reason: not valid java name */
    /* synthetic */ void m713lambda$onQuizClick$8$comneptunesoftgestionbacdzQuizActivity(Quiz quiz, RadioButton radioButton, RadioButton radioButton2, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this, (Class<?>) QuizQuestionsActivity.class);
        QuizQuestionsActivity.history = !quiz.getTitle().equals("شخصيات");
        if (radioButton.isChecked()) {
            QuizQuestionsActivity.unit = 1;
        } else if (radioButton2.isChecked()) {
            QuizQuestionsActivity.unit = 2;
        } else {
            QuizQuestionsActivity.unit = 3;
        }
        showInterstitialAds(intent);
    }

    /* renamed from: lambda$onQuizClick$9$com-neptunesoft-gestionbacdz-QuizActivity, reason: not valid java name */
    /* synthetic */ void m714lambda$onQuizClick$9$comneptunesoftgestionbacdzQuizActivity(DialogInterface dialogInterface, int i) {
        this.dialogChoiceQuiz.dismiss();
    }
}
