package o;

import android.view.View;
import android.view.Window;

/* renamed from: o.Fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0135Fc implements InterfaceC0288Kz {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C0135Fc(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // o.InterfaceC0288Kz
    public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        Window window;
        View peekDecorView;
        switch (this.h) {
            case 0:
                AbstractActivityC0446Rc abstractActivityC0446Rc = (AbstractActivityC0446Rc) this.i;
                if (enumC0054Bz == EnumC0054Bz.ON_STOP && (window = abstractActivityC0446Rc.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0446Rc.b((AbstractActivityC0446Rc) this.i, interfaceC0365Nz, enumC0054Bz);
                break;
            default:
                KP kp = (KP) this.i;
                AbstractC0048Bt.n(kp, "this$0");
                if (enumC0054Bz != EnumC0054Bz.ON_START) {
                    if (enumC0054Bz == EnumC0054Bz.ON_STOP) {
                        kp.f = false;
                        break;
                    }
                } else {
                    kp.f = true;
                    break;
                }
                break;
        }
    }
}
