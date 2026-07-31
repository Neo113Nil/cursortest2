package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
final class zzetd implements zzeup {
    final /* synthetic */ zzete zza;

    zzetd(zzete zzeteVar) {
        Objects.requireNonNull(zzeteVar);
        this.zza = zzeteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final void zza() {
        zzete zzeteVar = this.zza;
        synchronized (zzeteVar) {
            zzeteVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzete zzeteVar = this.zza;
        zzcwd zzcwdVar = (zzcwd) obj;
        synchronized (zzeteVar) {
            try {
                if (zzeteVar.zzM() != null) {
                    if (zzcwdVar.zzo() != null && zzeteVar.zzM().zzo() != null) {
                        zzcwdVar.zzo().zzb(zzeteVar.zzM().zzo().zza());
                    }
                    zzeteVar.zzM().zzd();
                }
                zzeteVar.zzN(zzcwdVar);
                zzeteVar.zzM().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
