package yads;

import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class ev3 extends uv3 {
    public static final ev3 d = new ev3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.uv3
    public final void a(boolean z) {
        Iterator it = Collections.unmodifiableCollection(qv3.c.a).iterator();
        while (it.hasNext()) {
            i9 i9Var = ((av3) it.next()).e;
            if (i9Var.b.get() != 0) {
                kw3.a.a((WebView) i9Var.b.get(), "setState", z ? "foregrounded" : "backgrounded", i9Var.a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.uv3
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(qv3.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((av3) it.next()).d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
