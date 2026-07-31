package com.unity3d.ads.core.data.datasource;

import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource$Monotonic;
import kotlinx.coroutines.CoroutineScope;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;

/* compiled from: AndroidRemoteCacheDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2", f = "AndroidRemoteCacheDataSource.kt", l = {78, 79, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AndroidRemoteCacheDataSource$getFileInternal$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ File $cachePath;
    final /* synthetic */ String $fileName;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ Function3 $onProgress;
    final /* synthetic */ Integer $priority;
    final /* synthetic */ String $url;
    int I$0;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ AndroidRemoteCacheDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidRemoteCacheDataSource$getFileInternal$2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, int i, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = androidRemoteCacheDataSource;
        this.$cachePath = file;
        this.$fileName = str2;
        this.$priority = num;
        this.$intervalMs = i;
        this.$onProgress = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidRemoteCacheDataSource$getFileInternal$2 androidRemoteCacheDataSource$getFileInternal$2 = new AndroidRemoteCacheDataSource$getFileInternal$2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, this.$intervalMs, this.$onProgress, continuation);
        androidRemoteCacheDataSource$getFileInternal$2.L$0 = obj;
        return androidRemoteCacheDataSource$getFileInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidRemoteCacheDataSource$getFileInternal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x043a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x043b, code lost:
    
        r23 = r4;
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0440, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0441, code lost:
    
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0444, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0445, code lost:
    
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0448, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0449, code lost:
    
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x048c, code lost:
    
        r4 = r22;
        r2 = r24;
        r24 = r3;
        r3 = r23;
        r23 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0496, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0499, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x049c, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x049f, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r2, null);
        r0 = kotlin.Result.m8023constructorimpl(kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04a8, code lost:
    
        r7 = r23;
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04af, code lost:
    
        r7 = r14;
        r4 = r23;
        r2 = r24;
        r13 = r5;
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04b8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04b9, code lost:
    
        r1 = r0;
        r12 = r2;
        r7 = r14;
        r4 = r23;
        r2 = r24;
        r13 = r5;
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04c4, code lost:
    
        r1 = r0;
        r12 = r2;
        r7 = r14;
        r4 = r23;
        r2 = r24;
        r13 = r5;
        r5 = r9;
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0388, code lost:
    
        r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3.element + r5);
        r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r11);
        r1.L$0 = r4;
        r1.L$1 = r14;
        r1.L$2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x039a, code lost:
    
        r27 = r4;
        r4 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x039e, code lost:
    
        r1.L$3 = r4;
        r1.L$4 = r3;
        r1.L$5 = r2;
        r1.L$6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x03a6, code lost:
    
        r25 = r2;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x03aa, code lost:
    
        r1.L$7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x03ac, code lost:
    
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x03b0, code lost:
    
        r1.L$8 = r26;
        r1.L$9 = r0;
        r1.L$10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x03b6, code lost:
    
        r26 = r26;
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03ba, code lost:
    
        r1.L$11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x03bc, code lost:
    
        r23 = r4;
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03c0, code lost:
    
        r1.L$12 = r4;
        r1.L$13 = r10;
        r1.J$0 = r5;
        r1.J$1 = r11;
        r22 = r0;
        r0 = r19;
        r1.I$0 = r0;
        r1.label = 3;
        r7 = r15.invoke(r7, r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03d7, code lost:
    
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x03d9, code lost:
    
        if (r7 != r8) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03db, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03dc, code lost:
    
        r7 = r0;
        r19 = r22;
        r22 = r4;
        r4 = r27;
        r24 = r2;
        r2 = r25;
        r25 = r23;
        r23 = r3;
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0430, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0431, code lost:
    
        r1 = r0;
        r12 = r2;
        r8 = r3;
        r7 = r4;
        r22 = r23;
        r21 = r24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x048c A[EDGE_INSN: B:153:0x048c->B:154:0x048c BREAK  A[LOOP:0: B:17:0x0364->B:26:0x0471], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x036f A[Catch: all -> 0x044c, TryCatch #9 {all -> 0x044c, blocks: (B:18:0x0364, B:20:0x036f, B:22:0x037f, B:28:0x0388), top: B:17:0x0364 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x052f  */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r7v41, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x03dc -> B:10:0x03f0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        CreateFile createFile;
        File invoke;
        long length;
        CreateFile createFile2;
        File invoke2;
        HttpClientProvider httpClientProvider;
        Object invoke3;
        CoroutineScope coroutineScope;
        HttpRequest httpRequest;
        Object execute;
        File file;
        CoroutineScope coroutineScope2;
        long j;
        HttpResponse httpResponse;
        String str;
        long j2;
        Closeable closeable;
        long contentSize;
        String str2;
        HttpResponse httpResponse2;
        File file2;
        Ref$IntRef ref$IntRef;
        Throwable th;
        Ref$IntRef ref$IntRef2;
        Sink appendingSink;
        Throwable th2;
        BufferedSink buffer;
        HttpResponse httpResponse3;
        Sink sink;
        Closeable closeable2;
        File file3;
        Function3 function3;
        Ref$LongRef ref$LongRef;
        byte[] bArr;
        long j3;
        Object obj2;
        BufferedSink bufferedSink;
        Ref$IntRef ref$IntRef3;
        int i;
        CoroutineScope coroutineScope3;
        long j4;
        File file4;
        ?? r13;
        String str3;
        HttpResponse httpResponse4;
        Ref$IntRef ref$IntRef4;
        Throwable m8026exceptionOrNullimpl;
        Object m8023constructorimpl;
        GetFileExtensionFromUrl getFileExtensionFromUrl;
        Sink sink2;
        BufferedSink bufferedSink2;
        Throwable th3;
        int read;
        CoroutineScope coroutineScope4;
        Ref$IntRef ref$IntRef5;
        InputStream inputStream;
        Object obj3;
        int i2;
        CoroutineScope coroutineScope5;
        Ref$IntRef ref$IntRef6;
        Ref$IntRef ref$IntRef7;
        AndroidRemoteCacheDataSource$getFileInternal$2 androidRemoteCacheDataSource$getFileInternal$2 = this;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = androidRemoteCacheDataSource$getFileInternal$2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope6 = (CoroutineScope) androidRemoteCacheDataSource$getFileInternal$2.L$0;
            String str4 = androidRemoteCacheDataSource$getFileInternal$2.$url;
            if (str4 != null && str4.length() != 0) {
                sessionRepository = androidRemoteCacheDataSource$getFileInternal$2.this$0.sessionRepository;
                if (sessionRepository.getFeatureFlags().getEnsureCacheFolderExistences()) {
                    if (androidRemoteCacheDataSource$getFileInternal$2.$cachePath.exists()) {
                        if (!androidRemoteCacheDataSource$getFileInternal$2.$cachePath.isDirectory()) {
                            return new CacheResult.Failure(CacheError.FILE_IO_ERROR, CacheSource.REMOTE, null, 4, null);
                        }
                    } else if (!androidRemoteCacheDataSource$getFileInternal$2.$cachePath.mkdirs() && !androidRemoteCacheDataSource$getFileInternal$2.$cachePath.isDirectory()) {
                        return new CacheResult.Failure(CacheError.FILE_IO_ERROR, CacheSource.REMOTE, null, 4, null);
                    }
                }
                createFile = androidRemoteCacheDataSource$getFileInternal$2.this$0.createFile;
                invoke = createFile.invoke(androidRemoteCacheDataSource$getFileInternal$2.$cachePath, androidRemoteCacheDataSource$getFileInternal$2.$fileName + ".part");
                if (!invoke.exists()) {
                    invoke.createNewFile();
                }
                length = invoke.length();
                createFile2 = androidRemoteCacheDataSource$getFileInternal$2.this$0.createFile;
                invoke2 = createFile2.invoke(androidRemoteCacheDataSource$getFileInternal$2.$cachePath, androidRemoteCacheDataSource$getFileInternal$2.$fileName + ".etag");
                File file5 = invoke2.exists() ? invoke2 : null;
                String readText$default = file5 != null ? FilesKt.readText$default(file5, null, 1, null) : null;
                Map createMapBuilder = MapsKt.createMapBuilder();
                if (length > 0) {
                    createMapBuilder.put(Command.HTTP_HEADER_RANGE, CollectionsKt.listOf("bytes=" + length + '-'));
                }
                if (readText$default != null) {
                    createMapBuilder.put("If-Range", CollectionsKt.listOf('\"' + readText$default + '\"'));
                }
                Map build = MapsKt.build(createMapBuilder);
                Integer num = androidRemoteCacheDataSource$getFileInternal$2.$priority;
                HttpRequest httpRequest2 = new HttpRequest(androidRemoteCacheDataSource$getFileInternal$2.$url, null, null, null, build, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65518, null);
                httpClientProvider = androidRemoteCacheDataSource$getFileInternal$2.this$0.httpClientProvider;
                androidRemoteCacheDataSource$getFileInternal$2.L$0 = coroutineScope6;
                androidRemoteCacheDataSource$getFileInternal$2.L$1 = invoke;
                androidRemoteCacheDataSource$getFileInternal$2.L$2 = invoke2;
                androidRemoteCacheDataSource$getFileInternal$2.L$3 = httpRequest2;
                androidRemoteCacheDataSource$getFileInternal$2.J$0 = length;
                androidRemoteCacheDataSource$getFileInternal$2.label = 1;
                invoke3 = httpClientProvider.invoke(androidRemoteCacheDataSource$getFileInternal$2);
                if (invoke3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope6;
                httpRequest = httpRequest2;
            } else {
                return new CacheResult.Failure(CacheError.MALFORMED_URL, CacheSource.REMOTE, null, 4, null);
            }
        } else if (i3 == 1) {
            long j5 = androidRemoteCacheDataSource$getFileInternal$2.J$0;
            httpRequest = (HttpRequest) androidRemoteCacheDataSource$getFileInternal$2.L$3;
            File file6 = (File) androidRemoteCacheDataSource$getFileInternal$2.L$2;
            File file7 = (File) androidRemoteCacheDataSource$getFileInternal$2.L$1;
            coroutineScope = (CoroutineScope) androidRemoteCacheDataSource$getFileInternal$2.L$0;
            ResultKt.throwOnFailure(obj);
            invoke3 = obj;
            invoke2 = file6;
            invoke = file7;
            length = j5;
        } else if (i3 == 2) {
            long j6 = androidRemoteCacheDataSource$getFileInternal$2.J$0;
            File file8 = (File) androidRemoteCacheDataSource$getFileInternal$2.L$2;
            file = (File) androidRemoteCacheDataSource$getFileInternal$2.L$1;
            coroutineScope2 = (CoroutineScope) androidRemoteCacheDataSource$getFileInternal$2.L$0;
            ResultKt.throwOnFailure(obj);
            j = j6;
            invoke2 = file8;
            execute = obj;
            httpResponse = (HttpResponse) execute;
            if (HttpResponseKt.isSuccessful(httpResponse)) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Request failed with status code " + httpResponse.getStatusCode()));
            }
            List<String> list = httpResponse.getHeaders().get(Command.HTTP_HEADER_ETAG);
            if (list == null || (str3 = (String) CollectionsKt.firstOrNull((List) list)) == null || (str = StringsKt.trim(str3, '\"')) == null) {
                str = "";
            }
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                FilesKt.writeText$default(invoke2, str, null, 2, null);
                Unit unit = Unit.INSTANCE;
            }
            if (j <= 0 || httpResponse.getStatusCode() != 200) {
                j2 = j;
            } else {
                file.delete();
                file.createNewFile();
                j2 = 0;
            }
            Object body = httpResponse.getBody();
            closeable = body instanceof InputStream ? (InputStream) body : null;
            if (closeable == null) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Response body is not an InputStream"));
            }
            if (httpResponse.getStatusCode() == 206 && httpResponse.getContentSize() > 0) {
                contentSize = httpResponse.getContentSize() + j2;
            } else {
                contentSize = httpResponse.getContentSize();
            }
            Ref$IntRef ref$IntRef8 = new Ref$IntRef();
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            File file9 = invoke2;
            long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
            Duration.Companion companion = Duration.Companion;
            CoroutineScope coroutineScope7 = coroutineScope2;
            long j7 = contentSize;
            ref$LongRef2.element = TimeSource$Monotonic.ValueTimeMark.m8195plusLRDsOJo(m8186markNowz9LOYto, DurationKt.toDuration(androidRemoteCacheDataSource$getFileInternal$2.$intervalMs, DurationUnit.MILLISECONDS));
            Function3 function32 = androidRemoteCacheDataSource$getFileInternal$2.$onProgress;
            int i4 = androidRemoteCacheDataSource$getFileInternal$2.$intervalMs;
            try {
                Result.Companion companion2 = Result.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
                str2 = "";
                httpResponse2 = httpResponse;
                file2 = file9;
                ref$IntRef = ref$IntRef8;
                Result.Companion companion3 = Result.INSTANCE;
                Object obj4 = Result.m8023constructorimpl(ResultKt.createFailure(th));
                ref$IntRef4 = ref$IntRef;
                file3 = file2;
                j4 = j2;
                file4 = file;
                httpResponse4 = httpResponse2;
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj4);
                if (m8026exceptionOrNullimpl != null) {
                }
            }
            try {
                byte[] bArr2 = new byte[8192];
                ref$IntRef2 = new Ref$IntRef();
                appendingSink = Okio.appendingSink(file);
                try {
                    buffer = Okio.buffer(appendingSink);
                    httpResponse3 = httpResponse;
                    sink = appendingSink;
                    closeable2 = closeable;
                    file3 = file9;
                    function3 = function32;
                    ref$LongRef = ref$LongRef2;
                    bArr = bArr2;
                    j3 = j7;
                    obj2 = coroutine_suspended;
                    bufferedSink = buffer;
                    ref$IntRef3 = ref$IntRef8;
                    i = i4;
                    coroutineScope3 = coroutineScope7;
                    str2 = "";
                    j4 = j2;
                    file4 = file;
                    r13 = closeable2;
                    while (true) {
                        read = r13.read(bArr);
                        ref$IntRef2.element = read;
                        InputStream inputStream2 = r13;
                        if (read != -1) {
                        }
                        androidRemoteCacheDataSource$getFileInternal$2 = this;
                        obj2 = obj2;
                        ref$IntRef2 = ref$IntRef5;
                        bArr = bArr;
                        r13 = inputStream2;
                        bufferedSink = bufferedSink;
                        coroutineScope3 = coroutineScope4;
                        closeable2 = closeable2;
                        ref$LongRef = ref$LongRef;
                        httpResponse3 = httpResponse3;
                        sink = sink;
                        ref$IntRef3 = ref$IntRef3;
                    }
                    m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj4);
                    if (m8026exceptionOrNullimpl != null) {
                    }
                } catch (Throwable th5) {
                    str2 = "";
                    httpResponse2 = httpResponse;
                    th2 = th5;
                    file2 = file9;
                    ref$IntRef = ref$IntRef8;
                    throw th2;
                }
            } catch (Throwable th6) {
                str2 = "";
                httpResponse2 = httpResponse;
                th = th6;
                file2 = file9;
                ref$IntRef = ref$IntRef8;
                throw th;
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = androidRemoteCacheDataSource$getFileInternal$2.I$0;
            long j8 = androidRemoteCacheDataSource$getFileInternal$2.J$1;
            long j9 = androidRemoteCacheDataSource$getFileInternal$2.J$0;
            BufferedSink bufferedSink3 = (BufferedSink) androidRemoteCacheDataSource$getFileInternal$2.L$13;
            ?? r7 = (Closeable) androidRemoteCacheDataSource$getFileInternal$2.L$12;
            ?? r8 = (Closeable) androidRemoteCacheDataSource$getFileInternal$2.L$11;
            Ref$IntRef ref$IntRef9 = (Ref$IntRef) androidRemoteCacheDataSource$getFileInternal$2.L$10;
            byte[] bArr3 = (byte[]) androidRemoteCacheDataSource$getFileInternal$2.L$9;
            InputStream inputStream3 = (InputStream) androidRemoteCacheDataSource$getFileInternal$2.L$8;
            closeable = (Closeable) androidRemoteCacheDataSource$getFileInternal$2.L$7;
            Function3 function33 = (Function3) androidRemoteCacheDataSource$getFileInternal$2.L$6;
            byte[] bArr4 = bArr3;
            Ref$LongRef ref$LongRef3 = (Ref$LongRef) androidRemoteCacheDataSource$getFileInternal$2.L$5;
            Ref$IntRef ref$IntRef10 = (Ref$IntRef) androidRemoteCacheDataSource$getFileInternal$2.L$4;
            HttpResponse httpResponse5 = (HttpResponse) androidRemoteCacheDataSource$getFileInternal$2.L$3;
            File file10 = (File) androidRemoteCacheDataSource$getFileInternal$2.L$2;
            File file11 = (File) androidRemoteCacheDataSource$getFileInternal$2.L$1;
            CoroutineScope coroutineScope8 = (CoroutineScope) androidRemoteCacheDataSource$getFileInternal$2.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                inputStream = inputStream3;
                httpResponse3 = httpResponse5;
                bufferedSink = r7;
                i2 = i5;
                ref$LongRef = ref$LongRef3;
                str2 = "";
                coroutineScope5 = coroutineScope8;
                obj3 = coroutine_suspended;
                ref$IntRef6 = ref$IntRef10;
                buffer = bufferedSink3;
                file3 = file10;
                sink = r8;
                ref$IntRef5 = ref$IntRef9;
                j4 = j9;
                file4 = file11;
                closeable2 = closeable;
                function3 = function33;
                j3 = j8;
            } catch (Throwable th7) {
                th3 = th7;
                str2 = "";
                bufferedSink2 = r7;
                sink2 = r8;
                try {
                    throw th3;
                } catch (Throwable th8) {
                    try {
                        CloseableKt.closeFinally(bufferedSink2, th3);
                        throw th8;
                    } catch (Throwable th9) {
                        th2 = th9;
                        appendingSink = sink2;
                        j2 = j9;
                        ref$IntRef = ref$IntRef10;
                        httpResponse2 = httpResponse5;
                        file2 = file10;
                        file = file11;
                        try {
                            throw th2;
                        } catch (Throwable th10) {
                            try {
                                CloseableKt.closeFinally(appendingSink, th2);
                                throw th10;
                            } catch (Throwable th11) {
                                th = th11;
                                try {
                                    throw th;
                                } catch (Throwable th12) {
                                    try {
                                        CloseableKt.closeFinally(closeable, th);
                                        throw th12;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        Result.Companion companion32 = Result.INSTANCE;
                                        Object obj42 = Result.m8023constructorimpl(ResultKt.createFailure(th));
                                        ref$IntRef4 = ref$IntRef;
                                        file3 = file2;
                                        j4 = j2;
                                        file4 = file;
                                        httpResponse4 = httpResponse2;
                                        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj42);
                                        if (m8026exceptionOrNullimpl != null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            try {
                try {
                    long m8186markNowz9LOYto2 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                    Duration.Companion companion4 = Duration.Companion;
                    CoroutineScope coroutineScope9 = coroutineScope5;
                    ref$LongRef.element = TimeSource$Monotonic.ValueTimeMark.m8195plusLRDsOJo(m8186markNowz9LOYto2, DurationKt.toDuration(i2, DurationUnit.MILLISECONDS));
                    androidRemoteCacheDataSource$getFileInternal$2 = this;
                    ref$IntRef3 = ref$IntRef7;
                    obj2 = obj3;
                    ref$IntRef2 = ref$IntRef5;
                    coroutineScope3 = coroutineScope9;
                    bArr = bArr4;
                    r13 = inputStream;
                    i = i2;
                    while (true) {
                        try {
                            read = r13.read(bArr);
                            ref$IntRef2.element = read;
                            InputStream inputStream22 = r13;
                            if (read != -1) {
                                break;
                            }
                            buffer.write(bArr, 0, read);
                            buffer.flush();
                            ref$IntRef3.element += ref$IntRef2.element;
                            if (function3 != null) {
                                ref$IntRef5 = ref$IntRef2;
                                if (TimeSource$Monotonic.ValueTimeMark.m8191hasPassedNowimpl(ref$LongRef.element)) {
                                    break;
                                }
                                coroutineScope4 = coroutineScope3;
                            } else {
                                coroutineScope4 = coroutineScope3;
                                ref$IntRef5 = ref$IntRef2;
                            }
                            androidRemoteCacheDataSource$getFileInternal$2 = this;
                            obj2 = obj2;
                            ref$IntRef2 = ref$IntRef5;
                            bArr = bArr;
                            r13 = inputStream22;
                            bufferedSink = bufferedSink;
                            coroutineScope3 = coroutineScope4;
                            closeable2 = closeable2;
                            ref$LongRef = ref$LongRef;
                            httpResponse3 = httpResponse3;
                            sink = sink;
                            ref$IntRef3 = ref$IntRef3;
                        } catch (Throwable th14) {
                            th = th14;
                            BufferedSink bufferedSink4 = bufferedSink;
                            Closeable closeable3 = closeable2;
                            Ref$IntRef ref$IntRef11 = ref$IntRef3;
                            Sink sink3 = sink;
                            HttpResponse httpResponse6 = httpResponse3;
                        }
                    }
                    m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj42);
                    if (m8026exceptionOrNullimpl != null) {
                        return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, m8026exceptionOrNullimpl);
                    }
                    if (httpResponse4.getStatusCode() != 206 ? httpResponse4.getContentSize() == -1 ? file4.length() <= 0 : file4.length() != httpResponse4.getContentSize() : file4.length() != httpResponse4.getContentSize() + j4) {
                        return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, null, 4, null);
                    }
                    File file12 = new File(this.$cachePath, this.$fileName);
                    try {
                        if (file12.exists() && !file12.delete()) {
                            throw new IllegalStateException("Final file exists and could not be deleted before overwriting");
                        }
                    } catch (Throwable th15) {
                        Result.Companion companion5 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th15));
                    }
                    if (!file4.renameTo(file12)) {
                        throw new IllegalStateException("Could not rename temporary file to final file");
                    }
                    if (file3.exists() && !file3.delete()) {
                        throw new IllegalStateException("Could not delete Etag file after successful download");
                    }
                    m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                    Throwable m8026exceptionOrNullimpl2 = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                    if (m8026exceptionOrNullimpl2 != null) {
                        return new CacheResult.Failure(CacheError.FILE_STATE_WRONG, CacheSource.REMOTE, m8026exceptionOrNullimpl2);
                    }
                    String str5 = this.$url;
                    String str6 = this.$fileName;
                    getFileExtensionFromUrl = this.this$0.getFileExtensionFromUrl;
                    String invoke4 = getFileExtensionFromUrl.invoke(this.$url);
                    String str7 = invoke4 == null ? str2 : invoke4;
                    long j10 = ref$IntRef4.element;
                    String protocol = httpResponse4.getProtocol();
                    Integer num2 = this.$priority;
                    return new CacheResult.Success(new CachedFile(str5, str6, file12, str7, j10, protocol, num2 != null ? num2.intValue() : Integer.MAX_VALUE), CacheSource.REMOTE);
                } catch (Throwable th16) {
                    th = th16;
                    ref$IntRef7 = ref$IntRef6;
                }
            } catch (Throwable th17) {
                th = th17;
                ref$IntRef10 = ref$IntRef7;
                th3 = th;
                BufferedSink bufferedSink5 = bufferedSink;
                Sink sink4 = sink;
                closeable = closeable2;
                httpResponse5 = httpResponse3;
                file10 = file3;
                file11 = file4;
                j9 = j4;
                bufferedSink2 = bufferedSink5;
                sink2 = sink4;
                throw th3;
            }
            ref$IntRef7 = ref$IntRef6;
        }
        androidRemoteCacheDataSource$getFileInternal$2.L$0 = coroutineScope;
        androidRemoteCacheDataSource$getFileInternal$2.L$1 = invoke;
        androidRemoteCacheDataSource$getFileInternal$2.L$2 = invoke2;
        androidRemoteCacheDataSource$getFileInternal$2.L$3 = null;
        androidRemoteCacheDataSource$getFileInternal$2.J$0 = length;
        androidRemoteCacheDataSource$getFileInternal$2.label = 2;
        execute = ((HttpClient) invoke3).execute(httpRequest, true, androidRemoteCacheDataSource$getFileInternal$2);
        if (execute == coroutine_suspended) {
            return coroutine_suspended;
        }
        long j11 = length;
        file = invoke;
        coroutineScope2 = coroutineScope;
        j = j11;
        httpResponse = (HttpResponse) execute;
        if (HttpResponseKt.isSuccessful(httpResponse)) {
        }
    }
}
