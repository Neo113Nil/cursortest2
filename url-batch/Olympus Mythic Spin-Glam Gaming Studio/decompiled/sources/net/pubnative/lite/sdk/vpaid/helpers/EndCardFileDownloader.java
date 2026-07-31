package net.pubnative.lite.sdk.vpaid.helpers;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.safedk.android.internal.partials.VerveNetworkBridge;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes6.dex */
public class EndCardFileDownloader {
    private static final String TAG = "EndCardFileDownloader";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static Bitmap mLoad(String str) {
        HttpURLConnection httpURLConnection;
        ?? mStringToURL = mStringToURL(str);
        try {
            if (mStringToURL == 0) {
                return null;
            }
            try {
                httpURLConnection = (HttpURLConnection) mStringToURL.openConnection();
                try {
                    httpURLConnection.connect();
                    Bitmap decodeStream = BitmapFactory.decodeStream(new BufferedInputStream(VerveNetworkBridge.urlConnectionGetInputStream(httpURLConnection)));
                    VerveNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    return decodeStream;
                } catch (IOException e) {
                    e = e;
                    Logger.e(TAG, e.getMessage());
                    if (httpURLConnection != null) {
                        VerveNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    }
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                mStringToURL = 0;
                if (mStringToURL != 0) {
                    VerveNetworkBridge.httpUrlConnectionDisconnect(mStringToURL);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static URL mStringToURL(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            Logger.e(TAG, e.getMessage());
            return null;
        }
    }
}
