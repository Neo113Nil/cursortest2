package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgmo implements Iterator {
    private final ArrayDeque zza;
    private zzgjb zzb;

    /* synthetic */ zzgmo(zzgjg zzgjgVar, zzgmn zzgmnVar) {
        if (!(zzgjgVar instanceof zzgmq)) {
            this.zza = null;
            this.zzb = (zzgjb) zzgjgVar;
            return;
        }
        zzgmq zzgmqVar = (zzgmq) zzgjgVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzgmqVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzgmqVar);
        this.zzb = zzb(zzgmqVar.zzd);
    }

    private final zzgjb zzb(zzgjg zzgjgVar) {
        while (zzgjgVar instanceof zzgmq) {
            zzgmq zzgmqVar = (zzgmq) zzgjgVar;
            this.zza.push(zzgmqVar);
            zzgjgVar = zzgmqVar.zzd;
        }
        return (zzgjb) zzgjgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgjb next() {
        zzgjb zzgjbVar;
        zzgjb zzgjbVar2 = this.zzb;
        if (zzgjbVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgjbVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgjbVar = zzb(((zzgmq) this.zza.pop()).zze);
        } while (zzgjbVar.zzD());
        this.zzb = zzgjbVar;
        return zzgjbVar2;
    }
}
