package com.neptunesoft.gestionbacdz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

/* loaded from: classes.dex */
public class CoursActivity extends AppCompatActivity {
    CardView cv_accounting;
    CardView cv_arabic;
    CardView cv_economics;
    CardView cv_en;
    CardView cv_fr;
    CardView cv_his_geo;
    CardView cv_islamique;
    CardView cv_law;
    CardView cv_math;
    CardView cv_philo;
    LinearLayout lyt_accounting;
    LinearLayout lyt_arabic;
    LinearLayout lyt_economics;
    LinearLayout lyt_en;
    LinearLayout lyt_fr;
    LinearLayout lyt_his_geo;
    LinearLayout lyt_islamique;
    LinearLayout lyt_law;
    LinearLayout lyt_math;
    LinearLayout lyt_philo;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours);
        this.cv_accounting = (CardView) findViewById(R.id.cv_accounting);
        this.cv_economics = (CardView) findViewById(R.id.cv_economics);
        this.cv_math = (CardView) findViewById(R.id.cv_math);
        this.cv_his_geo = (CardView) findViewById(R.id.cv_his_geo);
        this.cv_arabic = (CardView) findViewById(R.id.cv_arabic);
        this.cv_law = (CardView) findViewById(R.id.cv_law);
        this.cv_islamique = (CardView) findViewById(R.id.cv_islamique);
        this.cv_philo = (CardView) findViewById(R.id.cv_philo);
        this.cv_en = (CardView) findViewById(R.id.cv_en);
        this.cv_fr = (CardView) findViewById(R.id.cv_fr);
        this.lyt_accounting = (LinearLayout) findViewById(R.id.lyt_accounting);
        this.lyt_economics = (LinearLayout) findViewById(R.id.lyt_economics);
        this.lyt_math = (LinearLayout) findViewById(R.id.lyt_math);
        this.lyt_arabic = (LinearLayout) findViewById(R.id.lyt_arabic);
        this.lyt_islamique = (LinearLayout) findViewById(R.id.lyt_islamique);
        this.lyt_law = (LinearLayout) findViewById(R.id.lyt_law);
        this.lyt_his_geo = (LinearLayout) findViewById(R.id.lyt_his_geo);
        this.lyt_en = (LinearLayout) findViewById(R.id.lyt_en);
        this.lyt_philo = (LinearLayout) findViewById(R.id.lyt_philo);
        this.lyt_fr = (LinearLayout) findViewById(R.id.lyt_fr);
        this.cv_accounting.setCardElevation(10.0f);
        this.cv_economics.setCardElevation(10.0f);
        this.cv_math.setCardElevation(10.0f);
        this.cv_his_geo.setCardElevation(10.0f);
        this.cv_arabic.setCardElevation(10.0f);
        this.cv_law.setCardElevation(10.0f);
        this.cv_islamique.setCardElevation(10.0f);
        this.cv_philo.setCardElevation(10.0f);
        this.cv_en.setCardElevation(10.0f);
        this.cv_fr.setCardElevation(10.0f);
        this.lyt_accounting.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CoursActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m525lambda$onCreate$0$comneptunesoftgestionbacdzCoursActivity(view);
            }
        });
        this.lyt_economics.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CoursActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m526lambda$onCreate$1$comneptunesoftgestionbacdzCoursActivity(view);
            }
        });
        this.lyt_math.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CoursActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m527lambda$onCreate$2$comneptunesoftgestionbacdzCoursActivity(view);
            }
        });
        this.lyt_his_geo.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CoursActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m528lambda$onCreate$3$comneptunesoftgestionbacdzCoursActivity(view);
            }
        });
        this.lyt_arabic.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CoursActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m529lambda$onCreate$4$comneptunesoftgestionbacdzCoursActivity(view);
            }
        });
        this.lyt_law.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CoursActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m530lambda$onCreate$5$comneptunesoftgestionbacdzCoursActivity(view);
            }
        });
        this.lyt_islamique.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CoursActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m531lambda$onCreate$6$comneptunesoftgestionbacdzCoursActivity(view);
            }
        });
        this.lyt_philo.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CoursActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m532lambda$onCreate$7$comneptunesoftgestionbacdzCoursActivity(view);
            }
        });
        this.lyt_en.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CoursActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m533lambda$onCreate$8$comneptunesoftgestionbacdzCoursActivity(view);
            }
        });
        this.lyt_fr.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.CoursActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m534lambda$onCreate$9$comneptunesoftgestionbacdzCoursActivity(view);
            }
        });
        refreshUI();
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m525lambda$onCreate$0$comneptunesoftgestionbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) AccountingActivity.class));
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-gestionbacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m526lambda$onCreate$1$comneptunesoftgestionbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) EconomicsActivity.class));
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-gestionbacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m527lambda$onCreate$2$comneptunesoftgestionbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) MathsActivity.class));
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-gestionbacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m528lambda$onCreate$3$comneptunesoftgestionbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) HistoryGeographyActivity.class));
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-gestionbacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m529lambda$onCreate$4$comneptunesoftgestionbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) ArabicActivity.class));
    }

    /* renamed from: lambda$onCreate$5$com-neptunesoft-gestionbacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m530lambda$onCreate$5$comneptunesoftgestionbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) LawActivity.class));
    }

    /* renamed from: lambda$onCreate$6$com-neptunesoft-gestionbacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m531lambda$onCreate$6$comneptunesoftgestionbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) IslamicActivity.class));
    }

    /* renamed from: lambda$onCreate$7$com-neptunesoft-gestionbacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m532lambda$onCreate$7$comneptunesoftgestionbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) PhilosophyActivity.class));
    }

    /* renamed from: lambda$onCreate$8$com-neptunesoft-gestionbacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m533lambda$onCreate$8$comneptunesoftgestionbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) EnglishActivity.class));
    }

    /* renamed from: lambda$onCreate$9$com-neptunesoft-gestionbacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m534lambda$onCreate$9$comneptunesoftgestionbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) FrenchActivity.class));
    }

    void refreshUI() {
        ImageView imageView = (ImageView) findViewById(R.id.imgAccounting);
        ImageView imageView2 = (ImageView) findViewById(R.id.imgEconomics);
        ImageView imageView3 = (ImageView) findViewById(R.id.imgMaths);
        ImageView imageView4 = (ImageView) findViewById(R.id.imgHisGeo);
        ImageView imageView5 = (ImageView) findViewById(R.id.imgArabic);
        ImageView imageView6 = (ImageView) findViewById(R.id.imgLaw);
        ImageView imageView7 = (ImageView) findViewById(R.id.imgIslamique);
        ImageView imageView8 = (ImageView) findViewById(R.id.imgPhilo);
        ImageView imageView9 = (ImageView) findViewById(R.id.imgEn);
        ImageView imageView10 = (ImageView) findViewById(R.id.imgFr);
        if (SplashScreen.darkmode) {
            imageView.setImageResource(R.drawable.ic_accounting_dark);
            imageView2.setImageResource(R.drawable.ic_economics_dark);
            imageView3.setImageResource(R.drawable.ic_maths_dark);
            imageView4.setImageResource(R.drawable.ic_history_dark);
            imageView5.setImageResource(R.drawable.ic_world_ar_dark);
            imageView6.setImageResource(R.drawable.ic_law_dark);
            imageView7.setImageResource(R.drawable.ic_bismillah_dark);
            imageView8.setImageResource(R.drawable.ic_question_book_dark);
            imageView9.setImageResource(R.drawable.ic_world_en_dark);
            imageView10.setImageResource(R.drawable.ic_world_fr_dark);
            return;
        }
        imageView.setImageResource(R.drawable.ic_accounting);
        imageView2.setImageResource(R.drawable.ic_economics);
        imageView3.setImageResource(R.drawable.ic_maths);
        imageView4.setImageResource(R.drawable.ic_history);
        imageView5.setImageResource(R.drawable.ic_world_ar);
        imageView6.setImageResource(R.drawable.ic_law);
        imageView7.setImageResource(R.drawable.ic_bismillah);
        imageView8.setImageResource(R.drawable.ic_question_book);
        imageView9.setImageResource(R.drawable.ic_world_en);
        imageView10.setImageResource(R.drawable.ic_world_fr);
    }
}
