package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzho {
    public final String zza;
    public final zzaf zzb;
    public final zzaf zzc;
    public final int zzd;
    public final int zze;

    public zzho(String str, zzaf zzafVar, zzaf zzafVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        zzdi.zzd(z);
        zzdi.zzc(str);
        this.zza = str;
        this.zzb = zzafVar;
        zzafVar2.getClass();
        this.zzc = zzafVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzho zzhoVar = (zzho) obj;
            if (this.zzd == zzhoVar.zzd && this.zze == zzhoVar.zze && this.zza.equals(zzhoVar.zza) && this.zzb.equals(zzhoVar.zzb) && this.zzc.equals(zzhoVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
