package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class ShutdownInterceptor implements Interceptor {
    private static final String ERROR = "error";
    private static final String MESSAGE = "message";
    private static final String MESSENGER_SHUTDOWN_RESPONSE = "messenger_shutdown_response";
    private static final String SHUTDOWN_PERIOD = "shutdown_period";
    private static final String TYPE = "type";
    private final ShutdownState shutdownState;
    private final Twig twig = LumberMill.getLogger();

    public ShutdownInterceptor(ShutdownState shutdownState) {
        this.shutdownState = shutdownState;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (!this.shutdownState.canSendNetworkRequests()) {
            this.twig.e(this.shutdownState.getShutdownReason(), new Object[0]);
            throw new IOException(this.shutdownState.getShutdownReason());
        }
        Response proceed = chain.proceed(chain.request());
        if (!proceed.isSuccessful()) {
            ResponseBody body = proceed.body();
            String string = body.string();
            proceed = proceed.newBuilder().body(ResponseBody.create(body.get$contentType(), string)).build();
            body.close();
            try {
                JSONObject jSONObject = new JSONObject(string).getJSONObject("error");
                if (jSONObject.getString("type").equals(MESSENGER_SHUTDOWN_RESPONSE)) {
                    this.shutdownState.updateShutdownState(TimeUnit.SECONDS.toMillis(jSONObject.getLong(SHUTDOWN_PERIOD)), jSONObject.getString("message"));
                }
            } catch (JSONException unused) {
                this.twig.internal("Failed to deserialise error response: `" + string + "` message: `" + proceed.message() + "`");
            }
        }
        return proceed;
    }
}
