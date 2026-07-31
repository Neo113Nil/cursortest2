package yads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes3.dex */
public final class jf0 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ pf0 a;

    public jf0(pf0 pf0Var) {
        this.a = pf0Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.b();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.b();
    }
}
