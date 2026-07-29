package expo.modules.updates.statemachine;

import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: UpdatesStateContext.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\u00020\u0001:\u00016B©\u0001\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019B¡\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u001aJ\u009e\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0006\u0010,\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u001d\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00010.8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lexpo/modules/updates/statemachine/UpdatesStateContext;", "", "isStartupProcedureRunning", "", "isUpdateAvailable", "isUpdatePending", "isChecking", "isDownloading", "isRestarting", "restartCount", "", "latestManifest", "Lorg/json/JSONObject;", "downloadedManifest", "rollback", "Lexpo/modules/updates/statemachine/UpdatesStateContextRollback;", "checkError", "Lexpo/modules/updates/statemachine/UpdatesStateError;", "downloadError", "downloadProgress", "", "lastCheckForUpdateTime", "Ljava/util/Date;", "sequenceNumber", "<init>", "(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;Lexpo/modules/updates/statemachine/UpdatesStateContextRollback;Lexpo/modules/updates/statemachine/UpdatesStateError;Lexpo/modules/updates/statemachine/UpdatesStateError;DLjava/util/Date;I)V", "(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;Lexpo/modules/updates/statemachine/UpdatesStateContextRollback;Lexpo/modules/updates/statemachine/UpdatesStateError;Lexpo/modules/updates/statemachine/UpdatesStateError;DLjava/util/Date;)V", "()Z", "getRestartCount", "()I", "getLatestManifest", "()Lorg/json/JSONObject;", "getDownloadedManifest", "getRollback", "()Lexpo/modules/updates/statemachine/UpdatesStateContextRollback;", "getCheckError", "()Lexpo/modules/updates/statemachine/UpdatesStateError;", "getDownloadError", "getDownloadProgress", "()D", "getLastCheckForUpdateTime", "()Ljava/util/Date;", "getSequenceNumber", "copyAndIncrementSequenceNumber", "resetCopyWithIncrementedRestartCountAndSequenceNumber", "json", "", "", "getJson", "()Ljava/util/Map;", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatesStateContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<SimpleDateFormat> DATE_FORMATTER$delegate = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.statemachine.UpdatesStateContext$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SimpleDateFormat DATE_FORMATTER_delegate$lambda$5;
            DATE_FORMATTER_delegate$lambda$5 = UpdatesStateContext.DATE_FORMATTER_delegate$lambda$5();
            return DATE_FORMATTER_delegate$lambda$5;
        }
    });
    private final UpdatesStateError checkError;
    private final UpdatesStateError downloadError;
    private final double downloadProgress;
    private final JSONObject downloadedManifest;
    private final boolean isChecking;
    private final boolean isDownloading;
    private final boolean isRestarting;
    private final boolean isStartupProcedureRunning;
    private final boolean isUpdateAvailable;
    private final boolean isUpdatePending;
    private final Date lastCheckForUpdateTime;
    private final JSONObject latestManifest;
    private final int restartCount;
    private final UpdatesStateContextRollback rollback;
    private final int sequenceNumber;

    private UpdatesStateContext(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, JSONObject jSONObject, JSONObject jSONObject2, UpdatesStateContextRollback updatesStateContextRollback, UpdatesStateError updatesStateError, UpdatesStateError updatesStateError2, double d, Date date, int i2) {
        this.isStartupProcedureRunning = z;
        this.isUpdateAvailable = z2;
        this.isUpdatePending = z3;
        this.isChecking = z4;
        this.isDownloading = z5;
        this.isRestarting = z6;
        this.restartCount = i;
        this.latestManifest = jSONObject;
        this.downloadedManifest = jSONObject2;
        this.rollback = updatesStateContextRollback;
        this.checkError = updatesStateError;
        this.downloadError = updatesStateError2;
        this.downloadProgress = d;
        this.lastCheckForUpdateTime = date;
        this.sequenceNumber = i2;
    }

    /* synthetic */ UpdatesStateContext(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, JSONObject jSONObject, JSONObject jSONObject2, UpdatesStateContextRollback updatesStateContextRollback, UpdatesStateError updatesStateError, UpdatesStateError updatesStateError2, double d, Date date, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? false : z5, (i3 & 32) != 0 ? false : z6, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? null : jSONObject, (i3 & 256) != 0 ? null : jSONObject2, (i3 & 512) != 0 ? null : updatesStateContextRollback, (i3 & 1024) != 0 ? null : updatesStateError, (i3 & 2048) != 0 ? null : updatesStateError2, (i3 & 4096) != 0 ? 0.0d : d, (i3 & 8192) != 0 ? null : date, i2);
    }

    /* renamed from: isStartupProcedureRunning, reason: from getter */
    public final boolean getIsStartupProcedureRunning() {
        return this.isStartupProcedureRunning;
    }

    /* renamed from: isUpdateAvailable, reason: from getter */
    public final boolean getIsUpdateAvailable() {
        return this.isUpdateAvailable;
    }

    /* renamed from: isUpdatePending, reason: from getter */
    public final boolean getIsUpdatePending() {
        return this.isUpdatePending;
    }

    /* renamed from: isChecking, reason: from getter */
    public final boolean getIsChecking() {
        return this.isChecking;
    }

    /* renamed from: isDownloading, reason: from getter */
    public final boolean getIsDownloading() {
        return this.isDownloading;
    }

    /* renamed from: isRestarting, reason: from getter */
    public final boolean getIsRestarting() {
        return this.isRestarting;
    }

    public final int getRestartCount() {
        return this.restartCount;
    }

    public final JSONObject getLatestManifest() {
        return this.latestManifest;
    }

    public final JSONObject getDownloadedManifest() {
        return this.downloadedManifest;
    }

    public final UpdatesStateContextRollback getRollback() {
        return this.rollback;
    }

    public final UpdatesStateError getCheckError() {
        return this.checkError;
    }

    public final UpdatesStateError getDownloadError() {
        return this.downloadError;
    }

    public final double getDownloadProgress() {
        return this.downloadProgress;
    }

    public final Date getLastCheckForUpdateTime() {
        return this.lastCheckForUpdateTime;
    }

    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public /* synthetic */ UpdatesStateContext(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, JSONObject jSONObject, JSONObject jSONObject2, UpdatesStateContextRollback updatesStateContextRollback, UpdatesStateError updatesStateError, UpdatesStateError updatesStateError2, double d, Date date, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? false : z5, (i2 & 32) != 0 ? false : z6, (i2 & 64) == 0 ? i : 0, (i2 & 128) != 0 ? null : jSONObject, (i2 & 256) != 0 ? null : jSONObject2, (i2 & 512) != 0 ? null : updatesStateContextRollback, (i2 & 1024) != 0 ? null : updatesStateError, (i2 & 2048) != 0 ? null : updatesStateError2, (i2 & 4096) != 0 ? 0.0d : d, (i2 & 8192) != 0 ? null : date);
    }

    public UpdatesStateContext(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, JSONObject jSONObject, JSONObject jSONObject2, UpdatesStateContextRollback updatesStateContextRollback, UpdatesStateError updatesStateError, UpdatesStateError updatesStateError2, double d, Date date) {
        this(z, z2, z3, z4, z5, z6, i, jSONObject, jSONObject2, updatesStateContextRollback, updatesStateError, updatesStateError2, d, date, 0);
    }

    public final UpdatesStateContext copyAndIncrementSequenceNumber(boolean isStartupProcedureRunning, boolean isUpdateAvailable, boolean isUpdatePending, boolean isChecking, boolean isDownloading, double downloadProgress, boolean isRestarting, int restartCount, JSONObject latestManifest, JSONObject downloadedManifest, UpdatesStateContextRollback rollback, UpdatesStateError checkError, UpdatesStateError downloadError, Date lastCheckForUpdateTime) {
        return new UpdatesStateContext(isStartupProcedureRunning, isUpdateAvailable, isUpdatePending, isChecking, isDownloading, isRestarting, restartCount, latestManifest, downloadedManifest, rollback, checkError, downloadError, downloadProgress, lastCheckForUpdateTime, this.sequenceNumber + 1);
    }

    public final UpdatesStateContext resetCopyWithIncrementedRestartCountAndSequenceNumber() {
        return new UpdatesStateContext(false, false, false, false, false, false, this.restartCount + 1, null, null, null, null, null, 0.0d, null, this.sequenceNumber + 1, 16319, null);
    }

    public final Map<String, Object> getJson() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("isStartupProcedureRunning", Boolean.valueOf(this.isStartupProcedureRunning)), TuplesKt.to("isUpdateAvailable", Boolean.valueOf(this.isUpdateAvailable)), TuplesKt.to("isUpdatePending", Boolean.valueOf(this.isUpdatePending)), TuplesKt.to("isChecking", Boolean.valueOf(this.isChecking)), TuplesKt.to("isDownloading", Boolean.valueOf(this.isDownloading)), TuplesKt.to("isRestarting", Boolean.valueOf(this.isRestarting)), TuplesKt.to("restartCount", Integer.valueOf(this.restartCount)), TuplesKt.to("downloadProgress", Double.valueOf(this.downloadProgress)), TuplesKt.to("sequenceNumber", Integer.valueOf(this.sequenceNumber)));
        JSONObject jSONObject = this.latestManifest;
        if (jSONObject != null) {
            mutableMapOf.put("latestManifest", jSONObject);
        }
        JSONObject jSONObject2 = this.downloadedManifest;
        if (jSONObject2 != null) {
            mutableMapOf.put("downloadedManifest", jSONObject2);
        }
        UpdatesStateContextRollback updatesStateContextRollback = this.rollback;
        if (updatesStateContextRollback != null) {
            mutableMapOf.put("rollback", updatesStateContextRollback.getJson());
        }
        UpdatesStateError updatesStateError = this.checkError;
        if (updatesStateError != null) {
            mutableMapOf.put("checkError", updatesStateError.getJson());
        }
        UpdatesStateError updatesStateError2 = this.downloadError;
        if (updatesStateError2 != null) {
            mutableMapOf.put("downloadError", updatesStateError2.getJson());
        }
        Date date = this.lastCheckForUpdateTime;
        if (date != null) {
            mutableMapOf.put("lastCheckForUpdateTime", date);
        }
        return mutableMapOf;
    }

    public final Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isStartupProcedureRunning", this.isStartupProcedureRunning);
        bundle.putBoolean("isUpdateAvailable", this.isUpdateAvailable);
        bundle.putBoolean("isUpdatePending", this.isUpdatePending);
        bundle.putBoolean("isChecking", this.isChecking);
        bundle.putBoolean("isDownloading", this.isDownloading);
        bundle.putBoolean("isRestarting", this.isRestarting);
        bundle.putInt("restartCount", this.restartCount);
        bundle.putInt("sequenceNumber", this.sequenceNumber);
        bundle.putDouble("downloadProgress", this.downloadProgress);
        JSONObject jSONObject = this.latestManifest;
        if (jSONObject != null) {
            bundle.putString("latestManifestString", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.downloadedManifest;
        if (jSONObject2 != null) {
            bundle.putString("downloadedManifestString", jSONObject2.toString());
        }
        if (this.rollback != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("commitTime", this.rollback.getCommitTimeString());
            Unit unit = Unit.INSTANCE;
            bundle.putBundle("rollback", bundle2);
        }
        if (this.checkError != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("message", this.checkError.getMessage());
            bundle.putBundle("checkError", bundle3);
        }
        if (this.downloadError != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("message", this.downloadError.getMessage());
            bundle.putBundle("downloadError", bundle4);
        }
        if (this.lastCheckForUpdateTime != null) {
            bundle.putString("lastCheckForUpdateTimeString", INSTANCE.getDATE_FORMATTER().format(this.lastCheckForUpdateTime));
        }
        return bundle;
    }

    /* compiled from: UpdatesStateContext.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/updates/statemachine/UpdatesStateContext$Companion;", "", "<init>", "()V", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "getDATE_FORMATTER", "()Ljava/text/SimpleDateFormat;", "DATE_FORMATTER$delegate", "Lkotlin/Lazy;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SimpleDateFormat getDATE_FORMATTER() {
            return (SimpleDateFormat) UpdatesStateContext.DATE_FORMATTER$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat DATE_FORMATTER_delegate$lambda$5() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
