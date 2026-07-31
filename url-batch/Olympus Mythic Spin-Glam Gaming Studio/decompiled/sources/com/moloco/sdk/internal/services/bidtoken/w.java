package com.moloco.sdk.internal.services.bidtoken;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.internal.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class w implements v {

    @NotNull
    public static final a e = new a(null);
    public static final int f = 8;

    @NotNull
    public static final String g = "ServerBidTokenCache";
    public static final long h = 15;
    public static final long i = 2;

    @NotNull
    public final com.moloco.sdk.internal.bidtoken.b b;

    @NotNull
    public final I c;

    @NotNull
    public k d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenCacheImpl", f = "ServerBidTokenCache.kt", l = {62}, m = "tokenStatus")
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return w.this.a(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenCacheImpl", f = "ServerBidTokenCache.kt", l = {95, 98}, m = "updateCache")
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return w.this.a(null, this);
        }
    }

    public w(@NotNull com.moloco.sdk.internal.bidtoken.b bidTokenParser, @NotNull I timeProviderService) {
        Intrinsics.checkNotNullParameter(bidTokenParser, "bidTokenParser");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.b = bidTokenParser;
        this.c = timeProviderService;
        this.d = new k("", "", e.a());
    }

    @VisibleForTesting
    public static /* synthetic */ void d() {
    }

    public final void a(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.d = kVar;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.v
    public void b() {
        this.d = new k("", "", e.a());
    }

    @NotNull
    public final k c() {
        return this.d;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.v
    @NotNull
    public k a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.moloco.sdk.internal.services.bidtoken.v
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull Continuation continuation) {
        b bVar;
        int i2;
        w wVar;
        com.moloco.sdk.internal.x xVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.d = i3 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bVar.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (a().d().length() == 0) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, g, "[Thread: " + Thread.currentThread().getName() + "] cached bidToken is empty, needs refresh", null, false, 12, null);
                        return B.a;
                    }
                    com.moloco.sdk.internal.bidtoken.b bVar2 = this.b;
                    String d = a().d();
                    bVar.a = this;
                    bVar.d = 1;
                    obj = bVar2.a(d, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar = (w) bVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                xVar = (com.moloco.sdk.internal.x) obj;
                if (!(xVar instanceof x.a)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, g, "[Thread: " + Thread.currentThread().getName() + "] Failed to parse cached token for expiration, needs refresh", null, false, 12, null);
                    return B.a;
                }
                if (xVar instanceof x.b) {
                    com.moloco.sdk.internal.bidtoken.a aVar = (com.moloco.sdk.internal.bidtoken.a) ((x.b) xVar).a();
                    long a2 = wVar.c.a();
                    if (x.a(aVar, a2)) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, g, "[Thread: " + Thread.currentThread().getName() + "] Bid token expired, needs refresh", null, false, 12, null);
                        return B.a;
                    }
                    if (x.b(aVar, a2)) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, g, "[Thread: " + Thread.currentThread().getName() + "] Bid token is near expiry. It will expire soon", null, false, 12, null);
                        return B.b;
                    }
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, g, "[Thread: " + Thread.currentThread().getName() + "] Bid token has not expired", null, false, 12, null);
                    MolocoLogger.info$default(molocoLogger, g, "[Thread: " + Thread.currentThread().getName() + "] Bid token doesn't need refresh", null, false, 12, null);
                    return B.c;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bVar.d;
        if (i2 != 0) {
        }
        xVar = (com.moloco.sdk.internal.x) obj2;
        if (!(xVar instanceof x.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.moloco.sdk.internal.services.bidtoken.v
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull k kVar, @NotNull Continuation continuation) {
        c cVar;
        int i2;
        w wVar;
        com.moloco.sdk.internal.x xVar;
        k kVar2;
        com.moloco.sdk.internal.bidtoken.a aVar;
        w wVar2;
        com.moloco.sdk.internal.x xVar2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i3 = cVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.f = i3 - Integer.MIN_VALUE;
                Object obj = cVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = cVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    a("[Thread: " + Thread.currentThread().getName() + "] Acquired lock, checking for new token expiry");
                    if (Intrinsics.areEqual(this.d.d(), "")) {
                        this.d = kVar;
                        a("[Thread: " + Thread.currentThread().getName() + "] Updated cache with new bidToken as existing token was empty");
                        return Unit.INSTANCE;
                    }
                    com.moloco.sdk.internal.bidtoken.b bVar = this.b;
                    String d = kVar.d();
                    cVar.a = this;
                    cVar.b = kVar;
                    cVar.f = 1;
                    obj = bVar.a(d, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (com.moloco.sdk.internal.bidtoken.a) cVar.c;
                        kVar2 = (k) cVar.b;
                        wVar2 = (w) cVar.a;
                        ResultKt.throwOnFailure(obj);
                        xVar2 = (com.moloco.sdk.internal.x) obj;
                        if (!(xVar2 instanceof x.b)) {
                            if (aVar.a() > ((com.moloco.sdk.internal.bidtoken.a) ((x.b) xVar2).a()).a()) {
                                wVar2.d = kVar2;
                                wVar2.a("[Thread: " + Thread.currentThread().getName() + "] Updated cache with new bidToken");
                            } else {
                                wVar2.a("[Thread: " + Thread.currentThread().getName() + "] New token's expiration is not greater than the existing token's expiration. Cache not updated.");
                            }
                        } else {
                            wVar2.d = kVar2;
                            wVar2.a("[Thread: " + Thread.currentThread().getName() + "] Current token parsing failed. Updated cache with new bidToken");
                        }
                        return Unit.INSTANCE;
                    }
                    kVar = (k) cVar.b;
                    wVar = (w) cVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                xVar = (com.moloco.sdk.internal.x) obj;
                if (!(xVar instanceof x.b)) {
                    com.moloco.sdk.internal.bidtoken.a aVar2 = (com.moloco.sdk.internal.bidtoken.a) ((x.b) xVar).a();
                    com.moloco.sdk.internal.bidtoken.b bVar2 = wVar.b;
                    String d2 = wVar.d.d();
                    cVar.a = wVar;
                    cVar.b = kVar;
                    cVar.c = aVar2;
                    cVar.f = 2;
                    Object a2 = bVar2.a(d2, cVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kVar2 = kVar;
                    aVar = aVar2;
                    obj = a2;
                    wVar2 = wVar;
                    xVar2 = (com.moloco.sdk.internal.x) obj;
                    if (!(xVar2 instanceof x.b)) {
                    }
                    return Unit.INSTANCE;
                }
                wVar.a("[Thread: " + Thread.currentThread().getName() + "] New token parsing failed. Cache not updated.");
                return Unit.INSTANCE;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = cVar.f;
        if (i2 != 0) {
        }
        xVar = (com.moloco.sdk.internal.x) obj2;
        if (!(xVar instanceof x.b)) {
        }
    }

    public final void a(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, g, "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, false, 4, null);
    }
}
