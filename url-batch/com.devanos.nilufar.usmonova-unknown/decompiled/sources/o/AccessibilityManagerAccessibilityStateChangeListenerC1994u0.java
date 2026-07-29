package o;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: o.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AccessibilityManagerAccessibilityStateChangeListenerC1994u0 implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ io.flutter.view.b a;

    public AccessibilityManagerAccessibilityStateChangeListenerC1994u0(io.flutter.view.b bVar) {
        this.a = bVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        io.flutter.view.b bVar = this.a;
        C0950e6 c0950e6 = bVar.b;
        if (bVar.t) {
            return;
        }
        if (z) {
            ((FlutterJNI) c0950e6.j).setSemanticsEnabled(true);
        } else {
            bVar.i(false);
            ((FlutterJNI) c0950e6.j).setSemanticsEnabled(false);
        }
        Y1 y1 = bVar.r;
        if (y1 != null) {
            boolean isTouchExplorationEnabled = bVar.c.isTouchExplorationEnabled();
            C0068Cn c0068Cn = (C0068Cn) y1.i;
            if (c0068Cn.q.b.a.getIsSoftwareRenderingEnabled()) {
                c0068Cn.setWillNotDraw(false);
            } else {
                c0068Cn.setWillNotDraw((z || isTouchExplorationEnabled) ? false : true);
            }
        }
    }
}
