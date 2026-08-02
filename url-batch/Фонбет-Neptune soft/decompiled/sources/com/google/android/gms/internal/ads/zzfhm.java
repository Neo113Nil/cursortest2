package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfhm implements zzgcf {
    final /* synthetic */ zzfhp zza;
    final /* synthetic */ zzfhq zzb;

    zzfhm(zzfhq zzfhqVar, zzfhp zzfhpVar) {
        this.zza = zzfhpVar;
        this.zzb = zzfhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfhq zzfhqVar = this.zzb;
            i = zzfhqVar.zzf;
            if (i == 1) {
                zzfhqVar.zzh();
            }
        }
    }
}
