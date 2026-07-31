package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgrw extends zzgsy {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    /* synthetic */ zzgrw(String str, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgsy) {
            zzgsy zzgsyVar = (zzgsy) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzgsyVar.zza()) : zzgsyVar.zza() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzgsyVar.zzb()) : zzgsyVar.zzb() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        sb.append("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(str);
        sb.append(", appId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    @Nullable
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
