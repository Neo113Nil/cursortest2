package com.google.firebase.storage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TaskState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/storage/TaskState;", "T", "", "<init>", "()V", "InProgress", "Paused", "com.google.firebase-firebase-storage"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TaskState<T> {
    public /* synthetic */ TaskState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TaskState() {
    }

    /* compiled from: TaskState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/google/firebase/storage/TaskState$InProgress;", "T", "Lcom/google/firebase/storage/TaskState;", "snapshot", "<init>", "(Ljava/lang/Object;)V", "getSnapshot", "()Ljava/lang/Object;", "Ljava/lang/Object;", "com.google.firebase-firebase-storage"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InProgress<T> extends TaskState<T> {
        private final T snapshot;

        public InProgress(T t) {
            super(null);
            this.snapshot = t;
        }

        public final T getSnapshot() {
            return this.snapshot;
        }
    }

    /* compiled from: TaskState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/google/firebase/storage/TaskState$Paused;", "T", "Lcom/google/firebase/storage/TaskState;", "snapshot", "<init>", "(Ljava/lang/Object;)V", "getSnapshot", "()Ljava/lang/Object;", "Ljava/lang/Object;", "com.google.firebase-firebase-storage"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Paused<T> extends TaskState<T> {
        private final T snapshot;

        public Paused(T t) {
            super(null);
            this.snapshot = t;
        }

        public final T getSnapshot() {
            return this.snapshot;
        }
    }
}
