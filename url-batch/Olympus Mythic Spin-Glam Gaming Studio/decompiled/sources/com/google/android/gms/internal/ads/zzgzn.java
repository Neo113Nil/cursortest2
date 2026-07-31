package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgzn extends zzgxw {
    static final zzgzn zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzgzn(objArr, 0, objArr, 0, 0);
    }

    zzgzn(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int zzb = zzgxf.zzb(obj);
                while (true) {
                    int i = zzb & this.zzf;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    zzb = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi
    /* renamed from: zza */
    public final zzhaa iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    final int zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    final int zzg(Object[] objArr, int i) {
        Object[] objArr2 = this.zzb;
        int i2 = this.zzg;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    final boolean zzr() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    final zzgxm zzs() {
        return zzgxm.zzt(this.zzb, this.zzg);
    }
}
