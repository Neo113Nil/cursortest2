package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfvn extends zzfvi implements List, RandomAccess {
    private static final zzfxn zza = new zzfvl(zzfww.zza, 0);

    zzfvn() {
    }

    public static zzfvk zzi() {
        return new zzfvk(4);
    }

    static zzfvn zzj(Object[] objArr) {
        return zzk(objArr, objArr.length);
    }

    static zzfvn zzk(Object[] objArr, int i) {
        return i == 0 ? zzfww.zza : new zzfww(objArr, i);
    }

    public static zzfvn zzm(Collection collection) {
        if (!(collection instanceof zzfvi)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzfwu.zzb(array, length);
            return zzk(array, length);
        }
        zzfvn zzd = ((zzfvi) collection).zzd();
        if (!zzd.zzf()) {
            return zzd;
        }
        Object[] array2 = zzd.toArray();
        return zzk(array2, array2.length);
    }

    public static zzfvn zzn(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfww.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfwu.zzb(objArr2, length);
        return zzk(objArr2, length);
    }

    public static zzfvn zzo() {
        return zzfww.zza;
    }

    public static zzfvn zzp(Object obj) {
        Object[] objArr = {obj};
        zzfwu.zzb(objArr, 1);
        return zzk(objArr, 1);
    }

    public static zzfvn zzq(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfwu.zzb(objArr, 2);
        return zzk(objArr, 2);
    }

    public static zzfvn zzr(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"2011", "1009", "3010"};
        zzfwu.zzb(objArr, 3);
        return zzk(objArr, 3);
    }

    public static zzfvn zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfwu.zzb(objArr, 5);
        return zzk(objArr, 5);
    }

    public static zzfvn zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfwu.zzb(objArr, 6);
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

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.AbstractCollection, java.util.Collection
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
                        if (zzfss.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzfss.zza(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.ads.zzfvi
    int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    @Deprecated
    public final zzfvn zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    /* renamed from: zze */
    public final zzfxm iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfvn subList(int i, int i2) {
        zzfsx.zzg(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzfww.zza : new zzfvm(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzfxn listIterator(int i) {
        zzfsx.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzfvl(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfvn zzl(Iterable iterable) {
        Objects.requireNonNull(iterable);
        return zzm(iterable);
    }
}
