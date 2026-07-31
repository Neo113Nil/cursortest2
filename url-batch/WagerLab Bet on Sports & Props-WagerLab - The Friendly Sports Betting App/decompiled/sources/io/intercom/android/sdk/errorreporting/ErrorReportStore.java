package io.intercom.android.sdk.errorreporting;

import android.content.Context;
import android.os.AsyncTask;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.persistence.JsonStorage;
import java.io.File;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes8.dex */
class ErrorReportStore {
    private static final String REPORT_FILE_PATH = "intercom-error.json";
    private static final Twig TWIG = LumberMill.getLogger();
    private final File reportFile;
    private final JsonStorage storage;

    public static ErrorReportStore create(Context context, Gson gson) {
        return new ErrorReportStore(new File(context.getCacheDir(), REPORT_FILE_PATH), new JsonStorage(gson));
    }

    ErrorReportStore(File file, JsonStorage jsonStorage) {
        this.reportFile = file;
        this.storage = jsonStorage;
    }

    void sendSavedReport(final Provider<Api> provider) {
        try {
            AsyncTask.execute(new Runnable() { // from class: io.intercom.android.sdk.errorreporting.ErrorReportStore.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ErrorReportStore.this.reportFile.exists()) {
                        ErrorReportStore.this.readAndSendReport((Api) provider.get());
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            TWIG.internal("Couldn't queue up sending of event: " + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readAndSendReport(final Api api) {
        this.storage.loadThenDelete(this.reportFile, ErrorReport.class, new JsonStorage.LoadHandler<ErrorReport>() { // from class: io.intercom.android.sdk.errorreporting.ErrorReportStore.2
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
            public void onLoad(ErrorReport errorReport) {
                api.sendErrorReport(errorReport);
            }
        });
    }

    void saveToDisk(ErrorReport errorReport) {
        this.storage.saveToFileAsJson(errorReport, this.reportFile);
    }

    void deleteFromDisk() {
        this.storage.loadThenDelete(this.reportFile, ErrorReport.class, new JsonStorage.LoadHandler<ErrorReport>() { // from class: io.intercom.android.sdk.errorreporting.ErrorReportStore.3
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
            public void onLoad(ErrorReport errorReport) {
            }
        });
    }
}
