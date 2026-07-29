package o;

import android.view.accessibility.AccessibilityManager;

/* renamed from: o.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC2126w0 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ AccessibilityManager a;
    public final /* synthetic */ io.flutter.view.b b;

    public AccessibilityManagerTouchExplorationStateChangeListenerC2126w0(io.flutter.view.b bVar, AccessibilityManager accessibilityManager) {
        this.b = bVar;
        this.a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        io.flutter.view.b bVar = this.b;
        if (bVar.t) {
            return;
        }
        boolean z2 = false;
        if (!z) {
            bVar.i(false);
            C2324z0 c2324z0 = bVar.f10o;
            if (c2324z0 != null) {
                bVar.g(c2324z0.b, 256);
                bVar.f10o = null;
            }
        }
        Y1 y1 = bVar.r;
        if (y1 != null) {
            boolean isEnabled = this.a.isEnabled();
            C0068Cn c0068Cn = (C0068Cn) y1.i;
            if (c0068Cn.q.b.a.getIsSoftwareRenderingEnabled()) {
                c0068Cn.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z) {
                z2 = true;
            }
            c0068Cn.setWillNotDraw(z2);
        }
    }
}
