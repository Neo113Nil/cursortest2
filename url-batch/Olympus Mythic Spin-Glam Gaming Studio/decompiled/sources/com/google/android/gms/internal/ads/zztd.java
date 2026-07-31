package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zztd implements zzqz {
    private static final Object zza = new Object();

    @Nullable
    @GuardedBy
    private static ScheduledExecutorService zzb;

    @GuardedBy
    private static int zzc;
    private final AudioTrack zzd;
    private final zzri zze;
    private final float zzf;

    @Nullable
    private final zzsq zzg;

    @Nullable
    private zzsu zzh;
    private final zztk zzi;
    private final boolean zzj;
    private final int zzk;

    @Nullable
    private final zztc zzl;
    private final zzeg zzm = new zzeg(Thread.currentThread());
    private boolean zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    /* JADX WARN: Multi-variable type inference failed */
    public zztd(AudioTrack audioTrack, zzri zzriVar, @Nullable zzsq zzsqVar, float f, zzdp zzdpVar) {
        this.zzd = audioTrack;
        this.zze = zzriVar;
        this.zzf = f;
        this.zzg = zzsqVar;
        boolean zzE = zzfm.zzE(zzriVar.zza);
        this.zzj = zzE;
        if (zzE) {
            this.zzk = zzfm.zzI(zzriVar.zza) * Integer.bitCount(zzriVar.zzc);
        } else {
            this.zzk = -1;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.zzi = new zztk(new zzsw(this, null), zzdpVar, audioTrack, zzriVar.zza, this.zzk, zzriVar.zze);
        if (zzsqVar != null) {
            this.zzh = new zzsu(audioTrack, zzsqVar, objArr2 == true ? 1 : 0);
        }
        this.zzl = zzg() ? new zztc(this, objArr == true ? 1 : 0) : null;
    }

    static /* synthetic */ void zzp(AudioTrack audioTrack, Handler handler, final zzeg zzegVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zztd.zzw(zzeg.this);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i = zzc - 1;
                    zzc = i;
                    if (i == 0) {
                        ScheduledExecutorService scheduledExecutorService = zzb;
                        if (scheduledExecutorService == null) {
                            throw null;
                        }
                        scheduledExecutorService.shutdown();
                        zzb = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzso
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zztd.zzw(zzeg.this);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i2 = zzc - 1;
                    zzc = i2;
                    if (i2 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = zzb;
                        if (scheduledExecutorService2 == null) {
                            throw null;
                        }
                        scheduledExecutorService2.shutdown();
                        zzb = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final long zzs() {
        if (!this.zzj) {
            return this.zzp;
        }
        long j = this.zzo;
        int i = this.zzk;
        String str = zzfm.zza;
        return ((j + r2) - 1) / i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzw(zzeg zzegVar) {
        if (zzegVar.zzb()) {
            zzegVar.zze(-1, zzsl.zza);
            zzegVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zza() {
        this.zzi.zzb();
        if (!this.zzn || zzg()) {
            this.zzd.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zzb() {
        this.zzi.zzf();
        if (!this.zzn || zzg()) {
            this.zzd.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final boolean zzc(ByteBuffer byteBuffer, int i, long j) throws zzqy {
        zzsq zzsqVar;
        boolean z = this.zzj;
        if (!z && this.zzq == 0) {
            this.zzq = zztw.zzF(this.zze.zza, byteBuffer);
        }
        zzeg zzegVar = this.zzm;
        if (zzegVar.zzb()) {
            zzs();
            int underrunCount = this.zzd.getUnderrunCount();
            int i2 = this.zzr;
            this.zzr = underrunCount;
            if (underrunCount > i2) {
                zzegVar.zze(-1, zzsm.zza);
                zzegVar.zzf();
            }
        }
        int remaining = byteBuffer.remaining();
        int write = this.zzd.write(byteBuffer, byteBuffer.remaining(), 1);
        if (write >= 0) {
            r2 = write == remaining;
            if (z) {
                this.zzo += write;
            } else if (r2) {
                this.zzp += this.zzq * i;
            }
            return r2;
        }
        if (write != -6 && write != -32) {
            r2 = false;
        }
        if (r2 && (zzsqVar = this.zzg) != null) {
            zzti zztiVar = ((zzth) zzsqVar).zza;
            if (zztiVar.zzj() != null) {
                zzql zzqlVar = zzql.zza;
                zztiVar.zzi(zzqlVar);
                zztiVar.zzj().zza(zzqlVar);
            }
        }
        throw new zzqy(write, r2);
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zzd() {
        if (this.zzn) {
            return;
        }
        this.zzn = true;
        this.zzi.zze(zzs());
        this.zzd.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zze() {
        if (this.zzi.zzc()) {
            this.zzd.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && zzg()) {
            zztc zztcVar = this.zzl;
            zztcVar.getClass();
            zztcVar.zza();
        }
        zzsu zzsuVar = this.zzh;
        if (zzsuVar != null) {
            zzsuVar.zzd();
            this.zzh = null;
        }
        final AudioTrack audioTrack = this.zzd;
        final zzeg zzegVar = this.zzm;
        final Handler zzd = zzfm.zzd(null);
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = zzfm.zzh("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zztd.zzp(audioTrack, zzd, zzegVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zzf(float f) {
        this.zzd.setVolume(f);
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final boolean zzg() {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = this.zzd.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zzh() {
        return this.zzd.getAudioSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zzi() {
        return this.zzd.getSampleRate();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final long zzj() {
        return this.zzd.getBufferSizeInFrames();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final long zzk() {
        return this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final boolean zzl() {
        return this.zzi.zzd(zzs());
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zzm(zzqx zzqxVar) {
        this.zzm.zzc(zzqxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zzn(zzqj zzqjVar) {
        LogSessionId logSessionId;
        boolean equals;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId zza2 = zzqjVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza2.equals(logSessionId);
        if (equals) {
            return;
        }
        this.zzd.setLogSessionId(zza2);
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zzo(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzd.setPreferredDevice(audioDeviceInfo);
    }

    final /* synthetic */ AudioTrack zzt() {
        return this.zzd;
    }

    final /* synthetic */ zzeg zzu() {
        return this.zzm;
    }
}
