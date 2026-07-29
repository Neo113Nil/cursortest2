package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.Jh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244Jh {
    public final AbstractC2325z00 a;
    public final /* synthetic */ int b;

    public C0244Jh(AbstractC2325z00 abstractC2325z00, int i) {
        this.b = i;
        AbstractC0048Bt.n(abstractC2325z00, "delegate");
        this.a = abstractC2325z00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c0, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0291 A[LOOP:1: B:131:0x0291->B:135:0x02c2, LOOP_START, PHI: r8
      0x0291: PHI (r8v2 o.gg) = (r8v0 o.gg), (r8v3 o.gg) binds: [B:130:0x028e, B:135:0x02c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.gg, o.lg] */
    /* JADX WARN: Type inference failed for: r7v6, types: [o.gg] */
    /* JADX WARN: Type inference failed for: r7v7, types: [o.gg] */
    /* JADX WARN: Type inference failed for: r7v9, types: [o.gg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(UL ul, InterfaceC1446lg interfaceC1446lg, InterfaceC1118gg interfaceC1118gg) {
        InterfaceC1118gg i;
        InterfaceC1245ib interfaceC1245ib;
        switch (this.b) {
            case 0:
                if (interfaceC1118gg == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (AbstractC0114Eh.s(interfaceC1446lg) && AbstractC0114Eh.f(interfaceC1118gg) != C1623oL.m) {
                    return AbstractC0270Kh.d(interfaceC1446lg, interfaceC1118gg);
                }
                if (interfaceC1446lg instanceof InterfaceC0629Yd) {
                    ((InterfaceC0629Yd) interfaceC1446lg).n();
                }
                while (interfaceC1446lg != 0) {
                    interfaceC1446lg = interfaceC1446lg.n();
                    if ((!(interfaceC1446lg instanceof InterfaceC1245ib) || AbstractC0114Eh.l(interfaceC1446lg)) && !(interfaceC1446lg instanceof InterfaceC0961eH)) {
                    }
                    if (interfaceC1446lg != 0) {
                        while (true) {
                            if (interfaceC1118gg != null) {
                                if (interfaceC1446lg == interfaceC1118gg) {
                                    break;
                                } else if (!(interfaceC1118gg instanceof InterfaceC0961eH)) {
                                    interfaceC1118gg = interfaceC1118gg.n();
                                } else if (!(interfaceC1446lg instanceof InterfaceC0961eH) || !((AbstractC1027fH) interfaceC1446lg).l.equals(((AbstractC1027fH) ((InterfaceC0961eH) interfaceC1118gg)).l) || !AbstractC0114Eh.d(interfaceC1118gg).equals(AbstractC0114Eh.d(interfaceC1446lg))) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (interfaceC1446lg != 0) {
                }
                return false;
            case 1:
                if (interfaceC1118gg == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (AbstractC0270Kh.a.a(ul, interfaceC1446lg, interfaceC1118gg)) {
                    if (ul == AbstractC0270Kh.l) {
                        return true;
                    }
                    if (ul != AbstractC0270Kh.k && (i = AbstractC0114Eh.i(interfaceC1446lg, InterfaceC1245ib.class, true)) != null && (ul instanceof C2051us)) {
                        return ((C2051us) ul).h.a().equals(i.a());
                    }
                }
                return false;
            case 2:
                if (interfaceC1118gg == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                InterfaceC1245ib interfaceC1245ib2 = (InterfaceC1245ib) AbstractC0114Eh.i(interfaceC1446lg, InterfaceC1245ib.class, true);
                InterfaceC1245ib interfaceC1245ib3 = (InterfaceC1245ib) AbstractC0114Eh.i(interfaceC1118gg, InterfaceC1245ib.class, false);
                if (interfaceC1245ib3 != null) {
                    if (interfaceC1245ib2 != null && AbstractC0114Eh.l(interfaceC1245ib2) && (interfaceC1245ib = (InterfaceC1245ib) AbstractC0114Eh.i(interfaceC1245ib2, InterfaceC1245ib.class, true)) != null && AbstractC0114Eh.r(interfaceC1245ib3.i(), interfaceC1245ib.a())) {
                        return true;
                    }
                    InterfaceC2204x9 t = interfaceC1446lg instanceof InterfaceC2204x9 ? AbstractC0114Eh.t((InterfaceC2204x9) interfaceC1446lg) : interfaceC1446lg;
                    InterfaceC1245ib interfaceC1245ib4 = (InterfaceC1245ib) AbstractC0114Eh.i(t, InterfaceC1245ib.class, true);
                    if (interfaceC1245ib4 != null) {
                        if (AbstractC0114Eh.r(interfaceC1245ib3.i(), interfaceC1245ib4.a()) && ul != AbstractC0270Kh.m) {
                            if (!(t instanceof InterfaceC2204x9) || (t instanceof InterfaceC0629Yd) || ul == AbstractC0270Kh.l) {
                                return true;
                            }
                            if (ul != AbstractC0270Kh.k && ul != null) {
                                AbstractC1004ey c = ul.c();
                                if (AbstractC0114Eh.r(c, interfaceC1245ib3)) {
                                    return true;
                                }
                                c.E0();
                            }
                        }
                        return a(ul, interfaceC1446lg, interfaceC1245ib3.n());
                    }
                }
                return false;
            case 3:
                if (interfaceC1118gg == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!AbstractC0114Eh.d(interfaceC1118gg).Z(AbstractC0114Eh.d(interfaceC1446lg))) {
                    return false;
                }
                AbstractC0270Kh.n.getClass();
                return true;
            case 4:
                if (interfaceC1118gg != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                if (interfaceC1118gg == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                if (interfaceC1118gg == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                if (interfaceC1118gg != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (interfaceC1118gg != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (interfaceC1118gg != null) {
                    return AbstractC0671Zt.c(interfaceC1446lg, interfaceC1118gg);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 10:
                if (interfaceC1118gg != null) {
                    return AbstractC0671Zt.b(ul, interfaceC1446lg, interfaceC1118gg);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (interfaceC1118gg != null) {
                    return AbstractC0671Zt.b(ul, interfaceC1446lg, interfaceC1118gg);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final String toString() {
        return this.a.b();
    }
}
