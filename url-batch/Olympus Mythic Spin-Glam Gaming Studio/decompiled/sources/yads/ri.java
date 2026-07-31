package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class ri implements xj1 {
    public final MediaCodec a;
    public final vi b;
    public final ui c;
    public boolean d;
    public int e = 0;

    public ri(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.a = mediaCodec;
        this.b = new vi(handlerThread);
        this.c = new ui(mediaCodec, handlerThread2);
    }

    public final void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.b.a(this.a);
        t73.a("configureCodec");
        this.a.configure(mediaFormat, surface, mediaCrypto, 0);
        t73.a();
        ui uiVar = this.c;
        if (!uiVar.f) {
            uiVar.b.start();
            uiVar.c = new si(uiVar, uiVar.b.getLooper());
            uiVar.f = true;
        }
        t73.a("startCodec");
        this.a.start();
        t73.a();
        this.e = 1;
    }

    @Override // yads.xj1
    public final int b() {
        int i;
        vi viVar = this.b;
        synchronized (viVar.a) {
            try {
                i = -1;
                if (viVar.k <= 0 && !viVar.l) {
                    IllegalStateException illegalStateException = viVar.m;
                    if (illegalStateException != null) {
                        viVar.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = viVar.j;
                    if (codecException != null) {
                        viVar.j = null;
                        throw codecException;
                    }
                    ha1 ha1Var = viVar.d;
                    int i2 = ha1Var.c;
                    if (i2 != 0) {
                        if (i2 == 0) {
                            throw new NoSuchElementException();
                        }
                        int[] iArr = ha1Var.d;
                        int i3 = ha1Var.a;
                        i = iArr[i3];
                        ha1Var.a = (i3 + 1) & ha1Var.e;
                        ha1Var.c = i2 - 1;
                    }
                }
            } finally {
            }
        }
        return i;
    }

    @Override // yads.xj1
    public final ByteBuffer c(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // yads.xj1
    public final void flush() {
        this.c.a();
        this.a.flush();
        this.b.a();
        this.a.start();
    }

    @Override // yads.xj1
    public final void release() {
        try {
            if (this.e == 1) {
                ui uiVar = this.c;
                if (uiVar.f) {
                    uiVar.a();
                    uiVar.b.quit();
                }
                uiVar.f = false;
                vi viVar = this.b;
                synchronized (viVar.a) {
                    try {
                        viVar.l = true;
                        viVar.b.quit();
                        if (!viVar.g.isEmpty()) {
                            viVar.i = (MediaFormat) viVar.g.getLast();
                        }
                        ha1 ha1Var = viVar.d;
                        ha1Var.a = 0;
                        ha1Var.b = -1;
                        ha1Var.c = 0;
                        ha1 ha1Var2 = viVar.e;
                        ha1Var2.a = 0;
                        ha1Var2.b = -1;
                        ha1Var2.c = 0;
                        viVar.f.clear();
                        viVar.g.clear();
                        viVar.j = null;
                    } finally {
                    }
                }
            }
            this.e = 2;
            if (this.d) {
                return;
            }
            this.a.release();
            this.d = true;
        } catch (Throwable th) {
            if (!this.d) {
                this.a.release();
                this.d = true;
            }
            throw th;
        }
    }

    @Override // yads.xj1
    public final void a(int i, int i2, long j, int i3) {
        ui uiVar = this.c;
        RuntimeException runtimeException = (RuntimeException) uiVar.d.getAndSet(null);
        if (runtimeException == null) {
            ti b = ui.b();
            b.a = i;
            b.b = i2;
            b.d = j;
            b.e = i3;
            si siVar = uiVar.c;
            int i4 = sb3.a;
            siVar.obtainMessage(0, b).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override // yads.xj1
    public final ByteBuffer b(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // yads.xj1
    public final void a(int i, q20 q20Var, long j) {
        this.c.a(i, q20Var, j);
    }

    @Override // yads.xj1
    public final void a(boolean z, int i) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // yads.xj1
    public final void a(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // yads.xj1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.b.a(bufferInfo);
    }

    @Override // yads.xj1
    public final MediaFormat a() {
        MediaFormat mediaFormat;
        vi viVar = this.b;
        synchronized (viVar.a) {
            try {
                mediaFormat = viVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // yads.xj1
    public final void a(final uk1 uk1Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: yads.ri$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                ri.this.a(uk1Var, mediaCodec, j, j2);
            }
        }, handler);
    }

    public final void a(wj1 wj1Var, MediaCodec mediaCodec, long j, long j2) {
        uk1 uk1Var = (uk1) wj1Var;
        uk1Var.getClass();
        if (sb3.a < 30) {
            uk1Var.b.sendMessageAtFrontOfQueue(Message.obtain(uk1Var.b, 0, (int) (j >> 32), (int) j));
            return;
        }
        vk1 vk1Var = uk1Var.c;
        if (uk1Var != vk1Var.n1) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            vk1Var.z0 = true;
            return;
        }
        try {
            vk1Var.b(j);
            vk1Var.A();
            vk1Var.B0.e++;
            vk1Var.V0 = true;
            if (!vk1Var.T0) {
                vk1Var.T0 = true;
                vk1Var.I0.a(vk1Var.P0);
                vk1Var.R0 = true;
            }
            vk1Var.a(j);
        } catch (nn0 e) {
            uk1Var.c.A0 = e;
        }
    }

    @Override // yads.xj1
    public final void a(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // yads.xj1
    public final void a(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // yads.xj1
    public final void a(int i) {
        this.a.setVideoScalingMode(i);
    }
}
