package G0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import q1.l;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f185c;
    public final /* synthetic */ d d;

    public c(d dVar, Context context, TextPaint textPaint, l lVar) {
        this.d = dVar;
        this.f183a = context;
        this.f184b = textPaint;
        this.f185c = lVar;
    }

    @Override // q1.l
    public final void d0(int i) {
        this.f185c.d0(i);
    }

    @Override // q1.l
    public final void e0(Typeface typeface, boolean z2) {
        this.d.g(this.f183a, this.f184b, typeface);
        this.f185c.e0(typeface, z2);
    }
}
