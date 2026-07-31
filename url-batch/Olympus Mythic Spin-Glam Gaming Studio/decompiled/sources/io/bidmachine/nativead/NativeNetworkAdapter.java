package io.bidmachine.nativead;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.bidmachine.ImageData;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.internal.C6016k;
import io.bidmachine.nativead.view.NativeAdOverlayContainer;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0010\u0018\u0000 _2\u00020\u0001:\u0001_B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\tJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\tJ\u0011\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0006J\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010\tJ\u0011\u0010%\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b%\u0010\u0006J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\tJ\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020(¢\u0006\u0004\b-\u0010*J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020(¢\u0006\u0004\b/\u0010,J\u0011\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000100¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u000106¢\u0006\u0004\b:\u0010;J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010<¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020(¢\u0006\u0004\bB\u0010*J\u0019\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u0004\u0018\u00010H2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bK\u0010JJ=\u0010T\u001a\u00020S2\u0006\u0010L\u001a\u00020E2\b\u0010N\u001a\u0004\u0018\u00010M2\b\u0010P\u001a\u0004\u0018\u00010O2\u0010\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010H\u0018\u00010QH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020SH\u0016¢\u0006\u0004\bV\u0010\u0003J\u000f\u0010W\u001a\u00020SH\u0016¢\u0006\u0004\bW\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010XR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010XR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010XR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010YR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010ZR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010ZR\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010XR\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010XR\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010XR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010[R\u0016\u0010-\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010[R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\\R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010]R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010^¨\u0006`"}, d2 = {"Lio/bidmachine/nativead/NativeNetworkAdapter;", "Lio/bidmachine/nativead/NativeData;", "<init>", "()V", "", "getTitle", "()Ljava/lang/String;", "title", "setTitle", "(Ljava/lang/String;)Lio/bidmachine/nativead/NativeNetworkAdapter;", "getDescription", "description", "setDescription", "getCallToAction", "callToAction", "setCallToAction", "", "getRating", "()F", "rating", "setRating", "(Ljava/lang/Float;)Lio/bidmachine/nativead/NativeNetworkAdapter;", "Lio/bidmachine/ImageData;", "getIcon", "()Lio/bidmachine/ImageData;", "iconImageData", "setIcon", "(Lio/bidmachine/ImageData;)Lio/bidmachine/nativead/NativeNetworkAdapter;", "getMainImage", "mainImageData", "setMainImage", "getClickUrl", UnifiedMediationParams.KEY_CLICK_URL, "setClickUrl", "getVideoUrl", UnifiedMediationParams.KEY_VIDEO_URL, "setVideoUrl", "getVideoAdm", UnifiedMediationParams.KEY_VIDEO_ADM, "setVideoAdm", "", "hasVideo", "()Z", "setHasVideo", "(Z)Lio/bidmachine/nativead/NativeNetworkAdapter;", "isNetworkControlLoadingAssets", "networkControlLoadingAssets", "setNetworkControlLoadingAssets", "Lio/bidmachine/LabelData;", "getAdLabelData", "()Lio/bidmachine/LabelData;", "adLabelData", "setAdLabelData", "(Lio/bidmachine/LabelData;)Lio/bidmachine/nativead/NativeNetworkAdapter;", "Lio/bidmachine/PrivacySheetData;", "getPrivacySheetData", "()Lio/bidmachine/PrivacySheetData;", "privacySheetData", "setPrivacySheetData", "(Lio/bidmachine/PrivacySheetData;)Lio/bidmachine/nativead/NativeNetworkAdapter;", "Lio/bidmachine/internal/k;", "getDisclaimerData", "()Lio/bidmachine/internal/k;", "disclaimerData", "setDisclaimerData", "(Lio/bidmachine/internal/k;)Lio/bidmachine/nativead/NativeNetworkAdapter;", "isValid", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "configureContainer", "(Landroid/content/Context;)Landroid/view/ViewGroup;", "Landroid/view/View;", "createCustomMediaView", "(Landroid/content/Context;)Landroid/view/View;", "createProviderView", "container", "Landroid/widget/ImageView;", "iconView", "Lio/bidmachine/nativead/view/NativeMediaView;", "nativeMediaView", "", "clickableViews", "", "registerNative", "(Landroid/view/ViewGroup;Landroid/widget/ImageView;Lio/bidmachine/nativead/view/NativeMediaView;Ljava/util/Set;)V", "unregisterNative", "destroy", "Ljava/lang/String;", "F", "Lio/bidmachine/ImageData;", "Z", "Lio/bidmachine/LabelData;", "Lio/bidmachine/PrivacySheetData;", "Lio/bidmachine/internal/k;", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public class NativeNetworkAdapter implements NativeData {
    private static final float DEFAULT_RATING = -1.0f;

    @Nullable
    private LabelData adLabelData;

    @Nullable
    private String callToAction;

    @Nullable
    private String clickUrl;

    @Nullable
    private String description;

    @Nullable
    private C6016k disclaimerData;
    private boolean hasVideo;

    @Nullable
    private ImageData iconImageData;

    @Nullable
    private ImageData mainImageData;

    @Nullable
    private PrivacySheetData privacySheetData;

    @Nullable
    private String title;

    @Nullable
    private String videoAdm;

    @Nullable
    private String videoUrl;
    private float rating = -1.0f;
    private boolean isNetworkControlLoadingAssets = true;

    @Nullable
    public ViewGroup configureContainer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    @Nullable
    public View createCustomMediaView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    @Nullable
    public View createProviderView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.adLabelData == null && this.privacySheetData == null) {
            return null;
        }
        NativeAdOverlayContainer nativeAdOverlayContainer = new NativeAdOverlayContainer(context, null, 0, 6, null);
        nativeAdOverlayContainer.bindNativeData(this);
        nativeAdOverlayContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return nativeAdOverlayContainer;
    }

    public void destroy() {
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public LabelData getAdLabelData() {
        return this.adLabelData;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getClickUrl() {
        return this.clickUrl;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public C6016k getDisclaimerData() {
        return this.disclaimerData;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    /* renamed from: getIcon, reason: from getter */
    public ImageData getIconImageData() {
        return this.iconImageData;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    /* renamed from: getMainImage, reason: from getter */
    public ImageData getMainImageData() {
        return this.mainImageData;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public PrivacySheetData getPrivacySheetData() {
        return this.privacySheetData;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    public float getRating() {
        return this.rating;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getVideoAdm() {
        return this.videoAdm;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getVideoUrl() {
        return this.videoUrl;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    /* renamed from: hasVideo, reason: from getter */
    public boolean getHasVideo() {
        return this.hasVideo;
    }

    /* renamed from: isNetworkControlLoadingAssets, reason: from getter */
    public final boolean getIsNetworkControlLoadingAssets() {
        return this.isNetworkControlLoadingAssets;
    }

    public final boolean isValid() {
        String description;
        String callToAction;
        String title = getTitle();
        return (title == null || title.length() == 0 || (description = getDescription()) == null || description.length() == 0 || (callToAction = getCallToAction()) == null || callToAction.length() == 0) ? false : true;
    }

    public void registerNative(@NotNull ViewGroup container, @Nullable ImageView iconView, @Nullable NativeMediaView nativeMediaView, @Nullable Set<View> clickableViews) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @NotNull
    public final NativeNetworkAdapter setAdLabelData(@Nullable LabelData adLabelData) {
        this.adLabelData = adLabelData;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setCallToAction(@Nullable String callToAction) {
        this.callToAction = callToAction;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setClickUrl(@Nullable String clickUrl) {
        this.clickUrl = clickUrl;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setDescription(@Nullable String description) {
        this.description = description;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setDisclaimerData(@Nullable C6016k disclaimerData) {
        this.disclaimerData = disclaimerData;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setIcon(@Nullable ImageData iconImageData) {
        this.iconImageData = iconImageData;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setMainImage(@Nullable ImageData mainImageData) {
        this.mainImageData = mainImageData;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setNetworkControlLoadingAssets(boolean networkControlLoadingAssets) {
        this.isNetworkControlLoadingAssets = networkControlLoadingAssets;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setPrivacySheetData(@Nullable PrivacySheetData privacySheetData) {
        this.privacySheetData = privacySheetData;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setRating(@Nullable Float rating) {
        this.rating = rating != null ? rating.floatValue() : -1.0f;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setTitle(@Nullable String title) {
        this.title = title;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setVideoAdm(@Nullable String videoAdm) {
        this.videoAdm = videoAdm;
        return this;
    }

    @NotNull
    public final NativeNetworkAdapter setVideoUrl(@Nullable String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public void unregisterNative() {
    }
}
