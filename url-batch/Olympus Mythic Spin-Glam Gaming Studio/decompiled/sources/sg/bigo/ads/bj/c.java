package sg.bigo.ads.bj;

import android.content.Context;
import android.util.LruCache;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes12.dex */
final class c {
    static final AtomicInteger a = new AtomicInteger(0);

    @NonNull
    final LruCache<String, sg.bigo.ads.an.c> b;

    @NonNull
    final LruCache<String, sg.bigo.ads.an.c> c;

    static class a {
        private static final c a = new c(0);
    }

    private c() {
        AtomicInteger atomicInteger = a;
        this.b = new LruCache<String, sg.bigo.ads.an.c>(atomicInteger.get()) { // from class: sg.bigo.ads.bj.c.1
            @Override // android.util.LruCache
            protected final /* synthetic */ int sizeOf(@NonNull String str, @NonNull sg.bigo.ads.an.c cVar) {
                return cVar.a.getByteCount();
            }
        };
        this.c = new LruCache<String, sg.bigo.ads.an.c>(atomicInteger.get()) { // from class: sg.bigo.ads.bj.c.2
            @Override // android.util.LruCache
            protected final /* synthetic */ int sizeOf(@NonNull String str, @NonNull sg.bigo.ads.an.c cVar) {
                return cVar.a.getByteCount();
            }
        };
    }

    /* synthetic */ c(byte b) {
        this();
    }

    static c a(Context context) {
        AtomicInteger atomicInteger = a;
        if (atomicInteger.get() == 0) {
            atomicInteger.set(q.c(context));
            atomicInteger.get();
        }
        return a.a;
    }
}
