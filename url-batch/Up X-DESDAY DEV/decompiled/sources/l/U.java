package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class U extends B.b {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2914j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z f2915k;

    public U(Z z2, int i, int i2, WeakReference weakReference) {
        this.f2915k = z2;
        this.h = i;
        this.i = i2;
        this.f2914j = weakReference;
    }

    @Override // B.b
    public final void g(int i) {
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.h) != -1) {
            typeface = Y.a(typeface, i, (this.i & 2) != 0);
        }
        Z z2 = this.f2915k;
        if (z2.f2934m) {
            z2.f2933l = typeface;
            TextView textView = (TextView) this.f2914j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new V(textView, typeface, z2.f2931j));
                } else {
                    textView.setTypeface(typeface, z2.f2931j);
                }
            }
        }
    }
}
