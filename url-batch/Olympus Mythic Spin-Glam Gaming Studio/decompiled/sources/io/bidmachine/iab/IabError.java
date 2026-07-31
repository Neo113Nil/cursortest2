package io.bidmachine.iab;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class IabError {
    public static final int ERROR_CODE_BAD_CONTENT = 3;
    public static final int ERROR_CODE_EXPIRED = 6;
    public static final int ERROR_CODE_INCORRECT_STATE = 4;
    public static final int ERROR_CODE_INTERNAL = 0;
    public static final int ERROR_CODE_NO_FILL = 7;
    public static final int ERROR_CODE_NO_NETWORK = 1;
    public static final int ERROR_CODE_NO_REQUIRED_ARGUMENTS = 2;
    public static final int ERROR_CODE_PLACEHOLDER_TIMEOUT = 5;

    @NonNull
    public static final IabError NO_NETWORK = new IabError(1, "No internet connection");
    private final int a;
    private final String b;

    public IabError(int i, @NonNull String str) {
        this.a = i;
        this.b = str;
    }

    @NonNull
    public static IabError badContent(@NonNull String str) {
        return new IabError(3, str);
    }

    @NonNull
    public static IabError expired(@NonNull String str) {
        return new IabError(6, str);
    }

    @NonNull
    public static IabError incorrectState(@NonNull String str) {
        return new IabError(4, str);
    }

    @NonNull
    public static IabError internal(@NonNull String str) {
        return new IabError(0, str);
    }

    @NonNull
    public static IabError noFIll(@NonNull String str) {
        return new IabError(7, str);
    }

    @NonNull
    public static IabError noRequiredArguments(@NonNull String str) {
        return new IabError(2, str);
    }

    @NonNull
    public static IabError placeholder(@NonNull String str) {
        return new IabError(5, str);
    }

    @NonNull
    public static IabError throwable(@NonNull String str, @Nullable Throwable th) {
        if (th != null) {
            try {
                StringBuilder sb = new StringBuilder(str);
                sb.append(" - ");
                sb.append(th.getClass().getName());
                String message = th.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    sb.append(": ");
                    sb.append(message);
                }
                return internal(sb.toString());
            } catch (Throwable unused) {
            }
        }
        return internal(str);
    }

    public int getCode() {
        return this.a;
    }

    @NonNull
    public String getMessage() {
        return this.b;
    }

    @NonNull
    public String toString() {
        return String.format("(%s) %s", Integer.valueOf(this.a), this.b);
    }
}
