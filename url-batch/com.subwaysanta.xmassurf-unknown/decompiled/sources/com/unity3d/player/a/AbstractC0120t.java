package com.unity3d.player.a;

import android.util.Log;

/* renamed from: com.unity3d.player.a.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0120t {
    public static boolean a = false;

    public static void Log(int i, String str) {
        if (a) {
            return;
        }
        if (i == 6) {
            Log.e("Unity", str);
        }
        if (i == 5) {
            Log.w("Unity", str);
        }
    }
}
