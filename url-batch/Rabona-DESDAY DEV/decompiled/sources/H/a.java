package H;

import K.T;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import z.AbstractC0346b;
import z.C0345a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f206c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f204a = i;
        this.f205b = obj;
        this.f206c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f205b;
        Object obj2 = this.f206c;
        switch (this.f204a) {
            case 0:
                B.b bVar = (B.b) ((B0.d) obj).f59b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((g) obj).a(obj2);
                return;
            case 2:
                S.e eVar = ((SwipeDismissBehavior) obj2).f1537a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = T.f381a;
                ((View) obj).postOnAnimation(this);
                return;
            case 3:
                ((C0345a) obj).f4200a = obj2;
                return;
            case 4:
                ((Application) obj).unregisterActivityLifecycleCallbacks((C0345a) obj2);
                return;
            default:
                try {
                    Method method = AbstractC0346b.d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0346b.f4208e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
        }
    }

    public a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f204a = 2;
        this.f206c = swipeDismissBehavior;
        this.f205b = view;
    }
}
