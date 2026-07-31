package yads;

import android.media.MediaFormat;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;

/* loaded from: classes13.dex */
public final class vn0 implements xh3, zs, hf2 {
    public xh3 b;
    public zs c;

    @Override // yads.hf2
    public final void a(int i, Object obj) {
        if (i == 7) {
            this.b = (xh3) obj;
        } else if (i == 8) {
            this.c = (zs) obj;
        } else {
            if (i != 10000) {
                return;
            }
            MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        }
    }

    @Override // yads.xh3
    public final void a(long j, long j2, jw0 jw0Var, MediaFormat mediaFormat) {
        xh3 xh3Var = this.b;
        if (xh3Var != null) {
            xh3Var.a(j, j2, jw0Var, mediaFormat);
        }
    }

    @Override // yads.zs
    public final void a(long j, float[] fArr) {
        zs zsVar = this.c;
        if (zsVar != null) {
            zsVar.a(j, fArr);
        }
    }

    @Override // yads.zs
    public final void a() {
        zs zsVar = this.c;
        if (zsVar != null) {
            zsVar.a();
        }
    }
}
