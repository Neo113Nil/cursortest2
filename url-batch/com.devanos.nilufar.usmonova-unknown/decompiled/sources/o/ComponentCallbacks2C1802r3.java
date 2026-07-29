package o;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1802r3 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration h;
    public final /* synthetic */ C1722ps i;

    public ComponentCallbacks2C1802r3(Configuration configuration, C1722ps c1722ps) {
        this.h = configuration;
        this.i = c1722ps;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.h;
        configuration2.updateFrom(configuration);
        Iterator it = this.i.a.entrySet().iterator();
        while (it.hasNext()) {
            if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() != null) {
                throw new ClassCastException();
            }
            it.remove();
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.i.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.i.a.clear();
    }
}
