package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzrp {
    public final int zza;
    public final zzup zzb;
    private final CopyOnWriteArrayList zzc;

    public zzrp() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzrp(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzup zzupVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzupVar;
    }

    public final zzrp zza(int i, zzup zzupVar) {
        return new zzrp(this.zzc, 0, zzupVar);
    }

    public final void zzb(Handler handler, zzrq zzrqVar) {
        this.zzc.add(new zzro(handler, zzrqVar));
    }

    public final void zzc(zzrq zzrqVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzro zzroVar = (zzro) it.next();
            if (zzroVar.zza == zzrqVar) {
                copyOnWriteArrayList.remove(zzroVar);
            }
        }
    }
}
