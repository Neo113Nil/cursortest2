package yads;

import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public class fb0 extends iq {
    public final q20 c = new q20();
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    public final int h;

    static {
        go0.a("goog.exo.decoder");
    }

    public fb0(int i) {
        this.h = i;
    }

    public void b() {
        this.b = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final void c(int i) {
        ByteBuffer allocateDirect;
        ByteBuffer allocateDirect2;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            int i2 = this.h;
            if (i2 == 1) {
                allocateDirect2 = ByteBuffer.allocate(i);
            } else {
                if (i2 != 2) {
                    throw new eb0(byteBuffer != null ? byteBuffer.capacity() : 0, i);
                }
                allocateDirect2 = ByteBuffer.allocateDirect(i);
            }
            this.d = allocateDirect2;
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i + position;
        if (capacity >= i3) {
            this.d = byteBuffer;
            return;
        }
        int i4 = this.h;
        if (i4 == 1) {
            allocateDirect = ByteBuffer.allocate(i3);
        } else {
            if (i4 != 2) {
                ByteBuffer byteBuffer2 = this.d;
                throw new eb0(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i3);
            }
            allocateDirect = ByteBuffer.allocateDirect(i3);
        }
        allocateDirect.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            allocateDirect.put(byteBuffer);
        }
        this.d = allocateDirect;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
