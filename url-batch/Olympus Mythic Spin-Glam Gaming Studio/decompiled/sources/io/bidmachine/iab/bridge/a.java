package io.bidmachine.iab.bridge;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.safedk.android.internal.partials.BidMachineFilesBridge;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.iab.mraid.MraidWebView;
import io.bidmachine.iab.mraid.MraidWebViewController;
import io.bidmachine.iab.utils.Base32;
import io.bidmachine.iab.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;

/* loaded from: classes13.dex */
abstract class a {
    private static final Base32 a = new Base32();
    static final /* synthetic */ boolean b = true;

    static void a(MraidWebView mraidWebView, String str) {
        if (a(mraidWebView, str)) {
            return;
        }
        try {
            Pair a2 = a(a.decode(URLDecoder.decode(str, "UTF-8")));
            if (a(mraidWebView, (String) a2.first, (String) a2.second)) {
                return;
            }
            boolean z = b;
            if (!z && mraidWebView == null) {
                throw new AssertionError();
            }
            Object obj = mraidWebView.getContext().getApplicationContext().getSharedPreferences((String) a2.first, 0).getAll().get(a2.second);
            if (obj == null) {
                a(mraidWebView);
                return;
            }
            String valueOf = String.valueOf(obj);
            if (a(mraidWebView, valueOf)) {
                return;
            }
            if (!z && str == null) {
                throw new AssertionError();
            }
            a(mraidWebView, "fireReadDefaultsSuccessEvent", str, Base64.encodeToString(valueOf.getBytes(), 2));
        } catch (Throwable th) {
            a(mraidWebView);
            MraidLog.e("NativeStorage", th);
        }
    }

    static void b(MraidWebView mraidWebView, String str) {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        if (a(mraidWebView, str)) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            String decode = a.decode(URLDecoder.decode(str, "UTF-8"));
            if (!b && mraidWebView == null) {
                throw new AssertionError();
            }
            Context applicationContext = mraidWebView.getContext().getApplicationContext();
            File file = decode.contains("/") ? new File(decode) : applicationContext.getFileStreamPath(decode);
            if (file != null && file.exists()) {
                fileInputStream = applicationContext.openFileInput(decode);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    byte[] bArr = new byte[8192];
                    if (fileInputStream != null) {
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (-1 == read) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray.length > 0) {
                        if (!b && str == null) {
                            throw new AssertionError();
                        }
                        a(mraidWebView, "fireReadFileSuccessEvent", str, Base64.encodeToString(byteArray, 2));
                    } else {
                        a(mraidWebView);
                    }
                    Utils.close(fileInputStream);
                    Utils.close(byteArrayOutputStream);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    try {
                        a(mraidWebView);
                        MraidLog.e("NativeStorage", th);
                        return;
                    } finally {
                        Utils.close(fileInputStream);
                        Utils.close(byteArrayOutputStream2);
                    }
                }
            }
            a(mraidWebView);
            Utils.close(null);
            Utils.close(null);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    static void a(MraidWebView mraidWebView, String str, String str2) {
        if (a(mraidWebView, str, str2)) {
            return;
        }
        try {
            String decode = a.decode(URLDecoder.decode(str, "UTF-8"));
            byte[] decode2 = Base64.decode(URLDecoder.decode(str2, "UTF-8"), 2);
            Pair a2 = a(decode);
            if (a(mraidWebView, (String) a2.first, (String) a2.second)) {
                return;
            }
            if (!b && mraidWebView == null) {
                throw new AssertionError();
            }
            mraidWebView.getContext().getApplicationContext().getSharedPreferences((String) a2.first, 0).edit().putString((String) a2.second, new String(decode2)).apply();
        } catch (Throwable th) {
            a(mraidWebView);
            MraidLog.e("NativeStorage", th);
        }
    }

    private static void a(MraidWebView mraidWebView) {
        MraidWebViewController controller;
        if (mraidWebView == null || (controller = mraidWebView.getController()) == null) {
            return;
        }
        controller.injectJs("nativeStorage.fireErrorEvent('internal error');");
    }

    private static void a(MraidWebView mraidWebView, String str, String str2, String str3) {
        MraidWebViewController controller;
        if (mraidWebView == null || (controller = mraidWebView.getController()) == null) {
            return;
        }
        controller.injectJs("nativeStorage." + str + "(\"" + str2 + "\", \"" + str3 + "\");");
    }

    private static Pair a(String str) {
        String[] split = str.split("/");
        return new Pair(split[0], split[1]);
    }

    private static boolean a(MraidWebView mraidWebView, String... strArr) {
        if (mraidWebView == null || mraidWebView.getIsDestroyed() || mraidWebView.getContext() == null) {
            a(mraidWebView);
            return true;
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    a(mraidWebView);
                    return true;
                }
            }
        }
        return false;
    }

    static void b(MraidWebView mraidWebView, String str, String str2) {
        if (a(mraidWebView, str, str2)) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            String decode = a.decode(URLDecoder.decode(str, "UTF-8"));
            byte[] decode2 = Base64.decode(URLDecoder.decode(str2, "UTF-8"), 2);
            if (!a(mraidWebView, decode, new String(decode2))) {
                if (!b && mraidWebView == null) {
                    throw new AssertionError();
                }
                Context applicationContext = mraidWebView.getContext().getApplicationContext();
                if (decode.contains("/")) {
                    fileOutputStream = BidMachineFilesBridge.fileOutputStreamCtor(decode);
                } else {
                    fileOutputStream = applicationContext.openFileOutput(decode, 0);
                }
                fileOutputStream.write(decode2);
            }
        } catch (Throwable th) {
            try {
                a(mraidWebView);
                MraidLog.e("NativeStorage", th);
            } finally {
                Utils.flush(null);
                Utils.close(null);
            }
        }
    }
}
