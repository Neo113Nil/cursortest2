package E0;

import B.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import n0.AbstractC0279a;
import q1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f175b;

    /* renamed from: c, reason: collision with root package name */
    public final int f176c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f177e;

    /* renamed from: f, reason: collision with root package name */
    public final float f178f;

    /* renamed from: g, reason: collision with root package name */
    public final float f179g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f180j;

    /* renamed from: k, reason: collision with root package name */
    public float f181k;

    /* renamed from: l, reason: collision with root package name */
    public final int f182l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f183m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f184n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0279a.f3284y);
        this.f181k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f180j = q1.d.A(context, obtainStyledAttributes, 3);
        q1.d.A(context, obtainStyledAttributes, 4);
        q1.d.A(context, obtainStyledAttributes, 5);
        this.f176c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f182l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f175b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f174a = q1.d.A(context, obtainStyledAttributes, 6);
        this.f177e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f178f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f179g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0279a.f3276q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f184n;
        int i = this.f176c;
        if (typeface == null && (str = this.f175b) != null) {
            this.f184n = Typeface.create(str, i);
        }
        if (this.f184n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f184n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f184n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f184n = Typeface.DEFAULT;
            } else {
                this.f184n = Typeface.MONOSPACE;
            }
            this.f184n = Typeface.create(this.f184n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f183m) {
            return this.f184n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f182l);
                this.f184n = a2;
                if (a2 != null) {
                    this.f184n = Typeface.create(a2, this.f176c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f175b, e2);
            }
        }
        a();
        this.f183m = true;
        return this.f184n;
    }

    public final void c(Context context, l lVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f182l;
        if (i == 0) {
            this.f183m = true;
        }
        if (this.f183m) {
            lVar.H(this.f184n, true);
            return;
        }
        try {
            b bVar = new b(this, lVar);
            ThreadLocal threadLocal = r.f43a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f183m = true;
            lVar.G(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f175b, e2);
            this.f183m = true;
            lVar.G(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f182l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f43a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, l lVar) {
        f(context, textPaint, lVar);
        ColorStateList colorStateList = this.f180j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f174a;
        textPaint.setShadowLayer(this.f179g, this.f177e, this.f178f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, l lVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f184n);
        c(context, new c(this, context, textPaint, lVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface Y2 = q1.d.Y(context.getResources().getConfiguration(), typeface);
        if (Y2 != null) {
            typeface = Y2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f176c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f181k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
