package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class y {
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    public static volatile boolean g;
    private static boolean h;
    private static InputManager i;

    static class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ int c;

        a(String str, Context context, int i) {
            this.a = str;
            this.b = context;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean isExternal;
            String str;
            if (y.g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.a);
            }
            InputManager b = y.b(this.b);
            if (b == null) {
                return;
            }
            InputDevice inputDevice = b.getInputDevice(this.c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                str = "nihc";
            } else {
                if (!inputDevice.isVirtual()) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        isExternal = inputDevice.isExternal();
                        if (isExternal) {
                            y.f();
                            y.g();
                            y.c("eihc");
                            return;
                        }
                        return;
                    }
                    return;
                }
                y.d();
                y.e();
                str = "vihc";
            }
            y.c(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r0.contains("android.view.ViewRootImpl$InputStage") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(MotionEvent motionEvent, Context context) {
        String str;
        if (motionEvent == null || context == null) {
            return;
        }
        if (g) {
            try {
                if (motionEvent.getToolType(0) == 0 || motionEvent.getSource() == 0 || motionEvent.getSource() == 2) {
                    str = Arrays.toString(new Exception().getStackTrace());
                    if (!str.contains("android.view.InputEventReceiver") && !str.contains("android.view.ViewRootImpl$WindowInputEventReceiver")) {
                    }
                }
            } catch (Throwable unused) {
            }
        }
        str = null;
        ar.b(new a(str, context, motionEvent.getDeviceId()));
    }

    static /* synthetic */ int b() {
        int i2 = c;
        c = i2 + 1;
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(String str) {
        char c2;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h();
        str.hashCode();
        switch (str.hashCode()) {
            case 100415:
                if (str.equals("eic")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 109064:
                if (str.equals("nic")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 116752:
                if (str.equals("vic")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3113119:
                if (str.equals("eihc")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3381238:
                if (str.equals("nihc")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3619566:
                if (str.equals("vihc")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (i == null) {
            i = (InputManager) context.getSystemService("input");
        }
        return i;
    }

    static /* synthetic */ int c() {
        int i2 = f;
        f = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences a2 = aw.a(z.a());
            if (a2 != null) {
                a2.edit().putInt(str, a2.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    static /* synthetic */ int d() {
        int i2 = a;
        a = i2 + 1;
        return i2;
    }

    static /* synthetic */ int e() {
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    static /* synthetic */ int f() {
        int i2 = b;
        b = i2 + 1;
        return i2;
    }

    static /* synthetic */ int g() {
        int i2 = e;
        e = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (h) {
            return;
        }
        try {
            SharedPreferences a2 = aw.a(z.a());
            if (a2 != null) {
                f = a2.getInt("nihc", 0);
                e = a2.getInt("eihc", 0);
                d = a2.getInt("vihc", 0);
                h = true;
            }
        } catch (Throwable unused) {
        }
    }
}
