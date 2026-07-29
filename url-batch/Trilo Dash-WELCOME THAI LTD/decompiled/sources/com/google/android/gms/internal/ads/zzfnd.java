package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzfnd implements Closeable {
    public static zzfnp zza() {
        return new zzfnp();
    }

    public static zzfnp zzb(final int i, zzfno zzfnoVar) {
        return new zzfnp(new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnb
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        }, new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnc
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnd.zze();
            }
        }, zzfnoVar);
    }

    public static zzfnp zzc(zzfph<Integer> zzfphVar, zzfph<Integer> zzfphVar2, zzfno zzfnoVar) {
        return new zzfnp(zzfphVar, zzfphVar2, zzfnoVar);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
