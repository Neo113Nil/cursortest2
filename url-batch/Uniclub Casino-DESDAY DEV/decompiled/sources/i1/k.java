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

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static long f2450a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2451b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2452c = true;
    public static Field d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2453e;

    public static final void a(l1.a aVar, l1.c cVar, String str) {
        l1.d.i.fine(cVar.f3183b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3177a);
    }

    public static final boolean b(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        X0.d.e(bArr, "a");
        X0.d.e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static void f(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(j1.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static final void g(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static void h(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(j1.b.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(j1.b.o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final String i(long j2) {
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

    public static int j(Context context, int i, int i2) {
        Integer num;
        TypedValue k02 = q1.l.k0(context, i);
        if (k02 != null) {
            int i3 = k02.resourceId;
            num = Integer.valueOf(i3 != 0 ? A.b.a(context, i3) : k02.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static int k(View view, int i) {
        Context context = view.getContext();
        TypedValue o02 = q1.l.o0(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = o02.resourceId;
        return i2 != 0 ? A.b.a(context, i2) : o02.data;
    }

    public static final boolean m(AssertionError assertionError) {
        Logger logger = v1.m.f4064a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? e1.d.i0(message, "getsockname failed") : false;
    }

    public static boolean n(int i) {
        boolean z2;
        if (i != 0) {
            ThreadLocal threadLocal = C.a.f52a;
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

    public static boolean o() {
        boolean isEnabled;
        try {
            if (f2451b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2451b == null) {
                f2450a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2451b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2451b.invoke(null, Long.valueOf(f2450a))).booleanValue();
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

    public static int p(int i, int i2, float f2) {
        return C.a.b(C.a.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static l q(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = e1.d.w0(str).toString();
        }
        int N2 = q1.l.N(0, strArr2.length - 1, 2);
        if (N2 >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                f(str2);
                h(str3, str2);
                if (i == N2) {
                    break;
                }
                i += 2;
            }
        }
        return new l(strArr2);
    }

    public static final boolean r(String str) {
        X0.d.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final v1.c w(Socket socket) {
        Logger logger = v1.m.f4064a;
        v1.u uVar = new v1.u(socket);
        OutputStream outputStream = socket.getOutputStream();
        X0.d.d(outputStream, "getOutputStream(...)");
        return new v1.c(uVar, new v1.c(outputStream, uVar));
    }

    public static final v1.d x(Socket socket) {
        Logger logger = v1.m.f4064a;
        v1.u uVar = new v1.u(socket);
        InputStream inputStream = socket.getInputStream();
        X0.d.d(inputStream, "getInputStream(...)");
        return new v1.d(uVar, 0, new v1.d(inputStream, 1, uVar));
    }

    public abstract boolean c(p.g gVar, p.c cVar);

    public abstract boolean d(p.g gVar, Object obj, Object obj2);

    public abstract boolean e(p.g gVar, p.f fVar, p.f fVar2);

    public float l(View view) {
        if (f2452c) {
            try {
                return k0.x.a(view);
            } catch (NoSuchMethodError unused) {
                f2452c = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void s(p.f fVar, p.f fVar2);

    public abstract void t(p.f fVar, Thread thread);

    public void u(View view, float f2) {
        if (f2452c) {
            try {
                k0.x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2452c = false;
            }
        }
        view.setAlpha(f2);
    }

    public void v(View view, int i) {
        if (!f2453e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2453e = true;
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
