package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class QT extends IOException {
    public final int h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QT(int i) {
        super("stream was reset: ".concat(r0));
        String str;
        AbstractC1888sN.p(i, "errorCode");
        switch (i) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "PROTOCOL_ERROR";
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                str = "SETTINGS_TIMEOUT";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "STREAM_CLOSED";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "FRAME_SIZE_ERROR";
                break;
            case 8:
                str = "REFUSED_STREAM";
                break;
            case 9:
                str = "CANCEL";
                break;
            case 10:
                str = "COMPRESSION_ERROR";
                break;
            case 11:
                str = "CONNECT_ERROR";
                break;
            case 12:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 13:
                str = "INADEQUATE_SECURITY";
                break;
            case 14:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        this.h = i;
    }
}
