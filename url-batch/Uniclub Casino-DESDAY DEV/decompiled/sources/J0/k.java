package J0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p0.AbstractC0279a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public q1.d f309a = new i();

    /* renamed from: b, reason: collision with root package name */
    public q1.d f310b = new i();

    /* renamed from: c, reason: collision with root package name */
    public q1.d f311c = new i();
    public q1.d d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f312e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f313f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f314g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f315j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f316k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f317l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0279a.f3397v);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            c c2 = c(obtainStyledAttributes, 5, aVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            j jVar = new j();
            q1.d y2 = q1.l.y(i4);
            jVar.f300a = y2;
            j.b(y2);
            jVar.f303e = c3;
            q1.d y3 = q1.l.y(i5);
            jVar.f301b = y3;
            j.b(y3);
            jVar.f304f = c4;
            q1.d y4 = q1.l.y(i6);
            jVar.f302c = y4;
            j.b(y4);
            jVar.f305g = c5;
            q1.d y5 = q1.l.y(i7);
            jVar.d = y5;
            j.b(y5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0279a.f3391p, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z2 = this.f317l.getClass().equals(e.class) && this.f315j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f316k.getClass().equals(e.class);
        float a2 = this.f312e.a(rectF);
        return z2 && ((this.f313f.a(rectF) > a2 ? 1 : (this.f313f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f314g.a(rectF) > a2 ? 1 : (this.f314g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f310b instanceof i) && (this.f309a instanceof i) && (this.f311c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f300a = this.f309a;
        jVar.f301b = this.f310b;
        jVar.f302c = this.f311c;
        jVar.d = this.d;
        jVar.f303e = this.f312e;
        jVar.f304f = this.f313f;
        jVar.f305g = this.f314g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f306j = this.f315j;
        jVar.f307k = this.f316k;
        jVar.f308l = this.f317l;
        return jVar;
    }
}
