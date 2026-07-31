package com.mobilefuse.videoplayer.model;

import com.yandex.div.core.ScrollDirection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModelExtensions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\t\u0010\u000b\u001a\u00020\u0002H\u0096\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"com/mobilefuse/videoplayer/model/VastDataModelExtensionsKt$getAdsChainIterator$1", "", "Lcom/mobilefuse/videoplayer/model/VastAd;", "itAd", "Lcom/mobilefuse/videoplayer/model/VastTag;", "getItAd", "()Lcom/mobilefuse/videoplayer/model/VastTag;", "setItAd", "(Lcom/mobilefuse/videoplayer/model/VastTag;)V", "hasNext", "", ScrollDirection.NEXT, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes8.dex */
public final class VastDataModelExtensionsKt$getAdsChainIterator$1 implements Iterator<VastAd>, KMappedMarker {
    final /* synthetic */ boolean $onlyParentAds;
    final /* synthetic */ VastModel $this_getAdsChainIterator;

    @Nullable
    private VastTag itAd;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    VastDataModelExtensionsKt$getAdsChainIterator$1(VastModel vastModel, boolean z) {
        this.$this_getAdsChainIterator = vastModel;
        this.$onlyParentAds = z;
        this.itAd = z ? VastDataModelExtensionsKt.getParentTag(vastModel, VastDataModelExtensionsKt.getMainVastTag(vastModel)) : VastDataModelExtensionsKt.getMainVastTag(vastModel);
    }

    @Nullable
    public final VastTag getItAd() {
        return this.itAd;
    }

    public final void setItAd(@Nullable VastTag vastTag) {
        this.itAd = vastTag;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        VastTag vastTag = this.itAd;
        if (vastTag != null) {
            if ((vastTag != null ? VastDataModelExtensionsKt.getFirstAd(vastTag) : null) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public VastAd next() {
        VastTag vastTag = this.itAd;
        Intrinsics.checkNotNull(vastTag);
        this.itAd = VastDataModelExtensionsKt.getParentTag(this.$this_getAdsChainIterator, vastTag);
        VastAd firstAd = VastDataModelExtensionsKt.getFirstAd(vastTag);
        Intrinsics.checkNotNull(firstAd);
        return firstAd;
    }
}
