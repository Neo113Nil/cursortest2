package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzzt {
    public final zzzw zza;
    public final zzzw zzb;

    public zzzt(zzzw zzzwVar, zzzw zzzwVar2) {
        this.zza = zzzwVar;
        this.zzb = zzzwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzzt zzztVar = (zzzt) obj;
            if (this.zza.equals(zzztVar.zza) && this.zzb.equals(zzztVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "[" + this.zza.toString() + (this.zza.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString())) + "]";
    }
}
