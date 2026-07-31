package yads;

import android.graphics.Bitmap;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes14.dex */
public final class h12 implements z31 {
    public final /* synthetic */ i12 a;

    public h12(i12 i12Var) {
        this.a = i12Var;
    }

    @Override // yads.z31
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.z31
    public final void a(Map map) {
        this.a.b.b.putAll(map);
        this.a.c.a();
        Iterator it = this.a.g.iterator();
        if (it.hasNext()) {
            MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
    }
}
