package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaaj {
    public final zzaam zza;
    public final zzaam zzb;

    public zzaaj(zzaam zzaamVar, zzaam zzaamVar2) {
        this.zza = zzaamVar;
        this.zzb = zzaamVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaaj zzaajVar = (zzaaj) obj;
            if (this.zza.equals(zzaajVar.zza) && this.zzb.equals(zzaajVar.zzb)) {
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
