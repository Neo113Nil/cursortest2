package yads;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class tn3 implements xj0 {
    public static final /* synthetic */ KProperty[] c = {ra.a(tn3.class, "cacheListener", "getCacheListener()Lcom/monetization/ads/nativeads/video/cache/VideoCacheListener;", 0)};
    public static final List d;
    public static final List e;
    public static final List f;
    public final String a;
    public final qm2 b;

    static {
        List listOf = CollectionsKt.listOf((Object[]) new Integer[]{3, 4});
        d = listOf;
        List listOf2 = CollectionsKt.listOf((Object[]) new Integer[]{1, 5});
        e = listOf2;
        f = CollectionsKt.plus((Collection) listOf, (Iterable) listOf2);
    }

    public tn3(String str, kh3 kh3Var) {
        this.a = str;
        this.b = new qm2(kh3Var);
    }
}
