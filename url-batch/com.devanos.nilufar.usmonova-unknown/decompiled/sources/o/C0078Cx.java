package o;

import android.view.KeyEvent;

/* renamed from: o.Cx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078Cx {
    public final KeyEvent a;

    public /* synthetic */ C0078Cx(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0078Cx) {
            return AbstractC0048Bt.h(this.a, ((C0078Cx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
