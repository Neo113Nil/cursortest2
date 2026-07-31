package io.ktor.utils.io.pool;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ByteBufferPools.kt */
/* loaded from: classes4.dex */
public final class ByteBufferPool extends DefaultPool {
    private final int bufferSize;

    public ByteBufferPool(int i, int i2) {
        super(i);
        this.bufferSize = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.io.pool.DefaultPool
    public ByteBuffer produceInstance() {
        ByteBuffer allocate = ByteBuffer.allocate(this.bufferSize);
        Intrinsics.checkNotNull(allocate);
        return allocate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.io.pool.DefaultPool
    public ByteBuffer clearInstance(ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.io.pool.DefaultPool
    public void validateInstance(ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.capacity() != this.bufferSize) {
            throw new IllegalStateException("Check failed.");
        }
        if (instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
