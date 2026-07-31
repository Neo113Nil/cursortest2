package io.ktor.utils.io.pool;

/* compiled from: Pool.kt */
/* loaded from: classes12.dex */
public interface ObjectPool extends AutoCloseable {
    Object borrow();

    void dispose();

    void recycle(Object obj);

    /* compiled from: Pool.kt */
    public static final class DefaultImpls {
        public static void close(ObjectPool objectPool) {
            objectPool.dispose();
        }
    }
}
