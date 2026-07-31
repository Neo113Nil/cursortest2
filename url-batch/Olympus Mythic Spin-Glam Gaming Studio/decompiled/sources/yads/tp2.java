package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class tp2 extends dn {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[ADDED_TO_REGION, LOOP:4: B:33:0x00b0->B:34:0x00b2, LOOP_START, PHI: r0
      0x00b0: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0035, B:34:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // yads.zj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 268435456) {
                    if (i3 == 536870912) {
                        i2 /= 3;
                    } else if (i3 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer a = a(i2);
                i = this.b.c;
                if (i == 3) {
                    while (position < limit) {
                        a.put((byte) 0);
                        a.put((byte) ((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                        position++;
                    }
                } else if (i == 4) {
                    while (position < limit) {
                        float f = byteBuffer.getFloat(position);
                        int i4 = sb3.a;
                        short max = (short) (Math.max(-1.0f, Math.min(f, 1.0f)) * 32767.0f);
                        a.put((byte) (max & 255));
                        a.put((byte) ((max >> 8) & 255));
                        position += 4;
                    }
                } else if (i == 268435456) {
                    while (position < limit) {
                        a.put(byteBuffer.get(position + 1));
                        a.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i == 536870912) {
                    while (position < limit) {
                        a.put(byteBuffer.get(position + 1));
                        a.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i != 805306368) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        a.put(byteBuffer.get(position + 2));
                        a.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                a.flip();
            }
            i2 /= 2;
            ByteBuffer a2 = a(i2);
            i = this.b.c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            a2.flip();
        }
        i2 *= 2;
        ByteBuffer a22 = a(i2);
        i = this.b.c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        a22.flip();
    }

    @Override // yads.dn
    public final xj b(xj xjVar) {
        int i = xjVar.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new xj(xjVar.a, xjVar.b, 2) : xj.e;
        }
        throw new yj(xjVar);
    }
}
