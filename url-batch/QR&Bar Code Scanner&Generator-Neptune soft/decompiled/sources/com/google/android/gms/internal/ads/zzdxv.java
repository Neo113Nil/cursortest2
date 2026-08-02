package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdxv extends zzdxx {
    private final zzfiz zzf;

    public zzdxv(Executor executor, zzcgu zzcguVar, zzfiz zzfizVar, zzfjb zzfjbVar) {
        super(executor, zzcguVar, zzfjbVar);
        this.zzf = zzfizVar;
        zzfizVar.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
