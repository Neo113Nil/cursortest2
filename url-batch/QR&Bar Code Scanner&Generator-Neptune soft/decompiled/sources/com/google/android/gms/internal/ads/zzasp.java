package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzasp implements zzasm {
    private final zzatb[] zza;
    private final zzazh zzb;
    private final zzazf zzc;
    private final Handler zzd;
    private final zzasu zze;
    private final CopyOnWriteArraySet zzf;
    private final zzatg zzg;
    private final zzatf zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzath zzo;
    private Object zzp;
    private zzayt zzq;
    private zzazf zzr;
    private zzata zzs;
    private zzasr zzt;
    private long zzu;

    public zzasp(zzatb[] zzatbVarArr, zzazh zzazhVar, zzcjv zzcjvVar, byte[] bArr) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.2 [" + zzbar.zze + "]");
        this.zza = zzatbVarArr;
        Objects.requireNonNull(zzazhVar);
        this.zzb = zzazhVar;
        this.zzj = false;
        this.zzk = 1;
        this.zzf = new CopyOnWriteArraySet();
        zzazf zzazfVar = new zzazf(new zzayx[2], null);
        this.zzc = zzazfVar;
        this.zzo = zzath.zza;
        this.zzg = new zzatg();
        this.zzh = new zzatf();
        this.zzq = zzayt.zza;
        this.zzr = zzazfVar;
        this.zzs = zzata.zza;
        zzaso zzasoVar = new zzaso(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzd = zzasoVar;
        this.zzt = new zzasr(0, 0L);
        this.zze = new zzasu(zzatbVarArr, zzazhVar, zzcjvVar, this.zzj, 0, zzasoVar, this.zzt, this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final int zza() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final long zzb() {
        if (this.zzo.zzh() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzash.zzb(0L) + zzash.zzb(this.zzt.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final long zzc() {
        if (this.zzo.zzh() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzash.zzb(0L) + zzash.zzb(this.zzt.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final long zzd() {
        if (this.zzo.zzh()) {
            return -9223372036854775807L;
        }
        zzath zzathVar = this.zzo;
        zzs();
        return zzash.zzb(zzathVar.zzg(0, this.zzg, false).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zze(zzasj zzasjVar) {
        this.zzf.add(zzasjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzf(zzasl... zzaslVarArr) {
        if (!this.zze.zzr()) {
            this.zze.zza(zzaslVarArr);
        } else {
            if (this.zze.zzq(zzaslVarArr)) {
                return;
            }
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).zzc(zzasi.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzg() {
        this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzh(int i) {
        this.zze.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzi() {
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzj(zzaye zzayeVar) {
        if (!this.zzo.zzh() || this.zzp != null) {
            this.zzo = zzath.zza;
            this.zzp = null;
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).zzf(this.zzo, this.zzp);
            }
        }
        if (this.zzi) {
            this.zzi = false;
            this.zzq = zzayt.zza;
            this.zzr = this.zzc;
            this.zzb.zzd(null);
            Iterator it2 = this.zzf.iterator();
            while (it2.hasNext()) {
                ((zzasj) it2.next()).zzg(this.zzq, this.zzr);
            }
        }
        this.zzm++;
        this.zze.zzi(zzayeVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzk() {
        if (!this.zze.zzr()) {
            this.zze.zzj();
            this.zzd.removeCallbacksAndMessages(null);
            return;
        }
        if (!this.zze.zzs()) {
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).zzc(zzasi.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
            }
        }
        this.zzd.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzl(zzasj zzasjVar) {
        this.zzf.remove(zzasjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzm(long j) {
        zzs();
        if (!this.zzo.zzh() && this.zzo.zzc() <= 0) {
            throw new zzasy(this.zzo, 0, j);
        }
        this.zzl++;
        if (!this.zzo.zzh()) {
            this.zzo.zzg(0, this.zzg, false);
            long zza = zzash.zza(j);
            long j2 = this.zzo.zzd(0, this.zzh, false).zzc;
            if (j2 != -9223372036854775807L) {
                int i = (zza > j2 ? 1 : (zza == j2 ? 0 : -1));
            }
        }
        this.zzu = j;
        this.zze.zzk(this.zzo, 0, zzash.zza(j));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            ((zzasj) it.next()).zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzn(zzasl... zzaslVarArr) {
        this.zze.zzl(zzaslVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzo(int i) {
        this.zze.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzp(int i) {
        this.zze.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzq(boolean z) {
        if (this.zzj != z) {
            this.zzj = z;
            this.zze.zzo(z);
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).zzd(z, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzr() {
        this.zze.zzp();
    }

    public final int zzs() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
        }
        return 0;
    }

    final void zzt(Message message) {
        switch (message.what) {
            case 0:
                this.zzm--;
                return;
            case 1:
                this.zzk = message.arg1;
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzasj) it.next()).zzd(this.zzj, this.zzk);
                }
                return;
            case 2:
                this.zzn = message.arg1 != 0;
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    ((zzasj) it2.next()).zza(this.zzn);
                }
                return;
            case 3:
                if (this.zzm == 0) {
                    zzazi zzaziVar = (zzazi) message.obj;
                    this.zzi = true;
                    this.zzq = zzaziVar.zza;
                    this.zzr = zzaziVar.zzb;
                    this.zzb.zzd(zzaziVar.zzc);
                    Iterator it3 = this.zzf.iterator();
                    while (it3.hasNext()) {
                        ((zzasj) it3.next()).zzg(this.zzq, this.zzr);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzl - 1;
                this.zzl = i;
                if (i == 0) {
                    this.zzt = (zzasr) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.zzf.iterator();
                        while (it4.hasNext()) {
                            ((zzasj) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzl == 0) {
                    this.zzt = (zzasr) message.obj;
                    Iterator it5 = this.zzf.iterator();
                    while (it5.hasNext()) {
                        ((zzasj) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                zzast zzastVar = (zzast) message.obj;
                this.zzl -= zzastVar.zzd;
                if (this.zzm == 0) {
                    this.zzo = zzastVar.zza;
                    this.zzp = zzastVar.zzb;
                    this.zzt = zzastVar.zzc;
                    Iterator it6 = this.zzf.iterator();
                    while (it6.hasNext()) {
                        ((zzasj) it6.next()).zzf(this.zzo, this.zzp);
                    }
                    return;
                }
                return;
            case 7:
                zzata zzataVar = (zzata) message.obj;
                if (this.zzs.equals(zzataVar)) {
                    return;
                }
                this.zzs = zzataVar;
                Iterator it7 = this.zzf.iterator();
                while (it7.hasNext()) {
                    ((zzasj) it7.next()).zzb(zzataVar);
                }
                return;
            case 8:
                zzasi zzasiVar = (zzasi) message.obj;
                Iterator it8 = this.zzf.iterator();
                while (it8.hasNext()) {
                    ((zzasj) it8.next()).zzc(zzasiVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
