package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcsc implements zzeio {
    public final List zza;

    public zzcsc(zzcru zzcruVar) {
        this.zza = Collections.singletonList(zzgcj.zzh(zzcruVar));
    }

    public zzcsc(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeio
    public final void zzr() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgcj.zzr((ListenableFuture) it.next(), new zzcsb(this), zzgda.zzb());
        }
    }
}
