package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

/* loaded from: classes4.dex */
public final class tl {
    public final Context a;
    public final ViewGroup b;
    public final qd1 c;
    public final od1 d;
    public final sl e;

    public tl(Context context, ViewGroup viewGroup, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        qd1 qd1Var = new qd1(list);
        od1 od1Var = new od1();
        sl slVar = new sl(onPreDrawListener);
        this.a = context;
        this.b = viewGroup;
        this.c = qd1Var;
        this.d = od1Var;
        this.e = slVar;
    }
}
