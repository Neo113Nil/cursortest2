package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfxj extends zzfvs {
    final transient Object zza;

    zzfxj(Object obj) {
        Objects.requireNonNull(obj);
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvs, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfvs, com.google.android.gms.internal.ads.zzfvi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfvv(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.zza.toString() + ']';
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    final int zza(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfvs, com.google.android.gms.internal.ads.zzfvi
    public final zzfvn zzd() {
        return zzfvn.zzp(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvs, com.google.android.gms.internal.ads.zzfvi
    /* renamed from: zze */
    public final zzfxm iterator() {
        return new zzfvv(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    final boolean zzf() {
        throw null;
    }
}
