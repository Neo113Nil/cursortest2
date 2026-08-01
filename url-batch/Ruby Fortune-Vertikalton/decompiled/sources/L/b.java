package L;

import K.T;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final K0.k f597a;

    public b(K0.k kVar) {
        this.f597a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f597a.equals(((b) obj).f597a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f597a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        K0.l lVar = (K0.l) this.f597a.f501a;
        AutoCompleteTextView autoCompleteTextView = lVar.h;
        if (autoCompleteTextView == null || q1.l.D(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = T.f381a;
        lVar.d.setImportantForAccessibility(i);
    }
}
