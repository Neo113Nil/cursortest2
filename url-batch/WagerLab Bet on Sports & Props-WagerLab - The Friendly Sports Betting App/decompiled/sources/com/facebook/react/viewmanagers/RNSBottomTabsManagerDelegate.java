package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface;

/* loaded from: classes4.dex */
public class RNSBottomTabsManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSBottomTabsManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSBottomTabsManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1873119606:
                if (str.equals("tabBarTintColor")) {
                    c = 0;
                    break;
                }
                break;
            case -1716883528:
                if (str.equals("tabBarItemLabelVisibilityMode")) {
                    c = 1;
                    break;
                }
                break;
            case -1167805191:
                if (str.equals("tabBarItemIconColor")) {
                    c = 2;
                    break;
                }
                break;
            case -1140765365:
                if (str.equals("tabBarItemActiveIndicatorColor")) {
                    c = 3;
                    break;
                }
                break;
            case -727132909:
                if (str.equals("tabBarItemTitleFontColorActive")) {
                    c = 4;
                    break;
                }
                break;
            case -149697865:
                if (str.equals("tabBarBackgroundColor")) {
                    c = 5;
                    break;
                }
                break;
            case -141083017:
                if (str.equals("tabBarItemTitleFontSize")) {
                    c = 6;
                    break;
                }
                break;
            case -93216851:
                if (str.equals("tabBarItemTitleFontColor")) {
                    c = 7;
                    break;
                }
                break;
            case -78279173:
                if (str.equals("tabBarItemTitleFontStyle")) {
                    c = '\b';
                    break;
                }
                break;
            case 144476014:
                if (str.equals("tabBarMinimizeBehavior")) {
                    c = '\t';
                    break;
                }
                break;
            case 676974377:
                if (str.equals("tabBarItemActiveIndicatorEnabled")) {
                    c = '\n';
                    break;
                }
                break;
            case 697418079:
                if (str.equals("tabBarItemIconColorActive")) {
                    c = 11;
                    break;
                }
                break;
            case 1458977038:
                if (str.equals("controlNavigationStateInJS")) {
                    c = '\f';
                    break;
                }
                break;
            case 1478227034:
                if (str.equals("tabBarItemTitleFontFamily")) {
                    c = '\r';
                    break;
                }
                break;
            case 1935822306:
                if (str.equals("tabBarItemRippleColor")) {
                    c = 14;
                    break;
                }
                break;
            case 1968495470:
                if (str.equals("tabBarItemTitleFontWeight")) {
                    c = 15;
                    break;
                }
                break;
            case 2018161757:
                if (str.equals("tabBarItemTitleFontSizeActive")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 1:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemLabelVisibilityMode(t, (String) obj);
                break;
            case 2:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemIconColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 3:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemActiveIndicatorColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 4:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontColorActive(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 5:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 6:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontSize(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 7:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case '\b':
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontStyle(t, obj != null ? (String) obj : null);
                break;
            case '\t':
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarMinimizeBehavior(t, (String) obj);
                break;
            case '\n':
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemActiveIndicatorEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemIconColorActive(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case '\f':
                ((RNSBottomTabsManagerInterface) this.mViewManager).setControlNavigationStateInJS(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\r':
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontFamily(t, obj != null ? (String) obj : null);
                break;
            case 14:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemRippleColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 15:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontWeight(t, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontSizeActive(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
