package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.cert.Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class oo {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = new int[0];
    public static final Object[] h = new Object[0];
    public static final int[] i = {R.attr.theme, com.ionia.reidopitaco.libya.R.attr.theme};
    public static final int[] j = {com.ionia.reidopitaco.libya.R.attr.materialThemeOverlay};
    public static final iw k = new iw(3);
    public static final iw l = new iw(9);
    public static final iw m = new iw(10);
    public static final iw n = new iw(8);

    public static void A(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static k4 E(String str) {
        int i2;
        String str2;
        boolean l0 = u30.l0(str, "HTTP/1.", false);
        bx bxVar = bx.HTTP_1_0;
        if (l0) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                bxVar = bx.HTTP_1_1;
            }
        } else {
            if (!u30.l0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i2, i3));
            if (str.length() <= i3) {
                str2 = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i2 + 4);
            }
            return new k4(bxVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static qj F(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        int i3;
        int i4;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            O(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gx.b);
        int i5 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gx.c);
                        int i7 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = obtainAttributes2.getInt(i8, 0);
                        int i10 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                        String string7 = obtainAttributes2.getString(i10);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            O(xmlResourceParser);
                        }
                        arrayList.add(new sj(string7, i7, z, string6, i9, resourceId2));
                    } else {
                        O(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new rj((sj[]) arrayList.toArray(new sj[0]));
        }
        List I = I(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gx.d);
                    try {
                        String string8 = obtainAttributes3.getString(i5);
                        String string9 = obtainAttributes3.getString(1);
                        i4 = integer;
                        String string10 = obtainAttributes3.getString(i2);
                        if (string8 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i6) {
                            O(xmlResourceParser);
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i3 = i6;
                            try {
                                jj jjVar = new jj(string, string2, string8, I, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(jjVar);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = obtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = obtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i3 = i6;
                i4 = integer;
                O(xmlResourceParser);
                i6 = i3;
                integer = i4;
                i2 = 2;
                i5 = 0;
            }
        }
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new tj(arrayList2, i11, integer2, string5);
        }
        if (string3 == null) {
            l8.l("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new jj(string, string2, string3, I, null, null));
        if (string4 != null) {
            arrayList2.add(new jj(string, string2, string4, I, null, null));
        }
        return new tj(arrayList2, i11, integer2, string5);
    }

    public static ot G(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 > 100) {
            l8.y("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    duplicate.position((int) (j4 + j2));
                    ot otVar = new ot();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    otVar.d = duplicate;
                    otVar.a = position;
                    int i7 = position - duplicate.getInt(position);
                    otVar.b = i7;
                    otVar.c = ((ByteBuffer) otVar.d).getShort(i7);
                    return otVar;
                }
            }
        }
        l8.y("Cannot read metadata.");
        return null;
    }

    public static byte[] H(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                l8.u(n20.e("Not enough bytes to read: ", i2));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    public static List I(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] J(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long K(InputStream inputStream, int i2) {
        byte[] H = H(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (H[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static void L(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final int M(g10 g10Var, int i2) {
        int i3;
        int[] iArr = g10Var.k;
        int i4 = i2 + 1;
        int length = g10Var.j.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static void N(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static void O(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static void P(String str) {
        ck ckVar = new ck("lateinit property " + str + " has not been initialized");
        L(ckVar, oo.class.getName());
        throw ckVar;
    }

    public static Context Q(int i2, int i3, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j, i2, i3);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z = (context instanceof dd) && ((dd) context).a == i4;
        if (i4 == 0 || z) {
            return context;
        }
        dd ddVar = new dd(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = obtainStyledAttributes2.getResourceId(i5, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                ddVar.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, i);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            ddVar.getTheme().applyStyle(resourceId, true);
        }
        return ddVar;
    }

    public static Context R(Context context, AttributeSet attributeSet, int i2, int i3) {
        return Q(i2, i3, context, attributeSet, new int[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void S(Context context, Executor executor, ww wwVar, boolean z) {
        boolean z2;
        ?? r7;
        df[] dfVarArr;
        df[] dfVarArr2;
        df[] dfVarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? byteArrayOutputStream;
        cf cfVar;
        String str;
        String str2;
        FileInputStream a2;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                wwVar.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        yw.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = vv.e;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            cf cfVar2 = new cf(assets, executor, wwVar, name, file2);
            byte[] bArr3 = cfVar2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        cfVar2.b(4, null);
                    }
                    cfVar2.f = true;
                    try {
                        try {
                            r7 = cfVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            wwVar.c(6, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            dfVarArr2 = cfVar2.g;
                            if (dfVarArr2 != null) {
                            }
                            ww wwVar2 = cfVar2.b;
                            dfVarArr3 = cfVar2.g;
                            byte[] bArr4 = cfVar2.c;
                            boolean z11 = r7;
                            z11 = r7;
                            if (dfVarArr3 != null) {
                            }
                            bArr = cfVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            yw.c(context, (z6 || !z) ? false : z9);
                        } catch (IOException e3) {
                            wwVar.c(7, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            dfVarArr2 = cfVar2.g;
                            if (dfVarArr2 != null) {
                            }
                            ww wwVar22 = cfVar2.b;
                            dfVarArr3 = cfVar2.g;
                            byte[] bArr42 = cfVar2.c;
                            boolean z112 = r7;
                            z112 = r7;
                            if (dfVarArr3 != null) {
                            }
                            bArr = cfVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            yw.c(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e4) {
                                    wwVar.c(8, e4);
                                    try {
                                        r7.close();
                                    } catch (IOException e5) {
                                        wwVar.c(7, e5);
                                    }
                                    dfVarArr = null;
                                    cfVar2.g = dfVarArr;
                                    dfVarArr2 = cfVar2.g;
                                    if (dfVarArr2 != null) {
                                    }
                                    ww wwVar222 = cfVar2.b;
                                    dfVarArr3 = cfVar2.g;
                                    byte[] bArr422 = cfVar2.c;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (dfVarArr3 != null) {
                                    }
                                    bArr = cfVar2.h;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    yw.c(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e6) {
                                wwVar.c(7, e6);
                                r7.close();
                                dfVarArr = null;
                                cfVar2.g = dfVarArr;
                                dfVarArr2 = cfVar2.g;
                                if (dfVarArr2 != null) {
                                }
                                ww wwVar2222 = cfVar2.b;
                                dfVarArr3 = cfVar2.g;
                                byte[] bArr4222 = cfVar2.c;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (dfVarArr3 != null) {
                                }
                                bArr = cfVar2.h;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                yw.c(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, H(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            dfVarArr = vv.M(r7, H(r7, 4), cfVar2.e);
                            try {
                                r7.close();
                            } catch (IOException e7) {
                                wwVar.c(7, e7);
                            }
                            cfVar2.g = dfVarArr;
                        }
                        dfVarArr2 = cfVar2.g;
                        if (dfVarArr2 != null && (r7 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a2 = cfVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e8) {
                                wwVar.c(9, e8);
                                str = r7;
                            } catch (IOException e9) {
                                wwVar.c(7, e9);
                                str = r7;
                            } catch (IllegalStateException e10) {
                                cfVar2.g = null;
                                wwVar.c(8, e10);
                                str = r7;
                            }
                            if (a2 == null) {
                                try {
                                    if (!Arrays.equals(vv.f, H(a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] H = H(a2, 4);
                                    cfVar2.g = vv.J(a2, H, bArr3, dfVarArr2);
                                    a2.close();
                                    cfVar = cfVar2;
                                    r7 = H;
                                    if (cfVar != null) {
                                        cfVar2 = cfVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                    str = str2;
                                }
                                cfVar = null;
                                r7 = str;
                                if (cfVar != null) {
                                }
                            }
                        }
                        ww wwVar22222 = cfVar2.b;
                        dfVarArr3 = cfVar2.g;
                        byte[] bArr42222 = cfVar2.c;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (dfVarArr3 != null && bArr42222 != null) {
                            z7 = cfVar2.f;
                            if (z7) {
                                l8.u("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e11) {
                                wwVar22222.c(7, e11);
                                z8 = z7;
                            } catch (IllegalStateException e12) {
                                wwVar22222.c(8, e12);
                                z8 = z7;
                            }
                            if (vv.Z(byteArrayOutputStream, bArr42222, dfVarArr3)) {
                                cfVar2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                cfVar2.g = null;
                                z112222 = z8;
                            } else {
                                wwVar22222.c(5, null);
                                cfVar2.g = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = cfVar2.h;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!cfVar2.f) {
                                    l8.u("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(cfVar2.d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                cfVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                cfVar2.h = null;
                                                                                cfVar2.g = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        z112222 = true;
                                        cfVar2.b(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        yw.c(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e14) {
                                        e = e14;
                                        z112222 = true;
                                        cfVar2.b(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        yw.c(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    cfVar2.b(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    yw.c(context, (z6 || !z) ? false : z9);
                                } catch (IOException e16) {
                                    e = e16;
                                    cfVar2.b(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    yw.c(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                cfVar2.h = null;
                                cfVar2.g = null;
                            }
                        }
                        if (z4) {
                            z(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            cfVar2.b(4, null);
                        }
                        cfVar2.f = true;
                        r7 = cfVar2.a(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        dfVarArr2 = cfVar2.g;
                        if (dfVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a2 = cfVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a2 == null) {
                            }
                        }
                        ww wwVar222222 = cfVar2.b;
                        dfVarArr3 = cfVar2.g;
                        byte[] bArr422222 = cfVar2.c;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (dfVarArr3 != null) {
                            z7 = cfVar2.f;
                            if (z7) {
                            }
                        }
                        bArr = cfVar2.h;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        cfVar2.b(4, null);
                    }
                }
                yw.c(context, (z6 || !z) ? false : z9);
            }
            cfVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            yw.c(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e17) {
            wwVar.c(7, e17);
            yw.c(context, false);
        }
    }

    public static void T(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void U(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        T(byteArrayOutputStream, i2, 2);
    }

    public static final String a() {
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        format.getClass();
        return format;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static s6 c() {
        s6 s6Var = s6.l;
        s6Var.getClass();
        s6 s6Var2 = s6Var.f;
        if (s6Var2 == null) {
            long nanoTime = System.nanoTime();
            s6.i.await(s6.j, TimeUnit.MILLISECONDS);
            s6 s6Var3 = s6.l;
            s6Var3.getClass();
            if (s6Var3.f != null || System.nanoTime() - nanoTime < s6.k) {
                return null;
            }
            return s6.l;
        }
        long nanoTime2 = s6Var2.g - System.nanoTime();
        if (nanoTime2 > 0) {
            s6.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        s6 s6Var4 = s6.l;
        s6Var4.getClass();
        s6Var4.f = s6Var2.f;
        s6Var2.f = null;
        return s6Var2;
    }

    public static final int d(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int e(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static int h(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static byte[] i(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static float[] j(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ew[] k(String str) {
        int i2;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i5 < str.length()) {
            while (i5 < str.length()) {
                char charAt = str.charAt(i5);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i5++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i4, i5).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i3) == 'z' || trim.charAt(i3) == 'Z') {
                            fArr = new float[i3];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i6 = i3;
                                int i7 = 1;
                                while (i7 < length) {
                                    int i8 = i3;
                                    int i9 = i8;
                                    int i10 = i9;
                                    int i11 = i10;
                                    for (int i12 = i7; i12 < trim.length(); i12++) {
                                        char charAt2 = trim.charAt(i12);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i12 != i7 && i8 == 0) {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                            break;
                                                        }
                                                        i8 = 0;
                                                        break;
                                                    case '.':
                                                        if (i9 == 0) {
                                                            i8 = 0;
                                                            i9 = 1;
                                                            break;
                                                        }
                                                        i8 = 0;
                                                        i10 = 1;
                                                        i11 = 1;
                                                        break;
                                                    default:
                                                        i8 = 0;
                                                        break;
                                                }
                                            } else {
                                                i8 = 1;
                                            }
                                            if (i10 == 0) {
                                                if (i7 < i12) {
                                                    fArr2[i6] = Float.parseFloat(trim.substring(i7, i12));
                                                    i6++;
                                                }
                                                i7 = i11 == 0 ? i12 : i12 + 1;
                                                i3 = 0;
                                            }
                                        }
                                        i8 = 0;
                                        i10 = 1;
                                        if (i10 == 0) {
                                        }
                                    }
                                    if (i7 < i12) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    i3 = 0;
                                }
                                fArr = j(fArr2, i6);
                                i3 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e2);
                            }
                        }
                        arrayList.add(new ew(trim.charAt(i3), fArr));
                    }
                    i4 = i5;
                    i5++;
                    i3 = 0;
                }
                i5++;
            }
            trim = str.substring(i4, i5).trim();
            if (!trim.isEmpty()) {
            }
            i4 = i5;
            i5++;
            i3 = 0;
        }
        if (i5 - i4 != 1 || i4 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new ew(str.charAt(i4), new float[0]));
        }
        return (ew[]) arrayList.toArray(new ew[i2]);
    }

    public static final void l(x00 x00Var) {
        v00 v00Var;
        gp gpVar = x00Var.e().c;
        if (gpVar != gp.g && gpVar != gp.h) {
            l8.l("Failed requirement.");
            return;
        }
        Iterator it = ((q00) x00Var.a().f).iterator();
        while (true) {
            m00 m00Var = (m00) it;
            if (!m00Var.hasNext()) {
                v00Var = null;
                break;
            }
            Map.Entry entry = (Map.Entry) m00Var.next();
            entry.getClass();
            String str = (String) entry.getKey();
            v00Var = (v00) entry.getValue();
            if (b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (v00Var == null) {
            s00 s00Var = new s00(x00Var.a(), (t80) x00Var);
            x00Var.a().e("androidx.lifecycle.internal.SavedStateHandlesProvider", s00Var);
            x00Var.e().a(new SavedStateHandleAttacher(s00Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static km m(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = uh.f;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            l8.u("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            l8.y("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        da m2 = da.b.m(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            l8.u("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            l8.y("tlsVersion == NONE");
            return null;
        }
        i50 v = m60.v(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = z60.i(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = z60.i(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new km(v, m2, list2, new jm(0, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new km(v, m2, list2, new jm(0, list));
    }

    public static ColorStateList n(Context context, y5 y5Var, int i2) {
        int resourceId;
        ColorStateList r;
        TypedArray typedArray = (TypedArray) y5Var.a;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (r = vv.r(context, resourceId)) == null) ? y5Var.e(i2) : r;
    }

    public static ColorStateList o(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList r;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (r = vv.r(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : r;
    }

    public static Drawable p(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable t;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (t = vv.t(context, resourceId)) == null) ? typedArray.getDrawable(i2) : t;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class q(fa faVar) {
        faVar.getClass();
        if (t00.class.isPrimitive()) {
            String name = t00.class.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return t00.class;
    }

    public static final int r(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                l8.l("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g00 s(Display display, int i2) {
        RoundedCorner roundedCorner;
        int position;
        int i3;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i3 = 1;
            if (position != 1) {
                i3 = 2;
                if (position != 2) {
                    i3 = 3;
                    if (position != 3) {
                        l8.l(n20.e("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new g00(i3, radius, center);
    }

    public static final t00 t(t80 t80Var) {
        ArrayList arrayList = new ArrayList();
        hz.a.getClass();
        arrayList.add(new q80());
        q80[] q80VarArr = (q80[]) arrayList.toArray(new q80[0]);
        return (t00) new y5(t80Var.d(), new j0(22, (q80[]) Arrays.copyOf(q80VarArr, q80VarArr.length)), t80Var instanceof lm ? ((lm) t80Var).c() : pd.b).d("androidx.lifecycle.internal.SavedStateHandlesVM", t00.class);
    }

    public static int u(Context context, int i2) {
        if (i2 == 0) {
            return 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, jx.y);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(4, typedValue);
        if (!value) {
            value = obtainStyledAttributes.getValue(2, typedValue);
        }
        obtainStyledAttributes.recycle();
        if (!value) {
            return 0;
        }
        int complexUnit = typedValue.getComplexUnit();
        int i3 = typedValue.data;
        return complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i3) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i3, context.getResources().getDisplayMetrics());
    }

    public static boolean v(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static int w(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        l8.y(n20.d(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static List x(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static Typeface y(Configuration configuration, Typeface typeface) {
        int i2;
        int i3;
        int weight;
        int i4;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == Integer.MAX_VALUE) {
            return null;
        }
        i3 = configuration.fontWeightAdjustment;
        if (i3 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i4 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, m60.m(i4 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static void z(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public abstract void B(int i2);

    public abstract void C(Typeface typeface);

    public abstract void D(Typeface typeface, boolean z);

    public void f(int i2) {
        new Handler(Looper.getMainLooper()).post(new lr(i2, 1, this));
    }

    public abstract List g(List list, String str);
}
