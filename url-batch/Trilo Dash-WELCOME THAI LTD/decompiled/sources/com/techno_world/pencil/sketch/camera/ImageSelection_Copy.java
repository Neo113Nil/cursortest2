package com.techno_world.pencil.sketch.camera;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.FileProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.preference.PreferenceManager;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.kobakei.ratethisapp.RateThisApp;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class ImageSelection_Copy extends AppCompatActivity {
    FrameLayout adViewContainer;
    AdView adView_admob;
    private InterstitialAd interstitial_admob;
    public String outputMedia;
    public int GALLERY_KITKAT = 6;
    public int GALLERY_OTHER = 5;
    public int CAMERA_OTHER = 4;
    public int CAMERA_KITKAT = 7;
    boolean doubleBackToExitPressedOnce = false;
    InterstitialAdLoadCallback showAds_onBack = new InterstitialAdLoadCallback() { // from class: com.techno_world.pencil.sketch.camera.ImageSelection_Copy.2
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            ImageSelection_Copy.this.interstitial_admob = interstitialAd;
            ImageSelection_Copy.this.interstitial_admob.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.techno_world.pencil.sketch.camera.ImageSelection_Copy.2.1
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent();
                    ImageSelection_Copy.this.interstitial_admob = null;
                    ImageSelection_Copy.this.startActivity(new Intent(ImageSelection_Copy.this, (Class<?>) ExitScreen.class).setFlags(335577088));
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    super.onAdFailedToShowFullScreenContent(adError);
                    ImageSelection_Copy.this.interstitial_admob = null;
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent();
                    ImageSelection_Copy.this.interstitial_admob = null;
                }
            });
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            ImageSelection_Copy.this.interstitial_admob = null;
        }
    };

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        AdView adView = this.adView_admob;
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        AdView adView = this.adView_admob;
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        AdView adView = this.adView_admob;
        if (adView != null) {
            adView.resume();
        }
    }

    private void ShowRateDialog() {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        if (defaultSharedPreferences.getBoolean("rate_app", false)) {
            return;
        }
        RateThisApp.onCreate(this);
        RateThisApp.Config config = new RateThisApp.Config(0, 0);
        config.setCancelable(true);
        config.setMessage(R.string.rating_statement);
        RateThisApp.init(config);
        RateThisApp.showRateDialogIfNeeded(this);
        RateThisApp.setCallback(new RateThisApp.Callback() { // from class: com.techno_world.pencil.sketch.camera.ImageSelection_Copy.1
            @Override // com.kobakei.ratethisapp.RateThisApp.Callback
            public void onYesClicked() {
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putBoolean("rate_app", true);
                edit.commit();
            }

            @Override // com.kobakei.ratethisapp.RateThisApp.Callback
            public void onNoClicked() {
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putBoolean("rate_app", true);
                edit.commit();
                ImageSelection_Copy.this.displayInterstitial();
            }

            @Override // com.kobakei.ratethisapp.RateThisApp.Callback
            public void onCancelClicked() {
                ImageSelection_Copy.this.displayInterstitial();
            }
        });
    }

    private static AdSize getAdSize(AppCompatActivity appCompatActivity) {
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(appCompatActivity, appCompatActivity.getResources().getConfiguration().screenWidthDp);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ShowRateDialog();
        if (this.doubleBackToExitPressedOnce) {
            displayInterstitial();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press Back again to Exit.", 0).show();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.techno_world.pencil.sketch.camera.ImageSelection_Copy.3
            @Override // java.lang.Runnable
            public void run() {
                ImageSelection_Copy.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000L);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void showDialogForPrivacy() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Privacy Policy");
        WebView webView = new WebView(this);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(0);
        webView.setWebViewClient(new MyBrowser());
        webView.loadUrl("http://technoprivac.blogspot.com/2017/03/privacy-policy-technoworld-services.html");
        builder.setView(webView);
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.techno_world.pencil.sketch.camera.ImageSelection_Copy.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_privacy) {
            showDialogForPrivacy();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 511) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0 && ActivityCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && ActivityCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Pencil Camera");
        builder.setMessage("The app need these permission. it will not work due to Permission Denial");
        builder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.techno_world.pencil.sketch.camera.ImageSelection_Copy.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        builder.show();
    }

    public void displayInterstitial() {
        if (ProcessLifecycleOwner.get().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            InterstitialAd interstitialAd = this.interstitial_admob;
            if (interstitialAd != null) {
                interstitialAd.show(this);
            } else {
                startActivity(new Intent(this, (Class<?>) ExitScreen.class).setFlags(335577088));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main_ui);
        this.adViewContainer = (FrameLayout) findViewById(R.id.adContainer);
        AdView adView = new AdView(this);
        this.adView_admob = adView;
        adView.setAdUnitId(getString(R.string.AdBanner));
        this.adViewContainer.removeAllViews();
        this.adViewContainer.addView(this.adView_admob);
        AdRequest build = new AdRequest.Builder().build();
        this.adView_admob.setAdSize(getAdSize(this));
        this.adView_admob.loadAd(build);
        InterstitialAd.load(this, getResources().getString(R.string.AdInter), new AdRequest.Builder().build(), this.showAds_onBack);
        ((MyApp) getApplication()).setAddVariable(false);
        if (ActivityCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || ActivityCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, FrameMetricsAggregator.EVERY_DURATION);
        }
        ((ImageView) findViewById(R.id.mitake)).setOnClickListener(new View.OnClickListener() { // from class: com.techno_world.pencil.sketch.camera.ImageSelection_Copy.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ImageSelection_Copy.this.showNoteALert();
            }
        });
        ((ImageView) findViewById(R.id.migalery)).setOnClickListener(new View.OnClickListener() { // from class: com.techno_world.pencil.sketch.camera.ImageSelection_Copy.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("image/*");
                if (Build.VERSION.SDK_INT >= 19) {
                    ImageSelection_Copy imageSelection_Copy = ImageSelection_Copy.this;
                    imageSelection_Copy.startActivityForResult(intent, imageSelection_Copy.GALLERY_KITKAT);
                } else {
                    ImageSelection_Copy imageSelection_Copy2 = ImageSelection_Copy.this;
                    imageSelection_Copy2.startActivityForResult(intent, imageSelection_Copy2.GALLERY_OTHER);
                }
            }
        });
    }

    public void showNoteALert() {
        new AlertDialog.Builder(this).setTitle("Pencil Camera").setMessage("Note: Always use landscape mode for taking picture.").setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.techno_world.pencil.sketch.camera.ImageSelection_Copy.8
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                File file;
                dialogInterface.cancel();
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                try {
                    file = ImageSelection_Copy.this.createImageFile();
                } catch (IOException e) {
                    Log.i("PencilCamera", e.getMessage());
                    file = null;
                }
                if (file != null) {
                    intent.putExtra("output", FileProvider.getUriForFile(ImageSelection_Copy.this, "com.techno_world.pencil.sketch.camera.fileprovider", file));
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    ImageSelection_Copy imageSelection_Copy = ImageSelection_Copy.this;
                    imageSelection_Copy.startActivityForResult(intent, imageSelection_Copy.CAMERA_KITKAT);
                } else {
                    ImageSelection_Copy imageSelection_Copy2 = ImageSelection_Copy.this;
                    imageSelection_Copy2.startActivityForResult(intent, imageSelection_Copy2.CAMERA_OTHER);
                }
            }
        }).setIcon(android.R.drawable.ic_dialog_alert).show().setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File createImageFile() throws IOException {
        Calendar calendar = Calendar.getInstance();
        File createTempFile = File.createTempFile(calendar.get(2) + "_" + calendar.get(5) + "_" + calendar.getTimeInMillis(), ".jpg", getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        this.outputMedia = createTempFile.getAbsolutePath();
        return createTempFile;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.CAMERA_OTHER && i2 == -1) {
            File file = new File(this.outputMedia);
            Log.i("PencilCamera", this.outputMedia);
            startActivity(new Intent(this, (Class<?>) ImgProcess.class).putExtra("Image_name", file.getAbsolutePath().toString()).putExtra("From_Camera", true).putExtra("Kitkat_Camera", false));
            return;
        }
        if (i == this.CAMERA_KITKAT && i2 == -1) {
            Log.i("PencilCamera ", this.outputMedia);
            startActivity(new Intent(this, (Class<?>) ImgProcess.class).putExtra("Image_name", this.outputMedia.toString()).putExtra("From_Camera", true).putExtra("Kitkat_Camera", true));
        } else if (i == this.GALLERY_OTHER && i2 == -1) {
            startActivity(new Intent(this, (Class<?>) ImgProcess.class).putExtra("Image_name", intent.getData().toString()).putExtra("From_Camera", false));
        } else if (i == this.GALLERY_KITKAT && i2 == -1) {
            startActivity(new Intent(this, (Class<?>) ImgProcess.class).putExtra("Image_name", intent.getData().toString()).putExtra("From_Camera", false));
        }
    }
}
