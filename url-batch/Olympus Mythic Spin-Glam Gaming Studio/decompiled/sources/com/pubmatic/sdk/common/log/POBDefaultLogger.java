package com.pubmatic.sdk.common.log;

import android.util.Log;
import androidx.annotation.Keep;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.log.POBLog;

@Keep
/* loaded from: classes12.dex */
class POBDefaultLogger implements POBLog.POBLogging {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OpenWrapSDK.LogLevel.values().length];
            a = iArr;
            try {
                iArr[OpenWrapSDK.LogLevel.Info.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[OpenWrapSDK.LogLevel.Warn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[OpenWrapSDK.LogLevel.Debug.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[OpenWrapSDK.LogLevel.Verbose.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    POBDefaultLogger() {
    }

    @Override // com.pubmatic.sdk.common.log.POBLog.POBLogging
    public void log(POBLog.POBLogMessage pOBLogMessage) {
        int i = a.a[pOBLogMessage.mLogLevel.ordinal()];
        if (i == 1) {
            Log.i(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        } else if (i == 2) {
            Log.w(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        } else if (i == 3) {
            Log.d(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        } else if (i == 4) {
            Log.v(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        }
        if (pOBLogMessage.mLogLevel == OpenWrapSDK.LogLevel.Error) {
            Log.e(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        }
    }
}
