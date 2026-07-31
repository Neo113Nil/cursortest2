package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import io.ktor.client.HttpClient;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlGetRequestWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moloco-sdk_release", "url", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UrlGetRequestWorker extends CoroutineWorker {
    public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property0(new PropertyReference0Impl(UrlGetRequestWorker.class, "url", "<v#0>", 0))};
    public static final int b = 0;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker", f = "PersistentHttpRequest.kt", l = {84}, m = "doWork")
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
            return UrlGetRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlGetRequestWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(com.moloco.sdk.internal.android_context.b.a(context), params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public static final String a(Map<String, Object> map) {
        Intrinsics.checkNotNull(map);
        return (String) MapsKt.getOrImplicitDefaultNullable(map, a[0].getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull Continuation continuation) {
        a aVar;
        Object obj;
        int i;
        UrlGetRequestWorker urlGetRequestWorker;
        Map map;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
                obj = aVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HttpClient a2 = a.i.a.a();
                    Map keyValueMap = getInputData().getKeyValueMap();
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, j.d, "Sending request to " + a(keyValueMap), null, false, 12, null);
                    String a3 = a(keyValueMap);
                    aVar.a = this;
                    aVar.b = keyValueMap;
                    aVar.e = 1;
                    obj = e.a(a2, a3, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    urlGetRequestWorker = this;
                    map = keyValueMap;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) aVar.b;
                    urlGetRequestWorker = (UrlGetRequestWorker) aVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, j.d, "[Success] Sent request to " + a(map), null, false, 12, null);
                    ListenableWorker.Result success = ListenableWorker.Result.success();
                    Intrinsics.checkNotNull(success);
                    return success;
                }
                if (urlGetRequestWorker.getRunAttemptCount() >= 5) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, j.d, "[Failure] Request to " + a(map), null, false, 12, null);
                    ListenableWorker.Result failure = ListenableWorker.Result.failure();
                    Intrinsics.checkNotNull(failure);
                    return failure;
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, j.d, "[Failure][Retrying] Request to " + a(map), null, false, 12, null);
                ListenableWorker.Result retry = ListenableWorker.Result.retry();
                Intrinsics.checkNotNull(retry);
                return retry;
            }
        }
        aVar = new a(continuation);
        obj = aVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.e;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
