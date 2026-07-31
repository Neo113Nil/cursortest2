package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbos {
    private final com.google.android.gms.ads.formats.zze zza;

    @Nullable
    private final com.google.android.gms.ads.formats.zzd zzb;

    @Nullable
    @GuardedBy
    private zzbnn zzc;

    public zzbos(com.google.android.gms.ads.formats.zze zzeVar, @Nullable com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = zzeVar;
        this.zzb = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbnn zze(zzbnm zzbnmVar) {
        zzbnn zzbnnVar = this.zzc;
        if (zzbnnVar != null) {
            return zzbnnVar;
        }
        zzbnn zzbnnVar2 = new zzbnn(zzbnmVar);
        this.zzc = zzbnnVar2;
        return zzbnnVar2;
    }

    public final zzbnz zza() {
        return new zzbor(this, null);
    }

    @Nullable
    public final zzbnw zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzboq(this, null);
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zze zzc() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zzd zzd() {
        return this.zzb;
    }
}
