package i1;

import android.content.Context;
import android.graphics.Color;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Arrays;
import java.util.logging.Logger;
import k0.AbstractC0202x;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static long f2489a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2490b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2491c = true;
    public static Field d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2492e;

    public static final void a(l1.a aVar, l1.c cVar, String str) {
        l1.d.i.fine(cVar.f3158b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3152a);
    }

    public static final boolean b(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        X0.e.e(bArr, "a");
        X0.e.e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void f(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final String g(long j2) {
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

    public static int h(Context context, int i, int i2) {
        Integer num;
        TypedValue O2 = q1.l.O(context, i);
        if (O2 != null) {
            int i3 = O2.resourceId;
            num = Integer.valueOf(i3 != 0 ? A.b.a(context, i3) : O2.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static int i(View view, int i) {
        Context context = view.getContext();
        TypedValue S2 = q1.l.S(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = S2.resourceId;
        return i2 != 0 ? A.b.a(context, i2) : S2.data;
    }

    public static final boolean k(AssertionError assertionError) {
        Logger logger = v1.m.f4066a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? e1.d.k0(message, "getsockname failed") : false;
    }

    public static boolean l(int i) {
        boolean z2;
        if (i != 0) {
            ThreadLocal threadLocal = C.a.f146a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d2 = red / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = green / 255.0d;
            double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = blue / 255.0d;
            double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            z2 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d5;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d5 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    public static boolean m() {
        boolean isEnabled;
        try {
            if (f2490b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2490b == null) {
                f2489a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2490b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2490b.invoke(null, Long.valueOf(f2489a))).booleanValue();
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

    public static int n(int i, int i2, float f2) {
        return C.a.b(C.a.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static final boolean o(String str) {
        X0.e.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final v1.c t(Socket socket) {
        Logger logger = v1.m.f4066a;
        v1.t tVar = new v1.t(socket);
        OutputStream outputStream = socket.getOutputStream();
        X0.e.d(outputStream, "getOutputStream(...)");
        return new v1.c(tVar, new v1.c(outputStream, tVar));
    }

    public static final v1.d u(Socket socket) {
        Logger logger = v1.m.f4066a;
        v1.t tVar = new v1.t(socket);
        InputStream inputStream = socket.getInputStream();
        X0.e.d(inputStream, "getInputStream(...)");
        return new v1.d(tVar, 0, new v1.d(inputStream, 1, tVar));
    }

    public abstract boolean c(p.g gVar, p.c cVar);

    public abstract boolean d(p.g gVar, Object obj, Object obj2);

    public abstract boolean e(p.g gVar, p.f fVar, p.f fVar2);

    public float j(View view) {
        if (f2491c) {
            try {
                return AbstractC0202x.a(view);
            } catch (NoSuchMethodError unused) {
                f2491c = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void p(p.f fVar, p.f fVar2);

    public abstract void q(p.f fVar, Thread thread);

    public void r(View view, float f2) {
        if (f2491c) {
            try {
                AbstractC0202x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2491c = false;
            }
        }
        view.setAlpha(f2);
    }

    public void s(View view, int i) {
        if (!f2492e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2492e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
