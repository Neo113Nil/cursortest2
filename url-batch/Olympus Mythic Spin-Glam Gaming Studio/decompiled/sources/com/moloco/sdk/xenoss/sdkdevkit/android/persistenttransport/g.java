package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import io.ktor.client.HttpClient;
import io.ktor.http.ContentType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@VisibleForTesting
/* loaded from: classes13.dex */
public final class g implements f {
    public static final int d = 8;

    @NotNull
    public final HttpClient b;

    @NotNull
    public final CoroutineScope c;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.NonPersistentHttpRequestImpl$send$1", f = "NonPersistentHttpRequest.kt", l = {46, 50}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return g.this.new a(this.d, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0084 -> B:6:0x0087). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                i = 0;
                if (i < 5) {
                }
            } else if (i2 == 1) {
                i = this.a;
                ResultKt.throwOnFailure(obj);
                z = ((Boolean) obj).booleanValue();
                if (z) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.a;
                ResultKt.throwOnFailure(obj);
                i++;
                if (i < 5) {
                    boolean a = g.this.a(com.moloco.sdk.internal.android_context.b.a(null, 1, null));
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, h.a, "Network available: " + a + " for non persistent request", null, false, 12, null);
                    if (a) {
                        HttpClient httpClient = g.this.b;
                        String str = this.d;
                        this.a = i;
                        this.b = 1;
                        obj = e.a(httpClient, str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        z = ((Boolean) obj).booleanValue();
                        if (z) {
                            return Unit.INSTANCE;
                        }
                        this.a = i;
                        this.b = 2;
                        if (DelayKt.delay(10000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i++;
                        if (i < 5) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        z = false;
                        if (z) {
                        }
                    }
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.NonPersistentHttpRequestImpl$sendPost$1", f = "NonPersistentHttpRequest.kt", l = {61, 65}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public final /* synthetic */ String d;
        public final /* synthetic */ byte[] e;
        public final /* synthetic */ ContentType f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, byte[] bArr, ContentType contentType, Continuation continuation) {
            super(2, continuation);
            this.d = str;
            this.e = bArr;
            this.f = contentType;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return g.this.new b(this.d, this.e, this.f, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008d -> B:6:0x0090). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                i = 0;
                if (i < 5) {
                }
            } else if (i2 == 1) {
                i = this.a;
                ResultKt.throwOnFailure(obj);
                z = ((Boolean) obj).booleanValue();
                if (z) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.a;
                ResultKt.throwOnFailure(obj);
                i++;
                if (i < 5) {
                    boolean a = g.this.a(com.moloco.sdk.internal.android_context.b.a(null, 1, null));
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, h.a, "Network available: " + a + " for non persistent request", null, false, 12, null);
                    if (a) {
                        HttpClient httpClient = g.this.b;
                        String str = this.d;
                        byte[] bArr = this.e;
                        ContentType contentType = this.f;
                        this.a = i;
                        this.b = 1;
                        obj = e.a(httpClient, str, bArr, contentType, null, this, 8, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        z = ((Boolean) obj).booleanValue();
                        if (z) {
                            return Unit.INSTANCE;
                        }
                        this.a = i;
                        this.b = 2;
                        if (DelayKt.delay(10000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i++;
                        if (i < 5) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        z = false;
                        if (z) {
                        }
                    }
                }
            }
        }
    }

    public g(@NotNull HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.b = httpClient;
        this.c = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getDefault());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d
    public void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new a(url, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d
    public void a(@NotNull String url, @NotNull byte[] body, @NotNull ContentType contentType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new b(url, body, contentType, null), 3, null);
    }

    @VisibleForTesting
    public final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return false;
        }
        return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3);
    }
}
