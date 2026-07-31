package com.ogury.ad.async;

import com.ogury.ad.internal.ph;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 !*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001!B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\t\"\u0004\b\u0001\u0010\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u001a\u0010\u0018J!\u0010\u001b\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/ogury/ad/async/Single;", "T", "Lcom/ogury/ad/async/Disposable;", "Lkotlin/Function0;", "callable", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "R", "Lkotlin/Function1;", "", "consumer", "item", "sendResultOnMainThread", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "dispose", "()V", "", "disposed", "setDisposed", "(Z)V", "getDisposed", "()Z", "Lcom/ogury/ad/internal/ph;", "doOnError", "(Lkotlin/jvm/functions/Function1;)Lcom/ogury/ad/async/Single;", "work", "doInBackground", "subscribe", "(Lkotlin/jvm/functions/Function1;)Lcom/ogury/ad/async/Disposable;", "Lkotlin/jvm/functions/Function0;", "Z", "errorConsumer", "Lkotlin/jvm/functions/Function1;", "Companion", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Single<T> implements Disposable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Function0 callable;
    private boolean disposed;

    @Nullable
    private Function1 errorConsumer;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007¨\u0006\b"}, d2 = {"Lcom/ogury/ad/async/Single$Companion;", "", "()V", "fromCallable", "Lcom/ogury/ad/async/Single;", "T", "callable", "Lkotlin/Function0;", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Single<T> fromCallable(@NotNull Function0 callable) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return new Single<>(callable, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Single(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    private final <R> void sendResultOnMainThread(final Function1 consumer, final R item) {
        Schedulers.INSTANCE.mainThread().scheduleJob(new Runnable() { // from class: com.ogury.ad.async.Single$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Single.sendResultOnMainThread$lambda$1(Single.this, consumer, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendResultOnMainThread$lambda$1(Single this$0, Function1 consumer, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        if (this$0.disposed) {
            return;
        }
        consumer.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$0(Single this$0, Function1 consumer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        try {
            this$0.sendResultOnMainThread(consumer, this$0.callable.mo4828invoke());
        } catch (ph e) {
            Function1 function1 = this$0.errorConsumer;
            if (function1 == null) {
                return;
            }
            this$0.sendResultOnMainThread(function1, e);
        }
    }

    @Override // com.ogury.ad.async.Disposable
    public void dispose() {
        this.errorConsumer = null;
        this.disposed = true;
    }

    @NotNull
    public final <R> Single<R> doInBackground(@NotNull final Function1 work) {
        Intrinsics.checkNotNullParameter(work, "work");
        return new Single<>(new Function0() { // from class: com.ogury.ad.async.Single$doInBackground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final R mo4828invoke() {
                Function0 function0;
                Function1 function1 = Function1.this;
                function0 = ((Single) this).callable;
                return function1.invoke(function0.mo4828invoke());
            }
        });
    }

    @NotNull
    public final Single<T> doOnError(@NotNull Function1 consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.errorConsumer = consumer;
        return this;
    }

    public final boolean getDisposed() {
        return this.disposed;
    }

    public final void setDisposed(boolean disposed) {
        this.disposed = disposed;
    }

    @NotNull
    public final Disposable subscribe(@NotNull final Function1 consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Schedulers.INSTANCE.background().scheduleJob(new Runnable() { // from class: com.ogury.ad.async.Single$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Single.subscribe$lambda$0(Single.this, consumer);
            }
        });
        return this;
    }

    private Single(Function0 function0) {
        this.callable = function0;
    }
}
