package J0;

import B.r;
import F1.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import s0.AbstractC0363a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f599a;

    /* renamed from: b, reason: collision with root package name */
    public final String f600b;

    /* renamed from: c, reason: collision with root package name */
    public final int f601c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f602e;

    /* renamed from: f, reason: collision with root package name */
    public final float f603f;

    /* renamed from: g, reason: collision with root package name */
    public final float f604g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f605j;

    /* renamed from: k, reason: collision with root package name */
    public float f606k;

    /* renamed from: l, reason: collision with root package name */
    public final int f607l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f608m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f609n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0363a.f4115y);
        this.f606k = obtainStyledAttributes.getDimension(0, RecyclerView.f1949A0);
        this.f605j = l.z(context, obtainStyledAttributes, 3);
        l.z(context, obtainStyledAttributes, 4);
        l.z(context, obtainStyledAttributes, 5);
        this.f601c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f607l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f600b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f599a = l.z(context, obtainStyledAttributes, 6);
        this.f602e = obtainStyledAttributes.getFloat(7, RecyclerView.f1949A0);
        this.f603f = obtainStyledAttributes.getFloat(8, RecyclerView.f1949A0);
        this.f604g = obtainStyledAttributes.getFloat(9, RecyclerView.f1949A0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0363a.f4107q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, RecyclerView.f1949A0);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f609n;
        int i = this.f601c;
        if (typeface == null && (str = this.f600b) != null) {
            this.f609n = Typeface.create(str, i);
        }
        if (this.f609n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f609n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f609n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f609n = Typeface.DEFAULT;
            } else {
                this.f609n = Typeface.MONOSPACE;
            }
            this.f609n = Typeface.create(this.f609n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f608m) {
            return this.f609n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f607l);
                this.f609n = a2;
                if (a2 != null) {
                    this.f609n = Typeface.create(a2, this.f601c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f600b, e2);
            }
        }
        a();
        this.f608m = true;
        return this.f609n;
    }

    public final void c(Context context, F1.d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f607l;
        if (i == 0) {
            this.f608m = true;
        }
        if (this.f608m) {
            dVar.V(this.f609n, true);
            return;
        }
        try {
            b bVar = new b(this, dVar);
            ThreadLocal threadLocal = r.f85a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f608m = true;
            dVar.U(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f600b, e2);
            this.f608m = true;
            dVar.U(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f607l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f85a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, F1.d dVar) {
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f605j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f599a;
        textPaint.setShadowLayer(this.f604g, this.f602e, this.f603f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, F1.d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f609n);
        c(context, new c(this, context, textPaint, dVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface U2 = l.U(context.getResources().getConfiguration(), typeface);
        if (U2 != null) {
            typeface = U2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f601c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : RecyclerView.f1949A0);
        textPaint.setTextSize(this.f606k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
