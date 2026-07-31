package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d;
import io.ktor.http.ContentType;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@StabilityInferred
/* loaded from: classes3.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public static final int c = 8;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i a;

    @NotNull
    public final CoroutineScope b;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.HttpEventHandler$handleGetRequest$1", f = "HttpEventHandler.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return f.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            f.this.a.a(this.c);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.HttpEventHandler$handlePostRequest$1", f = "HttpEventHandler.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ f c;
        public final /* synthetic */ String d;
        public final /* synthetic */ ContentType e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, f fVar, String str2, ContentType contentType, Continuation continuation) {
            super(2, continuation);
            this.b = str;
            this.c = fVar;
            this.d = str2;
            this.e = contentType;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            byte[] bytes = this.b.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            d.a.a(this.c.a, this.d, bytes, this.e, null, 8, null);
            return Unit.INSTANCE;
        }
    }

    public f(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.a = persistentHttpRequest;
        this.b = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "HttpEventHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return SetsKt.setOf((Object[]) new String[]{"sendGet", "sendPost"});
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String string = event.getString("event");
        if (Intrinsics.areEqual(string, "sendGet")) {
            String string2 = event.getString("url");
            Intrinsics.checkNotNull(string2);
            a(string2);
            return;
        }
        if (Intrinsics.areEqual(string, "sendPost")) {
            String string3 = event.getString("url");
            String string4 = event.getString("body");
            ContentType.Companion companion = ContentType.Companion;
            String optString = event.optString("contentType", companion.getAny().toString());
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            ContentType parse = companion.parse(optString);
            Intrinsics.checkNotNull(string3);
            Intrinsics.checkNotNull(string4);
            a(string3, string4, parse);
            return;
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, b(), "Unsupported event type: " + string, null, false, 12, null);
        Unit unit = Unit.INSTANCE;
    }

    public final Job a(String str) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new a(str, null), 3, null);
        return launch$default;
    }

    public final Job a(String str, String str2, ContentType contentType) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new b(str2, this, str, contentType, null), 3, null);
        return launch$default;
    }
}
