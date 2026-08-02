package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgt {
    public final String zza;
    public final zzaf zzb;
    public final zzaf zzc;
    public final int zzd;
    public final int zze;

    public zzgt(String str, zzaf zzafVar, zzaf zzafVar2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            zzdd.zzd(z);
            zzdd.zzc(str);
            this.zza = str;
            Objects.requireNonNull(zzafVar);
            this.zzb = zzafVar;
            Objects.requireNonNull(zzafVar2);
            this.zzc = zzafVar2;
            this.zzd = i;
            this.zze = i2;
        }
        z = true;
        zzdd.zzd(z);
        zzdd.zzc(str);
        this.zza = str;
        Objects.requireNonNull(zzafVar);
        this.zzb = zzafVar;
        Objects.requireNonNull(zzafVar2);
        this.zzc = zzafVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzgt zzgtVar = (zzgt) obj;
            if (this.zzd == zzgtVar.zzd && this.zze == zzgtVar.zze && this.zza.equals(zzgtVar.zza) && this.zzb.equals(zzgtVar.zzb) && this.zzc.equals(zzgtVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
