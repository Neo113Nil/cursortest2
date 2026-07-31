package com.ogury.ad.internal;

import android.os.Handler;
import android.os.Looper;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class v6 {
    public static final v6 a = new v6();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final Handler c = new Handler(Looper.getMainLooper());
    public static final Runnable d = new Runnable() { // from class: com.ogury.ad.internal.v6$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            v6.a();
        }
    };
    public static final le e = le.a;
    public static final qh f = new qh();

    public static final void a() {
        b();
    }

    public static void b() {
        Logger logger = Logger.INSTANCE;
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        ConcurrentHashMap concurrentHashMap = b;
        logger.d(logTag, sourceTag, "clean cache " + concurrentHashMap.size());
        c();
        d();
        logger.d(logTag, sourceTag, "after cache " + concurrentHashMap.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u6 c() {
        q8 q8Var;
        Long l;
        Iterator it = b.entrySet().iterator();
        while (it.hasNext()) {
            u6 mraidCacheItem = (u6) ((Map.Entry) it.next()).getValue();
            Intrinsics.checkNotNullParameter(mraidCacheItem, "mraidCacheItem");
            f.getClass();
            long currentTimeMillis = System.currentTimeMillis() - mraidCacheItem.d;
            x1 x1Var = mraidCacheItem.c.G;
            if (x1Var == null || (l = x1Var.a) == null) {
                e.getClass();
                if (currentTimeMillis > TimeUnit.SECONDS.toMillis(le.b.d.e)) {
                    it.remove();
                    g5 g5Var = g5.a;
                    g5.a(new th("expired", mraidCacheItem.c));
                    q8Var = (q8) mraidCacheItem.a.get();
                    if (q8Var != null) {
                        ((o0) q8Var).a(mraidCacheItem.c);
                    }
                    return mraidCacheItem;
                }
            } else if (currentTimeMillis > TimeUnit.SECONDS.toMillis(l.longValue())) {
                it.remove();
                g5 g5Var2 = g5.a;
                g5.a(new th("expired", mraidCacheItem.c));
                q8Var = (q8) mraidCacheItem.a.get();
                if (q8Var != null) {
                }
                return mraidCacheItem;
            }
        }
        return null;
    }

    public static void d() {
        Iterator it = b.entrySet().iterator();
        while (it.hasNext()) {
            if (((u6) ((Map.Entry) it.next()).getValue()).a.get() == null) {
                it.remove();
            }
        }
        Handler handler = c;
        handler.removeCallbacksAndMessages(null);
        if (b.isEmpty()) {
            return;
        }
        handler.postDelayed(d, 1200000L);
    }
}
