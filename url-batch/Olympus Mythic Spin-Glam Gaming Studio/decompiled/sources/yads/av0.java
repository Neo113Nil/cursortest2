package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class av0 extends dn {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // yads.zj
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer a;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            a = a((i2 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == i) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                a.putInt(floatToIntBits);
                position += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            a = a(i2);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(position + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                a.putInt(floatToIntBits2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        a.flip();
    }

    @Override // yads.dn
    public final xj b(xj xjVar) {
        int i2 = xjVar.c;
        if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 4 ? new xj(xjVar.a, xjVar.b, 4) : xj.e;
        }
        throw new yj(xjVar);
    }
}
