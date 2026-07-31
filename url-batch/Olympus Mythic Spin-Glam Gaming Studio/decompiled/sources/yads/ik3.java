package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class ik3 {
    public final s8 a;
    public final Handler b;

    public ik3() {
        s8 s8Var = new s8();
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = s8Var;
        this.b = handler;
    }

    public static final void b(ViewGroup viewGroup, boolean z) {
        int childCount;
        if (viewGroup == null || viewGroup.getChildCount() <= 0 || (childCount = viewGroup.getChildCount() - (!z ? 1 : 0)) <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof oo) {
                arrayList.add(childAt);
            }
        }
        viewGroup.removeViews(0, childCount);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((oo) arrayList.get(i2)).c();
        }
        arrayList.clear();
    }

    public final void a(final ViewGroup viewGroup, final boolean z) {
        this.b.post(new Runnable() { // from class: yads.ik3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ik3.b(viewGroup, z);
            }
        });
    }
}
