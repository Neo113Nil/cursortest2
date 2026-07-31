package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class z21 {
    public final Context a;
    public final Handler b;
    public final Lazy c;

    public z21(Context context) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = context;
        this.b = handler;
        this.c = LazyKt.lazy(new y21(this));
    }

    public final void a(Set set, z31 z31Var) {
        if (set.isEmpty()) {
            z31Var.a(MapsKt.emptyMap());
        } else {
            new u21(((k92) this.c.getValue()).a, set, z31Var, this.b).a();
        }
    }
}
