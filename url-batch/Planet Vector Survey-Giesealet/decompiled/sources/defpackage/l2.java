package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class l2 extends v00 implements su {
    public final /* synthetic */ m2 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, int i) {
        super(4);
        this.e = m2Var;
        this.f = i;
    }

    @Override // defpackage.su
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        m2 m2Var = this.e;
        p01 p01Var = m2Var.a;
        ((AutofillManager) p01Var.e).notifyViewEntered(m2Var.c, this.f, new Rect(intValue, intValue2, intValue3, intValue4));
        return ky0.a;
    }
}
