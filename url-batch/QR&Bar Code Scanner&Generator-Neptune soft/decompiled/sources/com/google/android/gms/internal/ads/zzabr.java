package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzabr implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzabq
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzabr.zza;
            return new zzzi[]{new zzabr()};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private zzzl zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzabp zzp;
    private zzabv zzq;
    private final zzef zzb = new zzef(4);
    private final zzef zzc = new zzef(9);
    private final zzef zzd = new zzef(11);
    private final zzef zze = new zzef();
    private final zzabs zzf = new zzabs();
    private int zzh = 1;

    private final zzef zze(zzzj zzzjVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzef zzefVar = this.zze;
            int zzb = zzefVar.zzb();
            zzefVar.zzD(new byte[Math.max(zzb + zzb, this.zzm)], 0);
        } else {
            this.zze.zzF(0);
        }
        this.zze.zzE(this.zzm);
        ((zzyy) zzzjVar).zzn(this.zze.zzH(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzN(new zzaak(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        boolean zzf;
        boolean z;
        zzdd.zzb(this.zzg);
        while (true) {
            int i = this.zzh;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((zzyy) zzzjVar).zzo(this.zzk, false);
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
                        zzf = this.zzp.zzf(zze(zzzjVar), j);
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
                            zzf = this.zzq.zzf(zze(zzzjVar), j);
                            z = true;
                        }
                        ((zzyy) zzzjVar).zzo(this.zzm, false);
                        zzf = false;
                        z = false;
                    } else {
                        if (i2 == 18 && !this.zzo) {
                            zzf = this.zzf.zzf(zze(zzzjVar), j);
                            zzabs zzabsVar = this.zzf;
                            long zzc = zzabsVar.zzc();
                            if (zzc != -9223372036854775807L) {
                                this.zzg.zzN(new zzaaa(zzabsVar.zzd(), zzabsVar.zze(), zzc));
                                this.zzo = true;
                            }
                            z = true;
                        }
                        ((zzyy) zzzjVar).zzo(this.zzm, false);
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
                    if (!zzzjVar.zzn(this.zzd.zzH(), 0, 11, true)) {
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
                if (!zzzjVar.zzn(this.zzc.zzH(), 0, 9, true)) {
                    return -1;
                }
                this.zzc.zzF(0);
                this.zzc.zzG(4);
                int zzk = this.zzc.zzk();
                int i4 = zzk & 1;
                if ((zzk & 4) != 0 && this.zzp == null) {
                    this.zzp = new zzabp(this.zzg.zzv(8, 1));
                }
                if (i4 != 0 && this.zzq == null) {
                    this.zzq = new zzabv(this.zzg.zzv(9, 2));
                }
                this.zzg.zzC();
                this.zzk = this.zzc.zze() - 5;
                this.zzh = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzg = zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        zzyy zzyyVar = (zzyy) zzzjVar;
        zzyyVar.zzm(this.zzb.zzH(), 0, 3, false);
        this.zzb.zzF(0);
        if (this.zzb.zzm() != 4607062) {
            return false;
        }
        zzyyVar.zzm(this.zzb.zzH(), 0, 2, false);
        this.zzb.zzF(0);
        if ((this.zzb.zzo() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzyyVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        int zze = this.zzb.zze();
        zzzjVar.zzj();
        zzyyVar.zzl(zze, false);
        zzyyVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        return this.zzb.zze() == 0;
    }
}
