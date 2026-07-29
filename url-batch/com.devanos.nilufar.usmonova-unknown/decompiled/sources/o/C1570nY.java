package o;

import sun.misc.Unsafe;

/* renamed from: o.nY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1570nY extends AbstractC1702pY {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1570nY(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // o.AbstractC1702pY
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (AbstractC1768qY.g) {
                    if (AbstractC1768qY.h(j, obj) == 0) {
                    }
                } else if (AbstractC1768qY.i(j, obj) == 0) {
                }
                break;
            default:
                if (AbstractC1768qY.g) {
                    if (AbstractC1768qY.h(j, obj) == 0) {
                    }
                } else if (AbstractC1768qY.i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // o.AbstractC1702pY
    public final byte d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!AbstractC1768qY.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!AbstractC1768qY.g) {
                    break;
                } else {
                    break;
                }
        }
        return AbstractC1768qY.i(j, obj);
    }

    @Override // o.AbstractC1702pY
    public final double e(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // o.AbstractC1702pY
    public final float f(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // o.AbstractC1702pY
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!AbstractC1768qY.g) {
                    AbstractC1768qY.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC1768qY.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!AbstractC1768qY.g) {
                    AbstractC1768qY.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC1768qY.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // o.AbstractC1702pY
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!AbstractC1768qY.g) {
                    AbstractC1768qY.m(obj, j, b);
                    break;
                } else {
                    AbstractC1768qY.l(obj, j, b);
                    break;
                }
            default:
                if (!AbstractC1768qY.g) {
                    AbstractC1768qY.m(obj, j, b);
                    break;
                } else {
                    AbstractC1768qY.l(obj, j, b);
                    break;
                }
        }
    }

    @Override // o.AbstractC1702pY
    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // o.AbstractC1702pY
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                o(obj, j, Float.floatToIntBits(f));
                break;
            default:
                o(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // o.AbstractC1702pY
    public final boolean s() {
        switch (this.b) {
        }
        return false;
    }
}
