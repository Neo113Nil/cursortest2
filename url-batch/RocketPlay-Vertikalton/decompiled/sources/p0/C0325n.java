package p0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: p0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3786a;

    /* renamed from: b, reason: collision with root package name */
    public C0324m f3787b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3788c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3789e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3790f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3791g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3792j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3793k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3794l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3786a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0327p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0327p(this);
    }
}
