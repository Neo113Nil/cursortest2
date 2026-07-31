package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdku implements zzcwm {
    private final zzdiu zza;
    private final zzdiz zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdku(zzdiu zzdiuVar, zzdiz zzdizVar, Executor executor, Executor executor2) {
        this.zza = zzdiuVar;
        this.zzb = zzdizVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzcek zzcekVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcek.this.zze("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        if (this.zzb.zzd()) {
            zzdiu zzdiuVar = this.zza;
            zzedu zzZ = zzdiuVar.zzZ();
            if (zzZ == null && zzdiuVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfQ)).booleanValue()) {
                ListenableFuture zzX = zzdiuVar.zzX();
                zzbzm zzY = zzdiuVar.zzY();
                if (zzX == null || zzY == null) {
                    return;
                }
                zzgot.zzq(zzgot.zzp(zzX, zzY), new zzdks(this), this.zzd);
                return;
            }
            if (zzZ != null) {
                zzcek zzW = zzdiuVar.zzW();
                zzcek zzT = zzdiuVar.zzT();
                if (zzW == null) {
                    zzW = zzT == null ? null : zzT;
                }
                if (zzW != null) {
                    zza(zzW);
                }
            }
        }
    }
}
