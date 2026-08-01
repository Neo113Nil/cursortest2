package O0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import u0.AbstractC0338a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public A.c f561a = new i();

    /* renamed from: b, reason: collision with root package name */
    public A.c f562b = new i();

    /* renamed from: c, reason: collision with root package name */
    public A.c f563c = new i();
    public A.c d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f564e = new a(RecyclerView.f1570A0);

    /* renamed from: f, reason: collision with root package name */
    public c f565f = new a(RecyclerView.f1570A0);

    /* renamed from: g, reason: collision with root package name */
    public c f566g = new a(RecyclerView.f1570A0);
    public c h = new a(RecyclerView.f1570A0);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f567j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f568k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f569l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0338a.f3802v);
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
            A.c t2 = A.c.t(i4);
            jVar.f552a = t2;
            j.b(t2);
            jVar.f555e = c3;
            A.c t3 = A.c.t(i5);
            jVar.f553b = t3;
            j.b(t3);
            jVar.f556f = c4;
            A.c t4 = A.c.t(i6);
            jVar.f554c = t4;
            j.b(t4);
            jVar.f557g = c5;
            A.c t5 = A.c.t(i7);
            jVar.d = t5;
            j.b(t5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0338a.f3796p, i, i2);
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
        boolean z2 = this.f569l.getClass().equals(e.class) && this.f567j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f568k.getClass().equals(e.class);
        float a2 = this.f564e.a(rectF);
        return z2 && ((this.f565f.a(rectF) > a2 ? 1 : (this.f565f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f566g.a(rectF) > a2 ? 1 : (this.f566g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f562b instanceof i) && (this.f561a instanceof i) && (this.f563c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f552a = this.f561a;
        jVar.f553b = this.f562b;
        jVar.f554c = this.f563c;
        jVar.d = this.d;
        jVar.f555e = this.f564e;
        jVar.f556f = this.f565f;
        jVar.f557g = this.f566g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f558j = this.f567j;
        jVar.f559k = this.f568k;
        jVar.f560l = this.f569l;
        return jVar;
    }
}
