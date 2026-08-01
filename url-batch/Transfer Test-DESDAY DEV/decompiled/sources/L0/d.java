package L0;

import B.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import u0.AbstractC0338a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f491a;

    /* renamed from: b, reason: collision with root package name */
    public final String f492b;

    /* renamed from: c, reason: collision with root package name */
    public final int f493c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f494e;

    /* renamed from: f, reason: collision with root package name */
    public final float f495f;

    /* renamed from: g, reason: collision with root package name */
    public final float f496g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f497j;

    /* renamed from: k, reason: collision with root package name */
    public float f498k;

    /* renamed from: l, reason: collision with root package name */
    public final int f499l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f500m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f501n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0338a.f3805y);
        this.f498k = obtainStyledAttributes.getDimension(0, RecyclerView.f1570A0);
        this.f497j = A.c.G(context, obtainStyledAttributes, 3);
        A.c.G(context, obtainStyledAttributes, 4);
        A.c.G(context, obtainStyledAttributes, 5);
        this.f493c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f499l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f492b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f491a = A.c.G(context, obtainStyledAttributes, 6);
        this.f494e = obtainStyledAttributes.getFloat(7, RecyclerView.f1570A0);
        this.f495f = obtainStyledAttributes.getFloat(8, RecyclerView.f1570A0);
        this.f496g = obtainStyledAttributes.getFloat(9, RecyclerView.f1570A0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0338a.f3797q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, RecyclerView.f1570A0);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f501n;
        int i = this.f493c;
        if (typeface == null && (str = this.f492b) != null) {
            this.f501n = Typeface.create(str, i);
        }
        if (this.f501n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f501n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f501n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f501n = Typeface.DEFAULT;
            } else {
                this.f501n = Typeface.MONOSPACE;
            }
            this.f501n = Typeface.create(this.f501n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f500m) {
            return this.f501n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f499l);
                this.f501n = a2;
                if (a2 != null) {
                    this.f501n = Typeface.create(a2, this.f493c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f492b, e2);
            }
        }
        a();
        this.f500m = true;
        return this.f501n;
    }

    public final void c(Context context, A.c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f499l;
        if (i == 0) {
            this.f500m = true;
        }
        if (this.f500m) {
            cVar.k0(this.f501n, true);
            return;
        }
        try {
            b bVar = new b(this, cVar);
            ThreadLocal threadLocal = r.f69a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f500m = true;
            cVar.j0(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f492b, e2);
            this.f500m = true;
            cVar.j0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f499l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f69a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, A.c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f497j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f491a;
        textPaint.setShadowLayer(this.f496g, this.f494e, this.f495f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, A.c cVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f501n);
        c(context, new c(this, context, textPaint, cVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface g02 = A.c.g0(context.getResources().getConfiguration(), typeface);
        if (g02 != null) {
            typeface = g02;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f493c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : RecyclerView.f1570A0);
        textPaint.setTextSize(this.f498k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
