package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ga0 extends WindowInsetsAnimation$Callback {
    public final qd a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public ga0(qd qdVar) {
        super(0);
        this.d = new HashMap();
        this.a = qdVar;
    }

    public final ja0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        ja0 ja0Var = (ja0) hashMap.get(windowInsetsAnimation);
        if (ja0Var != null) {
            return ja0Var;
        }
        ja0 ja0Var2 = new ja0(0, null, 0L);
        ja0Var2.a = new ha0(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, ja0Var2);
        return ja0Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j = c0.j(list.get(size));
            ja0 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.c(db0.g(null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        o4 d = this.a.d(a(windowInsetsAnimation), new o4(bounds));
        d.getClass();
        c0.m();
        return c0.h(((io) d.g).e(), ((io) d.h).e());
    }
}
