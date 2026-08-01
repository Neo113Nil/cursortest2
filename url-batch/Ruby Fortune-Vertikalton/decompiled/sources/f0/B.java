package f0;

import android.database.Observable;

/* loaded from: classes.dex */
public final class B extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }
}
