package com.neptunesoft.gestionbacdz;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.webkit.internal.AssetHelper;
import com.facebook.ads.internal.util.common.FbValidationUtils;

/* loaded from: classes.dex */
public class AboutActivity extends AppCompatActivity {
    CardView cv_email;
    CardView cv_fb;
    CardView cv_feedback;
    CardView cv_inst;
    CardView cv_share;
    CardView cv_twitter;
    CardView cv_web;
    CardView cv_yt;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.cv_fb = (CardView) findViewById(R.id.cv_fb);
        this.cv_inst = (CardView) findViewById(R.id.cv_inst);
        this.cv_yt = (CardView) findViewById(R.id.cv_yt);
        this.cv_web = (CardView) findViewById(R.id.cv_web);
        this.cv_email = (CardView) findViewById(R.id.cv_email);
        this.cv_twitter = (CardView) findViewById(R.id.cv_twitter);
        this.cv_share = (CardView) findViewById(R.id.cv_share);
        this.cv_feedback = (CardView) findViewById(R.id.cv_feedback);
        refreshUI();
        this.cv_fb.setCardElevation(10.0f);
        this.cv_inst.setCardElevation(10.0f);
        this.cv_yt.setCardElevation(10.0f);
        this.cv_web.setCardElevation(10.0f);
        this.cv_email.setCardElevation(10.0f);
        this.cv_twitter.setCardElevation(10.0f);
        this.cv_share.setCardElevation(10.0f);
        this.cv_feedback.setCardElevation(10.0f);
        this.cv_web.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AboutActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.this.m491lambda$onCreate$0$comneptunesoftgestionbacdzAboutActivity(view);
            }
        });
        this.cv_share.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AboutActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.this.m492lambda$onCreate$1$comneptunesoftgestionbacdzAboutActivity(view);
            }
        });
        this.cv_feedback.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AboutActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.this.m493lambda$onCreate$2$comneptunesoftgestionbacdzAboutActivity(view);
            }
        });
        this.cv_fb.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AboutActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.this.m494lambda$onCreate$3$comneptunesoftgestionbacdzAboutActivity(view);
            }
        });
        this.cv_yt.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AboutActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.this.m495lambda$onCreate$4$comneptunesoftgestionbacdzAboutActivity(view);
            }
        });
        this.cv_inst.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AboutActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.this.m496lambda$onCreate$5$comneptunesoftgestionbacdzAboutActivity(view);
            }
        });
        this.cv_twitter.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AboutActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.this.m497lambda$onCreate$6$comneptunesoftgestionbacdzAboutActivity(view);
            }
        });
        this.cv_email.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AboutActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.this.m498lambda$onCreate$7$comneptunesoftgestionbacdzAboutActivity(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-AboutActivity, reason: not valid java name */
    /* synthetic */ void m491lambda$onCreate$0$comneptunesoftgestionbacdzAboutActivity(View view) {
        if (view.getId() == R.id.cv_web) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.neptune-soft.com/")));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(getApplicationContext(), "قم بتثبيت أي متصفح لكي تتمكن من فتح رابط الموقع", 0).show();
            }
        }
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-gestionbacdz-AboutActivity, reason: not valid java name */
    /* synthetic */ void m492lambda$onCreate$1$comneptunesoftgestionbacdzAboutActivity(View view) {
        if (view.getId() == R.id.cv_share) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            intent.putExtra("android.intent.extra.SUBJECT", "تطبيق بكالوريا تسيير و اقتصاد");
            intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=com.neptunesoft.gestionbacdz");
            startActivity(Intent.createChooser(intent, "شارك التطبيق عبر"));
        }
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-gestionbacdz-AboutActivity, reason: not valid java name */
    /* synthetic */ void m493lambda$onCreate$2$comneptunesoftgestionbacdzAboutActivity(View view) {
        if (view.getId() == R.id.cv_feedback) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) FeedbackActivity.class);
            FeedbackActivity.from_home = false;
            startActivity(intent);
        }
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-gestionbacdz-AboutActivity, reason: not valid java name */
    /* synthetic */ void m494lambda$onCreate$3$comneptunesoftgestionbacdzAboutActivity(View view) {
        try {
            try {
                if (getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 0).versionCode >= 3002850) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/2130519337197110/")));
                } else {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://page/2130519337197110")));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/NeptuneSoft/")));
            }
        } catch (ActivityNotFoundException unused2) {
            Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق الفايس بوك أو أي متصفح لكي تتمكن من فتح رابط الصفحة", 0).show();
        }
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-gestionbacdz-AboutActivity, reason: not valid java name */
    /* synthetic */ void m495lambda$onCreate$4$comneptunesoftgestionbacdzAboutActivity(View view) {
        if (getPackageManager().getLaunchIntentForPackage("com.google.android.youtube") != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.youtube.com/channel/UC2almoV4qYry0v2ZQbZFkvA"));
            intent.setPackage("com.google.android.youtube");
            startActivity(intent);
            return;
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/channel/UC2almoV4qYry0v2ZQbZFkvA")));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق اليوتيوب أو أي متصفح لكي تتمكن من فتح رابط القناة", 0).show();
        }
    }

    /* renamed from: lambda$onCreate$5$com-neptunesoft-gestionbacdz-AboutActivity, reason: not valid java name */
    /* synthetic */ void m496lambda$onCreate$5$comneptunesoftgestionbacdzAboutActivity(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/_u/neptune.soft/"));
        intent.setPackage("com.instagram.android");
        try {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/neptune.soft/")));
            }
        } catch (ActivityNotFoundException unused2) {
            Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق الانستقرام أو أي متصفح لكي تتمكن من فتح رابط الصفحة", 0).show();
        }
    }

    /* renamed from: lambda$onCreate$6$com-neptunesoft-gestionbacdz-AboutActivity, reason: not valid java name */
    /* synthetic */ void m497lambda$onCreate$6$comneptunesoftgestionbacdzAboutActivity(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/neptune_soft?s=09"));
        intent.setPackage("com.twitter.android");
        try {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق التويتر أو أي متصفح لكي تتمكن من فتح رابط الصفحة", 0).show();
            }
        } catch (ActivityNotFoundException unused2) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/neptune_soft?s=09")));
        }
    }

    /* renamed from: lambda$onCreate$7$com-neptunesoft-gestionbacdz-AboutActivity, reason: not valid java name */
    /* synthetic */ void m498lambda$onCreate$7$comneptunesoftgestionbacdzAboutActivity(View view) {
        if (view.getId() == R.id.cv_email) {
            try {
                startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "contact.neptune.soft@gmail.com", null)), null));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق الجيمايل لكي تتمكن من إرسال رسالة إلى المطور الخاص بهذا التطبيق", 0).show();
            }
        }
    }

    void refreshUI() {
        ImageView imageView = (ImageView) findViewById(R.id.img_icon_app_about);
        ImageView imageView2 = (ImageView) findViewById(R.id.img_icon_vers_about);
        ImageView imageView3 = (ImageView) findViewById(R.id.img_icon_gender_contact);
        ImageView imageView4 = (ImageView) findViewById(R.id.img_icon_license_contact);
        ImageView imageView5 = (ImageView) findViewById(R.id.img_icon_ui);
        ImageView imageView6 = (ImageView) findViewById(R.id.img_icon_ux);
        ImageView imageView7 = (ImageView) findViewById(R.id.img_icon_coding);
        ImageView imageView8 = (ImageView) findViewById(R.id.imgv_twitter);
        ImageView imageView9 = (ImageView) findViewById(R.id.imgv_instgramme);
        ImageView imageView10 = (ImageView) findViewById(R.id.imgv_youtube);
        ImageView imageView11 = (ImageView) findViewById(R.id.imgv_facebook);
        ImageView imageView12 = (ImageView) findViewById(R.id.imgv_email);
        ImageView imageView13 = (ImageView) findViewById(R.id.imgv_web);
        ImageView imageView14 = (ImageView) findViewById(R.id.img_icon_phone);
        ImageView imageView15 = (ImageView) findViewById(R.id.img_icon_adresse_contact);
        ImageView imageView16 = (ImageView) findViewById(R.id.imgv_logo);
        if (SplashScreen.darkmode) {
            imageView.setImageResource(R.drawable.ic_certificate_dark_about);
            imageView2.setImageResource(R.drawable.ic_information_dark);
            imageView3.setImageResource(R.drawable.ic_layers_dark);
            imageView4.setImageResource(R.drawable.ic_medal_dark);
            imageView5.setImageResource(R.drawable.ic_pattern_design_dark);
            imageView6.setImageResource(R.drawable.ic_target_symbol_dark);
            imageView7.setImageResource(R.drawable.ic_code_dark);
            imageView8.setImageResource(R.drawable.ic_twitter_dark);
            imageView9.setImageResource(R.drawable.ic_instagram_dark);
            imageView10.setImageResource(R.drawable.ic_youtube_dark);
            imageView11.setImageResource(R.drawable.ic_facebook_dark);
            imageView12.setImageResource(R.drawable.ic_at_dark);
            imageView13.setImageResource(R.drawable.ic_world_wide_web_dark);
            imageView14.setImageResource(R.drawable.ic_telephone_dark);
            imageView15.setImageResource(R.drawable.ic_pin_dark);
            imageView16.setImageResource(R.drawable.logo_dark);
            return;
        }
        imageView.setImageResource(R.drawable.ic_certificate);
        imageView2.setImageResource(R.drawable.ic_information);
        imageView3.setImageResource(R.drawable.ic_layers);
        imageView4.setImageResource(R.drawable.ic_medal);
        imageView5.setImageResource(R.drawable.ic_pattern_design);
        imageView6.setImageResource(R.drawable.ic_target_symbol);
        imageView7.setImageResource(R.drawable.ic_code);
        imageView8.setImageResource(R.drawable.ic_twitter);
        imageView9.setImageResource(R.drawable.ic_instagram);
        imageView10.setImageResource(R.drawable.ic_youtube);
        imageView11.setImageResource(R.drawable.ic_facebook);
        imageView12.setImageResource(R.drawable.ic_at);
        imageView13.setImageResource(R.drawable.ic_world_wide_web);
        imageView14.setImageResource(R.drawable.ic_telephone);
        imageView15.setImageResource(R.drawable.ic_pin);
        imageView16.setImageResource(R.drawable.logo);
    }
}
