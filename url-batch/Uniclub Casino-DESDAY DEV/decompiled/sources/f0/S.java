package f0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f1990a;

    /* renamed from: b, reason: collision with root package name */
    public int f1991b;

    /* renamed from: c, reason: collision with root package name */
    public int f1992c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f1993e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1994f;

    /* renamed from: g, reason: collision with root package name */
    public int f1995g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.M(i);
            this.f1994f = false;
            return;
        }
        if (!this.f1994f) {
            this.f1995g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f1993e;
        if (baseInterpolator != null && this.f1992c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f1992c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1434W.b(this.f1990a, this.f1991b, i2, baseInterpolator);
        int i3 = this.f1995g + 1;
        this.f1995g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f1994f = false;
    }
}
