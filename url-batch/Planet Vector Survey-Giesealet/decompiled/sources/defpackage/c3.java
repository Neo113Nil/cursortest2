package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class c3 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ f3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(f3 f3Var, int i) {
        super(1);
        this.e = i;
        this.f = f3Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        bs bsVar;
        boolean requestFocus;
        int i = this.e;
        f3 f3Var = this.f;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((q00) obj).a;
                long f = x40.f(keyEvent.getKeyCode());
                if (p00.a(f, p00.c)) {
                    bsVar = new bs(2);
                } else if (p00.a(f, p00.d)) {
                    bsVar = new bs(1);
                } else if (p00.a(f, p00.j)) {
                    bsVar = new bs(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    bsVar = p00.a(f, p00.h) ? new bs(4) : p00.a(f, p00.g) ? new bs(3) : (p00.a(f, p00.e) || p00.a(f, p00.m)) ? new bs(5) : (p00.a(f, p00.f) || p00.a(f, p00.n)) ? new bs(6) : (p00.a(f, p00.i) || p00.a(f, p00.k) || p00.a(f, p00.o)) ? new bs(7) : (p00.a(f, p00.b) || p00.a(f, p00.l)) ? new bs(8) : null;
                }
                if (bsVar != null) {
                    int i2 = bsVar.a;
                    if (d31.z(keyEvent) == 2) {
                        Integer L = nk.L(i2);
                        zi0 embeddedViewFocusRect = f3Var.getEmbeddedViewFocusRect();
                        Boolean e = ((ks) f3Var.getFocusOwner()).e(i2, embeddedViewFocusRect, new cz0(bsVar, 16));
                        if (e != null ? e.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i2 == 1 || i2 == 2)) {
                            return Boolean.FALSE;
                        }
                        if (L != null) {
                            int intValue = L.intValue();
                            Object obj2 = es.f.get();
                            obj2.getClass();
                            es esVar = (es) obj2;
                            View view = f3Var;
                            while (true) {
                                if (view != null) {
                                    View rootView = f3Var.getRootView();
                                    rootView.getClass();
                                    view = esVar.b((ViewGroup) rootView, view, intValue);
                                    if (view != null) {
                                        if (!view.equals(f3Var)) {
                                            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == f3Var) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    view = null;
                                }
                            }
                            if (nz.l(view, f3Var)) {
                                view = null;
                            }
                            if (view != null) {
                                Rect rect = embeddedViewFocusRect != null ? new Rect((int) embeddedViewFocusRect.a, (int) embeddedViewFocusRect.b, (int) embeddedViewFocusRect.c, (int) embeddedViewFocusRect.d) : null;
                                if (rect == null) {
                                    g8.s("Invalid rect");
                                    return null;
                                }
                                View rootView2 = f3Var.getRootView();
                                rootView2.getClass();
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(f3Var, rect);
                                viewGroup.offsetRectIntoDescendantCoords(view, rect);
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup2 = (ViewGroup) view;
                                    if (viewGroup2.isFocused()) {
                                        requestFocus = true;
                                    } else if (viewGroup2.isFocusable() && !viewGroup2.hasFocus()) {
                                        requestFocus = viewGroup2.requestFocus(L.intValue(), rect);
                                    } else if (view instanceof f3) {
                                        requestFocus = ((f3) view).requestFocus(L.intValue(), rect);
                                    } else {
                                        View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup2, rect, L.intValue());
                                        int intValue2 = L.intValue();
                                        requestFocus = findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(intValue2, rect) : viewGroup2.requestFocus(intValue2, rect);
                                    }
                                } else {
                                    requestFocus = view.requestFocus(L.intValue(), rect);
                                }
                                if (requestFocus) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((ks) f3Var.getFocusOwner()).b(i2, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean e2 = ((ks) f3Var.getFocusOwner()).e(i2, null, new cz0(bsVar, 15));
                        return Boolean.valueOf(e2 != null ? e2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            default:
                bu buVar = (bu) obj;
                Handler handler = f3Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    buVar.a();
                } else {
                    Handler handler2 = f3Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new x1(buVar, 1));
                    }
                }
                return ky0.a;
        }
    }
}
