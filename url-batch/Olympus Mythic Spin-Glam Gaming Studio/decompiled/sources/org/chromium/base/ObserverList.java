package org.chromium.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.chromium.base.ThreadUtils;

/* loaded from: classes10.dex */
public class ObserverList implements Iterable {
    private int mCount;
    private int mIterationDepth;
    private boolean mNeedsCompact;
    public final List mObservers = new ArrayList();
    private boolean mEnableThreadAsserts = true;
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();

    public void disableThreadAsserts() {
        this.mEnableThreadAsserts = false;
    }

    public boolean addObserver(Object obj) {
        assertSameThreadUsed();
        if (obj == null || this.mObservers.contains(obj)) {
            return false;
        }
        this.mObservers.add(obj);
        this.mCount++;
        return true;
    }

    public boolean removeObserver(Object obj) {
        int indexOf;
        assertSameThreadUsed();
        if (obj == null || (indexOf = this.mObservers.indexOf(obj)) == -1) {
            return false;
        }
        if (this.mIterationDepth == 0) {
            this.mObservers.remove(indexOf);
        } else {
            this.mNeedsCompact = true;
            this.mObservers.set(indexOf, null);
        }
        this.mCount--;
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        assertSameThreadUsed();
        return new ObserverListIterator();
    }

    public boolean isEmpty() {
        assertSameThreadUsed();
        return this.mCount == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void assertSameThreadUsed() {
        if (this.mEnableThreadAsserts) {
            try {
                this.mThreadChecker.assertOnValidThread();
            } catch (AssertionError e) {
                throw new AssertionError("ObserverList is not thread-safe; Observers MUST be added, removed and will be notified on the thread that created the ObserverList.", e);
            }
        }
    }

    private void compact() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            if (this.mObservers.get(size) == null) {
                this.mObservers.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementIterationDepth() {
        this.mIterationDepth++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementIterationDepthAndCompactIfNeeded() {
        int i = this.mIterationDepth - 1;
        this.mIterationDepth = i;
        if (i <= 0 && this.mNeedsCompact) {
            this.mNeedsCompact = false;
            compact();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int capacity() {
        return this.mObservers.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object getObserverAt(int i) {
        return this.mObservers.get(i);
    }

    private class ObserverListIterator implements Iterator {
        private int mIndex;
        private boolean mIsExhausted;
        private int mListEndMarker;

        private ObserverListIterator() {
            ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = ObserverList.this.capacity();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            ObserverList.this.assertSameThreadUsed();
            int i = this.mIndex;
            while (i < this.mListEndMarker && ObserverList.this.getObserverAt(i) == null) {
                i++;
            }
            if (i < this.mListEndMarker) {
                return true;
            }
            compactListIfNeeded();
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            ObserverList.this.assertSameThreadUsed();
            while (true) {
                int i = this.mIndex;
                if (i >= this.mListEndMarker || ObserverList.this.getObserverAt(i) != null) {
                    break;
                }
                this.mIndex++;
            }
            int i2 = this.mIndex;
            if (i2 >= this.mListEndMarker) {
                compactListIfNeeded();
                throw new NoSuchElementException();
            }
            ObserverList observerList = ObserverList.this;
            this.mIndex = i2 + 1;
            return observerList.getObserverAt(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private void compactListIfNeeded() {
            if (this.mIsExhausted) {
                return;
            }
            this.mIsExhausted = true;
            ObserverList.this.decrementIterationDepthAndCompactIfNeeded();
        }
    }
}
