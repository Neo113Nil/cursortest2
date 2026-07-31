package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzetc implements zzeup {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    zzetc(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        String str;
        String str2;
        String str3;
        InstallSourceInfo installSourceInfo;
        String str4 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str5 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str6 = packageInfo == null ? null : packageInfo.versionName;
        try {
            Context context = this.zzc;
            zzfro zzfroVar = com.google.android.gms.ads.internal.util.zzs.zza;
            str = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str4));
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznC)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str4);
                } catch (PackageManager.NameNotFoundException e) {
                    e = e;
                    str2 = null;
                }
                if (installSourceInfo != null) {
                    str2 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                            str2 = null;
                        }
                        str3 = installSourceInfo.getInitiatingPackageName();
                    } catch (PackageManager.NameNotFoundException e2) {
                        e = e2;
                    }
                    try {
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str5 = str3;
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PackageInfoSignalSource.getInstallSourceInfo");
                        str3 = str5;
                        return zzgot.zza(new zzetd(str4, valueOf, str6, str, str2, str3));
                    }
                    if (TextUtils.isEmpty(str3)) {
                        com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                        str3 = str5;
                    }
                    return zzgot.zza(new zzetd(str4, valueOf, str6, str, str2, str3));
                }
            }
        }
        str2 = null;
        str3 = null;
        return zzgot.zza(new zzetd(str4, valueOf, str6, str, str2, str3));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 29;
    }
}
