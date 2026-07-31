package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzrp;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import com.unity3d.services.core.fid.Constants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes5.dex */
public final class zzgs extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private long zzo;
    private String zzp;

    zzgs(zzio zzioVar, long j, long j2) {
        super(zzioVar);
        this.zzo = 0L;
        this.zzp = null;
        this.zzg = j;
        this.zzh = j2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(1:3)(6:81|82|(1:84)(2:99|(1:101))|85|86|(21:88|(1:90)(1:97)|91|92|5|(2:7|(15:11|12|(1:(2:15|(2:17|(2:19|(2:21|(2:23|(1:25)(1:73))(1:74))(1:75))(1:76))(1:77))(1:78))(1:79)|26|(1:28)|29|30|(1:32)(1:69)|33|(3:37|(1:39)(1:41)|40)|(3:43|(1:45)(1:48)|46)|49|(3:51|(1:53)(3:60|(3:63|(1:65)(1:66)|61)|67)|(2:55|56)(2:58|59))|68|(0)(0)))|80|12|(0)(0)|26|(0)|29|30|(0)(0)|33|(4:35|37|(0)(0)|40)|(0)|49|(0)|68|(0)(0)))|4|5|(0)|80|12|(0)(0)|26|(0)|29|30|(0)(0)|33|(0)|(0)|49|(0)|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01da, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fb, code lost:
    
        r12.zzu.zzaW().zze().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r1), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b1 A[Catch: IllegalStateException -> 0x01da, TryCatch #2 {IllegalStateException -> 0x01da, blocks: (B:30:0x018f, B:33:0x01a5, B:35:0x01b1, B:37:0x01b7, B:40:0x01d1, B:41:0x01cd, B:43:0x01de, B:45:0x01f2, B:46:0x01f7, B:48:0x01f5), top: B:29:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cd A[Catch: IllegalStateException -> 0x01da, TryCatch #2 {IllegalStateException -> 0x01da, blocks: (B:30:0x018f, B:33:0x01a5, B:35:0x01b1, B:37:0x01b7, B:40:0x01d1, B:41:0x01cd, B:43:0x01de, B:45:0x01f2, B:46:0x01f7, B:48:0x01f5), top: B:29:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01de A[Catch: IllegalStateException -> 0x01da, TryCatch #2 {IllegalStateException -> 0x01da, blocks: (B:30:0x018f, B:33:0x01a5, B:35:0x01b1, B:37:0x01b7, B:40:0x01d1, B:41:0x01cd, B:43:0x01de, B:45:0x01f2, B:46:0x01f7, B:48:0x01f5), top: B:29:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cf  */
    @Override // com.google.android.gms.measurement.internal.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzd() {
        String str;
        String str2;
        PackageInfo packageInfo;
        zzio zzioVar;
        zzam zzf;
        zzgg zzggVar;
        Object[] objArr;
        zzio zzioVar2;
        int zza;
        List zzt;
        String zzc;
        String zzA;
        zzio zzioVar3 = this.zzu;
        zzioVar3.zzaW().zzj().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzioVar3.zzaT().getPackageName();
        PackageManager packageManager = zzioVar3.zzaT().getPackageManager();
        int i = Integer.MIN_VALUE;
        String str3 = "";
        String str4 = "Unknown";
        String str5 = "unknown";
        if (packageManager == null) {
            zzioVar3.zzaW().zze().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzhe.zzn(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.zzu.zzaW().zze().zzb("Error retrieving app installer package name. appId", zzhe.zzn(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.zzu.zzaT().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                try {
                    str4 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.zzu.zzaW().zze().zzc("Error retrieving package info. appId, appName", zzhe.zzn(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.zza = packageName;
                    this.zzd = str5;
                    this.zzb = str4;
                    this.zzc = i;
                    this.zze = str2;
                    this.zzf = 0L;
                    zzioVar = this.zzu;
                    zzf = zzioVar.zzf();
                    zzggVar = zzgi.zzbp;
                    if (!zzf.zzx(null, zzggVar)) {
                    }
                    objArr = false;
                    zzioVar2 = this.zzu;
                    zza = zzioVar2.zza();
                    if (zza != 0) {
                    }
                    this.zzl = "";
                    this.zzm = "";
                    zzioVar.zzaV();
                    if (objArr != false) {
                    }
                    zzc = zzmg.zzc(zzioVar.zzaT(), AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, zzioVar2.zzA());
                    if (TextUtils.isEmpty(zzc)) {
                    }
                    this.zzl = str3;
                    if (!zzioVar.zzf().zzx(null, zzggVar)) {
                    }
                    if (zza == 0) {
                    }
                    this.zzi = null;
                    zzio zzioVar4 = this.zzu;
                    zzioVar4.zzaV();
                    zzt = zzioVar4.zzf().zzt("analytics.safelisted_events");
                    if (zzt != null) {
                    }
                    this.zzi = zzt;
                    if (packageManager != null) {
                    }
                }
                this.zza = packageName;
                this.zzd = str5;
                this.zzb = str4;
                this.zzc = i;
                this.zze = str2;
                this.zzf = 0L;
                zzioVar = this.zzu;
                zzf = zzioVar.zzf();
                zzggVar = zzgi.zzbp;
                if (!zzf.zzx(null, zzggVar)) {
                    zzio zzioVar5 = this.zzu;
                    if (!TextUtils.isEmpty(zzioVar5.zzx()) && "am".equals(zzioVar5.zzy())) {
                        objArr = true;
                        zzioVar2 = this.zzu;
                        zza = zzioVar2.zza();
                        if (zza != 0) {
                            zzioVar.zzaW().zzj().zza("App measurement collection enabled");
                        } else if (zza == 1) {
                            zzioVar.zzaW().zzi().zza("App measurement deactivated via the manifest");
                        } else if (zza == 3) {
                            zzioVar.zzaW().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (zza == 4) {
                            zzioVar.zzaW().zzi().zza("App measurement disabled via the manifest");
                        } else if (zza == 6) {
                            zzioVar.zzaW().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (zza == 7) {
                            zzioVar.zzaW().zzi().zza("App measurement disabled via the global data collection setting");
                        } else if (zza != 8) {
                            zzioVar.zzaW().zzi().zza("App measurement disabled");
                            zzioVar.zzaW().zzh().zza("Invalid scion state in identity");
                        } else {
                            zzioVar.zzaW().zzi().zza("App measurement disabled due to denied storage consent");
                        }
                        this.zzl = "";
                        this.zzm = "";
                        zzioVar.zzaV();
                        if (objArr != false) {
                            this.zzm = zzioVar2.zzx();
                        }
                        zzc = zzmg.zzc(zzioVar.zzaT(), AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, zzioVar2.zzA());
                        if (TextUtils.isEmpty(zzc)) {
                            str3 = zzc;
                        }
                        this.zzl = str3;
                        if (!zzioVar.zzf().zzx(null, zzggVar) && !TextUtils.isEmpty(zzc)) {
                            Context zzaT = zzioVar.zzaT();
                            zzA = zzioVar2.zzA();
                            Preconditions.checkNotNull(zzaT);
                            Resources resources = zzaT.getResources();
                            if (!TextUtils.isEmpty(zzA)) {
                                zzA = zzig.zza(zzaT);
                            }
                            this.zzm = zzig.zzb("admob_app_id", resources, zzA);
                        }
                        if (zza == 0) {
                            zzioVar.zzaW().zzj().zzc("App measurement enabled for app package, google app id", this.zza, TextUtils.isEmpty(this.zzl) ? this.zzm : this.zzl);
                        }
                        this.zzi = null;
                        zzio zzioVar42 = this.zzu;
                        zzioVar42.zzaV();
                        zzt = zzioVar42.zzf().zzt("analytics.safelisted_events");
                        if (zzt != null) {
                            if (zzt.isEmpty()) {
                                zzioVar42.zzaW().zzl().zza("Safelisted event list is empty. Ignoring");
                            } else {
                                Iterator it = zzt.iterator();
                                while (it.hasNext()) {
                                    if (!zzioVar42.zzw().zzag("safelisted event", (String) it.next())) {
                                        break;
                                    }
                                }
                            }
                            if (packageManager != null) {
                                this.zzk = InstantApps.isInstantApp(zzioVar42.zzaT()) ? 1 : 0;
                                return;
                            } else {
                                this.zzk = 0;
                                return;
                            }
                        }
                        this.zzi = zzt;
                        if (packageManager != null) {
                        }
                    }
                }
                objArr = false;
                zzioVar2 = this.zzu;
                zza = zzioVar2.zza();
                if (zza != 0) {
                }
                this.zzl = "";
                this.zzm = "";
                zzioVar.zzaV();
                if (objArr != false) {
                }
                zzc = zzmg.zzc(zzioVar.zzaT(), AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, zzioVar2.zzA());
                if (TextUtils.isEmpty(zzc)) {
                }
                this.zzl = str3;
                if (!zzioVar.zzf().zzx(null, zzggVar)) {
                    Context zzaT2 = zzioVar.zzaT();
                    zzA = zzioVar2.zzA();
                    Preconditions.checkNotNull(zzaT2);
                    Resources resources2 = zzaT2.getResources();
                    if (!TextUtils.isEmpty(zzA)) {
                    }
                    this.zzm = zzig.zzb("admob_app_id", resources2, zzA);
                }
                if (zza == 0) {
                }
                this.zzi = null;
                zzio zzioVar422 = this.zzu;
                zzioVar422.zzaV();
                zzt = zzioVar422.zzf().zzt("analytics.safelisted_events");
                if (zzt != null) {
                }
                this.zzi = zzt;
                if (packageManager != null) {
                }
            }
        }
        str2 = "Unknown";
        this.zza = packageName;
        this.zzd = str5;
        this.zzb = str4;
        this.zzc = i;
        this.zze = str2;
        this.zzf = 0L;
        zzioVar = this.zzu;
        zzf = zzioVar.zzf();
        zzggVar = zzgi.zzbp;
        if (!zzf.zzx(null, zzggVar)) {
        }
        objArr = false;
        zzioVar2 = this.zzu;
        zza = zzioVar2.zza();
        if (zza != 0) {
        }
        this.zzl = "";
        this.zzm = "";
        zzioVar.zzaV();
        if (objArr != false) {
        }
        zzc = zzmg.zzc(zzioVar.zzaT(), AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, zzioVar2.zzA());
        if (TextUtils.isEmpty(zzc)) {
        }
        this.zzl = str3;
        if (!zzioVar.zzf().zzx(null, zzggVar)) {
        }
        if (zza == 0) {
        }
        this.zzi = null;
        zzio zzioVar4222 = this.zzu;
        zzioVar4222.zzaV();
        zzt = zzioVar4222.zzf().zzt("analytics.safelisted_events");
        if (zzt != null) {
        }
        this.zzi = zzt;
        if (packageManager != null) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return true;
    }

    final int zzh() {
        zza();
        return this.zzk;
    }

    final int zzi() {
        zza();
        return this.zzc;
    }

    final long zzj() {
        return this.zzh;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0251 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzr zzk(String str) {
        Class<?> loadClass;
        Object invoke;
        String str2;
        zzio zzioVar;
        long j;
        long j2;
        List list;
        String str3;
        zzio zzioVar2;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfo;
        zzio zzioVar3;
        zzgg zzggVar;
        long j4;
        zzg();
        String zzm = zzm();
        String zzo = zzo();
        zza();
        String str4 = this.zzb;
        zza();
        long j5 = this.zzc;
        zza();
        Preconditions.checkNotNull(this.zzd);
        String str5 = this.zzd;
        zzio zzioVar4 = this.zzu;
        zzioVar4.zzf().zzj();
        zza();
        zzg();
        long j6 = this.zzf;
        if (j6 == 0) {
            zzqf zzw = this.zzu.zzw();
            Context zzaT = zzioVar4.zzaT();
            String packageName = zzioVar4.zzaT().getPackageName();
            zzw.zzg();
            Preconditions.checkNotNull(zzaT);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = zzaT.getPackageManager();
            MessageDigest zzI = zzqf.zzI();
            if (zzI == null) {
                zzw.zzu.zzaW().zze().zza("Could not get MD5 instance");
                j6 = -1;
            } else {
                if (packageManager != null) {
                    try {
                        if (zzw.zzam(zzaT, packageName)) {
                            j4 = 0;
                        } else {
                            PackageManagerWrapper packageManager2 = Wrappers.packageManager(zzaT);
                            zzio zzioVar5 = zzw.zzu;
                            Signature[] signatureArr = packageManager2.getPackageInfo(zzioVar5.zzaT().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                zzioVar5.zzaW().zzk().zza("Could not get signatures");
                                j4 = -1;
                            } else {
                                j4 = zzqf.zzr(zzI.digest(signatureArr[0].toByteArray()));
                            }
                        }
                        j6 = j4;
                    } catch (PackageManager.NameNotFoundException e) {
                        zzw.zzu.zzaW().zze().zzb("Package name not found", e);
                    }
                }
                j6 = 0;
            }
            this.zzf = j6;
        }
        long j7 = j6;
        zzio zzioVar6 = this.zzu;
        boolean zzJ = zzioVar6.zzJ();
        boolean z = !zzioVar6.zzm().zzm;
        zzg();
        if (zzioVar6.zzJ()) {
            zzrp.zzb();
            if (zzioVar6.zzf().zzx(null, zzgi.zzaG)) {
                this.zzu.zzaW().zzj().zza("Disabled IID for tests.");
            } else {
                try {
                    loadClass = zzioVar6.zzaT().getClassLoader().loadClass(Constants.FID_CLASS);
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    try {
                        invoke = loadClass.getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, this.zzu.zzaT());
                    } catch (Exception unused2) {
                        this.zzu.zzaW().zzm().zza("Failed to obtain Firebase Analytics instance");
                    }
                    if (invoke != null) {
                        try {
                            str2 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                        } catch (Exception unused3) {
                            this.zzu.zzaW().zzl().zza("Failed to retrieve Firebase Instance Id");
                        }
                        zzio zzioVar7 = this.zzu;
                        long zza = zzioVar7.zzm().zzc.zza();
                        long min = zza != 0 ? zzioVar7.zza : Math.min(zzioVar7.zza, zza);
                        zza();
                        int i3 = this.zzk;
                        zzioVar = this.zzu;
                        boolean zzw2 = zzioVar.zzf().zzw();
                        zzht zzm2 = zzioVar.zzm();
                        zzm2.zzg();
                        boolean z2 = zzm2.zzb().getBoolean("deferred_analytics_collection", false);
                        String zzl = zzl();
                        boolean z3 = zzioVar.zzf().zzm("google_analytics_default_allow_ad_personalization_signals", true) == zzju.GRANTED;
                        long j8 = this.zzg;
                        Boolean valueOf = Boolean.valueOf(z3);
                        List list2 = this.zzi;
                        String zzq = zzioVar.zzm().zzh().zzq();
                        if (this.zzj == null) {
                            this.zzj = zzioVar.zzw().zzF();
                        }
                        String str6 = this.zzj;
                        if (zzioVar.zzm().zzh().zzr(zzjw.ANALYTICS_STORAGE)) {
                            j2 = j8;
                            j = 0;
                            str3 = null;
                            list = list2;
                        } else {
                            zzg();
                            j = 0;
                            if (this.zzo == 0) {
                                j2 = j8;
                                list = list2;
                            } else {
                                j2 = j8;
                                list = list2;
                                long currentTimeMillis = zzioVar.zzaU().currentTimeMillis() - this.zzo;
                                if (this.zzn != null && currentTimeMillis > 86400000 && this.zzp == null) {
                                    zzq();
                                }
                            }
                            if (this.zzn == null) {
                                zzq();
                            }
                            str3 = this.zzn;
                        }
                        boolean zzE = zzioVar.zzf().zzE();
                        zzqf zzw3 = zzioVar.zzw();
                        String zzm3 = zzm();
                        zzioVar2 = zzw3.zzu;
                        if (zzioVar2.zzaT().getPackageManager() != null) {
                            j3 = j;
                            i = 0;
                        } else {
                            try {
                                i = 0;
                                try {
                                    applicationInfo = Wrappers.packageManager(zzioVar2.zzaT()).getApplicationInfo(zzm3, 0);
                                } catch (PackageManager.NameNotFoundException unused4) {
                                    zzio zzioVar8 = zzw3.zzu;
                                    zzioVar8.zzaV();
                                    zzioVar8.zzaW().zzi().zzb("PackageManager failed to find running app: app_id", zzm3);
                                    i2 = i;
                                    j3 = i2;
                                    zzioVar3 = this.zzu;
                                    int zzb = zzioVar3.zzm().zzh().zzb();
                                    String zzj = zzioVar3.zzm().zzf().zzj();
                                    zzqr.zzb();
                                    zzam zzf = zzioVar3.zzf();
                                    zzggVar = zzgi.zzaW;
                                    if (zzf.zzx(null, zzggVar)) {
                                    }
                                    zzqr.zzb();
                                    if (zzioVar3.zzf().zzx(null, zzggVar)) {
                                    }
                                    return new zzr(zzm, zzo, str4, j5, str5, 119002L, j7, str, zzJ, z, str2, min, i3, zzw2, z2, zzl, valueOf, j2, list, (String) null, zzq, str6, str3, zzE, j3, zzb, zzj, r41, j, zzioVar3.zzf().zzs(), new zze(zzioVar3.zzf().zzm("google_analytics_default_allow_ad_personalization_signals", true)).zzc(), this.zzu.zza, zzioVar3.zzf().zzx(null, zzgi.zzaR) ? this.zzu.zzs().zzi().zza() : i);
                                }
                            } catch (PackageManager.NameNotFoundException unused5) {
                                i = 0;
                            }
                            if (applicationInfo != null) {
                                i2 = applicationInfo.targetSdkVersion;
                                j3 = i2;
                            }
                            i2 = i;
                            j3 = i2;
                        }
                        zzioVar3 = this.zzu;
                        int zzb2 = zzioVar3.zzm().zzh().zzb();
                        String zzj2 = zzioVar3.zzm().zzf().zzj();
                        zzqr.zzb();
                        zzam zzf2 = zzioVar3.zzf();
                        zzggVar = zzgi.zzaW;
                        int zzl2 = zzf2.zzx(null, zzggVar) ? zzioVar3.zzw().zzl() : i;
                        zzqr.zzb();
                        if (zzioVar3.zzf().zzx(null, zzggVar)) {
                            j = zzioVar3.zzw().zzq();
                        }
                        return new zzr(zzm, zzo, str4, j5, str5, 119002L, j7, str, zzJ, z, str2, min, i3, zzw2, z2, zzl, valueOf, j2, list, (String) null, zzq, str6, str3, zzE, j3, zzb2, zzj2, zzl2, j, zzioVar3.zzf().zzs(), new zze(zzioVar3.zzf().zzm("google_analytics_default_allow_ad_personalization_signals", true)).zzc(), this.zzu.zza, zzioVar3.zzf().zzx(null, zzgi.zzaR) ? this.zzu.zzs().zzi().zza() : i);
                    }
                }
            }
        }
        str2 = null;
        zzio zzioVar72 = this.zzu;
        long zza2 = zzioVar72.zzm().zzc.zza();
        if (zza2 != 0) {
        }
        zza();
        int i32 = this.zzk;
        zzioVar = this.zzu;
        boolean zzw22 = zzioVar.zzf().zzw();
        zzht zzm22 = zzioVar.zzm();
        zzm22.zzg();
        boolean z22 = zzm22.zzb().getBoolean("deferred_analytics_collection", false);
        String zzl3 = zzl();
        if (zzioVar.zzf().zzm("google_analytics_default_allow_ad_personalization_signals", true) == zzju.GRANTED) {
        }
        long j82 = this.zzg;
        Boolean valueOf2 = Boolean.valueOf(z3);
        List list22 = this.zzi;
        String zzq2 = zzioVar.zzm().zzh().zzq();
        if (this.zzj == null) {
        }
        String str62 = this.zzj;
        if (zzioVar.zzm().zzh().zzr(zzjw.ANALYTICS_STORAGE)) {
        }
        boolean zzE2 = zzioVar.zzf().zzE();
        zzqf zzw32 = zzioVar.zzw();
        String zzm32 = zzm();
        zzioVar2 = zzw32.zzu;
        if (zzioVar2.zzaT().getPackageManager() != null) {
        }
        zzioVar3 = this.zzu;
        int zzb22 = zzioVar3.zzm().zzh().zzb();
        String zzj22 = zzioVar3.zzm().zzf().zzj();
        zzqr.zzb();
        zzam zzf22 = zzioVar3.zzf();
        zzggVar = zzgi.zzaW;
        if (zzf22.zzx(null, zzggVar)) {
        }
        zzqr.zzb();
        if (zzioVar3.zzf().zzx(null, zzggVar)) {
        }
        return new zzr(zzm, zzo, str4, j5, str5, 119002L, j7, str, zzJ, z, str2, min, i32, zzw22, z22, zzl3, valueOf2, j2, list, (String) null, zzq2, str62, str3, zzE2, j3, zzb22, zzj22, zzl2, j, zzioVar3.zzf().zzs(), new zze(zzioVar3.zzf().zzm("google_analytics_default_allow_ad_personalization_signals", true)).zzc(), this.zzu.zza, zzioVar3.zzf().zzx(null, zzgi.zzaR) ? this.zzu.zzs().zzi().zza() : i);
    }

    final String zzl() {
        zza();
        if (this.zzu.zzf().zzx(null, zzgi.zzbp)) {
            return null;
        }
        return this.zzm;
    }

    final String zzm() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzn() {
        zza();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    final String zzo() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    final List zzp() {
        return this.zzi;
    }

    final void zzq() {
        String format;
        zzg();
        zzio zzioVar = this.zzu;
        if (zzioVar.zzm().zzh().zzr(zzjw.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzioVar.zzw().zzJ().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzioVar.zzaW().zzd().zza("Analytics Storage consent is not granted");
            format = null;
        }
        zzioVar.zzaW().zzd().zza(String.format("Resetting session stitching token to %s", format == null ? POBCommonConstants.NULL_VALUE : "not null"));
        this.zzn = format;
        this.zzo = zzioVar.zzaU().currentTimeMillis();
    }

    final boolean zzr(String str) {
        String str2 = this.zzp;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzp = str;
        return z;
    }
}
