package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzgke extends zzgjv implements Set {
    private transient zzgjz zza;

    zzgke() {
    }

    public static zzgke zzh() {
        return zzglq.zza;
    }

    public static zzgke zzi(Object obj) {
        return new zzgma(obj);
    }

    public static zzgke zzj(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgke zzk(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgke zzl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgke zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzv(i, objArr2);
    }

    static int zzn(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            zzghc.zzb(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzgke zzo(Collection collection) {
        if ((collection instanceof zzgke) && !(collection instanceof SortedSet)) {
            zzgke zzgkeVar = (zzgke) collection;
            if (!zzgkeVar.zzf()) {
                return zzgkeVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgke zzp(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgma(objArr[0]) : zzglq.zza;
    }

    public static zzgkd zzs(int i) {
        return new zzgkd(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgke) && zzq() && ((zzgke) obj).zzq() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzglz.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzglz.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgmd iterator();

    @Override // com.google.android.gms.internal.ads.zzgjv
    public zzgjz zze() {
        zzgjz zzgjzVar = this.zza;
        if (zzgjzVar != null) {
            return zzgjzVar;
        }
        zzgjz zzr = zzr();
        this.zza = zzr;
        return zzr;
    }

    boolean zzq() {
        return false;
    }

    zzgjz zzr() {
        Object[] array = toArray();
        int i = zzgjz.zzd;
        return zzgjz.zzt(array, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgke zzv(int i, Object... objArr) {
        if (i == 0) {
            return zzglq.zza;
        }
        if (i == 1) {
            return new zzgma(Objects.requireNonNull(objArr[0]));
        }
        int zzn = zzn(i);
        Object[] objArr2 = new Object[zzn];
        int i2 = zzn - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            zzgli.zzb(obj, i5);
            int hashCode = obj.hashCode();
            int zza = zzgjs.zza(hashCode);
            while (true) {
                int i6 = zza & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj2.equals(obj)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new zzgma(Objects.requireNonNull(objArr[0]));
        }
        if (zzn(i4) < zzn / 2) {
            return zzv(i4, objArr);
        }
        if (zzw(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzglq(objArr, i3, objArr2, i2, i4);
    }
}
