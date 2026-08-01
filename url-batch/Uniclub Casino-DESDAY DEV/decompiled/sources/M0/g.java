package M0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends J0.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f517q;

    public g(J0.k kVar, RectF rectF) {
        super(kVar);
        this.f517q = rectF;
    }

    @Override // J0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f519x = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f517q = gVar.f517q;
    }
}
