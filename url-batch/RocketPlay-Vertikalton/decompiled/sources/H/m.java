package H;

import E1.AbstractC0001b;
import K.i0;
import K.m0;
import Y.C0047i;
import Y.U;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f566a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f567b;

    /* renamed from: c, reason: collision with root package name */
    public Object f568c;
    public Object d;

    public /* synthetic */ m() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f566a) {
            case 0:
                try {
                    obj = ((f) this.f567b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new a((g) this.f568c, 1, obj));
                break;
            case 1:
                i0.h((View) this.f567b, (B.j) this.f568c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f567b;
                U u2 = (U) this.f568c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0047i) this.d).getClass();
                    AbstractC0001b.a(u2.f1407c.f1486E, u2.f1405a);
                    break;
                }
                break;
        }
    }

    public m(C0047i c0047i, ArrayList arrayList, U u2) {
        this.d = c0047i;
        this.f567b = arrayList;
        this.f568c = u2;
    }

    public m(View view, m0 m0Var, B.j jVar, ValueAnimator valueAnimator) {
        this.f567b = view;
        this.f568c = jVar;
        this.d = valueAnimator;
    }
}
