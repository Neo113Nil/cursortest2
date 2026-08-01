package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class d1 implements InterfaceC0248m0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2976a;

    /* renamed from: b, reason: collision with root package name */
    public int f2977b;

    /* renamed from: c, reason: collision with root package name */
    public View f2978c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2979e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2980f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2981g;
    public CharSequence h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2982j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2983k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2984l;

    /* renamed from: m, reason: collision with root package name */
    public C0243k f2985m;

    /* renamed from: n, reason: collision with root package name */
    public int f2986n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2987o;

    public final void a(int i) {
        View view;
        int i2 = this.f2977b ^ i;
        this.f2977b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i3 = this.f2977b & 4;
                Toolbar toolbar = this.f2976a;
                if (i3 != 0) {
                    Drawable drawable = this.f2980f;
                    if (drawable == null) {
                        drawable = this.f2987o;
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
            Toolbar toolbar2 = this.f2976a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f2978c) == null) {
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
        if ((this.f2977b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f2982j);
            Toolbar toolbar = this.f2976a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f2986n);
            } else {
                toolbar.setNavigationContentDescription(this.f2982j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f2977b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f2979e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f2976a.setLogo(drawable);
    }
}
