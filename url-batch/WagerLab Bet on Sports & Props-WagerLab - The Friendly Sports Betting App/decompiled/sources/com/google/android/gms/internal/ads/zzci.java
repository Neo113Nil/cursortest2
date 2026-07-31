package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzci implements zzcf {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcc zze;
    private zzcc zzf;
    private zzcc zzg;
    private zzcc zzh;
    private boolean zzi;
    private zzch zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzci() {
        zzcc zzccVar = zzcc.zza;
        this.zze = zzccVar;
        this.zzf = zzccVar;
        this.zzg = zzccVar;
        this.zzh = zzccVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final long zza(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            return (long) (j / this.zzc);
        }
        long j3 = this.zzn;
        this.zzj.getClass();
        long zza = j3 - r4.zza();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzeo.zzt(j, j2, zza, RoundingMode.DOWN) : zzeo.zzt(j, j2 * i2, zza * i, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final zzcc zzb(zzcc zzccVar) throws zzce {
        if (zzccVar.zzd != 2) {
            throw new zzce("Unhandled input format:", zzccVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzccVar.zzb;
        }
        this.zze = zzccVar;
        zzcc zzccVar2 = new zzcc(i, zzccVar.zzc, 2);
        this.zzf = zzccVar2;
        this.zzi = true;
        return zzccVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final boolean zzc() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzd(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzch zzchVar = this.zzj;
            zzchVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzchVar.zzb(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zze() {
        zzch zzchVar = this.zzj;
        if (zzchVar != null) {
            zzchVar.zzd();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final ByteBuffer zzf() {
        int zzf;
        zzch zzchVar = this.zzj;
        if (zzchVar != null && (zzf = zzchVar.zzf()) > 0) {
            if (this.zzk.capacity() < zzf) {
                ByteBuffer order = ByteBuffer.allocateDirect(zzf).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzchVar.zzc(this.zzl);
            this.zzo += zzf;
            this.zzk.limit(zzf);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final boolean zzg() {
        if (!this.zzp) {
            return false;
        }
        zzch zzchVar = this.zzj;
        return zzchVar == null || zzchVar.zzf() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzi(zzcd zzcdVar) {
        if (zzc()) {
            this.zzg = this.zze;
            this.zzh = this.zzf;
            if (this.zzi) {
                zzcc zzccVar = this.zzg;
                this.zzj = new zzch(zzccVar.zzb, zzccVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzch zzchVar = this.zzj;
                if (zzchVar != null) {
                    zzchVar.zze();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzj() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcc zzccVar = zzcc.zza;
        this.zze = zzccVar;
        this.zzf = zzccVar;
        this.zzg = zzccVar;
        this.zzh = zzccVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    public final void zzk(float f) {
        zzghc.zza(f > 0.0f);
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }

    public final void zzl(float f) {
        zzghc.zza(f > 0.0f);
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final long zzm(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            return (long) (this.zzc * j);
        }
        long j3 = this.zzn;
        this.zzj.getClass();
        long zza = j3 - r2.zza();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzeo.zzt(j, zza, j2, RoundingMode.DOWN) : zzeo.zzt(j, zza * i, j2 * i2, RoundingMode.DOWN);
    }
}
