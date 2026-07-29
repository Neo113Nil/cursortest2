package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfef implements zzfuw {
    final /* synthetic */ zzfei zza;
    final /* synthetic */ zzfej zzb;

    zzfef(zzfej zzfejVar, zzfei zzfeiVar) {
        this.zzb = zzfejVar;
        this.zza = zzfeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfej zzfejVar = this.zzb;
            i = zzfejVar.zzf;
            if (i == 1) {
                zzfejVar.zzh();
            }
        }
    }
}
