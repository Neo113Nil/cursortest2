package com.moloco.sdk.internal.services.usertracker;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class g implements f {
    public static final int d = 8;

    @NotNull
    public final e a;

    @NotNull
    public final com.moloco.sdk.internal.services.usertracker.b b;

    @NotNull
    public final Mutex c;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.usertracker.UserTrackerServiceImpl", f = "UserTrackerService.kt", l = {48, 29}, m = "clear")
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return g.this.a(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.usertracker.UserTrackerServiceImpl", f = "UserTrackerService.kt", l = {48, 33, 36}, m = "getIdentifier")
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return g.this.b(this);
        }
    }

    public g(@NotNull e idGenerator, @NotNull com.moloco.sdk.internal.services.usertracker.b idRepository) {
        Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
        Intrinsics.checkNotNullParameter(idRepository, "idRepository");
        this.a = idGenerator;
        this.b = idRepository;
        this.c = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.moloco.sdk.internal.services.usertracker.f
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull Continuation continuation) {
        a aVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        g gVar;
        com.moloco.sdk.internal.services.usertracker.b bVar;
        Mutex mutex2;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.e = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.c;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.c;
                        aVar.a = this;
                        aVar.b = mutex;
                        aVar.e = 1;
                        if (mutex.lock(null, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        gVar = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) aVar.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                return unit;
                            } catch (Throwable th) {
                                Mutex mutex3 = mutex2;
                                th = th;
                                mutex = mutex3;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex4 = (Mutex) aVar.b;
                        gVar = (g) aVar.a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex4;
                    }
                    bVar = gVar.b;
                    aVar.a = mutex;
                    aVar.b = null;
                    aVar.e = 2;
                    if (bVar.a(aVar) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit2;
                }
            }
            bVar = gVar.b;
            aVar.a = mutex;
            aVar.b = null;
            aVar.e = 2;
            if (bVar.a(aVar) != coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.e;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:26:0x004c, B:27:0x0085, B:29:0x0089), top: B:25:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.moloco.sdk.internal.services.usertracker.f
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(@NotNull Continuation continuation) {
        b bVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        g gVar;
        Mutex mutex2;
        Throwable th;
        Object b2;
        g gVar2;
        Mutex mutex3;
        String str;
        String str2;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i2 = bVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.e = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.c;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.c;
                        bVar.a = this;
                        bVar.b = mutex;
                        bVar.e = 1;
                        if (mutex.lock(null, bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        gVar = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str2 = (String) bVar.b;
                                mutex2 = (Mutex) bVar.a;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    mutex2.unlock(null);
                                    return str2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mutex3 = mutex2;
                                    mutex3.unlock(null);
                                    throw th;
                                }
                            }
                            mutex3 = (Mutex) bVar.b;
                            gVar2 = (g) bVar.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                str = (String) obj;
                                if (str == null) {
                                    str = gVar2.a.a();
                                    com.moloco.sdk.internal.services.usertracker.b bVar2 = gVar2.b;
                                    bVar.a = mutex3;
                                    bVar.b = str;
                                    bVar.e = 3;
                                    if (bVar2.a(str, bVar) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                str2 = str;
                                mutex2 = mutex3;
                                mutex2.unlock(null);
                                return str2;
                            } catch (Throwable th3) {
                                th = th3;
                                mutex3.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex4 = (Mutex) bVar.b;
                        gVar = (g) bVar.a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex4;
                    }
                    com.moloco.sdk.internal.services.usertracker.b bVar3 = gVar.b;
                    bVar.a = gVar;
                    bVar.b = mutex;
                    bVar.e = 2;
                    b2 = bVar3.b(bVar);
                    if (b2 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gVar2 = gVar;
                    mutex3 = mutex;
                    obj = b2;
                    str = (String) obj;
                    if (str == null) {
                    }
                    str2 = str;
                    mutex2 = mutex3;
                    mutex2.unlock(null);
                    return str2;
                }
            }
            com.moloco.sdk.internal.services.usertracker.b bVar32 = gVar.b;
            bVar.a = gVar;
            bVar.b = mutex;
            bVar.e = 2;
            b2 = bVar32.b(bVar);
            if (b2 != coroutine_suspended) {
            }
        } catch (Throwable th4) {
            mutex2 = mutex;
            th = th4;
            mutex3 = mutex2;
            mutex3.unlock(null);
            throw th;
        }
        bVar = new b(continuation);
        Object obj2 = bVar.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
    }
}
