package yads;

import android.graphics.drawable.Drawable;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class gk0 {
    public final ek0 a = new ek0(RangesKt.coerceAtMost(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8, 10240));

    public final fk0 a(String str) {
        return (fk0) this.a.get(str);
    }

    public final void a(String str, Drawable drawable, o31 o31Var) {
        this.a.put(str, new fk0(drawable, o31Var));
    }
}
