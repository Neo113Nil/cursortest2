package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfml {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfmk zzd = null;

    public zzfml() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfmk zzfmkVar = (zzfmk) this.zzc.poll();
        this.zzd = zzfmkVar;
        if (zzfmkVar != null) {
            zzfmkVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfmk zzfmkVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfmk zzfmkVar) {
        zzfmkVar.zzb(this);
        this.zzc.add(zzfmkVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
