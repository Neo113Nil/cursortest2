package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class z3 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration d;
    public final /* synthetic */ dx e;

    public z3(Configuration configuration, dx dxVar) {
        this.d = configuration;
        this.e = dxVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.d;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.e.a.entrySet().iterator();
        while (it.hasNext()) {
            bx bxVar = (bx) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (bxVar == null || Configuration.needNewResources(updateFrom, bxVar.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.e.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.e.a.clear();
    }
}
