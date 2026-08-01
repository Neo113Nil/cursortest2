package G0;

import B.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p0.AbstractC0279a;
import q1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f186a;

    /* renamed from: b, reason: collision with root package name */
    public final String f187b;

    /* renamed from: c, reason: collision with root package name */
    public final int f188c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f189e;

    /* renamed from: f, reason: collision with root package name */
    public final float f190f;

    /* renamed from: g, reason: collision with root package name */
    public final float f191g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f192j;

    /* renamed from: k, reason: collision with root package name */
    public float f193k;

    /* renamed from: l, reason: collision with root package name */
    public final int f194l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f195m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f196n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0279a.f3400y);
        this.f193k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f192j = q1.d.r(context, obtainStyledAttributes, 3);
        q1.d.r(context, obtainStyledAttributes, 4);
        q1.d.r(context, obtainStyledAttributes, 5);
        this.f188c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f194l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f187b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f186a = q1.d.r(context, obtainStyledAttributes, 6);
        this.f189e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f190f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f191g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0279a.f3392q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f196n;
        int i = this.f188c;
        if (typeface == null && (str = this.f187b) != null) {
            this.f196n = Typeface.create(str, i);
        }
        if (this.f196n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f196n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f196n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f196n = Typeface.DEFAULT;
            } else {
                this.f196n = Typeface.MONOSPACE;
            }
            this.f196n = Typeface.create(this.f196n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f195m) {
            return this.f196n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f194l);
                this.f196n = a2;
                if (a2 != null) {
                    this.f196n = Typeface.create(a2, this.f188c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f187b, e2);
            }
        }
        a();
        this.f195m = true;
        return this.f196n;
    }

    public final void c(Context context, l lVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f194l;
        if (i == 0) {
            this.f195m = true;
        }
        if (this.f195m) {
            lVar.e0(this.f196n, true);
            return;
        }
        try {
            b bVar = new b(this, lVar);
            ThreadLocal threadLocal = r.f41a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f195m = true;
            lVar.d0(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f187b, e2);
            this.f195m = true;
            lVar.d0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f194l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f41a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, l lVar) {
        f(context, textPaint, lVar);
        ColorStateList colorStateList = this.f192j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f186a;
        textPaint.setShadowLayer(this.f191g, this.f189e, this.f190f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, l lVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f196n);
        c(context, new c(this, context, textPaint, lVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface E2 = q1.d.E(context.getResources().getConfiguration(), typeface);
        if (E2 != null) {
            typeface = E2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f188c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f193k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
