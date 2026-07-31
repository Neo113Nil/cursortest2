package com.revenuecat.purchases.google.history;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.android.vending.billing.IInAppBillingService;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.google.history.PurchaseData;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: PurchaseHistoryManager.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0016J|\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u0016\b\u0004\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0019\u0018\u00010\b0\u001b2\u001c\b\u0004\u0010\u001c\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0019\u0018\u00010\b\u0012\u0004\u0012\u00020\u00140\u001d2\u0006\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\t2\u001e\b\u0004\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190!\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u0082H¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010(\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010)J\u001e\u0010*\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020\u000e2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000eH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "billingService", "Lcom/android/vending/billing/IInAppBillingService;", "connectDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", "operationsMutex", "Lkotlinx/coroutines/sync/Mutex;", "queryDeferreds", "", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "serviceConnection", "Landroid/content/ServiceConnection;", "cleanup", "", "connect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "getOrExecute", "T", "getDeferred", "Lkotlin/Function0;", "setDeferred", "Lkotlin/Function1;", "debugMessage", "clearOnCompletion", "operation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseResponse", "Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;", "response", "Landroid/os/Bundle;", "queryAllPurchaseHistory", "type", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchaseHistory", "continuationToken", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PurchaseHistoryManager {
    private static final int MAX_PAGINATION_PAGES = 50;
    private IInAppBillingService billingService;
    private CompletableDeferred<Boolean> connectDeferred;
    private final Context context;
    private final Mutex operationsMutex;
    private final Map<String, CompletableDeferred<List<StoreTransaction>>> queryDeferreds;
    private ServiceConnection serviceConnection;

    public PurchaseHistoryManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.operationsMutex = MutexKt.Mutex$default(false, 1, null);
        this.queryDeferreds = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Object getOrExecute(Function0<? extends CompletableDeferred<T>> function0, Function1<? super CompletableDeferred<T>, Unit> function1, String str, boolean z, Function1<? super Continuation<? super T>, ? extends Object> function12, Continuation<? super T> continuation) {
        Pair pair;
        Mutex mutex = this.operationsMutex;
        mutex.lock(null, continuation);
        try {
            CompletableDeferred<T> invoke = function0.invoke();
            if (invoke != null) {
                CompletableDeferred<T> completableDeferred = invoke;
                if (invoke.isCompleted()) {
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        String str2 = "[Purchases] - " + logLevel.name();
                        String str3 = str + " (already completed)";
                        String str4 = str3;
                        String str5 = str2;
                        currentLogHandler.d(str2, str3);
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        String str6 = "[Purchases] - " + logLevel2.name();
                        String str7 = str;
                        String str8 = str6;
                        currentLogHandler2.d(str6, str);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                pair = TuplesKt.to(invoke, false);
            } else {
                CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                function1.invoke(CompletableDeferred$default);
                pair = TuplesKt.to(CompletableDeferred$default, true);
            }
            mutex.unlock(null);
            CompletableDeferred completableDeferred2 = (CompletableDeferred) pair.component1();
            try {
                if (!((Boolean) pair.component2()).booleanValue()) {
                    return completableDeferred2.await(continuation);
                }
                try {
                    try {
                        Object invoke2 = function12.invoke(continuation);
                        completableDeferred2.complete(invoke2);
                        if (z) {
                            this.operationsMutex.lock(null, continuation);
                            try {
                                function1.invoke(null);
                                Unit unit3 = Unit.INSTANCE;
                            } finally {
                            }
                        }
                        return invoke2;
                    } catch (CancellationException e) {
                        Job.DefaultImpls.cancel$default((Job) completableDeferred2, (CancellationException) null, 1, (Object) null);
                        throw e;
                    }
                } catch (Throwable th) {
                    completableDeferred2.completeExceptionally(th);
                    throw th;
                }
            } catch (Throwable th2) {
                if (z) {
                    this.operationsMutex.lock(null, continuation);
                    try {
                        function1.invoke(null);
                        Unit unit4 = Unit.INSTANCE;
                    } finally {
                    }
                }
                throw th2;
            }
        } finally {
        }
    }

    static /* synthetic */ Object getOrExecute$default(PurchaseHistoryManager purchaseHistoryManager, Function0 function0, Function1 function1, String str, boolean z, Function1 function12, Continuation continuation, int i, Object obj) {
        Pair pair;
        if ((i & 8) != 0) {
            z = true;
        }
        Mutex mutex = purchaseHistoryManager.operationsMutex;
        mutex.lock(null, continuation);
        try {
            CompletableDeferred completableDeferred = (CompletableDeferred) function0.invoke();
            if (completableDeferred != null) {
                if (completableDeferred.isCompleted()) {
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), str + " (already completed)");
                    }
                } else {
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel2.name(), str);
                    }
                }
                pair = TuplesKt.to(completableDeferred, false);
            } else {
                CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                function1.invoke(CompletableDeferred$default);
                pair = TuplesKt.to(CompletableDeferred$default, true);
            }
            mutex.unlock(null);
            CompletableDeferred completableDeferred2 = (CompletableDeferred) pair.component1();
            try {
                if (!((Boolean) pair.component2()).booleanValue()) {
                    return completableDeferred2.await(continuation);
                }
                try {
                    try {
                        Object invoke = function12.invoke(continuation);
                        completableDeferred2.complete(invoke);
                        if (z) {
                            purchaseHistoryManager.operationsMutex.lock(null, continuation);
                            try {
                                function1.invoke(null);
                                Unit unit = Unit.INSTANCE;
                            } finally {
                            }
                        }
                        return invoke;
                    } catch (CancellationException e) {
                        Job.DefaultImpls.cancel$default((Job) completableDeferred2, (CancellationException) null, 1, (Object) null);
                        throw e;
                    }
                } catch (Throwable th) {
                    completableDeferred2.completeExceptionally(th);
                    throw th;
                }
            } catch (Throwable th2) {
                if (z) {
                    purchaseHistoryManager.operationsMutex.lock(null, continuation);
                    try {
                        function1.invoke(null);
                        Unit unit2 = Unit.INSTANCE;
                    } finally {
                    }
                }
                throw th2;
            }
        } finally {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(7:(2:3|(10:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(5:17|18|19|20|21))(5:26|27|28|29|30))(7:35|36|37|38|39|40|(3:42|(5:44|27|28|29|30)|45)(1:46)))(2:59|60))(1:61))(3:103|(1:105)|45)|62|63|(4:65|66|(2:68|(1:70))(2:96|(1:98))|71)(1:99)|72|(2:74|(0)(1:76))(8:77|78|79|80|(1:82)|84|(1:86)|(4:89|39|40|(0)(0)))|45))|62|63|(0)(0)|72|(0)(0)|45)|112|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0253, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0254, code lost:
    
        if ("[Purchases] - ERROR" != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0256, code lost:
    
        r2 = null.operationsMutex;
        r3.L$0 = 3;
        r3.L$1 = r0;
        r3.L$2 = r2;
        r3.L$3 = null;
        r3.label = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0269, code lost:
    
        if (r2.lock(null, r3) != r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x026c, code lost:
    
        r4 = r0;
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x027d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0237 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0 A[Catch: all -> 0x027e, TRY_LEAVE, TryCatch #10 {all -> 0x027e, blocks: (B:63:0x00ba, B:65:0x00c0, B:68:0x00ca, B:70:0x00e0, B:71:0x0131, B:96:0x0108, B:98:0x011d, B:99:0x013a), top: B:62:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013a A[Catch: all -> 0x027e, TRY_LEAVE, TryCatch #10 {all -> 0x027e, blocks: (B:63:0x00ba, B:65:0x00c0, B:68:0x00ca, B:70:0x00e0, B:71:0x0131, B:96:0x0108, B:98:0x011d, B:99:0x013a), top: B:62:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object connect(Continuation<? super Boolean> continuation) {
        PurchaseHistoryManager$connect$1 purchaseHistoryManager$connect$1;
        int i;
        Mutex mutex;
        Mutex mutex2;
        String str;
        final PurchaseHistoryManager purchaseHistoryManager;
        PurchaseHistoryManager purchaseHistoryManager2;
        int i2;
        CompletableDeferred completableDeferred;
        Pair pair;
        CompletableDeferred completableDeferred2;
        int i3;
        PurchaseHistoryManager purchaseHistoryManager3;
        Object obj;
        PurchaseHistoryManager purchaseHistoryManager4;
        try {
            if (continuation instanceof PurchaseHistoryManager$connect$1) {
                purchaseHistoryManager$connect$1 = (PurchaseHistoryManager$connect$1) continuation;
                if ((purchaseHistoryManager$connect$1.label & Integer.MIN_VALUE) != 0) {
                    purchaseHistoryManager$connect$1.label -= Integer.MIN_VALUE;
                    Object obj2 = purchaseHistoryManager$connect$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = purchaseHistoryManager$connect$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        mutex2 = this.operationsMutex;
                        purchaseHistoryManager$connect$1.L$0 = this;
                        purchaseHistoryManager$connect$1.L$1 = this;
                        str = "Connection already in progress or completed, hooking into existing operation";
                        purchaseHistoryManager$connect$1.L$2 = "Connection already in progress or completed, hooking into existing operation";
                        purchaseHistoryManager$connect$1.L$3 = mutex2;
                        purchaseHistoryManager$connect$1.I$0 = 0;
                        purchaseHistoryManager$connect$1.label = 1;
                        if (mutex2.lock(null, purchaseHistoryManager$connect$1) != coroutine_suspended) {
                            purchaseHistoryManager = this;
                            purchaseHistoryManager2 = purchaseHistoryManager;
                            i2 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj2);
                            return obj2;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                mutex = (Mutex) purchaseHistoryManager$connect$1.L$2;
                                obj = purchaseHistoryManager$connect$1.L$1;
                                purchaseHistoryManager4 = (PurchaseHistoryManager) purchaseHistoryManager$connect$1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                try {
                                    purchaseHistoryManager4.connectDeferred = null;
                                    Unit unit = Unit.INSTANCE;
                                    mutex.unlock(null);
                                    return obj;
                                } finally {
                                }
                            }
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Mutex mutex3 = (Mutex) purchaseHistoryManager$connect$1.L$2;
                            Throwable th = (Throwable) purchaseHistoryManager$connect$1.L$1;
                            PurchaseHistoryManager purchaseHistoryManager5 = (PurchaseHistoryManager) purchaseHistoryManager$connect$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            try {
                                purchaseHistoryManager5.connectDeferred = null;
                                Unit unit2 = Unit.INSTANCE;
                                mutex.unlock(null);
                                throw th;
                            } finally {
                            }
                        }
                        i3 = purchaseHistoryManager$connect$1.I$0;
                        completableDeferred2 = (CompletableDeferred) purchaseHistoryManager$connect$1.L$2;
                        purchaseHistoryManager3 = (PurchaseHistoryManager) purchaseHistoryManager$connect$1.L$1;
                        PurchaseHistoryManager purchaseHistoryManager6 = (PurchaseHistoryManager) purchaseHistoryManager$connect$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            purchaseHistoryManager = purchaseHistoryManager6;
                            try {
                                completableDeferred2.complete(obj2);
                                if (i3 != 0) {
                                    return obj2;
                                }
                                mutex = purchaseHistoryManager3.operationsMutex;
                                purchaseHistoryManager$connect$1.L$0 = purchaseHistoryManager;
                                purchaseHistoryManager$connect$1.L$1 = obj2;
                                purchaseHistoryManager$connect$1.L$2 = mutex;
                                purchaseHistoryManager$connect$1.L$3 = null;
                                purchaseHistoryManager$connect$1.label = 4;
                                if (mutex.lock(null, purchaseHistoryManager$connect$1) != coroutine_suspended) {
                                    obj = obj2;
                                    purchaseHistoryManager4 = purchaseHistoryManager;
                                    purchaseHistoryManager4.connectDeferred = null;
                                    Unit unit3 = Unit.INSTANCE;
                                    mutex.unlock(null);
                                    return obj;
                                }
                                return coroutine_suspended;
                            } catch (CancellationException e) {
                                e = e;
                                Job.DefaultImpls.cancel$default((Job) completableDeferred2, (CancellationException) null, 1, (Object) null);
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                completableDeferred2.completeExceptionally(th);
                                throw th;
                            }
                        } catch (CancellationException e2) {
                            e = e2;
                            Job.DefaultImpls.cancel$default((Job) completableDeferred2, (CancellationException) null, 1, (Object) null);
                            throw e;
                        } catch (Throwable th3) {
                            th = th3;
                            completableDeferred2.completeExceptionally(th);
                            throw th;
                        }
                    }
                    i2 = purchaseHistoryManager$connect$1.I$0;
                    mutex2 = (Mutex) purchaseHistoryManager$connect$1.L$3;
                    str = (String) purchaseHistoryManager$connect$1.L$2;
                    purchaseHistoryManager2 = (PurchaseHistoryManager) purchaseHistoryManager$connect$1.L$1;
                    purchaseHistoryManager = (PurchaseHistoryManager) purchaseHistoryManager$connect$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    completableDeferred = purchaseHistoryManager.connectDeferred;
                    if (completableDeferred == null) {
                        if (completableDeferred.isCompleted()) {
                            LogLevel logLevel = LogLevel.DEBUG;
                            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                currentLogHandler.d("[Purchases] - " + logLevel.name(), str + " (already completed)");
                            }
                        } else {
                            LogLevel logLevel2 = LogLevel.DEBUG;
                            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler2.d("[Purchases] - " + logLevel2.name(), str);
                            }
                        }
                        pair = TuplesKt.to(completableDeferred, Boxing.boxBoolean(false));
                    } else {
                        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        purchaseHistoryManager.connectDeferred = CompletableDeferred$default;
                        pair = TuplesKt.to(CompletableDeferred$default, Boxing.boxBoolean(true));
                    }
                    mutex.unlock(null);
                    CompletableDeferred completableDeferred3 = (CompletableDeferred) pair.component1();
                    if (((Boolean) pair.component2()).booleanValue()) {
                        purchaseHistoryManager$connect$1.L$0 = null;
                        purchaseHistoryManager$connect$1.L$1 = null;
                        purchaseHistoryManager$connect$1.L$2 = null;
                        purchaseHistoryManager$connect$1.L$3 = null;
                        purchaseHistoryManager$connect$1.label = 2;
                        Object await = completableDeferred3.await(purchaseHistoryManager$connect$1);
                        if (await != coroutine_suspended) {
                            return await;
                        }
                    } else {
                        try {
                            PurchaseHistoryManager$connect$1 purchaseHistoryManager$connect$12 = purchaseHistoryManager$connect$1;
                            purchaseHistoryManager$connect$1.L$0 = purchaseHistoryManager;
                            purchaseHistoryManager$connect$1.L$1 = purchaseHistoryManager2;
                            purchaseHistoryManager$connect$1.L$2 = completableDeferred3;
                            purchaseHistoryManager$connect$1.L$3 = purchaseHistoryManager$connect$1;
                            purchaseHistoryManager$connect$1.I$0 = i2;
                            purchaseHistoryManager$connect$1.label = 3;
                            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(purchaseHistoryManager$connect$1), 1);
                            cancellableContinuationImpl.initCancellability();
                            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                            ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.revenuecat.purchases.google.history.PurchaseHistoryManager$connect$4$1$connection$1
                                @Override // android.content.ServiceConnection
                                public void onServiceConnected(ComponentName name, IBinder service) {
                                    LogLevel logLevel3 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                        currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "AIDL Billing service connected");
                                    }
                                    if (cancellableContinuationImpl2.isActive()) {
                                        purchaseHistoryManager.billingService = IInAppBillingService.Stub.asInterface(service);
                                        purchaseHistoryManager.serviceConnection = this;
                                        CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl2;
                                        Result.Companion companion = Result.INSTANCE;
                                        cancellableContinuation.resumeWith(Result.m12363constructorimpl(true));
                                        return;
                                    }
                                    LogLevel logLevel4 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                        currentLogHandler4.d("[Purchases] - " + logLevel4.name(), "AIDL Billing service connected after cancellation, cleaning up");
                                    }
                                    purchaseHistoryManager.cleanup();
                                }

                                @Override // android.content.ServiceConnection
                                public void onServiceDisconnected(ComponentName name) {
                                    LogLevel logLevel3 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                        currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "AIDL Billing service disconnected");
                                    }
                                    purchaseHistoryManager.cleanup();
                                }
                            };
                            cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.revenuecat.purchases.google.history.PurchaseHistoryManager$connect$4$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th4) {
                                    invoke2(th4);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th4) {
                                    LogLevel logLevel3 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                        currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "Connection cancelled, cleaning up service if needed");
                                    }
                                    PurchaseHistoryManager.this.cleanup();
                                }
                            });
                            try {
                                Intent intent = new Intent(BillingConstants.BILLING_SERVICE_ACTION);
                                intent.setPackage("com.android.vending");
                                if (!purchaseHistoryManager.context.bindService(intent, serviceConnection, 1)) {
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to bind to AIDL billing service", null);
                                    Result.Companion companion = Result.INSTANCE;
                                    cancellableContinuationImpl2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(new Exception("Failed to bind to Google Play billing service"))));
                                }
                            } catch (Throwable th4) {
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error binding to AIDL billing service", th4);
                                Result.Companion companion2 = Result.INSTANCE;
                                cancellableContinuationImpl2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(th4)));
                            }
                            obj2 = cancellableContinuationImpl.getResult();
                            if (obj2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                DebugProbesKt.probeCoroutineSuspended(purchaseHistoryManager$connect$1);
                            }
                            if (obj2 != coroutine_suspended) {
                                i3 = i2;
                                completableDeferred2 = completableDeferred3;
                                purchaseHistoryManager3 = purchaseHistoryManager2;
                                completableDeferred2.complete(obj2);
                                if (i3 != 0) {
                                }
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            completableDeferred2 = completableDeferred3;
                            Job.DefaultImpls.cancel$default((Job) completableDeferred2, (CancellationException) null, 1, (Object) null);
                            throw e;
                        } catch (Throwable th5) {
                            th = th5;
                            completableDeferred2 = completableDeferred3;
                            completableDeferred2.completeExceptionally(th);
                            throw th;
                        }
                    }
                    return coroutine_suspended;
                }
            }
            completableDeferred = purchaseHistoryManager.connectDeferred;
            if (completableDeferred == null) {
            }
            mutex.unlock(null);
            CompletableDeferred completableDeferred32 = (CompletableDeferred) pair.component1();
            if (((Boolean) pair.component2()).booleanValue()) {
            }
            return coroutine_suspended;
        } finally {
        }
        purchaseHistoryManager$connect$1 = new PurchaseHistoryManager$connect$1(this, continuation);
        Object obj22 = purchaseHistoryManager$connect$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseHistoryManager$connect$1.label;
        if (i != 0) {
        }
    }

    static /* synthetic */ PurchaseHistoryResult queryPurchaseHistory$default(PurchaseHistoryManager purchaseHistoryManager, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "inapp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return purchaseHistoryManager.queryPurchaseHistory(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseHistoryResult queryPurchaseHistory(String type, String continuationToken) {
        if (this.billingService == null) {
            return new PurchaseHistoryResult(2, CollectionsKt.emptyList(), null);
        }
        try {
            Bundle bundle = new Bundle();
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Calling getPurchaseHistory via AIDL with API version 7, type=" + type);
            }
            IInAppBillingService iInAppBillingService = this.billingService;
            Intrinsics.checkNotNull(iInAppBillingService);
            Bundle response = iInAppBillingService.getPurchaseHistory(7, this.context.getPackageName(), type, continuationToken, bundle);
            Intrinsics.checkNotNullExpressionValue(response, "response");
            return parseResponse(response);
        } catch (Throwable th) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error querying purchase history via AIDL", th);
            return new PurchaseHistoryResult(6, CollectionsKt.emptyList(), null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:3|(12:5|6|(1:(1:(1:(1:(2:12|13)(5:15|16|17|18|19))(5:24|25|26|27|28))(2:33|34))(1:35))(3:119|(1:121)|53)|36|37|38|39|(3:41|(2:43|(1:45))(2:104|(1:106))|46)(3:107|(1:109)(1:112)|110)|47|48|(2:50|(0)(1:52))(10:54|55|(2:56|(3:88|89|(1:91)(0))(2:58|(2:86|87)(3:60|(1:62)|(1:66)(1:85))))|69|(1:71)(1:84)|72|(2:75|73)|76|77|(2:79|(5:81|25|26|27|28))(1:82))|53))|36|37|38|39|(0)(0)|47|48|(0)(0)|53) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f4, code lost:
    
        r2 = r13.operationsMutex;
        r3.L$0 = r13;
        r3.L$1 = r12;
        r3.L$2 = r0;
        r3.L$3 = r2;
        r3.label = 4;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0308, code lost:
    
        if (r2.lock(null, r3) != r4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x030b, code lost:
    
        r4 = r0;
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0320, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02f2, code lost:
    
        if (r2 != 0) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144 A[Catch: all -> 0x0321, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0321, blocks: (B:37:0x00bc, B:107:0x0144, B:110:0x0159, B:112:0x0152), top: B:36:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca A[Catch: all -> 0x0140, TRY_ENTER, TryCatch #0 {all -> 0x0140, blocks: (B:41:0x00ca, B:43:0x00d0, B:45:0x00e5, B:46:0x0136, B:104:0x010d, B:106:0x0122, B:109:0x014a), top: B:39:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queryAllPurchaseHistory(String str, Continuation<? super List<StoreTransaction>> continuation) {
        PurchaseHistoryManager$queryAllPurchaseHistory$1 purchaseHistoryManager$queryAllPurchaseHistory$1;
        int i;
        String str2;
        Mutex mutex;
        String str3;
        PurchaseHistoryManager purchaseHistoryManager;
        int i2;
        Mutex mutex2;
        Object obj;
        CompletableDeferred completableDeferred;
        Pair pair;
        ProductType productType;
        Mutex mutex3;
        Object obj2;
        List list;
        PurchaseHistoryManager purchaseHistoryManager2;
        try {
            try {
                if (continuation instanceof PurchaseHistoryManager$queryAllPurchaseHistory$1) {
                    purchaseHistoryManager$queryAllPurchaseHistory$1 = (PurchaseHistoryManager$queryAllPurchaseHistory$1) continuation;
                    if ((purchaseHistoryManager$queryAllPurchaseHistory$1.label & Integer.MIN_VALUE) != 0) {
                        purchaseHistoryManager$queryAllPurchaseHistory$1.label -= Integer.MIN_VALUE;
                        Object obj3 = purchaseHistoryManager$queryAllPurchaseHistory$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = purchaseHistoryManager$queryAllPurchaseHistory$1.label;
                        int i3 = 1;
                        Throwable th = null;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj3);
                            str2 = "Query for type " + str + " already in progress, hooking into existing operation";
                            mutex = this.operationsMutex;
                            purchaseHistoryManager$queryAllPurchaseHistory$1.L$0 = this;
                            purchaseHistoryManager$queryAllPurchaseHistory$1.L$1 = str;
                            purchaseHistoryManager$queryAllPurchaseHistory$1.L$2 = str2;
                            purchaseHistoryManager$queryAllPurchaseHistory$1.L$3 = mutex;
                            purchaseHistoryManager$queryAllPurchaseHistory$1.I$0 = 1;
                            purchaseHistoryManager$queryAllPurchaseHistory$1.label = 1;
                            if (mutex.lock(null, purchaseHistoryManager$queryAllPurchaseHistory$1) != coroutine_suspended) {
                                str3 = str;
                                purchaseHistoryManager = this;
                                i2 = 1;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.throwOnFailure(obj3);
                                return obj3;
                            }
                            if (i == 3) {
                                Mutex mutex4 = (Mutex) purchaseHistoryManager$queryAllPurchaseHistory$1.L$3;
                                list = (List) purchaseHistoryManager$queryAllPurchaseHistory$1.L$2;
                                String str4 = (String) purchaseHistoryManager$queryAllPurchaseHistory$1.L$1;
                                purchaseHistoryManager2 = (PurchaseHistoryManager) purchaseHistoryManager$queryAllPurchaseHistory$1.L$0;
                                ResultKt.throwOnFailure(obj3);
                                mutex3 = mutex4;
                                str3 = str4;
                                obj2 = null;
                                try {
                                    purchaseHistoryManager2.queryDeferreds.remove(str3);
                                    Unit unit = Unit.INSTANCE;
                                    return list;
                                } finally {
                                }
                            }
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Mutex mutex5 = (Mutex) purchaseHistoryManager$queryAllPurchaseHistory$1.L$3;
                            Throwable th2 = (Throwable) purchaseHistoryManager$queryAllPurchaseHistory$1.L$2;
                            String str5 = (String) purchaseHistoryManager$queryAllPurchaseHistory$1.L$1;
                            PurchaseHistoryManager purchaseHistoryManager3 = (PurchaseHistoryManager) purchaseHistoryManager$queryAllPurchaseHistory$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            mutex2 = mutex5;
                            str3 = str5;
                            Object obj4 = null;
                            try {
                                purchaseHistoryManager3.queryDeferreds.remove(str3);
                                Unit unit2 = Unit.INSTANCE;
                                mutex2.unlock(obj4);
                                throw th2;
                            } finally {
                            }
                        }
                        int i4 = purchaseHistoryManager$queryAllPurchaseHistory$1.I$0;
                        mutex = (Mutex) purchaseHistoryManager$queryAllPurchaseHistory$1.L$3;
                        str2 = (String) purchaseHistoryManager$queryAllPurchaseHistory$1.L$2;
                        str3 = (String) purchaseHistoryManager$queryAllPurchaseHistory$1.L$1;
                        purchaseHistoryManager = (PurchaseHistoryManager) purchaseHistoryManager$queryAllPurchaseHistory$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        i2 = i4;
                        completableDeferred = (CompletableDeferred) purchaseHistoryManager.queryDeferreds.get(str3);
                        if (completableDeferred == null) {
                            if (completableDeferred.isCompleted()) {
                                LogLevel logLevel = LogLevel.DEBUG;
                                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                    currentLogHandler.d("[Purchases] - " + logLevel.name(), str2 + " (already completed)");
                                }
                            } else {
                                LogLevel logLevel2 = LogLevel.DEBUG;
                                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                    currentLogHandler2.d("[Purchases] - " + logLevel2.name(), str2);
                                }
                            }
                            pair = TuplesKt.to(completableDeferred, Boxing.boxBoolean(false));
                        } else {
                            CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                            if (CompletableDeferred$default != null) {
                                purchaseHistoryManager.queryDeferreds.put(str3, CompletableDeferred$default);
                            } else {
                                purchaseHistoryManager.queryDeferreds.remove(str3);
                            }
                            pair = TuplesKt.to(CompletableDeferred$default, Boxing.boxBoolean(true));
                        }
                        mutex2.unlock(null);
                        CompletableDeferred completableDeferred2 = (CompletableDeferred) pair.component1();
                        if (((Boolean) pair.component2()).booleanValue()) {
                            purchaseHistoryManager$queryAllPurchaseHistory$1.L$0 = null;
                            purchaseHistoryManager$queryAllPurchaseHistory$1.L$1 = null;
                            purchaseHistoryManager$queryAllPurchaseHistory$1.L$2 = null;
                            purchaseHistoryManager$queryAllPurchaseHistory$1.L$3 = null;
                            purchaseHistoryManager$queryAllPurchaseHistory$1.label = 2;
                            Object await = completableDeferred2.await(purchaseHistoryManager$queryAllPurchaseHistory$1);
                            if (await != coroutine_suspended) {
                                return await;
                            }
                        } else {
                            try {
                                try {
                                    PurchaseHistoryManager$queryAllPurchaseHistory$1 purchaseHistoryManager$queryAllPurchaseHistory$12 = purchaseHistoryManager$queryAllPurchaseHistory$1;
                                    ArrayList arrayList = new ArrayList();
                                    Ref.IntRef intRef = new Ref.IntRef();
                                    String str6 = null;
                                    while (true) {
                                        if (intRef.element < 50) {
                                            PurchaseHistoryResult queryPurchaseHistory = purchaseHistoryManager.queryPurchaseHistory(str3, str6);
                                            if (queryPurchaseHistory.isSuccess()) {
                                                arrayList.addAll(queryPurchaseHistory.getRecords());
                                                String continuationToken = queryPurchaseHistory.getContinuationToken();
                                                intRef.element += i3;
                                                LogLevel logLevel3 = LogLevel.DEBUG;
                                                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                                    currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "Retrieved " + queryPurchaseHistory.getRecords().size() + " records from AIDL queryPurchaseHistory (page " + intRef.element + ')');
                                                }
                                                if (continuationToken == null || !JobKt.isActive(purchaseHistoryManager$queryAllPurchaseHistory$1.getContext())) {
                                                    break;
                                                }
                                                str6 = continuationToken;
                                                i3 = 1;
                                                th = null;
                                            } else {
                                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error querying purchase history through AIDL: " + queryPurchaseHistory.getResponseCodeString(), th);
                                                break;
                                            }
                                        } else {
                                            LogLevel logLevel4 = LogLevel.WARN;
                                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                                currentLogHandler4.w("[Purchases] - " + logLevel4.name(), "Reached maximum pagination limit for AIDL purchase history (50 pages). Will stop querying further pages.");
                                            }
                                        }
                                    }
                                    if (Intrinsics.areEqual(str3, "subs")) {
                                        productType = ProductType.SUBS;
                                    } else {
                                        productType = ProductType.INAPP;
                                    }
                                    ArrayList arrayList2 = arrayList;
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        arrayList3.add(((PurchaseHistoryRecord) it.next()).toStoreTransaction(productType));
                                    }
                                    ArrayList arrayList4 = arrayList3;
                                    completableDeferred2.complete(arrayList4);
                                    if (i2 == 0) {
                                        return arrayList4;
                                    }
                                    mutex3 = purchaseHistoryManager.operationsMutex;
                                    purchaseHistoryManager$queryAllPurchaseHistory$1.L$0 = purchaseHistoryManager;
                                    purchaseHistoryManager$queryAllPurchaseHistory$1.L$1 = str3;
                                    purchaseHistoryManager$queryAllPurchaseHistory$1.L$2 = arrayList4;
                                    purchaseHistoryManager$queryAllPurchaseHistory$1.L$3 = mutex3;
                                    purchaseHistoryManager$queryAllPurchaseHistory$1.label = 3;
                                    obj2 = null;
                                    if (mutex3.lock(null, purchaseHistoryManager$queryAllPurchaseHistory$1) != coroutine_suspended) {
                                        list = arrayList4;
                                        purchaseHistoryManager2 = purchaseHistoryManager;
                                        purchaseHistoryManager2.queryDeferreds.remove(str3);
                                        Unit unit3 = Unit.INSTANCE;
                                        return list;
                                    }
                                } catch (Throwable th3) {
                                    completableDeferred2.completeExceptionally(th3);
                                    throw th3;
                                }
                            } catch (CancellationException e) {
                                Job.DefaultImpls.cancel$default((Job) completableDeferred2, (CancellationException) null, 1, (Object) null);
                                throw e;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                if (completableDeferred == null) {
                }
                mutex2.unlock(null);
                CompletableDeferred completableDeferred22 = (CompletableDeferred) pair.component1();
                if (((Boolean) pair.component2()).booleanValue()) {
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                th = th4;
                obj = null;
                throw th;
            }
            completableDeferred = (CompletableDeferred) purchaseHistoryManager.queryDeferreds.get(str3);
        } catch (Throwable th5) {
            th = th5;
            obj = null;
        }
        purchaseHistoryManager$queryAllPurchaseHistory$1 = new PurchaseHistoryManager$queryAllPurchaseHistory$1(this, continuation);
        Object obj32 = purchaseHistoryManager$queryAllPurchaseHistory$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseHistoryManager$queryAllPurchaseHistory$1.label;
        int i32 = 1;
        Throwable th6 = null;
        if (i != 0) {
        }
    }

    public static /* synthetic */ Object queryAllPurchaseHistory$default(PurchaseHistoryManager purchaseHistoryManager, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "inapp";
        }
        return purchaseHistoryManager.queryAllPurchaseHistory(str, continuation);
    }

    private final PurchaseHistoryResult parseResponse(Bundle response) {
        PurchaseHistoryRecord purchaseHistoryRecord;
        int i = response.getInt(BillingConstants.RESPONSE_CODE, -1);
        if (i == 0) {
            ArrayList<String> stringArrayList = response.getStringArrayList(BillingConstants.INAPP_PURCHASE_DATA_LIST);
            if (stringArrayList == null) {
                stringArrayList = new ArrayList<>();
            }
            ArrayList<String> stringArrayList2 = response.getStringArrayList(BillingConstants.INAPP_DATA_SIGNATURE_LIST);
            if (stringArrayList2 == null) {
                stringArrayList2 = new ArrayList<>();
            }
            String string = response.getString(BillingConstants.INAPP_CONTINUATION_TOKEN);
            List<Pair> zip = CollectionsKt.zip(stringArrayList, stringArrayList2);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : zip) {
                String purchaseJson = (String) pair.component1();
                String signature = (String) pair.component2();
                PurchaseData.Companion companion = PurchaseData.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(purchaseJson, "purchaseJson");
                PurchaseData fromJson = companion.fromJson(purchaseJson);
                if (fromJson != null) {
                    Intrinsics.checkNotNullExpressionValue(signature, "signature");
                    purchaseHistoryRecord = new PurchaseHistoryRecord(fromJson, signature, purchaseJson);
                } else {
                    LogLevel logLevel = LogLevel.WARN;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.w("[Purchases] - " + logLevel.name(), "Failed to parse purchase data: " + purchaseJson);
                    }
                    purchaseHistoryRecord = null;
                }
                if (purchaseHistoryRecord != null) {
                    arrayList.add(purchaseHistoryRecord);
                }
            }
            ArrayList arrayList2 = arrayList;
            LogLevel logLevel2 = LogLevel.DEBUG;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Parsed " + arrayList2.size() + " purchase history records from AIDL.");
            }
            return new PurchaseHistoryResult(i, arrayList2, string);
        }
        LogLevel logLevel3 = LogLevel.WARN;
        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            currentLogHandler3.w("[Purchases] - " + logLevel3.name(), "Purchase history query returned non-OK response: " + ErrorsKt.getBillingResponseCodeName(i));
        }
        return new PurchaseHistoryResult(i, CollectionsKt.emptyList(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object disconnect(Continuation<? super Unit> continuation) {
        PurchaseHistoryManager$disconnect$1 purchaseHistoryManager$disconnect$1;
        int i;
        PurchaseHistoryManager purchaseHistoryManager;
        Mutex mutex;
        try {
            if (continuation instanceof PurchaseHistoryManager$disconnect$1) {
                purchaseHistoryManager$disconnect$1 = (PurchaseHistoryManager$disconnect$1) continuation;
                if ((purchaseHistoryManager$disconnect$1.label & Integer.MIN_VALUE) != 0) {
                    purchaseHistoryManager$disconnect$1.label -= Integer.MIN_VALUE;
                    Object obj = purchaseHistoryManager$disconnect$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = purchaseHistoryManager$disconnect$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.operationsMutex;
                        purchaseHistoryManager$disconnect$1.L$0 = this;
                        purchaseHistoryManager$disconnect$1.L$1 = mutex2;
                        purchaseHistoryManager$disconnect$1.label = 1;
                        if (mutex2.lock(null, purchaseHistoryManager$disconnect$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        purchaseHistoryManager = this;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (Mutex) purchaseHistoryManager$disconnect$1.L$1;
                        purchaseHistoryManager = (PurchaseHistoryManager) purchaseHistoryManager$disconnect$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    purchaseHistoryManager.cleanup();
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            purchaseHistoryManager.cleanup();
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        purchaseHistoryManager$disconnect$1 = new PurchaseHistoryManager$disconnect$1(this, continuation);
        Object obj2 = purchaseHistoryManager$disconnect$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseHistoryManager$disconnect$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanup() {
        CompletableDeferred<Boolean> completableDeferred = this.connectDeferred;
        if (completableDeferred != null) {
            Job.DefaultImpls.cancel$default((Job) completableDeferred, (CancellationException) null, 1, (Object) null);
        }
        Iterator<Map.Entry<String, CompletableDeferred<List<StoreTransaction>>>> it = this.queryDeferreds.entrySet().iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) it.next().getValue(), (CancellationException) null, 1, (Object) null);
        }
        ServiceConnection serviceConnection = this.serviceConnection;
        if (serviceConnection != null) {
            try {
                this.context.unbindService(serviceConnection);
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "AIDL Billing service disconnected");
                }
            } catch (Throwable th) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error disconnecting from AIDL Billing service", th);
            }
        }
        this.billingService = null;
        this.serviceConnection = null;
        this.connectDeferred = null;
        this.queryDeferreds.clear();
    }
}
