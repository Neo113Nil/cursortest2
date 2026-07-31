package com.yandex.div.core.view2.errors;

import android.os.TransactionTooLargeException;
import kotlin.Metadata;

/* compiled from: ErrorVisualMonitor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"MIN_SIZE_FOR_DETAILS_DP", "", "SHOW_LIMIT", "fullStackMessage", "", "", "getFullStackMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "causedByTransactionTooLargeException", "", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorVisualMonitorKt {
    private static final int MIN_SIZE_FOR_DETAILS_DP = 150;
    private static final int SHOW_LIMIT = 25;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFullStackMessage(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb.append('\n');
            sb.append(cause.getMessage());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean causedByTransactionTooLargeException(Throwable th) {
        if (th instanceof TransactionTooLargeException) {
            return true;
        }
        Throwable cause = th.getCause();
        return cause != null && causedByTransactionTooLargeException(cause);
    }
}
