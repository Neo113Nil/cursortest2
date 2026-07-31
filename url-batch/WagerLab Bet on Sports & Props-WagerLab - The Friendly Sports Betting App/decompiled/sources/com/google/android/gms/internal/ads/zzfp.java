package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfp {
    private final zzfo zza;
    private final ArrayDeque zzb = new ArrayDeque();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;
    private zzfn zzf;

    public zzfp(zzfo zzfoVar) {
        this.zza = zzfoVar;
    }

    private final void zzf(int i) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.zzd;
            if (priorityQueue.size() <= i) {
                return;
            }
            zzfn zzfnVar = (zzfn) priorityQueue.poll();
            String str = zzeo.zza;
            int i2 = 0;
            while (true) {
                list = zzfnVar.zza;
                if (i2 >= list.size()) {
                    break;
                }
                this.zza.zza(zzfnVar.zzb, (zzef) list.get(i2));
                this.zzb.push((zzef) list.get(i2));
                i2++;
            }
            list.clear();
            zzfn zzfnVar2 = this.zzf;
            if (zzfnVar2 != null && zzfnVar2.zzb == zzfnVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzfnVar);
        }
    }

    public final void zza(int i) {
        zzghc.zzh(i >= 0);
        this.zze = i;
        zzf(i);
    }

    public final int zzb() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r7 < r0.zzb) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(long j, zzef zzefVar) {
        int i = this.zze;
        if (i != 0) {
            if (i != -1) {
                PriorityQueue priorityQueue = this.zzd;
                if (priorityQueue.size() >= this.zze) {
                    zzfn zzfnVar = (zzfn) priorityQueue.peek();
                    String str = zzeo.zza;
                }
            }
            ArrayDeque arrayDeque = this.zzb;
            zzef zzefVar2 = arrayDeque.isEmpty() ? new zzef() : (zzef) arrayDeque.pop();
            zzefVar2.zza(zzefVar.zzd());
            System.arraycopy(zzefVar.zzi(), zzefVar.zzg(), zzefVar2.zzi(), 0, zzefVar2.zzd());
            zzfn zzfnVar2 = this.zzf;
            if (zzfnVar2 != null && j == zzfnVar2.zzb) {
                zzfnVar2.zza.add(zzefVar2);
                return;
            }
            ArrayDeque arrayDeque2 = this.zzc;
            zzfn zzfnVar3 = arrayDeque2.isEmpty() ? new zzfn() : (zzfn) arrayDeque2.pop();
            zzghc.zza(j != C.TIME_UNSET);
            List list = zzfnVar3.zza;
            zzghc.zzh(list.isEmpty());
            zzfnVar3.zzb = j;
            list.add(zzefVar2);
            this.zzd.add(zzfnVar3);
            this.zzf = zzfnVar3;
            int i2 = this.zze;
            if (i2 != -1) {
                zzf(i2);
                return;
            }
            return;
        }
        this.zza.zza(j, zzefVar);
    }

    public final void zzd() {
        this.zzd.clear();
    }

    public final void zze() {
        zzf(0);
    }
}
