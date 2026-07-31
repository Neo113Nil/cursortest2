package org.chromium.net.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes15.dex */
final class CronetRequestCommon {
    private CronetRequestCommon() {
    }

    public static CronetLogger.CronetTrafficInfo.RequestTerminalState finishedReasonToCronetTrafficInfoRequestTerminalState(int i) {
        if (i == 0) {
            return CronetLogger.CronetTrafficInfo.RequestTerminalState.SUCCEEDED;
        }
        if (i == 1) {
            return CronetLogger.CronetTrafficInfo.RequestTerminalState.ERROR;
        }
        if (i == 2) {
            return CronetLogger.CronetTrafficInfo.RequestTerminalState.CANCELLED;
        }
        throw new IllegalArgumentException("Invalid finished reason while producing request terminal state: " + i);
    }

    public static long estimateHeadersSizeInBytes(Map<String, List<String>> map) {
        long j = 0;
        if (map == null) {
            return 0L;
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                j += r3.length();
            }
            if (entry.getValue() != null) {
                while (entry.getValue().iterator().hasNext()) {
                    j += r2.next().length();
                }
            }
        }
        return j;
    }

    public static long estimateHeadersSizeInBytes(Collection<Map.Entry<String, String>> collection) {
        long j = 0;
        if (collection == null) {
            return 0L;
        }
        for (Map.Entry<String, String> entry : collection) {
            if (entry.getKey() != null) {
                j += r3.length();
            }
            if (entry.getValue() != null) {
                j += entry.getValue().length();
            }
        }
        return j;
    }

    public static long estimateHeadersSizeInBytes(String[] strArr) {
        long j = 0;
        if (strArr == null) {
            return 0L;
        }
        for (String str : strArr) {
            if (str != null) {
                j += r4.length();
            }
        }
        return j;
    }
}
