package org.chromium.net.impl;

import androidx.annotation.RequiresExtension;
import androidx.media3.datasource.HttpEngineDataSource$UrlRequestCallback$$ExternalSyntheticApiModelOutline0;
import androidx.media3.datasource.HttpEngineDataSource$UrlRequestCallback$$ExternalSyntheticApiModelOutline1;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;

@RequiresExtension
/* loaded from: classes4.dex */
class CronetExceptionTranslationUtils {

    interface CronetWork<T, E extends Exception> {
        T run() throws Exception;
    }

    public static <T, E extends Exception> T executeTranslatingCronetExceptions(CronetWork<T, E> cronetWork, Class<E> cls) throws CronetException, Exception {
        try {
            return cronetWork.run();
        } catch (Exception e) {
            if (isUncheckedAndroidCronetException(e)) {
                throw translateUncheckedAndroidCronetException(e);
            }
            if (isCheckedAndroidCronetException(e)) {
                throw translateCheckedAndroidCronetException(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static boolean isUncheckedAndroidCronetException(Exception exc) {
        return CronetExceptionTranslationUtils$$ExternalSyntheticApiModelOutline0.m(exc);
    }

    public static boolean isCheckedAndroidCronetException(Exception exc) {
        return CronetExceptionTranslationUtils$$ExternalSyntheticApiModelOutline4.m(exc);
    }

    public static RuntimeException translateUncheckedAndroidCronetException(Exception exc) {
        if (!isUncheckedAndroidCronetException(exc)) {
            throw new IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (CronetExceptionTranslationUtils$$ExternalSyntheticApiModelOutline0.m(exc)) {
            InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
            inlineExecutionProhibitedException.initCause(exc);
            return inlineExecutionProhibitedException;
        }
        throw new UnsupportedOperationException("Unchecked exception translation discrepancy", exc);
    }

    public static CronetException translateCheckedAndroidCronetException(Exception exc) {
        if (!isCheckedAndroidCronetException(exc)) {
            throw new IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (AndroidNetworkExceptionWrapper$$ExternalSyntheticApiModelOutline2.m(exc)) {
            return new AndroidQuicExceptionWrapper(CronetExceptionTranslationUtils$$ExternalSyntheticApiModelOutline1.m(exc));
        }
        if (HttpEngineDataSource$UrlRequestCallback$$ExternalSyntheticApiModelOutline0.m(exc)) {
            return new AndroidNetworkExceptionWrapper(HttpEngineDataSource$UrlRequestCallback$$ExternalSyntheticApiModelOutline1.m(exc));
        }
        if (CronetExceptionTranslationUtils$$ExternalSyntheticApiModelOutline2.m(exc)) {
            return new AndroidCallbackExceptionWrapper(CronetExceptionTranslationUtils$$ExternalSyntheticApiModelOutline3.m(exc));
        }
        if (CronetExceptionTranslationUtils$$ExternalSyntheticApiModelOutline4.m(exc)) {
            return new AndroidHttpExceptionWrapper(CronetExceptionTranslationUtils$$ExternalSyntheticApiModelOutline5.m(exc));
        }
        throw new UnsupportedOperationException("Checked exception translation discrepancy", exc);
    }

    private CronetExceptionTranslationUtils() {
    }
}
