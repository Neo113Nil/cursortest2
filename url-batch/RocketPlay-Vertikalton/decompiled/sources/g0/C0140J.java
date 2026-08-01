package g0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: g0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0140J extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public Z f2789a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2790b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2791c;
    public boolean d;

    public C0140J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2790b = new Rect();
        this.f2791c = true;
        this.d = false;
    }

    public C0140J(int i, int i2) {
        super(i, i2);
        this.f2790b = new Rect();
        this.f2791c = true;
        this.d = false;
    }

    public C0140J(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2790b = new Rect();
        this.f2791c = true;
        this.d = false;
    }

    public C0140J(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2790b = new Rect();
        this.f2791c = true;
        this.d = false;
    }

    public C0140J(C0140J c0140j) {
        super((ViewGroup.LayoutParams) c0140j);
        this.f2790b = new Rect();
        this.f2791c = true;
        this.d = false;
    }
}
