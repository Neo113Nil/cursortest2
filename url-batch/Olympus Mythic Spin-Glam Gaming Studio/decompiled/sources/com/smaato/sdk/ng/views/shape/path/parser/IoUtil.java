package com.smaato.sdk.ng.views.shape.path.parser;

import com.smaato.sdk.ng.NextGen;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class IoUtil {
    public static final void closeQuitely(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable th) {
                NextGen.reportException(th);
            }
        }
    }
}
