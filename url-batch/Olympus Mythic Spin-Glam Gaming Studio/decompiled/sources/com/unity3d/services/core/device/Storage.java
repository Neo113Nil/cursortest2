package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: Storage.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0006\u0010\u000f\u001a\u00020\u000bJ\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/unity3d/services/core/device/Storage;", "Lcom/unity3d/services/core/misc/JsonStorage;", "_targetFileName", "", "type", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "<init>", "(Ljava/lang/String;Lcom/unity3d/services/core/device/StorageManager$StorageType;)V", "getType", "()Lcom/unity3d/services/core/device/StorageManager$StorageType;", "readStorage", "", "initStorage", "writeStorage", "clearStorage", "storageFileExists", "sendEvent", "", "eventType", "Lcom/unity3d/services/core/device/StorageEvent;", "value", "", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public class Storage extends JsonStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MutableStateFlow onStorageEventCallbacks = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());

    @NotNull
    private final String _targetFileName;

    @NotNull
    private final StorageManager.StorageType type;

    public Storage(@NotNull String _targetFileName, @NotNull StorageManager.StorageType type) {
        Intrinsics.checkNotNullParameter(_targetFileName, "_targetFileName");
        Intrinsics.checkNotNullParameter(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    @NotNull
    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public synchronized boolean readStorage() {
        byte[] readFileBytes;
        boolean z = false;
        try {
            try {
                readFileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (FileNotFoundException e) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e);
            }
        } catch (Exception e2) {
            DeviceLog.debug("Failed to read storage JSON file:", e2);
        }
        if (readFileBytes == null) {
            return false;
        }
        setData(new JSONObject(new String(readFileBytes, Charsets.UTF_8)));
        z = true;
        return z;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public final synchronized void sendEvent(@Nullable StorageEvent eventType, @Nullable Object value) {
        List list = (List) onStorageEventCallbacks.getValue();
        if (list.isEmpty()) {
            return;
        }
        Intrinsics.checkNotNull(eventType);
        StorageEventInfo storageEventInfo = new StorageEventInfo(eventType, this.type, value);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(storageEventInfo);
        }
    }

    /* compiled from: Storage.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u001a\u0010\f\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R&\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/device/Storage$Companion;", "", "<init>", "()V", "onStorageEventCallbacks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "", "addStorageEventCallback", "callback", "removeStorageEventCallback", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void addStorageEventCallback(@NotNull Function1 callback) {
            Object value;
            Intrinsics.checkNotNullParameter(callback, "callback");
            MutableStateFlow mutableStateFlow = Storage.onStorageEventCallbacks;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.plus((List) value, callback)));
        }

        public final void removeStorageEventCallback(@NotNull Function1 callback) {
            Object value;
            Intrinsics.checkNotNullParameter(callback, "callback");
            MutableStateFlow mutableStateFlow = Storage.onStorageEventCallbacks;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.minus((List) value, callback)));
        }
    }
}
