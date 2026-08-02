package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfvp {
    Object[] zza;
    int zzb;
    zzfvo zzc;

    public zzfvp() {
        this(4);
    }

    private final void zzd(int i) {
        int i2 = i + i;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfvh.zzd(length, i2));
        }
    }

    public final zzfvp zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfum.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfvp zzb(Iterable iterable) {
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

    public final zzfvq zzc() {
        zzfvo zzfvoVar = this.zzc;
        if (zzfvoVar != null) {
            throw zzfvoVar.zza();
        }
        zzfxb zzi = zzfxb.zzi(this.zzb, this.zza, this);
        zzfvo zzfvoVar2 = this.zzc;
        if (zzfvoVar2 == null) {
            return zzi;
        }
        throw zzfvoVar2.zza();
    }

    zzfvp(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
