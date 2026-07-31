package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhki implements Iterator {
    private final ArrayDeque zza;
    private zzhgy zzb;

    /* synthetic */ zzhki(zzhhb zzhhbVar, byte[] bArr) {
        if (!(zzhhbVar instanceof zzhkj)) {
            this.zza = null;
            this.zzb = (zzhgy) zzhhbVar;
            return;
        }
        zzhkj zzhkjVar = (zzhkj) zzhhbVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhkjVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhkjVar);
        this.zzb = zzb(zzhkjVar.zzB());
    }

    private final zzhgy zzb(zzhhb zzhhbVar) {
        while (zzhhbVar instanceof zzhkj) {
            zzhkj zzhkjVar = (zzhkj) zzhhbVar;
            this.zza.push(zzhkjVar);
            zzhhbVar = zzhkjVar.zzB();
        }
        return (zzhgy) zzhhbVar;
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
    public final zzhgy next() {
        zzhgy zzhgyVar;
        zzhgy zzhgyVar2 = this.zzb;
        if (zzhgyVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzhgyVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzhgyVar = zzb(((zzhkj) arrayDeque.pop()).zzC());
        } while (zzhgyVar.zzc() == 0);
        this.zzb = zzhgyVar;
        return zzhgyVar2;
    }
}
