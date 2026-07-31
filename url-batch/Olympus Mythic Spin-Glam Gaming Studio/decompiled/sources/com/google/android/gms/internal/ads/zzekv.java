package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
final class zzekv extends zzelr {
    private final Activity zza;

    @Nullable
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    /* synthetic */ zzekv(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzelr) {
            zzelr zzelrVar = (zzelr) obj;
            if (this.zza.equals(zzelrVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzelrVar.zzb()) : zzelrVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzelrVar.zzc()) : zzelrVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzelrVar.zzd()) : zzelrVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.zzc;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        int length2 = valueOf.length();
        String str = this.zzc;
        int length3 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        sb.append("OfflineUtilsParams{activity=");
        sb.append(obj);
        sb.append(", adOverlay=");
        sb.append(valueOf);
        sb.append(", gwsQueryId=");
        sb.append(str);
        sb.append(", uri=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzelr
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzelr
    @Nullable
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzelr
    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzelr
    @Nullable
    public final String zzd() {
        return this.zzd;
    }
}
