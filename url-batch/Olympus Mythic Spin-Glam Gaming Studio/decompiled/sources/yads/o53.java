package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes13.dex */
public final class o53 implements xj1 {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public o53(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (sb3.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // yads.xj1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && sb3.a < 21) {
                this.c = this.a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // yads.xj1
    public final int b() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // yads.xj1
    public final ByteBuffer c(int i) {
        return sb3.a >= 21 ? this.a.getOutputBuffer(i) : this.c[i];
    }

    @Override // yads.xj1
    public final void flush() {
        this.a.flush();
    }

    @Override // yads.xj1
    public final void release() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // yads.xj1
    public final ByteBuffer b(int i) {
        return sb3.a >= 21 ? this.a.getInputBuffer(i) : this.b[i];
    }

    @Override // yads.xj1
    public final MediaFormat a() {
        return this.a.getOutputFormat();
    }

    @Override // yads.xj1
    public final void a(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // yads.xj1
    public final void a(int i, q20 q20Var, long j) {
        this.a.queueSecureInputBuffer(i, 0, q20Var.i, j, 0);
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
    public final void a(final uk1 uk1Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: yads.o53$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                o53.this.a(uk1Var, mediaCodec, j, j2);
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
