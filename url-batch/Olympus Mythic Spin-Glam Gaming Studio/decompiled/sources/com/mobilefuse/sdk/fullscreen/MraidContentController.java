package com.mobilefuse.sdk.fullscreen;

import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.MobileFuseFullscreenActivity;
import com.mobilefuse.sdk.core.R;
import com.mobilefuse.sdk.fullscreen.BaseContentController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MraidContentController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/mobilefuse/sdk/fullscreen/MraidContentController;", "Lcom/mobilefuse/sdk/fullscreen/BaseContentController;", "adController", "Lcom/mobilefuse/sdk/AdController;", "activity", "Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity;", "contentListener", "Lcom/mobilefuse/sdk/fullscreen/BaseContentController$ContentListener;", "(Lcom/mobilefuse/sdk/AdController;Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity;Lcom/mobilefuse/sdk/fullscreen/BaseContentController$ContentListener;)V", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final class MraidContentController extends BaseContentController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MraidContentController(@NotNull AdController adController, @NotNull MobileFuseFullscreenActivity activity, @NotNull BaseContentController.ContentListener contentListener) {
        super(adController, activity, contentListener, R.layout.mobilefuse_mraid_fullscreen_content, R.id.adViewContainer);
        Intrinsics.checkNotNullParameter(adController, "adController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentListener, "contentListener");
    }
}
