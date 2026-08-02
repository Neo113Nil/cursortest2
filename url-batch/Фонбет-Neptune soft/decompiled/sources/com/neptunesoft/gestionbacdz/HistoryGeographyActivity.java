package com.neptunesoft.gestionbacdz;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.neptunesoft.gestionbacdz.adapter.AdapterTutorialsMultiView;
import com.neptunesoft.gestionbacdz.classobjects.Separate;
import com.neptunesoft.gestionbacdz.classobjects.Tutorials;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;

/* loaded from: classes.dex */
public class HistoryGeographyActivity extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DIALOG_DOWNLOAD_PROGRESSE = 1;
    static AdapterTutorialsMultiView adapterTutorials;
    public static String file_Name;
    public static Handler handler = new Handler();
    static RecyclerView hisgeoRecyclerView;
    static HistoryGeographyActivity instance;
    static boolean isCancelled;
    public static List<Object> list;
    boolean ad_showing;
    private AlertDialog dialog_connect_internet;
    private AlertDialog dialog_download_files;
    private AlertDialog dialog_internet_low;
    private AlertDialog dialog_nointernet;
    private ProgressDialog dialog_wait_check;
    int lengthofFileDownload;
    InterstitialAd mInterstitialAd;
    private ProgressDialog progressDialog;
    StorageReference storageRef;
    StorageReference storageReference;
    PowerManager.WakeLock wakeLock;
    private final String[] cours_his_geo = {"", "cour_ge_his_1.pdf", "cour_ge_his_2.pdf", "cour_ge_his_3.pdf", "cour_ge_his_4.pdf", "cour_ge_his_5.pdf", "cour_ge_his_6.pdf", "cour_ge_his_7.pdf", "cour_ge_his_8.pdf", "cour_ge_his_9.pdf", "cour_ge_his_10.pdf", "enplus_l_his_1.pdf", "enplus_l_his_2.pdf", "enplus_l_his_3.pdf", "enplus_l_his_4.pdf", "enplus_l_his_5.pdf", "", "cour_ge_geo_1.pdf", "cour_ge_geo_2.pdf", "cour_ge_geo_3.pdf", "cour_ge_geo_4.pdf", "cour_ge_geo_5.pdf", "cour_ge_geo_6.pdf", "cour_ge_geo_7.pdf", "cour_ge_geo_8.pdf", "cour_ge_geo_9.pdf", "enplus_l_geo_1.pdf", "enplus_l_geo_2.pdf", "enplus_l_geo_3.pdf", "enplus_l_geo_4.pdf"};
    int count_time_wait = -1;
    Runnable time_wait_out = new Runnable() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity.3
        @Override // java.lang.Runnable
        public void run() {
            if (HistoryGeographyActivity.this.count_time_wait < 15) {
                HistoryGeographyActivity.this.count_time_wait++;
                HistoryGeographyActivity.handler.postDelayed(HistoryGeographyActivity.this.time_wait_out, 1000L);
                return;
            }
            if (!HistoryGeographyActivity.this.test_connection()) {
                HistoryGeographyActivity.this.no_connection();
            } else if (!HistoryGeographyActivity.this.ad_showing) {
                HistoryGeographyActivity.this.connection_low();
            }
            HistoryGeographyActivity.this.count_time_wait = -1;
            HistoryGeographyActivity.this.getWindow().clearFlags(128);
            HistoryGeographyActivity.handler.removeCallbacks(HistoryGeographyActivity.this.time_wait_out);
        }
    };
    Runnable buffer_onPostExecute = new Runnable() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity.4
        @Override // java.lang.Runnable
        public void run() {
            if (HistoryGeographyActivity.this.progressDialog != null) {
                HistoryGeographyActivity.this.progressDialog.setProgress(0);
            }
            HistoryGeographyActivity.this.write_file_download("file_download_hisgeo.txt", "");
            String read_file_download = HistoryGeographyActivity.this.read_file_download("file_download_hisgeo.txt");
            if (read_file_download != null) {
                HistoryGeographyActivity.this.delete_file(read_file_download);
                HistoryGeographyActivity.this.write_file_download("file_download_hisgeo.txt", "");
            }
            try {
                HistoryGeographyActivity.handler.removeCallbacks(HistoryGeographyActivity.this.time_wait_out);
                HistoryGeographyActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                HistoryGeographyActivity.this.close_dialog();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (new File(HistoryGeographyActivity.this.getFilesDir().getAbsoluteFile() + "/" + HistoryGeographyActivity.file_Name).length() == HistoryGeographyActivity.this.lengthofFileDownload) {
                AdapterTutorialsMultiView.changeHisGeo();
                Toast.makeText(HistoryGeographyActivity.this, "تم تحميل الملف بنجاح.", 1).show();
            } else {
                HistoryGeographyActivity.this.delete_file(HistoryGeographyActivity.file_Name);
                Toast.makeText(HistoryGeographyActivity.this, "تعذر عملية تحميل الملف '" + HistoryGeographyActivity.file_Name + "' تحقق من إتصال الجهاز بالشبكة !.", 1).show();
            }
            HistoryGeographyActivity.this.dismissDialog(1);
            HistoryGeographyActivity.this.getWindow().clearFlags(128);
            HistoryGeographyActivity.handler.removeCallbacks(HistoryGeographyActivity.this.buffer_onPostExecute);
        }
    };
    Runnable write_file_download = new Runnable() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity.5
        @Override // java.lang.Runnable
        public void run() {
            HistoryGeographyActivity.this.write_file_download("file_download_hisgeo.txt", HistoryGeographyActivity.file_Name);
            HistoryGeographyActivity.handler.removeCallbacks(HistoryGeographyActivity.this.write_file_download);
        }
    };
    Runnable delete_file = new Runnable() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity.6
        @Override // java.lang.Runnable
        public void run() {
            if (HistoryGeographyActivity.this.files_exist(HistoryGeographyActivity.file_Name)) {
                HistoryGeographyActivity.this.delete_file(HistoryGeographyActivity.file_Name);
            }
            HistoryGeographyActivity.this.write_file_download("file_download_hisgeo.txt", "");
            HistoryGeographyActivity.handler.removeCallbacks(HistoryGeographyActivity.this.delete_file);
        }
    };
    Runnable write_file_download_null = new Runnable() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity.7
        @Override // java.lang.Runnable
        public void run() {
            HistoryGeographyActivity.this.write_file_download("file_download_hisgeo.txt", "");
            HistoryGeographyActivity.handler.removeCallbacks(HistoryGeographyActivity.this.write_file_download_null);
        }
    };

    public static HistoryGeographyActivity getInstance() {
        return instance;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        setContentView(R.layout.activity_history_geography);
        String read_file_download = read_file_download("file_download_hisgeo.txt");
        if (read_file_download != null) {
            delete_file(read_file_download);
            write_file_download("file_download_hisgeo.txt", "");
        }
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda12
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                HistoryGeographyActivity.this.m626xcba4da95(initializationStatus);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.hisgeoRecyclerView);
        hisgeoRecyclerView = recyclerView;
        recyclerView.setHasFixedSize(false);
        hisgeoRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList();
        refreshRecyclerView();
        AdapterTutorialsMultiView adapterTutorialsMultiView = new AdapterTutorialsMultiView(list);
        adapterTutorials = adapterTutorialsMultiView;
        hisgeoRecyclerView.setAdapter(adapterTutorialsMultiView);
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m626xcba4da95(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
        loadAdMobInterstitialAds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdMobInterstitialAds() {
        InterstitialAd.load(this, getString(R.string.Interstitial_UnitId), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                HistoryGeographyActivity.this.mInterstitialAd = interstitialAd;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                HistoryGeographyActivity.this.mInterstitialAd = null;
            }
        });
    }

    public void showInterstitialAds(final String url) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this);
            this.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity.2
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    HistoryGeographyActivity.this.ad_showing = true;
                    HistoryGeographyActivity.this.mInterstitialAd = null;
                    HistoryGeographyActivity.this.loadAdMobInterstitialAds();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    HistoryGeographyActivity.this.ad_showing = false;
                    HistoryGeographyActivity.this.download(url);
                }
            });
        } else {
            download(url);
            loadAdMobInterstitialAds();
        }
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int id) {
        if (id != 1) {
            return null;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.progressDialog = progressDialog;
        progressDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HistoryGeographyActivity.this.m627x1a64e73e(dialogInterface);
            }
        });
        this.progressDialog.setProgressNumberFormat(null);
        this.progressDialog.setTitle("Download...");
        StringBuilder sb = new StringBuilder();
        if (file_Name.length() < 16) {
            sb = new StringBuilder(file_Name);
        } else {
            for (int i = 0; i < 12; i++) {
                sb.append(file_Name.charAt(i));
            }
            sb.insert(0, "...");
        }
        ProgressDialog progressDialog2 = this.progressDialog;
        progressDialog2.setMessage(("إسم الملف : " + ((Object) sb)) + "\nحجم الملف : جاري حساب حجم الملف");
        this.progressDialog.setMax(100);
        this.progressDialog.setProgressStyle(1);
        this.progressDialog.setCancelable(false);
        this.progressDialog.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HistoryGeographyActivity.lambda$onCreateDialog$2(dialogInterface, i2);
            }
        });
        try {
            handler.removeCallbacks(this.time_wait_out);
            this.count_time_wait = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        close_dialog();
        getWindow().addFlags(128);
        this.progressDialog.show();
        return this.progressDialog;
    }

    /* renamed from: lambda$onCreateDialog$1$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m627x1a64e73e(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.progressDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    static /* synthetic */ void lambda$onCreateDialog$2(DialogInterface dialogInterface, int i) {
        isCancelled = true;
        dialogInterface.dismiss();
    }

    private void refreshRecyclerView() {
        if (SplashScreen.darkmode) {
            list.add(new Separate("تاريخ", true));
            if (files_exist(this.cours_his_geo[1])) {
                list.add(new Tutorials("بروز الصراع و تشكل العالم", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("بروز الصراع و تشكل العالم", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[2])) {
                list.add(new Tutorials("الأزمات الدولية في ظل الصراع بين الشرق و الغرب", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("الأزمات الدولية في ظل الصراع بين الشرق و الغرب", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[3])) {
                list.add(new Tutorials("مساعي الانفراج الدولي", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("مساعي الانفراج الدولي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[4])) {
                list.add(new Tutorials("من الثنائية إلى الأحادية القطبية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("من الثنائية إلى الأحادية القطبية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[5])) {
                list.add(new Tutorials("من تبلور الوعي إلى الثورة التحريرية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("من تبلور الوعي إلى الثورة التحريرية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[6])) {
                list.add(new Tutorials("العمل المسلح و رد فعل الاستعمار", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("العمل المسلح و رد فعل الاستعمار", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[7])) {
                list.add(new Tutorials("استعادة السيادة الوطنية و بناء الدولة", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("استعادة السيادة الوطنية و بناء الدولة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[8])) {
                list.add(new Tutorials("تأثير الجزائر و إسهامها في حركة التحرر", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("تأثير الجزائر و إسهامها في حركة التحرر", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[9])) {
                list.add(new Tutorials("العالم الثالث بين تراجع الاستعمار التقليدي و استمرارية حركات التحرر", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("العالم الثالث بين تراجع الاستعمار التقليدي و استمرارية حركات التحرر", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[10])) {
                list.add(new Tutorials("القضية الفلسطينية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("القضية الفلسطينية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[11])) {
                list.add(new Tutorials("طريقة معالجة موضوع التاريخ و الجغرافيا", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("طريقة معالجة موضوع التاريخ و الجغرافيا", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[12])) {
                list.add(new Tutorials("المقالات الشاملة في التاريخ و الجغرافيا", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("المقالات الشاملة في التاريخ و الجغرافيا", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[13])) {
                list.add(new Tutorials("المصطلحات الشاملة في مادة التاريخ", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("المصطلحات الشاملة في مادة التاريخ", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[14])) {
                list.add(new Tutorials("الشخصيات الشاملة في مادة التاريخ", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("الشخصيات الشاملة في مادة التاريخ", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[15])) {
                list.add(new Tutorials("التواريخ الشاملة في مادة التاريخ", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("التواريخ الشاملة في مادة التاريخ", R.drawable.ic_download_dark));
            }
            list.add(new Separate("جغرافيا", true));
            if (files_exist(this.cours_his_geo[17])) {
                list.add(new Tutorials("إشكالية التقدم و التخلف", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("إشكالية التقدم و التخلف", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[18])) {
                list.add(new Tutorials("المبادلات و التنقلات في العالم", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("المبادلات و التنقلات في العالم", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[19])) {
                list.add(new Tutorials("مصادر القوة الاقتصادية للو.م.أ", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("مصادر القوة الاقتصادية للو.م.أ", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[20])) {
                list.add(new Tutorials("ظاهرة التكتل و أثرها في قوة الاتحاد الأوروبي", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("ظاهرة التكتل و أثرها في قوة الاتحاد الأوروبي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[21])) {
                list.add(new Tutorials("العلاقة بين السكان و التنمية في شرق و جنوب شرق آسيا", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("العلاقة بين السكان و التنمية في شرق و جنوب شرق آسيا", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[22])) {
                list.add(new Tutorials("الاقتصاد الجزائري في العالم", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("الاقتصاد الجزائري في العالم", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[23])) {
                list.add(new Tutorials("الجزائر في حوض البحر الأبيض المتوسط", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("الجزائر في حوض البحر الأبيض المتوسط", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[24])) {
                list.add(new Tutorials("السكان و التنمية في الهند", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("السكان و التنمية في الهند", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[25])) {
                list.add(new Tutorials("التنمية في البرازيل", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("التنمية في البرازيل", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[26])) {
                list.add(new Tutorials("الخرائط الشاملة في التاريخ و الجغرافيا", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("الخرائط الشاملة في التاريخ و الجغرافيا", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[27])) {
                list.add(new Tutorials("المصطلحات الشاملة في الجغرافيا", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("المصطلحات الشاملة في الجغرافيا", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[28])) {
                list.add(new Tutorials("الرسومات البيانية", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("الرسومات البيانية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_his_geo[29])) {
                list.add(new Tutorials("اختصارات للحفظ", R.drawable.ic_plus_dark));
                return;
            } else {
                list.add(new Tutorials("اختصارات للحفظ", R.drawable.ic_download_dark));
                return;
            }
        }
        list.add(new Separate("تاريخ", false));
        if (files_exist(this.cours_his_geo[1])) {
            list.add(new Tutorials("بروز الصراع و تشكل العالم", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("بروز الصراع و تشكل العالم", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[2])) {
            list.add(new Tutorials("الأزمات الدولية في ظل الصراع بين الشرق و الغرب", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("الأزمات الدولية في ظل الصراع بين الشرق و الغرب", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[3])) {
            list.add(new Tutorials("مساعي الانفراج الدولي", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("مساعي الانفراج الدولي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[4])) {
            list.add(new Tutorials("من الثنائية إلى الأحادية القطبية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("من الثنائية إلى الأحادية القطبية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[5])) {
            list.add(new Tutorials("من تبلور الوعي إلى الثورة التحريرية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("من تبلور الوعي إلى الثورة التحريرية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[6])) {
            list.add(new Tutorials("العمل المسلح و رد فعل الاستعمار", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("العمل المسلح و رد فعل الاستعمار", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[7])) {
            list.add(new Tutorials("استعادة السيادة الوطنية و بناء الدولة", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("استعادة السيادة الوطنية و بناء الدولة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[8])) {
            list.add(new Tutorials("تأثير الجزائر و إسهامها في حركة التحرر", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("تأثير الجزائر و إسهامها في حركة التحرر", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[9])) {
            list.add(new Tutorials("العالم الثالث بين تراجع الاستعمار التقليدي و استمرارية حركات التحرر", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("العالم الثالث بين تراجع الاستعمار التقليدي و استمرارية حركات التحرر", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[10])) {
            list.add(new Tutorials("القضية الفلسطينية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("القضية الفلسطينية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[11])) {
            list.add(new Tutorials("طريقة معالجة موضوع التاريخ و الجغرافيا", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("طريقة معالجة موضوع التاريخ و الجغرافيا", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[12])) {
            list.add(new Tutorials("المقالات الشاملة في التاريخ و الجغرافيا", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("المقالات الشاملة في التاريخ و الجغرافيا", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[13])) {
            list.add(new Tutorials("المصطلحات الشاملة في مادة التاريخ", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("المصطلحات الشاملة في مادة التاريخ", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[14])) {
            list.add(new Tutorials("الشخصيات الشاملة في مادة التاريخ", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("الشخصيات الشاملة في مادة التاريخ", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[15])) {
            list.add(new Tutorials("التواريخ الشاملة في مادة التاريخ", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("التواريخ الشاملة في مادة التاريخ", R.drawable.ic_download));
        }
        list.add(new Separate("جغرافيا", false));
        if (files_exist(this.cours_his_geo[17])) {
            list.add(new Tutorials("إشكالية التقدم و التخلف", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("إشكالية التقدم و التخلف", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[18])) {
            list.add(new Tutorials("المبادلات و التنقلات في العالم", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("المبادلات و التنقلات في العالم", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[19])) {
            list.add(new Tutorials("مصادر القوة الاقتصادية للو.م.أ", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("مصادر القوة الاقتصادية للو.م.أ", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[20])) {
            list.add(new Tutorials("ظاهرة التكتل و أثرها في قوة الاتحاد الأوروبي", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("ظاهرة التكتل و أثرها في قوة الاتحاد الأوروبي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[21])) {
            list.add(new Tutorials("العلاقة بين السكان و التنمية في شرق و جنوب شرق آسيا", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("العلاقة بين السكان و التنمية في شرق و جنوب شرق آسيا", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[22])) {
            list.add(new Tutorials("الاقتصاد الجزائري في العالم", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("الاقتصاد الجزائري في العالم", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[23])) {
            list.add(new Tutorials("الجزائر في حوض البحر الأبيض المتوسط", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("الجزائر في حوض البحر الأبيض المتوسط", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[24])) {
            list.add(new Tutorials("السكان و التنمية في الهند", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("السكان و التنمية في الهند", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[25])) {
            list.add(new Tutorials("التنمية في البرازيل", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("التنمية في البرازيل", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[26])) {
            list.add(new Tutorials("الخرائط الشاملة في التاريخ و الجغرافيا", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("الخرائط الشاملة في التاريخ و الجغرافيا", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[27])) {
            list.add(new Tutorials("المصطلحات الشاملة في الجغرافيا", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("المصطلحات الشاملة في الجغرافيا", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[28])) {
            list.add(new Tutorials("الرسومات البيانية", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("الرسومات البيانية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_his_geo[29])) {
            list.add(new Tutorials("اختصارات للحفظ", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("اختصارات للحفظ", R.drawable.ic_download));
        }
    }

    public void connection_low() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_internet_low = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HistoryGeographyActivity.this.m618xcd0ceb50(dialogInterface);
            }
        });
        this.dialog_internet_low.setCancelable(false);
        this.dialog_internet_low.setMessage("تعذر عملية الإتصال بالخادم, حاول مرة أخرى !.");
        this.dialog_internet_low.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_internet_low.show();
    }

    /* renamed from: lambda$connection_low$3$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m618xcd0ceb50(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_internet_low.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void no_connection() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_nointernet = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HistoryGeographyActivity.this.m625x4a60de1(dialogInterface);
            }
        });
        this.dialog_nointernet.setCancelable(false);
        this.dialog_nointernet.setMessage("لا يوجد إتصال بالشبكة !.");
        this.dialog_nointernet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_nointernet.show();
    }

    /* renamed from: lambda$no_connection$5$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m625x4a60de1(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_nointernet.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    private void dialog_wait() {
        getWindow().addFlags(128);
        close_dialog();
        this.count_time_wait = 0;
        handler.postDelayed(this.time_wait_out, 1000L);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog_wait_check = progressDialog;
        progressDialog.setCancelable(false);
        this.dialog_wait_check.show();
        this.dialog_wait_check.setContentView(R.layout.progressdialogdownloadfiles);
    }

    private void download_files(final String fileName) {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_download_files = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda13
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HistoryGeographyActivity.this.m619xa160e2e1(dialogInterface);
            }
        });
        this.dialog_download_files.setCancelable(false);
        this.dialog_download_files.setMessage("هل تريد تحميل الملف ؟.");
        this.dialog_download_files.setButton(-1, "تحميل", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda14
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HistoryGeographyActivity.this.m620xcab53822(fileName, dialogInterface, i);
            }
        });
        this.dialog_download_files.setButton(-2, "رفض", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda15
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HistoryGeographyActivity.this.m621xf4098d63(dialogInterface, i);
            }
        });
        this.dialog_download_files.show();
    }

    /* renamed from: lambda$download_files$7$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m619xa160e2e1(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_download_files.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.dialog_download_files.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$download_files$8$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m620xcab53822(String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (test_connection()) {
            dialog_wait();
            getWindow().addFlags(128);
            geturl_download(str);
            return;
        }
        no_connection();
    }

    /* renamed from: lambda$download_files$9$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m621xf4098d63(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void download(String url_file) {
        isCancelled = false;
        StringBuilder sb = new StringBuilder();
        if (file_Name.length() < 16) {
            sb = new StringBuilder(file_Name);
        } else {
            for (int i = 0; i < 12; i++) {
                sb.append(file_Name.charAt(i));
            }
            sb.insert(0, "...");
        }
        String str = "إسم الملف : " + ((Object) sb);
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            progressDialog.setMessage(str + "\nحجم الملف : جاري حساب حجم الملف");
        }
        new DownloadFileAsync().execute(url_file);
    }

    public void geturl_download(String fileName) {
        file_Name = fileName;
        StorageReference reference = FirebaseStorage.getInstance().getReference();
        this.storageReference = reference;
        this.storageRef = reference.child(fileName);
        write_file_download("file_download_hisgeo.txt", fileName);
        this.storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                HistoryGeographyActivity.this.m622x65753463((Uri) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                HistoryGeographyActivity.this.m624xe1723426(exc);
            }
        });
    }

    /* renamed from: lambda$geturl_download$10$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m622x65753463(Uri uri) {
        if (this.count_time_wait != -1) {
            showInterstitialAds(uri.toString());
        }
    }

    /* renamed from: lambda$geturl_download$13$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m624xe1723426(Exception exc) {
        try {
            handler.removeCallbacks(this.time_wait_out);
            this.count_time_wait = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        close_dialog();
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HistoryGeographyActivity.this.m623x8ec989a4(create, dialogInterface);
            }
        });
        create.setTitle("Error !.");
        create.setMessage("عذرا هناك خطأ في الحصول على رابط تحميل الملف من الخادم, و ذلك بسبب كمية البيانات المحدودة و الخاصة بتحميل ملفات التطبيق على هواتفكم نحن نعمل على توسيع خدماتنا على مستوى الخوادم الخاصة بـ Firebase نتمنى أن تتفهم المشكلة كما يمكنك المحاولة من حين إلى آخر في مدة أقصاها 24 ساعة .");
        create.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda11
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$geturl_download$11$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m623x8ec989a4(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    public String read_file_download(String file_name_read) {
        FileInputStream fileInputStream = null;
        try {
            try {
                fileInputStream = openFileInput(file_name_read);
                String readLine = new BufferedReader(new InputStreamReader(fileInputStream)).readLine();
                if (fileInputStream == null) {
                    return readLine;
                }
                try {
                    fileInputStream.close();
                    return readLine;
                } catch (IOException e) {
                    e.printStackTrace();
                    return readLine;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return "";
            }
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public void delete_file(String FILE_NAME) {
        File file = new File(getFilesDir(), FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    public void write_file_download(String file, String file_name_download) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    PrintWriter printWriter = new PrintWriter(openFileOutput(file, 0));
                    printWriter.print("");
                    printWriter.close();
                    fileOutputStream = openFileOutput(file, 0);
                    fileOutputStream.write(file_name_download.getBytes());
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public boolean files_exist(String fileName) {
        return new File(getFilesDir(), fileName).exists();
    }

    public void openContent(String fileName) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PdfGalleryActivity.class);
        intent.putExtra("ViewType", "assets");
        if (files_exist(fileName)) {
            PdfGalleryActivity.setDir_file(fileName);
            startActivity(intent);
        } else if (test_connection()) {
            download_files(fileName);
        } else {
            connect_internet();
        }
    }

    public boolean test_connection() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    private void connect_internet() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_connect_internet = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HistoryGeographyActivity.this.m617xd20aca45(dialogInterface);
            }
        });
        this.dialog_connect_internet.setCancelable(false);
        this.dialog_connect_internet.setMessage("قم بالإتصال بالشبكة لتحميل الملف");
        this.dialog_connect_internet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.HistoryGeographyActivity$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_connect_internet.show();
    }

    /* renamed from: lambda$connect_internet$14$com-neptunesoft-gestionbacdz-HistoryGeographyActivity, reason: not valid java name */
    /* synthetic */ void m617xd20aca45(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_connect_internet.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    public void close_dialog() {
        AlertDialog alertDialog = this.dialog_download_files;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.dialog_download_files.cancel();
        }
        AlertDialog alertDialog2 = this.dialog_internet_low;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.dialog_internet_low.cancel();
        }
        AlertDialog alertDialog3 = this.dialog_nointernet;
        if (alertDialog3 != null && alertDialog3.isShowing()) {
            this.dialog_nointernet.cancel();
        }
        ProgressDialog progressDialog = this.dialog_wait_check;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.dialog_wait_check.cancel();
        }
        AlertDialog alertDialog4 = this.dialog_connect_internet;
        if (alertDialog4 != null && alertDialog4.isShowing()) {
            this.dialog_connect_internet.cancel();
        }
        ProgressDialog progressDialog2 = this.progressDialog;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.progressDialog.cancel();
        }
        getWindow().clearFlags(128);
    }

    public class DownloadFileAsync extends AsyncTask<String, String, String> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public DownloadFileAsync() {
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            try {
                HistoryGeographyActivity.handler.removeCallbacks(HistoryGeographyActivity.this.time_wait_out);
                HistoryGeographyActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                HistoryGeographyActivity.this.dialog_wait_check.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (HistoryGeographyActivity.this.progressDialog != null) {
                HistoryGeographyActivity.this.progressDialog.setProgress(0);
            }
            HistoryGeographyActivity.this.showDialog(1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(String s) {
            HistoryGeographyActivity.handler.postDelayed(HistoryGeographyActivity.this.buffer_onPostExecute, 100L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(String... values) {
            super.onProgressUpdate((Object[]) values);
            Log.d("ANDRO_ASYNC", values[0]);
            HistoryGeographyActivity.this.progressDialog.setProgress(Integer.parseInt(values[0]));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(String... strings) {
            try {
                HistoryGeographyActivity.this.wakeLock.acquire(500000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                URL url = new URL(strings[0]);
                int contentLength = url.openConnection().getContentLength();
                HistoryGeographyActivity.this.lengthofFileDownload = contentLength;
                publishProgress("0");
                String format = new DecimalFormat("##.##").format(r0.getContentLength() / 1048576.0f);
                StringBuilder sb = new StringBuilder();
                if (HistoryGeographyActivity.file_Name.length() < 16) {
                    sb = new StringBuilder(HistoryGeographyActivity.file_Name);
                } else {
                    for (int i = 0; i < 12; i++) {
                        sb.append(HistoryGeographyActivity.file_Name.charAt(i));
                    }
                    sb.insert(0, "...");
                }
                String str = "إسم الملف : " + ((Object) sb);
                String str2 = "حجم الملف : " + format + " م.ب";
                try {
                    HistoryGeographyActivity.this.progressDialog.setMessage(str + IOUtils.LINE_SEPARATOR_UNIX + str2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                HistoryGeographyActivity.this.progressDialog.setMax(100);
                HistoryGeographyActivity.handler.postDelayed(HistoryGeographyActivity.this.write_file_download, 0L);
                FileOutputStream openFileOutput = HistoryGeographyActivity.this.openFileOutput(HistoryGeographyActivity.file_Name, 0);
                Log.d("ANDRO_ASYNC", "Length of file: " + contentLength);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(openFileOutput.getFD());
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1 || HistoryGeographyActivity.isCancelled) {
                        break;
                    }
                    j += read;
                    publishProgress("" + ((int) ((100 * j) / contentLength)));
                    fileOutputStream.write(bArr, 0, read);
                }
                if (HistoryGeographyActivity.isCancelled) {
                    cancel(true);
                    HistoryGeographyActivity.handler.postDelayed(HistoryGeographyActivity.this.delete_file, 0L);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                openFileOutput.close();
                HistoryGeographyActivity.handler.postDelayed(HistoryGeographyActivity.this.write_file_download_null, 0L);
            } catch (Exception e3) {
                HistoryGeographyActivity.this.dismissDialog(1);
                e3.printStackTrace();
            }
            try {
                HistoryGeographyActivity.this.wakeLock.release();
                return null;
            } catch (Exception e4) {
                e4.printStackTrace();
                return null;
            }
        }
    }
}
