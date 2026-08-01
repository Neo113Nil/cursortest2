package H;

import K.f0;
import K.j0;
import X.C0040i;
import X.U;
import X.V;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f228b;

    /* renamed from: c, reason: collision with root package name */
    public Object f229c;
    public Object d;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f227a) {
            case 0:
                try {
                    obj = ((f) this.f228b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new a((g) this.f229c, 1, obj));
                break;
            case 1:
                f0.h((View) this.f228b, (B.j) this.f229c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f228b;
                U u2 = (U) this.f229c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0040i) this.d).getClass();
                    V.a(u2.f877c.f956E, u2.f875a);
                    break;
                }
                break;
        }
    }

    public n(C0040i c0040i, ArrayList arrayList, U u2) {
        this.d = c0040i;
        this.f228b = arrayList;
        this.f229c = u2;
    }

    public n(View view, j0 j0Var, B.j jVar, ValueAnimator valueAnimator) {
        this.f228b = view;
        this.f229c = jVar;
        this.d = valueAnimator;
    }
}
