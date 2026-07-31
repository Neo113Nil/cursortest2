package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class vi extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    public final Object a = new Object();
    public final ha1 d = new ha1();
    public final ha1 e = new ha1();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public vi(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a(MediaCodec mediaCodec) {
        if (this.c != null) {
            throw new IllegalStateException();
        }
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    public final void b() {
        synchronized (this.a) {
            try {
                if (this.l) {
                    return;
                }
                long j = this.k - 1;
                this.k = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    a(new IllegalStateException());
                    return;
                }
                if (!this.g.isEmpty()) {
                    this.i = (MediaFormat) this.g.getLast();
                }
                ha1 ha1Var = this.d;
                ha1Var.a = 0;
                ha1Var.b = -1;
                ha1Var.c = 0;
                ha1 ha1Var2 = this.e;
                ha1Var2.a = 0;
                ha1Var2.b = -1;
                ha1Var2.c = 0;
                this.f.clear();
                this.g.clear();
                this.j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                if (this.k <= 0 && !this.l) {
                    IllegalStateException illegalStateException = this.m;
                    if (illegalStateException == null) {
                        MediaCodec.CodecException codecException = this.j;
                        if (codecException == null) {
                            ha1 ha1Var = this.e;
                            int i = ha1Var.c;
                            if (i == 0) {
                                return -1;
                            }
                            if (i != 0) {
                                int[] iArr = ha1Var.d;
                                int i2 = ha1Var.a;
                                int i3 = iArr[i2];
                                ha1Var.a = (i2 + 1) & ha1Var.e;
                                ha1Var.c = i - 1;
                                if (i3 >= 0) {
                                    if (this.h != null) {
                                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f.remove();
                                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else if (i3 == -2) {
                                    this.h = (MediaFormat) this.g.remove();
                                }
                                return i3;
                            }
                            throw new NoSuchElementException();
                        }
                        this.j = null;
                        throw codecException;
                    }
                    this.m = null;
                    throw illegalStateException;
                }
                return -1;
            } finally {
            }
        }
    }

    public final void a() {
        synchronized (this.a) {
            this.k++;
            Handler handler = this.c;
            int i = sb3.a;
            handler.post(new Runnable() { // from class: yads.vi$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    vi.this.b();
                }
            });
        }
    }

    public final void a(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.m = illegalStateException;
        }
    }
}
