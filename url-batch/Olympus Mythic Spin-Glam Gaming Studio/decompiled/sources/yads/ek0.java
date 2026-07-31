package yads;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;

/* loaded from: classes10.dex */
public final class ek0 extends LruCache {
    public ek0(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Drawable drawable = ((fk0) obj2).a;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap().getByteCount() / 1024;
        }
        return 100;
    }
}
