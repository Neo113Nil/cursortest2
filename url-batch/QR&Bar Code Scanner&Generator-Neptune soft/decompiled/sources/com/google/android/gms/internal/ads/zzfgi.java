package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfgi implements zzfzc {
    final /* synthetic */ zzfgl zza;
    final /* synthetic */ zzfgm zzb;

    zzfgi(zzfgm zzfgmVar, zzfgl zzfglVar) {
        this.zzb = zzfgmVar;
        this.zza = zzfglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfgm zzfgmVar = this.zzb;
            i = zzfgmVar.zzf;
            if (i == 1) {
                zzfgmVar.zzh();
            }
        }
    }
}
