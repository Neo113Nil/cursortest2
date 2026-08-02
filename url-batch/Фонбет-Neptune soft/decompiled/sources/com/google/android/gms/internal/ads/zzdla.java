package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdla implements zzcxk {
    private final zzdjb zza;
    private final zzdjg zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdla(zzdjb zzdjbVar, zzdjg zzdjgVar, Executor executor, Executor executor2) {
        this.zza = zzdjbVar;
        this.zzb = zzdjgVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcej zzcejVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdky
            @Override // java.lang.Runnable
            public final void run() {
                zzcej.this.zzd("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdjb zzdjbVar = this.zza;
            zzeeo zzu = zzdjbVar.zzu();
            if (zzu == null && zzdjbVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeH)).booleanValue()) {
                zzdjb zzdjbVar2 = this.zza;
                ListenableFuture zzw = zzdjbVar2.zzw();
                zzbzt zzp = zzdjbVar2.zzp();
                if (zzw == null || zzp == null) {
                    return;
                }
                zzgcj.zzr(zzgcj.zzl(zzw, zzp), new zzdkz(this), this.zzd);
                return;
            }
            if (zzu != null) {
                zzdjb zzdjbVar3 = this.zza;
                zzcej zzr = zzdjbVar3.zzr();
                zzcej zzs = zzdjbVar3.zzs();
                if (zzr == null) {
                    zzr = zzs != null ? zzs : null;
                }
                if (zzr != null) {
                    zzb(zzr);
                }
            }
        }
    }
}
