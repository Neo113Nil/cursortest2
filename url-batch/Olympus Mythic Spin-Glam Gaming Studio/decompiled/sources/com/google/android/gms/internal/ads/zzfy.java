package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzfy implements zzao {
    public final int zza;

    public zzfy(int i) {
        this.zza = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzfy) && this.zza == ((zzfy) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 19);
        sb.append("Mp4AlternateGroup: ");
        sb.append(i);
        return sb.toString();
    }
}
