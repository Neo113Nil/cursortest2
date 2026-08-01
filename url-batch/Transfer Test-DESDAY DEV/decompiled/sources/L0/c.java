package L0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextPaint f489f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A.c f490g;
    public final /* synthetic */ d h;

    public c(d dVar, Context context, TextPaint textPaint, A.c cVar) {
        this.h = dVar;
        this.f488e = context;
        this.f489f = textPaint;
        this.f490g = cVar;
    }

    @Override // A.c
    public final void j0(int i) {
        this.f490g.j0(i);
    }

    @Override // A.c
    public final void k0(Typeface typeface, boolean z2) {
        this.h.g(this.f488e, this.f489f, typeface);
        this.f490g.k0(typeface, z2);
    }
}
