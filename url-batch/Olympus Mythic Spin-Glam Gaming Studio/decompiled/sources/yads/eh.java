package yads;

import android.app.ApplicationExitInfo;
import androidx.work.impl.utils.ForceStopRunnable$$ExternalSyntheticApiModelOutline1;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class eh extends Lambda implements Function1 {
    public final /* synthetic */ fh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(fh fhVar) {
        super(1);
        this.b = fhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InputStream traceInputStream;
        long timestamp;
        String description;
        int importance;
        int pid;
        long pss;
        long rss;
        String processName;
        int status;
        int realUid;
        ApplicationExitInfo m = ForceStopRunnable$$ExternalSyntheticApiModelOutline1.m(obj);
        this.b.getClass();
        try {
            traceInputStream = m.getTraceInputStream();
            if (traceInputStream == null) {
                return null;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                try {
                    String readText = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    CloseableKt.closeFinally(traceInputStream, null);
                    if (readText == null) {
                        return null;
                    }
                    timestamp = m.getTimestamp();
                    description = m.getDescription();
                    if (description == null) {
                        description = "ANR";
                    }
                    importance = m.getImportance();
                    pid = m.getPid();
                    pss = m.getPss();
                    rss = m.getRss();
                    processName = m.getProcessName();
                    m.getReason();
                    status = m.getStatus();
                    realUid = m.getRealUid();
                    return new de(timestamp, description, readText, importance, pid, pss, rss, processName, status, realUid);
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
