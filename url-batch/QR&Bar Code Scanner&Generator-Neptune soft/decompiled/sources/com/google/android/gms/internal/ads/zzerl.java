package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzerl implements zzeve {
    private final zzfag zza;

    zzerl(zzfag zzfagVar) {
        this.zza = zzfagVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        zzfag zzfagVar = this.zza;
        zzevd zzevdVar = null;
        if (zzfagVar != null && zzfagVar.zza() != null && !zzfagVar.zza().isEmpty()) {
            zzevdVar = new zzevd() { // from class: com.google.android.gms.internal.ads.zzerk
                @Override // com.google.android.gms.internal.ads.zzevd
                public final void zzf(Object obj) {
                    zzerl.this.zzc((Bundle) obj);
                }
            };
        }
        return zzfzg.zzi(zzevdVar);
    }

    final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
