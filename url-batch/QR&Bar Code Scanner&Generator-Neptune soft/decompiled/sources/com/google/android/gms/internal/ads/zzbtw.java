package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbtw {
    private final Context zzb;
    private final String zzc;
    private final zzcgv zzd;
    private final zzfjw zze;
    private final com.google.android.gms.ads.internal.util.zzbb zzf;
    private final com.google.android.gms.ads.internal.util.zzbb zzg;
    private zzbtv zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbtw(Context context, zzcgv zzcgvVar, String str, com.google.android.gms.ads.internal.util.zzbb zzbbVar, com.google.android.gms.ads.internal.util.zzbb zzbbVar2, zzfjw zzfjwVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcgvVar;
        this.zze = zzfjwVar;
        this.zzf = zzbbVar;
        this.zzg = zzbbVar2;
    }

    public final zzbtq zzb(zzape zzapeVar) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbtv zzbtvVar = this.zzh;
                if (zzbtvVar != null && this.zzi == 0) {
                    zzbtvVar.zzi(new zzchl() { // from class: com.google.android.gms.internal.ads.zzbtb
                        @Override // com.google.android.gms.internal.ads.zzchl
                        public final void zza(Object obj) {
                            zzbtw.this.zzk((zzbsr) obj);
                        }
                    }, new zzchj() { // from class: com.google.android.gms.internal.ads.zzbtc
                        @Override // com.google.android.gms.internal.ads.zzchj
                        public final void zza() {
                        }
                    });
                }
            }
            zzbtv zzbtvVar2 = this.zzh;
            if (zzbtvVar2 != null && zzbtvVar2.zze() != -1) {
                int i = this.zzi;
                if (i == 0) {
                    return this.zzh.zza();
                }
                if (i != 1) {
                    return this.zzh.zza();
                }
                this.zzi = 2;
                zzd(null);
                return this.zzh.zza();
            }
            this.zzi = 2;
            zzbtv zzd = zzd(null);
            this.zzh = zzd;
            return zzd.zza();
        }
    }

    protected final zzbtv zzd(zzape zzapeVar) {
        zzfjj zza = zzfji.zza(this.zzb, 6);
        zza.zzf();
        final zzbtv zzbtvVar = new zzbtv(this.zzg);
        final zzape zzapeVar2 = null;
        zzchc.zze.execute(new Runnable(zzapeVar2, zzbtvVar) { // from class: com.google.android.gms.internal.ads.zzbtd
            public final /* synthetic */ zzbtv zzb;

            {
                this.zzb = zzbtvVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbtw.this.zzj(null, this.zzb);
            }
        });
        zzbtvVar.zzi(new zzbtl(this, zzbtvVar, zza), new zzbtm(this, zzbtvVar, zza));
        return zzbtvVar;
    }

    final /* synthetic */ void zzi(zzbtv zzbtvVar, final zzbsr zzbsrVar) {
        synchronized (this.zza) {
            if (zzbtvVar.zze() != -1 && zzbtvVar.zze() != 1) {
                zzbtvVar.zzg();
                zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbsr.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    final /* synthetic */ void zzj(zzape zzapeVar, zzbtv zzbtvVar) {
        try {
            zzbsz zzbszVar = new zzbsz(this.zzb, this.zzd, null, null);
            zzbszVar.zzk(new zzbtf(this, zzbtvVar, zzbszVar));
            zzbszVar.zzq("/jsLoaded", new zzbth(this, zzbtvVar, zzbszVar));
            com.google.android.gms.ads.internal.util.zzca zzcaVar = new com.google.android.gms.ads.internal.util.zzca();
            zzbti zzbtiVar = new zzbti(this, null, zzbszVar, zzcaVar);
            zzcaVar.zzb(zzbtiVar);
            zzbszVar.zzq("/requestReload", zzbtiVar);
            if (this.zzc.endsWith(".js")) {
                zzbszVar.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbszVar.zzf(this.zzc);
            } else {
                zzbszVar.zzg(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbtk(this, zzbtvVar, zzbszVar), 60000L);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zzh("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbtvVar.zzg();
        }
    }

    final /* synthetic */ void zzk(zzbsr zzbsrVar) {
        if (zzbsrVar.zzi()) {
            this.zzi = 1;
        }
    }
}
