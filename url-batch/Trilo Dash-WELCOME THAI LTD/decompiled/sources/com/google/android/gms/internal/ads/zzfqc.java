package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
abstract class zzfqc extends zzfqf implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    protected zzfqc(Map map) {
        zzfos.zze(map.isEmpty());
        this.zza = map;
    }

    static /* synthetic */ int zzd(zzfqc zzfqcVar) {
        int i = zzfqcVar.zzb;
        zzfqcVar.zzb = i + 1;
        return i;
    }

    static /* synthetic */ int zze(zzfqc zzfqcVar) {
        int i = zzfqcVar.zzb;
        zzfqcVar.zzb = i - 1;
        return i;
    }

    static /* synthetic */ int zzf(zzfqc zzfqcVar, int i) {
        int i2 = zzfqcVar.zzb + i;
        zzfqcVar.zzb = i2;
        return i2;
    }

    static /* synthetic */ int zzg(zzfqc zzfqcVar, int i) {
        int i2 = zzfqcVar.zzb - i;
        zzfqcVar.zzb = i2;
        return i2;
    }

    static /* synthetic */ void zzq(zzfqc zzfqcVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfqcVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfqcVar.zzb -= size;
        }
    }

    abstract Collection zza();

    Collection zzb(Collection collection) {
        throw null;
    }

    Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final Collection zzi() {
        return new zzfqe(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final Iterator zzj() {
        return new zzfpm(this);
    }

    final List zzk(Object obj, List list, @CheckForNull zzfpz zzfpzVar) {
        return list instanceof RandomAccess ? new zzfpv(this, obj, list, zzfpzVar) : new zzfqb(this, obj, list, zzfpzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    Map zzm() {
        throw null;
    }

    final Map zzn() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfpt(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfpw(this, (SortedMap) map) : new zzfpp(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    Set zzo() {
        throw null;
    }

    final Set zzp() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfpu(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfpx(this, (SortedMap) map) : new zzfps(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final void zzr() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, com.google.android.gms.internal.ads.zzfsd
    public final boolean zzs(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection zza = zza();
        if (!zza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, zza);
        return true;
    }
}
