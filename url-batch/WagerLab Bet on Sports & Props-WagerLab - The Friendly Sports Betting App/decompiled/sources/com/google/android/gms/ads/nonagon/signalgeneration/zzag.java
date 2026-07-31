package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzgoq;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes4.dex */
final class zzag implements zzgoq {
    final /* synthetic */ zzau zza;

    zzag(zzau zzauVar) {
        Objects.requireNonNull(zzauVar);
        this.zza = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzau zzauVar = this.zza;
        zzaa.zze(zzauVar.zzA(), null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair(FirebaseAnalytics.Param.AD_FORMAT, AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(zzauVar.zzO().get())));
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzky)).booleanValue() || zzauVar.zzN().get() || zzauVar.zzO().getAndIncrement() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkz)).intValue()) {
            return;
        }
        zzauVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzky)).booleanValue()) {
            zzau zzauVar = this.zza;
            zzaa.zze(zzauVar.zzA(), null, "sgs", new Pair("se", "query_g"), new Pair(FirebaseAnalytics.Param.AD_FORMAT, AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(zzauVar.zzO().get())));
            zzauVar.zzN().set(true);
        }
    }
}
