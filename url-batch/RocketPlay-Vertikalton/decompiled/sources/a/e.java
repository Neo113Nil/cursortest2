package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0079l;
import g.AbstractActivityC0129i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1566b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1565a = i;
        this.f1566b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0079l enumC0079l) {
        Window window;
        View peekDecorView;
        switch (this.f1565a) {
            case 0:
                AbstractActivityC0129i abstractActivityC0129i = (AbstractActivityC0129i) this.f1566b;
                if (enumC0079l == EnumC0079l.ON_STOP && (window = abstractActivityC0129i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0129i abstractActivityC0129i2 = (AbstractActivityC0129i) this.f1566b;
                if (enumC0079l == EnumC0079l.ON_DESTROY) {
                    abstractActivityC0129i2.f1584b.f2100b = null;
                    if (!abstractActivityC0129i2.isChangingConfigurations()) {
                        abstractActivityC0129i2.c().a();
                    }
                    i iVar = abstractActivityC0129i2.f1587f;
                    AbstractActivityC0129i abstractActivityC0129i3 = iVar.d;
                    abstractActivityC0129i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0129i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                i0.d dVar = (i0.d) this.f1566b;
                i1.f.e(dVar, "this$0");
                if (enumC0079l != EnumC0079l.ON_START) {
                    if (enumC0079l == EnumC0079l.ON_STOP) {
                        dVar.f3033c = false;
                        break;
                    }
                } else {
                    dVar.f3033c = true;
                    break;
                }
                break;
        }
    }
}
