package o;

import com.google.firebase.database.core.ValidationPath;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;

/* renamed from: o.sN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1888sN {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static final boolean a(int i) {
        return i == 6 || i == 4;
    }

    public static /* synthetic */ int b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static /* synthetic */ boolean c(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ int d(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return 16;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return 32;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return 64;
            case 8:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                return Integer.MIN_VALUE;
            default:
                throw null;
        }
    }

    public static int e(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static FieldDescriptor f(int i, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i).build()).build();
    }

    public static String g(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String h(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String i(String str, long j) {
        return str + j;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(VM vm, Class cls, StringBuilder sb) {
        sb.append(vm.b(cls));
        return sb.toString();
    }

    public static StringBuilder n(String str, String str2) {
        AbstractC0048Bt.m(str, str2);
        return new StringBuilder();
    }

    public static /* synthetic */ void o(int i) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        AbstractC0048Bt.Z(nullPointerException, AbstractC0048Bt.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void p(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC0048Bt.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            AbstractC0048Bt.Z(nullPointerException, AbstractC0048Bt.class.getName());
            throw nullPointerException;
        }
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void r(StringBuilder sb, int i, String str, String str2, String str3) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static String s(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ void t(int i, String str) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(j(str, " must not be null"));
        AbstractC0048Bt.Z(nullPointerException, AbstractC0048Bt.class.getName());
        throw nullPointerException;
    }

    public static void u(StringBuilder sb, int i, String str, String str2, String str3) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        AbstractC1052fg.T(sb.toString());
        throw null;
    }

    public static /* synthetic */ int v(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SYNTHESIZED" : "DELEGATION" : "FAKE_OVERRIDE" : "DECLARATION";
    }

    public static /* synthetic */ int[] x(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }
}
