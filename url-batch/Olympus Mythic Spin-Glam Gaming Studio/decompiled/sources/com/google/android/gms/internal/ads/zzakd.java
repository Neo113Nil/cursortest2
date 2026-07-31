package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzakd extends zzajz {
    public final String zza;
    public final byte[] zzb;

    public zzakd(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakd.class == obj.getClass()) {
            zzakd zzakdVar = (zzakd) obj;
            if (Objects.equals(this.zza, zzakdVar.zza) && Arrays.equals(this.zzb, zzakdVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 8 + str2.length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }
}
