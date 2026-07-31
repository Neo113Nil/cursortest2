package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
abstract class zzgys extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    zzgys() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zza = zza();
        this.zza = zza;
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.zzb;
        if (set != null) {
            return set;
        }
        Set zzh = zzh();
        this.zzb = zzh;
        return zzh;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        zzgyr zzgyrVar = new zzgyr(this);
        this.zzc = zzgyrVar;
        return zzgyrVar;
    }

    abstract Set zza();

    Set zzh() {
        return new zzgyq(this);
    }
}
