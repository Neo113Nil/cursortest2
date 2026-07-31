package com.my.target.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes10.dex */
public interface IAd {
    int getAdChoicesPlacement();

    int getCachePolicy();

    void handleData(@NonNull String str);

    void load();

    void loadFromBid(@NonNull String str);

    @Deprecated
    void registerView(@NonNull View view);

    @Deprecated
    void registerView(@NonNull View view, @Nullable List<View> list);

    void setAdChoicesPlacement(int i);

    void setCachePolicy(int i);

    void unregisterView();
}
