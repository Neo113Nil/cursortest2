package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfcw implements zzfdi {
    private final zzhdi zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;

    @Nullable
    private final String zzd;

    zzfcw(zzhdi zzhdiVar, Context context, VersionInfoParcel versionInfoParcel, @Nullable String str) {
        this.zza = zzhdiVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfcw.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 35;
    }

    final /* synthetic */ zzfcx zzc() {
        Context context = this.zzb;
        boolean isCallerInstantApp = Wrappers.packageManager(context).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzH = com.google.android.gms.ads.internal.util.zzs.zzH(context);
        String str = this.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzI = com.google.android.gms.ads.internal.util.zzs.zzI();
        com.google.android.gms.ads.internal.zzt.zzc();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new zzfcx(isCallerInstantApp, zzH, str, zzI, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
