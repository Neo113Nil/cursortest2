package J0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends F1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F1.d f598c;
    public final /* synthetic */ d d;

    public c(d dVar, Context context, TextPaint textPaint, F1.d dVar2) {
        this.d = dVar;
        this.f596a = context;
        this.f597b = textPaint;
        this.f598c = dVar2;
    }

    @Override // F1.d
    public final void U(int i) {
        this.f598c.U(i);
    }

    @Override // F1.d
    public final void V(Typeface typeface, boolean z2) {
        this.d.g(this.f596a, this.f597b, typeface);
        this.f598c.V(typeface, z2);
    }
}
