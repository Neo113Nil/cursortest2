package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdwb;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzfuw;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzy implements zzfuw {
    final /* synthetic */ zzz zza;

    zzy(zzz zzzVar) {
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzdwl zzdwlVar;
        zzdwb zzdwbVar;
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzz zzzVar = this.zza;
        zzdwlVar = zzzVar.zzr;
        zzdwbVar = zzzVar.zzj;
        zzf.zzc(zzdwlVar, zzdwbVar, "sgf", new Pair("sgf_reason", th.getMessage()));
        com.google.android.gms.ads.internal.util.zze.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* synthetic */ void zzb(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zze("Initialized webview successfully for SDKCore.");
    }
}
