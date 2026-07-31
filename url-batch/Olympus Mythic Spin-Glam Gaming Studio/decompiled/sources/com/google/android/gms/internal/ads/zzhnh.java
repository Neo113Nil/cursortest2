package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhnh implements zzhel {
    private final Map zza;

    static {
        new zzhng().zza();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhnh) {
            return this.zza.equals(((zzhnh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final boolean zza() {
        return this.zza.isEmpty();
    }
}
