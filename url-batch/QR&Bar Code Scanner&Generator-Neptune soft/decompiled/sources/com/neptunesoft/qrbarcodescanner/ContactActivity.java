package com.neptunesoft.qrbarcodescanner;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

/* loaded from: classes2.dex */
public class ContactActivity extends AppCompatActivity {
    public boolean touch_share = false;
    public boolean touch_web = false;
    public boolean touch_email = false;
    public boolean touch_fb = false;
    public boolean touch_insta = false;
    public boolean touch_yt = false;
    public boolean touch_twitter = false;
    public boolean touch_feedback = false;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.contact_activity);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(8192);
        window.setStatusBarColor(getColor(R.color.light_grey));
        final CardView cardView = (CardView) findViewById(R.id.cv_fb);
        final CardView cardView2 = (CardView) findViewById(R.id.cv_inst);
        final CardView cardView3 = (CardView) findViewById(R.id.cv_yt);
        final CardView cardView4 = (CardView) findViewById(R.id.cv_web);
        final CardView cardView5 = (CardView) findViewById(R.id.cv_email);
        final CardView cardView6 = (CardView) findViewById(R.id.cv_twitter);
        final CardView cardView7 = (CardView) findViewById(R.id.cv_share);
        final CardView cardView8 = (CardView) findViewById(R.id.cv_feedback);
        cardView.setCardElevation(10.0f);
        cardView2.setCardElevation(10.0f);
        cardView3.setCardElevation(10.0f);
        cardView4.setCardElevation(10.0f);
        cardView5.setCardElevation(10.0f);
        cardView6.setCardElevation(10.0f);
        cardView7.setCardElevation(10.0f);
        cardView8.setCardElevation(10.0f);
        cardView4.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactActivity.this.m117xfdf990ff(view);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactActivity.this.m118xefa3371e(view);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactActivity.this.m125xe14cdd3d(view);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactActivity.this.m126xd2f6835c(view);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactActivity.this.m127xc4a0297b(view);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactActivity.this.m128xb649cf9a(view);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactActivity.this.m129xa7f375b9(view);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactActivity.this.m130x999d1bd8(view);
            }
        });
        cardView4.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ContactActivity.this.m131x8b46c1f7(cardView4, view, motionEvent);
            }
        });
        cardView7.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ContactActivity.this.m132x7cf06816(cardView7, view, motionEvent);
            }
        });
        cardView8.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ContactActivity.this.m119xc2133018(cardView8, view, motionEvent);
            }
        });
        cardView5.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ContactActivity.this.m120xb3bcd637(cardView5, view, motionEvent);
            }
        });
        cardView.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ContactActivity.this.m121xa5667c56(cardView, view, motionEvent);
            }
        });
        cardView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ContactActivity.this.m122x97102275(cardView2, view, motionEvent);
            }
        });
        cardView3.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ContactActivity.this.m123x88b9c894(cardView3, view, motionEvent);
            }
        });
        cardView6.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ContactActivity.this.m124x7a636eb3(cardView6, view, motionEvent);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ void m117xfdf990ff(View view) {
        if (view.getId() == R.id.cv_web) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.neptune-soft.com/")));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(getApplicationContext(), "Install any browser to be able to open the website link", 0).show();
            }
        }
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ void m118xefa3371e(View view) {
        if (view.getId() == R.id.cv_share) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "QR & Bar Code Scanner");
            intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=com.neptunesoft.qrbarcodescanner");
            startActivity(Intent.createChooser(intent, "Share it with"));
        }
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ void m125xe14cdd3d(View view) {
        if (view.getId() == R.id.cv_feedback) {
            if (ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.READ_PHONE_NUMBERS") == 0 || Build.VERSION.SDK_INT < 26) {
                getPhone();
            } else {
                requestPhone_SM_Permission();
            }
        }
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ void m126xd2f6835c(View view) {
        String str = "fb://page/2130519337197110";
        try {
            try {
                if (getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode >= 3002850) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/2130519337197110/")));
                } else {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(getApplicationContext(), "Install the Facebook app or any browser to be able to open the page link", 0).show();
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/NeptuneSoft/")));
        }
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ void m127xc4a0297b(View view) {
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
            Toast.makeText(getApplicationContext(), "Install the YouTube app or any browser to be able to open the channel link", 0).show();
        }
    }

    /* renamed from: lambda$onCreate$5$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ void m128xb649cf9a(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/_u/neptune.soft/"));
        intent.setPackage("com.instagram.android");
        try {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/neptune.soft/")));
            }
        } catch (ActivityNotFoundException unused2) {
            Toast.makeText(getApplicationContext(), "Install the Instagram app or any browser to be able to open the page link", 0).show();
        }
    }

    /* renamed from: lambda$onCreate$6$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ void m129xa7f375b9(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/neptune_soft?s=09"));
        intent.setPackage("com.twitter.android");
        try {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(getApplicationContext(), "Install the Twitter app or any browser to be able to open the page link", 0).show();
            }
        } catch (ActivityNotFoundException unused2) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/neptune_soft?s=09")));
        }
    }

    /* renamed from: lambda$onCreate$7$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ void m130x999d1bd8(View view) {
        if (view.getId() == R.id.cv_email) {
            try {
                startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "contact@neptune-soft.com", null)), null));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(getApplicationContext(), "Install the Gmail app to be able to send a message to the app's developer", 0).show();
            }
        }
    }

    /* renamed from: lambda$onCreate$8$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ boolean m131x8b46c1f7(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch_web = true;
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_blackdark));
        } else if (action == 1) {
            this.touch_web = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (!this.touch_share && !this.touch_email && !this.touch_fb && !this.touch_insta && !this.touch_yt && !this.touch_twitter && !this.touch_feedback && x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        } else {
            this.touch_web = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
        }
        return true;
    }

    /* renamed from: lambda$onCreate$9$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ boolean m132x7cf06816(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch_share = true;
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.firebrickdark));
        } else if (action == 1) {
            this.touch_share = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.firebrick));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (!this.touch_web && !this.touch_email && !this.touch_feedback && !this.touch_fb && !this.touch_insta && !this.touch_yt && !this.touch_twitter && x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        } else {
            this.touch_share = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.firebrick));
        }
        return true;
    }

    /* renamed from: lambda$onCreate$10$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ boolean m119xc2133018(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch_feedback = true;
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.firebrickdark));
        } else if (action == 1) {
            this.touch_feedback = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.firebrick));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (!this.touch_share && !this.touch_email && !this.touch_fb && !this.touch_insta && !this.touch_yt && !this.touch_twitter && !this.touch_web && x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        } else {
            this.touch_feedback = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.firebrick));
        }
        return true;
    }

    /* renamed from: lambda$onCreate$11$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ boolean m120xb3bcd637(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch_email = true;
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_blackdark));
        } else if (action == 1) {
            this.touch_email = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (!this.touch_share && !this.touch_web && !this.touch_fb && !this.touch_insta && !this.touch_yt && !this.touch_twitter && !this.touch_feedback && x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        } else {
            this.touch_email = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
        }
        return true;
    }

    /* renamed from: lambda$onCreate$12$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ boolean m121xa5667c56(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch_fb = true;
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_blackdark));
        } else if (action == 1) {
            this.touch_fb = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (!this.touch_share && !this.touch_web && !this.touch_email && !this.touch_insta && !this.touch_yt && !this.touch_twitter && !this.touch_feedback && x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        } else {
            this.touch_fb = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
        }
        return true;
    }

    /* renamed from: lambda$onCreate$13$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ boolean m122x97102275(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch_insta = true;
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_blackdark));
        } else if (action == 1) {
            this.touch_insta = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (!this.touch_share && !this.touch_web && !this.touch_email && !this.touch_fb && !this.touch_yt && !this.touch_twitter && !this.touch_feedback && x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        } else {
            this.touch_insta = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
        }
        return true;
    }

    /* renamed from: lambda$onCreate$14$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ boolean m123x88b9c894(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch_yt = true;
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_blackdark));
        } else if (action == 1) {
            this.touch_yt = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (!this.touch_share && !this.touch_web && !this.touch_email && !this.touch_fb && !this.touch_insta && !this.touch_twitter && !this.touch_feedback && x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        } else {
            this.touch_yt = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
        }
        return true;
    }

    /* renamed from: lambda$onCreate$15$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ boolean m124x7a636eb3(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch_twitter = true;
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_blackdark));
        } else if (action == 1) {
            this.touch_twitter = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (!this.touch_share && !this.touch_web && !this.touch_email && !this.touch_fb && !this.touch_insta && !this.touch_yt && !this.touch_feedback && x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        } else {
            this.touch_twitter = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
        }
        return true;
    }

    private void requestPhone_SM_Permission() {
        AlertDialog create = new AlertDialog.Builder(this).create();
        create.setMessage("The ability to obtain the phone number on this device, this permission is necessary to send the feedback to the developer of this application");
        create.setButton(-1, "Allow", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ContactActivity.this.m133xdfc0fa2b(dialogInterface, i);
            }
        });
        create.setButton(-2, "Refuse", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.ContactActivity$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$requestPhone_SM_Permission$16$com-neptunesoft-qrbarcodescanner-ContactActivity, reason: not valid java name */
    /* synthetic */ void m133xdfc0fa2b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (Build.VERSION.SDK_INT >= 26) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_PHONE_NUMBERS"}, 121);
        }
    }

    private void getPhone() {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        if (ActivityCompat.checkSelfPermission(getApplicationContext(), "android.permission.READ_PHONE_NUMBERS") != 0 || Build.VERSION.SDK_INT < 26) {
            Feedback_Activity.nmbr_phone = null;
        } else {
            Feedback_Activity.nmbr_phone = telephonyManager.getLine1Number();
        }
        Feedback_Activity.from_home = false;
        startActivity(new Intent(getApplicationContext(), (Class<?>) Feedback_Activity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 121) {
            if (iArr.length > 0 && iArr[0] == 0) {
                getPhone();
            } else {
                Toast.makeText(this, "You cannot send feedback messages without granting permission to obtain the phone number on this device. If you deny the permission, you can activate it again from the settings for the applications", 1).show();
            }
        }
    }
}
