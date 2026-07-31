package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.RuleController;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* renamed from: com.inmobi.media.ul, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4400ul extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4400ul(Context context, Continuation continuation) {
        super(1, continuation);
        this.b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4400ul(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4400ul(this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        ?? emptyList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = AbstractC4334s9.a;
            Context context = AbstractC4002fj.a;
            if (context != null) {
                String[] databaseList = context.databaseList();
                if (databaseList != null) {
                    emptyList = new ArrayList();
                    for (String str : databaseList) {
                        Intrinsics.checkNotNull(str);
                        if (new Regex("com\\.im_([0-9]+\\.){2}[0-9]+([-.\\w]*).db(-wal)?(-shm)?").matches(str) && !Intrinsics.areEqual(str, "com.im_11.3.0.db")) {
                            emptyList.add(str);
                        }
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                for (String str2 : emptyList) {
                    File databasePath = context.getDatabasePath(str2);
                    if (databasePath != null && databasePath.exists()) {
                        context.deleteDatabase(str2);
                    }
                }
            }
            S4 s4 = S4.a;
            Intrinsics.checkNotNullExpressionValue("S4", "TAG");
            BuildersKt__BuildersKt.runBlocking$default(null, new N4(null), 1, null);
            if (F0.b == null) {
                F0.b = new B0();
            }
            C4277q4 c4277q4 = AbstractC4015g4.a;
            AbstractC4015g4.a("ads", F0.d);
            B0 b0 = F0.b;
            if (b0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                b0 = null;
            }
            if (!b0.a.get()) {
                B0 b02 = F0.b;
                if (b02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    b02 = null;
                }
                if (!b02.a.get()) {
                    Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                    if (((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                        b02.a();
                    }
                }
            }
            Q9.b();
            Q9.a();
            T5 t5 = R5.a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) AbstractC4015g4.a.a(AdConfig.class);
            O0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
            boolean a = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
            R5.e = a;
            if (!a && R5.c == null) {
                Context context2 = AbstractC4002fj.a;
                if (context2 == null) {
                    string = null;
                } else {
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    Qa a2 = Pa.a(context2, "display_info_store");
                    Intrinsics.checkNotNullParameter("gesture_margin", "key");
                    string = a2.a.getString("gesture_margin", null);
                }
                R5.c = string;
            }
            if (adConfig.getRendering().getEnableImmersive()) {
                R5.j();
                R5.i();
            }
            AbstractC4184mh.b();
            C4479xl c4479xl = C4479xl.a;
            this.a = 1;
            if (c4479xl.b(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Context context3 = this.b;
        Intrinsics.checkNotNullParameter(context3, "context");
        try {
            Reflection.getOrCreateKotlinClass(ActivityFilter.class).getSimpleName();
            Reflection.getOrCreateKotlinClass(ActivityRule.class).getSimpleName();
            Reflection.getOrCreateKotlinClass(RuleController.class).getSimpleName();
            RuleController.Companion.getInstance(context3).addRule(new ActivityRule.Builder(SetsKt.setOf(new ActivityFilter(new ComponentName(context3, (Class<?>) InMobiAdActivity.class), null))).setAlwaysExpand(true).build());
        } catch (NoClassDefFoundError unused) {
        }
        Context context4 = this.b;
        Intrinsics.checkNotNullParameter(context4, "context");
        ConcurrentHashMap concurrentHashMap2 = Qa.b;
        Pa.a(context4, "sdk_version_store").a("sdk_version", "11.3.0", false);
        C4479xl.b = true;
        return Unit.INSTANCE;
    }
}
