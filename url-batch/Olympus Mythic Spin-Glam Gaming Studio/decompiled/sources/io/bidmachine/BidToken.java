package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.utils.task.CancelableTask;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class BidToken implements ExpirationHandler.Listener {

    @NonNull
    private final AdRequest<?, ?, ?> adRequest;

    @NonNull
    private final ExpirationHandler expirationHandler;

    @NonNull
    private final ExpirationListener<BidToken> expirationListener;

    @NonNull
    private final String id = UUID.randomUUID().toString();

    private static class b implements ExpirationHandler.TaskScheduler {
        private b() {
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void cancelTask(CancelableTask cancelableTask) {
            BidTokenTaskManager.cancel(cancelableTask);
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void scheduleTask(CancelableTask cancelableTask, long j) {
            BidTokenTaskManager.schedule(cancelableTask, j, TimeUnit.MILLISECONDS);
        }
    }

    BidToken(@NonNull AdRequest<?, ?, ?> adRequest, int i, @NonNull ExpirationListener<BidToken> expirationListener) {
        this.adRequest = adRequest;
        this.expirationHandler = new ExpirationHandler(TimeUnit.SECONDS.toMillis(i), this, new b());
        this.expirationListener = expirationListener;
    }

    void destroyAdRequest() {
        this.adRequest.clearNetworkAdUnits();
        this.adRequest.destroy();
    }

    @NonNull
    public AdRequest<?, ?, ?> getAdRequest() {
        return this.adRequest;
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.expirationListener.onExpired(this);
    }

    void startExpiration() {
        this.expirationHandler.start();
    }

    void stopExpiration() {
        this.expirationHandler.stop();
    }
}
