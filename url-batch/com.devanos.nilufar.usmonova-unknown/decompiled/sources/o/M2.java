package o;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class M2 extends AbstractC0511Tp implements InterfaceC2114vp {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.j = i3;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.j) {
            case 0:
                InterfaceC1455lp interfaceC1455lp = (InterfaceC1455lp) obj;
                YD yd = ((S2) this.receiver).v0;
                if (!yd.i(interfaceC1455lp)) {
                    yd.b(interfaceC1455lp);
                }
                return C0782bY.a;
            case 1:
                int i = ((C0146Fn) obj).a;
                S2 s2 = (S2) this.receiver;
                s2.getClass();
                if (i != 7 && i != 8) {
                    Integer R = AbstractC0946e20.R(i);
                    if (R == null) {
                        throw new IllegalStateException("Invalid focus direction");
                    }
                    int intValue = R.intValue();
                    C1032fM v = s2.v();
                    Rect Z = v != null ? AbstractC0868ct.Z(v) : null;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View findNextFocus = Z == null ? focusFinder.findNextFocus(s2, s2.findFocus(), intValue) : focusFinder.findNextFocusFromRect(s2, Z, intValue);
                    if (findNextFocus != null) {
                        z = AbstractC0946e20.H(findNextFocus, Integer.valueOf(intValue), Z);
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                ((AbstractC0179Gu) this.receiver).l((Throwable) obj);
                return C0782bY.a;
        }
    }
}
