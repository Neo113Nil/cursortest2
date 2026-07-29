package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfrj {
    Object[] zza;
    int zzb;
    zzfri zzc;

    public zzfrj() {
        this(4);
    }

    private final void zzd(int i) {
        int i2 = i + i;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfrb.zzd(length, i2));
        }
    }

    public final zzfrj zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfqg.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfrj zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfrk zzc() {
        zzfri zzfriVar = this.zzc;
        if (zzfriVar != null) {
            throw zzfriVar.zza();
        }
        zzfsv zzh = zzfsv.zzh(this.zzb, this.zza, this);
        zzfri zzfriVar2 = this.zzc;
        if (zzfriVar2 == null) {
            return zzh;
        }
        throw zzfriVar2.zza();
    }

    zzfrj(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
