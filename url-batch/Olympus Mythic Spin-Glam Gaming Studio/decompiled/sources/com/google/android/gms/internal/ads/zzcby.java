package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcby {
    private int zzA;
    private final String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private String zzo;
    private String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final String zzw;
    private final String zzx;
    private float zzy;
    private int zzz;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(1:35)|4|(1:6)(1:34)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d5, blocks: (B:12:0x009f, B:14:0x00ad), top: B:11:0x009f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcby(Context context) {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String sb;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo packageInfo2;
        PackageManager packageManager = context.getPackageManager();
        zzbjg.zza(context);
        zzb(context);
        zzc(context);
        zzd(context);
        Locale locale = Locale.getDefault();
        this.zzq = zze(packageManager, "geo:0,0?q=donuts") != null;
        this.zzr = zze(packageManager, "http://www.google.com") != null;
        this.zzs = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzay.zza();
        this.zzt = com.google.android.gms.ads.internal.util.client.zzf.zzy();
        this.zzu = DeviceProperties.isLatchsky(context);
        this.zzv = DeviceProperties.isSidewinder(context);
        this.zzw = locale.getLanguage();
        ResolveInfo zze = zze(packageManager, "market://details?id=com.google.android.gms.ads");
        String str = null;
        if (zze != null && (activityInfo = zze.activityInfo) != null) {
            try {
                packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                String str2 = activityInfo.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(str2).length());
                sb2.append(i);
                sb2.append(".");
                sb2.append(str2);
                sb = sb2.toString();
                this.zzx = sb;
                packageInfo2 = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
                if (packageInfo2 != null) {
                    int i2 = packageInfo2.versionCode;
                    String str3 = packageInfo2.packageName;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(str3).length());
                    sb3.append(i2);
                    sb3.append(".");
                    sb3.append(str3);
                    str = sb3.toString();
                }
                this.zzB = str;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.zzy = displayMetrics.density;
                    this.zzz = displayMetrics.widthPixels;
                    this.zzA = displayMetrics.heightPixels;
                }
                return;
            }
        }
        sb = null;
        this.zzx = sb;
        packageInfo2 = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
        if (packageInfo2 != null) {
        }
        this.zzB = str;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.zzy = displayMetrics.density;
        this.zzz = displayMetrics.widthPixels;
        this.zzA = displayMetrics.heightPixels;
    }

    private final void zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zza = audioManager.getMode();
                this.zzb = audioManager.isMusicActive();
                this.zzc = audioManager.isSpeakerphoneOn();
                this.zzd = audioManager.getStreamVolume(3);
                this.zze = audioManager.getRingerMode();
                this.zzf = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = 2;
        this.zzf = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.zzg = telephonyManager.getNetworkOperator();
        if (PlatformVersion.isAtLeastR()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjZ)).booleanValue()) {
                networkType = 0;
                this.zzi = networkType;
                this.zzj = telephonyManager.getPhoneType();
                this.zzh = -2;
                this.zzk = false;
                this.zzl = -1;
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.zzh = activeNetworkInfo.getType();
                    this.zzl = activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.zzh = -1;
                }
                this.zzk = connectivityManager.isActiveNetworkMetered();
                return;
            }
        }
        networkType = telephonyManager.getNetworkType();
        this.zzi = networkType;
        this.zzj = telephonyManager.getPhoneType();
        this.zzh = -2;
        this.zzk = false;
        this.zzl = -1;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final void zzd(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmF)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (registerReceiver == null) {
            this.zzm = -1.0d;
            this.zzn = false;
        } else {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.zzm = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
            this.zzn = intExtra == 2 || intExtra == 5;
        }
    }

    @Nullable
    private static ResolveInfo zze(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final zzcbz zza() {
        return new zzcbz(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
    }

    public zzcby(Context context, zzcbz zzcbzVar) {
        zzbjg.zza(context);
        zzb(context);
        zzc(context);
        zzd(context);
        this.zzo = Build.FINGERPRINT;
        this.zzp = Build.DEVICE;
        this.zzC = zzbkh.zza(context);
        this.zzq = zzcbzVar.zza;
        this.zzr = zzcbzVar.zzb;
        this.zzs = zzcbzVar.zzc;
        this.zzt = zzcbzVar.zzd;
        this.zzu = zzcbzVar.zze;
        this.zzv = zzcbzVar.zzf;
        this.zzw = zzcbzVar.zzg;
        this.zzx = zzcbzVar.zzh;
        this.zzB = zzcbzVar.zzi;
        this.zzy = zzcbzVar.zzl;
        this.zzz = zzcbzVar.zzm;
        this.zzA = zzcbzVar.zzn;
    }
}
