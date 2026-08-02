package l;

import android.graphics.Insets;
import android.view.WindowInsets;
import h.C0039a;

/* loaded from: classes.dex */
public class m extends k {

    /* renamed from: n, reason: collision with root package name */
    public C0039a f918n;

    /* renamed from: o, reason: collision with root package name */
    public C0039a f919o;

    /* renamed from: p, reason: collision with root package name */
    public C0039a f920p;

    public m(q qVar, WindowInsets windowInsets) {
        super(qVar, windowInsets);
        this.f918n = null;
        this.f919o = null;
        this.f920p = null;
    }

    @Override // l.o
    public C0039a f() {
        Insets mandatorySystemGestureInsets;
        if (this.f919o == null) {
            mandatorySystemGestureInsets = this.f912c.getMandatorySystemGestureInsets();
            this.f919o = C0039a.b(mandatorySystemGestureInsets);
        }
        return this.f919o;
    }

    @Override // l.o
    public C0039a h() {
        Insets systemGestureInsets;
        if (this.f918n == null) {
            systemGestureInsets = this.f912c.getSystemGestureInsets();
            this.f918n = C0039a.b(systemGestureInsets);
        }
        return this.f918n;
    }

    @Override // l.o
    public C0039a j() {
        Insets tappableElementInsets;
        if (this.f920p == null) {
            tappableElementInsets = this.f912c.getTappableElementInsets();
            this.f920p = C0039a.b(tappableElementInsets);
        }
        return this.f920p;
    }

    @Override // l.j, l.o
    public void p(C0039a c0039a) {
    }
}
