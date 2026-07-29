package o;

import android.view.MotionEvent;

/* renamed from: o.lI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422lI extends C1256in {

    /* renamed from: o, reason: collision with root package name */
    public D0 f192o;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        D0 d0 = this.f192o;
        if (d0 != null) {
            io.flutter.view.b bVar = d0.a;
            if (bVar == null ? false : bVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
