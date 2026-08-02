package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfhz {
    private static final zzfzp zza = zzfzg.zzi(null);
    private final zzfzq zzb;
    private final ScheduledExecutorService zzc;
    private final zzfia zzd;

    public zzfhz(zzfzq zzfzqVar, ScheduledExecutorService scheduledExecutorService, zzfia zzfiaVar) {
        this.zzb = zzfzqVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfiaVar;
    }

    public final zzfhp zza(Object obj, zzfzp... zzfzpVarArr) {
        return new zzfhp(this, obj, Arrays.asList(zzfzpVarArr), null);
    }

    public final zzfhy zzb(Object obj, zzfzp zzfzpVar) {
        return new zzfhy(this, obj, zzfzpVar, Collections.singletonList(zzfzpVar), zzfzpVar);
    }

    protected abstract String zzf(Object obj);
}
