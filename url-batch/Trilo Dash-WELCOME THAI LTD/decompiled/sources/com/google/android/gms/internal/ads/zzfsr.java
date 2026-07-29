package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfsr extends zzfrh {
    final /* synthetic */ zzfss zza;

    zzfsr(zzfss zzfssVar) {
        this.zza = zzfssVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzfos.zza(i, i2, "index");
        zzfss zzfssVar = this.zza;
        int i3 = i + i;
        objArr = zzfssVar.zzb;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzfssVar.zzb;
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

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final boolean zzf() {
        return true;
    }
}
