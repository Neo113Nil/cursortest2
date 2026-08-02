package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfhp {
    final /* synthetic */ zzfhz zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfhp(zzfhz zzfhzVar, Object obj, List list, zzfho zzfhoVar) {
        this.zza = zzfhzVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfhy zza(Callable callable) {
        zzfzq zzfzqVar;
        zzfzf zzc = zzfzg.zzc(this.zzc);
        zzfzp zza = zzc.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfhn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzchc.zzf);
        zzfhz zzfhzVar = this.zza;
        Object obj = this.zzb;
        List list = this.zzc;
        zzfzqVar = zzfhzVar.zzb;
        return new zzfhy(zzfhzVar, obj, zza, list, zzc.zza(callable, zzfzqVar));
    }
}
