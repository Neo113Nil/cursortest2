package j;

import K.C0001a0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2595c;
    public q1.l d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2596e;

    /* renamed from: b, reason: collision with root package name */
    public long f2594b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2597f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2593a = new ArrayList();

    public final void a() {
        if (this.f2596e) {
            Iterator it = this.f2593a.iterator();
            while (it.hasNext()) {
                ((C0001a0) it.next()).b();
            }
            this.f2596e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2596e) {
            return;
        }
        Iterator it = this.f2593a.iterator();
        while (it.hasNext()) {
            C0001a0 c0001a0 = (C0001a0) it.next();
            long j2 = this.f2594b;
            if (j2 >= 0) {
                c0001a0.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2595c;
            if (baseInterpolator != null && (view = (View) c0001a0.f391a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                c0001a0.d(this.f2597f);
            }
            View view2 = (View) c0001a0.f391a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2596e = true;
    }
}
