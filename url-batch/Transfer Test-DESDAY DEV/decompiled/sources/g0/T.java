package g0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public int f2368a;

    /* renamed from: b, reason: collision with root package name */
    public int f2369b;

    /* renamed from: c, reason: collision with root package name */
    public int f2370c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2371e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2372f;

    /* renamed from: g, reason: collision with root package name */
    public int f2373g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.P(i);
            this.f2372f = false;
            return;
        }
        if (!this.f2372f) {
            this.f2373g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2371e;
        if (baseInterpolator != null && this.f2370c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2370c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1603b0.c(this.f2368a, this.f2369b, i2, baseInterpolator);
        int i3 = this.f2373g + 1;
        this.f2373g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2372f = false;
    }
}
