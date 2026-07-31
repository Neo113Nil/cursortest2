package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class uu0 extends k43 {
    public xu0 n;
    public tu0 o;

    @Override // yads.k43
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    @Override // yads.k43
    public final long a(xb2 xb2Var) {
        int i;
        int i2;
        int k;
        byte[] bArr = xb2Var.a;
        int i3 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i4 = (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i4 == 6 || i4 == 7) {
            xb2Var.e(xb2Var.b + 4);
            xb2Var.q();
        }
        switch (i4) {
            case 1:
                i3 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i = i4 - 2;
                i2 = 576;
                i3 = i2 << i;
                break;
            case 6:
                k = xb2Var.k();
                i3 = k + 1;
                break;
            case 7:
                k = xb2Var.p();
                i3 = k + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = i4 - 8;
                i2 = 256;
                i3 = i2 << i;
                break;
        }
        xb2Var.e(0);
        return i3;
    }

    @Override // yads.k43
    public final boolean a(xb2 xb2Var, long j, i43 i43Var) {
        byte[] bArr = xb2Var.a;
        xu0 xu0Var = this.n;
        if (xu0Var == null) {
            xu0 xu0Var2 = new xu0(bArr, 17);
            this.n = xu0Var2;
            i43Var.a = xu0Var2.a(Arrays.copyOfRange(bArr, 9, xb2Var.c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            wu0 a = su0.a(xb2Var);
            xu0 xu0Var3 = new xu0(xu0Var.a, xu0Var.b, xu0Var.c, xu0Var.d, xu0Var.e, xu0Var.g, xu0Var.h, xu0Var.j, a, xu0Var.l);
            this.n = xu0Var3;
            this.o = new tu0(xu0Var3, a);
            return true;
        }
        if (b != -1) {
            return true;
        }
        tu0 tu0Var = this.o;
        if (tu0Var != null) {
            tu0Var.c = j;
            i43Var.b = tu0Var;
        }
        i43Var.a.getClass();
        return false;
    }
}
