package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzgcf;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class zzaj implements zzgcf {
    final /* synthetic */ zzak zza;

    zzaj(zzak zzakVar) {
        this.zza = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        zzdsp zzdspVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzdspVar = this.zza.zzp;
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        atomicInteger = this.zza.zzH;
        zzq.zzd(zzdspVar, null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziO)).booleanValue()) {
            atomicBoolean = this.zza.zzG;
            if (atomicBoolean.get()) {
                return;
            }
            atomicInteger2 = this.zza.zzH;
            if (atomicInteger2.getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziP)).intValue()) {
                this.zza.zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdsp zzdspVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziO)).booleanValue()) {
            zzdspVar = this.zza.zzp;
            Pair pair = new Pair("se", "query_g");
            Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
            Pair pair3 = new Pair("rtype", Integer.toString(6));
            Pair pair4 = new Pair("scar", "true");
            atomicInteger = this.zza.zzH;
            zzq.zzd(zzdspVar, null, "sgs", pair, pair2, pair3, pair4, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = this.zza.zzG;
            atomicBoolean.set(true);
        }
    }
}
