package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class of implements m20 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ of(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.m20
    public final void g(o20 o20Var, e20 e20Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                eb0 eb0Var = (eb0) obj2;
                zf zfVar = (zf) obj;
                if (e20Var == e20.ON_CREATE) {
                    onBackInvokedDispatcher = zfVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    eb0Var.b(onBackInvokedDispatcher);
                    break;
                }
                break;
            default:
                j50 j50Var = (j50) obj2;
                f20 f20Var = (f20) obj;
                j50Var.getClass();
                mf mfVar = j50Var.a;
                CopyOnWriteArrayList copyOnWriteArrayList = j50Var.b;
                e20.Companion.getClass();
                int ordinal = f20Var.ordinal();
                if (e20Var != (ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : e20.ON_RESUME : e20.ON_START : e20.ON_CREATE)) {
                    e20 e20Var2 = e20.ON_DESTROY;
                    if (e20Var != e20Var2) {
                        int ordinal2 = f20Var.ordinal();
                        if (ordinal2 != 2) {
                            e20Var2 = ordinal2 != 3 ? ordinal2 != 4 ? null : e20.ON_PAUSE : e20.ON_STOP;
                        }
                        if (e20Var == e20Var2) {
                            copyOnWriteArrayList.remove((Object) null);
                            mfVar.run();
                            break;
                        }
                    } else {
                        j50Var.a();
                        break;
                    }
                } else {
                    copyOnWriteArrayList.add(null);
                    mfVar.run();
                    break;
                }
                break;
        }
    }
}
