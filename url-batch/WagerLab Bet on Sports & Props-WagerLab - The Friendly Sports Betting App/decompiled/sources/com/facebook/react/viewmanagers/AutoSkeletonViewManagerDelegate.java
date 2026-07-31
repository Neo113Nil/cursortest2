package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.AutoSkeletonViewManagerInterface;

/* loaded from: classes4.dex */
public class AutoSkeletonViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AutoSkeletonViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AutoSkeletonViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -284066624:
                if (str.equals("gradientColors")) {
                    c = 0;
                    break;
                }
                break;
            case -243128142:
                if (str.equals("isLoading")) {
                    c = 1;
                    break;
                }
                break;
            case 637309894:
                if (str.equals("shimmerSpeed")) {
                    c = 2;
                    break;
                }
                break;
            case 679770004:
                if (str.equals("shimmerBackgroundColor")) {
                    c = 3;
                    break;
                }
                break;
            case 927185459:
                if (str.equals("defaultRadius")) {
                    c = 4;
                    break;
                }
                break;
            case 2031205598:
                if (str.equals("animationType")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((AutoSkeletonViewManagerInterface) this.mViewManager).setGradientColors(t, (ReadableArray) obj);
                break;
            case 1:
                ((AutoSkeletonViewManagerInterface) this.mViewManager).setIsLoading(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 2:
                ((AutoSkeletonViewManagerInterface) this.mViewManager).setShimmerSpeed(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 3:
                ((AutoSkeletonViewManagerInterface) this.mViewManager).setShimmerBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 4:
                ((AutoSkeletonViewManagerInterface) this.mViewManager).setDefaultRadius(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 5:
                ((AutoSkeletonViewManagerInterface) this.mViewManager).setAnimationType(t, obj == null ? null : (String) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
