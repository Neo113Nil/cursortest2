package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
abstract class zzgix implements zzgkx {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    zzgix() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgkx) {
            return zzt().equals(((zzgkx) obj).zzt());
        }
        return false;
    }

    public final int hashCode() {
        return zzt().hashCode();
    }

    public final String toString() {
        return zzt().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public boolean zze(Object obj, Object obj2) {
        throw null;
    }

    abstract Set zzh();

    abstract Collection zzj();

    Iterator zzk() {
        throw null;
    }

    abstract Map zzl();

    public final Set zzr() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final Collection zzs() {
        Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection zzj = zzj();
        this.zzb = zzj;
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final Map zzt() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map zzl = zzl();
        this.zzc = zzl;
        return zzl;
    }
}
