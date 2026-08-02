package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzdxv;
import com.google.android.gms.internal.ads.zzfzc;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
final class zzz implements zzfzc {
    final /* synthetic */ zzaa zza;

    zzz(zzaa zzaaVar) {
        this.zza = zzaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzdxv zzdxvVar;
        zzdxl zzdxlVar;
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaaVar = this.zza;
        zzdxvVar = zzaaVar.zzr;
        zzdxlVar = zzaaVar.zzj;
        zzf.zzc(zzdxvVar, zzdxlVar, "sgf", new Pair("sgf_reason", th.getMessage()));
        com.google.android.gms.ads.internal.util.zze.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* synthetic */ void zzb(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zze("Initialized webview successfully for SDKCore.");
    }
}
