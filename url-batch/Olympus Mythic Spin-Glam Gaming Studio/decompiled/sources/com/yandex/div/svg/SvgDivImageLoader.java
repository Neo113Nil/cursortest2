package com.yandex.div.svg;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.PictureDrawable;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.partials.YandexNetworkBridge;
import com.yandex.div.core.annotations.InternalApi;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* compiled from: SvgDivImageLoader.kt */
@InternalApi
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\r\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/svg/SvgDivImageLoader;", "Lcom/yandex/div/core/images/DivImageLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "httpClient", "Lokhttp3/OkHttpClient;", "svgCacheManager", "Lcom/yandex/div/svg/SvgCacheManager;", "svgDecoder", "Lcom/yandex/div/svg/SvgDecoder;", "createCallOrNull", "Lokhttp3/Call;", UnifiedMediationParams.KEY_IMAGE_URL, "", "downloadImage", "", NotificationCompat.CATEGORY_CALL, "getImageData", "hasSvgSupport", "", "()Ljava/lang/Boolean;", "loadImage", "Lcom/yandex/div/core/images/LoadReference;", "imageView", "Landroid/widget/ImageView;", "callback", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "loadImageBytes", "div-svg_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SvgDivImageLoader implements DivImageLoader {

    @NotNull
    private final Context context;

    @NotNull
    private final OkHttpClient httpClient = new OkHttpClient.Builder().build();

    @NotNull
    private final CoroutineScope coroutineScope = CoroutineScopeKt.MainScope();

    @NotNull
    private final SvgDecoder svgDecoder = new SvgDecoder(false, 1, null);

    @NotNull
    private final SvgCacheManager svgCacheManager = new SvgCacheManager();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$0() {
    }

    public SvgDivImageLoader(@NotNull Context context) {
        this.context = context;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public Boolean hasSvgSupport() {
        return Boolean.TRUE;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        final Call createCallOrNull = createCallOrNull(imageUrl);
        PictureDrawable pictureDrawable = this.svgCacheManager.get(imageUrl);
        if (pictureDrawable == null) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new SvgDivImageLoader$loadImage$2(callback, createCallOrNull, this, imageUrl, null), 3, null);
            return new LoadReference() { // from class: com.yandex.div.svg.SvgDivImageLoader$$ExternalSyntheticLambda1
                @Override // com.yandex.div.core.images.LoadReference
                public final void cancel() {
                    SvgDivImageLoader.loadImage$lambda$1(Call.this);
                }
            };
        }
        callback.onSuccess(pictureDrawable);
        return new LoadReference() { // from class: com.yandex.div.svg.SvgDivImageLoader$$ExternalSyntheticLambda0
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.loadImage$lambda$0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$1(Call call) {
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String imageUrl, @NotNull ImageView imageView) {
        final Call createCallOrNull = createCallOrNull(imageUrl);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new SvgDivImageLoader$loadImage$4(createCallOrNull, this, imageUrl, imageView, null), 3, null);
        return new LoadReference() { // from class: com.yandex.div.svg.SvgDivImageLoader$$ExternalSyntheticLambda3
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.loadImage$lambda$2(Call.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$2(Call call) {
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImageBytes(@NotNull final String imageUrl, @NotNull final DivImageDownloadCallback callback) {
        return new LoadReference() { // from class: com.yandex.div.svg.SvgDivImageLoader$$ExternalSyntheticLambda2
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.this.loadImage(imageUrl, callback);
            }
        };
    }

    private final Call createCallOrNull(String imageUrl) {
        if (!StringsKt.startsWith$default(imageUrl, d.v, false, 2, (Object) null) && !StringsKt.startsWith$default(imageUrl, d.u, false, 2, (Object) null)) {
            return null;
        }
        return this.httpClient.newCall(new Request.Builder().url(imageUrl).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] downloadImage(Call call) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ResponseBody okhttp3Response_body = YandexNetworkBridge.okhttp3Response_body(YandexNetworkBridge.okhttp3CallExecute(call));
            m8023constructorimpl = Result.m8023constructorimpl(okhttp3Response_body != null ? okhttp3Response_body.bytes() : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return (byte[]) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getImageData(String imageUrl) {
        AssetManager assets;
        InputStream open;
        String removePrefix = StringsKt.removePrefix(imageUrl, "file:///android_asset/");
        Context applicationContext = this.context.getApplicationContext();
        if (applicationContext == null || (assets = applicationContext.getAssets()) == null || (open = assets.open(removePrefix)) == null) {
            return null;
        }
        try {
            byte[] readBytes = ByteStreamsKt.readBytes(open);
            CloseableKt.closeFinally(open, null);
            return readBytes;
        } finally {
        }
    }
}
