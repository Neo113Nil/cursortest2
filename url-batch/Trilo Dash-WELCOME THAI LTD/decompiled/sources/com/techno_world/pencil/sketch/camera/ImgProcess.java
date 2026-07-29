package com.techno_world.pencil.sketch.camera;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class ImgProcess extends AppCompatActivity implements View.OnClickListener {
    FrameLayout adViewContainer;
    AdView adView_admob;
    SharedPreferences.Editor edt;
    boolean from;
    int height;
    ImageView imge;
    Bitmap input;
    private InterstitialAd interstitial_admob;
    Bitmap output;
    Uri pathd;
    RadioGroup radio_intensity;
    LinearLayout radios;
    SharedPreferences spf;
    int wwidth;
    String session = "";
    String path = "";
    String path_n = "";
    Boolean selectChange = false;
    boolean outMem = false;
    boolean kitKatCam = false;
    InterstitialAdLoadCallback showAds_onBack = new InterstitialAdLoadCallback() { // from class: com.techno_world.pencil.sketch.camera.ImgProcess.1
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            ImgProcess.this.interstitial_admob = interstitialAd;
            ImgProcess.this.interstitial_admob.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.techno_world.pencil.sketch.camera.ImgProcess.1.1
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent();
                    ImgProcess.this.interstitial_admob = null;
                    ImgProcess.this.edt.putBoolean("pencil_add", true);
                    ImgProcess.this.edt.commit();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    super.onAdFailedToShowFullScreenContent(adError);
                    ImgProcess.this.interstitial_admob = null;
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent();
                    ImgProcess.this.interstitial_admob = null;
                }
            });
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            ImgProcess.this.interstitial_admob = null;
        }
    };
    String[] permissions = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    private static AdSize getAdSize(AppCompatActivity appCompatActivity) {
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(appCompatActivity, appCompatActivity.getResources().getConfiguration().screenWidthDp);
    }

    public void displayInterstitial() {
        InterstitialAd interstitialAd;
        if (!ProcessLifecycleOwner.get().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) || (interstitialAd = this.interstitial_admob) == null) {
            return;
        }
        interstitialAd.show(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.path = intent.getStringExtra("Image_name");
        this.from = intent.getBooleanExtra("From_Camera", false);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.height = displayMetrics.heightPixels;
        int i = displayMetrics.widthPixels;
        this.wwidth = i;
        this.wwidth = (i * 2) / 3;
        double d = this.height;
        Double.isNaN(d);
        this.height = (int) (d * 0.6d);
        SharedPreferences sharedPreferences = getSharedPreferences("pencil_shared", 0);
        this.spf = sharedPreferences;
        this.edt = sharedPreferences.edit();
        if (!this.spf.getBoolean("pencil_add", false)) {
            InterstitialAd.load(this, getResources().getString(R.string.AdInter), new AdRequest.Builder().build(), this.showAds_onBack);
        }
        startdisplay();
    }

    public void startdisplay() {
        setContentView(R.layout.process_view);
        this.adViewContainer = (FrameLayout) findViewById(R.id.adContainer);
        AdView adView = new AdView(this);
        this.adView_admob = adView;
        adView.setAdUnitId(getString(R.string.AdBanner));
        this.adViewContainer.removeAllViews();
        this.adViewContainer.addView(this.adView_admob);
        AdRequest build = new AdRequest.Builder().build();
        this.adView_admob.setAdSize(getAdSize(this));
        this.adView_admob.loadAd(build);
        this.imge = (ImageView) findViewById(R.id.image);
        Uri parse = Uri.parse(this.path);
        this.pathd = parse;
        this.path_n = parse.getPath();
        if (checkPermissions()) {
            new bitmap_load(this.pathd).execute(new Void[0]);
        }
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioFilter);
        this.radio_intensity = radioGroup;
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.techno_world.pencil.sketch.camera.ImgProcess.2
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup2, int i) {
                switch (i) {
                    case R.id.radioHigh /* 2131231081 */:
                        ImgProcess imgProcess = ImgProcess.this;
                        imgProcess.new simple_Pencil(imgProcess.pathd, 3).execute(new Void[0]);
                        break;
                    case R.id.radioLow /* 2131231082 */:
                        ImgProcess imgProcess2 = ImgProcess.this;
                        imgProcess2.new simple_Pencil(imgProcess2.pathd, 1).execute(new Void[0]);
                        break;
                    case R.id.radioMedium /* 2131231083 */:
                        ImgProcess imgProcess3 = ImgProcess.this;
                        imgProcess3.new simple_Pencil(imgProcess3.pathd, 2).execute(new Void[0]);
                        break;
                }
            }
        });
        ((ImageView) findViewById(R.id.btn_save)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.btn_share)).setOnClickListener(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 100 && iArr.length > 0 && iArr[0] == 0) {
            new bitmap_load(this.pathd).execute(new Void[0]);
        }
    }

    static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        if (options.outHeight > i2 || options.outWidth > i) {
            int i4 = options.outHeight / 2;
            int i5 = options.outWidth / 2;
            while (i4 / i3 > i2 && i5 / i3 > i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    public class bitmap_save extends AsyncTask<Void, Void, Void> {
        boolean ed;
        ProgressDialog pd;

        public bitmap_save(boolean z) {
            this.ed = z;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r3) {
            super.onPostExecute((bitmap_save) r3);
            this.pd.dismiss();
            Toast.makeText(ImgProcess.this, "Image Saved!", 1).show();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(ImgProcess.this);
            this.pd = progressDialog;
            progressDialog.show();
            this.pd.setContentView(R.layout.forprogress);
            this.pd.setCancelable(false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            ImgProcess.this.SaveImage();
            return null;
        }
    }

    static Bitmap decodeSampledBitmapFromResource(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public Bitmap getResizedBitmap(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = -1;
        if (height > width) {
            int i3 = this.wwidth;
            double d = width;
            double d2 = height;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double d4 = i3;
            Double.isNaN(d4);
            i2 = (int) (d4 * d3);
            i = i3;
        } else if (width > height) {
            i2 = this.wwidth;
            double d5 = height;
            double d6 = width;
            Double.isNaN(d5);
            Double.isNaN(d6);
            double d7 = d5 / d6;
            double d8 = i2;
            Double.isNaN(d8);
            i = (int) (d8 * d7);
        } else if (height == width) {
            i2 = this.wwidth;
            i = i2;
        } else {
            i = -1;
        }
        return Bitmap.createScaledBitmap(bitmap, i2, i, false);
    }

    public static int getOrientation(Context context, Uri uri) {
        Cursor query = context.getContentResolver().query(uri, new String[]{"orientation"}, null, null, null);
        if (query == null) {
            return 0;
        }
        if (query.getCount() > 1) {
            return -1;
        }
        query.moveToFirst();
        return query.getInt(0);
    }

    static int calculateInSampleSizeB(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int round = Math.round(i3 / i2);
        int round2 = Math.round(i4 / i);
        return round < round2 ? round : round2;
    }

    public String getRealPathFromURIB(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            return cursor.getString(columnIndexOrThrow);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private boolean checkPermissions() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.permissions) {
            if (ContextCompat.checkSelfPermission(this, str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        ActivityCompat.requestPermissions(this, (String[]) arrayList.toArray(new String[arrayList.size()]), 100);
        return false;
    }

    private String getPathFromUri(Uri uri) {
        return RealPathUtil.getPath(this, uri);
    }

    public Bitmap getBitmapFromUri(Uri uri, boolean z, boolean z2) {
        String pathFromUri;
        int orientation;
        if (uri == null) {
            return null;
        }
        try {
            if (z) {
                pathFromUri = uri.toString();
            } else {
                pathFromUri = getPathFromUri(uri);
            }
            Log.i("NewPencilCamera", pathFromUri);
            File file = new File(pathFromUri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            options.inSampleSize = calculateInSampleSizeB(options, this.wwidth, this.height);
            if (options.inSampleSize == 1) {
                options.inSampleSize = 2;
            }
            if (Build.VERSION.SDK_INT > 11) {
                options.inMutable = true;
            }
            options.inJustDecodeBounds = false;
            Bitmap decodeFile = BitmapFactory.decodeFile(pathFromUri, options);
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(new File(uri + "").getAbsolutePath());
                sb.append("");
                orientation = new ExifInterface(sb.toString()).getAttributeInt("Orientation", 1);
            } else {
                orientation = getOrientation(this, uri);
            }
            Log.i(orientation + " ", "From Pict");
            return ExifUtil.rotateBitmap(pathFromUri, decodeFile);
        } catch (Exception e) {
            Log.e("Exception", e.toString());
            return null;
        } catch (OutOfMemoryError unused) {
            this.outMem = true;
            return null;
        }
    }

    public class bitmap_load extends AsyncTask<Void, Void, Void> {
        Uri pathgh;
        ProgressDialog pd;

        public bitmap_load(Uri uri) {
            this.pathgh = uri;
            ImgProcess.this.input = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r5) {
            super.onPostExecute((bitmap_load) r5);
            this.pd.dismiss();
            if (!ImgProcess.this.outMem && !ImgProcess.this.selectChange.booleanValue()) {
                ImgProcess.this.imge.setImageBitmap(ImgProcess.this.input);
                ImgProcess.this.new simple_Pencil(this.pathgh, 2).execute(new Void[0]);
            } else if (ImgProcess.this.outMem || ImgProcess.this.selectChange.booleanValue()) {
                if (ImgProcess.this.outMem) {
                    ImgProcess.this.alertForOutMemory(true);
                } else {
                    ImgProcess.this.alertForOutMemory(false);
                }
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(ImgProcess.this);
            this.pd = progressDialog;
            progressDialog.show();
            this.pd.setContentView(R.layout.forprogress);
            this.pd.setCancelable(false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            Log.i("PencilCamera", ImgProcess.this.from + "");
            if (!ImgProcess.this.from) {
                ImgProcess imgProcess = ImgProcess.this;
                Bitmap bitmapFromUri = imgProcess.getBitmapFromUri(imgProcess.pathd, false, false);
                if (ImgProcess.this.outMem || ImgProcess.this.selectChange.booleanValue()) {
                    return null;
                }
                ImgProcess imgProcess2 = ImgProcess.this;
                imgProcess2.input = imgProcess2.getResizedBitmap(bitmapFromUri);
                return null;
            }
            ImgProcess imgProcess3 = ImgProcess.this;
            Bitmap bitmapFromUri2 = imgProcess3.getBitmapFromUri(imgProcess3.pathd, true, true);
            if (ImgProcess.this.outMem || ImgProcess.this.selectChange.booleanValue()) {
                return null;
            }
            ImgProcess imgProcess4 = ImgProcess.this;
            imgProcess4.input = imgProcess4.getResizedBitmap(bitmapFromUri2);
            return null;
        }
    }

    public class simple_Pencil extends AsyncTask<Void, Void, Void> {
        Bitmap inp;
        Bitmap out = null;
        ProgressDialog pd;
        int type;

        public simple_Pencil(Uri uri, int i) {
            this.type = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r2) {
            super.onPostExecute((simple_Pencil) r2);
            this.pd.dismiss();
            if (!ImgProcess.this.outMem && !ImgProcess.this.selectChange.booleanValue()) {
                ImgProcess.this.imge.setImageBitmap(this.out);
                this.inp.recycle();
                ImgProcess.this.output = null;
                ImgProcess.this.output = Bitmap.createBitmap(this.out);
            } else if (ImgProcess.this.outMem || ImgProcess.this.selectChange.booleanValue()) {
                if (ImgProcess.this.outMem) {
                    ImgProcess.this.alertForOutMemory(true);
                } else {
                    ImgProcess.this.alertForOutMemory(false);
                }
            }
            System.gc();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(ImgProcess.this);
            this.pd = progressDialog;
            progressDialog.show();
            this.pd.setContentView(R.layout.forprogress);
            this.pd.setCancelable(false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            if (!ImgProcess.this.from) {
                ImgProcess imgProcess = ImgProcess.this;
                Bitmap bitmapFromUri = imgProcess.getBitmapFromUri(imgProcess.pathd, false, false);
                if (!ImgProcess.this.selectChange.booleanValue() && !ImgProcess.this.outMem) {
                    this.inp = ImgProcess.this.getResizedBitmap(bitmapFromUri);
                }
            } else {
                ImgProcess imgProcess2 = ImgProcess.this;
                Bitmap bitmapFromUri2 = imgProcess2.getBitmapFromUri(imgProcess2.pathd, true, true);
                if (!ImgProcess.this.selectChange.booleanValue() && !ImgProcess.this.outMem) {
                    this.inp = ImgProcess.this.getResizedBitmap(bitmapFromUri2);
                }
            }
            if (ImgProcess.this.selectChange.booleanValue() || ImgProcess.this.outMem) {
                return null;
            }
            this.inp.getWidth();
            this.inp.getHeight();
            BitmapConversions bitmapConversions = new BitmapConversions();
            new Conve();
            Bitmap grayscale = bitmapConversions.toGrayscale(this.inp);
            Bitmap ConvertToNegative = bitmapConversions.ConvertToNegative(grayscale);
            Bitmap createBitmap = Bitmap.createBitmap(ConvertToNegative.getWidth(), ConvertToNegative.getHeight(), Bitmap.Config.ARGB_8888);
            int i = this.type;
            if (i == 1) {
                createBitmap = Conve.fastblur(ImgProcess.this, ConvertToNegative, 3);
            } else if (i == 2) {
                createBitmap = Conve.fastblur(ImgProcess.this, ConvertToNegative, 7);
            } else if (i == 3) {
                createBitmap = Conve.fastblur(ImgProcess.this, ConvertToNegative, 11);
            }
            this.out = ImgProcess.this.ColorDodgeBlend(createBitmap, grayscale);
            return null;
        }
    }

    public void alertForOutMemory(boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Memory Exceeds!");
        if (z) {
            builder.setMessage("Cannot load that much big size image. Select other!");
        } else {
            builder.setMessage("Cannot load that much big size image. Select other!");
        }
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.techno_world.pencil.sketch.camera.ImgProcess.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                ImgProcess.this.finish();
            }
        });
        builder.show();
    }

    public Bitmap ColorDodgeBlend(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Bitmap copy2 = bitmap2.copy(Bitmap.Config.ARGB_8888, false);
        IntBuffer allocate = IntBuffer.allocate(copy.getWidth() * copy.getHeight());
        copy.copyPixelsToBuffer(allocate);
        allocate.rewind();
        IntBuffer allocate2 = IntBuffer.allocate(copy2.getWidth() * copy2.getHeight());
        copy2.copyPixelsToBuffer(allocate2);
        allocate2.rewind();
        IntBuffer allocate3 = IntBuffer.allocate(copy.getWidth() * copy.getHeight());
        allocate3.rewind();
        while (allocate3.position() < allocate3.limit()) {
            int i = allocate2.get();
            int i2 = allocate.get();
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            allocate3.put(Color.argb(255, colordodge(red, Color.red(i2)), colordodge(green, Color.green(i2)), colordodge(blue, Color.blue(i2))));
        }
        allocate3.rewind();
        copy.copyPixelsFromBuffer(allocate3);
        copy2.recycle();
        return copy;
    }

    private int colordodge(int i, int i2) {
        float f = i2;
        float f2 = i;
        if (f < 255.0f) {
            f = Math.min(255.0f, (((long) f2) << 8) / (255.0f - f));
        }
        return (int) f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_save /* 2131230835 */:
                if (this.output != null) {
                    new bitmap_save(false).execute(new Void[0]);
                    break;
                }
                break;
            case R.id.btn_share /* 2131230836 */:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("image/jpeg");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(Environment.getStorageDirectory() + "/PencilSketch/" + this.session + ".PNG")));
                startActivity(Intent.createChooser(intent, "Share Sketch"));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0093 -> B:12:0x0096). Please report as a decompilation issue!!! */
    public void SaveImage() {
        FileOutputStream fileOutputStream;
        Calendar calendar = Calendar.getInstance();
        this.session = calendar.get(2) + "_" + calendar.get(5) + "_" + calendar.getTimeInMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append("/PencilSketch/");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(new File(file, this.session + ".PNG").toString());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            fileOutputStream2 = fileOutputStream2;
        }
        try {
            Bitmap bitmap = this.output;
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            bitmap.compress(compressFormat, 90, fileOutputStream);
            fileOutputStream.close();
            fileOutputStream2 = compressFormat;
        } catch (Exception e3) {
            e = e3;
            fileOutputStream3 = fileOutputStream;
            e.printStackTrace();
            fileOutputStream2 = fileOutputStream3;
            if (fileOutputStream3 != null) {
                fileOutputStream3.close();
                fileOutputStream2 = fileOutputStream3;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        displayInterstitial();
        super.onBackPressed();
    }

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
}
