package com.google.android.gms.internal.ads;

import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzfrg extends zzfrh {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfrh zzc;

    zzfrg(zzfrh zzfrhVar, int i, int i2) {
        this.zzc = zzfrhVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfos.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    @CheckForNull
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    /* renamed from: zzh */
    public final zzfrh subList(int i, int i2) {
        zzfos.zzg(i, i2, this.zzb);
        zzfrh zzfrhVar = this.zzc;
        int i3 = this.zza;
        return zzfrhVar.subList(i + i3, i2 + i3);
    }
}
