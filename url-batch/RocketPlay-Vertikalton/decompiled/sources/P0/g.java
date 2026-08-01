package P0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends M0.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f936q;

    public g(M0.k kVar, RectF rectF) {
        super(kVar);
        this.f936q = rectF;
    }

    @Override // M0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f938x = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f936q = gVar.f936q;
    }
}
