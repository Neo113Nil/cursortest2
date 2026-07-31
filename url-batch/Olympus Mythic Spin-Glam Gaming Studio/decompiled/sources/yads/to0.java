package yads;

import android.util.LruCache;

/* loaded from: classes4.dex */
public final class to0 extends LruCache {
    public to0(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        zo0 zo0Var = (zo0) obj2;
        if (zo0Var != null) {
            zo0Var.f();
        }
    }
}
