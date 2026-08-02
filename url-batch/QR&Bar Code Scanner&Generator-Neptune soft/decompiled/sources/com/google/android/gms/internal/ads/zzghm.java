package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzghm {
    public static final zzghm zza = new zzghk().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzghm) {
            return this.zzb.equals(((zzghm) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
