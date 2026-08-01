package defpackage;

import com.vectorharbor.planetvectorsurvey.MainActivity;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fh extends k {
    public final ce0 l;
    public boolean m;

    public fh(MainActivity mainActivity) {
        super(mainActivity);
        this.l = ud0.o(null);
    }

    @Override // defpackage.k
    public final void b(ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(420213850);
        int i2 = 4;
        int i3 = (qhVar.h(this) ? 4 : 2) | i;
        if (qhVar.N(i3 & 1, (i3 & 3) != 2)) {
            qu quVar = (qu) this.l.getValue();
            if (quVar == null) {
                qhVar.V(-1238798753);
            } else {
                qhVar.V(98586082);
                quVar.invoke(qhVar, 0);
            }
            qhVar.q(false);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new j(i, i2, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return fh.class.getName();
    }

    @Override // defpackage.k
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.m;
    }

    public final void setContent(qu quVar) {
        this.m = true;
        this.l.setValue(quVar);
        if (isAttachedToWindow()) {
            if (this.g != null || isAttachedToWindow()) {
                d();
            } else {
                g8.s("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
