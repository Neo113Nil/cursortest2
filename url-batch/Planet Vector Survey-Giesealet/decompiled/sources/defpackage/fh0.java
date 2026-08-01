package defpackage;

import android.view.ViewStructure;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fh0 extends v00 implements su {
    public final /* synthetic */ ViewStructure e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(ViewStructure viewStructure) {
        super(4);
        this.e = viewStructure;
    }

    @Override // defpackage.su
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue() - intValue2;
        this.e.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4);
        return ky0.a;
    }
}
