package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaaq implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzaap
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzaaq.zza;
            return new zzys[]{new zzaaq()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private zzyv zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzaao zzp;
    private zzaau zzq;
    private final zzdy zzb = new zzdy(4);
    private final zzdy zzc = new zzdy(9);
    private final zzdy zzd = new zzdy(11);
    private final zzdy zze = new zzdy();
    private final zzaar zzf = new zzaar();
    private int zzh = 1;

    private final zzdy zze(zzyt zzytVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzdy zzdyVar = this.zze;
            int zzb = zzdyVar.zzb();
            zzdyVar.zzD(new byte[Math.max(zzb + zzb, this.zzm)], 0);
        } else {
            this.zze.zzF(0);
        }
        this.zze.zzE(this.zzm);
        ((zzym) zzytVar).zzn(this.zze.zzH(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzL(new zzzu(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        boolean zzf;
        boolean z;
        zzcw.zzb(this.zzg);
        while (true) {
            int i = this.zzh;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((zzym) zzytVar).zzo(this.zzk, false);
                    this.zzk = 0;
                    this.zzh = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    long j = this.zzi ? this.zzj + this.zzn : this.zzf.zzc() == -9223372036854775807L ? 0L : this.zzn;
                    int i3 = this.zzl;
                    if (i3 != 8) {
                        i2 = i3;
                    } else if (this.zzp != null) {
                        zzf();
                        zzf = this.zzp.zzf(zze(zzytVar), j);
                        z = true;
                        if (!this.zzi && zzf) {
                            this.zzi = true;
                            this.zzj = this.zzf.zzc() != -9223372036854775807L ? -this.zzn : 0L;
                        }
                        this.zzk = 4;
                        this.zzh = 2;
                        if (!z) {
                            return 0;
                        }
                    }
                    if (i2 == 9) {
                        if (this.zzq != null) {
                            zzf();
                            zzf = this.zzq.zzf(zze(zzytVar), j);
                            z = true;
                        }
                        ((zzym) zzytVar).zzo(this.zzm, false);
                        zzf = false;
                        z = false;
                    } else {
                        if (i2 == 18 && !this.zzo) {
                            zzf = this.zzf.zzf(zze(zzytVar), j);
                            zzaar zzaarVar = this.zzf;
                            long zzc = zzaarVar.zzc();
                            if (zzc != -9223372036854775807L) {
                                this.zzg.zzL(new zzzk(zzaarVar.zzd(), zzaarVar.zze(), zzc));
                                this.zzo = true;
                            }
                            z = true;
                        }
                        ((zzym) zzytVar).zzo(this.zzm, false);
                        zzf = false;
                        z = false;
                    }
                    if (!this.zzi) {
                        this.zzi = true;
                        this.zzj = this.zzf.zzc() != -9223372036854775807L ? -this.zzn : 0L;
                    }
                    this.zzk = 4;
                    this.zzh = 2;
                    if (!z) {
                    }
                } else {
                    if (!zzytVar.zzn(this.zzd.zzH(), 0, 11, true)) {
                        return -1;
                    }
                    this.zzd.zzF(0);
                    this.zzl = this.zzd.zzk();
                    this.zzm = this.zzd.zzm();
                    this.zzn = this.zzd.zzm();
                    this.zzn = ((this.zzd.zzk() << 24) | this.zzn) * 1000;
                    this.zzd.zzG(3);
                    this.zzh = 4;
                }
            } else {
                if (!zzytVar.zzn(this.zzc.zzH(), 0, 9, true)) {
                    return -1;
                }
                this.zzc.zzF(0);
                this.zzc.zzG(4);
                int zzk = this.zzc.zzk();
                int i4 = zzk & 1;
                if ((zzk & 4) != 0 && this.zzp == null) {
                    this.zzp = new zzaao(this.zzg.zzv(8, 1));
                }
                if (i4 != 0 && this.zzq == null) {
                    this.zzq = new zzaau(this.zzg.zzv(9, 2));
                }
                this.zzg.zzB();
                this.zzk = this.zzc.zze() - 5;
                this.zzh = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzg = zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) throws IOException {
        zzym zzymVar = (zzym) zzytVar;
        zzymVar.zzm(this.zzb.zzH(), 0, 3, false);
        this.zzb.zzF(0);
        if (this.zzb.zzm() != 4607062) {
            return false;
        }
        zzymVar.zzm(this.zzb.zzH(), 0, 2, false);
        this.zzb.zzF(0);
        if ((this.zzb.zzo() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzymVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        int zze = this.zzb.zze();
        zzytVar.zzj();
        zzymVar.zzl(zze, false);
        zzymVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        return this.zzb.zze() == 0;
    }
}
