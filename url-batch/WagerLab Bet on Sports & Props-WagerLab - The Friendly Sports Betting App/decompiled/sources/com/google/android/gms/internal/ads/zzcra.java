package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcra implements zzehl {
    public final List zza;

    public zzcra(zzcqs zzcqsVar) {
        this.zza = Collections.singletonList(zzgot.zza(zzcqsVar));
    }

    public zzcra(List list) {
        this.zza = list;
    }

    public static zzedz zza(zzegf zzegfVar) {
        return new zzeea(zzegfVar, zzcqz.zza);
    }

    public static zzedz zzb(zzedz zzedzVar) {
        return new zzeea(zzedzVar, zzcqy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgot.zzq((ListenableFuture) it.next(), new zzcqx(this), zzgpk.zza());
        }
    }
}
