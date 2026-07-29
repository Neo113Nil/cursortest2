package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfrh extends zzfrc implements List, RandomAccess {
    private static final zzfth zza = new zzfrf(zzfsq.zza, 0);

    zzfrh() {
    }

    public static zzfre zzi() {
        return new zzfre(4);
    }

    static zzfrh zzj(Object[] objArr) {
        return zzk(objArr, objArr.length);
    }

    static zzfrh zzk(Object[] objArr, int i) {
        return i == 0 ? zzfsq.zza : new zzfsq(objArr, i);
    }

    public static zzfrh zzm(Collection collection) {
        if (!(collection instanceof zzfrc)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzfso.zzb(array, length);
            return zzk(array, length);
        }
        zzfrh zzd = ((zzfrc) collection).zzd();
        if (!zzd.zzf()) {
            return zzd;
        }
        Object[] array2 = zzd.toArray();
        return zzk(array2, array2.length);
    }

    public static zzfrh zzn(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfsq.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfso.zzb(objArr2, length);
        return zzk(objArr2, length);
    }

    public static zzfrh zzo() {
        return zzfsq.zza;
    }

    public static zzfrh zzp(Object obj) {
        Object[] objArr = {obj};
        zzfso.zzb(objArr, 1);
        return zzk(objArr, 1);
    }

    public static zzfrh zzq(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfso.zzb(objArr, 2);
        return zzk(objArr, 2);
    }

    public static zzfrh zzr(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"2011", "1009", "3010"};
        zzfso.zzb(objArr, 3);
        return zzk(objArr, 3);
    }

    public static zzfrh zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfso.zzb(objArr, 5);
        return zzk(objArr, 5);
    }

    public static zzfrh zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfso.zzb(objArr, 6);
        return zzk(objArr, 6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzfoo.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzfoo.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    @Deprecated
    public final zzfrh zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    /* renamed from: zze */
    public final zzftg iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfrh subList(int i, int i2) {
        zzfos.zzg(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzfsq.zza : new zzfrg(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzfth listIterator(int i) {
        zzfos.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzfrf(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfrh zzl(Iterable iterable) {
        Objects.requireNonNull(iterable);
        return zzm(iterable);
    }
}
