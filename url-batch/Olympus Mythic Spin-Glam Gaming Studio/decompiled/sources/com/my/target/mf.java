package com.my.target;

import android.view.View;
import com.my.target.common.models.ImageData;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public interface mf {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();

        void a(b bVar, int i, n2 n2Var);

        void a(h2 h2Var);

        void a(boolean z);

        void b(int i);

        void b(h2 h2Var);

        void d();

        void e();

        void k();
    }

    View a();

    void a(int i, float f);

    void a(int i, String str);

    void a(boolean z);

    void b();

    void b(boolean z);

    void c();

    void c(boolean z);

    void d();

    void e();

    View getCloseButton();

    void setBackgroundImage(ImageData imageData);

    void setBanner(d9 d9Var);

    void setPanelColor(int i);

    void setSoundState(boolean z);
}
