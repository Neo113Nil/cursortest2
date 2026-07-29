package o;

/* loaded from: classes.dex */
public final class VL extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ WL h;
    public final /* synthetic */ int i;
    public final /* synthetic */ GD j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VL(WL wl, int i, GD gd) {
        super(1);
        this.h = wl;
        this.i = i;
        this.j = gd;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        InterfaceC1773qd interfaceC1773qd;
        InterfaceC1773qd interfaceC1773qd2;
        int i;
        InterfaceC1773qd interfaceC1773qd3 = (InterfaceC1773qd) obj;
        WL wl = this.h;
        int i2 = wl.e;
        int i3 = this.i;
        if (i2 == i3) {
            GD gd = wl.f;
            GD gd2 = this.j;
            if (AbstractC0048Bt.h(gd2, gd) && (interfaceC1773qd3 instanceof C2036ud)) {
                long[] jArr = gd2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj2 = gd2.b[i8];
                                    boolean z = gd2.c[i8] != i3;
                                    if (z) {
                                        i = i5;
                                        C2036ud c2036ud = (C2036ud) interfaceC1773qd3;
                                        c2036ud.n.e(obj2, wl);
                                        if (obj2 instanceof C1645oh) {
                                            C1645oh c1645oh = (C1645oh) obj2;
                                            interfaceC1773qd2 = interfaceC1773qd3;
                                            if (!((MD) c2036ud.n.i).b(c1645oh)) {
                                                c2036ud.q.f(c1645oh);
                                            }
                                            MD md = wl.g;
                                            if (md != null) {
                                                md.g(obj2);
                                            }
                                        } else {
                                            interfaceC1773qd2 = interfaceC1773qd3;
                                        }
                                    } else {
                                        interfaceC1773qd2 = interfaceC1773qd3;
                                        i = i5;
                                    }
                                    if (z) {
                                        gd2.e(i8);
                                    }
                                } else {
                                    interfaceC1773qd2 = interfaceC1773qd3;
                                    i = i5;
                                }
                                j >>= i;
                                i7++;
                                i5 = i;
                                interfaceC1773qd3 = interfaceC1773qd2;
                            }
                            interfaceC1773qd = interfaceC1773qd3;
                            if (i6 != i5) {
                                break;
                            }
                        } else {
                            interfaceC1773qd = interfaceC1773qd3;
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        interfaceC1773qd3 = interfaceC1773qd;
                    }
                }
            }
        }
        return C0782bY.a;
    }
}
