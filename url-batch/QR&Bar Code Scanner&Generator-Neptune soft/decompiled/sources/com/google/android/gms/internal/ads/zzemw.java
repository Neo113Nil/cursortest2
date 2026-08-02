package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzemw {
    private final zzdmh zza;

    public zzemw(Context context, zzdmh zzdmhVar) {
        this.zza = zzdmhVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfdw zzfdwVar, zzfdk zzfdkVar, View view, zzems zzemsVar) {
        zzdlh zze = this.zza.zze(new zzczt(zzfdwVar, zzfdkVar, null), new zzemu(this, new zzdmp() { // from class: com.google.android.gms.internal.ads.zzemt
            @Override // com.google.android.gms.internal.ads.zzdmp
            public final void zza(boolean z, Context context, zzddn zzddnVar) {
            }
        }));
        zzemsVar.zzd(new zzemv(this, zze));
        return zze.zzg();
    }
}
