package io.branch.referral;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.AppEventsConstants;
import com.google.common.base.Ascii;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import io.branch.referral.Defines;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class ApkParser {
    private static final int endDocTag = 1048833;
    private static final int endTag = 1048835;
    private static final int startTag = 1048834;

    ApkParser() {
    }

    public JSONObject decompressXMLForValidator(byte[] bArr, Context context) {
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 36;
        int LEW = (LEW(bArr, 16) * 4) + 36;
        int LEW2 = LEW(bArr, 12);
        int i3 = LEW2;
        while (true) {
            int length = bArr.length - 4;
            i = startTag;
            if (i3 >= length) {
                break;
            }
            if (LEW(bArr, i3) == startTag) {
                LEW2 = i3;
                break;
            }
            i3 += 4;
        }
        String str = "";
        while (LEW2 < bArr.length) {
            try {
                int LEW3 = LEW(bArr, LEW2);
                if (LEW3 != i) {
                    if (LEW3 != endTag) {
                        break;
                    }
                    LEW2 += 24;
                } else {
                    int LEW4 = LEW(bArr, LEW2 + 28);
                    LEW2 += 36;
                    int i4 = 0;
                    while (i4 < LEW4) {
                        int LEW5 = LEW(bArr, LEW2 + 4);
                        int LEW6 = LEW(bArr, LEW2 + 8);
                        int LEW7 = LEW(bArr, LEW2 + 16);
                        int i5 = LEW2 + 20;
                        String compXmlString = compXmlString(bArr, i2, LEW, LEW5);
                        int i6 = LEW4;
                        if ("scheme".equals(compXmlString)) {
                            String compXmlString2 = LEW6 != -1 ? compXmlString(bArr, 36, LEW, LEW6) : BranchUtil.decodeResourceId(context, LEW7);
                            if (validURI(compXmlString2)) {
                                if (!jSONObject.has(compXmlString2)) {
                                    jSONObject.put(compXmlString2, new JSONArray());
                                } else if (jSONObject.has(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                                    jSONObject.put(compXmlString2, (JSONArray) jSONObject.get(AppEventsConstants.EVENT_PARAM_VALUE_NO));
                                    jSONObject.remove(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                                }
                                str = compXmlString2;
                            }
                            if ("http".equals(compXmlString2) || "https".equals(compXmlString2)) {
                                str = compXmlString2;
                            }
                        } else if (DiagnosticsTracker.HOST_KEY.equals(compXmlString)) {
                            String compXmlString3 = LEW6 != -1 ? compXmlString(bArr, 36, LEW, LEW6) : BranchUtil.decodeResourceId(context, LEW7);
                            if (jSONObject.has(str) && str != null && !"https".equals(str) && !"http".equals(str)) {
                                JSONArray jSONArray2 = jSONObject.getJSONArray(str);
                                jSONArray2.put(compXmlString3);
                                jSONObject.put(str, jSONArray2);
                            } else {
                                if (!"https".equals(str) && !"http".equals(str)) {
                                    JSONArray jSONArray3 = new JSONArray();
                                    jSONArray3.put(compXmlString3);
                                    jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, jSONArray3);
                                }
                                jSONArray.put(compXmlString3);
                            }
                        } else if ("name".equals(compXmlString)) {
                            i2 = 36;
                            if ("android.intent.action.VIEW".equals(LEW6 != -1 ? compXmlString(bArr, 36, LEW, LEW6) : BranchUtil.decodeResourceId(context, LEW7))) {
                                str = null;
                            }
                            i4++;
                            LEW2 = i5;
                            LEW4 = i6;
                        }
                        i2 = 36;
                        i4++;
                        LEW2 = i5;
                        LEW4 = i6;
                    }
                }
                i = startTag;
            } catch (JSONException e) {
                BranchLogger.w("Caught JSONException " + e.getMessage());
                return jSONObject2;
            }
        }
        jSONObject.remove(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        jSONObject2.put(Defines.Jsonkey.URIScheme.getKey(), jSONObject);
        jSONObject2.put(Defines.Jsonkey.AppLinks.getKey(), jSONArray);
        return jSONObject2;
    }

    private boolean validURI(String str) {
        return (str == null || "http".equals(str) || str.equals("https") || str.equals("geo") || str.equals("*") || str.equals("package") || str.equals("sms") || str.equals("smsto") || str.equals("mms") || str.equals("mmsto") || str.equals("tel") || str.equals(NotificationCompat.CATEGORY_VOICEMAIL) || str.equals("file") || str.equals("content") || str.equals("mailto")) ? false : true;
    }

    private String compXmlString(byte[] bArr, int i, int i2, int i3) {
        if (i3 < 0) {
            return null;
        }
        return compXmlStringAt(bArr, i2 + LEW(bArr, i + (i3 * 4)));
    }

    private String compXmlStringAt(byte[] bArr, int i) {
        int i2 = ((bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[i] & 255);
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + 2 + (i3 * 2)];
        }
        return new String(bArr2);
    }

    private int LEW(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 3] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[i + 2] << Ascii.DLE) & 16711680) | ((bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }
}
