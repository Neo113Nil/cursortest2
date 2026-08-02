package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzakg {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzajn zze;
    private final zzajw zzf;
    private final zzajx[] zzg;
    private zzajp zzh;
    private final List zzi;
    private final List zzj;
    private final zzaju zzk;

    public zzakg(zzajn zzajnVar, zzajw zzajwVar, int i) {
        zzaju zzajuVar = new zzaju(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzajnVar;
        this.zzf = zzajwVar;
        this.zzg = new zzajx[4];
        this.zzk = zzajuVar;
    }

    public final zzakd zza(zzakd zzakdVar) {
        zzakdVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzakdVar);
        }
        zzakdVar.zzg(this.zza.incrementAndGet());
        zzakdVar.zzm("add-to-queue");
        zzc(zzakdVar, 0);
        this.zzc.add(zzakdVar);
        return zzakdVar;
    }

    final void zzb(zzakd zzakdVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzakdVar);
        }
        synchronized (this.zzi) {
            Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((zzakf) it.next()).zza();
            }
        }
        zzc(zzakdVar, 5);
    }

    final void zzc(zzakd zzakdVar, int i) {
        synchronized (this.zzj) {
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzake) it.next()).zza();
            }
        }
    }

    public final void zzd() {
        zzajp zzajpVar = this.zzh;
        if (zzajpVar != null) {
            zzajpVar.zzb();
        }
        zzajx[] zzajxVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzajx zzajxVar = zzajxVarArr[i];
            if (zzajxVar != null) {
                zzajxVar.zza();
            }
        }
        zzajp zzajpVar2 = new zzajp(this.zzc, this.zzd, this.zze, this.zzk, null);
        this.zzh = zzajpVar2;
        zzajpVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzajx zzajxVar2 = new zzajx(this.zzd, this.zzf, this.zze, this.zzk, null);
            this.zzg[i2] = zzajxVar2;
            zzajxVar2.start();
        }
    }
}
