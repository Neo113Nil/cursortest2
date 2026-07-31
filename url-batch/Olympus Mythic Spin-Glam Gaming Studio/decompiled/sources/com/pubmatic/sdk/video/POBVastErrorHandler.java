package com.pubmatic.sdk.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class POBVastErrorHandler {
    private final POBTrackerHandler a;

    public POBVastErrorHandler(@NonNull POBTrackerHandler pOBTrackerHandler) {
        this.a = pOBTrackerHandler;
    }

    private boolean a(POBVastError pOBVastError) {
        return (pOBVastError == null || convertToPOBError(pOBVastError) == null) ? false : true;
    }

    @Nullable
    public static POBError convertToPOBError(@NonNull POBVastError pOBVastError) {
        int errorCode = pOBVastError.getErrorCode();
        if (errorCode != 200 && errorCode != 201 && errorCode != 405) {
            if (errorCode != 900) {
                switch (errorCode) {
                    case 100:
                    case 101:
                    case 102:
                        return new POBError(1007, pOBVastError.getErrorMessage());
                    default:
                        switch (errorCode) {
                            case 300:
                                break;
                            case 301:
                            case 304:
                                return new POBError(1005, pOBVastError.getErrorMessage());
                            default:
                                switch (errorCode) {
                                    case 400:
                                    case 403:
                                        break;
                                    case 401:
                                        break;
                                    case 402:
                                        return new POBError(1003, pOBVastError.getErrorMessage());
                                    default:
                                        switch (errorCode) {
                                            case 500:
                                            case 503:
                                                break;
                                            case 501:
                                            case 502:
                                                break;
                                            default:
                                                return null;
                                        }
                                }
                            case 302:
                            case POBVastError.NO_VAST_RESPONSE /* 303 */:
                                return new POBError(1002, pOBVastError.getErrorMessage());
                        }
                }
            }
            return new POBError(1006, pOBVastError.getErrorMessage());
        }
        return new POBError(1009, pOBVastError.getErrorMessage());
    }

    public void executeVastErrors(@Nullable List<String> list, @NonNull POBVastError pOBVastError) {
        executeVastErrorsWithMacros(list, null, pOBVastError, null);
    }

    public void executeVastErrorsWithMacros(@Nullable List<String> list, @Nullable Map<Object, Object> map, @NonNull POBVastError pOBVastError, @Nullable Map<String, String> map2) {
        POBLog.debug("POBVastErrorHandler", POBVideoLogConstants.MSG_ERROR_HANDLER_VAST_ERROR, pOBVastError);
        if (list == null || list.isEmpty()) {
            POBLog.warn("POBVastErrorHandler", POBVideoLogConstants.MSG_ERROR_HANDLER_ERROR_EMPTY_TRACKER_URLS, new Object[0]);
            return;
        }
        if (!a(pOBVastError)) {
            POBLog.warn("POBVastErrorHandler", POBVideoLogConstants.MSG_ERROR_HANDLER_ERROR_EXECUTING_TRACKER, Integer.valueOf(pOBVastError.getErrorCode()));
            return;
        }
        if (map == null) {
            map = Collections.synchronizedMap(new HashMap(1));
        }
        map.put("[ERRORCODE]", "" + pOBVastError.getErrorCode());
        this.a.handleTrackersForError(list, map, map2);
    }
}
