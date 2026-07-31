package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzxh extends zzxc {
    public static final Object zzc = new Object();

    @Nullable
    private final Object zzd;

    @Nullable
    private final Object zze;

    private zzxh(zzbf zzbfVar, @Nullable Object obj, @Nullable Object obj2) {
        super(zzbfVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzxh zzp(zzak zzakVar) {
        return new zzxh(new zzxi(zzakVar), zzbe.zza, zzc);
    }

    public static zzxh zzq(zzbf zzbfVar, @Nullable Object obj, @Nullable Object obj2) {
        return new zzxh(zzbfVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i, zzbe zzbeVar, long j) {
        this.zzb.zzb(i, zzbeVar, j);
        if (Objects.equals(zzbeVar.zzb, this.zzd)) {
            zzbeVar.zzb = zzbe.zza;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        this.zzb.zzd(i, zzbdVar, z);
        if (Objects.equals(zzbdVar.zzb, this.zze) && z) {
            zzbdVar.zzb = zzc;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i) {
        Object zzf = this.zzb.zzf(i);
        return Objects.equals(zzf, this.zze) ? zzc : zzf;
    }

    public final zzxh zzr(zzbf zzbfVar) {
        return new zzxh(zzbfVar, this.zzd, this.zze);
    }

    final /* synthetic */ Object zzs() {
        return this.zze;
    }
}
