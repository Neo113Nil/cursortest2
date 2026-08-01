package defpackage;

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
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class j70 extends a70 {
    public static final PorterDuff.Mode o = PorterDuff.Mode.SRC_IN;
    public h70 g;
    public PorterDuffColorFilter h;
    public ColorFilter i;
    public boolean j;
    public boolean k;
    public final float[] l;
    public final Matrix m;
    public final Rect n;

    public j70() {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        h70 h70Var = new h70();
        h70Var.c = null;
        h70Var.d = o;
        h70Var.b = new g70();
        this.g = h70Var;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.i;
        if (colorFilter == null) {
            colorFilter = this.h;
        }
        Matrix matrix = this.m;
        canvas.getMatrix(matrix);
        float[] fArr = this.l;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
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
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        h70 h70Var = this.g;
        Bitmap bitmap = h70Var.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != h70Var.f.getHeight()) {
            h70Var.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            h70Var.k = true;
        }
        boolean z = this.k;
        h70 h70Var2 = this.g;
        if (!z) {
            h70Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(h70Var2.f);
            g70 g70Var = h70Var2.b;
            g70Var.a(g70Var.g, g70.p, canvas2, min, min2);
        } else if (h70Var2.k || h70Var2.g != h70Var2.c || h70Var2.h != h70Var2.d || h70Var2.j != h70Var2.e || h70Var2.i != h70Var2.b.getRootAlpha()) {
            h70 h70Var3 = this.g;
            h70Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(h70Var3.f);
            g70 g70Var2 = h70Var3.b;
            g70Var2.a(g70Var2.g, g70.p, canvas3, min, min2);
            h70 h70Var4 = this.g;
            h70Var4.g = h70Var4.c;
            h70Var4.h = h70Var4.d;
            h70Var4.i = h70Var4.b.getRootAlpha();
            h70Var4.j = h70Var4.e;
            h70Var4.k = false;
        }
        h70 h70Var5 = this.g;
        if (h70Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (h70Var5.l == null) {
                Paint paint2 = new Paint();
                h70Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            h70Var5.l.setAlpha(h70Var5.b.getRootAlpha());
            h70Var5.l.setColorFilter(colorFilter);
            paint = h70Var5.l;
        }
        canvas.drawBitmap(h70Var5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getAlpha() : this.g.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.g.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getColorFilter() : this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f != null) {
            return new i70(this.f.getConstantState());
        }
        this.g.a = getChangingConfigurations();
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.g.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.g.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        char c;
        int i2;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h70 h70Var = this.g;
        h70Var.b = new g70();
        TypedArray z = vv.z(resources, theme, attributeSet, oo.a);
        h70 h70Var2 = this.g;
        g70 g70Var = h70Var2.b;
        int i3 = !vv.w(xmlPullParser, "tintMode") ? -1 : z.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
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
        h70Var2.d = mode;
        ColorStateList colorStateList = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            z.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = z.getResources();
                int resourceId = z.getResourceId(1, 0);
                ThreadLocal threadLocal = db.a;
                try {
                    colorStateList = db.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            h70Var2.c = colorStateList2;
        }
        boolean z2 = h70Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z2 = z.getBoolean(5, z2);
        }
        h70Var2.e = z2;
        float f = g70Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = z.getFloat(7, f);
        }
        g70Var.j = f;
        float f2 = g70Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = z.getFloat(8, f2);
        }
        g70Var.k = f2;
        if (g70Var.j <= 0.0f) {
            throw new XmlPullParserException(z.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(z.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        g70Var.h = z.getDimension(3, g70Var.h);
        float dimension = z.getDimension(2, g70Var.i);
        g70Var.i = dimension;
        if (g70Var.h <= 0.0f) {
            throw new XmlPullParserException(z.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(z.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = g70Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = z.getFloat(4, alpha);
        }
        g70Var.setAlpha(alpha);
        String string = z.getString(0);
        if (string != null) {
            g70Var.m = string;
            g70Var.o.put(string, g70Var);
        }
        z.recycle();
        h70Var.a = getChangingConfigurations();
        h70Var.k = true;
        h70 h70Var3 = this.g;
        g70 g70Var2 = h70Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        d70 d70Var = g70Var2.g;
        l6 l6Var = g70Var2.o;
        arrayDeque.push(d70Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z3 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d70 d70Var2 = (d70) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    c70 c70Var = new c70();
                    c70Var.e = 0.0f;
                    c70Var.g = 1.0f;
                    c70Var.h = 1.0f;
                    c70Var.i = 0.0f;
                    c70Var.j = 1.0f;
                    c70Var.k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    c70Var.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    c70Var.m = join;
                    c70Var.n = 4.0f;
                    TypedArray z4 = vv.z(resources, theme, attributeSet, oo.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = z4.getString(0);
                        if (string2 != null) {
                            c70Var.b = string2;
                        }
                        String string3 = z4.getString(2);
                        if (string3 != null) {
                            c70Var.a = oo.k(string3);
                        }
                        c70Var.f = vv.u(z4, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c70Var.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = z4.getFloat(12, f3);
                        }
                        c70Var.h = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? z4.getInt(8, -1) : -1;
                        c70Var.l = i6 != 0 ? i6 != 1 ? i6 != 2 ? c70Var.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? z4.getInt(9, -1) : -1;
                        c70Var.m = i7 != 0 ? i7 != 1 ? i7 != 2 ? c70Var.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = c70Var.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = z4.getFloat(10, f4);
                        }
                        c70Var.n = f4;
                        c70Var.d = vv.u(z4, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c70Var.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = z4.getFloat(11, f5);
                        }
                        c70Var.g = f5;
                        float f6 = c70Var.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = z4.getFloat(4, f6);
                        }
                        c70Var.e = f6;
                        float f7 = c70Var.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = z4.getFloat(6, f7);
                        }
                        c70Var.j = f7;
                        float f8 = c70Var.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = z4.getFloat(7, f8);
                        }
                        c70Var.k = f8;
                        float f9 = c70Var.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = z4.getFloat(5, f9);
                        }
                        c70Var.i = f9;
                        int i8 = c70Var.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = z4.getInt(13, i8);
                        }
                        c70Var.c = i8;
                    }
                    z4.recycle();
                    d70Var2.b.add(c70Var);
                    if (c70Var.getPathName() != null) {
                        l6Var.put(c70Var.getPathName(), c70Var);
                    }
                    h70Var3.a = h70Var3.a;
                    z3 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        b70 b70Var = new b70();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray z5 = vv.z(resources, theme, attributeSet, oo.d);
                            String string4 = z5.getString(0);
                            if (string4 != null) {
                                b70Var.b = string4;
                            }
                            String string5 = z5.getString(1);
                            if (string5 != null) {
                                b70Var.a = oo.k(string5);
                            }
                            b70Var.c = !vv.w(xmlPullParser, "fillType") ? 0 : z5.getInt(2, 0);
                            z5.recycle();
                        }
                        d70Var2.b.add(b70Var);
                        if (b70Var.getPathName() != null) {
                            l6Var.put(b70Var.getPathName(), b70Var);
                        }
                        h70Var3.a = h70Var3.a;
                    } else if ("group".equals(name)) {
                        d70 d70Var3 = new d70();
                        TypedArray z6 = vv.z(resources, theme, attributeSet, oo.b);
                        float f10 = d70Var3.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = z6.getFloat(5, f10);
                        }
                        d70Var3.c = f10;
                        d70Var3.d = z6.getFloat(1, d70Var3.d);
                        d70Var3.e = z6.getFloat(2, d70Var3.e);
                        float f11 = d70Var3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = z6.getFloat(3, f11);
                        }
                        d70Var3.f = f11;
                        float f12 = d70Var3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = z6.getFloat(4, f12);
                        }
                        d70Var3.g = f12;
                        float f13 = d70Var3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = z6.getFloat(6, f13);
                        }
                        d70Var3.h = f13;
                        float f14 = d70Var3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = z6.getFloat(7, f14);
                        }
                        d70Var3.i = f14;
                        String string6 = z6.getString(0);
                        if (string6 != null) {
                            d70Var3.k = string6;
                        }
                        d70Var3.c();
                        z6.recycle();
                        d70Var2.b.add(d70Var3);
                        arrayDeque.push(d70Var3);
                        if (d70Var3.getGroupName() != null) {
                            l6Var.put(d70Var3.getGroupName(), d70Var3);
                        }
                        h70Var3.a = h70Var3.a;
                    }
                }
                i2 = 1;
            } else {
                i = depth;
                c = '\b';
                i2 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i4 = i2;
            depth = i;
        }
        if (z3) {
            throw new XmlPullParserException("no path defined");
        }
        this.h = a(h70Var.c, h70Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.isAutoMirrored() : this.g.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h70 h70Var = this.g;
        if (h70Var == null) {
            return false;
        }
        g70 g70Var = h70Var.b;
        if (g70Var.n == null) {
            g70Var.n = Boolean.valueOf(g70Var.g.a());
        }
        if (g70Var.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.g.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.j && super.mutate() == this) {
            h70 h70Var = this.g;
            h70 h70Var2 = new h70();
            h70Var2.c = null;
            h70Var2.d = o;
            if (h70Var != null) {
                h70Var2.a = h70Var.a;
                g70 g70Var = new g70(h70Var.b);
                h70Var2.b = g70Var;
                if (h70Var.b.e != null) {
                    g70Var.e = new Paint(h70Var.b.e);
                }
                if (h70Var.b.d != null) {
                    h70Var2.b.d = new Paint(h70Var.b.d);
                }
                h70Var2.c = h70Var.c;
                h70Var2.d = h70Var.d;
                h70Var2.e = h70Var.e;
            }
            this.g = h70Var2;
            this.j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h70 h70Var = this.g;
        ColorStateList colorStateList = h70Var.c;
        if (colorStateList == null || (mode = h70Var.d) == null) {
            z = false;
        } else {
            this.h = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        g70 g70Var = h70Var.b;
        if (g70Var.n == null) {
            g70Var.n = Boolean.valueOf(g70Var.g.a());
        }
        if (g70Var.n.booleanValue()) {
            boolean b = h70Var.b.g.b(iArr);
            h70Var.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.g.b.getRootAlpha() != i) {
            this.g.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.g.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        h70 h70Var = this.g;
        if (h70Var.c != colorStateList) {
            h70Var.c = colorStateList;
            this.h = a(colorStateList, h70Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        h70 h70Var = this.g;
        if (h70Var.d != mode) {
            h70Var.d = mode;
            this.h = a(h70Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public j70(h70 h70Var) {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        this.g = h70Var;
        this.h = a(h70Var.c, h70Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
