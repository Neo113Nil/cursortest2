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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzfui extends zzful implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    protected zzfui(Map map) {
        zzfsx.zze(map.isEmpty());
        this.zza = map;
    }

    static /* synthetic */ int zzd(zzfui zzfuiVar) {
        int i = zzfuiVar.zzb;
        zzfuiVar.zzb = i + 1;
        return i;
    }

    static /* synthetic */ int zze(zzfui zzfuiVar) {
        int i = zzfuiVar.zzb;
        zzfuiVar.zzb = i - 1;
        return i;
    }

    static /* synthetic */ int zzf(zzfui zzfuiVar, int i) {
        int i2 = zzfuiVar.zzb + i;
        zzfuiVar.zzb = i2;
        return i2;
    }

    static /* synthetic */ int zzg(zzfui zzfuiVar, int i) {
        int i2 = zzfuiVar.zzb - i;
        zzfuiVar.zzb = i2;
        return i2;
    }

    static /* synthetic */ void zzq(zzfui zzfuiVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfuiVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfuiVar.zzb -= size;
        }
    }

    abstract Collection zza();

    Collection zzb(Collection collection) {
        throw null;
    }

    Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzful
    final Collection zzi() {
        return new zzfuk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzful
    final Iterator zzj() {
        return new zzfts(this);
    }

    final List zzk(Object obj, List list, @CheckForNull zzfuf zzfufVar) {
        return list instanceof RandomAccess ? new zzfub(this, obj, list, zzfufVar) : new zzfuh(this, obj, list, zzfufVar);
    }

    @Override // com.google.android.gms.internal.ads.zzful
    Map zzm() {
        throw null;
    }

    final Map zzn() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzftz(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfuc(this, (SortedMap) map) : new zzftv(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzful
    Set zzo() {
        throw null;
    }

    final Set zzp() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfua(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfud(this, (SortedMap) map) : new zzfty(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final void zzr() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzful, com.google.android.gms.internal.ads.zzfwj
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
