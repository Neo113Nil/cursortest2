package yads;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class ne1 implements x3 {
    public final /* synthetic */ oe1 a;

    public ne1(oe1 oe1Var) {
        this.a = oe1Var;
    }

    @Override // yads.x3
    public final void a(int i, Bundle bundle) {
        if (i == 6) {
            this.a.a.onLeftApplication();
        } else if (i == 7) {
            this.a.a.onLeftApplication();
        } else {
            if (i != 9) {
                return;
            }
            this.a.a.onAdClicked();
        }
    }
}
