package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class ey implements ig0 {
    public final ig0[] a;

    public ey(ig0... ig0VarArr) {
        this.a = ig0VarArr;
    }

    @Override // yads.ig0
    public final boolean a(Context context) {
        for (ig0 ig0Var : this.a) {
            if (!ig0Var.a(context)) {
                return false;
            }
        }
        return true;
    }
}
