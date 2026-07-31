package com.my.target;

import android.content.Context;
import com.unity3d.player.UnityPlayerActivity;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class kg {
    static int a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context) {
        ve.a(context).b(a);
    }

    public static void b(final Context context) {
        o0.d(new Runnable() { // from class: com.my.target.kg$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                kg.a(context);
            }
        });
    }

    public static void c() {
        a |= 8;
    }

    public static void d() {
        a |= 4;
    }

    public static void e() {
        a |= 64;
    }

    public static void f() {
        a |= 128;
    }

    public static void g() {
        a &= -3;
    }

    public static int a() {
        return a;
    }

    public static void b(boolean z) {
        if (z) {
            a |= 16;
        } else {
            a &= -17;
        }
    }

    public static void c(boolean z) {
        if (z) {
            a |= 32;
        } else {
            a &= -33;
        }
    }

    public static void a(boolean z) {
        if (z) {
            a |= 256;
        } else {
            a &= -257;
        }
    }

    public static void b() {
        if (ib.a()) {
            a |= 2;
        }
        try {
            try {
                int i = UnityPlayerActivity.$r8$clinit;
                a |= 1;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            Runtime.getRuntime().loadLibrary("unity");
            a |= 1;
        }
    }
}
