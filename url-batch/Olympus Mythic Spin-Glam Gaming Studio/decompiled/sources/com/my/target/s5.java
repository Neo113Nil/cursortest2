package com.my.target;

import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes.dex */
public interface s5 {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();

        void a(IAdLoadingError iAdLoadingError);

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();
    }

    String a();

    void a(MyTargetView.AdSize adSize);

    void a(a aVar);

    float d();

    void destroy();

    void pause();

    void prepare();

    void resume();

    void start();

    void stop();
}
