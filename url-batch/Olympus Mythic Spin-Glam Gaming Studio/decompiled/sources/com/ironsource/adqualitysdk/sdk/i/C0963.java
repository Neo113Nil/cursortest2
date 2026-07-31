package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.util.Pair;
import android.widget.VideoView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴝ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0963 extends AbstractC1100 {
    static {
        StringFog.decrypt("z5UxZoSLqGnqgipLj4uodty9JESKj6x34Z42XoqGqmA=\n", "qPBFKuvoyQU=\n");
        StringFog.decrypt("RCGjSj2ZB5l0NqtCKo4DmEIWoUArhBSORA==\n", "NkTEI07tYus=\n");
        StringFog.decrypt("0QyShwE1Ro/BEKKQCT1RmMURlLADP1CS0geS\n", "pGLg4mZcNfs=\n");
        StringFog.decrypt("mykVb9h+Hm2VPhJL9nUGTp84\n", "/ExhP7kXbCs=\n");
        StringFog.decrypt("ZJzHGSWFsaNmmtwnIKOhmmaaxw==\n", "A/mzSUTsw/A=\n");
        StringFog.decrypt("a16HwrEtTiZcV5L2sTs=\n", "DDvzj9RJJ0c=\n");
        StringFog.decrypt("SKzeH2e8JUxKnNoPa6cpZkGEwzdruQ==\n", "L8mqWwLKTC8=\n");
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static void m4251(ArrayList arrayList) {
        Context context = (Context) AbstractC1100.m4401(arrayList, 0, Context.class);
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) AbstractC1100.m4401(arrayList, 1, BroadcastReceiver.class);
        Object m4449 = AbstractC1206.m4449(context);
        try {
            AbstractC1226.m4478(m4449, StringFog.decrypt("6NqKPZCdjz74xqo9lJGVPPjG\n", "nbT4WPf0/Eo=\n"), Arrays.asList(broadcastReceiver)).invoke(m4449, broadcastReceiver);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m4252(ArrayList arrayList) {
        Context context = (Context) AbstractC1100.m4401(arrayList, 0, Context.class);
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) AbstractC1100.m4401(arrayList, 1, BroadcastReceiver.class);
        IntentFilter intentFilter = (IntentFilter) AbstractC1100.m4401(arrayList, 2, IntentFilter.class);
        Object m4449 = AbstractC1206.m4449(context);
        try {
            AbstractC1226.m4478(m4449, StringFog.decrypt("kyvAvkDyNZ2zK8SyWvA1nQ==\n", "4U6n1zOGUO8=\n"), Arrays.asList(broadcastReceiver, intentFilter)).invoke(m4449, broadcastReceiver, intentFilter);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Object m4253(ArrayList arrayList) {
        return ((Pair) AbstractC1100.m4401(arrayList, 0, Pair.class)).second;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m4254(ArrayList arrayList) {
        return ((Pair) AbstractC1100.m4401(arrayList, 0, Pair.class)).first;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static MediaPlayer m4255(ArrayList arrayList) {
        VideoView videoView = (VideoView) AbstractC1100.m4401(arrayList, 0, VideoView.class);
        try {
            Field m4261 = AbstractC0967.m4261(VideoView.class, AbstractC0967.f2305);
            if (m4261 != null) {
                return (MediaPlayer) m4261.get(videoView);
            }
        } catch (Exception e) {
            AbstractC0577.m4068(AbstractC0967.f2316, StringFog.decrypt("ElSS6Fyj7NtXQYXzY+bh3BZ2jOZX5vc=\n", "dybghy6DhbU=\n"), (Throwable) e, false);
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m4257(ArrayList arrayList) {
        return AbstractC1206.m4449((Context) AbstractC1100.m4401(arrayList, 0, Context.class));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static long m4256() {
        String str = AbstractC0530.f589;
        return SystemClock.elapsedRealtime();
    }
}
