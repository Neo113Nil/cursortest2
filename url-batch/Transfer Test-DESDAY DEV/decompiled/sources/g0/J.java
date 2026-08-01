package g0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class J extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public Z f2351a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2352b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2353c;
    public boolean d;

    public J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2352b = new Rect();
        this.f2353c = true;
        this.d = false;
    }

    public J(int i, int i2) {
        super(i, i2);
        this.f2352b = new Rect();
        this.f2353c = true;
        this.d = false;
    }

    public J(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2352b = new Rect();
        this.f2353c = true;
        this.d = false;
    }

    public J(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2352b = new Rect();
        this.f2353c = true;
        this.d = false;
    }

    public J(J j2) {
        super((ViewGroup.LayoutParams) j2);
        this.f2352b = new Rect();
        this.f2353c = true;
        this.d = false;
    }
}
