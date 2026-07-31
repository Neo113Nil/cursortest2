package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
final class zzebl extends zzebp {
    private final long zza;
    private final int zzb;

    /* synthetic */ zzebl(long j, int i, byte[] bArr) {
        this.zza = j;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzebp) {
            zzebp zzebpVar = (zzebp) obj;
            if (this.zza == zzebpVar.zza() && this.zzb == zzebpVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        sb.append("OnDeviceStorageKey{id=");
        sb.append(j);
        sb.append(", eventType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final int zzb() {
        return this.zzb;
    }
}
