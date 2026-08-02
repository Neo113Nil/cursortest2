package com.google.android.gms.internal.ads;

import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfvm extends zzfvn {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfvn zzc;

    zzfvm(zzfvn zzfvnVar, int i, int i2) {
        this.zzc = zzfvnVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfsx.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    @CheckForNull
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    /* renamed from: zzh */
    public final zzfvn subList(int i, int i2) {
        zzfsx.zzg(i, i2, this.zzb);
        zzfvn zzfvnVar = this.zzc;
        int i3 = this.zza;
        return zzfvnVar.subList(i + i3, i2 + i3);
    }
}
