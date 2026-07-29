package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzpv {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzcz zzg;
    private boolean zzh;

    public zzpv(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzcz zzczVar = new zzcz(zzcx.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzczVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void zza(zzpv zzpvVar, Message message) {
        zzpu zzpuVar;
        int i = message.what;
        zzpu zzpuVar2 = null;
        if (i == 0) {
            zzpuVar = (zzpu) message.obj;
            int i2 = zzpuVar.zza;
            int i3 = zzpuVar.zzb;
            try {
                zzpvVar.zzc.queueInputBuffer(i2, 0, zzpuVar.zzc, zzpuVar.zze, zzpuVar.zzf);
            } catch (RuntimeException e) {
                zzps.zza(zzpvVar.zzf, null, e);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    zzps.zza(zzpvVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    zzpvVar.zzg.zze();
                }
                if (zzpuVar2 == null) {
                    ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zzpuVar2);
                    }
                    return;
                }
                return;
            }
            zzpuVar = (zzpu) message.obj;
            int i4 = zzpuVar.zza;
            int i5 = zzpuVar.zzb;
            MediaCodec.CryptoInfo cryptoInfo = zzpuVar.zzd;
            long j = zzpuVar.zze;
            int i6 = zzpuVar.zzf;
            try {
                synchronized (zzb) {
                    zzpvVar.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e2) {
                zzps.zza(zzpvVar.zzf, null, e2);
            }
        }
        zzpuVar2 = zzpuVar;
        if (zzpuVar2 == null) {
        }
    }

    private static zzpu zzg() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzpu();
            }
            return (zzpu) arrayDeque.removeFirst();
        }
    }

    private final void zzh() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void zzc(int i, int i2, int i3, long j, int i4) {
        zzh();
        zzpu zzg = zzg();
        zzg.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzeg.zza;
        handler.obtainMessage(0, zzg).sendToTarget();
    }

    public final void zzd(int i, int i2, zzfz zzfzVar, long j, int i3) {
        zzh();
        zzpu zzg = zzg();
        zzg.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzg.zzd;
        cryptoInfo.numSubSamples = zzfzVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzfzVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzfzVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzi = zzi(zzfzVar.zzb, cryptoInfo.key);
        Objects.requireNonNull(zzi);
        cryptoInfo.key = zzi;
        byte[] zzi2 = zzi(zzfzVar.zza, cryptoInfo.iv);
        Objects.requireNonNull(zzi2);
        cryptoInfo.iv = zzi2;
        cryptoInfo.mode = zzfzVar.zzc;
        if (zzeg.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzfzVar.zzg, zzfzVar.zzh));
        }
        this.zze.obtainMessage(1, zzg).sendToTarget();
    }

    public final void zze() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzf() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzpt(this, this.zzd.getLooper());
        this.zzh = true;
    }

    private static byte[] zzi(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (length >= length2) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
                return bArr2;
            }
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length >= length2) {
                System.arraycopy(iArr, 0, iArr2, 0, length2);
                return iArr2;
            }
        }
        return Arrays.copyOf(iArr, iArr.length);
    }
}
