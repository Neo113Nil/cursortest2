package yads;

import android.view.WindowManager;

/* loaded from: classes13.dex */
public final class bi3 implements ai3 {
    public final WindowManager a;

    public bi3(WindowManager windowManager) {
        this.a = windowManager;
    }

    @Override // yads.ai3
    public final void a() {
    }

    @Override // yads.ai3
    public final void a(zh3 zh3Var) {
        zh3Var.a(this.a.getDefaultDisplay());
    }
}
