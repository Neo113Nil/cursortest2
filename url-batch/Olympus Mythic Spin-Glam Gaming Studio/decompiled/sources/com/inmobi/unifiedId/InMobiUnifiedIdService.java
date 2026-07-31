package com.inmobi.unifiedId;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.adjust.sdk.Constants;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.AbstractC4002fj;
import com.inmobi.media.AbstractC4015g4;
import com.inmobi.media.AbstractC4132kh;
import com.inmobi.media.AbstractC4216nl;
import com.inmobi.media.AbstractC4477xj;
import com.inmobi.media.C4058hl;
import com.inmobi.media.C4070i7;
import com.inmobi.media.C4084il;
import com.inmobi.media.C4277q4;
import com.inmobi.media.C4425vk;
import com.inmobi.media.EnumC4530zk;
import com.inmobi.media.Hh;
import com.inmobi.media.L9;
import com.inmobi.media.N3;
import com.inmobi.media.Pa;
import com.inmobi.media.Q9;
import com.inmobi.media.Qa;
import com.inmobi.media.R9;
import com.inmobi.media.S9;
import com.inmobi.media.T9;
import com.inmobi.media.U9;
import com.inmobi.media.V9;
import com.inmobi.media.W9;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.yandex.div.core.timer.TimerController;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0081@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUnifiedIdService;", "", "Lcom/inmobi/unifiedId/InMobiUserDataModel;", "inMobiUserDataModel", "", Constants.PUSH, "(Lcom/inmobi/unifiedId/InMobiUserDataModel;)V", "Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;", "inMobiUnifiedIdInterface", "fetchUnifiedIds", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;)V", "fetchUnifiedIdsInternal$media_release", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUnifiedIdsInternal", TimerController.RESET_COMMAND, "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled$annotations", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InMobiUnifiedIdService {

    @NotNull
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final Mutex b = MutexKt.Mutex$default(false, 1, null);

    public static final Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, Continuation continuation) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        JSONObject b2 = Q9.b();
        if (!AbstractC4216nl.b(b2) && b2 != null && AbstractC4216nl.c(b2)) {
            Object a2 = C4084il.a(inMobiUnifiedIdInterface, continuation);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
        }
        if (inMobiUnifiedIdInterface != null) {
            if (!AbstractC4216nl.b(b2)) {
                AbstractC4216nl.a(inMobiUnifiedIdInterface, b2, null);
            } else {
                if (a.get()) {
                    Object a3 = C4084il.a(inMobiUnifiedIdInterface, continuation);
                    return a3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : Unit.INSTANCE;
                }
                AbstractC4216nl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (com.inmobi.media.C4070i7.a(null, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$resetInternal(Continuation continuation) {
        W9 w9;
        int i;
        Object a2;
        if (continuation instanceof W9) {
            w9 = (W9) continuation;
            int i2 = w9.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w9.b = i2 - Integer.MIN_VALUE;
                Object obj = w9.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = w9.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                    a.set(false);
                    w9.b = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Q9.b(null);
                        Q9.a(null);
                        Q9.d = false;
                        Q9.c = false;
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                C4084il c4084il = C4084il.a;
                w9.b = 2;
                a2 = N3.a(C4084il.b, new C4058hl(null), w9);
                if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = Unit.INSTANCE;
                }
            }
        }
        w9 = new W9(continuation);
        Object obj2 = w9.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = w9.b;
        if (i != 0) {
        }
        C4084il c4084il2 = C4084il.a;
        w9.b = 2;
        a2 = N3.a(C4084il.b, new C4058hl(null), w9);
        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
    }

    public static final void fetchUnifiedIds(@Nullable InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (AbstractC4002fj.d()) {
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new R9(inMobiUnifiedIdInterface, null), 3, null);
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|(1:(6:(1:(1:11)(2:22|23))(1:24)|12|13|14|15|16)(1:25))(3:43|(1:45)|(2:47|48)(2:49|(2:51|52)(3:53|(1:55)(4:61|(1:63)|64|(1:66)(1:67))|(2:57|58)(1:59))))|26|27|(1:29)|(6:31|(3:33|34|35)|37|14|15|16)(1:38)|19|20|21))|68|6|(0)(0)|26|27|(0)|(0)(0)|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012e, code lost:
    
        if (a(r12, r0) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0138, code lost:
    
        r11 = r13;
        r13 = r12;
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0105, code lost:
    
        if (r13.lock(null, r0) == r1) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0115 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:27:0x0108, B:31:0x0115, B:38:0x0124), top: B:26:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124 A[Catch: all -> 0x0122, TRY_LEAVE, TryCatch #0 {all -> 0x0122, blocks: (B:27:0x0108, B:31:0x0115, B:38:0x0124), top: B:26:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @WorkerThread
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fetchUnifiedIdsInternal$media_release(@Nullable InMobiUnifiedIdInterface inMobiUnifiedIdInterface, @NotNull Continuation continuation) {
        S9 s9;
        int i;
        boolean booleanValue;
        Mutex mutex;
        Mutex mutex2;
        if (continuation instanceof S9) {
            s9 = (S9) continuation;
            int i2 = s9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s9.d = i2 - Integer.MIN_VALUE;
                Object obj = s9.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = s9.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                    HashMap hashMap = new HashMap();
                    C4425vk c4425vk = C4425vk.a;
                    C4425vk.b("FetchApiInvoked", hashMap, EnumC4530zk.a);
                    Hh hh = AbstractC4477xj.a;
                    C4277q4 c4277q4 = AbstractC4015g4.a;
                    Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                    boolean enabled = ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
                    if (!enabled) {
                        reset();
                    }
                    if (!enabled) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        AbstractC4216nl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
                        return Unit.INSTANCE;
                    }
                    if (AbstractC4216nl.c()) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        AbstractC4216nl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
                        return Unit.INSTANCE;
                    }
                    Boolean bool = AbstractC4132kh.b;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        Context context = AbstractC4002fj.a;
                        if (context != null) {
                            ConcurrentHashMap concurrentHashMap = Qa.b;
                            Qa a2 = Pa.a(context, "user_info_store");
                            Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                            AbstractC4132kh.b = Boolean.valueOf(a2.a.getBoolean("user_age_restricted", false));
                        }
                        Boolean bool2 = AbstractC4132kh.b;
                        booleanValue = bool2 != null ? bool2.booleanValue() : false;
                    }
                    if (booleanValue) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        AbstractC4216nl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
                        return Unit.INSTANCE;
                    }
                    mutex = b;
                    s9.a = inMobiUnifiedIdInterface;
                    s9.b = mutex;
                    s9.d = 1;
                } else if (i != 1) {
                    if (i == 2) {
                        mutex2 = (Mutex) s9.a;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) s9.a;
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return unit;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                    }
                } else {
                    Mutex mutex3 = s9.b;
                    InMobiUnifiedIdInterface inMobiUnifiedIdInterface2 = (InMobiUnifiedIdInterface) s9.a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    inMobiUnifiedIdInterface = inMobiUnifiedIdInterface2;
                }
                if (!(C4084il.b.b.get() != null)) {
                    s9.a = mutex;
                    s9.b = null;
                    s9.d = 2;
                    if (C4084il.a(inMobiUnifiedIdInterface, s9) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit2;
                }
                s9.a = mutex;
                s9.b = null;
                s9.d = 3;
                Throwable th22 = th;
                mutex2.unlock(null);
                throw th22;
            }
        }
        s9 = new S9(continuation);
        Object obj2 = s9.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = s9.d;
        if (i != 0) {
        }
        if (!(C4084il.b.b.get() != null)) {
        }
        Throwable th222 = th;
        mutex2.unlock(null);
        throw th222;
    }

    @VisibleForTesting
    public static /* synthetic */ void isPushCalled$annotations() {
    }

    public static final void push(@Nullable InMobiUserDataModel inMobiUserDataModel) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        Objects.toString(inMobiUserDataModel);
        if (AbstractC4002fj.d()) {
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new T9(inMobiUserDataModel, null), 3, null);
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public static final void reset() {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (AbstractC4002fj.d()) {
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new V9(null), 3, null);
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    @NotNull
    public final AtomicBoolean isPushCalled() {
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f5, code lost:
    
        if (r9.a((kotlin.coroutines.jvm.internal.ContinuationImpl) r0) != r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        if (com.inmobi.media.C4070i7.a(r9, r0) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, Continuation continuation) {
        U9 u9;
        int i;
        boolean booleanValue;
        InMobiUserDataModel inMobiUserDataModel2;
        if (continuation instanceof U9) {
            u9 = (U9) continuation;
            int i2 = u9.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u9.b = i2 - Integer.MIN_VALUE;
                Object obj = u9.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = u9.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                    Objects.toString(inMobiUserDataModel);
                    Hh hh = AbstractC4477xj.a;
                    C4277q4 c4277q4 = AbstractC4015g4.a;
                    Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                    boolean enabled = ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
                    if (!enabled) {
                        reset();
                    }
                    if (!enabled) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return Unit.INSTANCE;
                    }
                    if (AbstractC4216nl.c()) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return Unit.INSTANCE;
                    }
                    Boolean bool = AbstractC4132kh.b;
                    boolean z = false;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        Context context = AbstractC4002fj.a;
                        if (context != null) {
                            ConcurrentHashMap concurrentHashMap = Qa.b;
                            Qa a2 = Pa.a(context, "user_info_store");
                            Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                            AbstractC4132kh.b = Boolean.valueOf(a2.a.getBoolean("user_age_restricted", false));
                        }
                        Boolean bool2 = AbstractC4132kh.b;
                        booleanValue = bool2 != null ? bool2.booleanValue() : false;
                    }
                    if (booleanValue) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return Unit.INSTANCE;
                    }
                    C4070i7 c4070i7 = C4070i7.a;
                    if (inMobiUserDataModel == null && C4070i7.b == null) {
                        z = true;
                    } else if (inMobiUserDataModel != null && (inMobiUserDataModel2 = C4070i7.b) != null) {
                        z = Intrinsics.areEqual(inMobiUserDataModel, inMobiUserDataModel2);
                    }
                    if (z && a.get()) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return Unit.INSTANCE;
                    }
                    u9.b = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                a.set(true);
                C4084il c4084il = C4084il.a;
                u9.b = 2;
            }
        }
        u9 = new U9(continuation);
        Object obj2 = u9.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = u9.b;
        if (i != 0) {
        }
        a.set(true);
        C4084il c4084il2 = C4084il.a;
        u9.b = 2;
    }
}
