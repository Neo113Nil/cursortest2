package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzfoc implements zzhcv {
    final /* synthetic */ zzfof zza;
    final /* synthetic */ zzfoh zzb;

    zzfoc(zzfoh zzfohVar, zzfof zzfofVar) {
        this.zza = zzfofVar;
        Objects.requireNonNull(zzfohVar);
        this.zzb = zzfohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzfoh zzfohVar = this.zzb;
        synchronized (zzfohVar) {
            zzfohVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoh zzfohVar = this.zzb;
        synchronized (zzfohVar) {
            try {
                zzfohVar.zzf(null);
                zzfohVar.zze().addFirst(this.zza);
                if (zzfohVar.zzg() == 1) {
                    zzfohVar.zzd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
