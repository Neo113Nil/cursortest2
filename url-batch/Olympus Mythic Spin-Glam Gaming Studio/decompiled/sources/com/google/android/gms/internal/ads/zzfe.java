package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfe extends IllegalStateException {
    public final int zza;
    public final int zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzfe(int i, int i2) {
        super(r0);
        String sb;
        if (i == 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 46);
            sb2.append("Player stuck buffering and not loading for ");
            sb2.append(i2);
            sb2.append(" ms");
            sb = sb2.toString();
        } else if (i == 1) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 47);
            sb3.append("Player stuck buffering with no progress for ");
            sb3.append(i2);
            sb3.append(" ms");
            sb = sb3.toString();
        } else if (i == 2) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(i2).length() + 45);
            sb4.append("Player stuck playing with no progress for ");
            sb4.append(i2);
            sb4.append(" ms");
            sb = sb4.toString();
        } else if (i != 3) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i2).length() + 31);
            sb5.append("Player stuck suppressed for ");
            sb5.append(i2);
            sb5.append(" ms");
            sb = sb5.toString();
        } else {
            StringBuilder sb6 = new StringBuilder(String.valueOf(i2).length() + 43);
            sb6.append("Player stuck playing without ending for ");
            sb6.append(i2);
            sb6.append(" ms");
            sb = sb6.toString();
        }
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfe.class == obj.getClass()) {
            zzfe zzfeVar = (zzfe) obj;
            if (this.zza == zzfeVar.zza && this.zzb == zzfeVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }
}
