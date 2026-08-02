package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzefk {
    private final zzefg zza;
    private final zzfzq zzb;

    public zzefk(zzefg zzefgVar, zzfzq zzfzqVar) {
        this.zza = zzefgVar;
        this.zzb = zzfzqVar;
    }

    public final void zza(zzfhk zzfhkVar) {
        zzfzq zzfzqVar = this.zzb;
        final zzefg zzefgVar = this.zza;
        zzfzg.zzr(zzfzqVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzefi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzefg.this.getWritableDatabase();
            }
        }), new zzefj(this, zzfhkVar), this.zzb);
    }
}
