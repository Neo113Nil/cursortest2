package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
final class zzekt extends zzekw {

    @Nullable
    private final String zza;
    private final String zzb;

    @Nullable
    private final Drawable zzc;

    zzekt(@Nullable String str, String str2, @Nullable Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzekw) {
            zzekw zzekwVar = (zzekw) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzekwVar.zza()) : zzekwVar.zza() == null) {
                if (this.zzb.equals(zzekwVar.zzb()) && ((drawable = this.zzc) != null ? drawable.equals(zzekwVar.zzc()) : zzekwVar.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 42 + str2.length() + 7 + length2 + 1);
        sb.append("OfflineAdAssets{advertiserName=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    @Nullable
    final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    @Nullable
    final Drawable zzc() {
        return this.zzc;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (hashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }
}
