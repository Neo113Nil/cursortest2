package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdkr {
    private final List zza;
    private final zzfkm zzb;
    private boolean zzc;

    public zzdkr(zzfdk zzfdkVar, zzfkm zzfkmVar) {
        this.zza = zzfdkVar.zzq;
        this.zzb = zzfkmVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
