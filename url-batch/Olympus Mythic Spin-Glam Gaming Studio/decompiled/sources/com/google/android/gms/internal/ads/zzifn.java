package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
final class zzifn extends zzidu implements RandomAccess, zzifu, zzihf {
    private static final int[] zza;
    private static final zzifn zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzifn(iArr, 0, false);
    }

    zzifn() {
        this(zza, 0, true);
    }

    public static zzifn zzd() {
        return zzb;
    }

    private static int zzk(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzl(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzm(i));
        }
    }

    private final String zzm(int i) {
        int i2 = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i2).length());
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzidu, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzdY();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzm(i));
        }
        int i3 = i + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i);
            System.arraycopy(this.zzc, i, iArr2, i3, this.zzd - i);
            this.zzc = iArr2;
        }
        this.zzc[i] = intValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzidu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdY();
        collection.getClass();
        if (!(collection instanceof zzifn)) {
            return super.addAll(collection);
        }
        zzifn zzifnVar = (zzifn) collection;
        int i = zzifnVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzc;
        if (i3 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(zzifnVar.zzc, 0, this.zzc, this.zzd, zzifnVar.zzd);
        this.zzd = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzidu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzifn)) {
            return super.equals(obj);
        }
        zzifn zzifnVar = (zzifn) obj;
        if (this.zzd != zzifnVar.zzd) {
            return false;
        }
        int[] iArr = zzifnVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzl(i);
        return Integer.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzidu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            i = (i * 31) + this.zzc[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzidu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdY();
        zzl(i);
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdY();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i2, iArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzidu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Integer.valueOf(zzg(i, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzify, com.google.android.gms.internal.ads.zzifo
    /* renamed from: zze */
    public final zzifu zzh(int i) {
        if (i >= this.zzd) {
            return new zzifn(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final int zzf(int i) {
        zzl(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final int zzg(int i, int i2) {
        zzdY();
        zzl(i);
        int[] iArr = this.zzc;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzi(int i) {
        zzdY();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            int[] iArr = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        iArr2[i3] = i;
    }

    final void zzj(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzk(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzifn(int[] iArr, int i, boolean z) {
        super(z);
        this.zzc = iArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzidu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
