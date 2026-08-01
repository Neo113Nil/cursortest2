package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i11 extends WindowInsetsAnimation$Callback {
    public final c11 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public i11(c11 c11Var) {
        super(c11Var.e);
        this.d = new HashMap();
        this.a = c11Var;
    }

    public final l11 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        l11 l11Var = (l11) hashMap.get(windowInsetsAnimation);
        if (l11Var == null) {
            l11Var = new l11(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                l11Var.a = new j11(windowInsetsAnimation);
            }
            hashMap.put(windowInsetsAnimation, l11Var);
        }
        return l11Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
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
            WindowInsetsAnimation j = v0.j(list.get(size));
            l11 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.d(d21.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        j3 e = this.a.e(a(windowInsetsAnimation), new j3(bounds));
        e.getClass();
        v0.l();
        return v0.h(((oy) e.e).e(), ((oy) e.f).e());
    }
}
