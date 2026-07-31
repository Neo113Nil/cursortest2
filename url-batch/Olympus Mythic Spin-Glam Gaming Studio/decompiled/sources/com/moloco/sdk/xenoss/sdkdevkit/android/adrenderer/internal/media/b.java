package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpRequestRetryConfig;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.plugins.HttpRetryDelayContext;
import io.ktor.client.plugins.HttpRetryModifyRequestContext;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.util.cio.FileChannelsKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.core.PacketKt;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.io.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a {
    public static final int f = 8;

    @NotNull
    public final l a;

    @NotNull
    public final u b;

    @NotNull
    public final com.moloco.sdk.internal.error.b c;

    @NotNull
    public final HttpClient d;

    @NotNull
    public final String e;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl", f = "ChunkedMediaDownloader.kt", l = {294, 294}, m = "downloadFullFile")
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return b.this.a((File) null, (HttpResponse) null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl$downloadMedia$2", f = "ChunkedMediaDownloader.kt", l = {95, 106, 138, 149}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$b, reason: collision with other inner class name */
    public static final class C1585b extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public int c;
        public int d;
        public long e;
        public Object f;
        public int g;
        public final /* synthetic */ String i;
        public final /* synthetic */ File j;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a k;
        public final /* synthetic */ String l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1585b(String str, File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, String str2, Continuation continuation) {
            super(2, continuation);
            this.i = str;
            this.j = file;
            this.k = aVar;
            this.l = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1585b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C1585b(this.i, this.j, this.k, this.l, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0172 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0195 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x01a6 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0214 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0215 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0372 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0390 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x03a6 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0389  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0430 A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0108 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0142 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0162 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0028, B:14:0x0172, B:17:0x018d, B:19:0x0195, B:21:0x0199, B:22:0x01a3, B:25:0x01a6, B:29:0x0204, B:32:0x0215, B:34:0x0270, B:36:0x02c7, B:38:0x02d4, B:41:0x0318, B:44:0x034d, B:48:0x036e, B:50:0x0372, B:52:0x0390, B:54:0x03a6, B:60:0x02fc, B:61:0x03c7, B:62:0x03cc, B:64:0x03cd, B:69:0x0430, B:74:0x004e, B:77:0x006b, B:80:0x0084, B:83:0x0095, B:85:0x00bb, B:87:0x00c5, B:89:0x00d7, B:91:0x00df, B:92:0x0104, B:94:0x0108, B:95:0x0111, B:97:0x0142, B:99:0x0162, B:104:0x00e7), top: B:2:0x0012, inners: #0 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0425 -> B:11:0x0429). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar;
            long length;
            String d;
            int i2;
            int i3;
            int i4;
            int i5;
            String e;
            List split$default;
            String str;
            String str2;
            String str3;
            Object obj2;
            long j;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar2;
            int i6;
            long j2;
            String str4;
            int i7;
            int i8;
            long j3;
            Object obj3;
            i.a a;
            int parseInt;
            Object obj4;
            String str5 = ": ";
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.g;
            String str6 = "/";
            int i10 = 2;
            int i11 = 1;
            try {
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.e, "Fetching asset from network: " + this.i, null, false, 12, null);
                    try {
                        e = b.this.e(this.j);
                    } catch (NumberFormatException e2) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, b.this.e, "Failed to read range file", e2, false, 8, null);
                        b.this.h(this.j);
                    }
                    if (e != null && (split$default = StringsKt.split$default((CharSequence) e, new String[]{"/"}, false, 0, 6, (Object) null)) != null && (str = (String) CollectionsKt.last(split$default)) != null) {
                        i = Integer.parseInt(str);
                        aVar = this.k;
                        if (aVar != null) {
                            aVar.a(this.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a());
                        }
                        length = this.j.length();
                        b bVar = b.this;
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        MolocoLogger.info$default(molocoLogger, bVar.e, "Previous tmpfile bytes: " + length, null, false, 12, null);
                        if (i != length) {
                            MolocoLogger.info$default(molocoLogger, b.this.e, "File already downloaded, skipping download", null, false, 12, null);
                            return b.this.a(this.j, this.k);
                        }
                        d = b.this.d(this.j);
                        i2 = -1;
                        i3 = 1;
                        i4 = i;
                        i5 = 0;
                        if (i3 != 0) {
                        }
                    }
                    i = Integer.MAX_VALUE;
                    aVar = this.k;
                    if (aVar != null) {
                    }
                    length = this.j.length();
                    b bVar2 = b.this;
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger2, bVar2.e, "Previous tmpfile bytes: " + length, null, false, 12, null);
                    if (i != length) {
                    }
                } else if (i9 == 1) {
                    i5 = this.c;
                    length = this.e;
                    i2 = this.b;
                    i4 = this.a;
                    d = (String) this.f;
                    ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    long j4 = length;
                    String str7 = d;
                    int i12 = i2;
                    int i13 = i4;
                    if (((Boolean) obj4).booleanValue()) {
                    }
                } else if (i9 == 2) {
                    i5 = this.c;
                    long j5 = this.e;
                    int i14 = this.b;
                    int i15 = this.a;
                    String str8 = (String) this.f;
                    ResultKt.throwOnFailure(obj);
                    str4 = str8;
                    i7 = i15;
                    i8 = i14;
                    j3 = j5;
                    obj3 = obj;
                    HttpResponse httpResponse = (HttpResponse) obj3;
                    a = b.this.a(this.j, httpResponse, this.k);
                    if (!(a instanceof i.a.AbstractC1586a)) {
                    }
                } else if (i9 == 3) {
                    i5 = this.d;
                    j = this.e;
                    i2 = this.c;
                    int i16 = this.b;
                    int i17 = this.a;
                    String str9 = (String) this.f;
                    ResultKt.throwOnFailure(obj);
                    str3 = ": ";
                    obj2 = coroutine_suspended;
                    str2 = "/";
                    i3 = i16;
                    i4 = i17;
                    d = str9;
                    aVar2 = this.k;
                    if (aVar2 == null) {
                    }
                    if (i3 == 0) {
                    }
                    str5 = r43;
                    if (i3 != 0) {
                    }
                } else {
                    if (i9 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = this.c;
                    length = this.e;
                    i2 = this.b;
                    i4 = this.a;
                    d = (String) this.f;
                    ResultKt.throwOnFailure(obj);
                    String str10 = ": ";
                    Object obj5 = coroutine_suspended;
                    String str11 = "/";
                    int i18 = 2;
                    i10 = i18;
                    str6 = str11;
                    i11 = 1;
                    i3 = 0;
                    coroutine_suspended = obj5;
                    str5 = str10;
                    if (i3 != 0) {
                        u uVar = b.this.b;
                        this.f = d;
                        this.a = i4;
                        this.b = i2;
                        this.e = length;
                        this.c = i5;
                        this.g = i11;
                        obj4 = uVar.a(5000L, this);
                        if (obj4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j42 = length;
                        String str72 = d;
                        int i122 = i2;
                        int i132 = i4;
                        if (((Boolean) obj4).booleanValue()) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar3 = this.k;
                            if (aVar3 != null) {
                                aVar3.a(new c.b(i.a.AbstractC1586a.n.c));
                            }
                            return i.a.AbstractC1586a.n.c;
                        }
                        i5 += i11;
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.e, "Making request to fetch chunk: " + i5 + " for remainingBytes: " + i122, null, false, 12, null);
                        b bVar3 = b.this;
                        String str12 = this.i;
                        this.f = str72;
                        this.a = i132;
                        this.b = i122;
                        this.e = j42;
                        this.c = i5;
                        this.g = i10;
                        obj3 = bVar3.a(str12, j42, i132, str72, this);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str4 = str72;
                        i7 = i132;
                        i8 = i122;
                        j3 = j42;
                        HttpResponse httpResponse2 = (HttpResponse) obj3;
                        a = b.this.a(this.j, httpResponse2, this.k);
                        if (!(a instanceof i.a.AbstractC1586a)) {
                            return a;
                        }
                        b.this.a(this.j, httpResponse2);
                        MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
                        String str13 = b.this.e;
                        StringBuilder sb = new StringBuilder();
                        sb.append("ResponseCode: ");
                        sb.append(httpResponse2.getStatus().getValue());
                        sb.append(", ");
                        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                        sb.append(httpHeaders.getContentLength());
                        sb.append(str5);
                        sb.append(HttpMessagePropertiesKt.contentLength(httpResponse2));
                        MolocoLogger.info$default(molocoLogger3, str13, sb.toString(), null, false, 12, null);
                        String str14 = httpResponse2.getHeaders().get(httpHeaders.getContentRange());
                        if (str14 != null) {
                            MolocoLogger.info$default(molocoLogger3, b.this.e, "Content range header is available, " + httpHeaders.getContentRange() + str5 + str14, null, false, 12, null);
                            b.this.a(this.j, str14);
                            int parseInt2 = Integer.parseInt((String) CollectionsKt.last(StringsKt.split$default((CharSequence) str14, new String[]{str6}, false, 0, 6, (Object) null)));
                            Long contentLength = HttpMessagePropertiesKt.contentLength(httpResponse2);
                            str3 = str5;
                            Object obj6 = coroutine_suspended;
                            long longValue = contentLength != null ? contentLength.longValue() : 0L;
                            String str15 = (String) CollectionsKt.first(StringsKt.split$default((CharSequence) str14, new String[]{str6}, false, 0, 6, (Object) null));
                            str2 = str6;
                            boolean contains$default = StringsKt.contains$default((CharSequence) str15, (CharSequence) "-", false, 2, (Object) null);
                            if (!contains$default) {
                                parseInt = parseInt2;
                            } else {
                                if (!contains$default) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                parseInt = Integer.parseInt((String) CollectionsKt.last(StringsKt.split$default((CharSequence) str15, new String[]{"-"}, false, 0, 6, (Object) null)));
                            }
                            int i19 = (parseInt2 - parseInt) - 1;
                            MolocoLogger.info$default(molocoLogger3, b.this.e, "maxRange: " + parseInt2 + ", Response contentLength: " + longValue, null, false, 12, null);
                            i3 = i19 > 0 ? 1 : 0;
                            long j6 = j3 + longValue;
                            b bVar4 = b.this;
                            File file = this.j;
                            this.f = str4;
                            this.a = parseInt2;
                            this.b = i3;
                            this.c = i19;
                            this.e = j6;
                            this.d = i5;
                            this.g = 3;
                            Object b = bVar4.b(file, httpResponse2, this);
                            obj2 = obj6;
                            if (b == obj2) {
                                return obj2;
                            }
                            j = j6;
                            i2 = i19;
                            i4 = parseInt2;
                            d = str4;
                            aVar2 = this.k;
                            if (aVar2 == null) {
                                str10 = str3;
                                i6 = i5;
                                j2 = j;
                                aVar2.a(this.j, new c.d(this.j.length(), i4));
                            } else {
                                i6 = i5;
                                j2 = j;
                                str10 = str3;
                            }
                            if (i3 == 0) {
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.e, "Server has more data", null, false, 12, null);
                                coroutine_suspended = obj2;
                                i5 = i6;
                                str6 = str2;
                                length = j2;
                                i11 = 1;
                                i10 = 2;
                            } else {
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.e, "Server does not have more data to send", null, false, 12, null);
                                coroutine_suspended = obj2;
                                i5 = i6;
                                str6 = str2;
                                length = j2;
                                i11 = 1;
                                i10 = 2;
                            }
                            str5 = str10;
                            if (i3 != 0) {
                                return b.this.a(this.j, this.k);
                            }
                        } else {
                            str10 = str5;
                            obj5 = coroutine_suspended;
                            str11 = str6;
                            i18 = 2;
                            MolocoLogger.warn$default(molocoLogger3, b.this.e, httpHeaders.getContentRange() + " is not available", null, false, 12, null);
                            b.this.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c.c, new com.moloco.sdk.internal.error.a(this.l));
                            b bVar5 = b.this;
                            File file2 = this.j;
                            this.f = str4;
                            this.a = i7;
                            this.b = i8;
                            this.e = j3;
                            this.c = i5;
                            this.g = 4;
                            if (bVar5.a(file2, httpResponse2, this) == obj5) {
                                return obj5;
                            }
                            length = j3;
                            i2 = i8;
                            i4 = i7;
                            d = str4;
                            i10 = i18;
                            str6 = str11;
                            i11 = 1;
                            i3 = 0;
                            coroutine_suspended = obj5;
                            str5 = str10;
                            if (i3 != 0) {
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                i.a.AbstractC1586a a2 = o.a(e3);
                MolocoLogger.error$default(MolocoLogger.INSTANCE, b.this.e, "Failed to fetch media from url: " + this.i + " due to error: " + a2, e3, false, 8, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar4 = this.k;
                if (aVar4 == null) {
                    return a2;
                }
                aVar4.a(new c.b(a2));
                return a2;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl", f = "ChunkedMediaDownloader.kt", l = {276, 278}, m = "writeChunkToFile")
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
            return b.this.b(null, null, this);
        }
    }

    public b(@NotNull l mediaConfig, @NotNull u connectivityService, @NotNull com.moloco.sdk.internal.error.b errorReportingService, @NotNull HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(mediaConfig, "mediaConfig");
        Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.a = mediaConfig;
        this.b = connectivityService;
        this.c = errorReportingService;
        this.d = httpClient;
        this.e = "ChunkedMediaDownloader";
    }

    public static final long a(HttpRetryDelayContext delayMillis, int i) {
        Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return 100L;
    }

    public final String d(File file) {
        File c2 = c(file);
        if (c2.exists()) {
            return FilesKt.readText$default(c2, null, 1, null);
        }
        return null;
    }

    public final String e(File file) {
        File f2 = f(file);
        if (f2.exists()) {
            return FilesKt.readText$default(f2, null, 1, null);
        }
        return null;
    }

    public final File f(File file) {
        return new File(file.getParent(), file.getName() + ".range");
    }

    public final void g(File file) {
        c(file).delete();
    }

    public final void h(File file) {
        f(file).delete();
    }

    public final File c(File file) {
        return new File(file.getParent(), file.getName() + ".etag");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public boolean b(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists() && !f(file).exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[LOOP:0: B:12:0x0083->B:14:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:11:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(File file, HttpResponse httpResponse, Continuation continuation) {
        c cVar;
        int i;
        b bVar;
        b bVar2;
        File file2;
        ByteReadChannel byteReadChannel;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f = i2 - Integer.MIN_VALUE;
                Object obj = cVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    cVar.a = this;
                    cVar.b = file;
                    cVar.f = 1;
                    obj = HttpResponseKt.bodyAsChannel(httpResponse, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bVar = this;
                } else if (i == 1) {
                    file = (File) cVar.b;
                    bVar = (b) cVar.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (ByteReadChannel) cVar.c;
                    file2 = (File) cVar.b;
                    bVar2 = (b) cVar.a;
                    ResultKt.throwOnFailure(obj);
                    Source source = (Source) obj;
                    while (!PacketKt.isEmpty(source)) {
                        FilesKt.appendBytes(file2, io.ktor.utils.io.core.StringsKt.readBytes(source));
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, bVar2.e, "dst file length: " + file2.length() + " bytes", null, false, 12, null);
                    }
                    if (byteReadChannel.isClosedForRead()) {
                        cVar.a = bVar2;
                        cVar.b = file2;
                        cVar.c = byteReadChannel;
                        cVar.f = 2;
                        obj = ByteReadChannelOperationsKt.readRemaining(byteReadChannel, bVar2.a.e() * 2, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Source source2 = (Source) obj;
                        while (!PacketKt.isEmpty(source2)) {
                        }
                        if (byteReadChannel.isClosedForRead()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
                bVar2 = bVar;
                file2 = file;
                byteReadChannel = (ByteReadChannel) obj;
                if (byteReadChannel.isClosedForRead()) {
                }
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.f;
        if (i != 0) {
        }
        bVar2 = bVar;
        file2 = file;
        byteReadChannel = (ByteReadChannel) obj2;
        if (byteReadChannel.isClosedForRead()) {
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public boolean a(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists() && f(file).exists();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    @Nullable
    public Object a(@NotNull String str, @NotNull File file, @NotNull String str2, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new C1585b(str, file, aVar, str2, null), continuation);
    }

    public final i.a a(File file, HttpResponse httpResponse, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar) {
        int value = httpResponse.getStatus().getValue();
        if (400 <= value && value < 500) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.e, "Failed to fetch media from url: " + HttpResponseKt.getRequest(httpResponse).getUrl() + ", status: " + httpResponse.getStatus(), null, false, 12, null);
            if (aVar != null) {
                aVar.a(new c.b(i.a.AbstractC1586a.e.c));
            }
            return i.a.AbstractC1586a.e.c;
        }
        if (500 <= value && value < 600) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.e, "Failed to fetch media from url: " + HttpResponseKt.getRequest(httpResponse).getUrl() + ", status: " + httpResponse.getStatus(), null, false, 12, null);
            if (aVar != null) {
                aVar.a(new c.b(i.a.AbstractC1586a.h.c));
            }
            return i.a.AbstractC1586a.h.c;
        }
        return new i.a.b(file);
    }

    public final i.a a(File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar) {
        g(file);
        h(file);
        if (aVar != null) {
            aVar.a(new c.a(file));
        }
        return new i.a.b(file);
    }

    public final Object a(String str, final long j, final int i, final String str2, Continuation continuation) {
        HttpClient httpClient = this.d;
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        HttpRequestRetryKt.retry(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(b.this, (HttpRequestRetryConfig) obj);
            }
        });
        HttpRequestKt.headers(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(j, this, i, str2, (HeadersBuilder) obj);
            }
        });
        httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Unit a(final b bVar, HttpRequestRetryConfig retry) {
        Intrinsics.checkNotNullParameter(retry, "$this$retry");
        retry.setMaxRetries(10);
        HttpRequestRetryConfig.delayMillis$default(retry, false, new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(b.a((HttpRetryDelayContext) obj, ((Integer) obj2).intValue()));
            }
        }, 1, null);
        retry.retryOnException(10, true);
        retry.retryOnServerErrors(10);
        retry.modifyRequest(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return b.a(b.this, (HttpRetryModifyRequestContext) obj, (HttpRequestBuilder) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit a(b bVar, HttpRetryModifyRequestContext modifyRequest, HttpRequestBuilder it) {
        Intrinsics.checkNotNullParameter(modifyRequest, "$this$modifyRequest");
        Intrinsics.checkNotNullParameter(it, "it");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, bVar.e, "Retry attempt #" + modifyRequest.getRetryCount() + " for " + modifyRequest.getRequest().getUrl(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit a(long j, b bVar, int i, String str, HeadersBuilder headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        String str2 = "bytes=" + j + '-' + Math.min(j + bVar.a.e(), i);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str3 = bVar.e;
        StringBuilder sb = new StringBuilder();
        sb.append("Adding ");
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        sb.append(httpHeaders.getRange());
        sb.append(" header: ");
        sb.append(str2);
        MolocoLogger.info$default(molocoLogger, str3, sb.toString(), null, false, 12, null);
        headers.append(httpHeaders.getRange(), str2);
        if (str != null) {
            MolocoLogger.info$default(molocoLogger, bVar.e, "Adding " + httpHeaders.getIfRange() + " header: " + str, null, false, 12, null);
            headers.append(httpHeaders.getIfRange(), str);
            MolocoLogger.info$default(molocoLogger, bVar.e, "Adding " + httpHeaders.getETag() + " header: " + str, null, false, 12, null);
            headers.append(httpHeaders.getETag(), str);
        }
        return Unit.INSTANCE;
    }

    public final void a(File file, String str) {
        FilesKt.writeText$default(f(file), str, null, 2, null);
    }

    public final void a(File file, HttpResponse httpResponse) {
        Headers headers = httpResponse.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = headers.get(httpHeaders.getETag());
        if (str != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, httpHeaders.getETag() + ": " + str, null, false, 12, null);
            FilesKt.writeText$default(c(file), str, null, 2, null);
            return;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.e, "No " + httpHeaders.getETag() + " in header", null, false, 12, null);
        g(file);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(File file, HttpResponse httpResponse, Continuation continuation) {
        a aVar;
        Object coroutine_suspended;
        int i;
        File file2;
        Object bodyAsChannel;
        b bVar;
        Object copyAndClose;
        File file3;
        b bVar2;
        HttpResponse httpResponse2 = httpResponse;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f = i2 - Integer.MIN_VALUE;
                Object obj = aVar.d;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, this.e, "Range header not supported, downloading full file", null, false, 12, null);
                    if (file.exists()) {
                        MolocoLogger.info$default(molocoLogger, this.e, "Deleting existing file and fully re-downloading it", null, false, 12, null);
                        file.delete();
                    }
                    aVar.a = this;
                    file2 = file;
                    aVar.b = file2;
                    aVar.c = httpResponse2;
                    aVar.f = 1;
                    bodyAsChannel = HttpResponseKt.bodyAsChannel(httpResponse2, aVar);
                    if (bodyAsChannel == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        httpResponse2 = (HttpResponse) aVar.c;
                        file3 = (File) aVar.b;
                        bVar2 = (b) aVar.a;
                        ResultKt.throwOnFailure(obj);
                        long longValue = ((Number) obj).longValue();
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, bVar2.e, "Downloaded full response: " + HttpMessagePropertiesKt.contentLength(httpResponse2) + " and saved to disk: " + longValue + " bytes, file size: " + file3.length(), null, false, 12, null);
                        return Unit.INSTANCE;
                    }
                    httpResponse2 = (HttpResponse) aVar.c;
                    File file4 = (File) aVar.b;
                    bVar = (b) aVar.a;
                    ResultKt.throwOnFailure(obj);
                    bodyAsChannel = obj;
                    file2 = file4;
                }
                ByteWriteChannel writeChannel$default = FileChannelsKt.writeChannel$default(file2, null, 1, null);
                aVar.a = bVar;
                aVar.b = file2;
                aVar.c = httpResponse2;
                aVar.f = 2;
                copyAndClose = ByteReadChannelOperationsKt.copyAndClose((ByteReadChannel) bodyAsChannel, writeChannel$default, aVar);
                if (copyAndClose != coroutine_suspended) {
                    return coroutine_suspended;
                }
                file3 = file2;
                obj = copyAndClose;
                bVar2 = bVar;
                long longValue2 = ((Number) obj).longValue();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, bVar2.e, "Downloaded full response: " + HttpMessagePropertiesKt.contentLength(httpResponse2) + " and saved to disk: " + longValue2 + " bytes, file size: " + file3.length(), null, false, 12, null);
                return Unit.INSTANCE;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.f;
        if (i != 0) {
        }
        ByteWriteChannel writeChannel$default2 = FileChannelsKt.writeChannel$default(file2, null, 1, null);
        aVar.a = bVar;
        aVar.b = file2;
        aVar.c = httpResponse2;
        aVar.f = 2;
        copyAndClose = ByteReadChannelOperationsKt.copyAndClose((ByteReadChannel) bodyAsChannel, writeChannel$default2, aVar);
        if (copyAndClose != coroutine_suspended) {
        }
    }
}
