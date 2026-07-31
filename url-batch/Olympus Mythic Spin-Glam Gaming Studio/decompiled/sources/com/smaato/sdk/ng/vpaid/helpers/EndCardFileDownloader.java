package com.smaato.sdk.ng.vpaid.helpers;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.safedk.android.internal.partials.SmaatoNetworkBridge;
import com.smaato.sdk.ng.utils.Logger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes12.dex */
public class EndCardFileDownloader {
    private static final String a = "EndCardFileDownloader";

    private static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            Logger.e(a, e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static Bitmap mLoad(String str) {
        HttpURLConnection httpURLConnection;
        ?? a2 = a(str);
        try {
            if (a2 == 0) {
                return null;
            }
            try {
                httpURLConnection = (HttpURLConnection) a2.openConnection();
                try {
                    httpURLConnection.connect();
                    Bitmap decodeStream = BitmapFactory.decodeStream(new BufferedInputStream(SmaatoNetworkBridge.urlConnectionGetInputStream(httpURLConnection)));
                    SmaatoNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    return decodeStream;
                } catch (IOException e) {
                    e = e;
                    Logger.e(a, e.getMessage());
                    if (httpURLConnection != null) {
                        SmaatoNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    }
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                a2 = 0;
                if (a2 != 0) {
                    SmaatoNetworkBridge.httpUrlConnectionDisconnect(a2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
