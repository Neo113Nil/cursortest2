package o;

import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.kT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367kT implements PC {
    public static final C1367kT h;

    static {
        C1301jT c1301jT = C1301jT.h;
        h = new C1367kT();
    }

    @Override // o.PC
    public final ByteBuffer b(Object obj) {
        C1237iT c1237iT = new C1237iT();
        c1237iT.write(0);
        C1301jT c1301jT = C1301jT.h;
        C1301jT.j(c1237iT, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c1237iT.size());
        allocateDirect.put(c1237iT.b(), 0, c1237iT.size());
        return allocateDirect;
    }

    @Override // o.PC
    public final ByteBuffer c(String str, String str2) {
        C1237iT c1237iT = new C1237iT();
        c1237iT.write(1);
        C1301jT c1301jT = C1301jT.h;
        C1301jT.j(c1237iT, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        C1301jT.j(c1237iT, str);
        C1301jT.j(c1237iT, null);
        C1301jT.j(c1237iT, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c1237iT.size());
        allocateDirect.put(c1237iT.b(), 0, c1237iT.size());
        return allocateDirect;
    }

    @Override // o.PC
    public final ByteBuffer f(String str, String str2, Object obj) {
        C1237iT c1237iT = new C1237iT();
        c1237iT.write(1);
        C1301jT c1301jT = C1301jT.h;
        C1301jT.j(c1237iT, str);
        C1301jT.j(c1237iT, str2);
        if (obj instanceof Throwable) {
            C1301jT.j(c1237iT, Log.getStackTraceString((Throwable) obj));
        } else {
            C1301jT.j(c1237iT, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c1237iT.size());
        allocateDirect.put(c1237iT.b(), 0, c1237iT.size());
        return allocateDirect;
    }

    @Override // o.PC
    public final ByteBuffer g(C0208Hx c0208Hx) {
        C1237iT c1237iT = new C1237iT();
        C1301jT c1301jT = C1301jT.h;
        C1301jT.j(c1237iT, (String) c0208Hx.i);
        C1301jT.j(c1237iT, c0208Hx.j);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c1237iT.size());
        allocateDirect.put(c1237iT.b(), 0, c1237iT.size());
        return allocateDirect;
    }

    @Override // o.PC
    public final C0208Hx h(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        C1301jT c1301jT = C1301jT.h;
        Serializable c = C1301jT.c(byteBuffer);
        Serializable c2 = C1301jT.c(byteBuffer);
        if (!(c instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new C0208Hx((String) c, 5, c2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // o.PC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b = byteBuffer.get();
        if (b == 0) {
            C1301jT c1301jT = C1301jT.h;
            Serializable c = C1301jT.c(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return c;
            }
        }
        C1301jT c1301jT2 = C1301jT.h;
        Serializable c2 = C1301jT.c(byteBuffer);
        Serializable c3 = C1301jT.c(byteBuffer);
        Serializable c4 = C1301jT.c(byteBuffer);
        if ((c2 instanceof String) && ((c3 == null || (c3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new C1191hn((String) c2, (String) c3, c4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
