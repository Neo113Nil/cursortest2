package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzega implements zzfii {
    private final zzefo zza;
    private final zzefs zzb;

    zzega(zzefo zzefoVar, zzefs zzefsVar) {
        this.zza = zzefoVar;
        this.zzb = zzefsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzbF(zzfib zzfibVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzbG(zzfib zzfibVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfm)).booleanValue() && zzfib.RENDERER == zzfibVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzc(zzfib zzfibVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfm)).booleanValue()) {
            if (zzfib.RENDERER == zzfibVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                return;
            }
            if (zzfib.PRELOADED_LOADER == zzfibVar || zzfib.SERVER_TRANSACTION == zzfibVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                final zzefs zzefsVar = this.zzb;
                final long zzd = this.zza.zzd();
                zzefsVar.zza.zza(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzefr
                    @Override // com.google.android.gms.internal.ads.zzfhk
                    public final Object zza(Object obj) {
                        zzefs zzefsVar2 = zzefs.this;
                        long j = zzd;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzefsVar2.zzf()) {
                            return null;
                        }
                        zzbgx zzg = zzbgy.zzg();
                        zzg.zzh(j);
                        byte[] zzax = ((zzbgy) zzg.zzam()).zzax();
                        zzefz.zzg(sQLiteDatabase, false, false);
                        zzefz.zzd(sQLiteDatabase, j, zzax);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzd(zzfib zzfibVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfm)).booleanValue() && zzfib.RENDERER == zzfibVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }
}
