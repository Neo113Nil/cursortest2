package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes8.dex */
public abstract class BaseCallback<T> implements Callback<T> {
    private final Twig twig = LumberMill.getLogger();

    protected void onError(ErrorObject errorObject) {
    }

    protected abstract void onSuccess(T t);

    void logFailure(String str, ErrorObject errorObject) {
        this.twig.e(str + ": " + getDetails(errorObject), new Object[0]);
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call<T> call, Response<T> response) {
        if (response == null) {
            handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), null));
            return;
        }
        if (response.body() == null) {
            handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), response));
        } else if (!response.isSuccessful()) {
            handleError(new ErrorObject(new Exception("Status code outside the 200-300 range"), response));
        } else {
            onSuccess(response.body());
        }
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call<T> call, Throwable th) {
        handleError(new ErrorObject(th, null));
    }

    private void handleError(ErrorObject errorObject) {
        logFailure("Api call failed", errorObject);
        onError(errorObject);
    }

    static String getDetails(ErrorObject errorObject) {
        String message;
        if (errorObject.hasErrorBody()) {
            message = errorObject.getErrorBody();
        } else {
            message = errorObject.getThrowable().getMessage();
        }
        return message == null ? "unknown error" : message;
    }
}
