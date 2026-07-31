package com.ogury.ad.async;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tJ\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J/\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0011\u001a\u0002H\u0010H\u0002¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ogury/ad/async/Completable;", "Lcom/ogury/ad/async/Disposable;", "jobAction", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "disposed", "", "errorConsumer", "Lkotlin/Function1;", "", "dispose", "doOnError", "consumer", "sendResultOnMainThread", "action", "R", "item", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "setDisposed", "subscribe", "subscribedAction", "Companion", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Completable implements Disposable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean disposed;

    @Nullable
    private Function1 errorConsumer;

    @NotNull
    private final Function0 jobAction;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/ogury/ad/async/Completable$Companion;", "", "()V", "fromAction", "Lcom/ogury/ad/async/Completable;", "action", "Lkotlin/Function0;", "", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Completable fromAction(@NotNull Function0 action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new Completable(action, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Completable(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    private final void sendResultOnMainThread(final Function0 action) {
        Schedulers.INSTANCE.mainThread().scheduleJob(new Runnable() { // from class: com.ogury.ad.async.Completable$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Completable.sendResultOnMainThread$lambda$1(Completable.this, action);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendResultOnMainThread$lambda$1(Completable this$0, Function0 action) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(action, "$action");
        if (this$0.disposed) {
            return;
        }
        action.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendResultOnMainThread$lambda$2(Completable this$0, Function1 consumer, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        if (this$0.disposed) {
            return;
        }
        consumer.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$0(Completable this$0, Function0 subscribedAction) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(subscribedAction, "$subscribedAction");
        try {
            this$0.jobAction.mo4828invoke();
            this$0.sendResultOnMainThread(subscribedAction);
        } catch (Throwable th) {
            Function1 function1 = this$0.errorConsumer;
            if (function1 == null) {
                return;
            }
            this$0.sendResultOnMainThread(function1, th);
        }
    }

    @Override // com.ogury.ad.async.Disposable
    public void dispose() {
        this.errorConsumer = null;
        this.disposed = true;
    }

    @NotNull
    public final Completable doOnError(@NotNull Function1 consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.errorConsumer = consumer;
        return this;
    }

    public final void setDisposed(boolean disposed) {
        this.disposed = disposed;
    }

    @NotNull
    public final Disposable subscribe(@NotNull final Function0 subscribedAction) {
        Intrinsics.checkNotNullParameter(subscribedAction, "subscribedAction");
        Schedulers.INSTANCE.background().scheduleJob(new Runnable() { // from class: com.ogury.ad.async.Completable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Completable.subscribe$lambda$0(Completable.this, subscribedAction);
            }
        });
        return this;
    }

    private Completable(Function0 function0) {
        this.jobAction = function0;
    }

    private final <R> void sendResultOnMainThread(final Function1 consumer, final R item) {
        Schedulers.INSTANCE.mainThread().scheduleJob(new Runnable() { // from class: com.ogury.ad.async.Completable$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Completable.sendResultOnMainThread$lambda$2(Completable.this, consumer, item);
            }
        });
    }
}
