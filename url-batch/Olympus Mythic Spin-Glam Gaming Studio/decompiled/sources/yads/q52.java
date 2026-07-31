package yads;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class q52 {
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vf3 a(Throwable th) {
        vf3 vf3Var;
        vf3 vf3Var2;
        boolean z;
        if (th instanceof ne2) {
            Throwable cause = th.getCause();
            if (cause != null && (((z = cause instanceof MediaCodec.CodecException)) || (cause instanceof IllegalStateException) || (cause instanceof IllegalArgumentException))) {
                StackTraceElement[] stackTrace = cause.getStackTrace();
                if (stackTrace.length != 0 && stackTrace[0].isNativeMethod() && Intrinsics.areEqual(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
                    String methodName = stackTrace[0].getMethodName();
                    if (methodName == null) {
                        methodName = "";
                    }
                    if (Intrinsics.areEqual(methodName, "native_dequeueOutputBuffer")) {
                        vf3Var2 = vf3.b;
                    } else if (Intrinsics.areEqual(methodName, "native_dequeueInputBuffer")) {
                        vf3Var2 = vf3.c;
                    } else if (Intrinsics.areEqual(methodName, "native_stop")) {
                        vf3Var2 = vf3.d;
                    } else if (Intrinsics.areEqual(methodName, "native_setSurface")) {
                        vf3Var2 = vf3.e;
                    } else if (Intrinsics.areEqual(methodName, "releaseOutputBuffer")) {
                        vf3Var2 = vf3.f;
                    } else if (Intrinsics.areEqual(methodName, "native_queueSecureInputBuffer")) {
                        vf3Var2 = vf3.g;
                    } else if (z) {
                        vf3Var2 = vf3.h;
                    }
                    if (vf3Var2 == null) {
                        return vf3Var2;
                    }
                    Throwable cause2 = th.getCause();
                    vf3 a = cause2 != null ? a(cause2) : null;
                    if (a != null) {
                        return a;
                    }
                    vf3Var = vf3.E;
                }
            }
            vf3Var2 = null;
            if (vf3Var2 == null) {
            }
        } else if (th instanceof h21) {
            vf3Var = vf3.j;
        } else if (th instanceof lk1) {
            vf3Var = vf3.k;
        } else if (th instanceof fk1) {
            vf3Var = vf3.l;
        } else if (th instanceof ro) {
            vf3Var = vf3.n;
        } else if (th instanceof MediaCodec.CryptoException) {
            vf3Var = vf3.o;
        } else if (th instanceof wk0) {
            Throwable cause3 = ((wk0) th).getCause();
            vf3Var = cause3 == null ? vf3.q : ((cause3 instanceof MediaDrmResetException) || (cause3 instanceof ResourceBusyException)) ? vf3.p : !(cause3 instanceof MediaCodec.CryptoException) ? vf3.q : vf3.o;
        } else if (th instanceof x01) {
            int i = ((x01) th).e;
            vf3Var = i == 401 ? vf3.s : i == 403 ? vf3.t : i == 404 ? vf3.u : vf3.v;
        } else if (th instanceof v01) {
            vf3Var = ((v01) th).getCause() instanceof SSLHandshakeException ? vf3.w : vf3.x;
        } else if (th instanceof cc2) {
            vf3Var = vf3.y;
        } else if (th instanceof fg1) {
            vf3Var = vf3.z;
        } else {
            if (th instanceof ck ? true : th instanceof dk) {
                vf3Var = vf3.A;
            } else if (th instanceof e53) {
                vf3Var = vf3.B;
            } else {
                vf3Var = th instanceof yq ? true : th instanceof cr ? vf3.C : vf3.F;
            }
        }
        return vf3Var;
    }
}
