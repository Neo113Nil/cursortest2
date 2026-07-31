package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public final class i12 {
    public final ry1 a;
    public final ri2 b;
    public final v72 c;
    public final z21 d;
    public final x31 e;
    public final yy1 f;
    public final CopyOnWriteArraySet g;

    public i12(Context context, ry1 ry1Var, ri2 ri2Var, v72 v72Var) {
        z21 z21Var = new z21(context);
        x31 x31Var = new x31();
        yy1 yy1Var = new yy1(ri2Var, context.getResources());
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.a = ry1Var;
        this.b = ri2Var;
        this.c = v72Var;
        this.d = z21Var;
        this.e = x31Var;
        this.f = yy1Var;
        this.g = copyOnWriteArraySet;
    }
}
