package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzftc {
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
    public static Set zzb(Set set, zzfot zzfotVar) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof zzfsz) {
                zzfsz zzfszVar = (zzfsz) set;
                return new zzfsz(zzfszVar.zza, zzfow.zza(zzfszVar.zzb, zzfotVar));
            }
            Objects.requireNonNull(set);
            Objects.requireNonNull(zzfotVar);
            return new zzfsz(set, zzfotVar);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof zzfsz) {
            zzfsz zzfszVar2 = (zzfsz) sortedSet;
            return new zzfta((SortedSet) zzfszVar2.zza, zzfow.zza(zzfszVar2.zzb, zzfotVar));
        }
        Objects.requireNonNull(sortedSet);
        Objects.requireNonNull(zzfotVar);
        return new zzfta(sortedSet, zzfotVar);
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
        if (collection instanceof zzfsm) {
            collection = ((zzfsm) collection).zza();
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
