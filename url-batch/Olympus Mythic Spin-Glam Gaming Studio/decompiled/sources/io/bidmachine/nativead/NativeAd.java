package io.bidmachine.nativead;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineAd;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageData;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.unified.UnifiedNativeAd;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import java.util.Set;

/* loaded from: classes5.dex */
public final class NativeAd extends BidMachineAd<NativeAd, NativeRequest, NativeAdObject, AdObjectParams, UnifiedNativeAdRequestParams, NativeListener> implements NativePublicData, NativeContainer {
    public NativeAd(@NonNull Context context) {
        super(context, AdsType.Native);
    }

    private boolean hasLoadedObject() {
        if (getLoadedAdObject() != null) {
            return true;
        }
        log("not loaded, please load ads first");
        return false;
    }

    @Nullable
    public NativePublicData getAdData() {
        return getLoadedAdObject();
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getCallToAction() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getCallToAction();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getDescription() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getDescription();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    /* renamed from: getIcon */
    public ImageData getIconImageData() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getIconImageData();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    /* renamed from: getMainImage */
    public ImageData getMainImageData() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getMainImageData();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativeContainer
    @Nullable
    public View getProviderView(@NonNull Context context) {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getProviderView(context);
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    public float getRating() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getRating();
        }
        return -1.0f;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getTitle() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getTitle();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    /* renamed from: hasVideo */
    public boolean getHasVideo() {
        return hasLoadedObject() && getLoadedAdObject().getHasVideo();
    }

    @Override // io.bidmachine.BidMachineAd
    public boolean isDuplicateShowDisabled() {
        return false;
    }

    @Override // io.bidmachine.nativead.NativeContainer
    public boolean isViewRegistered() {
        return hasLoadedObject() && getLoadedAdObject().isViewRegistered();
    }

    @Override // io.bidmachine.nativead.NativeContainer
    public void registerView(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable NativeMediaView nativeMediaView, @Nullable Set<View> set) {
        NativeAdObject prepareShow = prepareShow();
        if (prepareShow == null) {
            return;
        }
        prepareShow.registerView(viewGroup, view, nativeMediaView, set, this.rendererConfiguration);
    }

    @Override // io.bidmachine.nativead.NativeContainer
    public void unregisterView() {
        if (hasLoadedObject()) {
            getLoadedAdObject().unregisterView();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    public NativeAdObject createAdObject(@NonNull ContextProvider contextProvider, @NonNull NativeRequest nativeRequest, @NonNull NetworkAdapter networkAdapter, @NonNull AdObjectParams adObjectParams, @NonNull AdProcessCallback adProcessCallback) {
        UnifiedNativeAd createNativeAd = networkAdapter.createNativeAd();
        if (createNativeAd == null) {
            return null;
        }
        return new NativeAdObject(contextProvider, adProcessCallback, nativeRequest, adObjectParams, createNativeAd);
    }
}
