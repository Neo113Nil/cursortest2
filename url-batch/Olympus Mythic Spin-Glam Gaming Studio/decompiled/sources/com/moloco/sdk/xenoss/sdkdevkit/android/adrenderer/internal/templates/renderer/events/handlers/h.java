package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@StabilityInferred
/* loaded from: classes10.dex */
public final class h implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public static final int d = 8;

    @NotNull
    public final CoroutineScope a;

    @NotNull
    public final MutableSharedFlow b;

    @NotNull
    public final MutableSharedFlow c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        @NotNull
        public static final C1616a b;
        public static final a c = new a(ShareConstants.VIDEO_URL, 0, "videoContainer");
        public static final a d = new a(MraidAdRenderer.LOG_TAG, 1, "mraidContainer");
        public static final a e = new a("STATIC", 2, "staticContainer");
        public static final /* synthetic */ a[] f;
        public static final /* synthetic */ EnumEntries g;

        @NotNull
        public final String a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h$a$a, reason: collision with other inner class name */
        public static final class C1616a {
            public /* synthetic */ C1616a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final a a(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                for (a aVar : a.values()) {
                    if (Intrinsics.areEqual(aVar.c(), value)) {
                        return aVar;
                    }
                }
                return null;
            }

            public C1616a() {
            }
        }

        static {
            a[] a = a();
            f = a;
            g = EnumEntriesKt.enumEntries(a);
            b = new C1616a(null);
        }

        public a(String str, int i, String str2) {
            this.a = str2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{c, d, e};
        }

        @NotNull
        public static EnumEntries b() {
            return g;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }

        @NotNull
        public final String c() {
            return this.a;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.PlayListItemDisplayingEventHandler$handleEvent$1", f = "PlayListItemDisplayingEventHandler.kt", l = {34}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return h.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = h.this.b;
                a aVar = this.c;
                this.a = 1;
                if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "PlayListItemDisplayingEventHandler";
    }

    @NotNull
    public final MutableSharedFlow c() {
        return this.c;
    }

    public h(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = scope;
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.b = MutableSharedFlow$default;
        this.c = MutableSharedFlow$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return SetsKt.setOf("playlistItemDisplaying");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, b(), event + " displaying.", false, 4, null);
        if (!Intrinsics.areEqual(event.getString("event"), CollectionsKt.first(a()))) {
            MolocoLogger.debug$default(molocoLogger, b(), "Event not supported: " + event.getString("event"), false, 4, null);
            return;
        }
        String string = event.getString("creativeType");
        a.C1616a c1616a = a.b;
        Intrinsics.checkNotNull(string);
        a a2 = c1616a.a(string);
        MolocoLogger.debug$default(molocoLogger, b(), a2 + " displaying.", false, 4, null);
        if (a2 != null) {
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new b(a2, null), 3, null);
        }
    }

    public /* synthetic */ h(CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()) : coroutineScope);
    }
}
