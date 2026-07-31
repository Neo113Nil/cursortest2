package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgzj extends zzgxw {
    private final transient zzgxp zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    zzgzj(zzgxp zzgxpVar, Object[] objArr, int i, int i2) {
        this.zza = zzgxpVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi
    /* renamed from: zza */
    public final zzhaa iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    final int zzg(Object[] objArr, int i) {
        return zze().zzg(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    final zzgxm zzs() {
        return new zzgzi(this);
    }

    final /* synthetic */ Object[] zzw() {
        return this.zzb;
    }

    final /* synthetic */ int zzx() {
        return this.zzc;
    }
}
