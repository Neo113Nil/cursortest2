package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzadt {
    public final zzadw zza;
    public final zzadw zzb;

    public zzadt(zzadw zzadwVar, zzadw zzadwVar2) {
        this.zza = zzadwVar;
        this.zzb = zzadwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadt zzadtVar = (zzadt) obj;
            if (this.zza.equals(zzadtVar.zza) && this.zzb.equals(zzadtVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzadw zzadwVar = this.zza;
        zzadw zzadwVar2 = this.zzb;
        String obj = zzadwVar.toString();
        String concat = zzadwVar.equals(zzadwVar2) ? "" : ", ".concat(zzadwVar2.toString());
        StringBuilder sb = new StringBuilder(obj.length() + 1 + concat.length() + 1);
        sb.append("[");
        sb.append(obj);
        sb.append(concat);
        sb.append("]");
        return sb.toString();
    }
}
