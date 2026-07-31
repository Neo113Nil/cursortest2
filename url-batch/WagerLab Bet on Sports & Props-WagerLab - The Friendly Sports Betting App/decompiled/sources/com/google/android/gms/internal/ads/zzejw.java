package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzejw {
    private final zzdgh zza;

    public zzejw(zzdgh zzdghVar) {
        this.zza = zzdghVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcu zzfcuVar, zzfcj zzfcjVar, View view, zzejs zzejsVar) {
        zzeju zzejuVar = new zzeju(this, new zzejt(this, zzfcjVar));
        zzdfb zzd = this.zza.zzd(new zzcri(zzfcuVar, zzfcjVar, null), zzejuVar);
        zzejsVar.zzd(new zzejv(this, zzd));
        return zzd.zzh();
    }
}
