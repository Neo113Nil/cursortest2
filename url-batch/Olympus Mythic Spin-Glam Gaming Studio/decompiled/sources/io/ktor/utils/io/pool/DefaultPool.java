package io.ktor.utils.io.pool;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.ktor.utils.io.pool.ObjectPool;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DefaultPool.kt */
/* loaded from: classes5.dex */
public abstract class DefaultPool implements ObjectPool {
    private static final /* synthetic */ AtomicLongFieldUpdater top$FU = AtomicLongFieldUpdater.newUpdater(DefaultPool.class, ViewHierarchyConstants.DIMENSION_TOP_KEY);
    private final int capacity;
    private final AtomicReferenceArray instances;
    private final int maxIndex;
    private final int[] next;
    private final int shift;

    @NotNull
    private volatile /* synthetic */ long top;

    protected Object clearInstance(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return instance;
    }

    protected void disposeInstance(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    protected abstract Object produceInstance();

    protected void validateInstance(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }

    public DefaultPool(int i) {
        this.capacity = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i).toString());
        }
        if (i > 536870911) {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i).toString());
        }
        this.top = 0L;
        int highestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.maxIndex = highestOneBit;
        this.shift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
        this.instances = new AtomicReferenceArray(highestOneBit + 1);
        this.next = new int[highestOneBit + 1];
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final Object borrow() {
        Object clearInstance;
        Object tryPop = tryPop();
        return (tryPop == null || (clearInstance = clearInstance(tryPop)) == null) ? produceInstance() : clearInstance;
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void recycle(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        validateInstance(instance);
        if (tryPush(instance)) {
            return;
        }
        disposeInstance(instance);
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void dispose() {
        while (true) {
            Object tryPop = tryPop();
            if (tryPop == null) {
                return;
            } else {
                disposeInstance(tryPop);
            }
        }
    }

    private final boolean tryPush(Object obj) {
        int identityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.shift) + 1;
        for (int i = 0; i < 8; i++) {
            if (DefaultPool$$ExternalSyntheticBackportWithForwarding0.m(this.instances, identityHashCode, null, obj)) {
                pushTop(identityHashCode);
                return true;
            }
            identityHashCode--;
            if (identityHashCode == 0) {
                identityHashCode = this.maxIndex;
            }
        }
        return false;
    }

    private final Object tryPop() {
        int popTop = popTop();
        if (popTop == 0) {
            return null;
        }
        return this.instances.getAndSet(popTop, null);
    }

    private final void pushTop(int i) {
        long j;
        if (i <= 0) {
            throw new IllegalArgumentException("index should be positive");
        }
        do {
            j = this.top;
            this.next[i] = (int) (4294967295L & j);
        } while (!top$FU.compareAndSet(this, j, ((((j >> 32) & 4294967295L) + 1) << 32) | i));
    }

    private final int popTop() {
        long j;
        long j2;
        int i;
        do {
            j = this.top;
            if (j == 0) {
                return 0;
            }
            j2 = ((j >> 32) & 4294967295L) + 1;
            i = (int) (4294967295L & j);
            if (i == 0) {
                return 0;
            }
        } while (!top$FU.compareAndSet(this, j, (j2 << 32) | this.next[i]));
        return i;
    }
}
