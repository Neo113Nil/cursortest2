package l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3161a;

    /* renamed from: b, reason: collision with root package name */
    public m f3162b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3163c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3164e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3165f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3166g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3167j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3168k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3169l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3161a;
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
