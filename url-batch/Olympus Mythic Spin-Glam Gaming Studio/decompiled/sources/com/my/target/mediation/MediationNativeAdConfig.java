package com.my.target.mediation;

import androidx.annotation.Nullable;
import com.my.target.common.menu.MenuFactory;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public interface MediationNativeAdConfig extends MediationAdConfig {
    int getAdChoicesPlacement();

    int getCachePolicy();

    @Nullable
    MenuFactory getMenuFactory();

    @Deprecated
    boolean isAutoLoadImages();

    @Deprecated
    boolean isAutoLoadVideo();
}
