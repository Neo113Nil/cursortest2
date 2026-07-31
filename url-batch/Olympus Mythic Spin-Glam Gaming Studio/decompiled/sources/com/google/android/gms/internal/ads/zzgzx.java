package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgzx extends zzgxw {
    final transient Object zza;

    zzgzx(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgye(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append(X3.j.d);
        sb.append(obj);
        sb.append(X3.j.e);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi
    /* renamed from: zza */
    public final zzhaa iterator() {
        return new zzgye(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi
    public final zzgxm zze() {
        return zzgxm.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    final int zzg(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }
}
