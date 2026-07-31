package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class eb2 extends k43 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    @Override // yads.k43
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // yads.k43
    public final boolean a(xb2 xb2Var, long j, i43 i43Var) {
        if (a(xb2Var, o)) {
            byte[] copyOf = Arrays.copyOf(xb2Var.a, xb2Var.c);
            int i = copyOf[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            ArrayList a = fb2.a(copyOf);
            if (i43Var.a != null) {
                return true;
            }
            iw0 iw0Var = new iw0();
            iw0Var.k = "audio/opus";
            iw0Var.x = i;
            iw0Var.y = 48000;
            iw0Var.m = a;
            i43Var.a = new jw0(iw0Var);
            return true;
        }
        if (a(xb2Var, p)) {
            if (i43Var.a != null) {
                if (this.n) {
                    return true;
                }
                this.n = true;
                xb2Var.e(xb2Var.b + 8);
                ht1 a2 = dn3.a(l41.b(dn3.a(xb2Var, false, false).a));
                if (a2 == null) {
                    return true;
                }
                jw0 jw0Var = i43Var.a;
                jw0Var.getClass();
                iw0 iw0Var2 = new iw0(jw0Var);
                ht1 ht1Var = i43Var.a.k;
                if (ht1Var != null) {
                    gt1[] gt1VarArr = ht1Var.b;
                    if (gt1VarArr.length != 0) {
                        a2 = new ht1((gt1[]) sb3.a((Object[]) a2.b, (Object[]) gt1VarArr));
                    }
                }
                iw0Var2.i = a2;
                i43Var.a = new jw0(iw0Var2);
                return true;
            }
            throw new IllegalStateException();
        }
        if (i43Var.a != null) {
            return false;
        }
        throw new IllegalStateException();
    }

    public static boolean a(xb2 xb2Var, byte[] bArr) {
        int i = xb2Var.c;
        int i2 = xb2Var.b;
        if (i - i2 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        xb2Var.a(bArr2, 0, bArr.length);
        xb2Var.e(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // yads.k43
    public final long a(xb2 xb2Var) {
        int i;
        byte[] bArr = xb2Var.a;
        byte b = bArr[0];
        int i2 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return (this.i * (i * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r0))) / 1000000;
    }
}
