package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.I;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class j implements i {

    @NotNull
    public static final a k = new a(null);
    public static final int l = 8;

    @NotNull
    public static final String m = "MediaCacheRepository";

    @NotNull
    public static final String n = "TEMP";

    @NotNull
    public final l a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a c;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f d;

    @NotNull
    public final CoroutineScope e;

    @NotNull
    public final ConcurrentHashMap<String, Mutex> f;

    @NotNull
    public final HashSet<String> g;

    @NotNull
    public final ConcurrentHashMap<String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b> h;

    @NotNull
    public final CoroutineScope i;

    @Nullable
    public Job j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }

        public final String a(String str) {
            return str + j.n;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$getMediaFile$2", f = "MediaCacheRepository.kt", l = {372, 160}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ j g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, j jVar, Continuation continuation) {
            super(2, continuation);
            this.f = str;
            this.g = jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f, this.g, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x01a2 A[Catch: all -> 0x01df, Exception -> 0x01e2, TryCatch #5 {Exception -> 0x01e2, all -> 0x01df, blocks: (B:10:0x019c, B:12:0x01a2, B:14:0x01b7, B:18:0x01e6), top: B:9:0x019c }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x01ef  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            j jVar;
            String str;
            Mutex mutex;
            Object putIfAbsent;
            Mutex mutex2;
            Object a;
            String str2;
            File file;
            File file2;
            Object obj2;
            i.a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f.length() == 0) {
                        return i.a.AbstractC1586a.k.c;
                    }
                    ConcurrentHashMap concurrentHashMap = this.g.f;
                    String str3 = this.f;
                    Object obj3 = concurrentHashMap.get(str3);
                    if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str3, (obj3 = MutexKt.Mutex$default(false, 1, null)))) != null) {
                        obj3 = putIfAbsent;
                    }
                    Mutex mutex3 = (Mutex) obj3;
                    Intrinsics.checkNotNull(mutex3);
                    j jVar2 = this.g;
                    String str4 = this.f;
                    this.a = mutex3;
                    this.b = jVar2;
                    this.c = str4;
                    this.e = 1;
                    if (mutex3.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jVar = jVar2;
                    str = str4;
                    mutex = mutex3;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        file2 = (File) this.d;
                        file = (File) this.c;
                        String str5 = (String) this.b;
                        mutex2 = (Mutex) this.a;
                        try {
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex = mutex2;
                                str2 = str5;
                                a = obj;
                            } catch (Exception e) {
                                e = e;
                                str = str5;
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, j.m, "Failed to fetch media from url: " + str, e, false, 8, null);
                                i.a.AbstractC1586a a2 = o.a(e);
                                mutex2.unlock(null);
                                return a2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            mutex = mutex2;
                            mutex.unlock(null);
                            throw th;
                        }
                        try {
                            aVar = (i.a) a;
                            if (aVar instanceof i.a.b) {
                                mutex.unlock(null);
                                return aVar;
                            }
                            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                            MolocoLogger.debug$default(molocoLogger, j.m, "Renaming tmp file to dst file", false, 4, null);
                            if (file2.renameTo(file)) {
                                i.a.b bVar = new i.a.b(file);
                                mutex.unlock(null);
                                return bVar;
                            }
                            MolocoLogger.info$default(molocoLogger, j.m, "Renaming to dst file failed, dstFile exists: " + file.exists(), null, false, 12, null);
                            i.a.AbstractC1586a.p pVar = i.a.AbstractC1586a.p.c;
                            mutex.unlock(null);
                            return pVar;
                        } catch (Exception e2) {
                            e = e2;
                            str5 = str2;
                            mutex2 = mutex;
                            str = str5;
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, j.m, "Failed to fetch media from url: " + str, e, false, 8, null);
                            i.a.AbstractC1586a a22 = o.a(e);
                            mutex2.unlock(null);
                            return a22;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2 = mutex;
                            mutex = mutex2;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    str = (String) this.c;
                    jVar = (j) this.b;
                    mutex = (Mutex) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                x<File, com.moloco.sdk.internal.m> d = jVar.d();
                if (d instanceof x.a) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, j.m, "Failed to retrieve storageDir with error code: " + ((com.moloco.sdk.internal.m) ((x.a) d).a()).b(), null, false, 12, null);
                    switch (((com.moloco.sdk.internal.m) ((x.a) d).a()).b()) {
                        case 100:
                            obj2 = i.a.AbstractC1586a.c.c;
                            break;
                        case 101:
                            obj2 = i.a.AbstractC1586a.b.c;
                            break;
                        case 102:
                            obj2 = i.a.AbstractC1586a.C1587a.c;
                            break;
                        default:
                            obj2 = i.a.AbstractC1586a.d.c;
                            break;
                    }
                    mutex.unlock(null);
                    return obj2;
                }
                if (!(d instanceof x.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                File file3 = (File) ((x.b) d).a();
                String b = I.b(str);
                File file4 = new File(file3, b);
                if (file4.exists()) {
                    if (!jVar.c.a(file4)) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, j.m, "Found asset in cache: " + str, null, false, 12, null);
                        i.a.b bVar2 = new i.a.b(file4);
                        mutex.unlock(null);
                        return bVar2;
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, j.m, "Media file was partially downloaded by ChunkedMediaDownloader. Deleting the file and redownloading", null, false, 12, null);
                    file4.delete();
                }
                File file5 = new File(file3, j.k.a(b));
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, j.m, "Asset not found in cache. Downloading to tmp file[already exists == " + file5.exists() + ']', false, 4, null);
                if (file5.exists()) {
                    file5.delete();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d dVar = jVar.b;
                this.a = mutex;
                this.b = str;
                this.c = file4;
                this.d = file5;
                this.e = 2;
                a = dVar.a(str, file5, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                file = file4;
                file2 = file5;
                aVar = (i.a) a;
                if (aVar instanceof i.a.b) {
                }
            } catch (Exception e3) {
                e = e3;
                mutex2 = mutex;
                MolocoLogger.error$default(MolocoLogger.INSTANCE, j.m, "Failed to fetch media from url: " + str, e, false, 8, null);
                i.a.AbstractC1586a a222 = o.a(e);
                mutex2.unlock(null);
                return a222;
            } catch (Throwable th3) {
                th = th3;
                mutex.unlock(null);
                throw th;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFile$2", f = "MediaCacheRepository.kt", l = {372}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ j g;
        public final /* synthetic */ String h;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFile$2$1$1", f = "MediaCacheRepository.kt", l = {Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ j b;
            public final /* synthetic */ String c;
            public final /* synthetic */ File d;
            public final /* synthetic */ String e;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar, String str, File file, String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar, Continuation continuation) {
                super(2, continuation);
                this.b = jVar;
                this.c = str;
                this.d = file;
                this.e = str2;
                this.f = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a aVar = this.b.c;
                    String str = this.c;
                    File file = this.d;
                    String str2 = this.e;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = this.f;
                    this.a = 1;
                    if (aVar.a(str, file, str2, bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.b.g.remove(this.c);
                this.b.h.remove(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, j jVar, String str2, Continuation continuation) {
            super(2, continuation);
            this.f = str;
            this.g = jVar;
            this.h = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            j jVar;
            String str;
            String str2;
            Object putIfAbsent;
            Object putIfAbsent2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c c1589c;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, j.m, "Streaming media for: " + this.f, null, false, 12, null);
                if (this.f.length() == 0) {
                    return new c.b(i.a.AbstractC1586a.k.c);
                }
                ConcurrentHashMap concurrentHashMap = this.g.f;
                String str3 = this.f;
                Object obj2 = concurrentHashMap.get(str3);
                if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str3, (obj2 = MutexKt.Mutex$default(false, 1, null)))) != null) {
                    obj2 = putIfAbsent;
                }
                mutex = (Mutex) obj2;
                Intrinsics.checkNotNull(mutex);
                j jVar2 = this.g;
                String str4 = this.f;
                String str5 = this.h;
                this.a = mutex;
                this.b = jVar2;
                this.c = str4;
                this.d = str5;
                this.e = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jVar = jVar2;
                str = str4;
                str2 = str5;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str6 = (String) this.d;
                String str7 = (String) this.c;
                j jVar3 = (j) this.b;
                mutex = (Mutex) this.a;
                ResultKt.throwOnFailure(obj);
                str2 = str6;
                str = str7;
                jVar = jVar3;
            }
            try {
                x c = jVar.c();
                if (c instanceof x.a) {
                    return ((x.a) c).a();
                }
                if (!(c instanceof x.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                File a2 = jVar.a(str, (File) ((x.b) c).a());
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, j.m, "Going to download the media file to location: " + a2.getAbsolutePath(), null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b) jVar.h.get(str);
                if (jVar.g.contains(str)) {
                    MolocoLogger.info$default(molocoLogger, j.m, "Media file is already being downloaded, so returning in progress status for url: " + str, null, false, 12, null);
                    if (bVar == null || (c1589c = bVar.a()) == null) {
                        c1589c = new c.C1589c(a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a());
                    }
                    return c1589c;
                }
                if (jVar.c.b(a2)) {
                    return new c.a(a2);
                }
                MolocoLogger.info$default(molocoLogger, j.m, "Media file needs to be downloaded: " + str, null, false, 12, null);
                jVar.g.add(str);
                ConcurrentHashMap concurrentHashMap2 = jVar.h;
                Object obj3 = concurrentHashMap2.get(str);
                if (obj3 == null && (putIfAbsent2 = concurrentHashMap2.putIfAbsent(str, (obj3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b(new c.C1589c(a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a()))))) != null) {
                    obj3 = putIfAbsent2;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b) obj3;
                BuildersKt__Builders_commonKt.launch$default(jVar.e, null, null, new a(jVar, str, a2, str2, bVar2, null), 3, null);
                return bVar2.a();
            } finally {
                mutex.unlock(null);
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFileStatus$1", f = "MediaCacheRepository.kt", l = {248}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file, Continuation continuation) {
            super(2, continuation);
            this.c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.c, continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                c.a aVar = new c.a(this.c);
                this.a = 1;
                if (flowCollector.emit(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFileStatus$cacheDir$1", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ x<File, c.b> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(x<File, c.b> xVar, Continuation continuation) {
            super(2, continuation);
            this.b = xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((x.a) this.b).a();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$tryCleanup$newCleanUpJob$1", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function2 {
        public int a;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            x<File, com.moloco.sdk.internal.m> a = j.this.d.a();
            if (a instanceof x.b) {
                j.this.a((File) ((x.b) a).a());
            } else {
                if (!(a instanceof x.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.error$default(MolocoLogger.INSTANCE, j.m, "Failed to cleanup external cache directory", null, false, 12, null);
            }
            x<File, com.moloco.sdk.internal.m> b = j.this.d.b();
            if (b instanceof x.b) {
                j.this.a((File) ((x.b) b).a());
            } else {
                if (!(b instanceof x.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.error$default(MolocoLogger.INSTANCE, j.m, "Failed to cleanup internal cache directory", null, false, 12, null);
            }
            return Unit.INSTANCE;
        }
    }

    public j(@NotNull l mediaConfig, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d legacyMediaDownloader, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a chunkedMediaDownloader, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f mediaCacheLocationProvider) {
        Intrinsics.checkNotNullParameter(mediaConfig, "mediaConfig");
        Intrinsics.checkNotNullParameter(legacyMediaDownloader, "legacyMediaDownloader");
        Intrinsics.checkNotNullParameter(chunkedMediaDownloader, "chunkedMediaDownloader");
        Intrinsics.checkNotNullParameter(mediaCacheLocationProvider, "mediaCacheLocationProvider");
        this.a = mediaConfig;
        this.b = legacyMediaDownloader;
        this.c = chunkedMediaDownloader;
        this.d = mediaCacheLocationProvider;
        this.e = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo());
        this.f = new ConcurrentHashMap<>();
        this.g = new HashSet<>();
        this.h = new ConcurrentHashMap<>();
        this.i = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo());
    }

    public final x<File, c.b> c() {
        x<File, com.moloco.sdk.internal.m> d2 = d();
        if (!(d2 instanceof x.a)) {
            if (d2 instanceof x.b) {
                return new x.b(((x.b) d2).a());
            }
            throw new NoWhenBranchMatchedException();
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = m;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to retrieve storageDir with error code: ");
        x.a aVar = (x.a) d2;
        sb.append(((com.moloco.sdk.internal.m) aVar.a()).b());
        MolocoLogger.warn$default(molocoLogger, str, sb.toString(), null, false, 12, null);
        switch (((com.moloco.sdk.internal.m) aVar.a()).b()) {
            case 100:
                return new x.a(new c.b(i.a.AbstractC1586a.c.c));
            case 101:
                return new x.a(new c.b(i.a.AbstractC1586a.b.c));
            case 102:
                return new x.a(new c.b(i.a.AbstractC1586a.C1587a.c));
            default:
                return new x.a(new c.b(i.a.AbstractC1586a.d.c));
        }
    }

    @VisibleForTesting
    @NotNull
    public final x<File, com.moloco.sdk.internal.m> d() {
        x<File, com.moloco.sdk.internal.m> a2 = this.d.a();
        if (a2 instanceof x.a) {
            return this.d.b();
        }
        if (a2 instanceof x.b) {
            return a2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
    @NotNull
    public Flow b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        x<File, c.b> c2 = c();
        if (c2 instanceof x.a) {
            return FlowKt.flow(new e(c2, null));
        }
        if (c2 instanceof x.b) {
            File file = (File) ((x.b) c2).a();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            String str = m;
            MolocoLogger.info$default(molocoLogger, str, "Collecting status for media file: " + url, null, false, 12, null);
            File a2 = a(url, file);
            if (a2.exists() && this.c.b(a2)) {
                return FlowKt.flow(new d(a2, null));
            }
            MolocoLogger.info$default(molocoLogger, str, "Media file needs to be downloaded: " + url, null, false, 12, null);
            ConcurrentHashMap<String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b> concurrentHashMap = this.h;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = concurrentHashMap.get(url);
            if (bVar == null) {
                MolocoLogger.info$default(molocoLogger, str, "Download has not yet started for: " + url, null, false, 12, null);
                bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b(new c.C1589c(a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a()));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b putIfAbsent = concurrentHashMap.putIfAbsent(url, bVar);
                if (putIfAbsent != null) {
                    bVar = putIfAbsent;
                }
            }
            return bVar.b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
    @Nullable
    public Object a(@NotNull String str, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new b(str, this, null), continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
    @Nullable
    public Object a(@NotNull String str, @NotNull String str2, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new c(str, this, str2, null), continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a(@NotNull String url) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a2;
        Intrinsics.checkNotNullParameter(url, "url");
        x<File, c.b> c2 = c();
        if (c2 instanceof x.a) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) ((x.a) c2).a();
        }
        if (c2 instanceof x.b) {
            File a3 = a(url, (File) ((x.b) c2).a());
            if (a3.exists() && this.c.b(a3)) {
                return new c.a(a3);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = this.h.get(url);
            return (bVar == null || (a2 = bVar.a()) == null) ? new c.C1589c(a3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a()) : a2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final File a(String str, File file) {
        return new File(file, I.b(str));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
    @NotNull
    public Job a() {
        Job launch$default;
        Job job = this.j;
        if (job != null && job.isActive()) {
            return job;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.i, null, null, new f(null), 3, null);
        this.j = launch$default;
        return launch$default;
    }

    public final void a(File file) {
        try {
            if (SequencesKt.sumOfLong(SequencesKt.map(FilesKt.walkTopDown(file), new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(j.b((File) obj));
                }
            })) < this.a.f()) {
                return;
            }
            try {
                FilesKt.deleteRecursively(file);
            } catch (Exception e2) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, m, e2.toString(), e2, false, 8, null);
            }
        } catch (Exception e3) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, m, e3.toString(), e3, false, 8, null);
        }
    }

    public static final long b(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length();
    }
}
