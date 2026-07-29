package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.yh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2304yh implements InterfaceC0010Ah {
    public static final C2304yh c;
    public static final C2304yh d;
    public static final C2304yh e;
    public final C0062Ch a;
    public final BU b = EB.D(new C1139h0(5, this));

    static {
        C0062Ch c0062Ch = new C0062Ch();
        c0062Ch.g();
        c0062Ch.a = true;
        new C2304yh(c0062Ch);
        C0062Ch c0062Ch2 = new C0062Ch();
        c0062Ch2.g();
        C1648ok c1648ok = C1648ok.h;
        c0062Ch2.e(c1648ok);
        c0062Ch2.a = true;
        new C2304yh(c0062Ch2);
        C0062Ch c0062Ch3 = new C0062Ch();
        c0062Ch3.g();
        c0062Ch3.e(c1648ok);
        c0062Ch3.l();
        c0062Ch3.a = true;
        new C2304yh(c0062Ch3);
        C0062Ch c0062Ch4 = new C0062Ch();
        c0062Ch4.e(c1648ok);
        C0030Bb c0030Bb = C0030Bb.c;
        c0062Ch4.d(c0030Bb);
        EnumC1948tH enumC1948tH = EnumC1948tH.i;
        c0062Ch4.m(enumC1948tH);
        c0062Ch4.a = true;
        new C2304yh(c0062Ch4);
        C0062Ch c0062Ch5 = new C0062Ch();
        c0062Ch5.g();
        c0062Ch5.e(c1648ok);
        c0062Ch5.d(c0030Bb);
        c0062Ch5.j();
        c0062Ch5.m(EnumC1948tH.j);
        c0062Ch5.a();
        c0062Ch5.c();
        c0062Ch5.l();
        c0062Ch5.f();
        c0062Ch5.a = true;
        new C2304yh(c0062Ch5);
        C0062Ch c0062Ch6 = new C0062Ch();
        c0062Ch6.e(EnumC2370zh.i);
        c0062Ch6.a = true;
        c = new C2304yh(c0062Ch6);
        C0062Ch c0062Ch7 = new C0062Ch();
        c0062Ch7.e(EnumC2370zh.j);
        c0062Ch7.a = true;
        new C2304yh(c0062Ch7);
        C0062Ch c0062Ch8 = new C0062Ch();
        c0062Ch8.d(c0030Bb);
        c0062Ch8.m(enumC1948tH);
        c0062Ch8.a = true;
        d = new C2304yh(c0062Ch8);
        C0062Ch c0062Ch9 = new C0062Ch();
        c0062Ch9.b();
        c0062Ch9.d(C0030Bb.b);
        c0062Ch9.e(EnumC2370zh.j);
        c0062Ch9.a = true;
        e = new C2304yh(c0062Ch9);
        C0062Ch c0062Ch10 = new C0062Ch();
        c0062Ch10.k();
        c0062Ch10.e(EnumC2370zh.j);
        c0062Ch10.a = true;
        new C2304yh(c0062Ch10);
    }

    public C2304yh(C0062Ch c0062Ch) {
        this.a = c0062Ch;
    }

    public static void X(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean j0(AbstractC1004ey abstractC1004ey) {
        if (!AbstractC0946e20.A(abstractC1004ey)) {
            return false;
        }
        List w0 = abstractC1004ey.w0();
        if (w0 != null && w0.isEmpty()) {
            return true;
        }
        Iterator it = w0.iterator();
        while (it.hasNext()) {
            if (((AbstractC1701pX) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void n(C2304yh c2304yh, PJ pj, StringBuilder sb) {
        boolean r = c2304yh.r();
        C0062Ch c0062Ch = c2304yh.a;
        if (!r) {
            C0036Bh c0036Bh = c0062Ch.g;
            InterfaceC0937dx[] interfaceC0937dxArr = C0062Ch.W;
            if (!((Boolean) c0036Bh.a(c0062Ch, interfaceC0937dxArr[5])).booleanValue()) {
                if (c2304yh.q().contains(EnumC2370zh.n)) {
                    c2304yh.y(sb, pj, null);
                    C0325Ml R = pj.R();
                    if (R != null) {
                        c2304yh.y(sb, R, EnumC1474m4.i);
                    }
                    C0325Ml L = pj.L();
                    if (L != null) {
                        c2304yh.y(sb, L, EnumC1474m4.q);
                    }
                    if (((OJ) c0062Ch.G.a(c0062Ch, interfaceC0937dxArr[31])) == OJ.i) {
                        SJ getter = pj.getGetter();
                        if (getter != null) {
                            c2304yh.y(sb, getter, EnumC1474m4.l);
                        }
                        WJ b = pj.b();
                        if (b != null) {
                            c2304yh.y(sb, b, EnumC1474m4.m);
                            List t0 = b.t0();
                            AbstractC0048Bt.m(t0, "setter.valueParameters");
                            RY ry = (RY) AbstractC0720ac.D0(t0);
                            AbstractC0048Bt.m(ry, "it");
                            c2304yh.y(sb, ry, EnumC1474m4.p);
                        }
                    }
                }
                List T = pj.T();
                AbstractC0048Bt.m(T, "property.contextReceiverParameters");
                c2304yh.C(sb, T);
                C0244Jh visibility = pj.getVisibility();
                AbstractC0048Bt.m(visibility, "property.visibility");
                c2304yh.h0(visibility, sb);
                c2304yh.N(sb, c2304yh.q().contains(EnumC2370zh.u) && pj.isConst(), "const");
                c2304yh.K(pj, sb);
                c2304yh.M(sb, pj);
                c2304yh.S(sb, pj);
                c2304yh.N(sb, c2304yh.q().contains(EnumC2370zh.v) && pj.V(), "lateinit");
                c2304yh.J(sb, pj);
            }
            c2304yh.e0(pj, sb, false);
            List typeParameters = pj.getTypeParameters();
            AbstractC0048Bt.m(typeParameters, "property.typeParameters");
            c2304yh.d0(sb, typeParameters, true);
            c2304yh.V(sb, pj);
        }
        c2304yh.P(pj, sb, true);
        sb.append(": ");
        AbstractC1004ey c2 = pj.c();
        AbstractC0048Bt.m(c2, "property.type");
        sb.append(c2304yh.Y(c2));
        c2304yh.W(sb, pj);
        c2304yh.H(pj, sb);
        List typeParameters2 = pj.getTypeParameters();
        AbstractC0048Bt.m(typeParameters2, "property.typeParameters");
        c2304yh.i0(sb, typeParameters2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0054 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v(OB ob) {
        if (ob instanceof InterfaceC1245ib) {
            return ((InterfaceC1245ib) ob).B() == 2 ? 4 : 1;
        }
        InterfaceC1118gg n = ob.n();
        InterfaceC1245ib interfaceC1245ib = n instanceof InterfaceC1245ib ? (InterfaceC1245ib) n : null;
        if (interfaceC1245ib != null && (ob instanceof InterfaceC2204x9)) {
            InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) ob;
            Collection o2 = interfaceC2204x9.o();
            AbstractC0048Bt.m(o2, "this.overriddenDescriptors");
            if (!o2.isEmpty() && interfaceC1245ib.g() != 1) {
                return 3;
            }
            if (interfaceC1245ib.B() == 2 && !AbstractC0048Bt.h(interfaceC2204x9.getVisibility(), AbstractC0270Kh.a)) {
                if (interfaceC2204x9.g() != 4) {
                    return 3;
                }
            }
        }
    }

    public final void A(InterfaceC0004Ab interfaceC0004Ab, StringBuilder sb) {
        List p = interfaceC0004Ab.p();
        AbstractC0048Bt.m(p, "classifier.declaredTypeParameters");
        List parameters = interfaceC0004Ab.z().getParameters();
        AbstractC0048Bt.m(parameters, "classifier.typeConstructor.parameters");
        if (u() && interfaceC0004Ab.k() && parameters.size() > p.size()) {
            sb.append(" /*captured type parameters: ");
            c0(sb, parameters.subList(p.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String B(AbstractC0551Vd abstractC0551Vd) {
        if (abstractC0551Vd instanceof O6) {
            return AbstractC0720ac.t0((Iterable) ((O6) abstractC0551Vd).a, ", ", "{", "}", new C2238xh(this, 1), 24);
        }
        if (abstractC0551Vd instanceof C1606o4) {
            return UT.M(x((InterfaceC0948e4) ((C1606o4) abstractC0551Vd).a, null), "@");
        }
        if (!(abstractC0551Vd instanceof C1002ew)) {
            return abstractC0551Vd.toString();
        }
        AbstractC0936dw abstractC0936dw = (AbstractC0936dw) ((C1002ew) abstractC0551Vd).a;
        if (abstractC0936dw instanceof C0806bw) {
            return ((C0806bw) abstractC0936dw).a + "::class";
        }
        if (!(abstractC0936dw instanceof C0871cw)) {
            throw new C0057Cc();
        }
        C0871cw c0871cw = (C0871cw) abstractC0936dw;
        String b = c0871cw.a.a.b().b();
        for (int i = 0; i < c0871cw.a.b; i++) {
            b = "kotlin.Array<" + b + '>';
        }
        return AbstractC1888sN.j(b, "::class");
    }

    public final void C(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            C0261Jy c0261Jy = (C0261Jy) it.next();
            y(sb, c0261Jy, EnumC1474m4.n);
            AbstractC1004ey c2 = c0261Jy.c();
            AbstractC0048Bt.m(c2, "contextReceiver.type");
            sb.append(G(c2));
            if (i == AbstractC0868ct.w(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    public final void D(StringBuilder sb, JR jr) {
        y(sb, jr, null);
        if (AbstractC1473m3.P(jr)) {
            boolean z = jr instanceof C0195Hk;
            C0062Ch c0062Ch = this.a;
            if (z && ((C0195Hk) jr).k.i && ((Boolean) c0062Ch.T.a(c0062Ch, C0062Ch.W[45])).booleanValue()) {
                C0273Kk c0273Kk = C0273Kk.a;
                if (z) {
                    boolean z2 = ((C0195Hk) jr).k.i;
                }
                SW B0 = jr.B0();
                AbstractC0048Bt.l(B0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(E(((C0221Ik) B0).b[0]));
            } else {
                if (!z || ((Boolean) c0062Ch.V.a(c0062Ch, C0062Ch.W[47])).booleanValue()) {
                    sb.append(jr.B0().toString());
                } else {
                    sb.append(((C0195Hk) jr).f45o);
                }
                sb.append(Z(jr.w0()));
            }
        } else {
            SW B02 = jr.B0();
            InterfaceC2364zb c2 = jr.B0().c();
            C0950e6 m = TM.m(jr, c2 instanceof InterfaceC0004Ab ? (InterfaceC0004Ab) c2 : null, 0);
            if (m == null) {
                sb.append(a0(B02));
                sb.append(Z(jr.w0()));
            } else {
                U(sb, m);
            }
        }
        if (jr.C0()) {
            sb.append("?");
        }
        if (jr instanceof C0632Yg) {
            sb.append(" & Any");
        }
    }

    public final String E(String str) {
        int ordinal = s().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return AbstractC1888sN.k("<font color=red><b>", str, "</b></font>");
        }
        throw new C0057Cc();
    }

    public final String F(String str, String str2, AbstractC0545Ux abstractC0545Ux) {
        AbstractC0048Bt.n(str, "lowerRendered");
        AbstractC0048Bt.n(str2, "upperRendered");
        if (DY.t(str, str2)) {
            return AbstractC0778bU.B(str2, "(", false) ? AbstractC1888sN.k("(", str, ")!") : str.concat("!");
        }
        String R = UT.R(p().a(abstractC0545Ux.i(AbstractC1433lT.B), this), "Collection");
        String q = DY.q(str, R.concat("Mutable"), str2, R, R.concat("(Mutable)"));
        if (q != null) {
            return q;
        }
        String q2 = DY.q(str, R.concat("MutableMap.MutableEntry"), str2, R.concat("Map.Entry"), R.concat("(Mutable)Map.(Mutable)Entry"));
        if (q2 != null) {
            return q2;
        }
        String R2 = UT.R(p().a(abstractC0545Ux.j("Array"), this), "Array");
        String q3 = DY.q(str, R2.concat(o("Array<")), str2, R2.concat(o("Array<out ")), R2.concat(o("Array<(out) ")));
        if (q3 != null) {
            return q3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String G(AbstractC1004ey abstractC1004ey) {
        String Y = Y(abstractC1004ey);
        if ((!j0(abstractC1004ey) || AbstractC2228xX.e(abstractC1004ey)) && !(abstractC1004ey instanceof C0632Yg)) {
            return Y;
        }
        return "(" + Y + ')';
    }

    public final void H(SY sy, StringBuilder sb) {
        AbstractC0551Vd o0;
        C0062Ch c0062Ch = this.a;
        if (!((Boolean) c0062Ch.u.a(c0062Ch, C0062Ch.W[19])).booleanValue() || (o0 = sy.o0()) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(o(B(o0)));
    }

    public final String I(String str) {
        int ordinal = s().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new C0057Cc();
            }
            C0062Ch c0062Ch = this.a;
            if (!((Boolean) c0062Ch.U.a(c0062Ch, C0062Ch.W[46])).booleanValue()) {
                return AbstractC1888sN.k("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void J(StringBuilder sb, InterfaceC2204x9 interfaceC2204x9) {
        String str;
        if (q().contains(EnumC2370zh.p) && u() && interfaceC2204x9.M() != 1) {
            sb.append("/*");
            int M = interfaceC2204x9.M();
            if (M == 1) {
                str = "DECLARATION";
            } else if (M == 2) {
                str = "FAKE_OVERRIDE";
            } else if (M == 3) {
                str = "DELEGATION";
            } else {
                if (M != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(AbstractC0022At.M(str));
            sb.append("*/ ");
        }
    }

    public final void K(OB ob, StringBuilder sb) {
        N(sb, ob.w(), "external");
        boolean z = false;
        N(sb, q().contains(EnumC2370zh.s) && ob.X(), "expect");
        if (q().contains(EnumC2370zh.t) && ob.p0()) {
            z = true;
        }
        N(sb, z, "actual");
    }

    public final void L(int i, StringBuilder sb, int i2) {
        String str;
        C0062Ch c0062Ch = this.a;
        if (((Boolean) c0062Ch.p.a(c0062Ch, C0062Ch.W[14])).booleanValue() || i != i2) {
            boolean contains = q().contains(EnumC2370zh.l);
            if (i == 1) {
                str = "FINAL";
            } else if (i == 2) {
                str = "SEALED";
            } else if (i == 3) {
                str = "OPEN";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "ABSTRACT";
            }
            N(sb, contains, AbstractC0022At.M(str));
        }
    }

    public final void M(StringBuilder sb, InterfaceC2204x9 interfaceC2204x9) {
        if (AbstractC0114Eh.s(interfaceC2204x9) && interfaceC2204x9.g() == 1) {
            return;
        }
        C0062Ch c0062Ch = this.a;
        if (((UG) c0062Ch.A.a(c0062Ch, C0062Ch.W[25])) == UG.h && interfaceC2204x9.g() == 3 && !interfaceC2204x9.o().isEmpty()) {
            return;
        }
        int g = interfaceC2204x9.g();
        AbstractC1888sN.t(g, "callable.modality");
        L(g, sb, v(interfaceC2204x9));
    }

    public final void N(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(I(str));
            sb.append(" ");
        }
    }

    public final String O(C0827cE c0827cE, boolean z) {
        String o2 = o(DY.l(c0827cE));
        C0062Ch c0062Ch = this.a;
        return (((Boolean) c0062Ch.U.a(c0062Ch, C0062Ch.W[46])).booleanValue() && s() == EnumC1822rN.i && z) ? AbstractC1888sN.k("<b>", o2, "</b>") : o2;
    }

    public final void P(InterfaceC1118gg interfaceC1118gg, StringBuilder sb, boolean z) {
        C0827cE name = interfaceC1118gg.getName();
        AbstractC0048Bt.m(name, "descriptor.name");
        sb.append(O(name, z));
    }

    public final void Q(StringBuilder sb, AbstractC1004ey abstractC1004ey) {
        AbstractC2097vY E0 = abstractC1004ey.E0();
        C0875d c0875d = E0 instanceof C0875d ? (C0875d) E0 : null;
        if (c0875d == null) {
            R(sb, abstractC1004ey);
            return;
        }
        JR jr = c0875d.i;
        C0062Ch c0062Ch = this.a;
        C0036Bh c0036Bh = c0062Ch.Q;
        InterfaceC0937dx[] interfaceC0937dxArr = C0062Ch.W;
        if (((Boolean) c0036Bh.a(c0062Ch, interfaceC0937dxArr[41])).booleanValue()) {
            R(sb, jr);
            return;
        }
        R(sb, c0875d.j);
        if (((Boolean) c0062Ch.P.a(c0062Ch, interfaceC0937dxArr[40])).booleanValue()) {
            EnumC1822rN s = s();
            C1691pN c1691pN = EnumC1822rN.i;
            if (s == c1691pN) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* = ");
            R(sb, jr);
            sb.append(" */");
            if (s() == c1691pN) {
                sb.append("</i></font>");
            }
        }
    }

    public final void R(StringBuilder sb, AbstractC1004ey abstractC1004ey) {
        C0827cE c0827cE;
        String o2;
        C0062Ch c0062Ch = this.a;
        if ((abstractC1004ey instanceof C2124vz) && c0062Ch.n()) {
            SA sa = ((C2124vz) abstractC1004ey).k;
            if (sa.j == UA.h || sa.j == UA.i) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        AbstractC2097vY E0 = abstractC1004ey.E0();
        if (E0 instanceof AbstractC1782qm) {
            sb.append(((AbstractC1782qm) E0).J0(this, this));
            return;
        }
        if (E0 instanceof JR) {
            JR jr = (JR) E0;
            if (jr.equals(AbstractC2228xX.b) || jr.B0() == AbstractC2228xX.a.i) {
                sb.append("???");
                return;
            }
            SW B0 = jr.B0();
            if ((B0 instanceof C0221Ik) && ((C0221Ik) B0).a == EnumC0247Jk.q) {
                if (!((Boolean) c0062Ch.t.a(c0062Ch, C0062Ch.W[18])).booleanValue()) {
                    sb.append("???");
                    return;
                }
                SW B02 = jr.B0();
                AbstractC0048Bt.l(B02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(E(((C0221Ik) B02).b[0]));
                return;
            }
            if (AbstractC1473m3.P(jr)) {
                D(sb, jr);
                return;
            }
            if (!j0(jr)) {
                D(sb, jr);
                return;
            }
            int length = sb.length();
            ((C2304yh) this.b.getValue()).y(sb, jr, null);
            boolean z = sb.length() != length;
            AbstractC1004ey x = AbstractC0946e20.x(jr);
            List u = AbstractC0946e20.u(jr);
            if (!u.isEmpty()) {
                sb.append("context(");
                Iterator it = u.subList(0, AbstractC0868ct.w(u)).iterator();
                while (it.hasNext()) {
                    Q(sb, (AbstractC1004ey) it.next());
                    sb.append(", ");
                }
                Q(sb, (AbstractC1004ey) AbstractC0720ac.v0(u));
                sb.append(") ");
            }
            boolean B = AbstractC0946e20.B(jr);
            boolean C0 = jr.C0();
            boolean z2 = C0 || (z && x != null);
            if (z2) {
                if (B) {
                    sb.insert(length, '(');
                } else {
                    if (z) {
                        if (sb.length() == 0) {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                        AbstractC0868ct.G(sb.charAt(UT.F(sb)));
                        if (sb.charAt(UT.F(sb) - 1) != ')') {
                            sb.insert(UT.F(sb), "()");
                        }
                    }
                    sb.append("(");
                }
            }
            N(sb, B, "suspend");
            if (x != null) {
                boolean z3 = (j0(x) && !x.C0()) || AbstractC0946e20.B(x) || !x.getAnnotations().isEmpty() || (x instanceof C0632Yg);
                if (z3) {
                    sb.append("(");
                }
                Q(sb, x);
                if (z3) {
                    sb.append(")");
                }
                sb.append(".");
            }
            sb.append("(");
            if (!AbstractC0946e20.A(jr) || jr.getAnnotations().c(AbstractC1433lT.p) == null || jr.w0().size() > 1) {
                int i = 0;
                for (AbstractC1701pX abstractC1701pX : AbstractC0946e20.y(jr)) {
                    int i2 = i + 1;
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (((Boolean) c0062Ch.S.a(c0062Ch, C0062Ch.W[43])).booleanValue()) {
                        AbstractC1004ey b = abstractC1701pX.b();
                        AbstractC0048Bt.m(b, "typeProjection.type");
                        c0827cE = AbstractC0946e20.r(b);
                    } else {
                        c0827cE = null;
                    }
                    if (c0827cE != null) {
                        sb.append(O(c0827cE, false));
                        sb.append(": ");
                    }
                    AbstractC0048Bt.n(abstractC1701pX, "typeProjection");
                    StringBuilder sb2 = new StringBuilder();
                    AbstractC0720ac.s0(AbstractC0868ct.J(abstractC1701pX), sb2, ", ", null, null, new C2238xh(this, 0), 60);
                    String sb3 = sb2.toString();
                    AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
                    sb.append(sb3);
                    i = i2;
                }
            } else {
                sb.append("???");
            }
            sb.append(") ");
            int ordinal = s().ordinal();
            if (ordinal == 0) {
                o2 = o("->");
            } else {
                if (ordinal != 1) {
                    throw new C0057Cc();
                }
                o2 = "&rarr;";
            }
            sb.append(o2);
            sb.append(" ");
            AbstractC0946e20.A(jr);
            AbstractC1004ey b2 = ((AbstractC1701pX) AbstractC0720ac.v0(jr.w0())).b();
            AbstractC0048Bt.m(b2, "arguments.last().type");
            Q(sb, b2);
            if (z2) {
                sb.append(")");
            }
            if (C0) {
                sb.append("?");
            }
        }
    }

    public final void S(StringBuilder sb, InterfaceC2204x9 interfaceC2204x9) {
        if (q().contains(EnumC2370zh.m) && !interfaceC2204x9.o().isEmpty()) {
            C0062Ch c0062Ch = this.a;
            if (((UG) c0062Ch.A.a(c0062Ch, C0062Ch.W[25])) != UG.i) {
                N(sb, true, "override");
                if (u()) {
                    sb.append("/*");
                    sb.append(interfaceC2204x9.o().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void T(C2245xo c2245xo, String str, StringBuilder sb) {
        sb.append(I(str));
        C2377zo i = c2245xo.i();
        AbstractC0048Bt.m(i, "fqName.toUnsafe()");
        String o2 = o(DY.m(i.e()));
        if (o2.length() > 0) {
            sb.append(" ");
            sb.append(o2);
        }
    }

    public final void U(StringBuilder sb, C0950e6 c0950e6) {
        C0950e6 c0950e62 = (C0950e6) c0950e6.k;
        InterfaceC0004Ab interfaceC0004Ab = (InterfaceC0004Ab) c0950e6.i;
        if (c0950e62 != null) {
            U(sb, c0950e62);
            sb.append('.');
            C0827cE name = interfaceC0004Ab.getName();
            AbstractC0048Bt.m(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(O(name, false));
        } else {
            SW z = interfaceC0004Ab.z();
            AbstractC0048Bt.m(z, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(a0(z));
        }
        sb.append(Z((List) c0950e6.j));
    }

    public final void V(StringBuilder sb, InterfaceC2204x9 interfaceC2204x9) {
        C0261Jy J = interfaceC2204x9.J();
        if (J != null) {
            y(sb, J, EnumC1474m4.n);
            AbstractC1004ey c2 = J.c();
            AbstractC0048Bt.m(c2, "receiver.type");
            sb.append(G(c2));
            sb.append(".");
        }
    }

    public final void W(StringBuilder sb, InterfaceC2204x9 interfaceC2204x9) {
        C0261Jy J;
        C0062Ch c0062Ch = this.a;
        if (((Boolean) c0062Ch.E.a(c0062Ch, C0062Ch.W[29])).booleanValue() && (J = interfaceC2204x9.J()) != null) {
            sb.append(" on ");
            AbstractC1004ey c2 = J.c();
            AbstractC0048Bt.m(c2, "receiver.type");
            sb.append(Y(c2));
        }
    }

    public final String Y(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "type");
        StringBuilder sb = new StringBuilder();
        C0062Ch c0062Ch = this.a;
        Q(sb, (AbstractC1004ey) ((InterfaceC2114vp) c0062Ch.x.a(c0062Ch, C0062Ch.W[22])).invoke(abstractC1004ey));
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String Z(List list) {
        AbstractC0048Bt.n(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(o("<"));
        AbstractC0720ac.s0(list, sb, ", ", null, null, new C2238xh(this, 0), 60);
        sb.append(o(">"));
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // o.InterfaceC0010Ah
    public final void a() {
        this.a.a();
    }

    public final String a0(SW sw) {
        AbstractC0048Bt.n(sw, "typeConstructor");
        InterfaceC2364zb c2 = sw.c();
        if (c2 instanceof InterfaceC1437lX ? true : c2 instanceof InterfaceC1245ib ? true : c2 instanceof C1316ji) {
            AbstractC0048Bt.n(c2, "klass");
            return C0273Kk.f(c2) ? c2.z().toString() : p().a(c2, this);
        }
        if (c2 == null) {
            return sw instanceof C2382zt ? ((C2382zt) sw).f(I2.z) : sw.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + c2.getClass()).toString());
    }

    @Override // o.InterfaceC0010Ah
    public final void b() {
        this.a.b();
    }

    public final void b0(InterfaceC1437lX interfaceC1437lX, StringBuilder sb, boolean z) {
        String str;
        if (z) {
            sb.append(o("<"));
        }
        if (u()) {
            sb.append("/*");
            sb.append(interfaceC1437lX.getIndex());
            sb.append("*/ ");
        }
        N(sb, interfaceC1437lX.P(), "reified");
        int Y = interfaceC1437lX.Y();
        if (Y == 1) {
            str = "";
        } else if (Y == 2) {
            str = "in";
        } else {
            if (Y != 3) {
                throw null;
            }
            str = "out";
        }
        boolean z2 = true;
        N(sb, str.length() > 0, str);
        y(sb, interfaceC1437lX, null);
        P(interfaceC1437lX, sb, z);
        int size = interfaceC1437lX.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC1004ey abstractC1004ey = (AbstractC1004ey) interfaceC1437lX.getUpperBounds().iterator().next();
            if (abstractC1004ey == null) {
                AbstractC0545Ux.a(141);
                throw null;
            }
            if (!AbstractC0545Ux.x(abstractC1004ey) || !abstractC1004ey.C0()) {
                sb.append(" : ");
                sb.append(Y(abstractC1004ey));
            }
        } else if (z) {
            for (AbstractC1004ey abstractC1004ey2 : interfaceC1437lX.getUpperBounds()) {
                if (abstractC1004ey2 == null) {
                    AbstractC0545Ux.a(141);
                    throw null;
                }
                if (!AbstractC0545Ux.x(abstractC1004ey2) || !abstractC1004ey2.C0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(Y(abstractC1004ey2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(o(">"));
        }
    }

    @Override // o.InterfaceC0010Ah
    public final void c() {
        this.a.c();
    }

    public final void c0(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0((InterfaceC1437lX) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // o.InterfaceC0010Ah
    public final void d(InterfaceC0056Cb interfaceC0056Cb) {
        this.a.d(interfaceC0056Cb);
    }

    public final void d0(StringBuilder sb, List list, boolean z) {
        C0062Ch c0062Ch = this.a;
        if (((Boolean) c0062Ch.v.a(c0062Ch, C0062Ch.W[20])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(o("<"));
        c0(sb, list);
        sb.append(o(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // o.InterfaceC0010Ah
    public final void e(Set set) {
        AbstractC0048Bt.n(set, "<set-?>");
        this.a.e(set);
    }

    public final void e0(SY sy, StringBuilder sb, boolean z) {
        if (z || !(sy instanceof RY)) {
            sb.append(I(sy.G() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // o.InterfaceC0010Ah
    public final void f() {
        this.a.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(RY ry, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        AbstractC1004ey c2;
        if (z2) {
            sb.append(I("value-parameter"));
            sb.append(" ");
        }
        if (u()) {
            sb.append("/*");
            sb.append(ry.m);
            sb.append("*/ ");
        }
        y(sb, ry, null);
        N(sb, ry.f98o, "crossinline");
        N(sb, ry.p, "noinline");
        C0062Ch c0062Ch = this.a;
        C0036Bh c0036Bh = c0062Ch.r;
        InterfaceC0937dx[] interfaceC0937dxArr = C0062Ch.W;
        boolean z4 = false;
        if (((Boolean) c0036Bh.a(c0062Ch, interfaceC0937dxArr[16])).booleanValue()) {
            InterfaceC2072v9 n = ry.n();
            C0981eb c0981eb = n instanceof C0981eb ? (C0981eb) n : null;
            if (c0981eb != null && c0981eb.K) {
                z3 = true;
                if (z3) {
                    N(sb, ((Boolean) c0062Ch.s.a(c0062Ch, interfaceC0937dxArr[17])).booleanValue(), "actual");
                }
                c2 = ry.c();
                AbstractC0048Bt.m(c2, "variable.type");
                AbstractC1004ey abstractC1004ey = ry.q;
                AbstractC1004ey abstractC1004ey2 = abstractC1004ey != null ? c2 : abstractC1004ey;
                N(sb, abstractC1004ey == null, "vararg");
                if (!z3 || (z2 && !r())) {
                    e0(ry, sb, z3);
                }
                if (z) {
                    P(ry, sb, z2);
                    sb.append(": ");
                }
                sb.append(Y(abstractC1004ey2));
                H(ry, sb);
                if (u() && abstractC1004ey != null) {
                    sb.append(" /*");
                    sb.append(Y(c2));
                    sb.append("*/");
                }
                if (((InterfaceC2114vp) c0062Ch.y.a(c0062Ch, interfaceC0937dxArr[23])) != null) {
                    if (c0062Ch.n() ? ry.I0() : AbstractC0192Hh.a(ry)) {
                        z4 = true;
                    }
                }
                if (z4) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder(" = ");
                InterfaceC2114vp interfaceC2114vp = (InterfaceC2114vp) c0062Ch.y.a(c0062Ch, interfaceC0937dxArr[23]);
                AbstractC0048Bt.k(interfaceC2114vp);
                sb2.append((String) interfaceC2114vp.invoke(ry));
                sb.append(sb2.toString());
                return;
            }
        }
        z3 = false;
        if (z3) {
        }
        c2 = ry.c();
        AbstractC0048Bt.m(c2, "variable.type");
        AbstractC1004ey abstractC1004ey3 = ry.q;
        if (abstractC1004ey3 != null) {
        }
        N(sb, abstractC1004ey3 == null, "vararg");
        if (!z3) {
        }
        e0(ry, sb, z3);
        if (z) {
        }
        sb.append(Y(abstractC1004ey2));
        H(ry, sb);
        if (u()) {
            sb.append(" /*");
            sb.append(Y(c2));
            sb.append("*/");
        }
        if (((InterfaceC2114vp) c0062Ch.y.a(c0062Ch, interfaceC0937dxArr[23])) != null) {
        }
        if (z4) {
        }
    }

    @Override // o.InterfaceC0010Ah
    public final void g() {
        this.a.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        if (r10 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(StringBuilder sb, List list, boolean z) {
        boolean z2;
        Iterator it;
        C0062Ch c0062Ch = this.a;
        int ordinal = ((EnumC1948tH) c0062Ch.D.a(c0062Ch, C0062Ch.W[28])).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new C0057Cc();
                }
            }
            z2 = false;
            int size = list.size();
            t().getClass();
            AbstractC0048Bt.n(sb, "builder");
            sb.append("(");
            it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                RY ry = (RY) it.next();
                t().getClass();
                AbstractC0048Bt.n(ry, "parameter");
                f0(ry, z2, sb, false);
                t().getClass();
                if (i != size - 1) {
                    sb.append(", ");
                }
                i = i2;
            }
            t().getClass();
            sb.append(")");
        }
        z2 = true;
        int size2 = list.size();
        t().getClass();
        AbstractC0048Bt.n(sb, "builder");
        sb.append("(");
        it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
        }
        t().getClass();
        sb.append(")");
    }

    @Override // o.InterfaceC0010Ah
    public final Set h() {
        return this.a.h();
    }

    public final boolean h0(C0244Jh c0244Jh, StringBuilder sb) {
        if (!q().contains(EnumC2370zh.k)) {
            return false;
        }
        C0062Ch c0062Ch = this.a;
        C0036Bh c0036Bh = c0062Ch.n;
        InterfaceC0937dx[] interfaceC0937dxArr = C0062Ch.W;
        if (((Boolean) c0036Bh.a(c0062Ch, interfaceC0937dxArr[12])).booleanValue()) {
            c0244Jh = AbstractC0270Kh.f(c0244Jh.a.c());
        }
        if (!((Boolean) c0062Ch.f23o.a(c0062Ch, interfaceC0937dxArr[13])).booleanValue() && AbstractC0048Bt.h(c0244Jh, AbstractC0270Kh.j)) {
            return false;
        }
        sb.append(I(c0244Jh.a.b()));
        sb.append(" ");
        return true;
    }

    @Override // o.InterfaceC0010Ah
    public final void i(LinkedHashSet linkedHashSet) {
        this.a.i(linkedHashSet);
    }

    public final void i0(StringBuilder sb, List list) {
        C0062Ch c0062Ch = this.a;
        if (((Boolean) c0062Ch.v.a(c0062Ch, C0062Ch.W[20])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) it.next();
            List upperBounds = interfaceC1437lX.getUpperBounds();
            AbstractC0048Bt.m(upperBounds, "typeParameter.upperBounds");
            for (AbstractC1004ey abstractC1004ey : AbstractC0720ac.k0(upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                C0827cE name = interfaceC1437lX.getName();
                AbstractC0048Bt.m(name, "typeParameter.name");
                sb2.append(O(name, false));
                sb2.append(" : ");
                AbstractC0048Bt.m(abstractC1004ey, "it");
                sb2.append(Y(abstractC1004ey));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(I("where"));
        sb.append(" ");
        AbstractC0720ac.s0(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // o.InterfaceC0010Ah
    public final void j() {
        this.a.j();
    }

    @Override // o.InterfaceC0010Ah
    public final void k() {
        this.a.k();
    }

    @Override // o.InterfaceC0010Ah
    public final void l() {
        this.a.l();
    }

    @Override // o.InterfaceC0010Ah
    public final void m(EnumC1948tH enumC1948tH) {
        this.a.m(enumC1948tH);
    }

    public final String o(String str) {
        return s().a(str);
    }

    public final InterfaceC0056Cb p() {
        C0062Ch c0062Ch = this.a;
        return (InterfaceC0056Cb) c0062Ch.b.a(c0062Ch, C0062Ch.W[0]);
    }

    public final Set q() {
        C0062Ch c0062Ch = this.a;
        return (Set) c0062Ch.e.a(c0062Ch, C0062Ch.W[3]);
    }

    public final boolean r() {
        C0062Ch c0062Ch = this.a;
        return ((Boolean) c0062Ch.f.a(c0062Ch, C0062Ch.W[4])).booleanValue();
    }

    public final EnumC1822rN s() {
        C0062Ch c0062Ch = this.a;
        return (EnumC1822rN) c0062Ch.C.a(c0062Ch, C0062Ch.W[27]);
    }

    public final C2172wh t() {
        C0062Ch c0062Ch = this.a;
        return (C2172wh) c0062Ch.B.a(c0062Ch, C0062Ch.W[26]);
    }

    public final boolean u() {
        C0062Ch c0062Ch = this.a;
        return ((Boolean) c0062Ch.j.a(c0062Ch, C0062Ch.W[8])).booleanValue();
    }

    public final String w(InterfaceC1118gg interfaceC1118gg) {
        InterfaceC1118gg n;
        String str;
        AbstractC0048Bt.n(interfaceC1118gg, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        interfaceC1118gg.t(new Y1(21, this), sb);
        C0062Ch c0062Ch = this.a;
        C0036Bh c0036Bh = c0062Ch.c;
        InterfaceC0937dx[] interfaceC0937dxArr = C0062Ch.W;
        if (((Boolean) c0036Bh.a(c0062Ch, interfaceC0937dxArr[1])).booleanValue() && !(interfaceC1118gg instanceof InterfaceC0961eH) && !(interfaceC1118gg instanceof InterfaceC1289jH) && (n = interfaceC1118gg.n()) != null && !(n instanceof InterfaceC0761bD)) {
            sb.append(" ");
            int ordinal = s().ordinal();
            if (ordinal == 0) {
                str = "defined in";
            } else {
                if (ordinal != 1) {
                    throw new C0057Cc();
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            C2377zo g = AbstractC0114Eh.g(n);
            AbstractC0048Bt.m(g, "getFqName(containingDeclaration)");
            sb.append(g.a.isEmpty() ? "root package" : o(DY.m(g.e())));
            if (((Boolean) c0062Ch.d.a(c0062Ch, interfaceC0937dxArr[2])).booleanValue() && (n instanceof InterfaceC0961eH) && (interfaceC1118gg instanceof InterfaceC1249ig)) {
                ((InterfaceC1249ig) interfaceC1118gg).d().getClass();
            }
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [o.jk] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    public final String x(InterfaceC0948e4 interfaceC0948e4, EnumC1474m4 enumC1474m4) {
        List W;
        C0981eb i0;
        List t0;
        C0062Ch c0062Ch = this.a;
        C0036Bh c0036Bh = c0062Ch.M;
        AbstractC0048Bt.n(interfaceC0948e4, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (enumC1474m4 != null) {
            sb.append(enumC1474m4.h + ':');
        }
        AbstractC1004ey c2 = interfaceC0948e4.c();
        sb.append(Y(c2));
        InterfaceC0937dx[] interfaceC0937dxArr = C0062Ch.W;
        if (((EnumC0752b4) c0036Bh.a(c0062Ch, interfaceC0937dxArr[37])).h) {
            Map f = interfaceC0948e4.f();
            ?? r6 = 0;
            r6 = 0;
            r6 = 0;
            InterfaceC1245ib d2 = ((Boolean) c0062Ch.H.a(c0062Ch, interfaceC0937dxArr[32])).booleanValue() ? AbstractC0192Hh.d(interfaceC0948e4) : null;
            if (d2 != null && (i0 = d2.i0()) != null && (t0 = i0.t0()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : t0) {
                    if (((RY) obj).I0()) {
                        arrayList.add(obj);
                    }
                }
                r6 = new ArrayList(AbstractC0786bc.d0(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r6.add(((RY) it.next()).getName());
                }
            }
            if (r6 == 0) {
                r6 = C1318jk.h;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : r6) {
                C0827cE c0827cE = (C0827cE) obj2;
                AbstractC0048Bt.m(c0827cE, "it");
                if (!f.containsKey(c0827cE)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(arrayList2));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((C0827cE) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> entrySet = f.entrySet();
            ArrayList arrayList4 = new ArrayList(AbstractC0786bc.d0(entrySet));
            for (Map.Entry entry : entrySet) {
                C0827cE c0827cE2 = (C0827cE) entry.getKey();
                AbstractC0551Vd abstractC0551Vd = (AbstractC0551Vd) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c0827cE2.b());
                sb2.append(" = ");
                sb2.append(!r6.contains(c0827cE2) ? B(abstractC0551Vd) : "...");
                arrayList4.add(sb2.toString());
            }
            ArrayList A0 = AbstractC0720ac.A0(arrayList3, arrayList4);
            if (A0.size() <= 1) {
                W = AbstractC0720ac.J0(A0);
            } else {
                Object[] array = A0.toArray(new Comparable[0]);
                Comparable[] comparableArr = (Comparable[]) array;
                AbstractC0048Bt.n(comparableArr, "<this>");
                if (comparableArr.length > 1) {
                    Arrays.sort(comparableArr);
                }
                W = P6.W(array);
            }
            if (((EnumC0752b4) c0036Bh.a(c0062Ch, C0062Ch.W[37])).i || !W.isEmpty()) {
                AbstractC0720ac.s0(W, sb, ", ", "(", ")", null, 112);
            }
        }
        if (u() && (AbstractC1473m3.P(c2) || (c2.B0().c() instanceof UE))) {
            sb.append(" /* annotation class not found */");
        }
        String sb3 = sb.toString();
        AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final void y(StringBuilder sb, W3 w3, EnumC1474m4 enumC1474m4) {
        if (q().contains(EnumC2370zh.n)) {
            boolean z = w3 instanceof AbstractC1004ey;
            C0062Ch c0062Ch = this.a;
            Set h = z ? c0062Ch.h() : (Set) c0062Ch.J.a(c0062Ch, C0062Ch.W[34]);
            InterfaceC2114vp interfaceC2114vp = (InterfaceC2114vp) c0062Ch.L.a(c0062Ch, C0062Ch.W[36]);
            for (InterfaceC0948e4 interfaceC0948e4 : w3.getAnnotations()) {
                if (!AbstractC0720ac.j0(h, interfaceC0948e4.e()) && !AbstractC0048Bt.h(interfaceC0948e4.e(), AbstractC1433lT.r) && (interfaceC2114vp == null || ((Boolean) interfaceC2114vp.invoke(interfaceC0948e4)).booleanValue())) {
                    sb.append(x(interfaceC0948e4, enumC1474m4));
                    if (((Boolean) c0062Ch.I.a(c0062Ch, C0062Ch.W[33])).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }
}
