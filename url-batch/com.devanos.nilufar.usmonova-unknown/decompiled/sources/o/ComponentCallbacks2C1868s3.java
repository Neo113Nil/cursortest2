package o;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: o.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1868s3 implements ComponentCallbacks2 {
    public final /* synthetic */ TN h;

    public ComponentCallbacks2C1868s3(TN tn) {
        this.h = tn;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        TN tn = this.h;
        synchronized (tn) {
            tn.a.a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        TN tn = this.h;
        synchronized (tn) {
            tn.a.a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        TN tn = this.h;
        synchronized (tn) {
            tn.a.a();
        }
    }
}
