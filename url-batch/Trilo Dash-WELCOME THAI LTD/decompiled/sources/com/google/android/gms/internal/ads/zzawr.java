package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzawr implements zzayu {
    final /* synthetic */ zzawu zza;
    private final Uri zzb;
    private final zzayi zzc;
    private final zzaws zzd;
    private final zzaza zze;
    private final zzaua zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;

    public zzawr(zzawu zzawuVar, Uri uri, zzayi zzayiVar, zzaws zzawsVar, zzaza zzazaVar) {
        this.zza = zzawuVar;
        Objects.requireNonNull(uri);
        this.zzb = uri;
        Objects.requireNonNull(zzayiVar);
        this.zzc = zzayiVar;
        Objects.requireNonNull(zzawsVar);
        this.zzd = zzawsVar;
        this.zze = zzazaVar;
        this.zzf = new zzaua();
        this.zzh = true;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zzb() {
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zzc() throws IOException, InterruptedException {
        zzatu zzatuVar;
        long j;
        long j2;
        Handler handler;
        Runnable runnable;
        while (!this.zzg) {
            int i = 0;
            try {
                long j3 = this.zzf.zza;
                long zzb = this.zzc.zzb(new zzayk(this.zzb, null, j3, j3, -1L, null, 0));
                this.zzj = zzb;
                if (zzb != -1) {
                    j = j3;
                    zzb += j;
                    this.zzj = zzb;
                } else {
                    j = j3;
                }
                zzatuVar = new zzatu(this.zzc, j, zzb);
                try {
                    zzatv zzb2 = this.zzd.zzb(zzatuVar, this.zzc.zzc());
                    if (this.zzh) {
                        zzb2.zze(j, this.zzi);
                        this.zzh = false;
                    }
                    long j4 = j;
                    int i2 = 0;
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
                            i2 = zzb2.zzf(zzatuVar, this.zzf);
                            long zzd = zzatuVar.zzd();
                            j2 = this.zza.zzg;
                            if (zzd > j2 + j4) {
                                j4 = zzatuVar.zzd();
                                this.zze.zzb();
                                zzawu zzawuVar = this.zza;
                                handler = zzawuVar.zzm;
                                runnable = zzawuVar.zzl;
                                handler.post(runnable);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (i != 1 && zzatuVar != null) {
                                this.zzf.zza = zzatuVar.zzd();
                            }
                            zzazn.zzm(this.zzc);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.zzf.zza = zzatuVar.zzd();
                        i = i2;
                    }
                    zzazn.zzm(this.zzc);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zzatuVar = null;
            }
        }
    }

    public final void zzd(long j, long j2) {
        this.zzf.zza = j;
        this.zzi = j2;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final boolean zze() {
        return this.zzg;
    }
}
