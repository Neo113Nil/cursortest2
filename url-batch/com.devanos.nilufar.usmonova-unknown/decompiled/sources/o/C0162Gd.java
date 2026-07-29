package o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: o.Gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162Gd extends X {
    public final int h;
    public final int i;
    public final PendingIntent j;
    public final String k;
    public static final C0162Gd l = new C0162Gd(0);
    public static final Parcelable.Creator<C0162Gd> CREATOR = new J1(16);

    public C0162Gd(int i, int i2, PendingIntent pendingIntent, String str) {
        this.h = i;
        this.i = i2;
        this.j = pendingIntent;
        this.k = str;
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return AbstractC1888sN.h(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0162Gd)) {
            return false;
        }
        C0162Gd c0162Gd = (C0162Gd) obj;
        return this.i == c0162Gd.i && EB.o(this.j, c0162Gd.j) && EB.o(this.k, c0162Gd.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), this.j, this.k});
    }

    public final String toString() {
        C0208Hx c0208Hx = new C0208Hx(12, this);
        c0208Hx.H0(a(this.i), "statusCode");
        c0208Hx.H0(this.j, "resolution");
        c0208Hx.H0(this.k, "message");
        return c0208Hx.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.t(parcel, 1, 4);
        parcel.writeInt(this.h);
        ZM.t(parcel, 2, 4);
        parcel.writeInt(this.i);
        ZM.o(parcel, 3, this.j, i);
        ZM.p(parcel, 4, this.k);
        ZM.s(parcel, r);
    }

    public C0162Gd(int i) {
        this(1, i, null, null);
    }

    public C0162Gd(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
