package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.acm.db.MetricsDb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR'\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\f\u0010\u001f¨\u0006!"}, d2 = {"Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "Lcom/moloco/sdk/acm/db/d;", "b", "Lcom/moloco/sdk/acm/db/d;", "metricsDAO", "c", "url", "", "Lkotlin/jvm/internal/EnhancedNullability;", "d", "Ljava/util/Map;", "clientOptions", "Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "headers", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes12.dex */
public final class DBRequestWorker extends CoroutineWorker {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.moloco.sdk.acm.db.d metricsDAO;

    /* renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String url;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> clientOptions;

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function1 headers;

    @DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.DBRequestWorker", f = "DBWorkRequest.kt", l = {110}, m = "doWork")
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return DBRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBRequestWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.TAG = "DBRequestWorker";
        this.metricsDAO = MetricsDb.INSTANCE.b(context).b();
        this.url = getInputData().getString("url");
        Map mapOf = MapsKt.mapOf(TuplesKt.to(com.moloco.sdk.acm.b.e, getInputData().getString(com.moloco.sdk.acm.b.e)), TuplesKt.to(com.moloco.sdk.acm.b.f, getInputData().getString(com.moloco.sdk.acm.b.f)), TuplesKt.to(com.moloco.sdk.acm.b.g, getInputData().getString(com.moloco.sdk.acm.b.g)), TuplesKt.to(com.moloco.sdk.acm.b.d, getInputData().getString(com.moloco.sdk.acm.b.d)), TuplesKt.to("osv", getInputData().getString("osv")), TuplesKt.to(com.moloco.sdk.acm.b.h, getInputData().getString(com.moloco.sdk.acm.b.h)), TuplesKt.to(com.moloco.sdk.acm.b.b, getInputData().getString(com.moloco.sdk.acm.b.b)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapOf.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.clientOptions = linkedHashMap;
        this.headers = new com.moloco.sdk.acm.http.a().a((String) linkedHashMap.get(com.moloco.sdk.acm.b.h), (String) linkedHashMap.get("osv"), (String) linkedHashMap.get(com.moloco.sdk.acm.b.e), (String) linkedHashMap.get(com.moloco.sdk.acm.b.f), (String) linkedHashMap.get(com.moloco.sdk.acm.b.g), (String) linkedHashMap.get(com.moloco.sdk.acm.b.b));
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final Function1 getHeaders() {
        return this.headers;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull Continuation continuation) {
        a aVar;
        int i;
        DBRequestWorker dBRequestWorker;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        if (this.url != null) {
                            com.moloco.sdk.acm.http.b bVar = com.moloco.sdk.acm.http.b.a;
                            bVar.a(com.moloco.sdk.acm.http.c.c(), this.url);
                            k kVar = new k(bVar.a(), this.metricsDAO, new f(new com.moloco.sdk.acm.services.j(), 720L), this.headers);
                            aVar.a = this;
                            aVar.d = 1;
                            if (kVar.a(aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        dBRequestWorker = this;
                    } catch (Exception e) {
                        e = e;
                        dBRequestWorker = this;
                        com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, dBRequestWorker.TAG, "Work Manager failure: " + e.getMessage(), null, false, 12, null);
                        return ListenableWorker.Result.failure();
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dBRequestWorker = (DBRequestWorker) aVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        ((Result) obj).getValue();
                    } catch (Exception e2) {
                        e = e2;
                        com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, dBRequestWorker.TAG, "Work Manager failure: " + e.getMessage(), null, false, 12, null);
                        return ListenableWorker.Result.failure();
                    }
                }
                return ListenableWorker.Result.success();
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        return ListenableWorker.Result.success();
    }
}
