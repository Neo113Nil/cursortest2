package o;

import android.graphics.RenderNode;
import android.view.Surface;
import android.view.SurfaceControl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class BI {
    public static /* synthetic */ RenderNode c() {
        return new RenderNode("Compose");
    }

    public static /* synthetic */ Surface d(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder e() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction f() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction h(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }
}
