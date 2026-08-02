package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdcd implements zzdeo, zzddv {
    private final Context zza;
    private final zzfdk zzb;
    private final zzbzh zzc;

    public zzdcd(Context context, zzfdk zzfdkVar, zzbzh zzbzhVar, byte[] bArr) {
        this.zza = context;
        this.zzb = zzfdkVar;
        this.zzc = zzbzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbq(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbs(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbt(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzn() {
        zzbzi zzbziVar = this.zzb.zzae;
        if (zzbziVar == null || !zzbziVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzae.zzb);
    }
}
