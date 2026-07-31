package io.ktor.client.plugins;

import io.ktor.client.content.ProgressListener;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: BodyProgress.kt */
/* loaded from: classes.dex */
public abstract class BodyProgressKt {
    private static final ClientPlugin BodyProgress;
    private static final AttributeKey DownloadProgressListenerAttributeKey;
    private static final AttributeKey UploadProgressListenerAttributeKey;

    public static final ClientPlugin getBodyProgress() {
        return BodyProgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BodyProgress$lambda$0(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.on(AfterRenderHook.INSTANCE, new BodyProgressKt$BodyProgress$1$1(null));
        createClientPlugin.on(AfterReceiveHook.INSTANCE, new BodyProgressKt$BodyProgress$1$2(null));
        return Unit.INSTANCE;
    }

    static {
        KType kType;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ProgressListener.class);
        KType kType2 = null;
        try {
            kType = Reflection.typeOf(ProgressListener.class);
        } catch (Throwable unused) {
            kType = null;
        }
        UploadProgressListenerAttributeKey = new AttributeKey("UploadProgressListenerAttributeKey", new TypeInfo(orCreateKotlinClass, kType));
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(ProgressListener.class);
        try {
            kType2 = Reflection.typeOf(ProgressListener.class);
        } catch (Throwable unused2) {
        }
        DownloadProgressListenerAttributeKey = new AttributeKey("DownloadProgressListenerAttributeKey", new TypeInfo(orCreateKotlinClass2, kType2));
        BodyProgress = CreatePluginUtilsKt.createClientPlugin("BodyProgress", new Function1() { // from class: io.ktor.client.plugins.BodyProgressKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BodyProgress$lambda$0;
                BodyProgress$lambda$0 = BodyProgressKt.BodyProgress$lambda$0((ClientPluginBuilder) obj);
                return BodyProgress$lambda$0;
            }
        });
    }
}
