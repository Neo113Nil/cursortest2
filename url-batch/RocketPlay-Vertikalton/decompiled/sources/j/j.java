package j;

import K.C0010c0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f3107c;
    public F1.d d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3108e;

    /* renamed from: b, reason: collision with root package name */
    public long f3106b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f3109f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3105a = new ArrayList();

    public final void a() {
        if (this.f3108e) {
            Iterator it = this.f3105a.iterator();
            while (it.hasNext()) {
                ((C0010c0) it.next()).b();
            }
            this.f3108e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f3108e) {
            return;
        }
        Iterator it = this.f3105a.iterator();
        while (it.hasNext()) {
            C0010c0 c0010c0 = (C0010c0) it.next();
            long j2 = this.f3106b;
            if (j2 >= 0) {
                c0010c0.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f3107c;
            if (baseInterpolator != null && (view = (View) c0010c0.f652a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                c0010c0.d(this.f3109f);
            }
            View view2 = (View) c0010c0.f652a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3108e = true;
    }
}
