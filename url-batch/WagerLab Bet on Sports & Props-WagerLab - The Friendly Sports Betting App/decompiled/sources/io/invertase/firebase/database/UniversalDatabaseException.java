package io.invertase.firebase.database;

import com.facebook.login.LoginLogger;

/* loaded from: classes8.dex */
public class UniversalDatabaseException extends Exception {
    private final String code;
    private final String message;

    UniversalDatabaseException(int i, String str, Throwable th) {
        super(str, th);
        String str2;
        String str3;
        if (i == -25) {
            str2 = "write-cancelled";
            str3 = "The write was canceled by the user.";
        } else if (i == -24) {
            str2 = "network-error";
            str3 = "The operation could not be performed due to a network error.";
        } else if (i == -4) {
            str2 = "disconnected";
            str3 = "The operation had to be aborted due to a network disconnect.";
        } else if (i == -3) {
            str2 = "permission-denied";
            str3 = "Client doesn't have permission to access the desired data.";
        } else if (i == -2) {
            str2 = LoginLogger.EVENT_EXTRAS_FAILURE;
            str3 = "The server indicated that this operation failed.";
        } else if (i == -1) {
            str2 = "data-stale";
            str3 = "The transaction needs to be run again with current data.";
        } else {
            switch (i) {
                case -10:
                    str2 = "unavailable";
                    str3 = "The service is unavailable.";
                    break;
                case -9:
                    str2 = "overridden-by-set";
                    str3 = "The transaction was overridden by a subsequent set.";
                    break;
                case -8:
                    str2 = "max-retries";
                    str3 = "The transaction had too many retries.";
                    break;
                case -7:
                    str2 = "invalid-token";
                    str3 = "The supplied auth token was invalid.";
                    break;
                case -6:
                    str2 = "expired-token";
                    str3 = "The supplied auth token has expired.";
                    break;
                default:
                    str2 = "unknown";
                    str3 = "An unknown error occurred";
                    break;
            }
        }
        this.code = str2;
        this.message = str3;
    }

    public String getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
