package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵥ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC1026 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final ScheduledExecutorService f2537;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final Handler f2538;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Handler f2539 = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    static {
        Handler handler;
        HandlerThread handlerThread;
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            try {
                handlerThread = new HandlerThread(StringFog.decrypt("/b3VaI4zFvPImw==\n", "qf+XL9pbZJY=\n"));
            } catch (Throwable unused) {
                handlerThread = null;
            }
            try {
                handlerThread.start();
                handler = new Handler(handlerThread.getLooper());
                break;
            } catch (Throwable unused2) {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                    } catch (Throwable unused3) {
                        AbstractC0580.m4082(StringFog.decrypt("5bQ2CVm9Gf/dgyM3\n", "pNBnfDjRcIs=\n"), StringFog.decrypt("/7mF/JXcM4vW+I/ildlnmpm6jfOb32GQzLaIsJjZfZvVvZ4=\n", "udjskPC4E/8=\n"), true);
                        handler = null;
                        f2538 = handler;
                        f2537 = handler == null ? Executors.newSingleThreadScheduledExecutor() : null;
                    }
                }
                AbstractC0580.m4082(StringFog.decrypt("ak8PuszA2DhSeBqE\n", "Kytez62ssUw=\n"), StringFog.decrypt("4OIdSfvw9CvJoxdX+/WgOobhFUb186Yw0+0QBfb1ujvK5gYJvuaxK9T6HUv5uvpx\n", "poN0JZ6U1F8=\n"), true);
                i++;
            }
            i++;
        }
        f2538 = handler;
        f2537 = handler == null ? Executors.newSingleThreadScheduledExecutor() : null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m4312(AbstractRunnableC0913 abstractRunnableC0913) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            abstractRunnableC0913.run();
        } else {
            m4314(abstractRunnableC0913);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m4313(AbstractRunnableC0913 abstractRunnableC0913) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m4316(abstractRunnableC0913);
        } else {
            abstractRunnableC0913.run();
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m4315(AbstractRunnableC0913 abstractRunnableC0913, long j) {
        try {
            f2539.postDelayed(abstractRunnableC0913, j);
        } catch (Throwable unused) {
            AbstractC0580.m4082(StringFog.decrypt("DCN+SxSxoxc0FGt1\n", "TUcvPnXdymM=\n"), StringFog.decrypt("nXuMTvERIy60OpVN5wEjPr52hFvxESM1tTqIQ/0bIy6zaIBD8A==\n", "2xrlIpR1A1o=\n"), false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4317(AbstractRunnableC0913 abstractRunnableC0913, long j) {
        try {
            Handler handler = f2538;
            if (handler != null) {
                handler.postDelayed(abstractRunnableC0913, j);
            } else {
                ScheduledExecutorService scheduledExecutorService = f2537;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.schedule(abstractRunnableC0913, j, TimeUnit.MILLISECONDS);
                } else {
                    AbstractC0580.m4082(StringFog.decrypt("C8YLHZpHM+Qz8R4j\n", "SqJaaPsrWpA=\n"), StringFog.decrypt("dhgZkvCH3J1KGEye9cTfm1YTVZXjxNiIGBFYnP2G1plTV1yI9IfCjlcFGZHnhd6WWRVVlQ==\n", "OHc58JHkt/o=\n"), false);
                }
            }
        } catch (Throwable unused) {
            AbstractC0580.m4082(StringFog.decrypt("GI2A2dncDm0gupXn\n", "WenRrLiwZxk=\n"), StringFog.decrypt("sOuWdcP8znWZqo921ezOZZPmnmDD/M5umKqdeMXziXOZ/5F9hvCPb5Lmmms=\n", "9or/GaaY7gE=\n"), false);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m4314(AbstractRunnableC0913 abstractRunnableC0913) {
        try {
            f2539.post(abstractRunnableC0913);
        } catch (Throwable unused) {
            AbstractC0580.m4082(StringFog.decrypt("6FhGDyYUIsvQb1Mx\n", "qTwXekd4S78=\n"), StringFog.decrypt("gnh8TrupOKGrOWVNrbk4uqo5eEO3ozihrGtwQ7o=\n", "xBkVIt7NGNU=\n"), false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4316(AbstractRunnableC0913 abstractRunnableC0913) {
        try {
            Handler handler = f2538;
            if (handler != null) {
                handler.post(abstractRunnableC0913);
            } else {
                ScheduledExecutorService scheduledExecutorService = f2537;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.execute(abstractRunnableC0913);
                } else {
                    AbstractC0580.m4082(StringFog.decrypt("rDlji9SUgBOUDna1\n", "7V0y/rX46Wc=\n"), StringFog.decrypt("Pgy64ec741wCDO/t4njgWh4H9ub0eOdJUAX77+o66VgbQ//74zv9Tx8RuuLwOeFXEQH25g==\n", "cGOag4ZYiDs=\n"), false);
                }
            }
        } catch (Throwable unused) {
            AbstractC0580.m4082(StringFog.decrypt("866LE/gvmn3LmZ4t\n", "ssraZplD8wk=\n"), StringFog.decrypt("1FqRaaSsN2L9G4hqsrw3efwbmmSio3Bk/U6WYeGgdnj2V513\n", "kjv4BcHIFxY=\n"), false);
        }
    }
}
