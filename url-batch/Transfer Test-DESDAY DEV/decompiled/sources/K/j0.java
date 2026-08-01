package K;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0006e f416a;

    /* renamed from: b, reason: collision with root package name */
    public List f417b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f418c;
    public final HashMap d;

    public j0(C0006e c0006e) {
        super(0);
        this.d = new HashMap();
        this.f416a = c0006e;
    }

    public final m0 a(WindowInsetsAnimation windowInsetsAnimation) {
        m0 m0Var = (m0) this.d.get(windowInsetsAnimation);
        if (m0Var == null) {
            m0Var = new m0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                m0Var.f427a = new k0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, m0Var);
        }
        return m0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0006e c0006e = this.f416a;
        a(windowInsetsAnimation);
        ((View) c0006e.f394e).setTranslationY(RecyclerView.f1570A0);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0006e c0006e = this.f416a;
        a(windowInsetsAnimation);
        View view = (View) c0006e.f394e;
        int[] iArr = (int[]) c0006e.f395f;
        view.getLocationOnScreen(iArr);
        c0006e.f393c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f418c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f418c = arrayList2;
            this.f417b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = G0.b.j(list.get(size));
            m0 a2 = a(j2);
            fraction = j2.getFraction();
            a2.f427a.d(fraction);
            this.f418c.add(a2);
        }
        C0006e c0006e = this.f416a;
        z0 g2 = z0.g(null, windowInsets);
        c0006e.b(g2, this.f417b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0006e c0006e = this.f416a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C.d c2 = C.d.c(lowerBound);
        upperBound = bounds.getUpperBound();
        C.d c3 = C.d.c(upperBound);
        View view = (View) c0006e.f394e;
        int[] iArr = (int[]) c0006e.f395f;
        view.getLocationOnScreen(iArr);
        int i = c0006e.f393c - iArr[1];
        c0006e.d = i;
        view.setTranslationY(i);
        G0.b.l();
        return G0.b.h(c2.d(), c3.d());
    }
}
