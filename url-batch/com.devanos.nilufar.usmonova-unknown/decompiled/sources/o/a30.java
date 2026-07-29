package o;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class a30 extends AbstractBinderC1144h20 implements H20 {
    public final int b;

    public a30(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o.AbstractBinderC1144h20
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.b);
            return true;
        }
        BinderC2276yF binderC2276yF = new BinderC2276yF(f());
        parcel2.writeNoException();
        int i2 = O20.a;
        parcel2.writeStrongBinder(binderC2276yF);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof H20)) {
            try {
                H20 h20 = (H20) obj;
                if (((a30) h20).b == this.b) {
                    return Arrays.equals(f(), (byte[]) new BinderC2276yF(((a30) h20).f()).b);
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public abstract byte[] f();

    public final int hashCode() {
        return this.b;
    }
}
