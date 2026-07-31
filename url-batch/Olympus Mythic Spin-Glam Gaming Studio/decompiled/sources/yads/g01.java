package yads;

import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes11.dex */
public final class g01 {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap a = b;

    public final boolean a(int i, String str) {
        Object m8023constructorimpl;
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(Boolean.valueOf(InetAddress.getByName(str).isReachable(i)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                m8023constructorimpl = null;
            }
            Boolean bool = (Boolean) m8023constructorimpl;
            obj = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        return ((Boolean) obj).booleanValue();
    }
}
