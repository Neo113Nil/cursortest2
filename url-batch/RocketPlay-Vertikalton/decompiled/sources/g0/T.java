package g0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public int f2806a;

    /* renamed from: b, reason: collision with root package name */
    public int f2807b;

    /* renamed from: c, reason: collision with root package name */
    public int f2808c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2809e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2810f;

    /* renamed from: g, reason: collision with root package name */
    public int f2811g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.P(i);
            this.f2810f = false;
            return;
        }
        if (!this.f2810f) {
            this.f2811g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2809e;
        if (baseInterpolator != null && this.f2808c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2808c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1982b0.c(this.f2806a, this.f2807b, i2, baseInterpolator);
        int i3 = this.f2811g + 1;
        this.f2811g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2810f = false;
    }
}
