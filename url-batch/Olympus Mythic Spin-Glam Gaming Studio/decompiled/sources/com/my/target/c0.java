package com.my.target;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public interface c0 {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(float f);

        void a(float f, float f2);

        void a(String str);

        void b(float f, float f2);

        void c();

        void f();

        void g();

        void h();

        void j();

        void k();

        void p();
    }

    void a();

    void a(Uri uri, Context context);

    void a(Uri uri, e0 e0Var);

    void a(a aVar);

    void a(e0 e0Var);

    boolean b();

    boolean c();

    void d();

    void destroy();

    void e();

    void f();

    boolean g();

    float getDuration();

    long getPosition();

    Uri getUri();

    float getVolume();

    boolean isPlaying();

    void pause();

    void replay();

    void resume();

    void seekTo(long j);

    void setVolume(float f);

    void stop();
}
