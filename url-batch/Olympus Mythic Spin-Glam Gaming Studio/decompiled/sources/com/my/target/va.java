package com.my.target;

import android.view.View;
import android.widget.LinearLayout;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public interface va {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();

        void a(int i, n2 n2Var);

        void b();

        void d();

        void e();
    }

    View a();

    void b();

    void c();

    void d();

    View getCloseButton();

    LinearLayout getTopBar();

    void setBanner(d9 d9Var);

    void setDoubleBanners(List list);

    void setRemainingAllowCloseDelay(int i);
}
