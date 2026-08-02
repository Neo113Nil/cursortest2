package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.core.os.EnvironmentCompat;
import androidx.webkit.ProxyConfig;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbtq implements zzbts {
    public static zzbts zza;
    static zzbts zzb;
    static zzbts zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzbtq(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfo;
        this.zzf = new Object();
        this.zzh = new WeakHashMap();
        zzfrt.zza();
        this.zzi = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzn = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzg = context;
        this.zzj = versionInfoParcel;
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgX)).booleanValue()) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.zzk = packageInfo;
                this.zzl = !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgV)).booleanValue() ? Locale.getDefault().getCountry() : EnvironmentCompat.MEDIA_UNKNOWN;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgV)).booleanValue()) {
                    str = EnvironmentCompat.MEDIA_UNKNOWN;
                } else {
                    Context context2 = this.zzg;
                    Handler handler2 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                    if (context2 != null) {
                        try {
                            PackageInfo packageInfo2 = Wrappers.packageManager(context2).getPackageInfo("com.android.vending", 128);
                            if (packageInfo2 != null) {
                                str = Integer.toString(packageInfo2.versionCode);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.zzm = str;
            }
        }
        packageInfo = null;
        this.zzk = packageInfo;
        this.zzl = !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgV)).booleanValue() ? Locale.getDefault().getCountry() : EnvironmentCompat.MEDIA_UNKNOWN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgV)).booleanValue()) {
        }
        this.zzm = str;
    }

    public static zzbts zza(Context context) {
        synchronized (zze) {
            if (zza == null) {
                if (zzl()) {
                    zza = new zzbtq(context, VersionInfoParcel.forPackage());
                } else {
                    zza = new zzbtr();
                }
            }
        }
        return zza;
    }

    public static zzbts zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzc == null) {
                boolean z = false;
                if (((Boolean) zzbdk.zzc.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgQ)).booleanValue() || ((Boolean) zzbdk.zza.zze()).booleanValue()) {
                        z = true;
                    }
                }
                if (zzl()) {
                    zzbtq zzbtqVar = new zzbtq(context, versionInfoParcel);
                    zzbtqVar.zzk();
                    zzbtqVar.zzj();
                    zzc = zzbtqVar;
                } else if (z) {
                    zzbtq zzbtqVar2 = new zzbtq(context, versionInfoParcel, true);
                    zzbtqVar2.zzk();
                    zzbtqVar2.zzj();
                    zzc = zzbtqVar2;
                } else {
                    zzc = new zzbtr();
                }
            }
        }
        return zzc;
    }

    public static zzbts zzc(Context context) {
        synchronized (zze) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgR)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgQ)).booleanValue()) {
                        zzb = new zzbtq(context, VersionInfoParcel.forPackage());
                    }
                }
                zzb = new zzbtr();
            }
        }
        return zzb;
    }

    public static zzbts zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgR)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgQ)).booleanValue()) {
                        zzb = new zzbtq(context, versionInfoParcel);
                    }
                }
                zzb = new zzbtr();
            }
        }
        return zzb;
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzfvj.zzc(com.google.android.gms.ads.internal.util.client.zzf.zzg(zze(th)));
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbto(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, true);
        }
        thread.setUncaughtExceptionHandler(new zzbtp(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlO)).booleanValue()) {
            if (((Boolean) zzbeb.zze.zze()).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgQ)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (zze) {
            if (zzd == null) {
                zzd = Boolean.valueOf(com.google.android.gms.ads.internal.client.zzay.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlL)).intValue());
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgQ)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    protected final void zzg(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName());
                    z2 |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbdk.zzc.zze()).booleanValue()) {
                return;
            }
            zzbbg.zzc(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzi(Throwable th, String str, float f) {
        Throwable th2;
        String str2;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo zzc2;
        if (this.zzo) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        boolean z = false;
        if (((Boolean) zzbeb.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbY)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzp(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z2) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String zze2 = zze(th);
            String zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhV)).booleanValue() ? zzf(th) : "";
            double d = f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    z = Wrappers.packageManager(this.zzg).isCallerInstantApp();
                } catch (Throwable th5) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Error fetching instant app info", th5);
                }
                try {
                    str2 = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot obtain package name, proceeding.");
                    str2 = EnvironmentCompat.MEDIA_UNKNOWN;
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = str3 + " " + str4;
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzj.afmaVersion).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "661295874").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbeb.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzg))).appendQueryParameter("lite", true != this.zzj.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(zzf)) {
                    appendQueryParameter2.appendQueryParameter("hash", zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgW)).booleanValue() && (zzc2 = com.google.android.gms.ads.internal.util.client.zzf.zzc(this.zzg)) != null) {
                    appendQueryParameter2.appendQueryParameter("available_memory", Long.toString(zzc2.availMem));
                    appendQueryParameter2.appendQueryParameter("total_memory", Long.toString(zzc2.totalMem));
                    appendQueryParameter2.appendQueryParameter("is_low_memory", true == zzc2.lowMemory ? "1" : "0");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgV)).booleanValue()) {
                    if (!TextUtils.isEmpty(this.zzl)) {
                        appendQueryParameter2.appendQueryParameter("countrycode", this.zzl);
                    }
                    if (!TextUtils.isEmpty(this.zzm)) {
                        appendQueryParameter2.appendQueryParameter("psv", this.zzm);
                    }
                    Context context = this.zzg;
                    if (Build.VERSION.SDK_INT >= 26) {
                        packageInfo = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        appendQueryParameter2.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                        appendQueryParameter2.appendQueryParameter("wvvn", packageInfo.versionName);
                        appendQueryParameter2.appendQueryParameter("wvpn", packageInfo.packageName);
                    }
                }
                PackageInfo packageInfo2 = this.zzk;
                if (packageInfo2 != null) {
                    appendQueryParameter2.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                    appendQueryParameter2.appendQueryParameter("appvn", this.zzk.versionName);
                }
                arrayList2.add(appendQueryParameter2.toString());
                for (final String str5 : arrayList2) {
                    final com.google.android.gms.ads.internal.util.client.zzr zzrVar = new com.google.android.gms.ads.internal.util.client.zzr(null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtn
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.gms.ads.internal.util.client.zzr.this.zza(str5);
                        }
                    });
                }
            }
        }
    }

    protected zzbtq(Context context, VersionInfoParcel versionInfoParcel, boolean z) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
