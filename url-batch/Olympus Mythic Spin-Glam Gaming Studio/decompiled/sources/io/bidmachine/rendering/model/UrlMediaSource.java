package io.bidmachine.rendering.model;

import io.bidmachine.rendering.model.MediaSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lio/bidmachine/rendering/model/UrlMediaSource;", "Lio/bidmachine/rendering/model/MediaSource;", "", "", "urls", "Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "deliveryType", "<init>", "(Ljava/util/List;Lio/bidmachine/rendering/model/MediaSource$DeliveryType;)V", "url", "(Ljava/lang/String;Lio/bidmachine/rendering/model/MediaSource$DeliveryType;)V", "component1", "()Ljava/util/List;", "component2", "()Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "copy", "(Ljava/util/List;Lio/bidmachine/rendering/model/MediaSource$DeliveryType;)Lio/bidmachine/rendering/model/UrlMediaSource;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "getUrls", "c", "Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "getDeliveryType", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UrlMediaSource extends MediaSource {

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final List urls;

    /* renamed from: c, reason: from kotlin metadata */
    private final MediaSource.DeliveryType deliveryType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlMediaSource(@NotNull List<String> urls, @NotNull MediaSource.DeliveryType deliveryType) {
        super(deliveryType, null);
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(deliveryType, "deliveryType");
        this.urls = urls;
        this.deliveryType = deliveryType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UrlMediaSource copy$default(UrlMediaSource urlMediaSource, List list, MediaSource.DeliveryType deliveryType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = urlMediaSource.urls;
        }
        if ((i & 2) != 0) {
            deliveryType = urlMediaSource.getDeliveryType();
        }
        return urlMediaSource.copy(list, deliveryType);
    }

    @NotNull
    public final List<String> component1() {
        return this.urls;
    }

    @NotNull
    public final MediaSource.DeliveryType component2() {
        return getDeliveryType();
    }

    @NotNull
    public final UrlMediaSource copy(@NotNull List<String> urls, @NotNull MediaSource.DeliveryType deliveryType) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(deliveryType, "deliveryType");
        return new UrlMediaSource(urls, deliveryType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlMediaSource)) {
            return false;
        }
        UrlMediaSource urlMediaSource = (UrlMediaSource) other;
        return Intrinsics.areEqual(this.urls, urlMediaSource.urls) && getDeliveryType() == urlMediaSource.getDeliveryType();
    }

    @Override // io.bidmachine.rendering.model.MediaSource
    @NotNull
    public MediaSource.DeliveryType getDeliveryType() {
        return this.deliveryType;
    }

    @NotNull
    public final List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        return (this.urls.hashCode() * 31) + getDeliveryType().hashCode();
    }

    @NotNull
    public String toString() {
        return "UrlMediaSource(urls=" + this.urls + ", deliveryType=" + getDeliveryType() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UrlMediaSource(@NotNull String url, @NotNull MediaSource.DeliveryType deliveryType) {
        this((List<String>) CollectionsKt.listOf(url), deliveryType);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(deliveryType, "deliveryType");
    }
}
