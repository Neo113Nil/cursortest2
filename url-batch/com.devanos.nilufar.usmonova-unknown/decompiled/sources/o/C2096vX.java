package o;

import com.google.firebase.database.core.ValidationPath;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.vX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2096vX {
    public static final C2096vX b = new C2096vX(AbstractC1964tX.a);
    public final AbstractC1964tX a;

    public C2096vX(AbstractC1964tX abstractC1964tX) {
        this.a = abstractC1964tX;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
            if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                switch (i) {
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                i2 = 3;
                                                break;
                                        }
                                    case 29:
                                    case 30:
                                    case 31:
                                    case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                                        i2 = 2;
                                        break;
                                }
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                break;
                        }
                    case 11:
                    case 12:
                    case 13:
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                        break;
                    case 3:
                        objArr[0] = "first";
                        break;
                    case 4:
                        objArr[0] = "second";
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        objArr[0] = "substitutionContext";
                        break;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[0] = "context";
                        break;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    default:
                        objArr[0] = "substitution";
                        break;
                    case 9:
                    case 14:
                        objArr[0] = "type";
                        break;
                    case 10:
                    case 15:
                        objArr[0] = "howThisTypeIsUsed";
                        break;
                    case 16:
                    case 17:
                    case 36:
                        objArr[0] = "typeProjection";
                        break;
                    case 18:
                    case 28:
                        objArr[0] = "originalProjection";
                        break;
                    case 26:
                        objArr[0] = "originalType";
                        break;
                    case 27:
                        objArr[0] = "substituted";
                        break;
                    case 33:
                        objArr[0] = "annotations";
                        break;
                    case 35:
                    case 38:
                        objArr[0] = "typeParameterVariance";
                        break;
                    case 39:
                        objArr[0] = "projectionKind";
                        break;
                }
                if (i != 1) {
                    objArr[1] = "replaceWithNonApproximatingSubstitution";
                } else if (i == 2) {
                    objArr[1] = "replaceWithContravariantApproximatingSubstitution";
                } else if (i == 8) {
                    objArr[1] = "getSubstitution";
                } else if (i != 34) {
                    if (i != 37) {
                        switch (i) {
                            case 11:
                            case 12:
                            case 13:
                                objArr[1] = "safeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                        objArr[1] = "unsafeSubstitute";
                                        break;
                                    default:
                                        switch (i) {
                                            case 29:
                                            case 30:
                                            case 31:
                                            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                                                objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                        break;
                                                }
                                        }
                                }
                        }
                    }
                    objArr[1] = "combine";
                } else {
                    objArr[1] = "filterOutUnsafeVariance";
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "createChainedSubstitutor";
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    default:
                        objArr[2] = "create";
                        break;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[2] = "<init>";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "safeSubstitute";
                        break;
                    case 14:
                    case 15:
                    case 16:
                        objArr[2] = "substitute";
                        break;
                    case 17:
                        objArr[2] = "substituteWithoutApproximation";
                        break;
                    case 18:
                        objArr[2] = "unsafeSubstitute";
                        break;
                    case 26:
                    case 27:
                    case 28:
                        objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                        break;
                    case 33:
                        objArr[2] = "filterOutUnsafeVariance";
                        break;
                    case 35:
                    case 36:
                    case 38:
                    case 39:
                        objArr[2] = "combine";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                    switch (i) {
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (i) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    break;
                                default:
                                    switch (i) {
                                        case 29:
                                        case 30:
                                        case 31:
                                        case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                                            break;
                                        default:
                                            switch (i) {
                                                case 40:
                                                case 41:
                                                case 42:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format);
            }
            i2 = 2;
            Object[] objArr2 = new Object[i2];
            switch (i) {
            }
            if (i != 1) {
            }
            switch (i) {
            }
            String format2 = String.format(str, objArr2);
            if (i != 1) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 1) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i != 1) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr22);
            if (i != 1) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i != 1) {
        }
        switch (i) {
        }
        String format222 = String.format(str, objArr222);
        if (i != 1) {
        }
        throw new IllegalStateException(format222);
    }

    public static int b(int i, int i2) {
        if (i == 0) {
            a(38);
            throw null;
        }
        if (i2 == 0) {
            a(39);
            throw null;
        }
        if (i == 1) {
            if (i2 == 0) {
                a(40);
                throw null;
            }
        } else {
            if (i2 == 1) {
                if (i != 0) {
                    return i;
                }
                a(41);
                throw null;
            }
            if (i != i2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + AbstractC2188wx.o(i) + "' and projection kind '" + AbstractC2188wx.o(i2) + "' cannot be combined");
            }
            if (i2 == 0) {
                a(42);
                throw null;
            }
        }
        return i2;
    }

    public static int c(int i, int i2) {
        if (i == 2 && i2 == 3) {
            return 3;
        }
        return (i == 3 && i2 == 2) ? 2 : 1;
    }

    public static C2096vX d(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey == null) {
            a(6);
            throw null;
        }
        return new C2096vX(UW.b.b(abstractC1004ey.B0(), abstractC1004ey.w0()));
    }

    public static C2096vX e(AbstractC1964tX abstractC1964tX, AbstractC1964tX abstractC1964tX2) {
        if (abstractC1964tX == null) {
            a(3);
            throw null;
        }
        if (abstractC1964tX2 == null) {
            a(4);
            throw null;
        }
        if (abstractC1964tX.e()) {
            abstractC1964tX = abstractC1964tX2;
        } else if (!abstractC1964tX2.e()) {
            abstractC1964tX = new C2371zi(abstractC1964tX, abstractC1964tX2);
        }
        return new C2096vX(abstractC1964tX);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (AbstractC1305jX.x(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final AbstractC1964tX f() {
        AbstractC1964tX abstractC1964tX = this.a;
        if (abstractC1964tX != null) {
            return abstractC1964tX;
        }
        a(8);
        throw null;
    }

    public final AbstractC1004ey g(int i, AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey == null) {
            a(9);
            throw null;
        }
        if (i == 0) {
            a(10);
            throw null;
        }
        if (this.a.e()) {
            return abstractC1004ey;
        }
        try {
            AbstractC1004ey b2 = j(new C1767qX(i, abstractC1004ey), null, 0).b();
            if (b2 != null) {
                return b2;
            }
            a(12);
            throw null;
        } catch (C2030uX e) {
            return C0273Kk.c(EnumC0247Jk.r, e.getMessage());
        }
    }

    public final AbstractC1004ey i(int i, AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey == null) {
            a(14);
            throw null;
        }
        if (i == 0) {
            a(15);
            throw null;
        }
        AbstractC1701pX c1767qX = new C1767qX(i, f().f(i, abstractC1004ey));
        AbstractC1964tX abstractC1964tX = this.a;
        if (!abstractC1964tX.e()) {
            try {
                c1767qX = j(c1767qX, null, 0);
            } catch (C2030uX unused) {
                c1767qX = null;
            }
        }
        if (abstractC1964tX.a() || abstractC1964tX.b()) {
            boolean b2 = abstractC1964tX.b();
            if (c1767qX != null) {
                if (!c1767qX.c()) {
                    AbstractC1004ey b3 = c1767qX.b();
                    AbstractC0048Bt.m(b3, "typeProjection.type");
                    if (AbstractC2228xX.c(b3, I2.r, null)) {
                        int a = c1767qX.a();
                        AbstractC1888sN.t(a, "typeProjection.projectionKind");
                        if (a == 3) {
                            c1767qX = new C1767qX(a, (AbstractC1004ey) AbstractC0048Bt.g(b3).b);
                        } else if (b2) {
                            c1767qX = new C1767qX(a, (AbstractC1004ey) AbstractC0048Bt.g(b3).a);
                        } else {
                            C1374ka c1374ka = new C1374ka();
                            C2096vX c2096vX = new C2096vX(c1374ka);
                            if (!c1374ka.e()) {
                                try {
                                    c1767qX = c2096vX.j(c1767qX, null, 0);
                                } catch (C2030uX unused2) {
                                }
                            }
                        }
                    }
                }
            }
            c1767qX = null;
        }
        if (c1767qX == null) {
            return null;
        }
        return c1767qX.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x028b, code lost:
    
        if (r7 != 2) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1701pX j(AbstractC1701pX abstractC1701pX, InterfaceC1437lX interfaceC1437lX, int i) {
        boolean z;
        C2096vX c2096vX;
        AbstractC1004ey abstractC1004ey = null;
        if (abstractC1701pX == null) {
            a(18);
            throw null;
        }
        AbstractC1964tX abstractC1964tX = this.a;
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + h(abstractC1701pX) + "; substitution: " + h(abstractC1964tX));
        }
        if (!abstractC1701pX.c()) {
            AbstractC1004ey b2 = abstractC1701pX.b();
            if (b2 instanceof InterfaceC2360zX) {
                InterfaceC2360zX interfaceC2360zX = (InterfaceC2360zX) b2;
                AbstractC2097vY q0 = interfaceC2360zX.q0();
                AbstractC1004ey h = interfaceC2360zX.h();
                AbstractC1701pX j = j(new C1767qX(abstractC1701pX.a(), q0), interfaceC1437lX, i + 1);
                return j.c() ? j : new C1767qX(j.a(), AbstractC1494mO.n(j.b().E0(), i(abstractC1701pX.a(), h)));
            }
            AbstractC0048Bt.n(b2, "<this>");
            b2.E0();
            if (!(b2.E0() instanceof C2216xL)) {
                AbstractC1701pX d = abstractC1964tX.d(b2);
                if (d == null) {
                    d = null;
                } else if (b2.getAnnotations().i(AbstractC1433lT.y)) {
                    SW B0 = d.b().B0();
                    if (B0 instanceof C2077vE) {
                        AbstractC1701pX abstractC1701pX2 = ((C2077vE) B0).a;
                        int a = abstractC1701pX2.a();
                        if (c(abstractC1701pX.a(), a) == 3) {
                            d = new C1767qX(abstractC1701pX2.b());
                        } else if (interfaceC1437lX != null && c(interfaceC1437lX.Y(), a) == 3) {
                            d = new C1767qX(abstractC1701pX2.b());
                        }
                    }
                }
                int a2 = abstractC1701pX.a();
                if (d == null && AbstractC0868ct.E(b2)) {
                    W3 E0 = b2.E0();
                    InterfaceC0789bf interfaceC0789bf = E0 instanceof InterfaceC0789bf ? (InterfaceC0789bf) E0 : null;
                    if (!(interfaceC0789bf != null ? interfaceC0789bf.u() : false)) {
                        AbstractC1782qm abstractC1782qm = (AbstractC1782qm) b2.E0();
                        JR jr = abstractC1782qm.j;
                        JR jr2 = abstractC1782qm.i;
                        int i2 = i + 1;
                        AbstractC1701pX j2 = j(new C1767qX(a2, jr2), interfaceC1437lX, i2);
                        AbstractC1701pX j3 = j(new C1767qX(a2, jr), interfaceC1437lX, i2);
                        int a3 = j2.a();
                        if (j2.b() != jr2 || j3.b() != jr) {
                            return new C1767qX(a3, HO.m(DY.a(j2.b()), DY.a(j3.b())));
                        }
                    }
                }
                if (!AbstractC0545Ux.E(b2) && !AbstractC1473m3.P(b2)) {
                    int i3 = 4;
                    if (d != null) {
                        int c = c(a2, d.a());
                        if (!(b2.B0() instanceof InterfaceC1440la)) {
                            int v = AbstractC1888sN.v(c);
                            if (v == 1) {
                                return new C1767qX(3, b2.B0().l().o());
                            }
                            if (v == 2) {
                                throw new C2030uX("Out-projection in in-position");
                            }
                        }
                        W3 E02 = b2.E0();
                        InterfaceC0789bf interfaceC0789bf2 = E02 instanceof InterfaceC0789bf ? (InterfaceC0789bf) E02 : null;
                        if (interfaceC0789bf2 == null || !interfaceC0789bf2.u()) {
                            interfaceC0789bf2 = null;
                        }
                        if (d.c()) {
                            return d;
                        }
                        AbstractC1004ey F = interfaceC0789bf2 != null ? interfaceC0789bf2.F(d.b()) : AbstractC2228xX.h(d.b(), b2.C0());
                        if (!b2.getAnnotations().isEmpty()) {
                            InterfaceC1738q4 c2 = abstractC1964tX.c(b2.getAnnotations());
                            if (c2 == null) {
                                a(33);
                                throw null;
                            }
                            if (c2.i(AbstractC1433lT.y)) {
                                c2 = new C0637Yl(c2, new C2311yo(i3));
                            }
                            F = AbstractC0772bO.v(F, new C1803r4(new InterfaceC1738q4[]{F.getAnnotations(), c2}));
                        }
                        if (c == 1) {
                            a2 = b(a2, d.a());
                        }
                        return new C1767qX(a2, F);
                    }
                    AbstractC1004ey b3 = abstractC1701pX.b();
                    int a4 = abstractC1701pX.a();
                    if (!(b3.B0().c() instanceof InterfaceC1437lX)) {
                        AbstractC2097vY E03 = b3.E0();
                        C0875d c0875d = E03 instanceof C0875d ? (C0875d) E03 : null;
                        JR jr3 = c0875d != null ? c0875d.j : null;
                        if (jr3 != null) {
                            if ((abstractC1964tX instanceof C2381zs) && abstractC1964tX.b()) {
                                C2381zs c2381zs = (C2381zs) abstractC1964tX;
                                c2096vX = new C2096vX(new C2381zs(c2381zs.b, c2381zs.c, false));
                            } else {
                                c2096vX = this;
                            }
                            abstractC1004ey = c2096vX.i(1, jr3);
                        }
                        List parameters = b3.B0().getParameters();
                        List w0 = b3.w0();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        boolean z2 = false;
                        for (int i4 = 0; i4 < parameters.size(); i4++) {
                            InterfaceC1437lX interfaceC1437lX2 = (InterfaceC1437lX) parameters.get(i4);
                            AbstractC1701pX abstractC1701pX3 = (AbstractC1701pX) w0.get(i4);
                            AbstractC1701pX j4 = j(abstractC1701pX3, interfaceC1437lX2, i + 1);
                            int v2 = AbstractC1888sN.v(c(interfaceC1437lX2.Y(), j4.a()));
                            if (v2 != 0) {
                                if (v2 == 1) {
                                }
                                j4 = AbstractC2228xX.j(interfaceC1437lX2);
                                z = true;
                            } else {
                                int Y = interfaceC1437lX2.Y();
                                z = true;
                                if (Y != 1 && !j4.c()) {
                                    j4 = new C1767qX(1, j4.b());
                                }
                            }
                            if (j4 != abstractC1701pX3) {
                                z2 = z;
                            }
                            arrayList.add(j4);
                        }
                        if (z2) {
                            w0 = arrayList;
                        }
                        InterfaceC1738q4 c3 = abstractC1964tX.c(b3.getAnnotations());
                        AbstractC0048Bt.n(w0, "newArguments");
                        AbstractC0048Bt.n(c3, "newAnnotations");
                        AbstractC1004ey o2 = DY.o(b3, w0, c3, 4);
                        if ((o2 instanceof JR) && (abstractC1004ey instanceof JR)) {
                            o2 = TM.F((JR) o2, (JR) abstractC1004ey);
                        }
                        return new C1767qX(a4, o2);
                    }
                }
            }
        }
        return abstractC1701pX;
    }
}
