package yads;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class ar2 {
    public final l73 a;
    public final h63 b;

    public ar2(l73 l73Var) {
        h63 h63Var = new h63();
        this.a = l73Var;
        this.b = h63Var;
    }

    public final void a(View view, long j, long j2) {
        view.setVisibility(0);
        this.a.getClass();
        View findViewWithTag = view.findViewWithTag("timer_value");
        TextView textView = findViewWithTag instanceof TextView ? (TextView) findViewWithTag : null;
        if (textView != null) {
            this.b.getClass();
            textView.setText(String.valueOf((int) Math.ceil((j - j2) / h63.a)));
        }
    }
}
