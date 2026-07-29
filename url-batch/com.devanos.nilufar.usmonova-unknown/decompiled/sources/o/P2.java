package o;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class P2 extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ S2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P2(S2 s2, int i) {
        super(1);
        this.h = i;
        this.i = s2;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        C0146Fn c0146Fn;
        switch (this.h) {
            case 0:
                KeyEvent keyEvent = ((C0078Cx) obj).a;
                long f = PX.f(keyEvent.getKeyCode());
                if (AbstractC2254xx.a(f, AbstractC2254xx.g)) {
                    c0146Fn = new C0146Fn(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (AbstractC2254xx.a(f, AbstractC2254xx.e)) {
                    c0146Fn = new C0146Fn(4);
                } else if (AbstractC2254xx.a(f, AbstractC2254xx.d)) {
                    c0146Fn = new C0146Fn(3);
                } else {
                    c0146Fn = AbstractC2254xx.a(f, AbstractC2254xx.b) ? true : AbstractC2254xx.a(f, AbstractC2254xx.j) ? new C0146Fn(5) : AbstractC2254xx.a(f, AbstractC2254xx.c) ? true : AbstractC2254xx.a(f, AbstractC2254xx.k) ? new C0146Fn(6) : AbstractC2254xx.a(f, AbstractC2254xx.f) ? true : AbstractC2254xx.a(f, AbstractC2254xx.h) ? true : AbstractC2254xx.a(f, AbstractC2254xx.l) ? new C0146Fn(7) : AbstractC2254xx.a(f, AbstractC2254xx.a) ? true : AbstractC2254xx.a(f, AbstractC2254xx.i) ? new C0146Fn(8) : null;
                }
                if (c0146Fn != null) {
                    int i = c0146Fn.a;
                    int action = keyEvent.getAction();
                    if ((action != 0 ? action != 1 ? (char) 0 : (char) 1 : (char) 2) == 2) {
                        S2 s2 = this.i;
                        C1032fM v = s2.v();
                        Boolean c = ((androidx.compose.ui.focus.a) s2.getFocusOwner()).c(i, v, new UY(11, c0146Fn));
                        if (c != null ? c.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i == 1 || i == 2)) {
                            return Boolean.FALSE;
                        }
                        Integer R = AbstractC0946e20.R(i);
                        if (R == null) {
                            throw new IllegalStateException("Invalid focus direction");
                        }
                        int intValue = R.intValue();
                        Rect Z = v != null ? AbstractC0868ct.Z(v) : null;
                        if (Z == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        View view = s2;
                        while (true) {
                            if (view != null) {
                                FocusFinder focusFinder = FocusFinder.getInstance();
                                View rootView = s2.getRootView();
                                AbstractC0048Bt.l(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                                if (view != null) {
                                    if (!view.equals(s2)) {
                                        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                            if (parent == s2) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                view = null;
                            }
                        }
                        if (AbstractC0048Bt.h(view, s2)) {
                            view = null;
                        }
                        if (view != null && AbstractC0946e20.H(view, Integer.valueOf(intValue), Z)) {
                            return Boolean.TRUE;
                        }
                        if (!((androidx.compose.ui.focus.a) s2.getFocusOwner()).a(i, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean c2 = ((androidx.compose.ui.focus.a) s2.getFocusOwner()).c(i, null, new UY(10, c0146Fn));
                        return Boolean.valueOf(c2 != null ? c2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            default:
                InterfaceC1455lp interfaceC1455lp = (InterfaceC1455lp) obj;
                S2 s22 = this.i;
                Handler handler = s22.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1455lp.invoke();
                } else {
                    Handler handler2 = s22.getHandler();
                    if (handler2 != null) {
                        handler2.post(new D1(2, interfaceC1455lp));
                    }
                }
                return C0782bY.a;
        }
    }
}
