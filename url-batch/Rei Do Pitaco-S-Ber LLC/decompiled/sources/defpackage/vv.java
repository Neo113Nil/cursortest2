package defpackage;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import android.window.BackEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class vv {
    public static ra d = null;
    public static boolean h = false;
    public static Method i = null;
    public static boolean j = false;
    public static Field k;
    public static final Object a = new Object();
    public static final q7 b = new q7();
    public static final ra c = new ra(null, null, null);
    public static final byte[] e = {112, 114, 111, 0};
    public static final byte[] f = {112, 114, 109, 0};
    public static final Object g = new Object();

    public static nm A(String... strArr) {
        if (strArr.length % 2 != 0) {
            l8.l("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr2[i3];
            if (str == null) {
                l8.l("Headers cannot be null");
                return null;
            }
            strArr2[i3] = m30.x0(str).toString();
        }
        int r = oo.r(0, strArr2.length - 1, 2);
        if (r >= 0) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                e(str2);
                h(str3, str2);
                if (i2 == r) {
                    break;
                }
                i2 += 2;
            }
        }
        return new nm(strArr2);
    }

    public static long D(String str, int i2) {
        int k2 = k(str, 0, i2, false);
        Matcher matcher = fd.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (k2 < i2) {
            int k3 = k(str, k2 + 1, i2, true);
            matcher.region(k2, k3);
            if (i4 == -1 && matcher.usePattern(fd.m).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(fd.l).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = fd.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = m30.o0(pattern2, lowerCase, 0, false) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(fd.j).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            k2 = k(str, k3 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            l8.l("Failed requirement.");
            return 0L;
        }
        if (i6 == -1) {
            l8.l("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            l8.l("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            l8.l("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            l8.l("Failed requirement.");
            return 0L;
        }
        if (i8 < 0 || i8 >= 60) {
            l8.l("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(z60.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final boolean E(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void F(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    try {
                        newSerializer.setOutput(openFileOutput, null);
                        newSerializer.startDocument("UTF-8", Boolean.TRUE);
                        newSerializer.startTag(null, "locales");
                        newSerializer.attribute(null, "application_locales", str);
                        newSerializer.endTag(null, "locales");
                        newSerializer.endDocument();
                    } catch (Throwable th) {
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                }
            } catch (FileNotFoundException unused2) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static String G(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        r8 r8Var = r8.i;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        int length = encoded.length;
        f(encoded.length, 0L, length);
        g8.r(length, encoded.length);
        int i2 = 0;
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        copyOfRange.getClass();
        r8 r8Var2 = new r8(copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(copyOfRange, 0, r8Var2.a());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        new r8(digest);
        byte[] bArr = a.a;
        bArr.getClass();
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i3 = 0;
        while (i2 < length2) {
            byte b2 = digest[i2];
            int i4 = i2 + 2;
            byte b3 = digest[i2 + 1];
            i2 += 3;
            byte b4 = digest[i4];
            bArr2[i3] = bArr[(b2 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr2[i3 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 += 4;
            bArr2[i5] = bArr[b4 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b5 = digest[i2];
            bArr2[i3] = bArr[(b5 & 255) >> 2];
            bArr2[i3 + 1] = bArr[(b5 & 3) << 4];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
        } else if (length3 == 2) {
            int i6 = i2 + 1;
            byte b6 = digest[i2];
            byte b7 = digest[i6];
            bArr2[i3] = bArr[(b6 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i3 + 2] = bArr[(b7 & 15) << 2];
            bArr2[i3 + 3] = 61;
        }
        sb.append(new String(bArr2, r9.a));
        return sb.toString();
    }

    public static int[] H(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) oo.K(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        if (r5 != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String I(Context context) {
        String str;
        synchronized (a) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        int depth = newPullParser.getDepth();
                        while (true) {
                            int next = newPullParser.next();
                            if (next != 1) {
                                if (next == 3 && newPullParser.getDepth() <= depth) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                return "";
            }
        }
        return str;
        if (str.isEmpty()) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
        return str;
    }

    public static df[] J(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, df[] dfVarArr) {
        byte[] bArr3 = m60.q;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, m60.r)) {
                l8.u("Unsupported meta version");
                return null;
            }
            int K = (int) oo.K(fileInputStream, 2);
            byte[] J = oo.J(fileInputStream, (int) oo.K(fileInputStream, 4), (int) oo.K(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                l8.u("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(J);
            try {
                df[] L = L(byteArrayInputStream, bArr2, K, dfVarArr);
                byteArrayInputStream.close();
                return L;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(m60.l, bArr2)) {
            l8.u("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            l8.u("Unsupported meta version");
            return null;
        }
        int K2 = (int) oo.K(fileInputStream, 1);
        byte[] J2 = oo.J(fileInputStream, (int) oo.K(fileInputStream, 4), (int) oo.K(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            l8.u("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(J2);
        try {
            df[] K3 = K(byteArrayInputStream2, K2, dfVarArr);
            byteArrayInputStream2.close();
            return K3;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static df[] K(ByteArrayInputStream byteArrayInputStream, int i2, df[] dfVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new df[0];
        }
        if (i2 != dfVarArr.length) {
            l8.u("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int K = (int) oo.K(byteArrayInputStream, 2);
            iArr[i3] = (int) oo.K(byteArrayInputStream, 2);
            strArr[i3] = new String(oo.H(byteArrayInputStream, K), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            df dfVar = dfVarArr[i4];
            if (!dfVar.b.equals(strArr[i4])) {
                l8.u("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            dfVar.e = i5;
            dfVar.h = H(byteArrayInputStream, i5);
        }
        return dfVarArr;
    }

    public static df[] L(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, df[] dfVarArr) {
        df dfVar;
        if (byteArrayInputStream.available() == 0) {
            return new df[0];
        }
        if (i2 != dfVarArr.length) {
            l8.u("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            oo.K(byteArrayInputStream, 2);
            String str = new String(oo.H(byteArrayInputStream, (int) oo.K(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long K = oo.K(byteArrayInputStream, 4);
            int K2 = (int) oo.K(byteArrayInputStream, 2);
            if (dfVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < dfVarArr.length; i4++) {
                    if (dfVarArr[i4].b.equals(substring)) {
                        dfVar = dfVarArr[i4];
                        break;
                    }
                }
            }
            dfVar = null;
            if (dfVar == null) {
                l8.u("Missing profile key: ".concat(str));
                return null;
            }
            dfVar.d = K;
            int[] H = H(byteArrayInputStream, K2);
            if (Arrays.equals(bArr, m60.p)) {
                dfVar.e = K2;
                dfVar.h = H;
            }
        }
        return dfVarArr;
    }

    public static df[] M(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, m60.m)) {
            l8.u("Unsupported version");
            return null;
        }
        int K = (int) oo.K(fileInputStream, 1);
        byte[] J = oo.J(fileInputStream, (int) oo.K(fileInputStream, 4), (int) oo.K(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            l8.u("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(J);
        try {
            df[] N = N(byteArrayInputStream, str, K);
            byteArrayInputStream.close();
            return N;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static df[] N(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new df[0];
        }
        df[] dfVarArr = new df[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int K = (int) oo.K(byteArrayInputStream, 2);
            int K2 = (int) oo.K(byteArrayInputStream, 2);
            dfVarArr[i4] = new df(str, new String(oo.H(byteArrayInputStream, K), StandardCharsets.UTF_8), oo.K(byteArrayInputStream, 4), K2, (int) oo.K(byteArrayInputStream, 4), (int) oo.K(byteArrayInputStream, 4), new int[K2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            df dfVar = dfVarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = dfVar.f;
            int i7 = dfVar.g;
            TreeMap treeMap = dfVar.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) oo.K(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int K3 = (int) oo.K(byteArrayInputStream, 2);
                while (K3 > 0) {
                    oo.K(byteArrayInputStream, 2);
                    int K4 = (int) oo.K(byteArrayInputStream, 1);
                    if (K4 != 6 && K4 != 7) {
                        while (K4 > 0) {
                            oo.K(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int K5 = (int) oo.K(byteArrayInputStream, 1); K5 > 0; K5--) {
                                oo.K(byteArrayInputStream, 2);
                            }
                            K4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    K3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                l8.u("Read too much data during profile line parse");
                return null;
            }
            dfVar.h = H(byteArrayInputStream, dfVar.e);
            BitSet valueOf = BitSet.valueOf(oo.H(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return dfVarArr;
    }

    public static void O(TextView textView, int i2) {
        g8.n(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            of.h(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void P(TextView textView, int i2) {
        g8.n(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void Q(TextView textView, int i2) {
        g8.n(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public static void R(Outline outline, Path path) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            uf.a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                tf.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            tf.a(outline, path);
        }
    }

    public static void S(View view, ls lsVar) {
        ug ugVar = lsVar.g.b;
        if (ugVar == null || !ugVar.a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += ((View) parent).getElevation();
        }
        js jsVar = lsVar.g;
        if (jsVar.l != f2) {
            jsVar.l = f2;
            lsVar.w();
        }
    }

    public static void T(int i2, jc jcVar, tc tcVar, boolean z) {
        float f2 = tcVar.d0;
        ec ecVar = tcVar.I;
        int d2 = ecVar.f.d();
        ec ecVar2 = tcVar.K;
        int d3 = ecVar2.f.d();
        int e2 = ecVar.e() + d2;
        int e3 = d3 - ecVar2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int q = tcVar.q();
        int i3 = (d3 - d2) - q;
        if (d2 > d3) {
            i3 = (d2 - d3) - q;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + d2;
        int i5 = i4 + q;
        if (d2 > d3) {
            i5 = i4 - q;
        }
        tcVar.J(i4, i5);
        x(i2 + 1, jcVar, tcVar, z);
    }

    public static void U(int i2, tc tcVar, jc jcVar, tc tcVar2, boolean z) {
        float f2 = tcVar2.d0;
        ec ecVar = tcVar2.I;
        int e2 = ecVar.e() + ecVar.f.d();
        ec ecVar2 = tcVar2.K;
        int d2 = ecVar2.f.d() - ecVar2.e();
        if (d2 >= e2) {
            int q = tcVar2.q();
            if (tcVar2.g0 != 8) {
                int i3 = tcVar2.r;
                if (i3 == 2) {
                    q = (int) (tcVar2.d0 * 0.5f * (tcVar instanceof uc ? tcVar.q() : tcVar.T.q()));
                } else if (i3 == 0) {
                    q = d2 - e2;
                }
                q = Math.max(tcVar2.u, q);
                int i4 = tcVar2.v;
                if (i4 > 0) {
                    q = Math.min(i4, q);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - q)) + 0.5f));
            tcVar2.J(i5, q + i5);
            x(i2 + 1, jcVar, tcVar2, z);
        }
    }

    public static void V(int i2, jc jcVar, tc tcVar) {
        float f2 = tcVar.e0;
        ec ecVar = tcVar.J;
        int d2 = ecVar.f.d();
        ec ecVar2 = tcVar.L;
        int d3 = ecVar2.f.d();
        int e2 = ecVar.e() + d2;
        int e3 = d3 - ecVar2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int k2 = tcVar.k();
        int i3 = (d3 - d2) - k2;
        if (d2 > d3) {
            i3 = (d2 - d3) - k2;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = d2 + i4;
        int i6 = i5 + k2;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - k2;
        }
        tcVar.K(i5, i6);
        a0(i2 + 1, jcVar, tcVar);
    }

    public static void W(int i2, tc tcVar, jc jcVar, tc tcVar2) {
        float f2 = tcVar2.e0;
        ec ecVar = tcVar2.J;
        int e2 = ecVar.e() + ecVar.f.d();
        ec ecVar2 = tcVar2.L;
        int d2 = ecVar2.f.d() - ecVar2.e();
        if (d2 >= e2) {
            int k2 = tcVar2.k();
            if (tcVar2.g0 != 8) {
                int i3 = tcVar2.s;
                if (i3 == 2) {
                    k2 = (int) (f2 * 0.5f * (tcVar instanceof uc ? tcVar.k() : tcVar.T.k()));
                } else if (i3 == 0) {
                    k2 = d2 - e2;
                }
                k2 = Math.max(tcVar2.x, k2);
                int i4 = tcVar2.y;
                if (i4 > 0) {
                    k2 = Math.min(i4, k2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - k2)) + 0.5f));
            tcVar2.K(i5, k2 + i5);
            a0(i2 + 1, jcVar, tcVar2);
        }
    }

    public static final void X(Object obj) {
        if (obj instanceof c00) {
            throw ((c00) obj).f;
        }
    }

    public static int Y(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean Z(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, df[] dfVarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = m60.p;
        byte[] bArr3 = m60.o;
        byte[] bArr4 = m60.l;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = m60.m;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] i4 = i(dfVarArr, bArr5);
                oo.T(byteArrayOutputStream, dfVarArr.length, 1);
                oo.T(byteArrayOutputStream, i4.length, 4);
                byte[] i5 = oo.i(i4);
                oo.T(byteArrayOutputStream, i5.length, 4);
                byteArrayOutputStream.write(i5);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                oo.T(byteArrayOutputStream, dfVarArr.length, 1);
                for (df dfVar : dfVarArr) {
                    int size = dfVar.i.size() * 4;
                    String p = p(dfVar.a, dfVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    oo.U(byteArrayOutputStream, p.getBytes(charset).length);
                    oo.U(byteArrayOutputStream, dfVar.h.length);
                    oo.T(byteArrayOutputStream, size, 4);
                    oo.T(byteArrayOutputStream, dfVar.c, 4);
                    byteArrayOutputStream.write(p.getBytes(charset));
                    Iterator it = dfVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        oo.U(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        oo.U(byteArrayOutputStream, 0);
                    }
                    for (int i6 : dfVar.h) {
                        oo.U(byteArrayOutputStream, i6);
                    }
                }
                return true;
            }
            byte[] bArr6 = m60.n;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] i7 = i(dfVarArr, bArr6);
                oo.T(byteArrayOutputStream, dfVarArr.length, 1);
                oo.T(byteArrayOutputStream, i7.length, 4);
                byte[] i8 = oo.i(i7);
                oo.T(byteArrayOutputStream, i8.length, 4);
                byteArrayOutputStream.write(i8);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            oo.U(byteArrayOutputStream, dfVarArr.length);
            for (df dfVar2 : dfVarArr) {
                String str = dfVar2.a;
                TreeMap treeMap = dfVar2.i;
                String p2 = p(str, dfVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                oo.U(byteArrayOutputStream, p2.getBytes(charset2).length);
                oo.U(byteArrayOutputStream, treeMap.size());
                oo.U(byteArrayOutputStream, dfVar2.h.length);
                oo.T(byteArrayOutputStream, dfVar2.c, 4);
                byteArrayOutputStream.write(p2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    oo.U(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i9 : dfVar2.h) {
                    oo.U(byteArrayOutputStream, i9);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            oo.U(byteArrayOutputStream2, dfVarArr.length);
            int i10 = 2;
            int i11 = 2;
            for (df dfVar3 : dfVarArr) {
                oo.T(byteArrayOutputStream2, dfVar3.c, 4);
                oo.T(byteArrayOutputStream2, dfVar3.d, 4);
                oo.T(byteArrayOutputStream2, dfVar3.g, 4);
                String p3 = p(dfVar3.a, dfVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = p3.getBytes(charset3).length;
                oo.U(byteArrayOutputStream2, length2);
                i11 = i11 + 14 + length2;
                byteArrayOutputStream2.write(p3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i11 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            }
            ib0 ib0Var = new ib0(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(ib0Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < dfVarArr.length) {
                try {
                    df dfVar4 = dfVarArr[i12];
                    oo.U(byteArrayOutputStream3, i12);
                    oo.U(byteArrayOutputStream3, dfVar4.e);
                    i13 = i13 + 4 + (dfVar4.e * i10);
                    int[] iArr = dfVar4.h;
                    int length3 = iArr.length;
                    int i14 = i3;
                    while (i3 < length3) {
                        int i15 = iArr[i3];
                        oo.U(byteArrayOutputStream3, i15 - i14);
                        i3++;
                        i10 = i10;
                        i14 = i15;
                    }
                    i12++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i16 = i10;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
            }
            ib0 ib0Var2 = new ib0(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(ib0Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i17 = 0;
            for (int i18 = 0; i18 < dfVarArr.length; i18++) {
                try {
                    df dfVar5 = dfVarArr[i18];
                    Iterator it3 = dfVar5.i.entrySet().iterator();
                    int i19 = 0;
                    while (it3.hasNext()) {
                        i19 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        e0(byteArrayOutputStream4, i19, dfVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            f0(byteArrayOutputStream4, dfVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            oo.U(byteArrayOutputStream3, i18);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i20 = i17 + 6;
                            oo.T(byteArrayOutputStream3, length4, 4);
                            oo.U(byteArrayOutputStream3, i19);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i17 = i20 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i17 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
            }
            ib0 ib0Var3 = new ib0(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(ib0Var3);
            long size2 = 12 + (arrayList.size() * 16);
            oo.T(byteArrayOutputStream, arrayList.size(), 4);
            int i21 = 0;
            while (i21 < arrayList.size()) {
                ib0 ib0Var4 = (ib0) arrayList.get(i21);
                int i22 = ib0Var4.a;
                byte[] bArr7 = ib0Var4.b;
                if (i22 != 1) {
                    i2 = i16;
                    if (i22 == i2) {
                        j2 = 1;
                    } else if (i22 == 3) {
                        j2 = 2;
                    } else if (i22 == 4) {
                        j2 = 3;
                    } else {
                        if (i22 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i16;
                    j2 = 0;
                }
                oo.T(byteArrayOutputStream, j2, 4);
                oo.T(byteArrayOutputStream, size2, 4);
                if (ib0Var4.c) {
                    long length5 = bArr7.length;
                    byte[] i23 = oo.i(bArr7);
                    arrayList2.add(i23);
                    oo.T(byteArrayOutputStream, i23.length, 4);
                    oo.T(byteArrayOutputStream, length5, 4);
                    length = i23.length;
                } else {
                    arrayList2.add(bArr7);
                    oo.T(byteArrayOutputStream, bArr7.length, 4);
                    oo.T(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i21++;
                i16 = i2;
            }
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i24));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final nu a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new nu(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static void a0(int i2, jc jcVar, tc tcVar) {
        boolean z;
        ec ecVar;
        ec ecVar2;
        ec ecVar3;
        ec ecVar4;
        if (tcVar.n) {
            return;
        }
        if (!(tcVar instanceof uc) && tcVar.z() && d(tcVar)) {
            uc.V(tcVar, jcVar, new q7());
        }
        ec i3 = tcVar.i(3);
        ec i4 = tcVar.i(5);
        int d2 = i3.d();
        int d3 = i4.d();
        HashSet hashSet = i3.a;
        if (hashSet != null && i3.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ec ecVar5 = (ec) it.next();
                tc tcVar2 = ecVar5.d;
                int i5 = i2 + 1;
                boolean d4 = d(tcVar2);
                ec ecVar6 = tcVar2.J;
                ec ecVar7 = tcVar2.L;
                if (tcVar2.z() && d4) {
                    uc.V(tcVar2, jcVar, new q7());
                }
                boolean z2 = (ecVar5 == ecVar6 && (ecVar4 = ecVar7.f) != null && ecVar4.c) || (ecVar5 == ecVar7 && (ecVar3 = ecVar6.f) != null && ecVar3.c);
                int i6 = tcVar2.p0[1];
                if (i6 != 3 || d4) {
                    if (!tcVar2.z()) {
                        if (ecVar5 == ecVar6 && ecVar7.f == null) {
                            int e2 = ecVar6.e() + d2;
                            tcVar2.K(e2, tcVar2.k() + e2);
                            a0(i5, jcVar, tcVar2);
                        } else if (ecVar5 == ecVar7 && ecVar6.f == null) {
                            int e3 = d2 - ecVar7.e();
                            tcVar2.K(e3 - tcVar2.k(), e3);
                            a0(i5, jcVar, tcVar2);
                        } else if (z2 && !tcVar2.y()) {
                            V(i5, jcVar, tcVar2);
                        }
                    }
                } else if (i6 == 3 && tcVar2.y >= 0 && tcVar2.x >= 0 && (tcVar2.g0 == 8 || (tcVar2.s == 0 && tcVar2.W == 0.0f))) {
                    if (!tcVar2.y() && !tcVar2.F && z2 && !tcVar2.y()) {
                        W(i5, tcVar, jcVar, tcVar2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (tcVar instanceof gm) {
            return;
        }
        HashSet hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ec ecVar8 = (ec) it2.next();
                tc tcVar3 = ecVar8.d;
                int i7 = i2 + 1;
                boolean d5 = d(tcVar3);
                ec ecVar9 = tcVar3.J;
                ec ecVar10 = tcVar3.L;
                if (tcVar3.z() && d5) {
                    uc.V(tcVar3, jcVar, new q7());
                }
                boolean z4 = (ecVar8 == ecVar9 && (ecVar2 = ecVar10.f) != null && ecVar2.c) || (ecVar8 == ecVar10 && (ecVar = ecVar9.f) != null && ecVar.c);
                int i8 = tcVar3.p0[1];
                if (i8 != 3 || d5) {
                    if (!tcVar3.z()) {
                        if (ecVar8 == ecVar9 && ecVar10.f == null) {
                            int e4 = ecVar9.e() + d3;
                            tcVar3.K(e4, tcVar3.k() + e4);
                            a0(i7, jcVar, tcVar3);
                        } else if (ecVar8 == ecVar10 && ecVar9.f == null) {
                            int e5 = d3 - ecVar10.e();
                            tcVar3.K(e5 - tcVar3.k(), e5);
                            a0(i7, jcVar, tcVar3);
                        } else if (z4 && !tcVar3.y()) {
                            V(i7, jcVar, tcVar3);
                        }
                    }
                } else if (i8 == 3 && tcVar3.y >= 0 && tcVar3.x >= 0 && (tcVar3.g0 == 8 || (tcVar3.s == 0 && tcVar3.W == 0.0f))) {
                    if (!tcVar3.y() && !tcVar3.F && z4 && !tcVar3.y()) {
                        W(i7, tcVar, jcVar, tcVar3);
                    }
                }
            }
        }
        ec i9 = tcVar.i(6);
        if (i9.a != null && i9.c) {
            int d6 = i9.d();
            Iterator it3 = i9.a.iterator();
            while (it3.hasNext()) {
                ec ecVar11 = (ec) it3.next();
                tc tcVar4 = ecVar11.d;
                int i10 = i2 + 1;
                boolean d7 = d(tcVar4);
                ec ecVar12 = tcVar4.M;
                if (tcVar4.z() && d7) {
                    uc.V(tcVar4, jcVar, new q7());
                }
                if (tcVar4.p0[z3 ? 1 : 0] != 3 || d7) {
                    if (!tcVar4.z()) {
                        if (ecVar11 == ecVar12) {
                            int e6 = ecVar11.e() + d6;
                            if (tcVar4.E) {
                                int i11 = e6 - tcVar4.a0;
                                int i12 = tcVar4.V + i11;
                                tcVar4.Z = i11;
                                tcVar4.J.l(i11);
                                tcVar4.L.l(i12);
                                ecVar12.l(e6);
                                z = z3 ? 1 : 0;
                                tcVar4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            a0(i10, jcVar, tcVar4);
                            z3 = z;
                        }
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        tcVar.n = z3;
    }

    public static void b(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = qo.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = kw.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static ActionMode.Callback b0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof y40) || callback == null) ? callback : new y40(callback, textView);
    }

    public static void c(StringBuilder sb, Object obj, ol olVar) {
        if (olVar != null) {
            sb.append((CharSequence) olVar.a(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static void c0(ByteArrayOutputStream byteArrayOutputStream, df dfVar) {
        f0(byteArrayOutputStream, dfVar);
        int i2 = dfVar.g;
        int[] iArr = dfVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            oo.U(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dfVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static boolean d(tc tcVar) {
        int[] iArr = tcVar.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        tc tcVar2 = tcVar.T;
        uc ucVar = tcVar2 != null ? (uc) tcVar2 : null;
        if (ucVar != null) {
            int i4 = ucVar.p0[0];
        }
        if (ucVar != null) {
            int i5 = ucVar.p0[1];
        }
        boolean z = i2 == 1 || tcVar.A() || i2 == 2 || (i2 == 3 && tcVar.r == 0 && tcVar.W == 0.0f && tcVar.t(0)) || (i2 == 3 && tcVar.r == 1 && tcVar.u(0, tcVar.q()));
        boolean z2 = i3 == 1 || tcVar.B() || i3 == 2 || (i3 == 3 && tcVar.s == 0 && tcVar.W == 0.0f && tcVar.t(1)) || (i3 == 3 && tcVar.s == 1 && tcVar.u(1, tcVar.k()));
        return (tcVar.W > 0.0f && (z || z2)) || (z && z2);
    }

    public static void d0(ByteArrayOutputStream byteArrayOutputStream, df dfVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        oo.U(byteArrayOutputStream, str.getBytes(charset).length);
        oo.U(byteArrayOutputStream, dfVar.e);
        oo.T(byteArrayOutputStream, dfVar.f, 4);
        oo.T(byteArrayOutputStream, dfVar.c, 4);
        oo.T(byteArrayOutputStream, dfVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void e(String str) {
        if (str.length() <= 0) {
            l8.l("name is empty");
            return;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                l8.e(z60.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                return;
            }
        }
    }

    public static void e0(ByteArrayOutputStream byteArrayOutputStream, int i2, df dfVar) {
        int i3 = dfVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : dfVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void f(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static void f0(ByteArrayOutputStream byteArrayOutputStream, df dfVar) {
        int i2 = 0;
        for (Map.Entry entry : dfVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                oo.U(byteArrayOutputStream, intValue - i2);
                oo.U(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static int g(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, b6.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static void h(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                l8.e(z60.f("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2).concat(z60.n(str2) ? "" : ": ".concat(str)));
                return;
            }
        }
    }

    public static byte[] i(df[] dfVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (df dfVar : dfVarArr) {
            i3 += ((((dfVar.g * 2) + 7) & (-8)) / 8) + (dfVar.e * 2) + p(dfVar.a, dfVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + dfVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, m60.n)) {
            int length = dfVarArr.length;
            while (i2 < length) {
                df dfVar2 = dfVarArr[i2];
                d0(byteArrayOutputStream, dfVar2, p(dfVar2.a, dfVar2.b, bArr));
                c0(byteArrayOutputStream, dfVar2);
                i2++;
            }
        } else {
            for (df dfVar3 : dfVarArr) {
                d0(byteArrayOutputStream, dfVar3, p(dfVar3.a, dfVar3.b, bArr));
            }
            int length2 = dfVarArr.length;
            while (i2 < length2) {
                c0(byteArrayOutputStream, dfVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static m60 j(int i2) {
        return i2 != 0 ? i2 != 1 ? new h00() : new sd() : new h00();
    }

    public static int k(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean l(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = l(file2) && z;
        }
        return z;
    }

    public static boolean m(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = f80.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = e80.d;
            e80 e80Var = (e80) view.getTag(com.ionia.reidopitaco.libya.R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (e80Var == null) {
                e80Var = new e80();
                e80Var.a = null;
                e80Var.b = null;
                e80Var.c = null;
                view.setTag(com.ionia.reidopitaco.libya.R.id.tag_unhandled_key_event_manager, e80Var);
            }
            WeakReference weakReference2 = e80Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                e80Var.c = new WeakReference(keyEvent);
                if (e80Var.b == null) {
                    e80Var.b = new SparseArray();
                }
                SparseArray sparseArray = e80Var.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(com.ionia.reidopitaco.libya.R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    l8.c();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(xo xoVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (xoVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return xoVar.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!h) {
                            try {
                                i = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            h = true;
                        }
                        Method method = i;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (f80.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!j) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        k = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    j = true;
                }
                Field field = k;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (f80.c(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && f80.c(view, keyEvent)) || xoVar.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static View o(View view, int i2) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View findViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static String p(String str, String str2, byte[] bArr) {
        byte[] bArr2 = m60.o;
        byte[] bArr3 = m60.p;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static bx q(String str) {
        if (str.equals("http/1.0")) {
            return bx.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return bx.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return bx.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return bx.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return bx.SPDY_3;
        }
        if (str.equals("quic")) {
            return bx.QUIC;
        }
        l8.y("Unexpected protocol: ".concat(str));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList r(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        uz uzVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        vz vzVar = new vz(resources, theme);
        synchronized (wz.c) {
            try {
                SparseArray sparseArray = (SparseArray) wz.b.get(vzVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (uzVar = (uz) sparseArray.get(i2)) != null) {
                    if (uzVar.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (uzVar.c != 0) {
                            }
                            colorStateList2 = uzVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = wz.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = db.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (wz.c) {
            try {
                WeakHashMap weakHashMap = wz.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(vzVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(vzVar, sparseArray2);
                }
                sparseArray2.append(i2, new uz(colorStateList, vzVar.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList s(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !z.s(drawable)) {
            return null;
        }
        colorStateList = z.f(drawable).getColorStateList();
        return colorStateList;
    }

    public static Drawable t(Context context, int i2) {
        return tz.b().c(context, i2);
    }

    public static k4 u(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        k4 k4Var;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new k4((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                k4Var = k4.b(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                k4Var = null;
            }
            if (k4Var != null) {
                return k4Var;
            }
        }
        return new k4((Shader) null, (ColorStateList) null, 0);
    }

    public static pw v(p5 p5Var) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new pw(of.g(p5Var));
        }
        TextPaint textPaint = new TextPaint(p5Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = p5Var.getBreakStrategy();
        int hyphenationFrequency = p5Var.getHyphenationFrequency();
        if (p5Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (p5Var.getInputType() & 15) != 3) {
                boolean z = p5Var.getLayoutDirection() == 1;
                switch (p5Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(of.a(DecimalFormatSymbols.getInstance(p5Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new pw(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean w(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static void x(int i2, jc jcVar, tc tcVar, boolean z) {
        ec ecVar;
        ec ecVar2;
        boolean z2;
        ec ecVar3;
        ec ecVar4;
        if (tcVar.m) {
            return;
        }
        if (!(tcVar instanceof uc) && tcVar.z() && d(tcVar)) {
            uc.V(tcVar, jcVar, new q7());
        }
        ec i3 = tcVar.i(2);
        ec i4 = tcVar.i(4);
        int d2 = i3.d();
        int d3 = i4.d();
        HashSet hashSet = i3.a;
        if (hashSet != null && i3.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ec ecVar5 = (ec) it.next();
                tc tcVar2 = ecVar5.d;
                int i5 = i2 + 1;
                boolean d4 = d(tcVar2);
                ec ecVar6 = tcVar2.I;
                ec ecVar7 = tcVar2.K;
                if (tcVar2.z() && d4) {
                    z2 = true;
                    uc.V(tcVar2, jcVar, new q7());
                } else {
                    z2 = true;
                }
                boolean z3 = ((ecVar5 == ecVar6 && (ecVar4 = ecVar7.f) != null && ecVar4.c) || (ecVar5 == ecVar7 && (ecVar3 = ecVar6.f) != null && ecVar3.c)) ? z2 : false;
                int i6 = tcVar2.p0[0];
                if (i6 != 3 || d4) {
                    if (!tcVar2.z()) {
                        if (ecVar5 == ecVar6 && ecVar7.f == null) {
                            int e2 = ecVar6.e() + d2;
                            tcVar2.J(e2, tcVar2.q() + e2);
                            x(i5, jcVar, tcVar2, z);
                        } else if (ecVar5 == ecVar7 && ecVar6.f == null) {
                            int e3 = d2 - ecVar7.e();
                            tcVar2.J(e3 - tcVar2.q(), e3);
                            x(i5, jcVar, tcVar2, z);
                        } else if (z3 && !tcVar2.x()) {
                            T(i5, jcVar, tcVar2, z);
                        }
                    }
                } else if (i6 == 3 && tcVar2.v >= 0 && tcVar2.u >= 0 && (tcVar2.g0 == 8 || (tcVar2.r == 0 && tcVar2.W == 0.0f))) {
                    if (!tcVar2.x() && !tcVar2.F && z3 && !tcVar2.x()) {
                        U(i5, tcVar, jcVar, tcVar2, z);
                    }
                }
            }
        }
        if (tcVar instanceof gm) {
            return;
        }
        HashSet hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ec ecVar8 = (ec) it2.next();
                tc tcVar3 = ecVar8.d;
                int i7 = i2 + 1;
                boolean d5 = d(tcVar3);
                ec ecVar9 = tcVar3.I;
                ec ecVar10 = tcVar3.K;
                if (tcVar3.z() && d5) {
                    uc.V(tcVar3, jcVar, new q7());
                }
                boolean z4 = (ecVar8 == ecVar9 && (ecVar2 = ecVar10.f) != null && ecVar2.c) || (ecVar8 == ecVar10 && (ecVar = ecVar9.f) != null && ecVar.c);
                int i8 = tcVar3.p0[0];
                if (i8 != 3 || d5) {
                    if (!tcVar3.z()) {
                        if (ecVar8 == ecVar9 && ecVar10.f == null) {
                            int e4 = ecVar9.e() + d3;
                            tcVar3.J(e4, tcVar3.q() + e4);
                            x(i7, jcVar, tcVar3, z);
                        } else if (ecVar8 == ecVar10 && ecVar9.f == null) {
                            int e5 = d3 - ecVar10.e();
                            tcVar3.J(e5 - tcVar3.q(), e5);
                            x(i7, jcVar, tcVar3, z);
                        } else if (z4 && !tcVar3.x()) {
                            T(i7, jcVar, tcVar3, z);
                        }
                    }
                } else if (i8 == 3 && tcVar3.v >= 0 && tcVar3.u >= 0) {
                    if (tcVar3.g0 == 8 || (tcVar3.r == 0 && tcVar3.W == 0.0f)) {
                        if (!tcVar3.x() && !tcVar3.F && z4 && !tcVar3.x()) {
                            U(i7, tcVar, jcVar, tcVar3, z);
                        }
                    }
                }
            }
        }
        tcVar.m = true;
    }

    public static boolean y(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }

    public static TypedArray z(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public abstract void B(Throwable th);

    public abstract void C(oe oeVar);
}
