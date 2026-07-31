package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.TimeSource$Monotonic;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidCacheRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {144}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AndroidCacheRepository$clearCache$2 extends SuspendLambda implements Function2 {
    long J$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$clearCache$2(AndroidCacheRepository androidCacheRepository, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidCacheRepository$clearCache$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidCacheRepository$clearCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(1:(1:4)(2:61|62))(2:63|(1:65))|5|6|(3:50|51|(14:53|54|55|15|16|17|18|19|(3:38|39|(1:41)(4:42|27|28|29))|21|(3:23|(1:25)|26)|27|28|29))|8|9|(3:11|(1:13)|14)|15|16|17|18|19|(0)|21|(0)|27|28|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018e A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:39:0x0149, B:42:0x015a, B:27:0x0199, B:21:0x0182, B:23:0x018e, B:25:0x0191), top: B:38:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        boolean cleanCache;
        long m8186markNowz9LOYto;
        Object cacheSize;
        Object obj2;
        Object obj3;
        SendDiagnosticEvent sendDiagnosticEvent;
        SessionRepository sessionRepository2;
        SessionRepository sessionRepository3;
        CleanupDirectory cleanupDirectory;
        File webviewCacheDir;
        SendDiagnosticEvent sendDiagnosticEvent2;
        SendDiagnosticEvent sendDiagnosticEvent3;
        File webviewCacheDir2;
        File[] listFiles;
        SessionRepository sessionRepository4;
        SessionRepository sessionRepository5;
        CleanupDirectory cleanupDirectory2;
        File cacheDir;
        SendDiagnosticEvent sendDiagnosticEvent4;
        File cacheDir2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sessionRepository = this.this$0.sessionRepository;
            cleanCache = sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
            m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
            AndroidCacheRepository androidCacheRepository = this.this$0;
            this.Z$0 = cleanCache;
            this.J$0 = m8186markNowz9LOYto;
            this.label = 1;
            cacheSize = androidCacheRepository.getCacheSize(this);
            if (cacheSize == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = this.J$0;
            boolean z = this.Z$0;
            ResultKt.throwOnFailure(obj);
            m8186markNowz9LOYto = j;
            cacheSize = obj;
            cleanCache = z;
        }
        long longValue = ((Number) cacheSize).longValue();
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!cleanCache) {
            try {
                sessionRepository4 = this.this$0.sessionRepository;
            } catch (Throwable th2) {
                th = th2;
                obj2 = "size_kb";
                obj3 = obj2;
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_FAILURE_TIME;
                double elapsedMillis = TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto));
                Map mapOf = MapsKt.mapOf(TuplesKt.to(obj3, Boxing.boxInt((int) (longValue / 1024))));
                Pair pair = TuplesKt.to("reason", th.getClass().getSimpleName());
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getSimpleName();
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, Boxing.boxDouble(elapsedMillis), MapsKt.mapOf(pair, TuplesKt.to("reason_debug", message)), mapOf, (AdObject) null, (Integer) null, (ByteString) null, 112, (Object) null);
                long m8186markNowz9LOYto2 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                if (!cleanCache) {
                }
                webviewCacheDir2 = this.this$0.getWebviewCacheDir();
                listFiles = webviewCacheDir2.listFiles();
                if (listFiles != null) {
                }
                sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto2))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
                return Unit.INSTANCE;
            }
            if (sessionRepository4.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                sessionRepository5 = this.this$0.sessionRepository;
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = sessionRepository5.getNativeConfiguration().getCachedAssetsConfiguration();
                cleanupDirectory2 = this.this$0.cleanupDirectory;
                cacheDir = this.this$0.getCacheDir();
                obj2 = "size_kb";
                cleanupDirectory2.invoke(cacheDir, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
                sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
                obj3 = obj2;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto))), (Map) null, MapsKt.mapOf(TuplesKt.to(obj3, Boxing.boxInt((int) (longValue / 1024)))), (AdObject) null, (Integer) null, (ByteString) null, 116, (Object) null);
                long m8186markNowz9LOYto22 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                if (!cleanCache) {
                    try {
                        sessionRepository2 = this.this$0.sessionRepository;
                    } catch (Exception e) {
                        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_FAILURE_TIME;
                        Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto22)));
                        Pair pair2 = TuplesKt.to("reason", e.getClass().getSimpleName());
                        String message2 = e.getMessage();
                        if (message2 == null) {
                            message2 = e.getClass().getSimpleName();
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, boxDouble, MapsKt.mapOf(pair2, TuplesKt.to("reason_debug", message2)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                    }
                    if (sessionRepository2.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                        sessionRepository3 = this.this$0.sessionRepository;
                        NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = sessionRepository3.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                        cleanupDirectory = this.this$0.cleanupDirectory;
                        webviewCacheDir = this.this$0.getWebviewCacheDir();
                        cleanupDirectory.invoke(webviewCacheDir, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                        sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto22))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
                        return Unit.INSTANCE;
                    }
                }
                webviewCacheDir2 = this.this$0.getWebviewCacheDir();
                listFiles = webviewCacheDir2.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        file.delete();
                    }
                }
                sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto22))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
                return Unit.INSTANCE;
            }
        }
        obj2 = "size_kb";
        cacheDir2 = this.this$0.getCacheDir();
        File[] listFiles2 = cacheDir2.listFiles();
        if (listFiles2 != null) {
            for (File file2 : listFiles2) {
                file2.delete();
            }
        }
        sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
        obj3 = obj2;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto))), (Map) null, MapsKt.mapOf(TuplesKt.to(obj3, Boxing.boxInt((int) (longValue / 1024)))), (AdObject) null, (Integer) null, (ByteString) null, 116, (Object) null);
        long m8186markNowz9LOYto222 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
        if (!cleanCache) {
        }
        webviewCacheDir2 = this.this$0.getWebviewCacheDir();
        listFiles = webviewCacheDir2.listFiles();
        if (listFiles != null) {
        }
        sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto222))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
        return Unit.INSTANCE;
    }
}
