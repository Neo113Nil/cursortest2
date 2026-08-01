package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class x40 {
    public static final kj[] a = new kj[0];
    public static final Object[] b = new Object[0];
    public static final Class[] c = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final y01 d = new y01(0.31006f, 0.31616f);
    public static final y01 e = new y01(0.34567f, 0.3585f);
    public static final y01 f = new y01(0.32168f, 0.33767f);
    public static final y01 g = new y01(0.31271f, 0.32902f);
    public static final float[] h = {0.964212f, 1.0f, 0.825188f};
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final pg0 j = new pg0(7);
    public static final pg0 k = new pg0(8);
    public static final pg0 l = new pg0(9);
    public static final Object m = new Object();

    public static final boolean A(long j2, long j3) {
        return j2 == j3;
    }

    public static final View B(View view, mu muVar, View view2) {
        View B;
        if (((Boolean) muVar.c(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != view2 && (B = B(childAt, muVar, view2)) != null) {
                return B;
            }
        }
        return null;
    }

    public static final String[] C(hj hjVar) {
        hjVar.getClass();
        return (String[]) ((g4) hjVar).b.toArray(new String[0]);
    }

    public static final a60 D(rj rjVar) {
        a60 a60Var = (a60) rjVar.k(b2.D);
        if (a60Var != null) {
            return a60Var;
        }
        g8.s("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final fn0 E(r01 r01Var) {
        p01 i2 = pg0.i(r01Var, new ll(2), 4);
        return (fn0) ((k2) i2.e).h(hj0.a(fn0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final boolean F(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static final boolean G(bk bkVar) {
        zz zzVar = (zz) bkVar.f().k(b2.C);
        if (zzVar != null) {
            return zzVar.b();
        }
        return true;
    }

    public static u10 H(w10 w10Var, bu buVar) {
        b2 b2Var = b2.N;
        int ordinal = w10Var.ordinal();
        if (ordinal == 0) {
            return new lu0(buVar);
        }
        if (ordinal == 1) {
            um0 um0Var = new um0();
            um0Var.d = buVar;
            um0Var.e = b2Var;
            return um0Var;
        }
        if (ordinal != 2) {
            g8.c();
            return null;
        }
        qy0 qy0Var = new qy0();
        qy0Var.d = buVar;
        qy0Var.e = b2Var;
        return qy0Var;
    }

    public static lu0 I(bu buVar) {
        buVar.getClass();
        return new lu0(buVar);
    }

    public static int J(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final void K(float[] fArr, float[] fArr2) {
        float y = y(fArr2, 0, fArr, 0);
        float y2 = y(fArr2, 0, fArr, 1);
        float y3 = y(fArr2, 0, fArr, 2);
        float y4 = y(fArr2, 0, fArr, 3);
        float y5 = y(fArr2, 1, fArr, 0);
        float y6 = y(fArr2, 1, fArr, 1);
        float y7 = y(fArr2, 1, fArr, 2);
        float y8 = y(fArr2, 1, fArr, 3);
        float y9 = y(fArr2, 2, fArr, 0);
        float y10 = y(fArr2, 2, fArr, 1);
        float y11 = y(fArr2, 2, fArr, 2);
        float y12 = y(fArr2, 2, fArr, 3);
        float y13 = y(fArr2, 3, fArr, 0);
        float y14 = y(fArr2, 3, fArr, 1);
        float y15 = y(fArr2, 3, fArr, 2);
        float y16 = y(fArr2, 3, fArr, 3);
        fArr[0] = y;
        fArr[1] = y2;
        fArr[2] = y3;
        fArr[3] = y4;
        fArr[4] = y5;
        fArr[5] = y6;
        fArr[6] = y7;
        fArr[7] = y8;
        fArr[8] = y9;
        fArr[9] = y10;
        fArr[10] = y11;
        fArr[11] = y12;
        fArr[12] = y13;
        fArr[13] = y14;
        fArr[14] = y15;
        fArr[15] = y16;
    }

    public static byte[] L(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                throw new IllegalStateException("Not enough bytes to read: " + i2);
            }
            i3 += read;
        }
        return bArr;
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
    public static byte[] M(FileInputStream fileInputStream, int i2, int i3) {
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

    public static long N(InputStream inputStream, int i2) {
        byte[] L = L(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (L[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static final BlendMode O(int i2) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i2 == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i2 == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i2 == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i2 == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i2 == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i2 == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i2 == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i2 == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i2 == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i2 == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i2 == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i2 == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i2 == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i2 == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i2 == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i2 == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i2 == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i2 == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i2 == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i2 == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i2 == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i2 == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i2 == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i2 == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i2 == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i2 == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i2 == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i2 == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i2 == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Object[] P(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
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
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] Q(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
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

    public static Map R(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return xp.d;
        }
        int i2 = 0;
        if (size == 1) {
            pd0 pd0Var = (pd0) arrayList.get(0);
            pd0Var.getClass();
            Map singletonMap = Collections.singletonMap(pd0Var.d, pd0Var.e);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(J(arrayList.size()));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            pd0 pd0Var2 = (pd0) obj;
            linkedHashMap.put(pd0Var2.d, pd0Var2.e);
        }
        return linkedHashMap;
    }

    public static Map S(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return xp.d;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static final PorterDuff.Mode T(int i2) {
        return i2 == 0 ? PorterDuff.Mode.CLEAR : i2 == 1 ? PorterDuff.Mode.SRC : i2 == 2 ? PorterDuff.Mode.DST : i2 == 3 ? PorterDuff.Mode.SRC_OVER : i2 == 4 ? PorterDuff.Mode.DST_OVER : i2 == 5 ? PorterDuff.Mode.SRC_IN : i2 == 6 ? PorterDuff.Mode.DST_IN : i2 == 7 ? PorterDuff.Mode.SRC_OUT : i2 == 8 ? PorterDuff.Mode.DST_OUT : i2 == 9 ? PorterDuff.Mode.SRC_ATOP : i2 == 10 ? PorterDuff.Mode.DST_ATOP : i2 == 11 ? PorterDuff.Mode.XOR : i2 == 12 ? PorterDuff.Mode.ADD : i2 == 14 ? PorterDuff.Mode.SCREEN : i2 == 15 ? PorterDuff.Mode.OVERLAY : i2 == 16 ? PorterDuff.Mode.DARKEN : i2 == 17 ? PorterDuff.Mode.LIGHTEN : i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String U(long j2) {
        return A(j2, 12884901888L) ? "Rgb" : A(j2, 12884901889L) ? "Xyz" : A(j2, 12884901890L) ? "Lab" : A(j2, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static final String V(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f3 = f2 * pow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / pow;
        return max > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final boolean W(Throwable th, bu buVar) {
        Collection asList;
        Object invoke;
        th.getClass();
        Integer num = yz.a;
        cm cmVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        } else {
            Method method = hg0.b;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = wp.d;
            } else {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            }
        }
        boolean z = false;
        if (!asList.isEmpty()) {
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof cm) {
                    return false;
                }
            }
        }
        try {
            List list = (List) buVar.a();
            boolean isEmpty = list.isEmpty();
            z = !isEmpty;
            if (!isEmpty) {
                cmVar = new cm(list);
            }
        } catch (Throwable th2) {
            cmVar = th2;
        }
        if (cmVar != null) {
            mz.r(th, cmVar);
        }
        return z;
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        X(byteArrayOutputStream, i2, 2);
    }

    public static final void a(cx0 cx0Var, u50 u50Var, mu muVar, o9 o9Var, mu muVar2, eg egVar, ih ihVar, int i2) {
        int i3;
        bh bhVar;
        mu muVar3;
        p6 p6Var;
        gs0 gs0Var;
        qh qhVar;
        p6 p6Var2;
        mu muVar4 = muVar;
        qh qhVar2 = (qh) ihVar;
        qhVar2.W(-114689412);
        if ((i2 & 6) == 0) {
            i3 = (qhVar2.f(cx0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qhVar2.f(u50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qhVar2.h(muVar4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qhVar2.f(o9Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qhVar2.h(muVar2) ? 16384 : 8192;
        }
        eg egVar2 = egVar;
        if ((196608 & i2) == 0) {
            i3 |= qhVar2.h(egVar2) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && qhVar2.z()) {
            qhVar2.Q();
            muVar3 = muVar4;
            qhVar = qhVar2;
        } else {
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object K = qhVar2.K();
            Object obj = hh.a;
            if (z || K == obj) {
                K = new p6(cx0Var, o9Var);
                qhVar2.e0(K);
            }
            p6 p6Var3 = (p6) K;
            boolean z2 = i4 == 4;
            Object K2 = qhVar2.K();
            if (z2 || K2 == obj) {
                Object[] objArr = {cx0Var.a.b()};
                gs0 gs0Var2 = new gs0();
                gs0Var2.addAll(p8.d0(objArr));
                qhVar2.e0(gs0Var2);
                K2 = gs0Var2;
            }
            gs0 gs0Var3 = (gs0) K2;
            boolean z3 = i4 == 4;
            Object K3 = qhVar2.K();
            if (z3 || K3 == obj) {
                long[] jArr = vn0.a;
                K3 = new a70();
                qhVar2.e0(K3);
            }
            a70 a70Var = (a70) K3;
            bh bhVar2 = cx0Var.a;
            ce0 ce0Var = cx0Var.d;
            if (!gs0Var3.contains(bhVar2.b())) {
                gs0Var3.clear();
                gs0Var3.add(bhVar2.b());
            }
            if (nz.l(bhVar2.b(), ce0Var.getValue())) {
                if (gs0Var3.size() != 1 || !nz.l(gs0Var3.get(0), bhVar2.b())) {
                    gs0Var3.clear();
                    gs0Var3.add(bhVar2.b());
                }
                if (a70Var.e != 1 || a70Var.c(bhVar2.b())) {
                    a70Var.a();
                }
                p6Var3.b = o9Var;
            }
            if (nz.l(bhVar2.b(), ce0Var.getValue()) || gs0Var3.contains(ce0Var.getValue())) {
                bhVar = bhVar2;
            } else {
                ListIterator listIterator = gs0Var3.listIterator();
                int i5 = 0;
                while (true) {
                    iw iwVar = (iw) listIterator;
                    bhVar = bhVar2;
                    if (!iwVar.hasNext()) {
                        i5 = -1;
                        break;
                    } else {
                        if (nz.l(muVar2.c(iwVar.next()), muVar2.c(ce0Var.getValue()))) {
                            break;
                        }
                        i5++;
                        bhVar2 = bhVar;
                    }
                }
                if (i5 == -1) {
                    gs0Var3.add(ce0Var.getValue());
                } else {
                    gs0Var3.set(i5, ce0Var.getValue());
                }
            }
            if (a70Var.c(ce0Var.getValue()) && a70Var.c(bhVar.b())) {
                qhVar2.V(915535767);
                qhVar2.q(false);
                muVar3 = muVar4;
                p6Var = p6Var3;
            } else {
                qhVar2.V(912931457);
                a70Var.a();
                int size = gs0Var3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = gs0Var3.get(i6);
                    a70Var.m(obj2, a50.E(885640742, new f6(cx0Var, obj2, muVar4, p6Var3, gs0Var3, egVar2), qhVar2));
                    i6++;
                    muVar4 = muVar4;
                    egVar2 = egVar;
                }
                muVar3 = muVar4;
                p6Var = p6Var3;
                qhVar2.q(false);
            }
            boolean f2 = qhVar2.f(cx0Var.f()) | qhVar2.f(p6Var);
            Object K4 = qhVar2.K();
            if (f2 || K4 == obj) {
                K4 = (fj) muVar3.c(p6Var);
                qhVar2.e0(K4);
            }
            fj fjVar = (fj) K4;
            cx0 cx0Var2 = p6Var.a;
            boolean f3 = qhVar2.f(p6Var);
            Object K5 = qhVar2.K();
            if (f3 || K5 == obj) {
                K5 = ud0.o(Boolean.FALSE);
                qhVar2.e0(K5);
            }
            f70 f70Var = (f70) K5;
            f70 p = ud0.p(fjVar.d, qhVar2);
            if (nz.l(cx0Var2.a.b(), cx0Var2.d.getValue())) {
                f70Var.setValue(Boolean.FALSE);
            } else if (p.getValue() != null) {
                f70Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) f70Var.getValue()).booleanValue();
            u50 u50Var2 = r50.a;
            if (booleanValue) {
                qhVar2.V(249037309);
                p6 p6Var4 = p6Var;
                gs0Var = gs0Var3;
                qhVar = qhVar2;
                p6Var2 = p6Var4;
                xw0 a2 = ex0.a(p6Var4.a, dz0.h, null, qhVar, 0, 2);
                boolean f4 = qhVar.f(a2);
                Object K6 = qhVar.K();
                if (f4 || K6 == obj) {
                    K6 = nz.r(u50Var2).c(new o6(p6Var2, a2, p));
                    qhVar.e0(K6);
                }
                u50Var2 = (u50) K6;
                qhVar.q(false);
            } else {
                gs0Var = gs0Var3;
                qhVar = qhVar2;
                p6Var2 = p6Var;
                qhVar.V(249353726);
                qhVar.q(false);
            }
            u50 c2 = u50Var.c(u50Var2);
            Object K7 = qhVar.K();
            if (K7 == obj) {
                K7 = new j6(p6Var2);
                qhVar.e0(K7);
            }
            j6 j6Var = (j6) K7;
            int A = px0.A(qhVar);
            gf0 l2 = qhVar.l();
            u50 D = nk.D(qhVar, c2);
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, j6Var);
            ld0.r(qhVar, dh.d, l2);
            h6 h6Var = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            ld0.r(qhVar, dh.c, D);
            qhVar.V(-1491001814);
            int size2 = gs0Var.size();
            int i7 = 0;
            while (i7 < size2) {
                gs0 gs0Var4 = gs0Var;
                Object obj3 = gs0Var4.get(i7);
                qhVar.R(1908315325, 0, muVar2.c(obj3), null);
                qu quVar = (qu) a70Var.g(obj3);
                if (quVar == null) {
                    qhVar.V(-971711888);
                } else {
                    qhVar.V(1908317105);
                    quVar.invoke(qhVar, 0);
                }
                qhVar.q(false);
                qhVar.q(false);
                i7++;
                gs0Var = gs0Var4;
            }
            qhVar.q(false);
            qhVar.q(true);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new g6(cx0Var, u50Var, muVar3, o9Var, muVar2, egVar, i2);
        }
    }

    public static eb b(int i2, cb cbVar, int i3) {
        int i4 = i3 & 2;
        cb cbVar2 = cb.d;
        if (i4 != 0) {
            cbVar = cbVar2;
        }
        if (i2 == -2) {
            if (cbVar != cbVar2) {
                return new oi(1, cbVar);
            }
            tc.a.getClass();
            return new eb(sc.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? cbVar == cbVar2 ? new eb(i2) : new oi(i2, cbVar) : new eb(Integer.MAX_VALUE) : cbVar == cbVar2 ? new eb(0) : new oi(1, cbVar);
        }
        if (cbVar == cbVar2) {
            return new oi(1, cb.e);
        }
        g8.r("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final g4 c(String str) {
        Set singleton = Collections.singleton(str);
        singleton.getClass();
        return new g4(singleton);
    }

    public static final jj d(rj rjVar) {
        if (rjVar.k(b2.C) == null) {
            rjVar = rjVar.i(new b00(null));
        }
        return new jj(rjVar);
    }

    public static final void e(bu buVar, mm mmVar, eg egVar, ih ihVar, int i2) {
        qh qhVar;
        sl slVar;
        c10 c10Var;
        int i3;
        Object obj;
        qh qhVar2 = (qh) ihVar;
        qhVar2.W(826668973);
        int i4 = i2 | (qhVar2.h(buVar) ? 4 : 2) | (qhVar2.f(mmVar) ? 32 : 16);
        int i5 = 1;
        if (qhVar2.N(i4 & 1, (i4 & 147) != 146)) {
            View view = (View) qhVar2.j(AndroidCompositionLocals_androidKt.f);
            sl slVar2 = (sl) qhVar2.j(hi.h);
            c10 c10Var2 = (c10) qhVar2.j(hi.n);
            qhVar2.T(206, th.e);
            if (qhVar2.Q) {
                mr0.x(qhVar2.H);
            }
            Object C = qhVar2.C();
            mh mhVar = C instanceof mh ? (mh) C : null;
            if (mhVar == null) {
                slVar = slVar2;
                mh mhVar2 = new mh(new nh(qhVar2, qhVar2.R, qhVar2.p, qhVar2.B, qhVar2.g.u));
                qhVar2.f0(mhVar2);
                mhVar = mhVar2;
            } else {
                slVar = slVar2;
            }
            nh nhVar = mhVar.d;
            nhVar.f.setValue(qhVar2.l());
            qhVar2.q(false);
            f70 p = ud0.p(egVar, qhVar2);
            Object[] objArr = new Object[0];
            Object K = qhVar2.K();
            y7 y7Var = hh.a;
            Object obj2 = K;
            if (K == y7Var) {
                t3 t3Var = t3.k;
                qhVar2.e0(t3Var);
                obj2 = t3Var;
            }
            Object q = ze0.q(Arrays.copyOf(objArr, 0), nk.o, (bu) obj2, qhVar2, 3456, 0);
            qh qhVar3 = qhVar2;
            UUID uuid = (UUID) q;
            boolean f2 = qhVar3.f(view) | qhVar3.f(slVar);
            Object K2 = qhVar3.K();
            if (f2 || K2 == y7Var) {
                c10Var = c10Var2;
                om omVar = new om(buVar, mmVar, view, c10Var, slVar, uuid);
                eg egVar2 = new eg(346960332, true, new j(i5, p));
                jm jmVar = omVar.k;
                jmVar.setParentCompositionContext(nhVar);
                jmVar.m.setValue(egVar2);
                jmVar.q = true;
                if (jmVar.g == null && !jmVar.isAttachedToWindow()) {
                    g8.s("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                    return;
                } else {
                    jmVar.d();
                    qhVar3.e0(omVar);
                    K2 = omVar;
                }
            } else {
                c10Var = c10Var2;
            }
            om omVar2 = (om) K2;
            boolean h2 = qhVar3.h(omVar2);
            Object K3 = qhVar3.K();
            Object obj3 = K3;
            if (h2 || K3 == y7Var) {
                g gVar = new g(omVar2, null, 2);
                qhVar3.e0(gVar);
                obj3 = gVar;
            }
            mz.k(qhVar3, (qu) obj3, ky0.a);
            boolean h3 = qhVar3.h(omVar2);
            Object K4 = qhVar3.K();
            if (h3 || K4 == y7Var) {
                i3 = 0;
                h4 h4Var = new h4(omVar2, i3);
                qhVar3.e0(h4Var);
                obj = h4Var;
            } else {
                i3 = 0;
                obj = K4;
            }
            mz.h(omVar2, (mu) obj, qhVar3);
            int i6 = (qhVar3.h(omVar2) ? 1 : 0) | ((i4 & 14) == 4 ? 1 : i3) | ((i4 & 112) == 32 ? 1 : i3) | (qhVar3.d(c10Var.ordinal()) ? 1 : 0);
            Object K5 = qhVar3.K();
            Object obj4 = K5;
            if (i6 != 0 || K5 == y7Var) {
                i4 i4Var = new i4(omVar2, buVar, mmVar, c10Var, 0);
                qhVar3.e0(i4Var);
                obj4 = i4Var;
            }
            mz.p((bu) obj4, qhVar3);
            qhVar = qhVar3;
        } else {
            qhVar2.Q();
            qhVar = qhVar2;
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new v3(buVar, mmVar, egVar, i2, 1);
        }
    }

    public static final long f(int i2) {
        long j2 = i2 << 32;
        int i3 = p00.p;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:454:0x03b2, code lost:
    
        if (r13.n != r0.i) goto L198;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x048a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0363  */
    /* JADX WARN: Type inference failed for: r15v5, types: [ih, qh] */
    /* JADX WARN: Type inference failed for: r23v2, types: [kj] */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.lang.Object, s80] */
    /* JADX WARN: Type inference failed for: r5v14, types: [cx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(s80 s80Var, p80 p80Var, u50 u50Var, o9 o9Var, mu muVar, mu muVar2, mu muVar3, mu muVar4, ih ihVar, int i2) {
        qh qhVar;
        int i3;
        o20 o20Var;
        q90 q90Var;
        lm lmVar;
        Object obj;
        rg rgVar;
        f70 f70Var;
        q90 q90Var2;
        mu muVar5;
        wm0 wm0Var;
        mu muVar6;
        q90 q90Var3;
        bt0 bt0Var;
        cx0 cx0Var;
        y70 y70Var;
        lm lmVar2;
        lm lmVar3;
        Object w80Var;
        rg rgVar2;
        wm0 wm0Var2;
        bt0 bt0Var2;
        Map map;
        f70 f70Var2;
        ?? r7;
        Intent intent;
        int[] intArray;
        Bundle bundle;
        h8 h8Var;
        k80 f2;
        ArrayList arrayList;
        int length;
        int i4;
        String str;
        m80 e2;
        p80 p80Var2;
        Bundle bundle2;
        int i5;
        m80 e3;
        p80 p80Var3;
        int i6;
        ArrayList<String> stringArrayList;
        qh qhVar2;
        qh qhVar3 = (qh) ihVar;
        qhVar3.W(-1964664536);
        int i7 = (i2 & 6) == 0 ? (qhVar3.h(s80Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i7 |= qhVar3.h(p80Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i7 |= qhVar3.f(u50Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i7 |= qhVar3.f(o9Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= qhVar3.h(muVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i7 |= qhVar3.h(muVar2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i7 |= qhVar3.h(muVar3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i7 |= qhVar3.h(muVar4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i7 |= qhVar3.h(null) ? 67108864 : 33554432;
        }
        int i8 = i7;
        if ((38347923 & i8) == 38347922 && qhVar3.z()) {
            qhVar3.Q();
            qhVar2 = qhVar3;
        } else {
            qhVar3.S();
            if ((i2 & 1) != 0 && !qhVar3.x()) {
                qhVar3.Q();
            }
            qhVar3.r();
            o20 o20Var2 = (o20) qhVar3.j(n30.a);
            r01 a2 = r30.a(qhVar3);
            if (a2 == null) {
                g8.s("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            q01 viewModelStore = a2.getViewModelStore();
            s80Var.getClass();
            h8 h8Var2 = s80Var.g;
            q90 q90Var4 = s80Var.v;
            viewModelStore.getClass();
            e80 e80Var = s80Var.p;
            gk gkVar = gk.b;
            ll llVar = e80.b;
            if (!nz.l(e80Var, (e80) new p01(viewModelStore, llVar, gkVar).i(hj0.a(e80.class)))) {
                if (!h8Var2.isEmpty()) {
                    g8.s("ViewModelStore should be set before setGraph call");
                    return;
                }
                s80Var.p = (e80) new p01(viewModelStore, llVar, gkVar).i(hj0.a(e80.class));
            }
            p80Var.getClass();
            LinkedHashMap linkedHashMap = s80Var.w;
            ps0 ps0Var = p80Var.m;
            if (!h8Var2.isEmpty() && s80Var.g() == f20.d) {
                g8.s("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            boolean z = false;
            if (nz.l(s80Var.c, p80Var)) {
                qhVar = qhVar3;
                i3 = i8;
                o20Var = o20Var2;
                int e4 = ps0Var.e();
                for (int i9 = 0; i9 < e4; i9++) {
                    m80 m80Var = (m80) ps0Var.f(i9);
                    p80 p80Var4 = s80Var.c;
                    p80Var4.getClass();
                    int c2 = p80Var4.m.c(i9);
                    p80 p80Var5 = s80Var.c;
                    p80Var5.getClass();
                    ps0 ps0Var2 = p80Var5.m;
                    if (ps0Var2.d) {
                        m(ps0Var2);
                    }
                    int o = nz.o(ps0Var2.e, ps0Var2.g, c2);
                    if (o >= 0) {
                        Object[] objArr = ps0Var2.f;
                        Object obj2 = objArr[o];
                        objArr[o] = m80Var;
                    }
                }
                Iterator it = h8Var2.iterator();
                while (it.hasNext()) {
                    y70 y70Var2 = (y70) it.next();
                    int i10 = m80.l;
                    m80 m80Var2 = y70Var2.e;
                    m80Var2.getClass();
                    yk0 yk0Var = new yk0(kq0.A(kq0.z(m80Var2, j80.f)));
                    m80 m80Var3 = s80Var.c;
                    m80Var3.getClass();
                    Iterator it2 = yk0Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((xk0) it2).e;
                        if (listIterator.hasPrevious()) {
                            m80 m80Var4 = (m80) listIterator.previous();
                            if ((!nz.l(m80Var4, s80Var.c) || !m80Var3.equals(p80Var)) && (m80Var3 instanceof p80)) {
                                p80 p80Var6 = (p80) m80Var3;
                                m80Var3 = p80Var6.e(m80Var4.i, p80Var6, false, null);
                                m80Var3.getClass();
                            }
                        }
                    }
                    y70Var2.e = m80Var3;
                }
            } else {
                p80 p80Var7 = s80Var.c;
                if (p80Var7 != null) {
                    ArrayList arrayList2 = new ArrayList(s80Var.m.keySet());
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        int intValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((a80) it3.next()).d = true;
                            arrayList2 = arrayList2;
                        }
                        ArrayList arrayList3 = arrayList2;
                        boolean q = s80Var.q(intValue, null, new c90(z, true, -1, z, z, -1, -1));
                        for (Iterator it4 = linkedHashMap.values().iterator(); it4.hasNext(); it4 = it4) {
                            ((a80) it4.next()).d = false;
                        }
                        if (q) {
                            s80Var.m(intValue, true, false);
                        }
                        arrayList2 = arrayList3;
                        z = false;
                    }
                    s80Var.m(p80Var7.i, true, false);
                }
                s80Var.c = p80Var;
                Activity activity = s80Var.b;
                Context context = s80Var.a;
                Bundle bundle3 = s80Var.d;
                if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                    int size2 = stringArrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        String str2 = stringArrayList.get(i12);
                        i12++;
                        String str3 = str2;
                        str3.getClass();
                        q90Var4.b(str3);
                        bundle3.getBundle(str3);
                    }
                }
                Parcelable[] parcelableArr = s80Var.e;
                if (parcelableArr != null) {
                    int length2 = parcelableArr.length;
                    int i13 = 0;
                    while (i13 < length2) {
                        Parcelable parcelable = parcelableArr[i13];
                        parcelable.getClass();
                        z70 z70Var = (z70) parcelable;
                        Parcelable[] parcelableArr2 = parcelableArr;
                        int i14 = z70Var.e;
                        int i15 = length2;
                        int i16 = i13;
                        m80 d2 = s80Var.d(i14, null);
                        if (d2 == null) {
                            int i17 = m80.l;
                            String u = a50.u(context, i14);
                            StringBuilder sb = new StringBuilder("Restoring the Navigation back stack failed: destination ");
                            sb.append(u);
                            sb.append(" cannot be found from the current destination ");
                            y70 y70Var3 = (y70) h8Var2.f();
                            sb.append(y70Var3 != null ? y70Var3.e : null);
                            throw new IllegalStateException(sb.toString());
                        }
                        y70 a3 = z70Var.a(context, d2, s80Var.g(), s80Var.p);
                        p90 b2 = q90Var4.b(d2.d);
                        Object obj4 = linkedHashMap.get(b2);
                        if (obj4 == null) {
                            obj4 = new a80(s80Var, b2);
                            linkedHashMap.put(b2, obj4);
                        }
                        h8Var2.addLast(a3);
                        ((a80) obj4).a(a3);
                        p80 p80Var8 = a3.e.e;
                        if (p80Var8 != null) {
                            s80Var.i(a3, s80Var.f(p80Var8.i));
                        }
                        i13 = i16 + 1;
                        parcelableArr = parcelableArr2;
                        length2 = i15;
                    }
                    s80Var.t();
                    s80Var.e = null;
                }
                Collection values = S(q90Var4.a).values();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : values) {
                    if (!((p90) obj5).b) {
                        arrayList4.add(obj5);
                    }
                }
                int size3 = arrayList4.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj6 = arrayList4.get(i18);
                    i18++;
                    p90 p90Var = (p90) obj6;
                    Object obj7 = linkedHashMap.get(p90Var);
                    if (obj7 == null) {
                        i6 = size3;
                        a80 a80Var = new a80(s80Var, p90Var);
                        linkedHashMap.put(p90Var, a80Var);
                        obj7 = a80Var;
                    } else {
                        i6 = size3;
                    }
                    p90Var.getClass();
                    p90Var.a = (a80) obj7;
                    p90Var.b = true;
                    size3 = i6;
                }
                if (s80Var.c == null || !h8Var2.isEmpty()) {
                    qhVar = qhVar3;
                    i3 = i8;
                    o20Var = o20Var2;
                    s80Var.b();
                } else {
                    if (s80Var.f || activity == null || (intent = activity.getIntent()) == null) {
                        qhVar = qhVar3;
                        i3 = i8;
                        o20Var = o20Var2;
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            try {
                                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                            } catch (Exception e5) {
                                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e5);
                            }
                            ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundle4 = new Bundle();
                            ArrayList arrayList5 = parcelableArrayList;
                            bundle = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle != null) {
                                bundle4.putAll(bundle);
                            }
                            if (intArray != null || intArray.length == 0) {
                                p80 h2 = s80Var.h(h8Var2);
                                h8Var = h8Var2;
                                f2 = h2.f(new t7(intent), true, h2);
                                if (f2 != null) {
                                    m80 m80Var5 = f2.d;
                                    h8 h8Var3 = new h8();
                                    m80 m80Var6 = m80Var5;
                                    i3 = i8;
                                    while (true) {
                                        p80 p80Var9 = m80Var6.e;
                                        if (p80Var9 != null) {
                                            o20Var = o20Var2;
                                            qhVar = qhVar3;
                                        } else {
                                            qhVar = qhVar3;
                                            o20Var = o20Var2;
                                        }
                                        h8Var3.addFirst(m80Var6);
                                        if (!nz.l(p80Var9, null) && p80Var9 != null) {
                                            m80Var6 = p80Var9;
                                            o20Var2 = o20Var;
                                            qhVar3 = qhVar;
                                        }
                                    }
                                    List o0 = zd.o0(h8Var3);
                                    ArrayList arrayList6 = new ArrayList(ae.Y(o0, 10));
                                    Iterator it5 = o0.iterator();
                                    while (it5.hasNext()) {
                                        arrayList6.add(Integer.valueOf(((m80) it5.next()).i));
                                    }
                                    intArray = new int[arrayList6.size()];
                                    int size4 = arrayList6.size();
                                    int i19 = 0;
                                    int i20 = 0;
                                    while (i20 < size4) {
                                        Object obj8 = arrayList6.get(i20);
                                        i20++;
                                        intArray[i19] = ((Number) obj8).intValue();
                                        i19++;
                                    }
                                    Bundle a4 = m80Var5.a(f2.e);
                                    if (a4 != null) {
                                        bundle4.putAll(a4);
                                    }
                                    arrayList = null;
                                    if (intArray != null && intArray.length != 0) {
                                        p80 p80Var10 = s80Var.c;
                                        length = intArray.length;
                                        i4 = 0;
                                        while (true) {
                                            if (i4 < length) {
                                                str = null;
                                                break;
                                            }
                                            int i21 = intArray[i4];
                                            if (i4 == 0) {
                                                p80 p80Var11 = s80Var.c;
                                                p80Var11.getClass();
                                                e3 = p80Var11.i == i21 ? s80Var.c : null;
                                                i5 = length;
                                            } else {
                                                p80Var10.getClass();
                                                i5 = length;
                                                e3 = p80Var10.e(i21, p80Var10, false, null);
                                            }
                                            if (e3 == null) {
                                                int i22 = m80.l;
                                                str = a50.u(context, i21);
                                                break;
                                            }
                                            if (i4 != intArray.length - 1 && (e3 instanceof p80)) {
                                                while (true) {
                                                    p80Var3 = (p80) e3;
                                                    p80Var3.getClass();
                                                    if (!(p80Var3.e(p80Var3.n, p80Var3, false, null) instanceof p80)) {
                                                        break;
                                                    } else {
                                                        e3 = p80Var3.e(p80Var3.n, p80Var3, false, null);
                                                    }
                                                }
                                                p80Var10 = p80Var3;
                                            }
                                            i4++;
                                            length = i5;
                                        }
                                        if (str == null) {
                                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                        } else {
                                            bundle4.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                            int length3 = intArray.length;
                                            Bundle[] bundleArr = new Bundle[length3];
                                            for (int i23 = 0; i23 < length3; i23++) {
                                                Bundle bundle5 = new Bundle();
                                                bundle5.putAll(bundle4);
                                                if (arrayList != null && (bundle2 = (Bundle) arrayList.get(i23)) != null) {
                                                    bundle5.putAll(bundle2);
                                                }
                                                bundleArr[i23] = bundle5;
                                            }
                                            int flags = intent.getFlags();
                                            int i24 = 268435456 & flags;
                                            if (i24 != 0 && (flags & 32768) == 0) {
                                                intent.addFlags(32768);
                                                ArrayList arrayList7 = new ArrayList();
                                                ComponentName component = intent.getComponent();
                                                if (component == null) {
                                                    component = intent.resolveActivity(context.getPackageManager());
                                                }
                                                if (component != null) {
                                                    int size5 = arrayList7.size();
                                                    try {
                                                        for (Intent F = mz.F(context, component); F != null; F = mz.F(context, F.getComponent())) {
                                                            arrayList7.add(size5, F);
                                                        }
                                                    } catch (PackageManager.NameNotFoundException e6) {
                                                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                        throw new IllegalArgumentException(e6);
                                                    }
                                                }
                                                arrayList7.add(intent);
                                                if (arrayList7.isEmpty()) {
                                                    g8.s("No intents added to TaskStackBuilder; cannot startActivities");
                                                    return;
                                                }
                                                Intent[] intentArr = (Intent[]) arrayList7.toArray(new Intent[0]);
                                                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                                context.startActivities(intentArr, null);
                                                activity.finish();
                                                activity.overridePendingTransition(0, 0);
                                            } else if (i24 != 0) {
                                                if (!h8Var.isEmpty()) {
                                                    p80 p80Var12 = s80Var.c;
                                                    p80Var12.getClass();
                                                    s80Var.m(p80Var12.i, true, false);
                                                }
                                                int i25 = 0;
                                                while (i25 < intArray.length) {
                                                    int i26 = intArray[i25];
                                                    int i27 = i25 + 1;
                                                    Bundle bundle6 = bundleArr[i25];
                                                    m80 d3 = s80Var.d(i26, null);
                                                    if (d3 == null) {
                                                        int i28 = m80.l;
                                                        String u2 = a50.u(context, i26);
                                                        StringBuilder sb2 = new StringBuilder("Deep Linking failed: destination ");
                                                        sb2.append(u2);
                                                        sb2.append(" cannot be found from the current destination ");
                                                        y70 y70Var4 = (y70) h8Var.f();
                                                        sb2.append(y70Var4 != null ? y70Var4.e : null);
                                                        throw new IllegalStateException(sb2.toString());
                                                    }
                                                    s80Var.j(d3, bundle6, nk.G(new y3(14, d3, s80Var)));
                                                    i25 = i27;
                                                }
                                                s80Var.f = true;
                                            } else {
                                                p80 p80Var13 = s80Var.c;
                                                int length4 = intArray.length;
                                                for (int i29 = 0; i29 < length4; i29++) {
                                                    int i30 = intArray[i29];
                                                    Bundle bundle7 = bundleArr[i29];
                                                    if (i29 == 0) {
                                                        e2 = s80Var.c;
                                                    } else {
                                                        p80Var13.getClass();
                                                        e2 = p80Var13.e(i30, p80Var13, false, null);
                                                    }
                                                    if (e2 == null) {
                                                        int i31 = m80.l;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + a50.u(context, i30) + " cannot be found in graph " + p80Var13);
                                                    }
                                                    if (i29 == intArray.length - 1) {
                                                        p80 p80Var14 = s80Var.c;
                                                        p80Var14.getClass();
                                                        s80Var.j(e2, bundle7, new c90(false, false, p80Var14.i, true, false, 0, 0));
                                                    } else if (e2 instanceof p80) {
                                                        while (true) {
                                                            p80Var2 = (p80) e2;
                                                            p80Var2.getClass();
                                                            if (!(p80Var2.e(p80Var2.n, p80Var2, false, null) instanceof p80)) {
                                                                break;
                                                            } else {
                                                                e2 = p80Var2.e(p80Var2.n, p80Var2, false, null);
                                                            }
                                                        }
                                                        p80Var13 = p80Var2;
                                                    }
                                                }
                                                s80Var.f = true;
                                            }
                                        }
                                    }
                                }
                            } else {
                                h8Var = h8Var2;
                            }
                            qhVar = qhVar3;
                            i3 = i8;
                            o20Var = o20Var2;
                            arrayList = arrayList5;
                            if (intArray != null) {
                                p80 p80Var102 = s80Var.c;
                                length = intArray.length;
                                i4 = 0;
                                while (true) {
                                    if (i4 < length) {
                                    }
                                    i4++;
                                    length = i5;
                                }
                                if (str == null) {
                                }
                            }
                        }
                        intArray = null;
                        if (extras == null) {
                        }
                        Bundle bundle42 = new Bundle();
                        ArrayList arrayList52 = parcelableArrayList;
                        if (extras == null) {
                        }
                        if (bundle != null) {
                        }
                        if (intArray != null) {
                        }
                        p80 h22 = s80Var.h(h8Var2);
                        h8Var = h8Var2;
                        f2 = h22.f(new t7(intent), true, h22);
                        if (f2 != null) {
                        }
                        qhVar = qhVar3;
                        i3 = i8;
                        o20Var = o20Var2;
                        arrayList = arrayList52;
                        if (intArray != null) {
                        }
                    }
                    p80 p80Var15 = s80Var.c;
                    p80Var15.getClass();
                    s80Var.j(p80Var15, null, null);
                }
            }
            p90 b3 = q90Var4.b("composable");
            rg rgVar3 = b3 instanceof rg ? (rg) b3 : null;
            if (rgVar3 == null) {
                ri0 s = qhVar.s();
                if (s != null) {
                    s.d = new y80(s80Var, p80Var, u50Var, o9Var, muVar, muVar2, muVar3, muVar4, i2, 1);
                    return;
                }
                return;
            }
            ?? r15 = qhVar;
            f70 g2 = ud0.g(rgVar3.b().e, r15);
            Object K = r15.K();
            Object obj9 = hh.a;
            if (K == obj9) {
                K = new yd0(0.0f);
                r15.e0(K);
            }
            yd0 yd0Var = (yd0) K;
            Object K2 = r15.K();
            if (K2 == obj9) {
                K2 = ud0.o(Boolean.FALSE);
                r15.e0(K2);
            }
            f70 f70Var3 = (f70) K2;
            boolean z2 = ((List) g2.getValue()).size() > 1;
            boolean f3 = r15.f(g2) | r15.f(rgVar3);
            Object K3 = r15.K();
            if (f3 || K3 == obj9) {
                K3 = new cj(rgVar3, g2, yd0Var, f70Var3, null, 1);
                r15.e0(K3);
            }
            od0.a(z2, (qu) K3, r15, 0);
            o20 o20Var3 = o20Var;
            boolean h3 = r15.h(s80Var) | r15.h(o20Var3);
            Object K4 = r15.K();
            if (h3 || K4 == obj9) {
                K4 = new y3(15, s80Var, o20Var3);
                r15.e0(K4);
            }
            mz.h(o20Var3, (mu) K4, r15);
            wm0 r = ze0.r(r15);
            f70 g3 = ud0.g(s80Var.j, r15);
            Object K5 = r15.K();
            if (K5 == obj9) {
                K5 = ud0.i(new b(12, g3));
                r15.e0(K5);
            }
            bt0 bt0Var3 = (bt0) K5;
            y70 y70Var5 = (y70) zd.i0((List) bt0Var3.getValue());
            Object K6 = r15.K();
            if (K6 == obj9) {
                K6 = new LinkedHashMap();
                r15.e0(K6);
            }
            Map map2 = (Map) K6;
            r15.V(653364988);
            if (y70Var5 != null) {
                boolean f4 = r15.f(rgVar3) | ((((i3 & 3670016) ^ 1572864) > 1048576 && r15.f(muVar3)) || (i3 & 1572864) == 1048576) | ((i3 & 57344) == 16384);
                Object K7 = r15.K();
                if (f4 || K7 == obj9) {
                    obj = obj9;
                    rgVar = rgVar3;
                    f70Var = f70Var3;
                    q90Var2 = q90Var4;
                    z80 z80Var = new z80(rgVar, muVar3, muVar, f70Var, 0);
                    r15.e0(z80Var);
                    K7 = z80Var;
                } else {
                    obj = obj9;
                    rgVar = rgVar3;
                    f70Var = f70Var3;
                    q90Var2 = q90Var4;
                }
                mu muVar7 = (mu) K7;
                boolean f5 = r15.f(rgVar) | ((((i3 & 29360128) ^ 12582912) > 8388608 && r15.f(muVar4)) || (i3 & 12582912) == 8388608) | ((i3 & 458752) == 131072);
                Object K8 = r15.K();
                if (f5 || K8 == obj) {
                    muVar5 = muVar7;
                    z80 z80Var2 = new z80(rgVar, muVar4, muVar2, f70Var, 1);
                    r15.e0(z80Var2);
                    K8 = z80Var2;
                } else {
                    muVar5 = muVar7;
                }
                mu muVar8 = (mu) K8;
                boolean z3 = (i3 & 234881024) == 67108864;
                Object K9 = r15.K();
                if (z3 || K9 == obj) {
                    K9 = new cz0(1, 19);
                    r15.e0(K9);
                }
                mu muVar9 = (mu) K9;
                Boolean bool = Boolean.TRUE;
                boolean f6 = r15.f(rgVar);
                f70 f70Var4 = f70Var;
                Object K10 = r15.K();
                if (f6 || K10 == obj) {
                    K10 = new y3(16, bt0Var3, rgVar);
                    r15.e0(K10);
                }
                mz.h(bool, (mu) K10, r15);
                Object K11 = r15.K();
                if (K11 == obj) {
                    K11 = new jp0(y70Var5);
                    r15.e0(K11);
                }
                jp0 jp0Var = (jp0) K11;
                u10 u10Var = ex0.a;
                boolean f7 = r15.f(jp0Var);
                Object K12 = r15.K();
                if (f7 || K12 == obj) {
                    wm0Var = r;
                    K12 = new cx0(jp0Var, null, "entry");
                    r15.e0(K12);
                } else {
                    wm0Var = r;
                }
                ?? r5 = (cx0) K12;
                if (jp0Var != null) {
                    r15.V(1030413636);
                    Object value = jp0Var.c.getValue();
                    Object value2 = jp0Var.b.getValue();
                    boolean f8 = r15.f(jp0Var);
                    q90Var3 = q90Var2;
                    Object K13 = r15.K();
                    if (f8 || K13 == obj) {
                        muVar6 = muVar9;
                        bt0Var = bt0Var3;
                        K13 = new u6(jp0Var, null, 14);
                        r15.e0(K13);
                    } else {
                        muVar6 = muVar9;
                        bt0Var = bt0Var3;
                    }
                    mz.l(value, value2, (qu) K13, r15);
                    r15.q(false);
                } else {
                    muVar6 = muVar9;
                    q90Var3 = q90Var2;
                    bt0Var = bt0Var3;
                    r15.V(1030875195);
                    r5.a(jp0Var.b.getValue(), r15, 0);
                    r15.q(false);
                }
                boolean f9 = r15.f(r5);
                Object K14 = r15.K();
                if (f9 || K14 == obj) {
                    K14 = new f2(27, (Object) r5);
                    r15.e0(K14);
                }
                mz.h(r5, (mu) K14, r15);
                if (i(f70Var4)) {
                    r15.V(-1218260648);
                    Float valueOf = Float.valueOf(yd0Var.g());
                    boolean f10 = r15.f(g2) | r15.h(jp0Var);
                    Object K15 = r15.K();
                    if (f10 || K15 == obj) {
                        r7 = null;
                        K15 = new u6(jp0Var, g2, yd0Var, (kj) null);
                        r15.e0(K15);
                    } else {
                        r7 = null;
                    }
                    mz.k(r15, (qu) K15, valueOf);
                    r15.q(false);
                    cx0Var = r5;
                    lmVar3 = r7;
                } else {
                    r15.V(-1218005611);
                    boolean h4 = r15.h(jp0Var) | r15.h(y70Var5) | r15.f(r5);
                    Object K16 = r15.K();
                    if (h4 || K16 == obj) {
                        cx0Var = r5;
                        ?? r23 = 0;
                        K16 = new wg(jp0Var, y70Var5, cx0Var, r23, 5);
                        y70Var = y70Var5;
                        r15.e0(K16);
                        lmVar2 = r23;
                    } else {
                        cx0Var = r5;
                        lmVar2 = null;
                        y70Var = y70Var5;
                    }
                    mz.k(r15, (qu) K16, y70Var);
                    r15.q(false);
                    lmVar3 = lmVar2;
                }
                mu muVar10 = muVar6;
                boolean h5 = r15.h(map2) | r15.f(rgVar) | r15.f(muVar5) | r15.f(muVar8) | r15.f(muVar10);
                Object K17 = r15.K();
                if (h5 || K17 == obj) {
                    rgVar2 = rgVar;
                    wm0Var2 = wm0Var;
                    bt0Var2 = bt0Var;
                    w80Var = new w80(map2, rgVar2, muVar5, muVar8, muVar10, bt0Var2, f70Var4);
                    map = map2;
                    f70Var2 = f70Var4;
                    r15.e0(w80Var);
                } else {
                    rgVar2 = rgVar;
                    w80Var = K17;
                    map = map2;
                    wm0Var2 = wm0Var;
                    bt0Var2 = bt0Var;
                    f70Var2 = f70Var4;
                }
                q90Var = q90Var3;
                cx0 cx0Var2 = cx0Var;
                a(cx0Var2, u50Var, (mu) w80Var, o9Var, j80.h, a50.E(820763100, new x80(wm0Var2, f70Var2, bt0Var2), r15), r15, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                Object b4 = cx0Var2.a.b();
                Object value3 = cx0Var2.d.getValue();
                boolean f11 = r15.f(cx0Var2) | r15.h(s80Var) | r15.f(rgVar2) | r15.h(map);
                Object K18 = r15.K();
                if (f11 || K18 == obj) {
                    oa oaVar = new oa(cx0Var2, s80Var, map, bt0Var2, rgVar2, null);
                    r15.e0(oaVar);
                    K18 = oaVar;
                }
                mz.l(b4, value3, (qu) K18, r15);
                lmVar = lmVar3;
            } else {
                q90Var = q90Var4;
                lmVar = null;
            }
            r15.q(false);
            p90 b5 = q90Var.b("dialog");
            lm lmVar4 = b5 instanceof lm ? (lm) b5 : lmVar;
            if (lmVar4 == null) {
                ri0 s2 = r15.s();
                if (s2 != null) {
                    s2.d = new y80(s80Var, p80Var, u50Var, o9Var, muVar, muVar2, muVar3, muVar4, i2, 2);
                    return;
                }
                return;
            }
            a50.a(lmVar4, r15, 0);
            qhVar2 = r15;
        }
        ri0 s3 = qhVar2.s();
        if (s3 != null) {
            s3.d = new y80(s80Var, p80Var, u50Var, o9Var, muVar, muVar2, muVar3, muVar4, i2, 0);
        }
    }

    public static final void h(s80 s80Var, String str, u50 u50Var, o9 o9Var, mu muVar, mu muVar2, mu muVar3, mu muVar4, mu muVar5, ih ihVar, int i2) {
        mu muVar6;
        mu muVar7;
        int i3;
        o9 o9Var2;
        char c2;
        u50 u50Var2;
        mu muVar8;
        mu muVar9;
        qh qhVar;
        mu muVar10;
        mu muVar11;
        mu muVar12;
        mu muVar13;
        o9 o9Var3;
        u50 u50Var3;
        qh qhVar2 = (qh) ihVar;
        qhVar2.W(1840250294);
        int i4 = i2 | (qhVar2.h(s80Var) ? 4 : 2) | 844852608;
        char c3 = qhVar2.h(muVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i4) == 306783378 && (c3 & 3) == 2 && qhVar2.z()) {
            qhVar2.Q();
            u50Var3 = u50Var;
            o9Var3 = o9Var;
            muVar13 = muVar;
            muVar12 = muVar2;
            muVar11 = muVar3;
            qhVar = qhVar2;
            muVar10 = muVar4;
        } else {
            qhVar2.S();
            if ((i2 & 1) == 0 || qhVar2.x()) {
                o9 o9Var4 = b2.e;
                muVar6 = j80.i;
                muVar7 = j80.j;
                i3 = i4 & (-264241153);
                o9Var2 = o9Var4;
                c2 = c3;
                u50Var2 = r50.a;
                muVar8 = muVar6;
                muVar9 = muVar7;
            } else {
                qhVar2.Q();
                u50Var2 = u50Var;
                muVar9 = muVar2;
                muVar6 = muVar3;
                muVar7 = muVar4;
                i3 = i4 & (-264241153);
                c2 = c3;
                o9Var2 = o9Var;
                muVar8 = muVar;
            }
            qhVar2.r();
            boolean z = (c2 & 14) == 4;
            Object K = qhVar2.K();
            if (z || K == hh.a) {
                q80 q80Var = new q80(s80Var.v, str);
                muVar5.c(q80Var);
                K = q80Var.c();
                qhVar2.e0(K);
            }
            o9 o9Var5 = o9Var2;
            g(s80Var, (p80) K, u50Var2, o9Var5, muVar8, muVar9, muVar6, muVar7, qhVar2, 100884480 | (i3 & 8078));
            qhVar = qhVar2;
            muVar10 = muVar7;
            muVar11 = muVar6;
            muVar12 = muVar9;
            muVar13 = muVar8;
            o9Var3 = o9Var5;
            u50Var3 = u50Var2;
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new t80(s80Var, str, u50Var3, o9Var3, muVar13, muVar12, muVar11, muVar10, muVar5, i2);
        }
    }

    public static final boolean i(f70 f70Var) {
        return ((Boolean) f70Var.getValue()).booleanValue();
    }

    public static final void j(u50 u50Var, qu quVar, ih ihVar, int i2) {
        int i3;
        qh qhVar = (qh) ihVar;
        qhVar.W(1090521195);
        if ((i2 & 6) == 0) {
            i3 = (qhVar.f(u50Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qhVar.h(quVar) ? 32 : 16;
        }
        int i4 = 0;
        if (qhVar.N(i3 & 1, (i3 & 19) != 18)) {
            Object K = qhVar.K();
            if (K == hh.a) {
                K = k4.b;
                qhVar.e0(K);
            }
            g50 g50Var = (g50) K;
            long j2 = qhVar.R;
            int i5 = (int) ((j2 >>> 32) ^ j2);
            gf0 l2 = qhVar.l();
            u50 D = nk.D(qhVar, u50Var);
            eh.b.getClass();
            gi giVar = dh.b;
            int i6 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, g50Var);
            ld0.r(qhVar, dh.d, l2);
            h6 h6Var = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(i5))) {
                y6.y(i5, qhVar, i5, h6Var);
            }
            ld0.r(qhVar, dh.c, D);
            quVar.invoke(qhVar, Integer.valueOf((i6 >> 6) & 14));
            qhVar.q(true);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new l4(u50Var, quVar, i2, i4);
        }
    }

    public static final boolean k(nn nnVar, long j2) {
        if (!nnVar.d.q) {
            return false;
        }
        iy iyVar = (iy) nz.a0(nnVar).F.g;
        if (!iyVar.Q.q) {
            return false;
        }
        long F0 = iyVar.F0(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (F0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (F0 & 4294967295L));
        long j3 = nnVar.t;
        float f2 = ((int) (j3 >> 32)) + intBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f2) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View l(View view, View view2, int i2) {
        int nextFocusForwardId;
        View B;
        if (i2 != 1) {
            if (i2 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                fs fsVar = new fs(nextFocusForwardId);
                View view3 = null;
                while (true) {
                    B = B(view, fsVar, view3);
                    if (B != null || view == view2) {
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view4 = (View) parent;
                    view3 = view;
                    view = view4;
                }
                return B;
            }
        } else if (view.getId() != -1) {
            y3 y3Var = new y3(11, view2, view);
            View view5 = null;
            while (true) {
                View B2 = B(view, y3Var, view5);
                if (B2 != null || view == view2) {
                    break;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view6 = (View) parent2;
                view5 = view;
                view = view6;
            }
            return null;
        }
        return null;
    }

    public static final void m(ps0 ps0Var) {
        int i2 = ps0Var.g;
        int[] iArr = ps0Var.e;
        Object[] objArr = ps0Var.f;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != m) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        ps0Var.d = false;
        ps0Var.g = i3;
    }

    public static final t50 n(nl nlVar, int i2) {
        t50 t50Var = ((t50) nlVar).d.i;
        if (t50Var == null || (t50Var.g & i2) == 0) {
            return null;
        }
        while (t50Var != null) {
            int i3 = t50Var.f;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return t50Var;
            }
            t50Var = t50Var.i;
        }
        return null;
    }

    public static final void o(View view, ArrayList arrayList, boolean z) {
        int i2;
        boolean z2 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z2) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z3 = viewGroup.getDescendantFocusability() == 131072;
        if (z2 && z3) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i3 = 0; i3 < childCount; i3++) {
                viewArr[i3] = viewGroup.getChildAt(i3);
            }
            x60 x60Var = qs.a;
            boolean z4 = viewGroup.getLayoutDirection() == 1;
            rh rhVar = qs.f;
            x60 x60Var2 = qs.a;
            a70 a70Var = qs.d;
            if (childCount < 2) {
                i2 = 0;
            } else {
                int i4 = childCount - x60Var2.b;
                i2 = 0;
                for (int i5 = 0; i5 < i4; i5++) {
                    x60Var2.a(new Rect());
                }
                for (int i6 = 0; i6 < childCount; i6++) {
                    View view2 = viewArr[i6];
                    int i7 = qs.b;
                    qs.b = i7 + 1;
                    Rect rect = (Rect) x60Var2.e(i7);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    a70Var.m(view2, rect);
                }
                rh rhVar2 = qs.e;
                rhVar2.getClass();
                if (childCount > 1) {
                    Arrays.sort(viewArr, rhVar2);
                }
                Object g2 = a70Var.g(viewArr[0]);
                g2.getClass();
                int i8 = ((Rect) g2).bottom;
                qs.c = z4 ? -1 : 1;
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    Object g3 = a70Var.g(viewArr[i10]);
                    g3.getClass();
                    Rect rect2 = (Rect) g3;
                    if (rect2.top >= i8) {
                        if (i10 - i9 > 1) {
                            p8.c0(viewArr, rhVar, i9, i10);
                        }
                        i8 = rect2.bottom;
                        i9 = i10;
                    } else {
                        i8 = Math.max(i8, rect2.bottom);
                    }
                }
                if (childCount - i9 > 1) {
                    p8.c0(viewArr, rhVar, i9, childCount);
                }
                qs.b = 0;
                a70Var.a();
            }
            for (int i11 = i2; i11 < childCount; i11++) {
                o(viewArr[i11], arrayList, z);
            }
        }
        if (z2 && !z3 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static final xx p(zx zxVar, float f2, wx wxVar, String str, qh qhVar, int i2) {
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(f2);
        j3 j3Var = dz0.a;
        int i3 = (i2 & 1022) | 229376;
        Object K = qhVar.K();
        Object obj = hh.a;
        if (K == obj) {
            K = new xx(zxVar, valueOf, valueOf2, wxVar);
            qhVar.e0(K);
        }
        xx xxVar = (xx) K;
        boolean h2 = ((((i3 & 896) ^ 384) > 256 && qhVar.h(valueOf2)) || (i3 & 384) == 256) | qhVar.h(wxVar);
        Object K2 = qhVar.K();
        if (h2 || K2 == obj) {
            Object i4Var = new i4(valueOf, xxVar, valueOf2, wxVar, 1);
            qhVar.e0(i4Var);
            K2 = i4Var;
        }
        mz.p((bu) K2, qhVar);
        boolean h3 = qhVar.h(zxVar);
        Object K3 = qhVar.K();
        if (h3 || K3 == obj) {
            K3 = new y3(13, zxVar, xxVar);
            qhVar.e0(K3);
        }
        mz.h(xxVar, (mu) K3, qhVar);
        return xxVar;
    }

    public static s40 q(s40 s40Var) {
        s40Var.b();
        s40Var.p = true;
        if (s40Var.l > 0) {
            return s40Var;
        }
        s40 s40Var2 = s40.q;
        s40Var2.getClass();
        return s40Var2;
    }

    public static final Bundle r(pd0... pd0VarArr) {
        Bundle bundle = new Bundle(pd0VarArr.length);
        for (pd0 pd0Var : pd0VarArr) {
            String str = (String) pd0Var.d;
            Object obj = pd0Var.e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final boolean s(Object obj) {
        if (obj instanceof yr0) {
            yr0 yr0Var = (yr0) obj;
            if (yr0Var.d() == b2.G || yr0Var.d() == b2.M || yr0Var.d() == b2.K) {
                Object value = yr0Var.getValue();
                if (value == null) {
                    return true;
                }
                return s(value);
            }
        } else if (!(obj instanceof yu) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (c[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void t(bk bkVar, CancellationException cancellationException) {
        zz zzVar = (zz) bkVar.f().k(b2.C);
        if (zzVar != null) {
            zzVar.a(cancellationException);
        } else {
            g8.d(bkVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static byte[] u(byte[] bArr) {
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

    public static final Object v(qu quVar, kj kjVar) {
        yn0 yn0Var = new yn0(kjVar, kjVar.getContext());
        return ch0.l(yn0Var, yn0Var, quVar);
    }

    public static final bn0 w(m60 m60Var) {
        bn0 bn0Var;
        LinkedHashMap linkedHashMap = m60Var.a;
        ln0 ln0Var = (ln0) linkedHashMap.get(j);
        Bundle bundle = null;
        if (ln0Var == null) {
            g8.r("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        r01 r01Var = (r01) linkedHashMap.get(k);
        if (r01Var == null) {
            g8.r("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(l);
        String str = (String) linkedHashMap.get(p01.f);
        if (str == null) {
            g8.r("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        hn0 b2 = ln0Var.getSavedStateRegistry().b();
        en0 en0Var = b2 instanceof en0 ? (en0) b2 : null;
        if (en0Var == null) {
            g8.s("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = E(r01Var).a;
        bn0 bn0Var2 = (bn0) linkedHashMap2.get(str);
        if (bn0Var2 != null) {
            return bn0Var2;
        }
        en0Var.b();
        Bundle bundle3 = en0Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = r((pd0[]) Arrays.copyOf(new pd0[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                en0Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            bn0Var = new bn0();
        } else {
            ClassLoader classLoader = bn0.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            s40 s40Var = new s40(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                s40Var.put(str2, bundle2.get(str2));
            }
            bn0Var = new bn0(q(s40Var));
        }
        linkedHashMap2.put(str, bn0Var);
        return bn0Var;
    }

    public static boolean x(File file) {
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
            z = x(file2) && z;
        }
        return z;
    }

    public static final float y(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final void z(ln0 ln0Var) {
        f20 f20Var = ((q20) ln0Var.getLifecycle()).c;
        if (f20Var != f20.e && f20Var != f20.f) {
            g8.r("Failed requirement.");
        } else if (ln0Var.getSavedStateRegistry().b() == null) {
            en0 en0Var = new en0(ln0Var.getSavedStateRegistry(), (r01) ln0Var);
            ln0Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", en0Var);
            ln0Var.getLifecycle().a(new yi0(3, en0Var));
        }
    }
}
