package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Message;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class ui {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public si c;
    public final AtomicReference d;
    public final ry e;
    public boolean f;

    public ui(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ry ryVar = new ry();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = ryVar;
        this.d = new AtomicReference();
    }

    public static ti b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new ti();
                }
                return (ti) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                si siVar = this.c;
                siVar.getClass();
                siVar.removeCallbacksAndMessages(null);
                ry ryVar = this.e;
                synchronized (ryVar) {
                    ryVar.a = false;
                }
                si siVar2 = this.c;
                siVar2.getClass();
                siVar2.obtainMessage(2).sendToTarget();
                this.e.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void a(int i, q20 q20Var, long j) {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            ti b = b();
            b.a = i;
            b.b = 0;
            b.d = j;
            b.e = 0;
            MediaCodec.CryptoInfo cryptoInfo = b.c;
            cryptoInfo.numSubSamples = q20Var.f;
            int[] iArr = q20Var.d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = q20Var.e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = q20Var.b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = q20Var.a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = q20Var.c;
            if (sb3.a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(q20Var.g, q20Var.h));
            }
            this.c.obtainMessage(1, b).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Message message) {
        ti tiVar;
        int i = message.what;
        ti tiVar2 = null;
        if (i == 0) {
            tiVar = (ti) message.obj;
            try {
                this.a.queueInputBuffer(tiVar.a, 0, tiVar.b, tiVar.d, tiVar.e);
            } catch (RuntimeException e) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.d, null, e);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    this.e.d();
                }
                if (tiVar2 == null) {
                    a(tiVar2);
                    return;
                }
                return;
            }
            tiVar = (ti) message.obj;
            int i2 = tiVar.a;
            MediaCodec.CryptoInfo cryptoInfo = tiVar.c;
            long j = tiVar.d;
            int i3 = tiVar.e;
            try {
                synchronized (h) {
                    this.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                }
            } catch (RuntimeException e2) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.d, null, e2);
            }
        }
        tiVar2 = tiVar;
        if (tiVar2 == null) {
        }
    }

    public static void a(ti tiVar) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(tiVar);
        }
    }
}
