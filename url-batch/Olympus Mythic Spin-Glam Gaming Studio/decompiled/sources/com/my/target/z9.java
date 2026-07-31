package com.my.target;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public interface z9 {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(double d);

        void a(b bVar);

        void a(b bVar, View view);

        void a(b bVar, String str, int i, o2 o2Var, Context context);

        void a(boolean z);

        void b(b bVar);
    }

    void destroy();

    View getCloseButton();

    View i();

    void pause();

    void resume();

    void stop();
}
