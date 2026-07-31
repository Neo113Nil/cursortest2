package yads;

import android.content.Context;

/* loaded from: classes14.dex */
public final class xj3 {
    public final zt3 a;
    public final v03 b;

    public xj3(zt3 zt3Var) {
        v03 v03Var = new v03();
        this.a = zt3Var;
        this.b = v03Var;
    }

    public final wj3 a(Context context, we3 we3Var, zf3 zf3Var) {
        tj3 tj3Var = new tj3(context);
        wh3 wh3Var = new wh3(context);
        py pyVar = new py();
        pyVar.a.add(new n20(we3Var.a, tj3Var, wh3Var));
        pyVar.a.add(new wg3(we3Var.b, tj3Var));
        yt3 yt3Var = this.a.a.a(context) ? new yt3(context, zf3Var, this.b.a(we3Var.a), we3Var.b.n) : null;
        if (yt3Var != null) {
            pyVar.a.add(yt3Var);
        }
        return new wj3(pyVar);
    }
}
