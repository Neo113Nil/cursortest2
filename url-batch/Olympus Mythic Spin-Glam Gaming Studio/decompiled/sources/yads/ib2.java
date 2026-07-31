package yads;

import android.content.Context;

/* loaded from: classes12.dex */
public final class ib2 implements ig0 {
    public final int a;

    public ib2(int i) {
        this.a = i;
    }

    @Override // yads.ig0
    public final boolean a(Context context) {
        return this.a == context.getResources().getConfiguration().orientation;
    }
}
