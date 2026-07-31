package yads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

/* loaded from: classes14.dex */
public final class op2 implements Parcelable {
    public static final Parcelable.Creator<op2> CREATOR = new np2();
    public final int b;

    public op2(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r5.hasCapability(16) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Context context) {
        int i;
        Intent registerReceiver;
        int intExtra;
        if ((this.b & 1) != 0) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (sb3.a >= 24) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        try {
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities != null) {
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                }
                if ((this.b & 2) != 0 && connectivityManager.isActiveNetworkMetered()) {
                    i = 2;
                    if ((this.b & 8) != 0 && ((registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
                        i |= 8;
                    }
                    if ((this.b & 4) != 0) {
                        Object systemService2 = context.getSystemService("power");
                        systemService2.getClass();
                        PowerManager powerManager = (PowerManager) systemService2;
                        int i2 = sb3.a;
                        if (!(i2 >= 23 ? powerManager.isDeviceIdleMode() : i2 < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive())) {
                            i |= 4;
                        }
                    }
                    if ((this.b & 16) != 0) {
                        return !(context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i | 16 : i;
                    }
                    return i;
                }
            }
            i = this.b & 3;
            if ((this.b & 8) != 0) {
                i |= 8;
            }
            if ((this.b & 4) != 0) {
            }
            if ((this.b & 16) != 0) {
            }
        }
        i = 0;
        if ((this.b & 8) != 0) {
        }
        if ((this.b & 4) != 0) {
        }
        if ((this.b & 16) != 0) {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && op2.class == obj.getClass() && this.b == ((op2) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
