package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzgha implements Serializable {
    zzgha() {
    }

    public static zzgha zzc() {
        return zzggh.zza;
    }

    public static zzgha zzd(Object obj) {
        return obj == null ? zzggh.zza : new zzghg(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgha zzb(zzggr zzggrVar);
}
