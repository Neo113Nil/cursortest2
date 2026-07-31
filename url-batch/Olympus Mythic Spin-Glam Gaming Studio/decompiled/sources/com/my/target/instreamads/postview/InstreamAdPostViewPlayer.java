package com.my.target.instreamads.postview;

import android.view.ViewGroup;
import com.my.target.instreamads.postview.models.PostViewData;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public interface InstreamAdPostViewPlayer {
    @NotNull
    ViewGroup getView();

    void hide();

    void pause();

    void resume();

    void show(@NotNull PostViewData postViewData);

    void updateProgress(int i, int i2);
}
