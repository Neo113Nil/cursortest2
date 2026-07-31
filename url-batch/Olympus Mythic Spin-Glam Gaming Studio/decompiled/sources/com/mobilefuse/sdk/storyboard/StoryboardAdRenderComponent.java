package com.mobilefuse.sdk.storyboard;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.component.AdRendererComponent;
import com.mobilefuse.sdk.component.ComponentRegistrar;
import com.mobilefuse.sdk.component.ComponentType;
import com.mobilefuse.sdk.mraid.BuildConfig;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StoryboardAdRenderComponent.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardAdRenderComponent;", "Lcom/mobilefuse/sdk/component/AdRendererComponent;", "()V", "createInstance", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "Lcom/mobilefuse/sdk/omid/OmidBridge;", "context", "Landroid/content/Context;", "config", "Lcom/mobilefuse/sdk/AdRendererConfig;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/AdRendererListener;", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes11.dex */
public class StoryboardAdRenderComponent implements AdRendererComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final StoryboardAdRenderComponent createComponent() throws Throwable {
        return INSTANCE.createComponent();
    }

    public static final void register() throws Throwable {
        INSTANCE.register();
    }

    /* compiled from: StoryboardAdRenderComponent.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardAdRenderComponent$Companion;", "", "()V", "createComponent", "Lcom/mobilefuse/sdk/storyboard/StoryboardAdRenderComponent;", "register", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void register() throws Throwable {
            TelemetryManager.INSTANCE.registerModule(BuildConfig.LIBRARY_PACKAGE_NAME, "1.11.0");
            ComponentRegistrar.registerComponent(ComponentType.STORYBOARD_AD_RENDERER, createComponent());
        }

        @NotNull
        public final StoryboardAdRenderComponent createComponent() throws Throwable {
            return new StoryboardAdRenderComponent();
        }
    }

    @Override // com.mobilefuse.sdk.component.AdRendererComponent
    @NotNull
    public BaseAdRenderer<OmidBridge> createInstance(@NotNull Context context, @NotNull AdRendererConfig config, @NotNull AdRendererListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return new StoryboardAdRenderer(context, config, listener);
    }
}
