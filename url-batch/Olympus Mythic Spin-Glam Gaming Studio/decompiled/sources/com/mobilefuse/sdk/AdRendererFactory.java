package com.mobilefuse.sdk;

import android.content.Context;
import com.mobilefuse.sdk.component.AdRendererComponent;
import com.mobilefuse.sdk.component.ComponentRegistrar;
import com.mobilefuse.sdk.component.ComponentType;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.omid.OmidService;

/* loaded from: classes14.dex */
class AdRendererFactory {
    AdRendererFactory() {
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T extends com.mobilefuse.sdk.omid.OmidBridge, com.mobilefuse.sdk.omid.OmidBridge] */
    static BaseAdRenderer getAdRenderer(Context context, AdmMediaType admMediaType, AdRendererConfig adRendererConfig, AdRendererListener adRendererListener) throws Throwable {
        AdRendererType adRendererType;
        AdRendererComponent adRendererComponent;
        BaseAdRenderer<OmidBridge> createInstance;
        try {
            if (admMediaType == AdmMediaType.STORYBOARD) {
                adRendererType = AdRendererType.STORYBOARD;
                adRendererComponent = ComponentRegistrar.getRegisteredComponent(ComponentType.STORYBOARD_AD_RENDERER);
            } else {
                adRendererType = null;
                adRendererComponent = null;
            }
            if (admMediaType == AdmMediaType.VIDEO) {
                adRendererType = AdRendererType.VAST;
                adRendererComponent = ComponentRegistrar.getRegisteredComponent(ComponentType.VAST_AD_RENDERER);
            } else if (admMediaType == AdmMediaType.BANNER) {
                adRendererType = AdRendererType.MRAID;
                adRendererComponent = ComponentRegistrar.getRegisteredComponent(ComponentType.MRAID_AD_RENDERER);
            }
            if (adRendererComponent == null || (createInstance = adRendererComponent.createInstance(context, adRendererConfig, adRendererListener)) == null) {
                return null;
            }
            createInstance.omidBridge = OmidService.createOmidBridge(adRendererType);
            return createInstance;
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) AdRendererFactory.class, th);
            return null;
        }
    }
}
