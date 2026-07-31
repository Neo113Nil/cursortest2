package yads;

import android.view.View;

/* loaded from: classes3.dex */
public final class ck3 {
    public final bk3 a;

    public ck3(bk3 bk3Var) {
        this.a = bk3Var;
    }

    public final boolean a() {
        View view = this.a.getView();
        return (view == null || hl3.b(view) || hl3.a.a(view).a < 1) ? false : true;
    }
}
