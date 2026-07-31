package com.yandex.div.core.image;

import android.content.Context;
import android.widget.ImageView;
import com.yandex.div.core.annotations.InternalApi;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivImageLoaderWrapper.kt */
@InternalApi
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/image/DivImageLoaderWrapper;", "Lcom/yandex/div/core/images/DivImageLoader;", "providedImageLoader", "divContext", "Landroid/content/Context;", "(Lcom/yandex/div/core/images/DivImageLoader;Landroid/content/Context;)V", "modifiers", "", "Lcom/yandex/div/core/image/DivImageUrlModifier;", "svgImageLoader", "Lcom/yandex/div/svg/SvgDivImageLoader;", "getModifiedUrl", "", "initialUrl", "getProperLoader", UnifiedMediationParams.KEY_IMAGE_URL, "isSvg", "", "loadImage", "Lcom/yandex/div/core/images/LoadReference;", "imageView", "Landroid/widget/ImageView;", "callback", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "loadImageBytes", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes3.dex */
public final class DivImageLoaderWrapper implements DivImageLoader {

    @NotNull
    private final List<DivImageUrlModifier> modifiers = CollectionsKt.listOf(new DivImageAssetUrlModifier());

    @NotNull
    private final DivImageLoader providedImageLoader;

    @Nullable
    private final SvgDivImageLoader svgImageLoader;

    public DivImageLoaderWrapper(@NotNull DivImageLoader divImageLoader, @NotNull Context context) {
        this.providedImageLoader = divImageLoader;
        this.svgImageLoader = !divImageLoader.hasSvgSupport().booleanValue() ? new SvgDivImageLoader(context) : null;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        String modifiedUrl = getModifiedUrl(imageUrl);
        return getProperLoader(modifiedUrl).loadImage(modifiedUrl, callback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String imageUrl, @NotNull ImageView imageView) {
        String modifiedUrl = getModifiedUrl(imageUrl);
        return getProperLoader(modifiedUrl).loadImage(modifiedUrl, imageView);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImageBytes(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        String modifiedUrl = getModifiedUrl(imageUrl);
        return getProperLoader(modifiedUrl).loadImageBytes(modifiedUrl, callback);
    }

    private final String getModifiedUrl(String initialUrl) {
        Iterator<T> it = this.modifiers.iterator();
        while (it.hasNext()) {
            initialUrl = ((DivImageUrlModifier) it.next()).modifyImageUrl(initialUrl);
        }
        return initialUrl;
    }

    private final DivImageLoader getProperLoader(String imageUrl) {
        if (this.svgImageLoader != null && isSvg(imageUrl)) {
            return this.svgImageLoader;
        }
        return this.providedImageLoader;
    }

    private final boolean isSvg(String imageUrl) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) imageUrl, '?', 0, false, 6, (Object) null);
        if (indexOf$default < 0) {
            indexOf$default = imageUrl.length();
        }
        String substring = imageUrl.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return StringsKt.endsWith$default(substring, ".svg", false, 2, (Object) null);
    }
}
