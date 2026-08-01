package j;

import K.Z;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2604c;
    public q1.l d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2605e;

    /* renamed from: b, reason: collision with root package name */
    public long f2603b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2606f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2602a = new ArrayList();

    public final void a() {
        if (this.f2605e) {
            Iterator it = this.f2602a.iterator();
            while (it.hasNext()) {
                ((Z) it.next()).b();
            }
            this.f2605e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2605e) {
            return;
        }
        Iterator it = this.f2602a.iterator();
        while (it.hasNext()) {
            Z z2 = (Z) it.next();
            long j2 = this.f2603b;
            if (j2 >= 0) {
                z2.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2604c;
            if (baseInterpolator != null && (view = (View) z2.f369a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                z2.d(this.f2606f);
            }
            View view2 = (View) z2.f369a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2605e = true;
    }
}
