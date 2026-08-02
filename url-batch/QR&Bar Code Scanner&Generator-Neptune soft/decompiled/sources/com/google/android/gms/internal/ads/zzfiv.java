package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfiv {
    public final String zza;
    public final String zzb;

    public zzfiv(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfiv)) {
            return false;
        }
        zzfiv zzfivVar = (zzfiv) obj;
        return this.zza.equals(zzfivVar.zza) && this.zzb.equals(zzfivVar.zzb);
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
