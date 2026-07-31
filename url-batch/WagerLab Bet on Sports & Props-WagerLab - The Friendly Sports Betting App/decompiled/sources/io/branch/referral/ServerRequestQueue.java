package io.branch.referral;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import io.branch.referral.Branch;
import io.branch.referral.BranchLogger;
import io.branch.referral.Defines;
import io.branch.referral.ServerRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ServerRequestQueue {
    private static final int MAX_ITEMS = 25;
    private static final String PREF_KEY = "BNCServerRequestQueue";
    private static ServerRequestQueue SharedInstance;
    private static final Object reqQueueLockObject = new Object();
    private SharedPreferences.Editor editor;
    private final List<ServerRequest> queue;
    private SharedPreferences sharedPref;
    private final Semaphore serverSema_ = new Semaphore(1);
    int networkCount_ = 0;
    final ConcurrentHashMap<String, String> instrumentationExtraData_ = new ConcurrentHashMap<>();

    public static ServerRequestQueue getInstance(Context context) {
        if (SharedInstance == null) {
            synchronized (ServerRequestQueue.class) {
                if (SharedInstance == null) {
                    SharedInstance = new ServerRequestQueue(context);
                }
            }
        }
        return SharedInstance;
    }

    static void shutDown() {
        synchronized (reqQueueLockObject) {
            SharedInstance = null;
        }
    }

    private ServerRequestQueue(Context context) {
        BranchLogger.v("Creating ServerRequestQueue " + context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("BNC_Server_Request_Queue", 0);
        this.sharedPref = sharedPreferences;
        this.editor = sharedPreferences.edit();
        List<ServerRequest> synchronizedList = Collections.synchronizedList(new LinkedList());
        this.queue = synchronizedList;
        BranchLogger.v("Created queue " + synchronizedList);
    }

    public int getSize() {
        int size;
        synchronized (reqQueueLockObject) {
            size = this.queue.size();
        }
        return size;
    }

    void enqueue(ServerRequest serverRequest) {
        synchronized (reqQueueLockObject) {
            BranchLogger.v("Queue operation enqueue. Request: " + serverRequest);
            if (serverRequest != null) {
                this.queue.add(serverRequest);
                if (getSize() >= 25) {
                    BranchLogger.v("Queue maxed out. Removing index 1.");
                    this.queue.remove(1);
                }
            }
        }
    }

    ServerRequest peek() {
        ServerRequest serverRequest;
        synchronized (reqQueueLockObject) {
            try {
                serverRequest = this.queue.get(0);
            } catch (IndexOutOfBoundsException | NoSuchElementException e) {
                BranchLogger.w("Caught Exception ServerRequestQueue peek: " + e.getMessage());
                serverRequest = null;
            }
        }
        return serverRequest;
    }

    public void printQueue() {
        if (BranchLogger.getLoggingLevel().getLevel() == BranchLogger.BranchLogLevel.VERBOSE.getLevel()) {
            synchronized (reqQueueLockObject) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < this.queue.size(); i++) {
                    sb.append(this.queue.get(i)).append(" with locks ").append(this.queue.get(i).printWaitLocks()).append("\n");
                }
                BranchLogger.v("Queue is: " + ((Object) sb));
            }
        }
    }

    ServerRequest peekAt(int i) {
        ServerRequest serverRequest;
        synchronized (reqQueueLockObject) {
            ServerRequest serverRequest2 = null;
            try {
                serverRequest = this.queue.get(i);
            } catch (IndexOutOfBoundsException e) {
                e = e;
            } catch (NoSuchElementException e2) {
                e = e2;
            }
            try {
                BranchLogger.v("Queue operation peekAt " + serverRequest);
            } catch (IndexOutOfBoundsException | NoSuchElementException e3) {
                e = e3;
                serverRequest2 = serverRequest;
                BranchLogger.e("Caught Exception ServerRequestQueue peekAt " + i + ": " + e.getMessage());
                serverRequest = serverRequest2;
                return serverRequest;
            }
        }
        return serverRequest;
    }

    void insert(ServerRequest serverRequest, int i) {
        synchronized (reqQueueLockObject) {
            try {
                BranchLogger.v("Queue operation insert. Request: " + serverRequest + " Size: " + this.queue.size() + " Index: " + i);
                if (this.queue.size() < i) {
                    i = this.queue.size();
                }
                this.queue.add(i, serverRequest);
            } catch (IndexOutOfBoundsException e) {
                BranchLogger.e("Caught IndexOutOfBoundsException " + e.getMessage());
            }
        }
    }

    public ServerRequest removeAt(int i) {
        ServerRequest serverRequest;
        synchronized (reqQueueLockObject) {
            try {
                serverRequest = this.queue.remove(i);
            } catch (IndexOutOfBoundsException e) {
                BranchLogger.e("Caught IndexOutOfBoundsException " + e.getMessage());
                serverRequest = null;
            }
        }
        return serverRequest;
    }

    public boolean remove(ServerRequest serverRequest) {
        boolean z;
        synchronized (reqQueueLockObject) {
            z = false;
            try {
                BranchLogger.v("Queue operation remove. Request: " + serverRequest);
                z = this.queue.remove(serverRequest);
                BranchLogger.v("Queue operation remove. Removed: " + z);
            } catch (UnsupportedOperationException e) {
                BranchLogger.e("Caught UnsupportedOperationException " + e.getMessage());
            }
        }
        return z;
    }

    void clear() {
        synchronized (reqQueueLockObject) {
            try {
                BranchLogger.v("Queue operation clear");
                this.queue.clear();
                BranchLogger.v("Queue cleared.");
            } catch (UnsupportedOperationException e) {
                BranchLogger.e("Caught UnsupportedOperationException " + e.getMessage());
            }
        }
    }

    ServerRequestInitSession getSelfInitRequest() {
        synchronized (reqQueueLockObject) {
            for (ServerRequest serverRequest : this.queue) {
                BranchLogger.v("Checking if " + serverRequest + " is instanceof ServerRequestInitSession");
                if (serverRequest instanceof ServerRequestInitSession) {
                    ServerRequestInitSession serverRequestInitSession = (ServerRequestInitSession) serverRequest;
                    BranchLogger.v(serverRequestInitSession + " is initiated by client: " + serverRequestInitSession.initiatedByClient);
                    if (serverRequestInitSession.initiatedByClient) {
                        return serverRequestInitSession;
                    }
                }
            }
            return null;
        }
    }

    void unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK process_wait_lock) {
        synchronized (reqQueueLockObject) {
            for (ServerRequest serverRequest : this.queue) {
                if (serverRequest != null) {
                    serverRequest.removeProcessWaitLock(process_wait_lock);
                }
            }
        }
    }

    public void postInitClear() {
        PrefHelper prefHelper = Branch.getInstance().getPrefHelper();
        boolean canClearInitData = canClearInitData();
        BranchLogger.v("postInitClear " + prefHelper + " can clear init data " + canClearInitData);
        if (prefHelper == null || !canClearInitData) {
            return;
        }
        prefHelper.setLinkClickIdentifier(PrefHelper.NO_STRING_VALUE);
        prefHelper.setGoogleSearchInstallIdentifier(PrefHelper.NO_STRING_VALUE);
        prefHelper.setAppStoreReferrer(PrefHelper.NO_STRING_VALUE);
        prefHelper.setExternalIntentUri(PrefHelper.NO_STRING_VALUE);
        prefHelper.setExternalIntentExtra(PrefHelper.NO_STRING_VALUE);
        prefHelper.setAppLink(PrefHelper.NO_STRING_VALUE);
        prefHelper.setPushIdentifier(PrefHelper.NO_STRING_VALUE);
        prefHelper.setInstallReferrerParams(PrefHelper.NO_STRING_VALUE);
        prefHelper.setIsFullAppConversion(false);
        prefHelper.setInitialReferrer(PrefHelper.NO_STRING_VALUE);
        if (prefHelper.getLong("bnc_previous_update_time") == 0) {
            prefHelper.setLong("bnc_previous_update_time", prefHelper.getLong("bnc_last_known_update_time"));
        }
    }

    void processNextQueueItem(String str) {
        BranchLogger.v("processNextQueueItem " + str);
        printQueue();
        try {
            this.serverSema_.acquire();
            if (this.networkCount_ == 0 && getSize() > 0) {
                this.networkCount_ = 1;
                ServerRequest peek = peek();
                this.serverSema_.release();
                if (peek != null) {
                    BranchLogger.d("processNextQueueItem, req " + peek);
                    if (!peek.isWaitingOnProcessToFinish()) {
                        if (!(peek instanceof ServerRequestRegisterInstall) && !hasUser()) {
                            BranchLogger.d("Branch Error: User session has not been initialized!");
                            this.networkCount_ = 0;
                            BranchLogger.v("Invoking " + peek + " handleFailure. Has no session. hasUser: " + hasUser());
                            peek.handleFailure(BranchError.ERR_NO_SESSION, "Request " + peek + " has no session.");
                            return;
                        }
                        if (requestNeedsSession(peek) && !isSessionAvailableForRequest()) {
                            this.networkCount_ = 0;
                            BranchLogger.v("Invoking " + peek + " handleFailure. Has no session.");
                            peek.handleFailure(BranchError.ERR_NO_SESSION, "Request " + peek + " has no session.");
                            return;
                        }
                        executeTimedBranchPostTask(peek, Branch.getInstance().prefHelper_.getTaskTimeout());
                        return;
                    }
                    this.networkCount_ = 0;
                    return;
                }
                remove(null);
                return;
            }
            this.serverSema_.release();
        } catch (Exception e) {
            BranchLogger.e("Caught Exception " + str + " processNextQueueItem: " + e.getMessage() + " stacktrace: " + BranchLogger.stackTraceToString(e));
        }
    }

    void insertRequestAtFront(ServerRequest serverRequest) {
        BranchLogger.v("Queue operation insertRequestAtFront " + serverRequest + " networkCount_: " + this.networkCount_);
        if (this.networkCount_ == 0) {
            insert(serverRequest, 0);
        } else {
            insert(serverRequest, 1);
        }
    }

    private boolean requestNeedsSession(ServerRequest serverRequest) {
        return ((serverRequest instanceof ServerRequestInitSession) || (serverRequest instanceof ServerRequestCreateUrl)) ? false : true;
    }

    private boolean isSessionAvailableForRequest() {
        return hasSession() && hasRandomizedDeviceToken();
    }

    private boolean hasSession() {
        return !Branch.getInstance().prefHelper_.getSessionID().equals(PrefHelper.NO_STRING_VALUE);
    }

    private boolean hasRandomizedDeviceToken() {
        return !Branch.getInstance().prefHelper_.getRandomizedDeviceToken().equals(PrefHelper.NO_STRING_VALUE);
    }

    boolean hasUser() {
        return !Branch.getInstance().prefHelper_.getRandomizedBundleToken().equals(PrefHelper.NO_STRING_VALUE);
    }

    void updateAllRequestsInQueue() {
        JSONObject post;
        for (int i = 0; i < getSize(); i++) {
            try {
                ServerRequest peekAt = peekAt(i);
                BranchLogger.v("Queue operation updateAllRequestsInQueue updating: " + peekAt);
                if (peekAt != null && (post = peekAt.getPost()) != null) {
                    if (post.has(Defines.Jsonkey.SessionID.getKey())) {
                        peekAt.getPost().put(Defines.Jsonkey.SessionID.getKey(), Branch.getInstance().prefHelper_.getSessionID());
                    }
                    if (post.has(Defines.Jsonkey.RandomizedBundleToken.getKey())) {
                        peekAt.getPost().put(Defines.Jsonkey.RandomizedBundleToken.getKey(), Branch.getInstance().prefHelper_.getRandomizedBundleToken());
                    }
                    if (post.has(Defines.Jsonkey.RandomizedDeviceToken.getKey())) {
                        peekAt.getPost().put(Defines.Jsonkey.RandomizedDeviceToken.getKey(), Branch.getInstance().prefHelper_.getRandomizedDeviceToken());
                    }
                }
            } catch (JSONException e) {
                BranchLogger.e("Caught JSONException " + e.getMessage());
                return;
            }
        }
    }

    private void executeTimedBranchPostTask(ServerRequest serverRequest, final int i) {
        BranchLogger.v("executeTimedBranchPostTask " + serverRequest);
        if (serverRequest instanceof ServerRequestInitSession) {
            BranchLogger.v("callback to be returned " + ((ServerRequestInitSession) serverRequest).callback_);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final BranchPostTask branchPostTask = new BranchPostTask(serverRequest, countDownLatch);
        branchPostTask.executeTask(new Void[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread(new Runnable() { // from class: io.branch.referral.ServerRequestQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    ServerRequestQueue.this.awaitTimedBranchPostTask(countDownLatch, i, branchPostTask);
                }
            }).start();
        } else {
            awaitTimedBranchPostTask(countDownLatch, i, branchPostTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void awaitTimedBranchPostTask(CountDownLatch countDownLatch, int i, BranchPostTask branchPostTask) {
        try {
            if (countDownLatch.await(i, TimeUnit.MILLISECONDS)) {
                return;
            }
            branchPostTask.cancel(true);
            branchPostTask.onPostExecuteInner(new ServerResponse(branchPostTask.thisReq_.getRequestPath(), BranchError.ERR_BRANCH_TASK_TIMEOUT, "", "Thread task timed out. Timeout: " + i));
        } catch (InterruptedException e) {
            BranchLogger.e("Caught InterruptedException " + e.getMessage());
            branchPostTask.cancel(true);
            branchPostTask.onPostExecuteInner(new ServerResponse(branchPostTask.thisReq_.getRequestPath(), BranchError.ERR_BRANCH_TASK_TIMEOUT, "", e.getMessage()));
        }
    }

    public void handleNewRequest(ServerRequest serverRequest) {
        BranchLogger.d("handleNewRequest " + serverRequest);
        if (Branch.getInstance().getTrackingController().isTrackingDisabled() && !serverRequest.prepareExecuteWithoutTracking()) {
            String str = "Requested operation cannot be completed since tracking is disabled [" + serverRequest.requestPath_.getPath() + "]";
            BranchLogger.d(str);
            serverRequest.handleFailure(BranchError.ERR_BRANCH_TRACKING_DISABLED, str);
            return;
        }
        if (Branch.getInstance().initState_ != Branch.SESSION_STATE.INITIALISED && !(serverRequest instanceof ServerRequestInitSession) && requestNeedsSession(serverRequest)) {
            BranchLogger.d("handleNewRequest " + serverRequest + " needs a session");
            serverRequest.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.SDK_INIT_WAIT_LOCK);
        }
        enqueue(serverRequest);
        serverRequest.onRequestQueued();
        processNextQueueItem("handleNewRequest");
    }

    public boolean canClearInitData() {
        int i;
        synchronized (reqQueueLockObject) {
            i = 0;
            for (int i2 = 0; i2 < this.queue.size(); i2++) {
                if (this.queue.get(i2) instanceof ServerRequestInitSession) {
                    i++;
                }
            }
        }
        return i <= 1;
    }

    private class BranchPostTask extends BranchAsyncTask<Void, Void, ServerResponse> {
        final CountDownLatch latch_;
        ServerRequest thisReq_;

        public BranchPostTask(ServerRequest serverRequest, CountDownLatch countDownLatch) {
            this.thisReq_ = serverRequest;
            this.latch_ = countDownLatch;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            this.thisReq_.onPreExecute();
            this.thisReq_.doFinalUpdateOnMainThread();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public ServerResponse doInBackground(Void... voidArr) {
            ServerResponse make_restful_post;
            this.thisReq_.doFinalUpdateOnBackgroundThread();
            if (Branch.getInstance().getTrackingController().isTrackingDisabled() && !this.thisReq_.prepareExecuteWithoutTracking()) {
                return new ServerResponse(this.thisReq_.getRequestPath(), BranchError.ERR_BRANCH_TRACKING_DISABLED, "", "Tracking is disabled");
            }
            String branchKey = Branch.getInstance().prefHelper_.getBranchKey();
            ServerResponse serverResponse = null;
            try {
                if (this.thisReq_.isGetRequest()) {
                    make_restful_post = Branch.getInstance().getBranchRemoteInterface().make_restful_get(this.thisReq_.getRequestUrl(), this.thisReq_.getGetParams(), this.thisReq_.getRequestPath(), branchKey);
                } else {
                    BranchLogger.v("BranchPostTask doInBackground beginning rest post for " + this.thisReq_);
                    make_restful_post = Branch.getInstance().getBranchRemoteInterface().make_restful_post(this.thisReq_.getPostWithInstrumentationValues(ServerRequestQueue.this.instrumentationExtraData_), this.thisReq_.getRequestUrl(), this.thisReq_.getRequestPath(), branchKey);
                }
                serverResponse = make_restful_post;
                CountDownLatch countDownLatch = this.latch_;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return serverResponse;
            } catch (Exception e) {
                BranchLogger.v("BranchPostTask doInBackground caught exception: " + e.getMessage());
                return serverResponse;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(ServerResponse serverResponse) {
            super.onPostExecute((BranchPostTask) serverResponse);
            onPostExecuteInner(serverResponse);
        }

        void onPostExecuteInner(ServerResponse serverResponse) {
            BranchLogger.v("onPostExecuteInner " + this + " " + serverResponse);
            CountDownLatch countDownLatch = this.latch_;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            if (serverResponse == null) {
                this.thisReq_.handleFailure(BranchError.ERR_OTHER, "Null response.");
                return;
            }
            int statusCode = serverResponse.getStatusCode();
            if (statusCode == 200) {
                onRequestSuccess(serverResponse);
            } else {
                onRequestFailed(serverResponse, statusCode);
            }
            ServerRequestQueue.this.networkCount_ = 0;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.branch.referral.ServerRequestQueue.BranchPostTask.1
                @Override // java.lang.Runnable
                public void run() {
                    ServerRequestQueue.this.processNextQueueItem("onPostExecuteInner");
                }
            });
        }

        private void onRequestSuccess(ServerResponse serverResponse) {
            boolean z;
            BranchLogger.v("onRequestSuccess " + serverResponse);
            JSONObject object = serverResponse.getObject();
            if (object == null) {
                this.thisReq_.handleFailure(500, "Null response json.");
            }
            ServerRequest serverRequest = this.thisReq_;
            if ((serverRequest instanceof ServerRequestCreateUrl) && object != null) {
                try {
                    Branch.getInstance().linkCache_.put(((ServerRequestCreateUrl) serverRequest).getLinkPost(), object.getString("url"));
                } catch (JSONException e) {
                    BranchLogger.w("Caught JSONException " + e.getMessage());
                }
            }
            if (this.thisReq_ instanceof ServerRequestInitSession) {
                if (!Branch.getInstance().isTrackingDisabled() && object != null) {
                    try {
                        boolean z2 = true;
                        if (object.has(Defines.Jsonkey.SessionID.getKey())) {
                            Branch.getInstance().prefHelper_.setSessionID(object.getString(Defines.Jsonkey.SessionID.getKey()));
                            z = true;
                        } else {
                            z = false;
                        }
                        if (object.has(Defines.Jsonkey.RandomizedBundleToken.getKey())) {
                            String string = object.getString(Defines.Jsonkey.RandomizedBundleToken.getKey());
                            if (!Branch.getInstance().prefHelper_.getRandomizedBundleToken().equals(string)) {
                                Branch.getInstance().linkCache_.clear();
                                Branch.getInstance().prefHelper_.setRandomizedBundleToken(string);
                                z = true;
                            }
                        }
                        if (object.has(Defines.Jsonkey.RandomizedDeviceToken.getKey())) {
                            Branch.getInstance().prefHelper_.setRandomizedDeviceToken(object.getString(Defines.Jsonkey.RandomizedDeviceToken.getKey()));
                        } else {
                            z2 = z;
                        }
                        if (z2) {
                            ServerRequestQueue.this.updateAllRequestsInQueue();
                        }
                    } catch (JSONException e2) {
                        BranchLogger.w("Caught JSONException " + e2.getMessage());
                    }
                }
                if (this.thisReq_ instanceof ServerRequestInitSession) {
                    Branch.getInstance().setInitState(Branch.SESSION_STATE.INITIALISED);
                    Branch.getInstance().checkForAutoDeepLinkConfiguration();
                    if (Branch.getInstance().getLatestReferringParamsLatch != null) {
                        Branch.getInstance().getLatestReferringParamsLatch.countDown();
                    }
                    if (Branch.getInstance().getFirstReferringParamsLatch != null) {
                        Branch.getInstance().getFirstReferringParamsLatch.countDown();
                    }
                }
            }
            if (object != null) {
                this.thisReq_.onRequestSucceeded(serverResponse, Branch.getInstance());
                ServerRequestQueue.this.remove(this.thisReq_);
            } else if (this.thisReq_.shouldRetryOnFail()) {
                this.thisReq_.clearCallbacks();
            } else {
                ServerRequestQueue.this.remove(this.thisReq_);
            }
        }

        void onRequestFailed(ServerResponse serverResponse, int i) {
            BranchLogger.v("onRequestFailed " + serverResponse.getMessage());
            if ((this.thisReq_ instanceof ServerRequestInitSession) && PrefHelper.NO_STRING_VALUE.equals(Branch.getInstance().prefHelper_.getSessionParams())) {
                Branch.getInstance().setInitState(Branch.SESSION_STATE.UNINITIALISED);
            }
            if (i == 400 || i == 409) {
                ServerRequest serverRequest = this.thisReq_;
                if (serverRequest instanceof ServerRequestCreateUrl) {
                    ((ServerRequestCreateUrl) serverRequest).handleDuplicateURLError();
                    if ((400 > i && i <= 451) || i == -117 || !this.thisReq_.shouldRetryOnFail() || this.thisReq_.currentRetryCount >= Branch.getInstance().prefHelper_.getNoConnectionRetryMax()) {
                        Branch.getInstance().requestQueue_.remove(this.thisReq_);
                    } else {
                        this.thisReq_.clearCallbacks();
                    }
                    this.thisReq_.currentRetryCount++;
                }
            }
            ServerRequestQueue.this.networkCount_ = 0;
            this.thisReq_.handleFailure(i, serverResponse.getFailReason() + i + " " + serverResponse.getMessage());
            if (400 > i) {
            }
            this.thisReq_.clearCallbacks();
            this.thisReq_.currentRetryCount++;
        }
    }

    public void addExtraInstrumentationData(HashMap<String, String> hashMap) {
        this.instrumentationExtraData_.putAll(hashMap);
    }

    public void addExtraInstrumentationData(String str, String str2) {
        this.instrumentationExtraData_.put(str, str2);
    }
}
