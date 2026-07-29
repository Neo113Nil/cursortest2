package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import o.AbstractC2188wx;
import o.C0162Gd;
import o.C0208Hx;
import o.C1161hJ;
import o.EB;
import o.J1;
import o.X;
import o.ZM;

/* loaded from: classes.dex */
public final class Status extends X implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new J1(17);
    public final int h;
    public final String i;
    public final PendingIntent j;
    public final C0162Gd k;

    public Status(int i, String str, PendingIntent pendingIntent, C0162Gd c0162Gd) {
        this.h = i;
        this.i = str;
        this.j = pendingIntent;
        this.k = c0162Gd;
    }

    public final String a() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        int i = this.h;
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return AbstractC2188wx.g(i, "unknown status code: ");
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
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.h == status.h && EB.o(this.i, status.i) && EB.o(this.j, status.j) && EB.o(this.k, status.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), this.i, this.j, this.k});
    }

    public final String toString() {
        C0208Hx c0208Hx = new C0208Hx(12, this);
        c0208Hx.H0(a(), "statusCode");
        c0208Hx.H0(this.j, "resolution");
        return c0208Hx.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.t(parcel, 1, 4);
        parcel.writeInt(this.h);
        ZM.p(parcel, 2, this.i);
        ZM.o(parcel, 3, this.j, i);
        ZM.o(parcel, 4, this.k, i);
        ZM.s(parcel, r);
    }
}
