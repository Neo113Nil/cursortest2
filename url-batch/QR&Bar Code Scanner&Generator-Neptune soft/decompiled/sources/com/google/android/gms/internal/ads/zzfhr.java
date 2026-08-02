package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfhr {
    public static final zzfhy zza(Callable callable, Object obj, zzfhz zzfhzVar) {
        zzfzq zzfzqVar;
        zzfzqVar = zzfhzVar.zzb;
        return zzb(callable, zzfzqVar, obj, zzfhzVar);
    }

    public static final zzfhy zzb(Callable callable, zzfzq zzfzqVar, Object obj, zzfhz zzfhzVar) {
        zzfzp zzfzpVar;
        zzfzpVar = zzfhz.zza;
        return new zzfhy(zzfhzVar, obj, zzfzpVar, Collections.emptyList(), zzfzqVar.zzb(callable));
    }

    public static final zzfhy zzc(zzfzp zzfzpVar, Object obj, zzfhz zzfhzVar) {
        zzfzp zzfzpVar2;
        zzfzpVar2 = zzfhz.zza;
        return new zzfhy(zzfhzVar, obj, zzfzpVar2, Collections.emptyList(), zzfzpVar);
    }

    public static final zzfhy zzd(final zzfhl zzfhlVar, zzfzq zzfzqVar, Object obj, zzfhz zzfhzVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfhq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfhl.this.zza();
                return null;
            }
        }, zzfzqVar, obj, zzfhzVar);
    }
}
