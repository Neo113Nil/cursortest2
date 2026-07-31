package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class b implements DataSource {
    public static final int h = 8;

    @NotNull
    public final String a;

    @NotNull
    public final i b;

    @NotNull
    public final String c;

    @Nullable
    public RandomAccessFile d;
    public long e;
    public boolean f;
    public boolean g;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.ProgressiveMediaFileDataSource$open$1", f = "ProgressiveMediaFileDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ DataSpec c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DataSpec dataSpec, Continuation continuation) {
            super(2, continuation);
            this.c = dataSpec;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            File c;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                b bVar = b.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a = bVar.a(bVar.a);
                if (a instanceof c.a) {
                    c = ((c.a) a).b();
                } else {
                    if (!(a instanceof c.C1589c)) {
                        b.this.g = true;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, b.this.c, "Failed to download file: " + b.this.a, null, false, 12, null);
                        throw new IOException("Cannot read file: " + b.this.a);
                    }
                    c = ((c.C1589c) a).c();
                }
                if (!c.exists()) {
                    throw new IOException("Cannot read file, does not exist yet: " + b.this.a);
                }
                b bVar2 = b.this;
                RandomAccessFile randomAccessFile = new RandomAccessFile(c, "r");
                randomAccessFile.seek(this.c.position);
                bVar2.a(randomAccessFile);
                b bVar3 = b.this;
                long j = this.c.length;
                if (j == -1) {
                    j = c.length() - this.c.position;
                }
                bVar3.e = j;
                if (b.this.e == 0 && b.this.a(a)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.c, "Streaming error likely detected", null, false, 12, null);
                    b.this.g = true;
                }
                return Boxing.boxLong(b.this.e);
            } catch (IOException e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, b.this.c, "Failed to open file: " + b.this.a, e, false, 8, null);
                throw e;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.ProgressiveMediaFileDataSource$streamingStatus$1", f = "ProgressiveMediaFileDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b$b, reason: collision with other inner class name */
    public static final class C1668b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1668b(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1668b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C1668b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return b.this.b.a(this.c);
        }
    }

    public b(@NotNull String url, @NotNull i mediaCacheRepository) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        this.a = url;
        this.b = mediaCacheRepository;
        this.c = "ProgressiveMediaFileDataSource";
    }

    @VisibleForTesting
    public static /* synthetic */ void c() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(@NotNull TransferListener transferListener) {
        Intrinsics.checkNotNullParameter(transferListener, "transferListener");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.c, "addTransferListener", null, false, 12, null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        try {
            RandomAccessFile randomAccessFile = this.d;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } finally {
            this.d = null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return Uri.parse(this.a);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(@NotNull DataSpec dataSpec) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new a(dataSpec, null), 1, null);
        return ((Number) runBlocking$default).longValue();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(@NotNull byte[] buffer, int i, int i2) {
        IOException iOException;
        int i3;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        try {
            if (i2 == 0) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.c, "Read length is 0", null, false, 12, null);
                return 0;
            }
            if (this.e == 0 && (a(this.a) instanceof c.a)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.c, "Media stream is complete", null, false, 12, null);
                return -1;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a2 = a(this.a);
            if (a2 instanceof c.b) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Streaming failed: " + this.a, null, false, 12, null);
                this.g = true;
                return 0;
            }
            if (a2 instanceof c.a) {
                RandomAccessFile randomAccessFile = this.d;
                r0 = randomAccessFile != null ? randomAccessFile.read(buffer, i, i2) : 0;
                if (r0 <= 0) {
                    return r0;
                }
                this.f = true;
                this.e -= r0;
                return r0;
            }
            loop0: while (true) {
                i3 = 0;
                while (i3 <= 0) {
                    try {
                        if (!(a(this.a) instanceof c.C1589c)) {
                            break loop0;
                        }
                        RandomAccessFile randomAccessFile2 = this.d;
                        if (randomAccessFile2 != null) {
                            i3 = randomAccessFile2.read(buffer, i, i2);
                        }
                    } catch (IOException e) {
                        iOException = e;
                        r0 = i3;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Waiting for more data", iOException, false, 8, null);
                        return r0;
                    }
                }
            }
            if (i3 <= 0) {
                return i3;
            }
            this.f = true;
            this.e -= i3;
            return i3;
        } catch (IOException e2) {
            iOException = e2;
        }
    }

    @Nullable
    public final RandomAccessFile b() {
        return this.d;
    }

    public final void a(@Nullable RandomAccessFile randomAccessFile) {
        this.d = randomAccessFile;
    }

    public final boolean a() {
        return this.g;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a(String str) {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C1668b(str, null), 1, null);
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) runBlocking$default;
    }

    public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar) {
        return this.f && (cVar instanceof c.C1589c) && Intrinsics.areEqual(((c.C1589c) cVar).d(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a());
    }
}
