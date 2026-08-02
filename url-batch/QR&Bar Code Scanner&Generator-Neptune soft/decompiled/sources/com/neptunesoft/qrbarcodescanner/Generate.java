package com.neptunesoft.qrbarcodescanner;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.icu.text.SimpleDateFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/* loaded from: classes2.dex */
public class Generate extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    InterstitialAd mInterstitialAd;
    public boolean touch_save = false;
    public boolean touch_clear = false;
    int spinner_index = 0;
    boolean generated = false;
    Bitmap bitmap_code = null;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_generate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_generate);
        setSupportActionBar(toolbar);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.items));
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                Generate.this.m142lambda$onCreate$0$comneptunesoftqrbarcodescannerGenerate(initializationStatus);
            }
        });
        final EditText editText = (EditText) findViewById(R.id.editText_content_generate);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView_qr_content);
        final Spinner spinner = (Spinner) findViewById(R.id.type_encoder_spinner);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, R.array.type_encoder, android.R.layout.simple_spinner_item);
        createFromResource.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) createFromResource);
        spinner.setSelection(createFromResource.getPosition("QR code"));
        final BarcodeFormat[] barcodeFormatArr = {BarcodeFormat.QR_CODE};
        final int[] iArr = {2500};
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                Generate.this.spinner_index = i;
                switch (i) {
                    case 1:
                        barcodeFormatArr[0] = BarcodeFormat.CODABAR;
                        iArr[0] = 800;
                        break;
                    case 2:
                        barcodeFormatArr[0] = BarcodeFormat.AZTEC;
                        iArr[0] = 2500;
                        break;
                    case 3:
                        barcodeFormatArr[0] = BarcodeFormat.CODE_39;
                        iArr[0] = 800;
                        break;
                    case 4:
                        barcodeFormatArr[0] = BarcodeFormat.CODE_93;
                        iArr[0] = 800;
                        break;
                    case 5:
                        barcodeFormatArr[0] = BarcodeFormat.CODE_128;
                        iArr[0] = 800;
                        break;
                    case 6:
                        barcodeFormatArr[0] = BarcodeFormat.DATA_MATRIX;
                        iArr[0] = 2500;
                        break;
                    case 7:
                        barcodeFormatArr[0] = BarcodeFormat.EAN_8;
                        iArr[0] = 800;
                        break;
                    case 8:
                        barcodeFormatArr[0] = BarcodeFormat.EAN_13;
                        iArr[0] = 800;
                        break;
                    case 9:
                        barcodeFormatArr[0] = BarcodeFormat.ITF;
                        iArr[0] = 800;
                        break;
                    case 10:
                        barcodeFormatArr[0] = BarcodeFormat.PDF_417;
                        iArr[0] = 1200;
                        break;
                    case 11:
                        barcodeFormatArr[0] = BarcodeFormat.RSS_14;
                        iArr[0] = 800;
                        break;
                    case 12:
                        barcodeFormatArr[0] = BarcodeFormat.RSS_EXPANDED;
                        iArr[0] = 800;
                        break;
                    case 13:
                        barcodeFormatArr[0] = BarcodeFormat.UPC_A;
                        iArr[0] = 800;
                        break;
                    case 14:
                        barcodeFormatArr[0] = BarcodeFormat.UPC_E;
                        iArr[0] = 800;
                        break;
                    default:
                        barcodeFormatArr[0] = BarcodeFormat.QR_CODE;
                        iArr[0] = 2500;
                        break;
                }
            }
        });
        final CardView cardView = (CardView) findViewById(R.id.cv_save);
        final CardView cardView2 = (CardView) findViewById(R.id.cv_clear);
        cardView.setCardElevation(10.0f);
        cardView2.setCardElevation(10.0f);
        cardView.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate$$ExternalSyntheticLambda7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Generate.this.m143lambda$onCreate$1$comneptunesoftqrbarcodescannerGenerate(cardView, view, motionEvent);
            }
        });
        cardView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate$$ExternalSyntheticLambda8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Generate.this.m144lambda$onCreate$2$comneptunesoftqrbarcodescannerGenerate(cardView2, view, motionEvent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Generate.this.m145lambda$onCreate$3$comneptunesoftqrbarcodescannerGenerate(imageView, editText, view);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Generate.this.m146lambda$onCreate$4$comneptunesoftqrbarcodescannerGenerate(view);
            }
        });
        ((Button) findViewById(R.id.btn_generate)).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Generate.this.m148lambda$onCreate$7$comneptunesoftqrbarcodescannerGenerate(editText, barcodeFormatArr, iArr, imageView, spinner, view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-qrbarcodescanner-Generate, reason: not valid java name */
    /* synthetic */ void m142lambda$onCreate$0$comneptunesoftqrbarcodescannerGenerate(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
        loadAdMobInterstitialAds();
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-qrbarcodescanner-Generate, reason: not valid java name */
    /* synthetic */ boolean m143lambda$onCreate$1$comneptunesoftqrbarcodescannerGenerate(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch_save = true;
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_blackdark));
        } else if (action == 1) {
            this.touch_save = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (!this.touch_clear && x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        }
        return true;
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-qrbarcodescanner-Generate, reason: not valid java name */
    /* synthetic */ boolean m144lambda$onCreate$2$comneptunesoftqrbarcodescannerGenerate(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch_clear = true;
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_blackdark));
        } else if (action == 1) {
            this.touch_clear = false;
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (!this.touch_save && x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        }
        return true;
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-qrbarcodescanner-Generate, reason: not valid java name */
    /* synthetic */ void m145lambda$onCreate$3$comneptunesoftqrbarcodescannerGenerate(ImageView imageView, EditText editText, View view) {
        this.generated = false;
        this.bitmap_code = null;
        imageView.setImageResource(R.drawable.background_layout_generate);
        editText.setText("");
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-qrbarcodescanner-Generate, reason: not valid java name */
    /* synthetic */ void m146lambda$onCreate$4$comneptunesoftqrbarcodescannerGenerate(View view) {
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            showInterstitialAds();
        } else {
            requestStoragePermission();
        }
    }

    /* renamed from: lambda$onCreate$7$com-neptunesoft-qrbarcodescanner-Generate, reason: not valid java name */
    /* synthetic */ void m148lambda$onCreate$7$comneptunesoftqrbarcodescannerGenerate(EditText editText, BarcodeFormat[] barcodeFormatArr, int[] iArr, ImageView imageView, Spinner spinner, View view) {
        try {
            this.generated = false;
            String trim = editText.getText().toString().trim();
            MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
            if (!trim.equals("")) {
                try {
                    Bitmap createBitmap = new BarcodeEncoder().createBitmap(multiFormatWriter.encode(trim, barcodeFormatArr[0], 2500, iArr[0]));
                    this.bitmap_code = createBitmap;
                    imageView.setImageBitmap(createBitmap);
                    ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(editText.getApplicationWindowToken(), 0);
                    this.generated = true;
                } catch (WriterException e) {
                    e.printStackTrace();
                    Toast.makeText(this, "There is an error !.", 0).show();
                }
            } else {
                Toast.makeText(this, "Write down the content before generate the code !.", 0).show();
            }
        } catch (Exception unused) {
            AlertDialog create = new AlertDialog.Builder(this).create();
            create.setCancelable(false);
            create.setMessage("The symbol format is not compatible with this type of encoding '" + spinner.getSelectedItem().toString() + "'");
            create.setButton(-1, "Show an example", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Generate.this.m147lambda$onCreate$5$comneptunesoftqrbarcodescannerGenerate(dialogInterface, i);
                }
            });
            create.setButton(-2, "Back", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            create.show();
        }
    }

    /* renamed from: lambda$onCreate$5$com-neptunesoft-qrbarcodescanner-Generate, reason: not valid java name */
    /* synthetic */ void m147lambda$onCreate$5$comneptunesoftqrbarcodescannerGenerate(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        startExample();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdMobInterstitialAds() {
        InterstitialAd.load(this, getString(R.string.Interstitial_Generator_UnitId), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.neptunesoft.qrbarcodescanner.Generate.2
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                Generate.this.mInterstitialAd = interstitialAd;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Generate.this.mInterstitialAd = null;
            }
        });
    }

    public void showInterstitialAds() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this);
            this.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.neptunesoft.qrbarcodescanner.Generate.3
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    Generate.this.mInterstitialAd = null;
                    Generate.this.loadAdMobInterstitialAds();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    Generate.this.save();
                }
            });
        } else {
            save();
            loadAdMobInterstitialAds();
        }
    }

    private void requestStoragePermission() {
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        create.setCancelable(false);
        create.setMessage("Access to device files, this permission is necessary to save the image");
        create.setButton(-1, "Allow", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Generate.this.m149xa73e3ded(dialogInterface, i);
            }
        });
        create.setButton(-2, "Refuse", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Generate$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$requestStoragePermission$8$com-neptunesoft-qrbarcodescanner-Generate, reason: not valid java name */
    /* synthetic */ void m149xa73e3ded(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                save();
            } else {
                Toast.makeText(this, "You cannot save images without granting permission to access files on this device. If you deny the permission, you can activate it again from the settings for applications.", 1).show();
            }
        }
    }

    private File getDisc() {
        return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Image Demo");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void save() {
        if (this.generated && this.bitmap_code != null) {
            File disc = getDisc();
            if (!disc.exists() && !disc.mkdirs()) {
                Toast.makeText(this, "Can't create directory to save image", 0).show();
                return;
            }
            File file = new File(disc.getAbsolutePath() + "/" + ("img" + new SimpleDateFormat("yyymmhhss").format(new Date()) + ".jpg"));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                this.bitmap_code.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                Toast.makeText(this, "Save image success", 0).show();
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            refreshGallery(file);
            return;
        }
        Toast.makeText(this, "There is no code", 0).show();
    }

    public void refreshGallery(File file) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        sendBroadcast(intent);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.exemple, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.item_exemple) {
            startExample();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void startExample() {
        Example_Code.index = this.spinner_index;
        startActivity(new Intent(this, (Class<?>) Example_Code.class));
    }
}
