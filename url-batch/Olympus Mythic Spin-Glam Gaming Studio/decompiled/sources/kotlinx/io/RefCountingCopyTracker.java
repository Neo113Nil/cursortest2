package kotlinx.io;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SegmentPool.kt */
/* loaded from: classes13.dex */
public final class RefCountingCopyTracker extends SegmentCopyTracker {
    public static final Companion Companion = new Companion(null);
    private static final AtomicIntegerFieldUpdater fieldUpdater = AtomicIntegerFieldUpdater.newUpdater(RefCountingCopyTracker.class, "copyCount");
    private volatile int copyCount;

    /* compiled from: SegmentPool.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlinx.io.SegmentCopyTracker
    public boolean getShared() {
        return this.copyCount > 0;
    }

    @Override // kotlinx.io.SegmentCopyTracker
    public void addCopy() {
        fieldUpdater.incrementAndGet(this);
    }

    @Override // kotlinx.io.SegmentCopyTracker
    public boolean removeCopy() {
        if (this.copyCount == 0) {
            return false;
        }
        int decrementAndGet = fieldUpdater.decrementAndGet(this);
        if (decrementAndGet >= 0) {
            return true;
        }
        if (decrementAndGet != -1) {
            throw new IllegalStateException(("Shared copies count is negative: " + (decrementAndGet + 1)).toString());
        }
        this.copyCount = 0;
        return false;
    }
}
