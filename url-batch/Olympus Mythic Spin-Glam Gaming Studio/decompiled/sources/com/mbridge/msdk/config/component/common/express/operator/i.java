package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.protobuf.openrtb.LossReason;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OperatorEncode.java */
/* loaded from: classes13.dex */
public class i {
    private int[] a = {99, 124, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 123, 242, 107, 111, 197, 48, 1, 103, 43, 254, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 171, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 202, 130, 201, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, POBCommonConstants.DEFAULT_MIN_BITRATE, 89, 71, 240, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 212, 162, 175, 156, 164, 114, 192, 183, 253, 147, 38, 54, 63, 247, 204, 52, 165, 229, 241, 113, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 39, 178, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 9, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 44, 26, 27, 110, 90, 160, 82, 59, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 179, 41, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 47, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 83, 209, 0, 237, 32, 252, 177, 91, 106, 203, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 57, 74, 76, 88, 207, 208, 239, 170, 251, 67, 77, 51, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 69, 249, 2, 127, 80, 60, 159, 168, 81, 163, 64, 143, 146, 157, 56, 245, 188, 182, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 33, 16, 255, 243, 210, 205, 12, 19, 236, 95, 151, 68, 23, 196, 167, 126, 61, 100, 93, 25, 115, 96, 129, 79, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 34, 42, 144, 136, 70, 238, 184, 20, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 94, 11, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 224, 50, 58, 10, 73, 6, 36, 92, 194, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 172, 98, 145, 149, 228, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 231, 200, 55, 109, ModuleDescriptor.MODULE_VERSION, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 78, 169, 108, 86, 244, 234, 101, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 174, 8, 186, 120, 37, 46, 28, 166, 180, 198, 232, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 116, 31, 75, 189, 139, 138, 112, 62, 181, 102, 72, 3, 246, 14, 97, 53, 87, 185, 134, 193, 29, 158, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 248, 152, 17, 105, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 142, 148, 155, 30, 135, 233, 206, 85, 40, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 140, 161, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 13, 191, 230, 66, 104, 65, 153, 45, 15, 176, 84, 187, 22};
    private byte[][] b;

    public i(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
    }

    @RequiresApi
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        JSONArray jSONArray;
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (list.size() <= 0 || list.size() > 2) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
        }
        Object obj2 = list.get(0);
        Object obj3 = list.size() == 2 ? list.get(1) : null;
        String str2 = "[{\"m\":9,\"p\":22},{\"m\":1,\"p\":1},{\"m\":5,\"p\":19},{\"m\":7,\"p\":0}]";
        if (obj3 instanceof String) {
            try {
                String str3 = (String) obj3;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3;
                }
                jSONArray = new JSONArray(str2);
            } catch (JSONException unused) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
            }
        } else if (obj3 instanceof JSONArray) {
            jSONArray = (JSONArray) obj3;
        } else {
            try {
                jSONArray = new JSONArray("[{\"m\":9,\"p\":22},{\"m\":1,\"p\":1},{\"m\":5,\"p\":19},{\"m\":7,\"p\":0}]");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
        }
        if (!(obj2 instanceof String)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
        }
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("895")) ? a((String) obj2, (String) obj, jSONArray) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e) {
            q0.b("OperatorEncode", e.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : str.equals(com.mbridge.msdk.config.component.common.util.c.c("895")) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    @RequiresApi
    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, String str2, JSONArray jSONArray) {
        String str3;
        a(str);
        byte[] decode = Base64.decode(str2, 10);
        byte[] bArr = new byte[16];
        try {
            System.arraycopy(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)), 0, bArr, 0, 16);
        } catch (NoSuchAlgorithmException unused) {
        }
        try {
            str3 = v0.a(a(decode, bArr, jSONArray));
        } catch (Exception e) {
            q0.b("OperatorEncode", e.getMessage());
            str3 = null;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str3);
    }

    private void a(String str) {
        this.b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 16);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i = 0; i < 16; i++) {
                System.arraycopy(messageDigest.digest((str + "_round_" + i).getBytes(StandardCharsets.UTF_8)), 0, this.b[i], 0, 16);
            }
        } catch (Exception e) {
            q0.b("OperatorEncode", e.getMessage());
        }
    }

    private byte[] a(byte[] bArr, JSONArray jSONArray) {
        JSONObject optJSONObject;
        byte[] copyOf = Arrays.copyOf(bArr, 16);
        for (int i = 0; i < jSONArray.length(); i++) {
            optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("m");
            optString.hashCode();
            switch (optString) {
                case "1":
                    byte[] bArr2 = this.b[optJSONObject.optInt("p") % 16];
                    for (int i2 = 0; i2 < 16; i2++) {
                        copyOf[i2] = (byte) (copyOf[i2] ^ bArr2[i2]);
                    }
                    break;
                case "2":
                    for (int i3 = 0; i3 < 16; i3++) {
                        copyOf[i3] = (byte) this.a[copyOf[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                    }
                    break;
                case "3":
                    int optInt = optJSONObject.optInt("p") % 16;
                    if (optInt > 0) {
                        byte[] copyOf2 = Arrays.copyOf(copyOf, 16);
                        for (int i4 = 0; i4 < 16; i4++) {
                            copyOf[i4] = copyOf2[(i4 + optInt) % 16];
                        }
                        break;
                    } else {
                        break;
                    }
                case "4":
                    for (int i5 = 0; i5 < 16; i5++) {
                        copyOf[i5] = (byte) (copyOf[i5] ^ ((byte) optJSONObject.optInt("p")));
                    }
                    break;
                case "5":
                    for (int i6 = 0; i6 < 16; i6++) {
                        copyOf[i6] = (byte) (copyOf[i6] + optJSONObject.optInt("p"));
                    }
                    break;
                case "6":
                    int optInt2 = optJSONObject.optInt("p") % 8;
                    for (int i7 = 0; i7 < 16; i7++) {
                        int i8 = copyOf[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        copyOf[i7] = (byte) ((i8 >>> (8 - optInt2)) | (i8 << optInt2));
                    }
                    break;
                case "7":
                    int i9 = 0;
                    while (i9 < 16) {
                        int i10 = i9 + 1;
                        copyOf[i9] = (byte) (copyOf[i9] ^ copyOf[i10 % 16]);
                        i9 = i10;
                    }
                    break;
                case "8":
                    int optInt3 = optJSONObject.optInt("p") % 16;
                    if (optInt3 == 0) {
                        optInt3 = 1;
                    }
                    for (int i11 = 0; i11 < 16; i11 += 2) {
                        int i12 = (i11 + optInt3) % 16;
                        byte b = copyOf[i11];
                        copyOf[i11] = copyOf[i12];
                        copyOf[i12] = b;
                    }
                    break;
                case "9":
                    int optInt4 = ((optJSONObject.optInt("p") % 128) * 2) + 1;
                    for (int i13 = 0; i13 < 16; i13++) {
                        copyOf[i13] = (byte) (copyOf[i13] * optInt4);
                    }
                    break;
            }
        }
        return copyOf;
    }

    public byte[] a(byte[] bArr, byte[] bArr2, JSONArray jSONArray) {
        if (bArr2.length == 16) {
            byte[] bArr3 = new byte[bArr.length];
            byte[] copyOf = Arrays.copyOf(bArr2, 16);
            for (int i = 0; i < bArr.length; i += 16) {
                byte[] a = a(copyOf, jSONArray);
                int min = Math.min(16, bArr.length - i);
                for (int i2 = 0; i2 < min; i2++) {
                    int i3 = i + i2;
                    bArr3[i3] = (byte) (bArr[i3] ^ a[i2]);
                }
                for (int i4 = 15; i4 >= 0; i4--) {
                    byte b = (byte) (copyOf[i4] + 1);
                    copyOf[i4] = b;
                    if (b != 0) {
                        break;
                    }
                }
            }
            return bArr3;
        }
        throw new IllegalArgumentException("IV length must be 16 bytes");
    }
}
