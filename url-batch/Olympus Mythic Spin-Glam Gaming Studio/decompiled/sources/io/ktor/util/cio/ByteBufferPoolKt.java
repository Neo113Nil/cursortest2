package io.ktor.util.cio;

import io.ktor.utils.io.pool.ByteBufferPool;
import io.ktor.utils.io.pool.ObjectPool;

/* compiled from: ByteBufferPool.kt */
/* loaded from: classes15.dex */
public abstract class ByteBufferPoolKt {
    private static final ObjectPool KtorDefaultPool = new ByteBufferPool(2048, 4098);

    public static final ObjectPool getKtorDefaultPool() {
        return KtorDefaultPool;
    }
}
