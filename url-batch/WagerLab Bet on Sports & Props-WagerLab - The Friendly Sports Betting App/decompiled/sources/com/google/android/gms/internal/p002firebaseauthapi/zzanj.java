package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzanj<K, V> implements Iterator<Map.Entry<K, V>> {
    private int zza;
    private boolean zzb;
    private Iterator<Map.Entry<K, V>> zzc;
    private final /* synthetic */ zzang zzd;

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i;
        Object[] objArr;
        this.zzb = true;
        int i2 = this.zza + 1;
        this.zza = i2;
        i = this.zzd.zzb;
        if (i2 >= i) {
            return zza().next();
        }
        objArr = this.zzd.zza;
        return (zzank) objArr[this.zza];
    }

    private final Iterator<Map.Entry<K, V>> zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    private zzanj(zzang zzangVar) {
        Objects.requireNonNull(zzangVar);
        this.zzd = zzangVar;
        this.zza = -1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        int i2 = this.zza;
        i = this.zzd.zzb;
        if (i2 < i) {
            zzang zzangVar = this.zzd;
            int i3 = this.zza;
            this.zza = i3 - 1;
            zzangVar.zzb(i3);
            return;
        }
        zza().remove();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        Map map;
        int i2 = this.zza + 1;
        i = this.zzd.zzb;
        if (i2 >= i) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }
}
