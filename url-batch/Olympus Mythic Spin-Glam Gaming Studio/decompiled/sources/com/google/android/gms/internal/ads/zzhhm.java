package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhhm extends zzhga {
    private final int zza;
    private final zzhhl zzb;

    /* synthetic */ zzhhm(int i, zzhhl zzhhlVar, byte[] bArr) {
        this.zza = i;
        this.zzb = zzhhlVar;
    }

    public static zzhhk zzb() {
        return new zzhhk(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhm)) {
            return false;
        }
        zzhhm zzhhmVar = (zzhhm) obj;
        return zzhhmVar.zza == this.zza && zzhhmVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhhm.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        int length = valueOf.length();
        int i = this.zza;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzb != zzhhl.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhhl zzd() {
        return this.zzb;
    }
}
