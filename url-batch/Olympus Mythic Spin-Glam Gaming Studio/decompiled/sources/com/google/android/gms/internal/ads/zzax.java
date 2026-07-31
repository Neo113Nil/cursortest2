package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzax {
    private final zzs zza;

    static {
        new zzaw().zze();
        String str = zzfm.zza;
        Integer.toString(0, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzax) {
            return this.zza.equals(((zzax) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    final /* synthetic */ zzs zza() {
        return this.zza;
    }
}
