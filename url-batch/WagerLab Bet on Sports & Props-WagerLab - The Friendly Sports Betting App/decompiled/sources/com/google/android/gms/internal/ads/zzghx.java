package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzghx {
    public static zzght zza(zzght zzghtVar) {
        return ((zzghtVar instanceof zzghw) || (zzghtVar instanceof zzghu)) ? zzghtVar : zzghtVar instanceof Serializable ? new zzghu(zzghtVar) : new zzghw(zzghtVar);
    }
}
