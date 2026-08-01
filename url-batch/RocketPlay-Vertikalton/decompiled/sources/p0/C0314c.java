package p0;

import android.graphics.drawable.Drawable;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314c implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0317f f3744a;

    public C0314c(C0317f c0317f) {
        this.f3744a = c0317f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f3744a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        this.f3744a.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f3744a.unscheduleSelf(runnable);
    }
}
