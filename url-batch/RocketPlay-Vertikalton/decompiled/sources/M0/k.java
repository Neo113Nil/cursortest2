package M0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import s0.AbstractC0363a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public F1.l f857a = new i();

    /* renamed from: b, reason: collision with root package name */
    public F1.l f858b = new i();

    /* renamed from: c, reason: collision with root package name */
    public F1.l f859c = new i();
    public F1.l d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f860e = new a(RecyclerView.f1949A0);

    /* renamed from: f, reason: collision with root package name */
    public c f861f = new a(RecyclerView.f1949A0);

    /* renamed from: g, reason: collision with root package name */
    public c f862g = new a(RecyclerView.f1949A0);
    public c h = new a(RecyclerView.f1949A0);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f863j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f864k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f865l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0363a.f4112v);
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
            F1.l u2 = F1.d.u(i4);
            jVar.f848a = u2;
            j.b(u2);
            jVar.f851e = c3;
            F1.l u3 = F1.d.u(i5);
            jVar.f849b = u3;
            j.b(u3);
            jVar.f852f = c4;
            F1.l u4 = F1.d.u(i6);
            jVar.f850c = u4;
            j.b(u4);
            jVar.f853g = c5;
            F1.l u5 = F1.d.u(i7);
            jVar.d = u5;
            j.b(u5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0363a.f4106p, i, i2);
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
        boolean z2 = this.f865l.getClass().equals(e.class) && this.f863j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f864k.getClass().equals(e.class);
        float a2 = this.f860e.a(rectF);
        return z2 && ((this.f861f.a(rectF) > a2 ? 1 : (this.f861f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f862g.a(rectF) > a2 ? 1 : (this.f862g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f858b instanceof i) && (this.f857a instanceof i) && (this.f859c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f848a = this.f857a;
        jVar.f849b = this.f858b;
        jVar.f850c = this.f859c;
        jVar.d = this.d;
        jVar.f851e = this.f860e;
        jVar.f852f = this.f861f;
        jVar.f853g = this.f862g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f854j = this.f863j;
        jVar.f855k = this.f864k;
        jVar.f856l = this.f865l;
        return jVar;
    }
}
