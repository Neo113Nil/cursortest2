package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzoq {
    public static final zzoq zza = new zzoo().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzoq(zzoo zzooVar, zzop zzopVar) {
        boolean z;
        boolean z2;
        boolean z3;
        z = zzooVar.zza;
        this.zzb = z;
        z2 = zzooVar.zzb;
        this.zzc = z2;
        z3 = zzooVar.zzc;
        this.zzd = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzoq zzoqVar = (zzoq) obj;
            if (this.zzb == zzoqVar.zzb && this.zzc == zzoqVar.zzc && this.zzd == zzoqVar.zzd) {
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
