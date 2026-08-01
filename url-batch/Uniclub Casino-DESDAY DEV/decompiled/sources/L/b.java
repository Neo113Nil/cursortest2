package L;

import K.S;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final M0.k f471a;

    public b(M0.k kVar) {
        this.f471a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f471a.equals(((b) obj).f471a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f471a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        M0.l lVar = (M0.l) this.f471a.f522a;
        AutoCompleteTextView autoCompleteTextView = lVar.h;
        if (autoCompleteTextView == null || q1.l.S(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = S.f360a;
        lVar.d.setImportantForAccessibility(i);
    }
}
