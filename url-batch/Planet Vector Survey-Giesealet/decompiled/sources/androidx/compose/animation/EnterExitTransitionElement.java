package androidx.compose.animation;

import defpackage.bu;
import defpackage.cx0;
import defpackage.dq;
import defpackage.iq;
import defpackage.jq;
import defpackage.kq;
import defpackage.nz;
import defpackage.t50;
import defpackage.vi;
import defpackage.wq;
import defpackage.z50;
import defpackage.z6;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class EnterExitTransitionElement extends z50 {
    public final cx0 a;
    public final kq b;
    public final wq c;
    public final bu d;
    public final dq e;

    public EnterExitTransitionElement(cx0 cx0Var, kq kqVar, wq wqVar, bu buVar, dq dqVar) {
        this.a = cx0Var;
        this.b = kqVar;
        this.c = wqVar;
        this.d = buVar;
        this.e = dqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnterExitTransitionElement) {
            EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
            if (this.a == enterExitTransitionElement.a && this.b.equals(enterExitTransitionElement.b) && nz.l(this.c, enterExitTransitionElement.c) && nz.l(this.d, enterExitTransitionElement.d) && nz.l(this.e, enterExitTransitionElement.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.z50
    public final t50 f() {
        jq jqVar = new jq();
        jqVar.r = this.a;
        jqVar.s = this.c;
        jqVar.t = this.d;
        jqVar.u = this.e;
        jqVar.v = z6.a;
        vi.b(0, 0, 15);
        new iq(jqVar, 0);
        new iq(jqVar, 1);
        return jqVar;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        jq jqVar = (jq) t50Var;
        jqVar.r = this.a;
        jqVar.s = this.c;
        jqVar.t = this.d;
        jqVar.u = this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 923521)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.a + ", sizeAnimation=null, offsetAnimation=null, slideAnimation=null, enter=" + this.b + ", exit=" + this.c + ", isEnabled=" + this.d + ", graphicsLayerBlock=" + this.e + ')';
    }
}
