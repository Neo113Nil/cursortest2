package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfbv implements zzfdi {
    private final ApplicationInfo zza;

    @Nullable
    private final PackageInfo zzb;
    private final Context zzc;

    zzfbv(ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        String str;
        String str2;
        String str3;
        PackageManager.NameNotFoundException e;
        String str4;
        InstallSourceInfo installSourceInfo;
        String str5 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str6 = packageInfo == null ? null : packageInfo.versionName;
        try {
            Context context = this.zzc;
            zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
            str = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str5));
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzow)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str5);
                } catch (PackageManager.NameNotFoundException e2) {
                    str2 = null;
                    e = e2;
                    str4 = null;
                }
                if (installSourceInfo != null) {
                    str2 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                            str2 = null;
                        }
                        str4 = installSourceInfo.getInitiatingPackageName();
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str4 = null;
                    }
                    try {
                    } catch (PackageManager.NameNotFoundException e4) {
                        e = e4;
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "PackageInfoSignalSource.getInstallSourceInfo");
                        str3 = str4;
                        return zzhcy.zza(new zzfbw(str5, valueOf, str6, str, str2, str3));
                    }
                    if (TextUtils.isEmpty(str4)) {
                        com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                        str3 = null;
                        return zzhcy.zza(new zzfbw(str5, valueOf, str6, str, str2, str3));
                    }
                    str3 = str4;
                    return zzhcy.zza(new zzfbw(str5, valueOf, str6, str, str2, str3));
                }
            }
        }
        str2 = null;
        str3 = null;
        return zzhcy.zza(new zzfbw(str5, valueOf, str6, str, str2, str3));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 29;
    }
}
