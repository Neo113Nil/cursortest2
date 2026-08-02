package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgte implements Iterator {
    private final ArrayDeque zza;
    private zzgpr zzb;

    /* synthetic */ zzgte(zzgpw zzgpwVar, zzgtd zzgtdVar) {
        if (!(zzgpwVar instanceof zzgtg)) {
            this.zza = null;
            this.zzb = (zzgpr) zzgpwVar;
            return;
        }
        zzgtg zzgtgVar = (zzgtg) zzgpwVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzgtgVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzgtgVar);
        this.zzb = zzb(zzgtgVar.zzd);
    }

    private final zzgpr zzb(zzgpw zzgpwVar) {
        while (zzgpwVar instanceof zzgtg) {
            zzgtg zzgtgVar = (zzgtg) zzgpwVar;
            this.zza.push(zzgtgVar);
            zzgpwVar = zzgtgVar.zzd;
        }
        return (zzgpr) zzgpwVar;
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
    public final zzgpr next() {
        zzgpr zzgprVar;
        zzgpr zzgprVar2 = this.zzb;
        if (zzgprVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgprVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgprVar = zzb(((zzgtg) this.zza.pop()).zze);
        } while (zzgprVar.zzD());
        this.zzb = zzgprVar;
        return zzgprVar2;
    }
}
