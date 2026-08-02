package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgxu implements zzgxv {
    private static final Object zza = new Object();
    private volatile zzgxv zzb;
    private volatile Object zzc = zza;

    private zzgxu(zzgxv zzgxvVar) {
        this.zzb = zzgxvVar;
    }

    public static zzgxv zza(zzgxv zzgxvVar) {
        if ((zzgxvVar instanceof zzgxu) || (zzgxvVar instanceof zzgxh)) {
            return zzgxvVar;
        }
        Objects.requireNonNull(zzgxvVar);
        return new zzgxu(zzgxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzgxv zzgxvVar = this.zzb;
        if (zzgxvVar == null) {
            return this.zzc;
        }
        Object zzb = zzgxvVar.zzb();
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }
}
