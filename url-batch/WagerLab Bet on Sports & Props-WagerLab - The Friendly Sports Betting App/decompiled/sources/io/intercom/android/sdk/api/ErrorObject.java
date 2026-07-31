package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import retrofit2.Response;

/* loaded from: classes8.dex */
public class ErrorObject {
    private final String errorBody;
    private final int statusCode;
    private final Throwable throwable;
    private final Twig twig = LumberMill.getLogger();

    public ErrorObject(Throwable th, Response response) {
        this.throwable = th;
        this.errorBody = parseErrorBody(response);
        this.statusCode = parseStatusCode(response);
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    String getErrorBody() {
        return this.errorBody;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    boolean hasErrorBody() {
        return this.errorBody != null;
    }

    private int parseStatusCode(Response response) {
        if (response != null) {
            return response.code();
        }
        return -1;
    }

    private String parseErrorBody(Response response) {
        if (response == null || response.errorBody() == null) {
            return null;
        }
        try {
            return response.errorBody().string();
        } catch (IOException e) {
            this.twig.internal("Couldn't parse error body: " + e.getMessage());
            return null;
        }
    }
}
