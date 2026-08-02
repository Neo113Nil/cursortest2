package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzggo extends zzgex {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzggm zzd;

    /* synthetic */ zzggo(int i, int i2, int i3, zzggm zzggmVar, zzggn zzggnVar) {
        this.zza = i;
        this.zzd = zzggmVar;
    }

    public static zzggl zzc() {
        return new zzggl(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggo)) {
            return false;
        }
        zzggo zzggoVar = (zzggo) obj;
        if (zzggoVar.zza == this.zza) {
            int i = zzggoVar.zzb;
            int i2 = zzggoVar.zzc;
            if (zzggoVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzggo.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        return this.zzd != zzggm.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzggm zzd() {
        return this.zzd;
    }
}
