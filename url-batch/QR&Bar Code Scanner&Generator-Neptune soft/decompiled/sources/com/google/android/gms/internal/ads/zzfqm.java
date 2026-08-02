package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfqm extends zzfre {
    private final int zza;
    private final String zzb;

    /* synthetic */ zzfqm(int i, String str, zzfql zzfqlVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfre) {
            zzfre zzfreVar = (zzfre) obj;
            if (this.zza == zzfreVar.zza() && ((str = this.zzb) != null ? str.equals(zzfreVar.zzb()) : zzfreVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zza ^ 1000003) * 1000003;
        String str = this.zzb;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final String zzb() {
        return this.zzb;
    }
}
