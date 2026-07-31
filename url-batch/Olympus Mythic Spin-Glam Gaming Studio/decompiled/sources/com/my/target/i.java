package com.my.target;

import android.view.View;
import com.my.target.common.menu.MenuAction;
import com.my.target.common.models.ImageData;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public interface i {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();

        void b();

        void onActionClick(MenuAction menuAction);
    }

    View a();

    void a(String str, String str2, String str3, ImageData imageData, String str4, List list);

    void dismiss();
}
