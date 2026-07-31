package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzglz {
    public static zzgly zza(Set set, Set set2) {
        zzghc.zzk(set, "set1");
        zzghc.zzk(set2, "set2");
        return new zzglu(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzb(Set set, zzghd zzghdVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzglv)) {
                set.getClass();
                return new zzglv(set, zzghdVar);
            }
            zzglv zzglvVar = (zzglv) set;
            return new zzglv((Set) zzglvVar.zza, zzghf.zza(zzglvVar.zzb, zzghdVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzglv)) {
            sortedSet.getClass();
            return new zzglw(sortedSet, zzghdVar);
        }
        zzglv zzglvVar2 = (zzglv) sortedSet;
        return new zzglw((SortedSet) zzglvVar2.zza, zzghf.zza(zzglvVar2.zzb, zzghdVar));
    }

    static int zzc(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    static boolean zzd(Set set, Object obj) {
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

    static boolean zzf(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzglg) {
            collection = ((zzglg) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
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
