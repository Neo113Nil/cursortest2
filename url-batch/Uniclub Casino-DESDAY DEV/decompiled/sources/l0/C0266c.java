package l0;

import android.graphics.drawable.Drawable;

/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266c implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3119a;

    public C0266c(f fVar) {
        this.f3119a = fVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f3119a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        this.f3119a.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f3119a.unscheduleSelf(runnable);
    }
}
