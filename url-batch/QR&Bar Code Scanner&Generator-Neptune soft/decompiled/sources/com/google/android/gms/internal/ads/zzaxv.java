package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaxv implements zzazy {
    final /* synthetic */ zzaxy zza;
    private final Uri zzb;
    private final zzazm zzc;
    private final zzaxw zzd;
    private final zzbae zze;
    private final zzave zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;

    public zzaxv(zzaxy zzaxyVar, Uri uri, zzazm zzazmVar, zzaxw zzaxwVar, zzbae zzbaeVar) {
        this.zza = zzaxyVar;
        Objects.requireNonNull(uri);
        this.zzb = uri;
        Objects.requireNonNull(zzazmVar);
        this.zzc = zzazmVar;
        Objects.requireNonNull(zzaxwVar);
        this.zzd = zzaxwVar;
        this.zze = zzbaeVar;
        this.zzf = new zzave();
        this.zzh = true;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzb() {
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzc() throws IOException, InterruptedException {
        zzauy zzauyVar;
        long j;
        long j2;
        Handler handler;
        Runnable runnable;
        while (!this.zzg) {
            int i = 0;
            try {
                long j3 = this.zzf.zza;
                long zzb = this.zzc.zzb(new zzazo(this.zzb, null, j3, j3, -1L, null, 0));
                this.zzj = zzb;
                if (zzb != -1) {
                    j = j3;
                    zzb += j;
                    this.zzj = zzb;
                } else {
                    j = j3;
                }
                zzauyVar = new zzauy(this.zzc, j, zzb);
                try {
                    zzauz zzb2 = this.zzd.zzb(zzauyVar, this.zzc.zzc());
                    if (this.zzh) {
                        zzb2.zze(j, this.zzi);
                        this.zzh = false;
                    }
                    int i2 = 0;
                    long j4 = j;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.zzg) {
                                i2 = 0;
                                break;
                            }
                            this.zze.zza();
                            i2 = zzb2.zzf(zzauyVar, this.zzf);
                            long zzd = zzauyVar.zzd();
                            j2 = this.zza.zzg;
                            if (zzd > j2 + j4) {
                                j4 = zzauyVar.zzd();
                                this.zze.zzb();
                                zzaxy zzaxyVar = this.zza;
                                handler = zzaxyVar.zzm;
                                runnable = zzaxyVar.zzl;
                                handler.post(runnable);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (i != 1 && zzauyVar != null) {
                                this.zzf.zza = zzauyVar.zzd();
                            }
                            zzbar.zzm(this.zzc);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.zzf.zza = zzauyVar.zzd();
                        i = i2;
                    }
                    zzbar.zzm(this.zzc);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zzauyVar = null;
            }
        }
    }

    public final void zzd(long j, long j2) {
        this.zzf.zza = j;
        this.zzi = j2;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final boolean zze() {
        return this.zzg;
    }
}
