package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class t00 extends t50 implements s00 {
    public c3 r;

    @Override // defpackage.s00
    public final boolean B(KeyEvent keyEvent) {
        c3 c3Var = this.r;
        if (c3Var != null) {
            return ((Boolean) c3Var.c(new q00(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.s00
    public final boolean g(KeyEvent keyEvent) {
        return false;
    }
}
