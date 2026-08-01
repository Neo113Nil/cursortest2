package j;

import K.c0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2676c;
    public A.c d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2677e;

    /* renamed from: b, reason: collision with root package name */
    public long f2675b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2678f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2674a = new ArrayList();

    public final void a() {
        if (this.f2677e) {
            Iterator it = this.f2674a.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).b();
            }
            this.f2677e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2677e) {
            return;
        }
        Iterator it = this.f2674a.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            long j2 = this.f2675b;
            if (j2 >= 0) {
                c0Var.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2676c;
            if (baseInterpolator != null && (view = (View) c0Var.f390a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                c0Var.d(this.f2678f);
            }
            View view2 = (View) c0Var.f390a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2677e = true;
    }
}
