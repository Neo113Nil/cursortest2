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
import com.neptunesoft.gestionbacdz.adapter.AdapterTutorials;
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
public class LawActivity extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DIALOG_DOWNLOAD_PROGRESSE = 1;
    static AdapterTutorials adapterTutorials;
    public static String file_Name;
    public static Handler handler = new Handler();
    static LawActivity instance;
    static boolean isCancelled;
    static RecyclerView lawRecyclerView;
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
    private final String[] cours_law = {"cour_ge_droit_1.pdf", "cour_ge_droit_2.pdf", "cour_ge_droit_3.pdf", "cour_ge_droit_4.pdf", "cour_ge_droit_5.pdf", "cour_ge_droit_6.pdf", "cour_ge_droit_7.pdf", "cour_ge_droit_8.pdf", "cour_ge_droit_9.pdf", "cour_ge_droit_10.pdf", "cour_ge_droit_11.pdf", "resume_ge_droit_1.pdf"};
    int count_time_wait = -1;
    Runnable time_wait_out = new Runnable() { // from class: com.neptunesoft.gestionbacdz.LawActivity.3
        @Override // java.lang.Runnable
        public void run() {
            if (LawActivity.this.count_time_wait < 15) {
                LawActivity.this.count_time_wait++;
                LawActivity.handler.postDelayed(LawActivity.this.time_wait_out, 1000L);
                return;
            }
            if (!LawActivity.this.test_connection()) {
                LawActivity.this.no_connection();
            } else if (!LawActivity.this.ad_showing) {
                LawActivity.this.connection_low();
            }
            LawActivity.this.count_time_wait = -1;
            LawActivity.this.getWindow().clearFlags(128);
            LawActivity.handler.removeCallbacks(LawActivity.this.time_wait_out);
        }
    };
    Runnable buffer_onPostExecute = new Runnable() { // from class: com.neptunesoft.gestionbacdz.LawActivity.4
        @Override // java.lang.Runnable
        public void run() {
            if (LawActivity.this.progressDialog != null) {
                LawActivity.this.progressDialog.setProgress(0);
            }
            LawActivity.this.write_file_download("file_download_law.txt", "");
            String read_file_download = LawActivity.this.read_file_download("file_download_law.txt");
            if (read_file_download != null) {
                LawActivity.this.delete_file(read_file_download);
                LawActivity.this.write_file_download("file_download_law.txt", "");
            }
            try {
                LawActivity.handler.removeCallbacks(LawActivity.this.time_wait_out);
                LawActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                LawActivity.this.close_dialog();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (new File(LawActivity.this.getFilesDir().getAbsoluteFile() + "/" + LawActivity.file_Name).length() == LawActivity.this.lengthofFileDownload) {
                AdapterTutorials.changeLaw();
                Toast.makeText(LawActivity.this, "تم تحميل الملف بنجاح.", 1).show();
            } else {
                LawActivity.this.delete_file(LawActivity.file_Name);
                Toast.makeText(LawActivity.this, "تعذر عملية تحميل الملف '" + LawActivity.file_Name + "' تحقق من إتصال الجهاز بالشبكة !.", 1).show();
            }
            LawActivity.this.dismissDialog(1);
            LawActivity.this.getWindow().clearFlags(128);
            LawActivity.handler.removeCallbacks(LawActivity.this.buffer_onPostExecute);
        }
    };
    Runnable write_file_download = new Runnable() { // from class: com.neptunesoft.gestionbacdz.LawActivity.5
        @Override // java.lang.Runnable
        public void run() {
            LawActivity.this.write_file_download("file_download_law.txt", LawActivity.file_Name);
            LawActivity.handler.removeCallbacks(LawActivity.this.write_file_download);
        }
    };
    Runnable delete_file = new Runnable() { // from class: com.neptunesoft.gestionbacdz.LawActivity.6
        @Override // java.lang.Runnable
        public void run() {
            if (LawActivity.this.files_exist(LawActivity.file_Name)) {
                LawActivity.this.delete_file(LawActivity.file_Name);
            }
            LawActivity.this.write_file_download("file_download_law.txt", "");
            LawActivity.handler.removeCallbacks(LawActivity.this.delete_file);
        }
    };
    Runnable write_file_download_null = new Runnable() { // from class: com.neptunesoft.gestionbacdz.LawActivity.7
        @Override // java.lang.Runnable
        public void run() {
            LawActivity.this.write_file_download("file_download_law.txt", "");
            LawActivity.handler.removeCallbacks(LawActivity.this.write_file_download_null);
        }
    };

    public static LawActivity getInstance() {
        return instance;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        setContentView(R.layout.activity_law);
        String read_file_download = read_file_download("file_download_law.txt");
        if (read_file_download != null) {
            delete_file(read_file_download);
            write_file_download("file_download_law.txt", "");
        }
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                LawActivity.this.m658lambda$onCreate$0$comneptunesoftgestionbacdzLawActivity(initializationStatus);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lawRecyclerView);
        lawRecyclerView = recyclerView;
        recyclerView.setHasFixedSize(false);
        lawRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList();
        refreshRecyclerView();
        AdapterTutorials adapterTutorials2 = new AdapterTutorials(list, "law");
        adapterTutorials = adapterTutorials2;
        lawRecyclerView.setAdapter(adapterTutorials2);
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m658lambda$onCreate$0$comneptunesoftgestionbacdzLawActivity(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
        loadAdMobInterstitialAds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdMobInterstitialAds() {
        InterstitialAd.load(this, getString(R.string.Interstitial_UnitId), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.neptunesoft.gestionbacdz.LawActivity.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                LawActivity.this.mInterstitialAd = interstitialAd;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                LawActivity.this.mInterstitialAd = null;
            }
        });
    }

    public void showInterstitialAds(final String url) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this);
            this.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.neptunesoft.gestionbacdz.LawActivity.2
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    LawActivity.this.ad_showing = true;
                    LawActivity.this.mInterstitialAd = null;
                    LawActivity.this.loadAdMobInterstitialAds();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    LawActivity.this.ad_showing = false;
                    LawActivity.this.download(url);
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
        progressDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                LawActivity.this.m659lambda$onCreateDialog$1$comneptunesoftgestionbacdzLawActivity(dialogInterface);
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
        this.progressDialog.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda11
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LawActivity.lambda$onCreateDialog$2(dialogInterface, i2);
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

    /* renamed from: lambda$onCreateDialog$1$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m659lambda$onCreateDialog$1$comneptunesoftgestionbacdzLawActivity(DialogInterface dialogInterface) {
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
            if (files_exist(this.cours_law[0])) {
                list.add(new Tutorials("عقد البيع", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("عقد البيع", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[1])) {
                list.add(new Tutorials("عقد الشركة", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("عقد الشركة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[2])) {
                list.add(new Tutorials("شركة التضامن", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("شركة التضامن", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[3])) {
                list.add(new Tutorials("الشركات ذات المسؤولية المحدودة", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("الشركات ذات المسؤولية المحدودة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[4])) {
                list.add(new Tutorials("شركة المساهمة", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("شركة المساهمة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[5])) {
                list.add(new Tutorials("علاقات العمل الفردية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("علاقات العمل الفردية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[6])) {
                list.add(new Tutorials("علاقات العمل الجماعية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("علاقات العمل الجماعية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[7])) {
                list.add(new Tutorials("الميزانية العامة للدولة و قانون المالية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("الميزانية العامة للدولة و قانون المالية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[8])) {
                list.add(new Tutorials("الضرائب و الرسوم", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("الضرائب و الرسوم", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[9])) {
                list.add(new Tutorials("الضريبة على الدخل الإجمالي", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("الضريبة على الدخل الإجمالي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[10])) {
                list.add(new Tutorials("الرسم على القيمة المضافة", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("الرسم على القيمة المضافة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_law[11])) {
                list.add(new Tutorials("ملخص دروس القانون", R.drawable.ic_plus_dark));
                return;
            } else {
                list.add(new Tutorials("ملخص دروس القانون", R.drawable.ic_download_dark));
                return;
            }
        }
        if (files_exist(this.cours_law[0])) {
            list.add(new Tutorials("عقد البيع", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("عقد البيع", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[1])) {
            list.add(new Tutorials("عقد الشركة", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("عقد الشركة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[2])) {
            list.add(new Tutorials("شركة التضامن", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("شركة التضامن", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[3])) {
            list.add(new Tutorials("الشركات ذات المسؤولية المحدودة", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("الشركات ذات المسؤولية المحدودة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[4])) {
            list.add(new Tutorials("شركة المساهمة", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("شركة المساهمة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[5])) {
            list.add(new Tutorials("علاقات العمل الفردية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("علاقات العمل الفردية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[6])) {
            list.add(new Tutorials("علاقات العمل الجماعية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("علاقات العمل الجماعية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[7])) {
            list.add(new Tutorials("الميزانية العامة للدولة و قانون المالية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("الميزانية العامة للدولة و قانون المالية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[8])) {
            list.add(new Tutorials("الضرائب و الرسوم", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("الضرائب و الرسوم", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[9])) {
            list.add(new Tutorials("الضريبة على الدخل الإجمالي", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("الضريبة على الدخل الإجمالي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[10])) {
            list.add(new Tutorials("الرسم على القيمة المضافة", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("الرسم على القيمة المضافة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_law[11])) {
            list.add(new Tutorials("ملخص دروس القانون", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("ملخص دروس القانون", R.drawable.ic_download));
        }
    }

    public void connection_low() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_internet_low = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda14
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                LawActivity.this.m650lambda$connection_low$3$comneptunesoftgestionbacdzLawActivity(dialogInterface);
            }
        });
        this.dialog_internet_low.setCancelable(false);
        this.dialog_internet_low.setMessage("تعذر عملية الإتصال بالخادم, حاول مرة أخرى !.");
        this.dialog_internet_low.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda15
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_internet_low.show();
    }

    /* renamed from: lambda$connection_low$3$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m650lambda$connection_low$3$comneptunesoftgestionbacdzLawActivity(DialogInterface dialogInterface) {
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
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda12
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                LawActivity.this.m657lambda$no_connection$5$comneptunesoftgestionbacdzLawActivity(dialogInterface);
            }
        });
        this.dialog_nointernet.setCancelable(false);
        this.dialog_nointernet.setMessage("لا يوجد إتصال بالشبكة !.");
        this.dialog_nointernet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda13
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_nointernet.show();
    }

    /* renamed from: lambda$no_connection$5$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m657lambda$no_connection$5$comneptunesoftgestionbacdzLawActivity(DialogInterface dialogInterface) {
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
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                LawActivity.this.m651lambda$download_files$7$comneptunesoftgestionbacdzLawActivity(dialogInterface);
            }
        });
        this.dialog_download_files.setCancelable(false);
        this.dialog_download_files.setMessage("هل تريد تحميل الملف ؟.");
        this.dialog_download_files.setButton(-1, "تحميل", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LawActivity.this.m652lambda$download_files$8$comneptunesoftgestionbacdzLawActivity(fileName, dialogInterface, i);
            }
        });
        this.dialog_download_files.setButton(-2, "رفض", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LawActivity.this.m653lambda$download_files$9$comneptunesoftgestionbacdzLawActivity(dialogInterface, i);
            }
        });
        this.dialog_download_files.show();
    }

    /* renamed from: lambda$download_files$7$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m651lambda$download_files$7$comneptunesoftgestionbacdzLawActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_download_files.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.dialog_download_files.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$download_files$8$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m652lambda$download_files$8$comneptunesoftgestionbacdzLawActivity(String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (test_connection()) {
            dialog_wait();
            getWindow().addFlags(128);
            geturl_download(str);
            return;
        }
        no_connection();
    }

    /* renamed from: lambda$download_files$9$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m653lambda$download_files$9$comneptunesoftgestionbacdzLawActivity(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        getWindow().clearFlags(128);
    }

    public void delete_file(String FILE_NAME) {
        File file = new File(getFilesDir(), FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
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
        write_file_download("file_download_law.txt", fileName);
        this.storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda8
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                LawActivity.this.m654xbc3e3b65((Uri) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LawActivity.this.m656xd26ddac2(exc);
            }
        });
    }

    /* renamed from: lambda$geturl_download$10$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m654xbc3e3b65(Uri uri) {
        if (this.count_time_wait != -1) {
            showInterstitialAds(uri.toString());
        }
    }

    /* renamed from: lambda$geturl_download$13$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m656xd26ddac2(Exception exc) {
        try {
            handler.removeCallbacks(this.time_wait_out);
            this.count_time_wait = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        close_dialog();
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                LawActivity.this.m655xc3a37084(create, dialogInterface);
            }
        });
        create.setTitle("Error !.");
        create.setMessage("عذرا هناك خطأ في الحصول على رابط تحميل الملف من الخادم, و ذلك بسبب كمية البيانات المحدودة و الخاصة بتحميل ملفات التطبيق على هواتفكم نحن نعمل على توسيع خدماتنا على مستوى الخوادم الخاصة بـ Firebase نتمنى أن تتفهم المشكلة كما يمكنك المحاولة من حين إلى آخر في مدة أقصاها 24 ساعة .");
        create.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$geturl_download$11$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m655xc3a37084(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
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
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                LawActivity.this.m649x9da0be43(dialogInterface);
            }
        });
        this.dialog_connect_internet.setCancelable(false);
        this.dialog_connect_internet.setMessage("قم بالإتصال بالشبكة لتحميل الملف");
        this.dialog_connect_internet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.LawActivity$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_connect_internet.show();
    }

    /* renamed from: lambda$connect_internet$14$com-neptunesoft-gestionbacdz-LawActivity, reason: not valid java name */
    /* synthetic */ void m649x9da0be43(DialogInterface dialogInterface) {
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
                LawActivity.handler.removeCallbacks(LawActivity.this.time_wait_out);
                LawActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                LawActivity.this.dialog_wait_check.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (LawActivity.this.progressDialog != null) {
                LawActivity.this.progressDialog.setProgress(0);
            }
            LawActivity.this.showDialog(1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(String s) {
            LawActivity.handler.postDelayed(LawActivity.this.buffer_onPostExecute, 100L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(String... values) {
            super.onProgressUpdate((Object[]) values);
            Log.d("ANDRO_ASYNC", values[0]);
            LawActivity.this.progressDialog.setProgress(Integer.parseInt(values[0]));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(String... strings) {
            try {
                LawActivity.this.wakeLock.acquire(500000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                URL url = new URL(strings[0]);
                int contentLength = url.openConnection().getContentLength();
                LawActivity.this.lengthofFileDownload = contentLength;
                publishProgress("0");
                String format = new DecimalFormat("##.##").format(r0.getContentLength() / 1048576.0f);
                StringBuilder sb = new StringBuilder();
                if (LawActivity.file_Name.length() < 16) {
                    sb = new StringBuilder(LawActivity.file_Name);
                } else {
                    for (int i = 0; i < 12; i++) {
                        sb.append(LawActivity.file_Name.charAt(i));
                    }
                    sb.insert(0, "...");
                }
                String str = "إسم الملف : " + ((Object) sb);
                String str2 = "حجم الملف : " + format + " م.ب";
                try {
                    LawActivity.this.progressDialog.setMessage(str + IOUtils.LINE_SEPARATOR_UNIX + str2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                LawActivity.this.progressDialog.setMax(100);
                LawActivity.handler.postDelayed(LawActivity.this.write_file_download, 0L);
                FileOutputStream openFileOutput = LawActivity.this.openFileOutput(LawActivity.file_Name, 0);
                Log.d("ANDRO_ASYNC", "Length of file: " + contentLength);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(openFileOutput.getFD());
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1 || LawActivity.isCancelled) {
                        break;
                    }
                    j += read;
                    publishProgress("" + ((int) ((100 * j) / contentLength)));
                    fileOutputStream.write(bArr, 0, read);
                }
                if (LawActivity.isCancelled) {
                    cancel(true);
                    LawActivity.handler.postDelayed(LawActivity.this.delete_file, 0L);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                openFileOutput.close();
                LawActivity.handler.postDelayed(LawActivity.this.write_file_download_null, 0L);
            } catch (Exception e3) {
                LawActivity.this.dismissDialog(1);
                e3.printStackTrace();
            }
            try {
                LawActivity.this.wakeLock.release();
                return null;
            } catch (Exception e4) {
                e4.printStackTrace();
                return null;
            }
        }
    }
}
