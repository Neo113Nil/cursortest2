package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgn {
    public final String zza;
    public final zzad zzb;
    public final zzad zzc;
    public final int zzd;
    public final int zze;

    public zzgn(String str, zzad zzadVar, zzad zzadVar2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            zzcw.zzd(z);
            zzcw.zzc(str);
            this.zza = str;
            Objects.requireNonNull(zzadVar);
            this.zzb = zzadVar;
            Objects.requireNonNull(zzadVar2);
            this.zzc = zzadVar2;
            this.zzd = i;
            this.zze = i2;
        }
        z = true;
        zzcw.zzd(z);
        zzcw.zzc(str);
        this.zza = str;
        Objects.requireNonNull(zzadVar);
        this.zzb = zzadVar;
        Objects.requireNonNull(zzadVar2);
        this.zzc = zzadVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzgn zzgnVar = (zzgn) obj;
            if (this.zzd == zzgnVar.zzd && this.zze == zzgnVar.zze && this.zza.equals(zzgnVar.zza) && this.zzb.equals(zzgnVar.zzb) && this.zzc.equals(zzgnVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
