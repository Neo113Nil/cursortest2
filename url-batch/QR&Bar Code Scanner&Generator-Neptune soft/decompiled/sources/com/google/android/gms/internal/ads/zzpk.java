package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzpk {
    public final int zza;
    public final zzsi zzb;
    private final CopyOnWriteArrayList zzc;

    public zzpk() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzpk(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzsi zzsiVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsiVar;
    }

    public final zzpk zza(int i, zzsi zzsiVar) {
        return new zzpk(this.zzc, i, zzsiVar);
    }

    public final void zzc(zzpl zzplVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzpj zzpjVar = (zzpj) it.next();
            if (zzpjVar.zzb == zzplVar) {
                this.zzc.remove(zzpjVar);
            }
        }
    }

    public final void zzb(Handler handler, zzpl zzplVar) {
        Objects.requireNonNull(zzplVar);
        this.zzc.add(new zzpj(handler, zzplVar));
    }
}
