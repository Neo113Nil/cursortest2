package p0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3412a;

    /* renamed from: b, reason: collision with root package name */
    public m f3413b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3414c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3415e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3416f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3417g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3418j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3419k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3420l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3412a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
