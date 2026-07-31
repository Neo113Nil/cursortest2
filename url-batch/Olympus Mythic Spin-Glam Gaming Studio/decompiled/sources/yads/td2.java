package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes5.dex */
public final class td2 extends Surface {
    public static int e;
    public static boolean f;
    public final boolean b;
    public final sd2 c;
    public boolean d;

    public td2(sd2 sd2Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.c = sd2Var;
        this.b = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.c) {
            try {
                if (!this.d) {
                    sd2 sd2Var = this.c;
                    sd2Var.c.getClass();
                    sd2Var.c.sendEmptyMessage(2);
                    this.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
