package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfbs implements zzfcc {
    private final zzfcc zza;
    private zzcvx zzb;

    public zzfbs(zzfcc zzfccVar) {
        this.zza = zzfccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvx zzd() {
        return this.zzb;
    }

    public final synchronized ListenableFuture zzb(zzfcd zzfcdVar, zzfcb zzfcbVar, zzcvx zzcvxVar) {
        this.zzb = zzcvxVar;
        if (zzfcdVar.zza == null) {
            return ((zzfbr) this.zza).zzb(zzfcdVar, zzfcbVar, zzcvxVar);
        }
        zzctc zzb = this.zzb.zzb();
        return zzb.zzi(zzb.zzk(zzgcj.zzh(zzfcdVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfcd zzfcdVar, zzfcb zzfcbVar, Object obj) {
        return zzb(zzfcdVar, zzfcbVar, null);
    }
}
