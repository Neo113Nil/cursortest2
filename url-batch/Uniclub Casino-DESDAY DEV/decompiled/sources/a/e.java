package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.InterfaceC0072p;
import g.AbstractActivityC0138i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0072p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1042b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1041a = i;
        this.f1042b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0072p
    public final void e(androidx.lifecycle.r rVar, EnumC0068l enumC0068l) {
        Window window;
        View peekDecorView;
        switch (this.f1041a) {
            case 0:
                AbstractActivityC0138i abstractActivityC0138i = (AbstractActivityC0138i) this.f1042b;
                if (enumC0068l == EnumC0068l.ON_STOP && (window = abstractActivityC0138i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0138i abstractActivityC0138i2 = (AbstractActivityC0138i) this.f1042b;
                if (enumC0068l == EnumC0068l.ON_DESTROY) {
                    abstractActivityC0138i2.f1060b.f1501b = null;
                    if (!abstractActivityC0138i2.isChangingConfigurations()) {
                        abstractActivityC0138i2.c().a();
                    }
                    i iVar = abstractActivityC0138i2.f1063f;
                    AbstractActivityC0138i abstractActivityC0138i3 = iVar.d;
                    abstractActivityC0138i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0138i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                h0.d dVar = (h0.d) this.f1042b;
                X0.d.e(dVar, "this$0");
                if (enumC0068l != EnumC0068l.ON_START) {
                    if (enumC0068l == EnumC0068l.ON_STOP) {
                        dVar.f2378c = false;
                        break;
                    }
                } else {
                    dVar.f2378c = true;
                    break;
                }
                break;
        }
    }
}
