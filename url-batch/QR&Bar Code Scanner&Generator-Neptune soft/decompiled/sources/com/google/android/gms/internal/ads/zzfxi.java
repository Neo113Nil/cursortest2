package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfxi {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfsy zzfsyVar) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof zzfxf) {
                zzfxf zzfxfVar = (zzfxf) set;
                return new zzfxf(zzfxfVar.zza, zzftb.zza(zzfxfVar.zzb, zzfsyVar));
            }
            Objects.requireNonNull(set);
            Objects.requireNonNull(zzfsyVar);
            return new zzfxf(set, zzfsyVar);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof zzfxf) {
            zzfxf zzfxfVar2 = (zzfxf) sortedSet;
            return new zzfxg((SortedSet) zzfxfVar2.zza, zzftb.zza(zzfxfVar2.zzb, zzfsyVar));
        }
        Objects.requireNonNull(sortedSet);
        Objects.requireNonNull(zzfsyVar);
        return new zzfxg(sortedSet, zzfsyVar);
    }

    static boolean zzc(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean zze(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    static boolean zzd(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzfws) {
            collection = ((zzfws) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        Objects.requireNonNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
