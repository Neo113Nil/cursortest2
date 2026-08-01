package a;

import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.EnumC0071l;
import i0.C0141d;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1187b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1186a = i;
        this.f1187b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0071l enumC0071l) {
        Window window;
        View peekDecorView;
        switch (this.f1186a) {
            case 0:
                int i = ComponentActivity.f1237r;
                ComponentActivity componentActivity = (ComponentActivity) this.f1187b;
                g1.f.e(componentActivity, "this$0");
                if (enumC0071l == EnumC0071l.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                ComponentActivity componentActivity2 = (ComponentActivity) this.f1187b;
                int i2 = ComponentActivity.f1237r;
                g1.f.e(componentActivity2, "this$0");
                if (enumC0071l == EnumC0071l.ON_DESTROY) {
                    componentActivity2.f1238b.f1723b = null;
                    if (!componentActivity2.isChangingConfigurations()) {
                        componentActivity2.c().a();
                    }
                    i iVar = componentActivity2.f1241f;
                    ComponentActivity componentActivity3 = iVar.d;
                    componentActivity3.getWindow().getDecorView().removeCallbacks(iVar);
                    componentActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                C0141d c0141d = (C0141d) this.f1187b;
                g1.f.e(c0141d, "this$0");
                if (enumC0071l != EnumC0071l.ON_START) {
                    if (enumC0071l == EnumC0071l.ON_STOP) {
                        c0141d.f2613c = false;
                        break;
                    }
                } else {
                    c0141d.f2613c = true;
                    break;
                }
                break;
        }
    }
}
