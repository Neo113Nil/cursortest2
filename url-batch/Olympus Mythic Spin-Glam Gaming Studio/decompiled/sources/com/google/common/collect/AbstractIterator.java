package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class AbstractIterator extends UnmodifiableIterator {
    private Object next;
    private State state = State.NOT_READY;

    private enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract Object computeNext();

    protected AbstractIterator() {
    }

    protected final Object endOfData() {
        this.state = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.state != State.FAILED);
        int ordinal = this.state.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            return tryToComputeNext();
        }
        return false;
    }

    private boolean tryToComputeNext() {
        this.state = State.FAILED;
        this.next = computeNext();
        if (this.state == State.DONE) {
            return false;
        }
        this.state = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = State.NOT_READY;
        Object uncheckedCastNullableTToT = NullnessCasts.uncheckedCastNullableTToT(this.next);
        this.next = null;
        return uncheckedCastNullableTToT;
    }
}
