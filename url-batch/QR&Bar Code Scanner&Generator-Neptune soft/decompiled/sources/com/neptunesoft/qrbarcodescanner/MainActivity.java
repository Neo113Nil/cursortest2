package com.neptunesoft.qrbarcodescanner;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuCompat;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import java.util.Map;

/* loaded from: classes2.dex */
public class MainActivity extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MY_CAMERA_REQUEST_CODE = 100;
    static IntentIntegrator intentIntegrator;
    Button btn_scan;
    CardView cv_copy;
    CardView cv_create;
    CardView cv_open;
    CardView cv_share_content;
    private boolean doubleBackToExitPressedOnce;
    EditText editText_content;
    boolean light_camera;
    InterstitialAd mInterstitialAd;
    boolean sound_reader;
    private final Handler mHandler = new Handler();
    String operation = "null";
    private final Runnable mRunnable = new Runnable() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity.3
        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.doubleBackToExitPressedOnce = false;
        }
    };

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.items));
        this.cv_copy = (CardView) findViewById(R.id.cv_copy);
        this.cv_open = (CardView) findViewById(R.id.cv_open);
        this.cv_create = (CardView) findViewById(R.id.cv_create);
        this.cv_share_content = (CardView) findViewById(R.id.cv_share_content);
        this.editText_content = (EditText) findViewById(R.id.editText_content);
        this.btn_scan = (Button) findViewById(R.id.btn_scan);
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                MainActivity.this.m151lambda$onCreate$0$comneptunesoftqrbarcodescannerMainActivity(initializationStatus);
            }
        });
        intentIntegrator = new IntentIntegrator(this);
        this.btn_scan.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m152lambda$onCreate$1$comneptunesoftqrbarcodescannerMainActivity(view);
            }
        });
        this.cv_copy.setCardElevation(10.0f);
        this.cv_open.setCardElevation(10.0f);
        this.cv_create.setCardElevation(10.0f);
        this.cv_share_content.setCardElevation(10.0f);
        this.cv_create.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m153lambda$onCreate$2$comneptunesoftqrbarcodescannerMainActivity(view);
            }
        });
        this.cv_copy.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m154lambda$onCreate$3$comneptunesoftqrbarcodescannerMainActivity(view);
            }
        });
        this.cv_share_content.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m155lambda$onCreate$4$comneptunesoftqrbarcodescannerMainActivity(view);
            }
        });
        this.cv_open.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m156lambda$onCreate$5$comneptunesoftqrbarcodescannerMainActivity(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-qrbarcodescanner-MainActivity, reason: not valid java name */
    /* synthetic */ void m151lambda$onCreate$0$comneptunesoftqrbarcodescannerMainActivity(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
        loadAdMobInterstitialAds();
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-qrbarcodescanner-MainActivity, reason: not valid java name */
    /* synthetic */ void m152lambda$onCreate$1$comneptunesoftqrbarcodescannerMainActivity(View view) {
        if (ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.CAMERA") == 0 || Build.VERSION.SDK_INT < 26) {
            scan();
        } else {
            requestPhone_Camera();
        }
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-qrbarcodescanner-MainActivity, reason: not valid java name */
    /* synthetic */ void m153lambda$onCreate$2$comneptunesoftqrbarcodescannerMainActivity(View view) {
        this.operation = "create";
        showInterstitialAds();
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-qrbarcodescanner-MainActivity, reason: not valid java name */
    /* synthetic */ void m154lambda$onCreate$3$comneptunesoftqrbarcodescannerMainActivity(View view) {
        if (!this.editText_content.getText().toString().trim().equals("")) {
            this.operation = "copy";
            showInterstitialAds();
        } else {
            Toast.makeText(this, "There is no data !.", 0).show();
        }
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-qrbarcodescanner-MainActivity, reason: not valid java name */
    /* synthetic */ void m155lambda$onCreate$4$comneptunesoftqrbarcodescannerMainActivity(View view) {
        if (!this.editText_content.getText().toString().trim().equals("")) {
            this.operation = "share";
            showInterstitialAds();
        } else {
            Toast.makeText(this, "There is no data !.", 0).show();
        }
    }

    /* renamed from: lambda$onCreate$5$com-neptunesoft-qrbarcodescanner-MainActivity, reason: not valid java name */
    /* synthetic */ void m156lambda$onCreate$5$comneptunesoftqrbarcodescannerMainActivity(View view) {
        if (!this.editText_content.getText().toString().trim().equals("")) {
            this.operation = "open";
            showInterstitialAds();
        } else {
            Toast.makeText(this, "There is no data !.", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdMobInterstitialAds() {
        InterstitialAd.load(this, getString(R.string.Interstitial_Generator_UnitId), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                MainActivity.this.mInterstitialAd = interstitialAd;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MainActivity.this.mInterstitialAd = null;
            }
        });
    }

    public void showInterstitialAds() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this);
            this.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity.2
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    MainActivity.this.mInterstitialAd = null;
                    MainActivity.this.loadAdMobInterstitialAds();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    String str = MainActivity.this.operation;
                    str.hashCode();
                    switch (str) {
                        case "create":
                            MainActivity.this.create();
                            break;
                        case "copy":
                            MainActivity.this.copy();
                            break;
                        case "open":
                            MainActivity.this.open();
                            break;
                        case "share":
                            MainActivity.this.share();
                            break;
                    }
                }
            });
            return;
        }
        String str = this.operation;
        str.hashCode();
        switch (str) {
            case "create":
                create();
                break;
            case "copy":
                copy();
                break;
            case "open":
                open();
                break;
            case "share":
                share();
                break;
        }
        loadAdMobInterstitialAds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void create() {
        startActivity(new Intent(this, (Class<?>) Generate.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void open() {
        String trim = this.editText_content.getText().toString().trim();
        if (!trim.equals("")) {
            try {
                Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                intent.putExtra(SearchIntents.EXTRA_QUERY, trim);
                startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(getApplicationContext(), "Install any browser to be able to open the website link", 0).show();
                return;
            }
        }
        Toast.makeText(this, "There is no data !.", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void share() {
        String trim = this.editText_content.getText().toString().trim();
        if (!trim.equals("")) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", trim);
            startActivity(Intent.createChooser(intent, "Share it with"));
            return;
        }
        Toast.makeText(this, "There is no data !.", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void copy() {
        if (!this.editText_content.getText().toString().trim().equals("")) {
            ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("EditText", this.editText_content.getText().toString()));
            Toast.makeText(this, "Copied.", 0).show();
        } else {
            Toast.makeText(this, "There is no data !.", 0).show();
        }
    }

    private void init() {
        this.light_camera = getSharedPreferences("LIGHTCAMERA", 0).getBoolean("switchkey2", true);
        this.sound_reader = getSharedPreferences("DARKMODE", 0).getBoolean("switchkey3", true);
    }

    public void scan() {
        init();
        intentIntegrator.setOrientationLocked(false);
        intentIntegrator.setBarcodeImageEnabled(true);
        intentIntegrator.setCaptureActivity(CaptureAct.class);
        intentIntegrator.setTorchEnabled(this.light_camera);
        intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        intentIntegrator.setBarcodeImageEnabled(false);
        intentIntegrator.setPrompt("Scan a QR Code or barcode");
        intentIntegrator.setBeepEnabled(this.sound_reader);
        intentIntegrator.initiateScan();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        if (Build.VERSION.SDK_INT >= 28) {
            menu.setGroupDividerEnabled(true);
        } else {
            MenuCompat.setGroupDividerEnabled(menu, true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.item_settings) {
            startActivity(new Intent(this, (Class<?>) Settings.class));
            return true;
        }
        if (itemId == R.id.item_about) {
            startActivity(new Intent(this, (Class<?>) ContactActivity.class));
            return true;
        }
        if (itemId == R.id.item_close) {
            close_app();
            return true;
        }
        if (itemId == R.id.item_feedback) {
            if (ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.READ_PHONE_NUMBERS") == 0 || Build.VERSION.SDK_INT < 26) {
                getPhone();
            } else {
                requestPhone_SM_Permission();
            }
            return true;
        }
        if (itemId == R.id.item_share) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "QR & Bar Code Scanner");
            intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=com.neptunesoft.qrbarcodescanner");
            startActivity(Intent.createChooser(intent, "Share it with"));
        }
        if (itemId == R.id.item_rating) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.neptunesoft.qrbarcodescanner"));
            intent2.setPackage("com.android.vending");
            startActivity(intent2);
        }
        if (itemId == R.id.item_neptunesoft_apps) {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(Uri.parse("https://play.google.com/store/apps/dev?id=7512881118161131049"));
            intent3.setPackage("com.android.vending");
            startActivity(intent3);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacks(this.mRunnable);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Click again to close the application", 0).show();
        this.mHandler.postDelayed(this.mRunnable, 2000L);
    }

    private void close_app() {
        AlertDialog create = new AlertDialog.Builder(this).create();
        create.setMessage("Do you want to close the application ?.");
        create.setButton(-1, "Close", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.m150lambda$close_app$6$comneptunesoftqrbarcodescannerMainActivity(dialogInterface, i);
            }
        });
        create.setButton(-2, "Cancel", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$close_app$6$com-neptunesoft-qrbarcodescanner-MainActivity, reason: not valid java name */
    /* synthetic */ void m150lambda$close_app$6$comneptunesoftqrbarcodescannerMainActivity(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    private void getPhone() {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        if (ActivityCompat.checkSelfPermission(getApplicationContext(), "android.permission.READ_PHONE_NUMBERS") != 0 || Build.VERSION.SDK_INT < 26) {
            Feedback_Activity.nmbr_phone = null;
        } else {
            Feedback_Activity.nmbr_phone = telephonyManager.getLine1Number();
        }
        Feedback_Activity.from_home = true;
        startActivity(new Intent(getApplicationContext(), (Class<?>) Feedback_Activity.class));
    }

    private void requestPhone_SM_Permission() {
        AlertDialog create = new AlertDialog.Builder(this).create();
        create.setMessage("The ability to obtain the phone number on this device, this permission is necessary to send the feedback to the developer of this application");
        create.setButton(-1, "Allow", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.m158x33316819(dialogInterface, i);
            }
        });
        create.setButton(-2, "Refuse", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$requestPhone_SM_Permission$8$com-neptunesoft-qrbarcodescanner-MainActivity, reason: not valid java name */
    /* synthetic */ void m158x33316819(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (Build.VERSION.SDK_INT >= 26) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_PHONE_NUMBERS"}, 121);
        }
    }

    private void requestPhone_Camera() {
        AlertDialog create = new AlertDialog.Builder(this).create();
        create.setMessage("The ability to access the camera on this device, this permission is necessary to scan a QR code or barcode");
        create.setButton(-1, "Allow", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.m157xcd959eaf(dialogInterface, i);
            }
        });
        create.setButton(-2, "Refuse", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.MainActivity$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$requestPhone_Camera$10$com-neptunesoft-qrbarcodescanner-MainActivity, reason: not valid java name */
    /* synthetic */ void m157xcd959eaf(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (Build.VERSION.SDK_INT >= 26) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 100);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 121) {
            if (iArr.length > 0 && iArr[0] == 0) {
                getPhone();
                return;
            } else {
                Toast.makeText(this, "You cannot send feedback messages without granting permission to obtain the phone number on this device. If you deny the permission, you can activate it again from the settings for the applications", 1).show();
                return;
            }
        }
        if (i == 100) {
            if (iArr.length > 0 && iArr[0] == 0) {
                scan();
            } else {
                Toast.makeText(this, "You cannot scan a QR code or barcode without granting permission to access the camera on this device. If you deny permission, you can activate it again from the app settings", 1).show();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        IntentResult parseActivityResult = IntentIntegrator.parseActivityResult(i, i2, intent);
        EditText editText = (EditText) findViewById(R.id.editText_content);
        if (parseActivityResult != null) {
            if (parseActivityResult.getContents() == null) {
                editText.setText("");
            } else {
                editText.setText(parseActivityResult.getContents());
            }
        }
    }
}
