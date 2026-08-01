package H;

import K.T;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import q1.AbstractC0352s;
import z.AbstractC0384b;
import z.C0383a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f538a;

    /* renamed from: b, reason: collision with root package name */
    public Object f539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f540c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f538a = i;
        this.f539b = obj;
        this.f540c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u1.g gVar;
        Object obj = this.f540c;
        switch (this.f538a) {
            case 0:
                B.b bVar = (B.b) ((A1.d) this.f539b).f38b;
                if (bVar != null) {
                    bVar.h((Typeface) obj);
                    return;
                }
                return;
            case 1:
                ((g) this.f539b).a(obj);
                return;
            case 2:
                int i = 0;
                do {
                    try {
                        ((Runnable) this.f539b).run();
                    } catch (Throwable th) {
                        AbstractC0352s.d(Z0.j.f1558a, th);
                    }
                    gVar = (u1.g) obj;
                    Runnable F = gVar.F();
                    if (F == null) {
                        return;
                    }
                    this.f539b = F;
                    i++;
                } while (i < 16);
                w1.l lVar = gVar.f4186c;
                lVar.getClass();
                lVar.D(gVar, this);
                return;
            case 3:
                T.e eVar = ((SwipeDismissBehavior) obj).f2137a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = T.f633a;
                ((View) this.f539b).postOnAnimation(this);
                return;
            case 4:
                ((C0383a) this.f539b).f4654a = obj;
                return;
            case 5:
                ((Application) this.f539b).unregisterActivityLifecycleCallbacks((C0383a) obj);
                return;
            default:
                try {
                    Method method = AbstractC0384b.d;
                    Object obj2 = this.f539b;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0384b.f4662e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
        }
    }

    public a(u1.g gVar, Runnable runnable) {
        this.f538a = 2;
        this.f540c = gVar;
        this.f539b = runnable;
    }

    public a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f538a = 3;
        this.f540c = swipeDismissBehavior;
        this.f539b = view;
    }
}
