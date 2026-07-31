package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgru extends zzgsv {
    private final int zza;

    @Nullable
    private final String zzb;
    private final int zzc;

    @Nullable
    private final Boolean zzd;

    /* synthetic */ zzgru(int i, String str, int i2, Boolean bool, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
        this.zzd = bool;
    }

    public final boolean equals(Object obj) {
        String str;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgsv) {
            zzgsv zzgsvVar = (zzgsv) obj;
            if (this.zza == zzgsvVar.zza() && ((str = this.zzb) != null ? str.equals(zzgsvVar.zzb()) : zzgsvVar.zzb() == null) && this.zzc == zzgsvVar.zzc() && ((bool = this.zzd) != null ? bool.equals(zzgsvVar.zzd()) : zzgsvVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i2 = this.zzc;
        int length3 = String.valueOf(i2).length();
        Boolean bool = this.zzd;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i2);
        sb.append(", userInteracted=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    @Nullable
    public final Boolean zzd() {
        return this.zzd;
    }

    public final int hashCode() {
        String str = this.zzb;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.zza;
        int i2 = this.zzc;
        Boolean bool = this.zzd;
        return ((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ i2) * 1000003) ^ (bool != null ? bool.hashCode() : 0);
    }
}
