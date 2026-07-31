package kotlinx.serialization.json.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;

/* compiled from: ArrayPools.kt */
/* loaded from: classes5.dex */
public abstract class ArrayPoolsKt {
    private static final int MAX_CHARS_IN_POOL;

    static {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            m8023constructorimpl = Result.m8023constructorimpl(property != null ? StringsKt.toIntOrNull(property) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Integer num = (Integer) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
        MAX_CHARS_IN_POOL = num != null ? num.intValue() : 2097152;
    }
}
