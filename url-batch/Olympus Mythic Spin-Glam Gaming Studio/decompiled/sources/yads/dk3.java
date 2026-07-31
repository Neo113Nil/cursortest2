package yads;

import android.view.View;

/* loaded from: classes6.dex */
public final class dk3 {
    public final bk3 a;

    public dk3(bk3 bk3Var) {
        this.a = bk3Var;
    }

    public final boolean a() {
        View view = this.a.getView();
        return (view == null || hl3.b(view) || hl3.a(view) < 50) ? false : true;
    }
}
