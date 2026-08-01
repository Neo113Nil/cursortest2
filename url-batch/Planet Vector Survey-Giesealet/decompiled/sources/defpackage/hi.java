package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class hi {
    public static final lt0 a = new lt0(t3.q);
    public static final lt0 b = new lt0(t3.r);
    public static final lt0 c = new lt0(t3.t);
    public static final lt0 d = new lt0(t3.s);
    public static final lt0 e = new lt0(t3.v);
    public static final lt0 f = new lt0(t3.u);
    public static final lt0 g = new lt0(t3.B);
    public static final lt0 h = new lt0(t3.x);
    public static final lt0 i = new lt0(t3.y);
    public static final lt0 j = new lt0(t3.A);
    public static final lt0 k = new lt0(t3.z);
    public static final lt0 l = new lt0(t3.C);
    public static final lt0 m = new lt0(t3.D);
    public static final lt0 n = new lt0(t3.E);
    public static final lt0 o = new lt0(t3.I);
    public static final lt0 p = new lt0(t3.H);
    public static final lt0 q = new lt0(gi.f);
    public static final lt0 r = new lt0(gi.g);
    public static final lt0 s = new lt0(gi.h);
    public static final lt0 t = new lt0(gi.i);
    public static final lt0 u = new lt0(t3.F);
    public static final ji v = new ji(t3.G);

    static {
        x40.I(t3.w);
    }

    public static final void a(dd0 dd0Var, s5 s5Var, qu quVar, ih ihVar, int i2) {
        qh qhVar = (qh) ihVar;
        qhVar.W(1925803616);
        int i3 = i2 | (qhVar.f(dd0Var) ? 4 : 2) | (qhVar.f(s5Var) ? 32 : 16) | (qhVar.h(quVar) ? 256 : 128);
        if (qhVar.N(i3 & 1, (i3 & 147) != 146)) {
            f3 f3Var = (f3) dd0Var;
            ki0 a2 = a.a(f3Var.m11getAccessibilityManager());
            ki0 a3 = b.a(f3Var.getAutofill());
            ki0 a4 = d.a(f3Var.getAutofillManager());
            ki0 a5 = c.a(f3Var.getAutofillTree());
            ki0 a6 = e.a(f3Var.m13getClipboardManager());
            ki0 a7 = f.a(f3Var.m12getClipboard());
            ki0 a8 = h.a(f3Var.getDensity());
            ki0 a9 = i.a(f3Var.getFocusOwner());
            ki0 a10 = j.a(f3Var.getFontLoader());
            a10.f = false;
            ki0 a11 = k.a(f3Var.getFontFamilyResolver());
            a11.f = false;
            nz.c(new ki0[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, l.a(f3Var.getHapticFeedBack()), m.a(f3Var.getInputModeManager()), n.a(f3Var.getLayoutDirection()), o.a(f3Var.getTextInputService()), p.a(f3Var.getSoftwareKeyboardController()), q.a(f3Var.getTextToolbar()), r.a(s5Var), s.a(f3Var.getViewConfiguration()), t.a(f3Var.getWindowInfo()), u.a(f3Var.getPointerIconService()), g.a(f3Var.getGraphicsContext())}, quVar, qhVar, ((i3 >> 3) & 112) | 8);
        } else {
            qhVar.Q();
        }
        ri0 s2 = qhVar.s();
        if (s2 != null) {
            s2.d = new v3(dd0Var, s5Var, quVar, i2, 2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
