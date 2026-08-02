package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzqc {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdg zzg;
    private boolean zzh;

    public zzqc(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdg zzdgVar = new zzdg(zzde.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdgVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void zza(zzqc zzqcVar, Message message) {
        zzqb zzqbVar;
        int i = message.what;
        zzqb zzqbVar2 = null;
        if (i == 0) {
            zzqbVar = (zzqb) message.obj;
            int i2 = zzqbVar.zza;
            int i3 = zzqbVar.zzb;
            try {
                zzqcVar.zzc.queueInputBuffer(i2, 0, zzqbVar.zzc, zzqbVar.zze, zzqbVar.zzf);
            } catch (RuntimeException e) {
                zzpz.zza(zzqcVar.zzf, null, e);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    zzpz.zza(zzqcVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    zzqcVar.zzg.zze();
                }
                if (zzqbVar2 == null) {
                    ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zzqbVar2);
                    }
                    return;
                }
                return;
            }
            zzqbVar = (zzqb) message.obj;
            int i4 = zzqbVar.zza;
            int i5 = zzqbVar.zzb;
            MediaCodec.CryptoInfo cryptoInfo = zzqbVar.zzd;
            long j = zzqbVar.zze;
            int i6 = zzqbVar.zzf;
            try {
                synchronized (zzb) {
                    zzqcVar.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e2) {
                zzpz.zza(zzqcVar.zzf, null, e2);
            }
        }
        zzqbVar2 = zzqbVar;
        if (zzqbVar2 == null) {
        }
    }

    private static zzqb zzg() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzqb();
            }
            return (zzqb) arrayDeque.removeFirst();
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
        zzqb zzg = zzg();
        zzg.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzen.zza;
        handler.obtainMessage(0, zzg).sendToTarget();
    }

    public final void zzd(int i, int i2, zzgf zzgfVar, long j, int i3) {
        zzh();
        zzqb zzg = zzg();
        zzg.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzg.zzd;
        cryptoInfo.numSubSamples = zzgfVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzgfVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzgfVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzi = zzi(zzgfVar.zzb, cryptoInfo.key);
        Objects.requireNonNull(zzi);
        cryptoInfo.key = zzi;
        byte[] zzi2 = zzi(zzgfVar.zza, cryptoInfo.iv);
        Objects.requireNonNull(zzi2);
        cryptoInfo.iv = zzi2;
        cryptoInfo.mode = zzgfVar.zzc;
        if (zzen.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzgfVar.zzg, zzgfVar.zzh));
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
        this.zze = new zzqa(this, this.zzd.getLooper());
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
