package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzajp extends zzajz {
    public final String zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzajp(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajp.class == obj.getClass()) {
            zzajp zzajpVar = (zzajp) obj;
            if (this.zzc == zzajpVar.zzc && Objects.equals(this.zza, zzajpVar.zza) && Objects.equals(this.zzb, zzajpVar.zzb) && Arrays.equals(this.zzd, zzajpVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        String str2 = this.zzb;
        return ((((((i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzd, this.zzc);
    }
}
