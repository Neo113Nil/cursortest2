package yads;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.Unit;

/* loaded from: classes11.dex */
public final class b22 {
    public static final Object b = new Object();
    public static volatile b22 c;
    public final WeakHashMap a = new WeakHashMap();

    public final f42 a(View view) {
        f42 f42Var;
        synchronized (b) {
            f42Var = (f42) this.a.get(view);
        }
        return f42Var;
    }

    public final void a(View view, f42 f42Var) {
        synchronized (b) {
            this.a.put(view, f42Var);
            Unit unit = Unit.INSTANCE;
        }
    }
}
