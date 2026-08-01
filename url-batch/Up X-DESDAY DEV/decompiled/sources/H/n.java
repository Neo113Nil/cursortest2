package H;

import K.g0;
import K.k0;
import X.C0041i;
import X.U;
import X.V;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f235b;

    /* renamed from: c, reason: collision with root package name */
    public Object f236c;
    public Object d;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f234a) {
            case 0:
                try {
                    obj = ((f) this.f235b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new a((g) this.f236c, 1, obj));
                break;
            case 1:
                g0.h((View) this.f235b, (B.j) this.f236c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f235b;
                U u2 = (U) this.f236c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0041i) this.d).getClass();
                    V.a(u2.f873c.f952E, u2.f871a);
                    break;
                }
                break;
        }
    }

    public n(C0041i c0041i, ArrayList arrayList, U u2) {
        this.d = c0041i;
        this.f235b = arrayList;
        this.f236c = u2;
    }

    public n(View view, k0 k0Var, B.j jVar, ValueAnimator valueAnimator) {
        this.f235b = view;
        this.f236c = jVar;
        this.d = valueAnimator;
    }
}
