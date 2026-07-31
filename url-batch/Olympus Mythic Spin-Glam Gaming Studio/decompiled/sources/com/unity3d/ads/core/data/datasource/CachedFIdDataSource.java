package com.unity3d.ads.core.data.datasource;

import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CachedFIdDataSource.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\nH\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/CachedFIdDataSource;", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "dataSource", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/datasource/FIdDataSource;)V", X3.i.r, "Ljava/util/concurrent/atomic/AtomicBoolean;", "value", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CachedFIdDataSource implements FIdDataSource {

    @NotNull
    private final FIdDataSource dataSource;

    @NotNull
    private AtomicBoolean loaded;

    @NotNull
    private CoroutineScope scope;

    @Nullable
    private volatile String value;

    public CachedFIdDataSource(@NotNull CoroutineDispatcher dispatcher, @NotNull FIdDataSource dataSource) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.loaded = new AtomicBoolean(false);
        CoroutineScope plus = CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(dispatcher), new CachedFIdDataSource$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
        this.scope = plus;
        launch$default = BuildersKt__Builders_commonKt.launch$default(plus, null, null, new AnonymousClass1(null), 3, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: com.unity3d.ads.core.data.datasource.CachedFIdDataSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$1;
                _init_$lambda$1 = CachedFIdDataSource._init_$lambda$1(CachedFIdDataSource.this, (Throwable) obj);
                return _init_$lambda$1;
            }
        });
    }

    /* compiled from: CachedFIdDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1", f = "CachedFIdDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CachedFIdDataSource.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CachedFIdDataSource cachedFIdDataSource = CachedFIdDataSource.this;
            cachedFIdDataSource.value = cachedFIdDataSource.dataSource.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(CachedFIdDataSource cachedFIdDataSource, Throwable th) {
        CoroutineScopeKt.cancel$default(cachedFIdDataSource.scope, null, 1, null);
        cachedFIdDataSource.loaded.set(true);
        return Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    @Nullable
    public String invoke() {
        if (this.loaded.get()) {
            return this.value;
        }
        return null;
    }
}
