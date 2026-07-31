package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class gf {
    public static final gf a = new gf();
    public static volatile bg b;

    public static final bg a(Context context) {
        bg bgVar;
        bg bgVar2 = b;
        if (bgVar2 != null) {
            return bgVar2;
        }
        synchronized (a) {
            Context a2 = pz.a(context);
            bgVar = b;
            if (bgVar == null) {
                bgVar = new bg(a2);
                b = bgVar;
            }
        }
        return bgVar;
    }
}
