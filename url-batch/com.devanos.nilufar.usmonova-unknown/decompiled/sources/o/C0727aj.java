package o;

import android.view.DragEvent;

/* renamed from: o.aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727aj extends TC implements InterfaceC0725ah {
    public C0727aj n;

    @Override // o.TC
    public final void n() {
        this.n = null;
    }

    public final boolean q(Y1 y1) {
        C0727aj c0727aj = this.n;
        if (c0727aj == null) {
            return false;
        }
        return c0727aj.q(y1);
    }

    public final void r(Y1 y1) {
        C0727aj c0727aj = this.n;
        if (c0727aj != null) {
            c0727aj.r(y1);
        }
    }

    public final void s(Y1 y1) {
        C0727aj c0727aj = this.n;
        if (c0727aj != null) {
            c0727aj.s(y1);
        }
        this.n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(Y1 y1) {
        C0727aj c0727aj;
        C0727aj c0727aj2 = this.n;
        if (c0727aj2 != null) {
            DragEvent dragEvent = (DragEvent) y1.i;
            if (AbstractC0946e20.d(c0727aj2, PX.h(dragEvent.getX(), dragEvent.getY()))) {
                c0727aj = c0727aj2;
                if (c0727aj == null && c0727aj2 == null) {
                    c0727aj.r(y1);
                    c0727aj.t(y1);
                } else if (c0727aj != null && c0727aj2 != null) {
                    c0727aj2.s(y1);
                } else if (AbstractC0048Bt.h(c0727aj, c0727aj2)) {
                    if (c0727aj != null) {
                        c0727aj.r(y1);
                        c0727aj.t(y1);
                    }
                    if (c0727aj2 != null) {
                        c0727aj2.s(y1);
                    }
                } else if (c0727aj != null) {
                    c0727aj.t(y1);
                }
                this.n = c0727aj;
            }
        }
        if (this.b.m) {
            C1360kM c1360kM = new C1360kM();
            DY.s(this, new C0660Zi(c1360kM, this, y1));
            c0727aj = (C0727aj) c1360kM.h;
        } else {
            c0727aj = null;
        }
        if (c0727aj == null) {
        }
        if (c0727aj != null) {
        }
        if (AbstractC0048Bt.h(c0727aj, c0727aj2)) {
        }
        this.n = c0727aj;
    }

    public final void u(Y1 y1) {
        C0727aj c0727aj = this.n;
        if (c0727aj != null) {
            c0727aj.u(y1);
        }
    }
}
