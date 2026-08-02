package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhab implements Iterator {
    private final ArrayDeque zza;
    private zzgwj zzb;

    /* synthetic */ zzhab(zzgwm zzgwmVar, zzhaa zzhaaVar) {
        if (!(zzgwmVar instanceof zzhad)) {
            this.zza = null;
            this.zzb = (zzgwj) zzgwmVar;
            return;
        }
        zzhad zzhadVar = (zzhad) zzgwmVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhadVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhadVar);
        this.zzb = zzb(zzhadVar.zzd);
    }

    private final zzgwj zzb(zzgwm zzgwmVar) {
        while (zzgwmVar instanceof zzhad) {
            zzhad zzhadVar = (zzhad) zzgwmVar;
            this.zza.push(zzhadVar);
            zzgwmVar = zzhadVar.zzd;
        }
        return (zzgwj) zzgwmVar;
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
    public final zzgwj next() {
        zzgwj zzgwjVar;
        zzgwj zzgwjVar2 = this.zzb;
        if (zzgwjVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgwjVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgwjVar = zzb(((zzhad) this.zza.pop()).zze);
        } while (zzgwjVar.zzd() == 0);
        this.zzb = zzgwjVar;
        return zzgwjVar2;
    }
}
