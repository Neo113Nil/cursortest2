package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class g8 {
    public static Method f;
    public static boolean g;
    public static long i;
    public static Method j;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Object[] b = new Object[0];
    public static final Object c = new Object();
    public static final boolean[] d = new boolean[3];
    public static final Object e = new Object();
    public static final ca h = new ca(4);

    public static int A(Context context, int i2, int i3) {
        TypedValue R = m60.R(context.getTheme(), i2);
        Integer valueOf = R != null ? Integer.valueOf(c0(context, R)) : null;
        return valueOf != null ? valueOf.intValue() : i3;
    }

    public static Intent H(b3 b3Var) {
        Intent parentActivityIntent = b3Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String J = J(b3Var, b3Var.getComponentName());
            if (J == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(b3Var, J);
            try {
                return J(b3Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + J + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent I(b3 b3Var, ComponentName componentName) {
        String J = J(b3Var, componentName);
        if (J == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), J);
        return J(b3Var, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String J(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static File M(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static ArrayList N(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean O(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i2 != 130) {
                l8.l("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = eb.a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        if (dArr.length != 3) {
            l8.l("outXyz must have a length of 3.");
            return false;
        }
        double d2 = red / 255.0d;
        double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = green / 255.0d;
        double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = blue / 255.0d;
        double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d5;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d5 / 100.0d > 0.5d;
    }

    public static boolean Q(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean R() {
        if (Build.VERSION.SDK_INT >= 29) {
            return t50.a();
        }
        try {
            if (j == null) {
                i = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                j = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) j.invoke(null, Long.valueOf(i))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static int V(int i2, int i3, float f2) {
        return eb.b(eb.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static int W(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                l8.l("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int X(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        l8.l("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static MappedByteBuffer Y(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void Z(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final void b(k40 k40Var, l40 l40Var, String str) {
        m40 m40Var = m40.h;
        m40.i.fine(l40Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + k40Var.a);
    }

    public static final String c(Object[] objArr, int i2, int i3, m mVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == mVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static int c0(Context context, TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValue.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r9 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = W(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        defpackage.l8.l("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(int i2, Rect rect, Rect rect2, Rect rect3) {
        boolean e2 = e(i2, rect, rect2);
        if (!e(i2, rect, rect3) && e2) {
            if (i2 != 17) {
                if (i2 != 33) {
                    if (i2 != 66) {
                        if (i2 != 130) {
                            l8.l("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        l8.l("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
    }

    public static void f(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void f0(o4 o4Var, float f2) {
        float f3;
        float f4;
        e00 e00Var = (e00) o4Var.g;
        CardView cardView = (CardView) o4Var.h;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != e00Var.e || e00Var.f != useCompatPadding || e00Var.g != preventCornerOverlap) {
            e00Var.e = f2;
            e00Var.f = useCompatPadding;
            e00Var.g = preventCornerOverlap;
            e00Var.b(null);
            e00Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            o4Var.N(0, 0, 0, 0);
            return;
        }
        e00 e00Var2 = (e00) o4Var.g;
        float f5 = e00Var2.e;
        float f6 = e00Var2.a;
        if (cardView.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - f00.a) * f6) + f5);
        } else {
            int i2 = f00.b;
            f3 = f5;
        }
        int ceil = (int) Math.ceil(f3);
        if (cardView.getPreventCornerOverlap()) {
            f4 = (float) (((1.0d - f00.a) * f6) + (f5 * 1.5f));
        } else {
            f4 = f5 * 1.5f;
        }
        int ceil2 = (int) Math.ceil(f4);
        o4Var.N(ceil, ceil2, ceil, ceil2);
    }

    public static void g(long j2, m8 m8Var, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            l8.l("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((r8) arrayList4.get(i9)).a() < i8) {
                l8.l("Failed requirement.");
                return;
            }
        }
        r8 r8Var = (r8) arrayList.get(i3);
        r8 r8Var2 = (r8) arrayList4.get(i4 - 1);
        if (i8 == r8Var.a()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            r8 r8Var3 = (r8) arrayList4.get(i10);
            i5 = i10;
            i6 = intValue;
            r8Var = r8Var3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (r8Var.d(i8) == r8Var2.d(i8)) {
            int min = Math.min(r8Var.a(), r8Var2.a());
            int i11 = 0;
            for (int i12 = i8; i12 < min && r8Var.d(i12) == r8Var2.d(i12); i12++) {
                i11++;
            }
            long j4 = (m8Var.g / 4) + j2 + 2 + i11 + 1;
            m8Var.y(-i11);
            m8Var.y(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                m8Var.y(r8Var.d(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((r8) arrayList4.get(i5)).a()) {
                    m8Var.y(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    l8.u("Check failed.");
                    return;
                }
            }
            m8 m8Var2 = new m8();
            m8Var.y(((int) ((m8Var2.g / 4) + j4)) * (-1));
            g(j4, m8Var2, i13, arrayList4, i5, i4, arrayList5);
            m8Var.v(m8Var2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((r8) arrayList4.get(i15 - 1)).d(i8) != ((r8) arrayList4.get(i15)).d(i8)) {
                i14++;
            }
        }
        long j5 = (m8Var.g / 4) + j2 + 2 + (i14 * 2);
        m8Var.y(i14);
        m8Var.y(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int d2 = ((r8) arrayList4.get(i16)).d(i8);
            if (i16 == i5 || d2 != ((r8) arrayList4.get(i16 - 1)).d(i8)) {
                m8Var.y(d2 & 255);
            }
        }
        m8 m8Var3 = new m8();
        int i17 = i5;
        while (i17 < i4) {
            byte d3 = ((r8) arrayList4.get(i17)).d(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (d3 != ((r8) arrayList4.get(i19)).d(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((r8) arrayList4.get(i17)).a()) {
                m8Var.y(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
            } else {
                m8Var.y(((int) ((m8Var3.g / 4) + j5)) * (-1));
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
                g(j3, m8Var3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j5 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        m8Var.v(m8Var3);
    }

    public static final Object[] h0(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr[i2] = it.next();
                    if (i3 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArr, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return b;
    }

    public static final Object[] i0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final String j0(String str) {
        str.getClass();
        int i2 = -1;
        int i3 = 0;
        if (!m30.n0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = lowerCase.charAt(i4);
                    if (oo.h(charAt, 31) <= 0 || oo.h(charAt, 127) >= 0 || m30.q0(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress u = (u30.l0(str, "[", false) && str.endsWith("]")) ? u(str, 1, str.length() - 1) : u(str, 0, str.length());
        if (u == null) {
            return null;
        }
        byte[] address = u.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return u.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i2 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        m8 m8Var = new m8();
        while (i3 < address.length) {
            if (i3 == i2) {
                m8Var.w(58);
                i3 += i6;
                if (i3 == 16) {
                    m8Var.w(58);
                }
            } else {
                if (i3 > 0) {
                    m8Var.w(58);
                }
                byte b2 = address[i3];
                byte[] bArr = z60.a;
                m8Var.x(((b2 & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return m8Var.r(m8Var.g, r9.a);
    }

    public static boolean l0(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static void m(String str, boolean z) {
        if (z) {
            return;
        }
        l8.l(str);
    }

    public static void n(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void o(uc ucVar, vp vpVar, tc tcVar) {
        tcVar.o = -1;
        ec ecVar = tcVar.M;
        int[] iArr = tcVar.p0;
        ec ecVar2 = tcVar.L;
        ec ecVar3 = tcVar.J;
        ec ecVar4 = tcVar.K;
        ec ecVar5 = tcVar.I;
        tcVar.p = -1;
        int[] iArr2 = ucVar.p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = ecVar5.g;
            int q = ucVar.q() - ecVar4.g;
            ecVar5.i = vpVar.k(ecVar5);
            ecVar4.i = vpVar.k(ecVar4);
            vpVar.d(ecVar5.i, i2);
            vpVar.d(ecVar4.i, q);
            tcVar.o = 2;
            tcVar.Y = i2;
            int i3 = q - i2;
            tcVar.U = i3;
            int i4 = tcVar.b0;
            if (i3 < i4) {
                tcVar.U = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = ecVar3.g;
        int k = ucVar.k() - ecVar2.g;
        ecVar3.i = vpVar.k(ecVar3);
        ecVar2.i = vpVar.k(ecVar2);
        vpVar.d(ecVar3.i, i5);
        vpVar.d(ecVar2.i, k);
        if (tcVar.a0 > 0 || tcVar.g0 == 8) {
            o20 k2 = vpVar.k(ecVar);
            ecVar.i = k2;
            vpVar.d(k2, tcVar.a0 + i5);
        }
        tcVar.p = 2;
        tcVar.Z = i5;
        int i6 = k - i5;
        tcVar.V = i6;
        int i7 = tcVar.c0;
        if (i6 < i7) {
            tcVar.V = i7;
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void q(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new mo(2, 36, 1));
        }
    }

    public static final void r(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }

    public static boolean s(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lj t(Context context) {
        ProviderInfo providerInfo;
        jj jjVar;
        ApplicationInfo applicationInfo;
        int i2 = 16;
        tg beVar = Build.VERSION.SDK_INT >= 28 ? new be(i2) : new tg(i2);
        PackageManager packageManager = context.getPackageManager();
        p(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] n = beVar.n(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : n) {
                    arrayList.add(signature.toByteArray());
                }
                jjVar = new jj(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (jjVar != null) {
                return null;
            }
            return new lj(new kj(context, jjVar));
        }
        jjVar = null;
        if (jjVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress u(String str, int i2, int i3) {
        int i4;
        byte[] bArr = new byte[16];
        int i5 = i2;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i3 && u30.k0(str, "::", i5, false)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i3) {
                    break;
                }
                i8 = i9;
                int i10 = 0;
                i5 = i8;
                while (i5 < i3) {
                }
                i4 = i5 - i8;
                return i4 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (u30.k0(str, ":", i5, false)) {
                    i5++;
                } else {
                    if (!u30.k0(str, ".", i5, false)) {
                        return null;
                    }
                    int i11 = i6 - 2;
                    int i12 = i11;
                    while (i8 < i3) {
                        if (i12 == 16) {
                            return null;
                        }
                        if (i12 != i11) {
                            if (str.charAt(i8) != '.') {
                                return null;
                            }
                            i8++;
                        }
                        int i13 = 0;
                        int i14 = i8;
                        while (i14 < i3) {
                            char charAt = str.charAt(i14);
                            if (oo.h(charAt, 48) < 0 || oo.h(charAt, 57) > 0) {
                                break;
                            }
                            if ((i13 == 0 && i8 != i14) || ((i13 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i14++;
                        }
                        if (i14 - i8 == 0) {
                            return null;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                        i8 = i14;
                    }
                    if (i12 != i6 + 2) {
                        return null;
                    }
                    i6 += 2;
                }
            }
            i8 = i5;
            int i102 = 0;
            i5 = i8;
            while (i5 < i3) {
                int o = z60.o(str.charAt(i5));
                if (o == -1) {
                    break;
                }
                i102 = (i102 << 4) + o;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 == 0 && i4 <= 4) {
                int i15 = i6 + 1;
                bArr[i6] = (byte) (255 & (i102 >>> 8));
                i6 += 2;
                bArr[i15] = (byte) (i102 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i16 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final boolean v(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final boolean w(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static v90 x(tc tcVar, int i2, ArrayList arrayList, v90 v90Var) {
        int i3;
        int i4 = i2 == 0 ? tcVar.n0 : tcVar.o0;
        if (i4 != -1 && (v90Var == null || i4 != v90Var.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                v90 v90Var2 = (v90) arrayList.get(i5);
                if (v90Var2.b == i4) {
                    if (v90Var != null) {
                        v90Var.c(i2, v90Var2);
                        arrayList.remove(v90Var);
                    }
                    v90Var = v90Var2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return v90Var;
        }
        if (v90Var == null) {
            if (tcVar instanceof pm) {
                pm pmVar = (pm) tcVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= pmVar.r0) {
                        i3 = -1;
                        break;
                    }
                    tc tcVar2 = pmVar.q0[i6];
                    if ((i2 == 0 && (i3 = tcVar2.n0) != -1) || (i2 == 1 && (i3 = tcVar2.o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        v90 v90Var3 = (v90) arrayList.get(i7);
                        if (v90Var3.b == i3) {
                            v90Var = v90Var3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (v90Var == null) {
                v90Var = new v90();
                v90Var.a = new ArrayList();
                v90Var.d = null;
                v90Var.e = -1;
                int i8 = v90.f;
                v90.f = i8 + 1;
                v90Var.b = i8;
                v90Var.c = i2;
            }
            arrayList.add(v90Var);
        }
        ArrayList arrayList2 = v90Var.a;
        if (arrayList2.contains(tcVar)) {
            return v90Var;
        }
        arrayList2.add(tcVar);
        if (tcVar instanceof gm) {
            gm gmVar = (gm) tcVar;
            gmVar.t0.c(gmVar.u0 == 0 ? 1 : 0, v90Var, arrayList);
        }
        int i9 = v90Var.b;
        if (i2 == 0) {
            tcVar.n0 = i9;
            tcVar.I.c(i2, v90Var, arrayList);
            tcVar.K.c(i2, v90Var, arrayList);
        } else {
            tcVar.o0 = i9;
            tcVar.J.c(i2, v90Var, arrayList);
            tcVar.M.c(i2, v90Var, arrayList);
            tcVar.L.c(i2, v90Var, arrayList);
        }
        tcVar.P.c(i2, v90Var, arrayList);
        return v90Var;
    }

    public static final String y(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static os z(String str) {
        str.getClass();
        Matcher matcher = os.c.matcher(str);
        if (!matcher.lookingAt()) {
            l8.j(str, "No subtype found for: \"");
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        group.toLowerCase(locale).getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        group2.toLowerCase(locale).getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = os.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (u30.l0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new os(str, (String[]) arrayList.toArray(new String[0]));
    }

    public abstract int B();

    public abstract InputFilter[] C(InputFilter[] inputFilterArr);

    public abstract int D();

    public abstract int E();

    public abstract int F();

    public abstract int G(View view);

    public abstract int K(CoordinatorLayout coordinatorLayout);

    public abstract int L();

    public abstract boolean S(float f2);

    public abstract boolean T(View view);

    public abstract boolean U(float f2, float f3);

    public abstract void a0(t tVar, t tVar2);

    public abstract void b0(t tVar, Thread thread);

    public abstract void d0(boolean z);

    public abstract void e0(boolean z);

    public abstract boolean g0(View view, float f2);

    public abstract int h(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float i(int i2);

    public abstract boolean j(u uVar, q qVar);

    public abstract boolean k(u uVar, Object obj, Object obj2);

    public abstract void k0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract boolean l(u uVar, t tVar, t tVar2);
}
