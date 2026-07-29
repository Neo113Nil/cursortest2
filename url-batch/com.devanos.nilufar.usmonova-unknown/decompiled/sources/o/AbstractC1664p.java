package o;

/* renamed from: o.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1664p extends AbstractC1205i0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1664p(OT ot) {
        super(ot);
        if (ot != null) {
        } else {
            k(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void k(int i) {
        String format;
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i != 1) {
            if (i == 2) {
                objArr[0] = "classifier";
            } else if (i != 3 && i != 4) {
                objArr[0] = "storageManager";
            }
            if (i != 1) {
                objArr[1] = "getBuiltIns";
            } else if (i == 3 || i == 4) {
                objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "isSameClassifier";
                } else if (i != 3 && i != 4) {
                    objArr[2] = "<init>";
                }
            }
            format = String.format(str, objArr);
            if (i == 1 && i != 3 && i != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i != 1) {
        }
        if (i != 1) {
        }
        format = String.format(str, objArr);
        if (i == 1) {
        }
        throw new IllegalStateException(format);
    }

    @Override // o.AbstractC1205i0
    public final AbstractC1004ey f() {
        InterfaceC1245ib c = c();
        if (c == null) {
            AbstractC0545Ux.a(107);
            throw null;
        }
        C0827cE c0827cE = AbstractC0545Ux.e;
        if (AbstractC0545Ux.b(c, AbstractC1433lT.a) || AbstractC0545Ux.b(c, AbstractC1433lT.b)) {
            return null;
        }
        return l().e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (o.AbstractC0048Bt.h(((o.AbstractC1027fH) ((o.InterfaceC0961eH) r0)).l, ((o.AbstractC1027fH) ((o.InterfaceC0961eH) r6)).l) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0072 A[RETURN] */
    @Override // o.AbstractC1205i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(InterfaceC2364zb interfaceC2364zb) {
        boolean z;
        if (interfaceC2364zb instanceof InterfaceC1245ib) {
            InterfaceC1245ib c = c();
            AbstractC0048Bt.n(c, "first");
            if (AbstractC0048Bt.h(c.getName(), interfaceC2364zb.getName())) {
                InterfaceC1118gg n = c.n();
                InterfaceC1118gg n2 = interfaceC2364zb.n();
                while (true) {
                    if (n != null && n2 != null) {
                        if (!(n instanceof InterfaceC0761bD)) {
                            if (!(n2 instanceof InterfaceC0761bD)) {
                                if (!(n instanceof InterfaceC0961eH)) {
                                    if ((n2 instanceof InterfaceC0961eH) || !AbstractC0048Bt.h(n.getName(), n2.getName())) {
                                        break;
                                    }
                                    n = n.n();
                                    n2 = n2.n();
                                } else if (n2 instanceof InterfaceC0961eH) {
                                }
                            } else {
                                break;
                            }
                        } else {
                            z = n2 instanceof InterfaceC0761bD;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = true;
                if (!z) {
                    return true;
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    @Override // o.SW
    public final AbstractC0545Ux l() {
        AbstractC0545Ux e = AbstractC0192Hh.e(c());
        if (e != null) {
            return e;
        }
        k(1);
        throw null;
    }

    @Override // o.SW
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC1245ib c();
}
