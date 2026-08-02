package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzffb {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzfzq zzc;

    public zzffb(Callable callable, zzfzq zzfzqVar) {
        this.zzb = callable;
        this.zzc = zzfzqVar;
    }

    public final synchronized zzfzp zza() {
        zzc(1);
        return (zzfzp) this.zza.poll();
    }

    public final synchronized void zzb(zzfzp zzfzpVar) {
        this.zza.addFirst(zzfzpVar);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
