package io.ktor.utils.io.pool;

/* compiled from: ByteArrayPool.kt */
/* loaded from: classes14.dex */
public abstract class ByteArrayPoolKt {
    private static final ObjectPool ByteArrayPool = new DefaultPool() { // from class: io.ktor.utils.io.pool.ByteArrayPoolKt$ByteArrayPool$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public byte[] produceInstance() {
            return new byte[4096];
        }
    };

    public static final ObjectPool getByteArrayPool() {
        return ByteArrayPool;
    }
}
