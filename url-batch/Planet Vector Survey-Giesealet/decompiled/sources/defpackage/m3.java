package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class m3 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ n3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(n3 n3Var, int i) {
        super(1);
        this.e = i;
        this.f = n3Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        n3 n3Var = this.f;
        switch (i) {
            case 0:
                View view = n3Var.d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                co0 co0Var = (co0) obj;
                if (co0Var.e.contains(co0Var)) {
                    n3Var.d.getSnapshotObserver().a(co0Var, n3Var.P, new a3(1, co0Var, n3Var));
                }
                return ky0.a;
        }
    }
}
