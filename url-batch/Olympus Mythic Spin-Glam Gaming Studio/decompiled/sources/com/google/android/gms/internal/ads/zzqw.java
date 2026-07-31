package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzqw {
    public static final zzqw zza = new zzqv().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzqw(zzqv zzqvVar, byte[] bArr) {
        this.zzb = zzqvVar.zze();
        this.zzc = zzqvVar.zzf();
        this.zzd = zzqvVar.zzg();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzqw.class == obj.getClass()) {
            zzqw zzqwVar = (zzqw) obj;
            if (this.zzb == zzqwVar.zzb && this.zzc == zzqwVar.zzc && this.zzd == zzqwVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
