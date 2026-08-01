package p0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: p0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327p extends AbstractC0318g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3796j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0325n f3797b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3798c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3799e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3800f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3801g;
    public final Matrix h;
    public final Rect i;

    public C0327p() {
        this.f3800f = true;
        this.f3801g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        C0325n c0325n = new C0325n();
        c0325n.f3788c = null;
        c0325n.d = f3796j;
        c0325n.f3787b = new C0324m();
        this.f3797b = c0325n;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3753a;
        if (drawable == null) {
            return false;
        }
        D.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.f3798c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3801g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != RecyclerView.f1949A0 || abs4 != RecyclerView.f1949A0) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && D.b.a(this) == 1) {
            canvas.translate(rect.width(), RecyclerView.f1949A0);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0325n c0325n = this.f3797b;
        Bitmap bitmap = c0325n.f3790f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0325n.f3790f.getHeight()) {
            c0325n.f3790f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0325n.f3793k = true;
        }
        if (this.f3800f) {
            C0325n c0325n2 = this.f3797b;
            if (c0325n2.f3793k || c0325n2.f3791g != c0325n2.f3788c || c0325n2.h != c0325n2.d || c0325n2.f3792j != c0325n2.f3789e || c0325n2.i != c0325n2.f3787b.getRootAlpha()) {
                C0325n c0325n3 = this.f3797b;
                c0325n3.f3790f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0325n3.f3790f);
                C0324m c0324m = c0325n3.f3787b;
                c0324m.a(c0324m.f3779g, C0324m.f3773p, canvas2, min, min2);
                C0325n c0325n4 = this.f3797b;
                c0325n4.f3791g = c0325n4.f3788c;
                c0325n4.h = c0325n4.d;
                c0325n4.i = c0325n4.f3787b.getRootAlpha();
                c0325n4.f3792j = c0325n4.f3789e;
                c0325n4.f3793k = false;
            }
        } else {
            C0325n c0325n5 = this.f3797b;
            c0325n5.f3790f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0325n5.f3790f);
            C0324m c0324m2 = c0325n5.f3787b;
            c0324m2.a(c0324m2.f3779g, C0324m.f3773p, canvas3, min, min2);
        }
        C0325n c0325n6 = this.f3797b;
        if (c0325n6.f3787b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0325n6.f3794l == null) {
                Paint paint2 = new Paint();
                c0325n6.f3794l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0325n6.f3794l.setAlpha(c0325n6.f3787b.getRootAlpha());
            c0325n6.f3794l.setColorFilter(colorFilter);
            paint = c0325n6.f3794l;
        }
        canvas.drawBitmap(c0325n6.f3790f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.getAlpha() : this.f3797b.f3787b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3797b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3753a;
        return drawable != null ? D.a.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3753a != null) {
            return new C0326o(this.f3753a.getConstantState());
        }
        this.f3797b.f3786a = getChangingConfigurations();
        return this.f3797b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3797b.f3787b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3797b.f3787b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3797b.f3789e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0325n c0325n = this.f3797b;
            if (c0325n != null) {
                C0324m c0324m = c0325n.f3787b;
                if (c0324m.f3784n == null) {
                    c0324m.f3784n = Boolean.valueOf(c0324m.f3779g.a());
                }
                if (c0324m.f3784n.booleanValue() || ((colorStateList = this.f3797b.f3788c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3799e && super.mutate() == this) {
            C0325n c0325n = this.f3797b;
            C0325n c0325n2 = new C0325n();
            c0325n2.f3788c = null;
            c0325n2.d = f3796j;
            if (c0325n != null) {
                c0325n2.f3786a = c0325n.f3786a;
                C0324m c0324m = new C0324m(c0325n.f3787b);
                c0325n2.f3787b = c0324m;
                if (c0325n.f3787b.f3777e != null) {
                    c0324m.f3777e = new Paint(c0325n.f3787b.f3777e);
                }
                if (c0325n.f3787b.d != null) {
                    c0325n2.f3787b.d = new Paint(c0325n.f3787b.d);
                }
                c0325n2.f3788c = c0325n.f3788c;
                c0325n2.d = c0325n.d;
                c0325n2.f3789e = c0325n.f3789e;
            }
            this.f3797b = c0325n2;
            this.f3799e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0325n c0325n = this.f3797b;
        ColorStateList colorStateList = c0325n.f3788c;
        if (colorStateList == null || (mode = c0325n.d) == null) {
            z2 = false;
        } else {
            this.f3798c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0324m c0324m = c0325n.f3787b;
        if (c0324m.f3784n == null) {
            c0324m.f3784n = Boolean.valueOf(c0324m.f3779g.a());
        }
        if (c0324m.f3784n.booleanValue()) {
            boolean b2 = c0325n.f3787b.f3779g.b(iArr);
            c0325n.f3793k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3797b.f3787b.getRootAlpha() != i) {
            this.f3797b.f3787b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3797b.f3789e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            F1.l.l0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
            return;
        }
        C0325n c0325n = this.f3797b;
        if (c0325n.f3788c != colorStateList) {
            c0325n.f3788c = colorStateList;
            this.f3798c = a(colorStateList, c0325n.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            D.a.i(drawable, mode);
            return;
        }
        C0325n c0325n = this.f3797b;
        if (c0325n.d != mode) {
            c0325n.d = mode;
            this.f3798c = a(c0325n.f3788c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0324m c0324m;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0325n c0325n = this.f3797b;
        c0325n.f3787b = new C0324m();
        TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0312a.f3738a);
        C0325n c0325n2 = this.f3797b;
        C0324m c0324m2 = c0325n2.f3787b;
        int i4 = !B.b.c(xmlPullParser, "tintMode") ? -1 : f2.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0325n2.d = mode;
        int i6 = 1;
        ColorStateList colorStateList = null;
        boolean z4 = false;
        if (B.b.c(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            f2.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 >= 28 && i7 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f2.getResources();
                int resourceId = f2.getResourceId(1, 0);
                ThreadLocal threadLocal = B.c.f58a;
                try {
                    colorStateList = B.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0325n2.f3788c = colorStateList2;
        }
        boolean z5 = c0325n2.f3789e;
        if (B.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        c0325n2.f3789e = z5;
        float f3 = c0324m2.f3780j;
        if (B.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        c0324m2.f3780j = f3;
        float f4 = c0324m2.f3781k;
        if (B.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        c0324m2.f3781k = f4;
        if (c0324m2.f3780j <= RecyclerView.f1949A0) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > RecyclerView.f1949A0) {
            c0324m2.h = f2.getDimension(3, c0324m2.h);
            float dimension = f2.getDimension(2, c0324m2.i);
            c0324m2.i = dimension;
            if (c0324m2.h <= RecyclerView.f1949A0) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > RecyclerView.f1949A0) {
                float alpha = c0324m2.getAlpha();
                if (B.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0324m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0324m2.f3783m = string;
                    c0324m2.f3785o.put(string, c0324m2);
                }
                f2.recycle();
                c0325n.f3786a = getChangingConfigurations();
                c0325n.f3793k = true;
                C0325n c0325n3 = this.f3797b;
                C0324m c0324m3 = c0325n3.f3787b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0324m3.f3779g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0321j c0321j = (C0321j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        o.b bVar = c0324m3.f3785o;
                        if (equals) {
                            C0320i c0320i = new C0320i();
                            c0320i.f3754e = RecyclerView.f1949A0;
                            c0320i.f3756g = 1.0f;
                            c0320i.h = 1.0f;
                            c0320i.i = RecyclerView.f1949A0;
                            c0320i.f3757j = 1.0f;
                            c0320i.f3758k = RecyclerView.f1949A0;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0320i.f3759l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c0320i.f3760m = join3;
                            c0324m = c0324m3;
                            c0320i.f3761n = 4.0f;
                            TypedArray f5 = B.b.f(resources, theme, attributeSet, AbstractC0312a.f3740c);
                            if (B.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    c0320i.f3771b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    c0320i.f3770a = F1.l.u(string3);
                                }
                                c0320i.f3755f = B.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = c0320i.h;
                                if (B.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                c0320i.h = f6;
                                int i8 = !B.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = c0320i.f3759l;
                                if (i8 != 0) {
                                    join = join3;
                                    if (i8 != 1) {
                                        cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                c0320i.f3759l = cap;
                                int i9 = !B.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = c0320i.f3760m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c0320i.f3760m = join2;
                                float f7 = c0320i.f3761n;
                                if (B.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                c0320i.f3761n = f7;
                                c0320i.d = B.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = c0320i.f3756g;
                                if (B.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                c0320i.f3756g = f8;
                                float f9 = c0320i.f3754e;
                                if (B.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                c0320i.f3754e = f9;
                                float f10 = c0320i.f3757j;
                                if (B.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                c0320i.f3757j = f10;
                                float f11 = c0320i.f3758k;
                                if (B.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                c0320i.f3758k = f11;
                                float f12 = c0320i.i;
                                if (B.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                c0320i.i = f12;
                                int i10 = c0320i.f3772c;
                                if (B.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                c0320i.f3772c = i10;
                            }
                            f5.recycle();
                            c0321j.f3763b.add(c0320i);
                            if (c0320i.getPathName() != null) {
                                bVar.put(c0320i.getPathName(), c0320i);
                            }
                            c0325n3.f3786a = c0325n3.f3786a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c0324m = c0324m3;
                            if ("clip-path".equals(name)) {
                                C0319h c0319h = new C0319h();
                                if (B.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = B.b.f(resources, theme, attributeSet, AbstractC0312a.d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        c0319h.f3771b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        c0319h.f3770a = F1.l.u(string5);
                                    }
                                    c0319h.f3772c = !B.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0321j.f3763b.add(c0319h);
                                if (c0319h.getPathName() != null) {
                                    bVar.put(c0319h.getPathName(), c0319h);
                                }
                                c0325n3.f3786a = c0325n3.f3786a;
                            } else if ("group".equals(name)) {
                                C0321j c0321j2 = new C0321j();
                                TypedArray f14 = B.b.f(resources, theme, attributeSet, AbstractC0312a.f3739b);
                                float f15 = c0321j2.f3764c;
                                if (B.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0321j2.f3764c = f15;
                                i2 = 1;
                                c0321j2.d = f14.getFloat(1, c0321j2.d);
                                c0321j2.f3765e = f14.getFloat(2, c0321j2.f3765e);
                                float f16 = c0321j2.f3766f;
                                if (B.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0321j2.f3766f = f16;
                                float f17 = c0321j2.f3767g;
                                if (B.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0321j2.f3767g = f17;
                                float f18 = c0321j2.h;
                                if (B.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0321j2.h = f18;
                                float f19 = c0321j2.i;
                                if (B.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0321j2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0321j2.f3769k = string6;
                                }
                                c0321j2.c();
                                f14.recycle();
                                c0321j.f3763b.add(c0321j2);
                                arrayDeque.push(c0321j2);
                                if (c0321j2.getGroupName() != null) {
                                    bVar.put(c0321j2.getGroupName(), c0321j2);
                                }
                                c0325n3.f3786a = c0325n3.f3786a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        c0324m = c0324m3;
                        i = depth;
                        i2 = i6;
                        z2 = z4;
                        i3 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i3;
                    z4 = z2;
                    i6 = i2;
                    depth = i;
                    c0324m3 = c0324m;
                }
                if (!z6) {
                    this.f3798c = a(c0325n.f3788c, c0325n.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0327p(C0325n c0325n) {
        this.f3800f = true;
        this.f3801g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3797b = c0325n;
        this.f3798c = a(c0325n.f3788c, c0325n.d);
    }
}
