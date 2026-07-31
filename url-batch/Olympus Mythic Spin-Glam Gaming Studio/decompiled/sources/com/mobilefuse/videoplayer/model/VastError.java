package com.mobilefuse.videoplayer.model;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.video.POBVastError;
import kotlin.Metadata;

/* compiled from: enums.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastError;", "", IronSourceConstants.EVENTS_ERROR_CODE, "", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "XML_PARSING_FAILED", "VAST_VALIDATION_FAILED", "URI_UNAVAILABLE_OR_TIMEOUT", "WRAPPER_LIMIT_REACHED", "NO_VAST_RESPONSE", "MEDIAFILE_NOT_FOUND", "MEDIAFILE_TIMEOUT", "MEDIAFILES_UNSUPPORTED", "GENERAL_PLAYBACK_FAILURE", "COMPANION_GENERAL_ERROR", "UNABLE_TO_DISPLAY_REQUIRED_COMPANION", "COMPANION_RESOURCE_LOAD_FAILED", "UNIDENTIFIED", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes14.dex */
public enum VastError {
    XML_PARSING_FAILED(100),
    VAST_VALIDATION_FAILED(101),
    URI_UNAVAILABLE_OR_TIMEOUT(301),
    WRAPPER_LIMIT_REACHED(302),
    NO_VAST_RESPONSE(POBVastError.NO_VAST_RESPONSE),
    MEDIAFILE_NOT_FOUND(401),
    MEDIAFILE_TIMEOUT(402),
    MEDIAFILES_UNSUPPORTED(403),
    GENERAL_PLAYBACK_FAILURE(405),
    COMPANION_GENERAL_ERROR(600),
    UNABLE_TO_DISPLAY_REQUIRED_COMPANION(602),
    COMPANION_RESOURCE_LOAD_FAILED(603),
    UNIDENTIFIED(POBVastError.UNDEFINED_ERROR);

    private final int errorCode;

    VastError(int i) {
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
