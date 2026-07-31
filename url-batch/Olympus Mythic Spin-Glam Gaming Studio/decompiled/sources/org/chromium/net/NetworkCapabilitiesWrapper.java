package org.chromium.net;

import android.net.NetworkCapabilities;

/* loaded from: classes11.dex */
class NetworkCapabilitiesWrapper {
    private final long mNetworkCapabilities;
    private final long mTransportTypes;
    private final NetworkCapabilities mWrapped;

    NetworkCapabilitiesWrapper(int[] iArr, int[] iArr2) {
        this.mNetworkCapabilities = packIntoLong(iArr);
        this.mTransportTypes = packIntoLong(iArr2);
        this.mWrapped = null;
    }

    NetworkCapabilitiesWrapper(NetworkCapabilities networkCapabilities) {
        this.mWrapped = networkCapabilities;
        this.mNetworkCapabilities = -1L;
        this.mTransportTypes = -1L;
    }

    public boolean hasCapability(int i) {
        NetworkCapabilities networkCapabilities = this.mWrapped;
        if (networkCapabilities != null) {
            return networkCapabilities.hasCapability(i);
        }
        return i >= 0 && i < 64 && (this.mNetworkCapabilities & (1 << i)) != 0;
    }

    public boolean hasTransport(int i) {
        NetworkCapabilities networkCapabilities = this.mWrapped;
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(i);
        }
        return i >= 0 && i < 64 && (this.mTransportTypes & ((long) (1 << i))) != 0;
    }

    private static long packIntoLong(int[] iArr) {
        long j = 0;
        for (int i : iArr) {
            j |= 1 << i;
        }
        return j;
    }
}
