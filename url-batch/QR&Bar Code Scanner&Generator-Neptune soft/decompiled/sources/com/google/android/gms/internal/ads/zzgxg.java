package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgxg implements zzgxi {
    private zzgxv zza;

    public static void zza(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        zzgxg zzgxgVar = (zzgxg) zzgxvVar;
        if (zzgxgVar.zza != null) {
            throw new IllegalStateException();
        }
        zzgxgVar.zza = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final Object zzb() {
        zzgxv zzgxvVar = this.zza;
        if (zzgxvVar != null) {
            return zzgxvVar.zzb();
        }
        throw new IllegalStateException();
    }
}
