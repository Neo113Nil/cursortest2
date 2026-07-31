package yads;

import android.view.View;

/* loaded from: classes4.dex */
public final class ku {
    public final gg0 a;
    public th b;

    public ku(gg0 gg0Var) {
        this.a = gg0Var;
    }

    public final void a(View view, String str) {
        View.OnClickListener onClickListener;
        th thVar = this.b;
        if (thVar == null || (onClickListener = (View.OnClickListener) thVar.a.get(str)) == null) {
            return;
        }
        onClickListener.onClick(view);
    }
}
