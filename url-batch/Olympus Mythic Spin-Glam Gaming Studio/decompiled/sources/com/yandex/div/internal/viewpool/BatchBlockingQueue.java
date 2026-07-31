package com.yandex.div.internal.viewpool;

import com.safedk.android.analytics.brandsafety.m;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BatchBlockingQueue.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0082\b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0015\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010 J\u000f\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J$\u0010)\u001a\u00020\u00122\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120'H\u0086\b¢\u0006\u0004\b)\u0010*J*\u0010+\u001a\u00020\u00162\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u00160'H\u0086\b¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u00020$2\u0010\u0010.\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J)\u0010/\u001a\u00020$2\u0010\u0010.\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010-2\u0006\u00101\u001a\u00020$H\u0016¢\u0006\u0004\b/\u00102J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0096\u0002¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0016¢\u0006\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010@\u001a\n ?*\u0004\u0018\u00010>0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010&¨\u0006D"}, d2 = {"Lcom/yandex/div/internal/viewpool/BatchBlockingQueue;", "E", "Ljava/util/AbstractQueue;", "Ljava/util/concurrent/BlockingQueue;", "Ljava/util/Queue;", "backingQueue", "<init>", "(Ljava/util/Queue;)V", "", "notSupported", "()Ljava/lang/Void;", "R", "Lkotlin/Function0;", "action", "locked", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lockedInterruptibly", "element", "", m.l, "(Ljava/lang/Object;)Z", "offer", "", "put", "(Ljava/lang/Object;)V", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z", "poll", "()Ljava/lang/Object;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "take", "peek", "remove", "", "remainingCapacity", "()I", "Lkotlin/Function1;", "predicate", "removeFirstIf", "(Lkotlin/jvm/functions/Function1;)Z", "batch", "(Lkotlin/jvm/functions/Function1;)V", "", "c", "drainTo", "(Ljava/util/Collection;)I", "maxElements", "(Ljava/util/Collection;I)I", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/Spliterator;", "spliterator", "()Ljava/util/Spliterator;", "queue", "Ljava/util/Queue;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "notEmpty", "Ljava/util/concurrent/locks/Condition;", "getSize", "size", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatchBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E> {

    @NotNull
    private final ReentrantLock lock;
    private final Condition notEmpty;

    @NotNull
    private final Queue<E> queue;

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    public BatchBlockingQueue(@NotNull Queue<E> queue) {
        this.queue = queue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.notEmpty = reentrantLock.newCondition();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E element) {
        return offer(element);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E element) {
        offer(element);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E element, long timeout, @NotNull TimeUnit unit) {
        return offer(element);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@Nullable Collection<? super E> c) {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@Nullable Collection<? super E> c, int maxElements) {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Spliterator<E> spliterator() {
        notSupported();
        throw new KotlinNothingValueException();
    }

    private final Void notSupported() {
        throw new UnsupportedOperationException();
    }

    private final <R> R locked(Function0 action) {
        this.lock.lock();
        try {
            return (R) action.mo4828invoke();
        } finally {
            InlineMarker.finallyStart(1);
            this.lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void batch(@NotNull Function1 batch) {
        this.lock.lock();
        try {
            batch.invoke(this);
            Unit unit = Unit.INSTANCE;
        } finally {
            InlineMarker.finallyStart(1);
            this.lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    public int getSize() {
        this.lock.lock();
        try {
            return this.queue.size();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E element) {
        this.lock.lock();
        try {
            this.queue.offer(element);
            this.notEmpty.signal();
            Unit unit = Unit.INSTANCE;
            this.lock.unlock();
            return true;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.Queue
    public E peek() {
        this.lock.lock();
        try {
            return this.queue.peek();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.Queue
    @Nullable
    public E poll() {
        this.lock.lock();
        try {
            return this.queue.poll();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object element) {
        this.lock.lock();
        try {
            return this.queue.remove(element);
        } finally {
            this.lock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeFirstIf(@NotNull Function1 predicate) {
        this.lock.lock();
        boolean z = true;
        try {
            Iterator<E> it = this.queue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                    break;
                }
            }
            InlineMarker.finallyStart(2);
            this.lock.unlock();
            InlineMarker.finallyEnd(2);
            return z;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            this.lock.unlock();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private final <R> R lockedInterruptibly(Function0 action) {
        this.lock.lockInterruptibly();
        try {
            return (R) action.mo4828invoke();
        } finally {
            InlineMarker.finallyStart(1);
            this.lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    @Nullable
    public E poll(long timeout, @NotNull TimeUnit unit) throws InterruptedException {
        this.lock.lockInterruptibly();
        try {
            long nanos = unit.toNanos(timeout);
            while (this.queue.isEmpty() && nanos > 0) {
                nanos = this.notEmpty.awaitNanos(nanos);
            }
            E poll = this.queue.poll();
            this.lock.unlock();
            return poll;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this.lock.lockInterruptibly();
        while (this.queue.isEmpty()) {
            try {
                this.notEmpty.await();
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        E poll = this.queue.poll();
        this.lock.unlock();
        return poll;
    }
}
