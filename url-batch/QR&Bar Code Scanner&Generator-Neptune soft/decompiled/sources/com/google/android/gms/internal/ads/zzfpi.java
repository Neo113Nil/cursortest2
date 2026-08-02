package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfpi implements Closeable {
    public static zzfpu zza() {
        return new zzfpu();
    }

    public static zzfpu zzb(final int i, zzfpt zzfptVar) {
        return new zzfpu(new zzftn() { // from class: com.google.android.gms.internal.ads.zzfpg
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        }, new zzftn() { // from class: com.google.android.gms.internal.ads.zzfph
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return zzfpi.zze();
            }
        }, zzfptVar);
    }

    public static zzfpu zzc(zzftn<Integer> zzftnVar, zzftn<Integer> zzftnVar2, zzfpt zzfptVar) {
        return new zzfpu(zzftnVar, zzftnVar2, zzfptVar);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
