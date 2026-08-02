package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfwx extends zzfvn {
    final /* synthetic */ zzfwy zza;

    zzfwx(zzfwy zzfwyVar) {
        this.zza = zzfwyVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzfsx.zza(i, i2, "index");
        zzfwy zzfwyVar = this.zza;
        int i3 = i + i;
        objArr = zzfwyVar.zzb;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzfwyVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final boolean zzf() {
        return true;
    }
}
