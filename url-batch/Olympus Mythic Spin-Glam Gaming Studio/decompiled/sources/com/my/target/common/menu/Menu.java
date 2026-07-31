package com.my.target.common.menu;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public interface Menu {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface Listener {
        void onActionClick(@NonNull MenuAction menuAction);
    }

    void addAboutCompanyInfo(@NonNull String str);

    void addAction(@NonNull MenuAction menuAction);

    void dismiss();

    void present(@NonNull Context context);

    void setListener(@Nullable Listener listener);
}
