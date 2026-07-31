package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhhd extends zzhga {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhhc zzd;

    /* synthetic */ zzhhd(int i, int i2, int i3, zzhhc zzhhcVar, byte[] bArr) {
        this.zza = i;
        this.zzd = zzhhcVar;
    }

    public static zzhhb zzb() {
        return new zzhhb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhd)) {
            return false;
        }
        zzhhd zzhhdVar = (zzhhd) obj;
        return zzhhdVar.zza == this.zza && zzhhdVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhhd.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int length = valueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(12);
        sb.append("-byte IV, ");
        sb.append(16);
        sb.append("-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhhc.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhhc zzd() {
        return this.zzd;
    }
}
