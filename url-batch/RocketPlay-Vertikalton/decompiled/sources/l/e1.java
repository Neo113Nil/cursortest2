package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class e1 implements InterfaceC0264m0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f3414a;

    /* renamed from: b, reason: collision with root package name */
    public int f3415b;

    /* renamed from: c, reason: collision with root package name */
    public View f3416c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3417e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3418f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3419g;
    public CharSequence h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3420j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f3421k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3422l;

    /* renamed from: m, reason: collision with root package name */
    public C0259k f3423m;

    /* renamed from: n, reason: collision with root package name */
    public int f3424n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f3425o;

    public final void a(int i) {
        View view;
        int i2 = this.f3415b ^ i;
        this.f3415b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i3 = this.f3415b & 4;
                Toolbar toolbar = this.f3414a;
                if (i3 != 0) {
                    Drawable drawable = this.f3418f;
                    if (drawable == null) {
                        drawable = this.f3425o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                c();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.f3414a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f3416c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f3415b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f3420j);
            Toolbar toolbar = this.f3414a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3424n);
            } else {
                toolbar.setNavigationContentDescription(this.f3420j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f3415b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f3417e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f3414a.setLogo(drawable);
    }
}
